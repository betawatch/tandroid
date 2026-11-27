// default package

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class qy6 extends dx6 {
    public static final int B;
    public zf8 A;
    public final rx6 g;
    public final qs h;
    public final qs i;
    public final yx6 j;
    public final zm9 k;
    public final guc l;
    public final d1 m;
    public final boolean n;
    public final bk o;
    public final qx6 p;
    public final ak q;
    public final ComponentName r;
    public final boolean s;
    public volatile int t;
    public guc u;
    public byte v;
    public final Bundle w;
    public po5 x;
    public po5 y;
    public i9a z;

    static {
        B = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qy6(yx6 yx6Var, Uri uri, Handler handler, Bundle bundle, j99 j99Var, j99 j99Var2, i9a i9aVar, zf8 zf8Var, Bundle bundle2) {
        super((byte) 0);
        boolean z;
        List<ResolveInfo> queryBroadcastReceivers;
        ComponentName componentName;
        ComponentName i0;
        PendingIntent foregroundService;
        qx6 qx6Var;
        ComponentName componentName2;
        PendingIntent pendingIntent;
        String str;
        Bundle bundle3;
        this.j = yx6Var;
        boolean z2 = true;
        this.s = true;
        this.x = j99Var;
        this.y = j99Var2;
        this.z = i9aVar;
        this.A = zf8Var;
        this.w = new Bundle(bundle2);
        this.h = new qs(0);
        this.i = new qs(0);
        Context context = yx6Var.f;
        this.k = zm9.J0(context);
        this.l = new guc(this);
        rx6 rx6Var = new rx6(yx6Var);
        this.g = rx6Var;
        this.t = 300000;
        this.m = new d1(yx6Var.l.getLooper(), rx6Var, (byte) 13);
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            String str2 = gcc.a;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                String str3 = Build.MANUFACTURER;
                if (str3.equals("Google") || str3.equals("motorola") || str3.equals("vivo") || str3.equals("Sony") || str3.equals("Nothing") || str3.equals("unknown")) {
                    z = true;
                    this.n = z;
                    if (!j99Var2.isEmpty()) {
                        o0();
                    }
                    PackageManager packageManager = context.getPackageManager();
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setPackage(context.getPackageName());
                    queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers.size() != 1) {
                        ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                        componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                    } else {
                        if (queryBroadcastReceivers.size() > 1) {
                            efd.f("MediaSessionLegacyStub", "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + queryBroadcastReceivers.size() + ". Using runtime media button receiver instead.");
                        }
                        componentName = null;
                    }
                    this.r = componentName;
                    if (componentName != null || i < 31) {
                        i0 = i0(context, "androidx.media3.session.MediaLibraryService");
                        i0 = i0 == null ? i0(context, "androidx.media3.session.MediaSessionService") : i0;
                        if (i0 != null || i0.equals(componentName)) {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                        i0 = componentName;
                    }
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
                    if (i0 != null) {
                        ak akVar = new ak(this, (byte) 9);
                        this.q = akVar;
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
                        String scheme = uri.getScheme();
                        String str4 = gcc.a;
                        intentFilter.addDataScheme(scheme);
                        if (i < 33) {
                            context.registerReceiver(akVar, intentFilter);
                        } else {
                            context.registerReceiver(akVar, intentFilter, 4);
                        }
                        intent2.setPackage(context.getPackageName());
                        foregroundService = PendingIntent.getBroadcast(context, 0, intent2, B);
                        i0 = new ComponentName(context, context.getClass());
                    } else {
                        intent2.setComponent(i0);
                        int i2 = B;
                        foregroundService = z2 ? i >= 26 ? PendingIntent.getForegroundService(context, 0, intent2, i2) : PendingIntent.getService(context, 0, intent2, i2) : PendingIntent.getBroadcast(context, 0, intent2, i2);
                        this.q = null;
                    }
                    String join = TextUtils.join(".", new String[]{"androidx.media3.session.id", yx6Var.i});
                    if (i >= 31) {
                        pendingIntent = foregroundService;
                        componentName2 = i0;
                        bundle3 = bundle;
                        str = join;
                    } else {
                        componentName2 = null;
                        pendingIntent = null;
                        str = join;
                        bundle3 = bundle;
                    }
                    qx6Var = new qx6(context, str, componentName2, pendingIntent, bundle3);
                    this.p = qx6Var;
                    if (i >= 31 && componentName != null) {
                        zz.z(qx6Var, componentName);
                    }
                    qx6Var.K(this, handler);
                    this.o = z ? new bk(context, new zx6(this, (byte) 0)) : null;
                }
            }
        }
        z = false;
        this.n = z;
        if (!j99Var2.isEmpty()) {
        }
        PackageManager packageManager2 = context.getPackageManager();
        Intent intent3 = new Intent("android.intent.action.MEDIA_BUTTON");
        intent3.setPackage(context.getPackageName());
        queryBroadcastReceivers = packageManager2.queryBroadcastReceivers(intent3, 0);
        if (queryBroadcastReceivers.size() != 1) {
        }
        this.r = componentName;
        if (componentName != null) {
        }
        i0 = i0(context, "androidx.media3.session.MediaLibraryService");
        if (i0 == null) {
        }
        if (i0 != null) {
        }
        z2 = false;
        Intent intent22 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (i0 != null) {
        }
        String join2 = TextUtils.join(".", new String[]{"androidx.media3.session.id", yx6Var.i});
        if (i >= 31) {
        }
        qx6Var = new qx6(context, str, componentName2, pendingIntent, bundle3);
        this.p = qx6Var;
        if (i >= 31) {
            zz.z(qx6Var, componentName);
        }
        qx6Var.K(this, handler);
        this.o = z ? new bk(context, new zx6(this, (byte) 0)) : null;
    }

    public static ft6 e0(String str, Uri uri, String str2, Bundle bundle) {
        ts6 ts6Var = new ts6();
        if (str == null) {
            str = "";
        }
        ts6Var.a = str;
        pm3 pm3Var = new pm3((byte) 16, false);
        pm3Var.b = uri;
        pm3Var.c = str2;
        pm3Var.d = bundle;
        ts6Var.i = new ct6(pm3Var);
        return ts6Var.a();
    }

    public static ComponentName i0(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override // dx6
    public final void A(String str, Bundle bundle) {
        k0(e0(null, null, str, bundle), true, false);
    }

    @Override // dx6
    public final void D(Uri uri, Bundle bundle) {
        k0(e0(null, uri, null, bundle), true, false);
    }

    @Override // dx6
    public final void E(os6 os6Var) {
        if (os6Var == null) {
            return;
        }
        g0(20, new hy6(this, os6Var, (byte) 1), ((gx6) this.p.b).c(), true);
    }

    @Override // dx6
    public final void F() {
        g0(11, new cy6(this, (byte) 4), ((gx6) this.p.b).c(), true);
    }

    @Override // dx6
    public final void G(long j) {
        g0(5, new by6(this, j, (byte) 1), ((gx6) this.p.b).c(), true);
    }

    @Override // dx6
    public final void J(final float f) {
        if (f <= 0.0f) {
            return;
        }
        g0(13, new py6() { // from class: ly6
            @Override // py6
            public final void a(xw6 xw6Var) {
                yx6 yx6Var = qy6.this.j;
                yx6Var.t();
                yx6Var.t.d(f);
            }
        }, ((gx6) this.p.b).c(), true);
    }

    @Override // dx6
    public final void K(u29 u29Var) {
        L(u29Var);
    }

    @Override // dx6
    public final void L(u29 u29Var) {
        s29 c = n26.c(u29Var);
        if (c != null) {
            h0(null, 40010, new cy6(this, c), ((gx6) this.p.b).c());
            return;
        }
        efd.f("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + u29Var);
    }

    @Override // dx6
    public final void M(int i) {
        g0(15, new ey6(this, i, (byte) 0), ((gx6) this.p.b).c(), true);
    }

    @Override // dx6
    public final void P(int i) {
        g0(14, new ey6(this, i, (byte) 1), ((gx6) this.p.b).c(), true);
    }

    @Override // dx6
    public final void S() {
        yx6 yx6Var = this.j;
        yx6Var.t();
        boolean m0 = yx6Var.t.m0(9);
        qx6 qx6Var = this.p;
        if (m0) {
            g0(9, new cy6(this, (byte) 10), ((gx6) qx6Var.b).c(), true);
        } else {
            g0(8, new cy6(this, (byte) 11), ((gx6) qx6Var.b).c(), true);
        }
    }

    @Override // dx6
    public final void V() {
        yx6 yx6Var = this.j;
        yx6Var.t();
        boolean m0 = yx6Var.t.m0(7);
        qx6 qx6Var = this.p;
        if (m0) {
            g0(7, new cy6(this, (byte) 2), ((gx6) qx6Var.b).c(), true);
        } else {
            g0(6, new cy6(this, (byte) 3), ((gx6) qx6Var.b).c(), true);
        }
    }

    @Override // dx6
    public final void Y(long j) {
        if (j < 0) {
            return;
        }
        g0(10, new by6(this, j, (byte) 0), ((gx6) this.p.b).c(), true);
    }

    @Override // dx6
    public final void b0() {
        g0(3, new cy6(this, (byte) 8), ((gx6) this.p.b).c(), true);
    }

    @Override // dx6
    public final void c(os6 os6Var) {
        if (os6Var != null) {
            g0(20, new dy6(this, os6Var, -1), ((gx6) this.p.b).c(), false);
        }
    }

    @Override // dx6
    public final void d(os6 os6Var, int i) {
        if (os6Var != null) {
            if (i == -1 || i >= 0) {
                g0(20, new dy6(this, os6Var, i), ((gx6) this.p.b).c(), false);
            }
        }
    }

    @Override // dx6
    public final void e(String str, final Bundle bundle, final ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (!str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") || resultReceiver == null) {
            final h9a h9aVar = new h9a(str, Bundle.EMPTY);
            h0(h9aVar, 0, new py6(h9aVar, bundle, resultReceiver) { // from class: fy6
                public final /* synthetic */ Bundle b;
                public final /* synthetic */ ResultReceiver c;

                {
                    this.b = bundle;
                    this.c = resultReceiver;
                }

                @Override // py6
                public final void a(xw6 xw6Var) {
                    yx6 yx6Var = qy6.this.j;
                    if (this.b == null) {
                        Bundle bundle2 = Bundle.EMPTY;
                    }
                    do5 m = yx6Var.m(xw6Var);
                    ResultReceiver resultReceiver2 = this.c;
                    if (resultReceiver2 != null) {
                        m.b(new mn6(m, resultReceiver2, (byte) 13), mo3.a);
                    }
                }
            }, ((gx6) this.p.b).c());
            return;
        }
        kaa kaaVar = this.j.j;
        kaaVar.getClass();
        Bundle bundle2 = new Bundle();
        laa laaVar = kaaVar.a;
        bundle2.putInt(kaa.b, 0);
        String str2 = kaa.c;
        Bundle bundle3 = new Bundle();
        bundle3.putInt(laa.f, laaVar.a);
        bundle3.putInt(laa.g, 0);
        bundle3.putInt(laa.h, 1011001300);
        bundle3.putString(laa.i, laaVar.b);
        bundle3.putString(laa.j, "");
        bundle3.putBinder(laa.l, laaVar.c);
        bundle3.putParcelable(laa.k, null);
        bundle3.putBundle(laa.m, laaVar.d);
        bundle3.putInt(laa.n, 10);
        MediaSession.Token token = laaVar.e;
        if (token != null) {
            bundle3.putParcelable(laa.o, token);
        }
        bundle2.putBundle(str2, bundle3);
        resultReceiver.send(0, bundle2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final sf8 f0(og8 og8Var) {
        int i;
        int i2;
        long j;
        long j2;
        String str;
        int i3;
        int i4;
        int i5;
        long j3;
        e64 U = og8Var.U();
        boolean z = og8Var.m0(16) && !og8Var.P0();
        boolean z2 = U != null || gcc.d0(og8Var, this.s);
        Object obj = null;
        if (U != null) {
            i2 = 7;
        } else {
            int i6 = n26.a;
            if (og8Var.U() != null) {
                i = 7;
            } else {
                int h = og8Var.h();
                if (h == 1) {
                    i = 0;
                } else if (h == 2) {
                    if (!z2) {
                        i = 6;
                    }
                    i = 2;
                } else if (h == 3) {
                    if (!z2) {
                        i = 3;
                    }
                    i = 2;
                } else {
                    if (h != 4) {
                        lq5.j(uh9.k(h, "Unrecognized State: "));
                        return null;
                    }
                    i = 1;
                }
            }
            i2 = i;
        }
        zf8 a = ote.a(this.A, og8Var.q());
        long j4 = 128;
        int i7 = 0;
        while (i7 < a.a.a.size()) {
            int a2 = a.a.a(i7);
            Object obj2 = obj;
            if (a2 == 1) {
                j3 = z2 ? 516L : 514L;
            } else if (a2 == 2) {
                j3 = 16384;
            } else if (a2 == 3) {
                j3 = 1;
            } else if (a2 != 31) {
                switch (a2) {
                    case 5:
                        j3 = 256;
                        break;
                    case 6:
                    case 7:
                        j3 = 16;
                        break;
                    case 8:
                    case 9:
                        j3 = 32;
                        break;
                    case 10:
                        j3 = 4096;
                        break;
                    case 11:
                        j3 = 8;
                        break;
                    case 12:
                        j3 = 64;
                        break;
                    case 13:
                        j3 = 4194304;
                        break;
                    case 14:
                        j3 = 2621440;
                        break;
                    case 15:
                        j3 = 262144;
                        break;
                    default:
                        j3 = 0;
                        break;
                }
            } else {
                j3 = 240640;
            }
            j4 |= j3;
            i7++;
            obj = obj2;
        }
        sf8 sf8Var = obj;
        if (!this.y.isEmpty() && bn2.b(2, this.x)) {
            j4 &= -17;
        }
        if (!this.y.isEmpty() && bn2.b(3, this.x)) {
            j4 &= -33;
        }
        if (!z) {
            j4 &= -257;
        }
        long j5 = j4;
        long j6 = -1;
        if (og8Var.m0(17)) {
            int l0 = og8Var.l0();
            int i8 = n26.a;
            j = l0 == -1 ? -1L : l0;
        } else {
            j = -1;
        }
        float f = og8Var.f().a;
        float f2 = (og8Var.i() && z) ? f : 0.0f;
        Bundle bundle = U != null ? new Bundle(U.c) : new Bundle();
        bundle.putAll(this.w);
        bundle.putFloat("EXO_SPEED", f);
        ft6 S0 = og8Var.S0();
        if (S0 != null) {
            String str2 = S0.a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        if (z) {
            long k = og8Var.k();
            j6 = og8Var.b0();
            j2 = k;
        } else {
            j2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i9 = 0; i9 < this.x.size(); i9++) {
            bn2 bn2Var = (bn2) this.x.get(i9);
            h9a h9aVar = bn2Var.a;
            Bundle bundle2 = bn2Var.d;
            if (h9aVar != null) {
                Bundle bundle3 = h9aVar.c;
                String str3 = h9aVar.b;
                if (bn2Var.f && h9aVar.a == 0) {
                    i9a i9aVar = this.z;
                    if ((h9aVar != null && i9aVar.a.contains(h9aVar)) || (((i5 = bn2Var.b) != -1 && a.a(i5)) || bn2.i(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        if (TextUtils.isEmpty(str3)) {
                            lq5.j("You must specify an action to build a CustomAction");
                            return sf8Var;
                        }
                        lq5.j("You must specify a name to build a CustomAction");
                        return sf8Var;
                    }
                }
            }
        }
        if (U != null) {
            int i10 = n26.a;
            int i11 = U.a;
            if (i11 == -110) {
                i4 = 8;
            } else if (i11 == -109) {
                i4 = 11;
            } else if (i11 == -6) {
                i4 = 2;
            } else if (i11 == -2) {
                i4 = 1;
            } else if (i11 != 1) {
                switch (i11) {
                    case -107:
                        i4 = 9;
                        break;
                    case -106:
                        i4 = 7;
                        break;
                    case -105:
                        i4 = 6;
                        break;
                    case -104:
                        i4 = 5;
                        break;
                    case -103:
                        i4 = 4;
                        break;
                    case -102:
                        i4 = 3;
                        break;
                    default:
                        i4 = 0;
                        break;
                }
            } else {
                i4 = 10;
            }
            i3 = i4;
            str = U.getMessage();
        } else {
            str = sf8Var;
            i3 = 0;
        }
        return new sf8(i2, j2, j6, f2, j5, i3, str, elapsedRealtime, arrayList, j, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    @Override // dx6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(String str, Bundle bundle) {
        boolean z;
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        h9a h9aVar = new h9a(str, bundle);
        boolean i = bn2.i(str);
        qx6 qx6Var = this.p;
        Object[] objArr = 0;
        if (!i) {
            h0(h9aVar, 0, new cy6(this, h9aVar, bundle), ((gx6) qx6Var.b).c());
            return;
        }
        try {
            bn2 c = bn2.c(h9aVar);
            int i2 = c.b;
            Object obj = c.g;
            if (!c.a()) {
                efd.f("MediaSessionLegacyStub", "Can't execute predefined custom command: ".concat(str));
                return;
            }
            h9a h9aVar2 = c.a;
            if (h9aVar2 != null) {
                yve.p(h9aVar2.a == 40010);
                obj.getClass();
                h0(null, 40010, new cy6(this, (s29) obj), ((gx6) qx6Var.b).c());
                return;
            }
            yx6 yx6Var = this.j;
            yx6Var.t();
            og8 og8Var = yx6Var.t;
            if (i2 == 1) {
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                } else if (!og8Var.s()) {
                    z = true;
                }
                if (!z) {
                    g0(1, new cy6(this, (byte) 6), ((gx6) qx6Var.b).c(), false);
                    return;
                } else if (i2 != 31) {
                    g0(i2, new hy6(this, c, objArr == true ? 1 : 0), ((gx6) qx6Var.b).c(), true);
                    return;
                } else {
                    obj.getClass();
                    k0((ft6) obj, false, false);
                    return;
                }
            }
            z = false;
            if (!z) {
            }
        } catch (RuntimeException e) {
            efd.g("MediaSessionLegacyStub", "Failed to convert predefined custom command: ".concat(h9aVar.b), e);
        }
    }

    public final void g0(int i, py6 py6Var, ry6 ry6Var, boolean z) {
        if (this.j.i()) {
            return;
        }
        if (ry6Var != null) {
            m0(new hk3(this, ry6Var, i, py6Var, z));
            return;
        }
        efd.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i);
    }

    @Override // dx6
    public final void h() {
        g0(12, new cy6(this, (byte) 5), ((gx6) this.p.b).c(), true);
    }

    public final void h0(final h9a h9aVar, final int i, final py6 py6Var, final ry6 ry6Var) {
        if (ry6Var != null) {
            m0(new Runnable() { // from class: gy6
                @Override // java.lang.Runnable
                public final void run() {
                    final qy6 qy6Var = qy6.this;
                    final h9a h9aVar2 = h9aVar;
                    final char c = i;
                    final py6 py6Var2 = py6Var;
                    qy6Var.j0(ry6Var, new py6() { // from class: jy6
                        @Override // py6
                        public final void a(xw6 xw6Var) {
                            py6 py6Var3 = py6Var2;
                            rx6 rx6Var = qy6.this.g;
                            h9a h9aVar3 = h9aVar2;
                            if (h9aVar3 != null) {
                                if (!rx6Var.c0(xw6Var, h9aVar3)) {
                                    return;
                                }
                            } else if (!rx6Var.b0(xw6Var, c)) {
                                return;
                            }
                            try {
                                py6Var3.a(xw6Var);
                            } catch (RemoteException e) {
                                efd.g("MediaSessionLegacyStub", "Exception in " + xw6Var, e);
                            }
                        }
                    });
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object obj = h9aVar;
        if (h9aVar == null) {
            obj = Integer.valueOf(i);
        }
        sb.append(obj);
        efd.b("MediaSessionLegacyStub", sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    @Override // dx6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Intent intent) {
        boolean z;
        ry6 c = ((gx6) this.p.b).c();
        c.getClass();
        xw6 xw6Var = new xw6(c, 0, 0, false, null, Bundle.EMPTY);
        yx6 yx6Var = this.j;
        qy6 qy6Var = yx6Var.h;
        Context context = yx6Var.f;
        vx6 vx6Var = yx6Var.d;
        KeyEvent a = rhe.a(intent);
        ComponentName component = intent.getComponent();
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && ((component == null || Objects.equals(component.getPackageName(), context.getPackageName())) && a != null)) {
            yx6Var.t();
            yx6Var.e.getClass();
            if (a.getAction() != 0) {
                int keyCode = a.getKeyCode();
                if (keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 272 && keyCode != 273) {
                    switch (keyCode) {
                    }
                    return true;
                }
                return true;
            }
            int keyCode2 = a.getKeyCode();
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.software.leanback");
            yg6 yg6Var = null;
            if (keyCode2 != 79 && keyCode2 != 85) {
                yg6 yg6Var2 = vx6Var.a;
                if (yg6Var2 != null) {
                    vx6Var.removeCallbacks(yg6Var2);
                    yg6 yg6Var3 = vx6Var.a;
                    vx6Var.a = null;
                    yg6Var = yg6Var3;
                }
                if (yg6Var != null) {
                    gcc.X(vx6Var, yg6Var);
                }
            } else if (hasSystemFeature || a.getRepeatCount() != 0) {
                yg6 yg6Var4 = vx6Var.a;
                if (yg6Var4 != null) {
                    vx6Var.removeCallbacks(yg6Var4);
                    yg6 yg6Var5 = vx6Var.a;
                    vx6Var.a = null;
                    yg6Var = yg6Var5;
                }
                if (yg6Var != null) {
                    gcc.X(vx6Var, yg6Var);
                }
            } else {
                yg6 yg6Var6 = vx6Var.a;
                if (yg6Var6 == null) {
                    yg6 yg6Var7 = new yg6(vx6Var, xw6Var, a, (byte) 11);
                    vx6Var.a = yg6Var7;
                    vx6Var.postDelayed(yg6Var7, ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                if (yg6Var6 != null) {
                    vx6Var.removeCallbacks(yg6Var6);
                    vx6Var.a = null;
                }
                z = true;
                if (!yx6Var.x) {
                    boolean booleanExtra = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                    if (a.getRepeatCount() > 0 || yx6Var.a(a, z, booleanExtra)) {
                        return true;
                    }
                } else if ((keyCode2 == 85 || keyCode2 == 79) && z) {
                    qy6Var.S();
                    return true;
                }
            }
            z = false;
            if (!yx6Var.x) {
            }
        }
        return false;
    }

    public final void j0(ry6 ry6Var, py6 py6Var) {
        if (this.j.i()) {
            return;
        }
        if (!((gx6) this.p.b).a.isActive()) {
            efd.f("MediaSessionLegacyStub", "Ignore incoming command before initialization. pid=" + ry6Var.a.b);
            return;
        }
        xw6 M = this.g.M(ry6Var);
        if (M != null) {
            d1 d1Var = this.m;
            long j = this.t;
            d1Var.removeMessages(1001, M);
            d1Var.sendMessageDelayed(d1Var.obtainMessage(1001, M), j);
            try {
                py6Var.a(M);
                return;
            } catch (RemoteException e) {
                efd.g("MediaSessionLegacyStub", "Exception in " + M, e);
                return;
            }
        }
        if (this.h.containsKey(ry6Var)) {
            List list = (List) this.i.get(ry6Var);
            list.getClass();
            list.add(py6Var);
            return;
        }
        ny6 ny6Var = new ny6(ry6Var);
        xw6 xw6Var = new xw6(ry6Var, 0, 0, this.k.K0(ry6Var), ny6Var, Bundle.EMPTY);
        x76 l = this.j.l(xw6Var);
        ArrayList arrayList = new ArrayList();
        arrayList.add(py6Var);
        this.i.put(ry6Var, arrayList);
        l.b(new xs4((Object) l, (Object) new pm3(this, ry6Var, ny6Var, xw6Var), (byte) 0), new pe2(this, (byte) 4));
    }

    @Override // dx6
    public final void k() {
        g0(1, new cy6(this, (byte) 12), ((gx6) this.p.b).c(), true);
    }

    public final void k0(final ft6 ft6Var, final boolean z, final boolean z2) {
        g0(31, new py6() { // from class: ay6
            @Override // py6
            public final void a(xw6 xw6Var) {
                qy6 qy6Var = qy6.this;
                gba o = qy6Var.j.o(xw6Var, po5.u(ft6Var), -1, -9223372036854775807L);
                c34 c34Var = new c34();
                c34Var.d = qy6Var;
                c34Var.c = xw6Var;
                c34Var.a = z;
                c34Var.b = z2;
                o.b(new xs4(o, c34Var, (byte) 0), new pe2(qy6Var, (byte) 4));
            }
        }, ((gx6) this.p.b).c(), false);
    }

    public final boolean l0() {
        yx6 yx6Var = this.j;
        yx6Var.t();
        return this.A.a(17) && yx6Var.t.q().a(17);
    }

    public final void m0(Runnable runnable) {
        gcc.X(this.j.l, runnable);
    }

    @Override // dx6
    public final void n() {
        g0(1, new cy6(this, (byte) 6), ((gx6) this.p.b).c(), false);
    }

    public final void n0() {
        int i = Build.VERSION.SDK_INT;
        yx6 yx6Var = this.j;
        qx6 qx6Var = this.p;
        if (i < 31) {
            ComponentName componentName = this.r;
            if (componentName == null) {
                ((gx6) qx6Var.b).a.setMediaButtonReceiver(null);
            } else {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", yx6Var.b);
                intent.setComponent(componentName);
                ((gx6) qx6Var.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(yx6Var.f, 0, intent, B));
            }
        }
        ak akVar = this.q;
        if (akVar != null) {
            yx6Var.f.unregisterReceiver(akVar);
        }
        bk bkVar = this.o;
        if (bkVar != null && !bkVar.f.getAndSet(true)) {
            bkVar.c.execute(new zj(bkVar, (byte) 0));
        }
        gx6 gx6Var = (gx6) qx6Var.b;
        MediaSession mediaSession = gx6Var.a;
        gx6Var.f.kill();
        if (i == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e) {
                efd.g("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
            }
        }
        mediaSession.setCallback(null);
        gx6Var.b.a.clear();
        mediaSession.release();
        ((WeakReference) this.g.d).clear();
    }

    public final void o0() {
        bk bkVar;
        int i;
        po5 po5Var = this.y;
        i9a i9aVar = this.z;
        zf8 zf8Var = this.A;
        String str = bn2.h;
        mo5 mo5Var = new mo5(4);
        for (int i2 = 0; i2 < po5Var.size(); i2++) {
            bn2 bn2Var = (bn2) po5Var.get(i2);
            h9a h9aVar = bn2Var.a;
            if ((h9aVar == null || !i9aVar.a.contains(h9aVar)) && ((i = bn2Var.b) == -1 || !zf8Var.a(i))) {
                if (bn2Var.f) {
                    bn2Var = new bn2(bn2Var.a, bn2Var.b, bn2Var.c, new Bundle(bn2Var.d), false, bn2Var.e, bn2Var.g);
                }
                mo5Var.c(bn2Var);
            } else {
                mo5Var.c(bn2Var);
            }
        }
        this.x = bn2.f(mo5Var.f());
        boolean z = this.n;
        Bundle bundle = this.w;
        if (!z || ((bkVar = this.o) != null && bkVar.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !bn2.b(2, this.x));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !bn2.b(3, this.x));
        } else {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.x.isEmpty() || bn2.b(2, this.x)) ? false : true);
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        }
    }

    public final void p0() {
        Bundle bundle = this.w;
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        o0();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z2) {
            return;
        }
        ((gx6) this.p.b).a.setExtras(bundle);
    }

    @Override // dx6
    public final void q(String str, Bundle bundle) {
        k0(e0(str, null, null, bundle), true, true);
    }

    public final void q0(og8 og8Var) {
        m0(new ky6(this, og8Var, (byte) 1));
    }

    @Override // dx6
    public final void u(String str, Bundle bundle) {
        k0(e0(null, null, str, bundle), true, true);
    }

    @Override // dx6
    public final void v(Uri uri, Bundle bundle) {
        k0(e0(null, uri, null, bundle), true, true);
    }

    @Override // dx6
    public final void w() {
        g0(2, new cy6(this, (byte) 7), ((gx6) this.p.b).c(), true);
    }

    @Override // dx6
    public final void x(String str, Bundle bundle) {
        k0(e0(str, null, null, bundle), true, false);
    }
}
