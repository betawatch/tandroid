package p4;

import a8.ia;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import bi.nb;
import bi.ub;
import c8.ab;
import h9.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import jg.a2;
import org.telegram.messenger.re;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class m0 extends android.support.v4.media.session.s {
    public static final int z;
    public final ui.e g;
    public final d0 h;
    public final q4.u i;
    public final re j;
    public final android.support.v4.media.session.q k;
    public final boolean l;
    public final b m;
    public final q4.q n;
    public final androidx.mediarouter.app.f o;
    public final ComponentName p;
    public final boolean q;
    public volatile long r;
    public re s;
    public int t;
    public final Bundle u;
    public h9.i0 v;
    public h9.i0 w;
    public j1 x;
    public e2.y0 y;

    static {
        z = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m0(d0 d0Var, Uri uri, Handler handler, Bundle bundle, boolean z9, h9.i0 i0Var, h9.i0 i0Var2, j1 j1Var, e2.y0 y0Var, Bundle bundle2) {
        super(1);
        boolean z10;
        List<ResolveInfo> queryBroadcastReceivers;
        ComponentName componentName;
        ComponentName k02;
        PendingIntent foregroundService;
        q4.q qVar;
        boolean z11 = true;
        this.h = d0Var;
        this.q = z9;
        this.v = i0Var;
        this.w = i0Var2;
        this.x = j1Var;
        this.y = y0Var;
        this.u = new Bundle(bundle2);
        Context context = d0Var.f;
        this.i = q4.u.a(context);
        this.j = new re(this);
        ui.e eVar = new ui.e(d0Var);
        this.g = eVar;
        this.r = 300000L;
        this.k = new android.support.v4.media.session.q(d0Var.l.getLooper(), eVar);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            String str = h2.m0.a;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                String str2 = Build.MANUFACTURER;
                if (str2.equals("Google") || str2.equals("motorola") || str2.equals("vivo") || str2.equals("Sony") || str2.equals("Nothing") || str2.equals("unknown")) {
                    z10 = true;
                    this.l = z10;
                    if (!i0Var2.isEmpty()) {
                        n0();
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
                            h2.a.l("MediaSessionLegacyStub", "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + queryBroadcastReceivers.size() + ". Using runtime media button receiver instead.");
                        }
                        componentName = null;
                    }
                    this.p = componentName;
                    if (componentName != null || i7 < 31) {
                        k02 = k0(context, "androidx.media3.session.MediaLibraryService");
                        k02 = k02 == null ? k0(context, "androidx.media3.session.MediaSessionService") : k02;
                        if (k02 != null || k02.equals(componentName)) {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                        k02 = componentName;
                    }
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
                    if (k02 != null) {
                        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 11);
                        this.o = fVar;
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
                        String scheme = uri.getScheme();
                        String str3 = h2.m0.a;
                        intentFilter.addDataScheme(scheme);
                        if (i7 < 33) {
                            context.registerReceiver(fVar, intentFilter);
                        } else {
                            context.registerReceiver(fVar, intentFilter, 4);
                        }
                        intent2.setPackage(context.getPackageName());
                        foregroundService = PendingIntent.getBroadcast(context, 0, intent2, z);
                        k02 = new ComponentName(context, context.getClass());
                    } else {
                        intent2.setComponent(k02);
                        foregroundService = z11 ? i7 >= 26 ? PendingIntent.getForegroundService(context, 0, intent2, z) : PendingIntent.getService(context, 0, intent2, z) : PendingIntent.getBroadcast(context, 0, intent2, z);
                        this.o = null;
                    }
                    qVar = new q4.q(context, TextUtils.join(".", new String[]{"androidx.media3.session.id", d0Var.i}), i7 >= 31 ? null : k02, i7 >= 31 ? foregroundService : null, bundle);
                    this.n = qVar;
                    if (i7 >= 31 && componentName != null) {
                        bg.o0.j(qVar, componentName);
                    }
                    qVar.e(this, handler);
                    this.m = z10 ? new b(context, new e0(this, 0)) : null;
                }
            }
        }
        z10 = false;
        this.l = z10;
        if (!i0Var2.isEmpty()) {
        }
        PackageManager packageManager2 = context.getPackageManager();
        Intent intent3 = new Intent("android.intent.action.MEDIA_BUTTON");
        intent3.setPackage(context.getPackageName());
        queryBroadcastReceivers = packageManager2.queryBroadcastReceivers(intent3, 0);
        if (queryBroadcastReceivers.size() != 1) {
        }
        this.p = componentName;
        if (componentName != null) {
        }
        k02 = k0(context, "androidx.media3.session.MediaLibraryService");
        if (k02 == null) {
        }
        if (k02 != null) {
        }
        z11 = false;
        Intent intent22 = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        if (k02 != null) {
        }
        qVar = new q4.q(context, TextUtils.join(".", new String[]{"androidx.media3.session.id", d0Var.i}), i7 >= 31 ? null : k02, i7 >= 31 ? foregroundService : null, bundle);
        this.n = qVar;
        if (i7 >= 31) {
            bg.o0.j(qVar, componentName);
        }
        qVar.e(this, handler);
        this.m = z10 ? new b(context, new e0(this, 0)) : null;
    }

    public static void e0(q4.q qVar, ArrayList arrayList) {
        int i7 = 0;
        if (arrayList != null) {
            qVar.getClass();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long j3 = ((q4.o) obj).b;
                if (hashSet.contains(Long.valueOf(j3))) {
                    h2.a.d("MediaSessionCompat", a8.p0.o(j3, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j3));
            }
        }
        q4.l lVar = (q4.l) qVar.b;
        MediaSession mediaSession = lVar.a;
        lVar.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            q4.o oVar = (q4.o) obj2;
            MediaSession.QueueItem queueItem = oVar.c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(oVar.a.a(), oVar.b);
                oVar.c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void f0(q4.q qVar, q4.i iVar) {
        q4.l lVar = (q4.l) qVar.b;
        lVar.i = iVar;
        MediaSession mediaSession = lVar.a;
        Bundle bundle = iVar.a;
        if (iVar.b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) q4.i.c.get(str);
                if (num == null) {
                    num = -1;
                }
                int intValue = num.intValue();
                if (intValue == 0) {
                    builder.putLong(str, bundle.getLong(str));
                } else if (intValue == 1) {
                    builder.putText(str, bundle.getCharSequence(str));
                } else if (intValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (intValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            iVar.b = builder.build();
        }
        mediaSession.setMetadata(iVar.b);
    }

    public static e2.l0 g0(String str, Uri uri, String str2, Bundle bundle) {
        e2.z zVar = new e2.z();
        h9.g0 g0Var = h9.i0.b;
        t1 t1Var = t1.e;
        List list = Collections.EMPTY_LIST;
        t1 t1Var2 = t1.e;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(20, false);
        a0Var.b = uri;
        a0Var.c = str2;
        a0Var.d = bundle;
        return new e2.l0(str3, new e2.b0(zVar), null, new e2.f0(e0Var), e2.o0.L, new e2.h0(a0Var));
    }

    public static ComponentName k0(Context context, String str) {
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

    @Override // android.support.v4.media.session.s
    public final void A(String str, Bundle bundle) {
        l0(g0(null, null, str, bundle), true, false);
    }

    @Override // android.support.v4.media.session.s
    public final void D(Uri uri, Bundle bundle) {
        l0(g0(null, uri, null, bundle), true, false);
    }

    @Override // android.support.v4.media.session.s
    public final void E(q4.h hVar) {
        if (hVar == null) {
            return;
        }
        i0(20, new org.telegram.ui.web.a0(3, this, hVar), ((q4.l) this.n.b).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void F() {
        i0(11, new g0(this, 5), ((q4.l) this.n.b).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void G(long j3) {
        i0(5, new f0(this, j3, 1), ((q4.l) this.n.b).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void J(final float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        i0(13, new l0() { // from class: p4.j0
            @Override // p4.l0
            public final void f(v vVar) {
                m0.this.h.t.d(f10);
            }
        }, ((q4.l) this.n.b).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void K(q4.y yVar) {
        L(yVar);
    }

    @Override // android.support.v4.media.session.s
    public final void L(q4.y yVar) {
        e2.d1 c10 = n.c(yVar);
        if (c10 != null) {
            j0(null, 40010, new g0(this, c10), ((q4.l) this.n.b).c());
            return;
        }
        h2.a.l("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + yVar);
    }

    @Override // android.support.v4.media.session.s
    public final void M(int i7) {
        i0(15, new i0(this, i7, 0), ((q4.l) this.n.b).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void P(int i7) {
        i0(14, new i0(this, i7, 1), ((q4.l) this.n.b).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void S() {
        boolean p02 = this.h.t.p0(9);
        q4.q qVar = this.n;
        if (p02) {
            i0(9, new g0(this, 10), ((q4.l) qVar.b).c(), true);
        } else {
            i0(8, new g0(this, 11), ((q4.l) qVar.b).c(), true);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void V() {
        boolean p02 = this.h.t.p0(7);
        q4.q qVar = this.n;
        if (p02) {
            i0(7, new g0(this, 2), ((q4.l) qVar.b).c(), true);
        } else {
            i0(6, new g0(this, 3), ((q4.l) qVar.b).c(), true);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void Y(long j3) {
        if (j3 < 0) {
            return;
        }
        i0(10, new f0(this, j3, 0), ((q4.l) this.n.b).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void b0() {
        i0(3, new g0(this, 8), ((q4.l) this.n.b).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void c(q4.h hVar) {
        if (hVar != null) {
            i0(20, new a2(this, hVar, -1, 16), ((q4.l) this.n.b).c(), false);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void d(q4.h hVar, int i7) {
        if (hVar != null) {
            if (i7 == -1 || i7 >= 0) {
                i0(20, new a2(this, hVar, i7, 16), ((q4.l) this.n.b).c(), false);
            }
        }
    }

    @Override // android.support.v4.media.session.s
    public final void e(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (!str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") || resultReceiver == null) {
            i1 i1Var = new i1(str, Bundle.EMPTY);
            j0(i1Var, 0, new hr(this, i1Var, bundle, resultReceiver), ((q4.l) this.n.b).c());
            return;
        }
        n1 n1Var = this.h.j;
        n1Var.getClass();
        String str2 = n1.b;
        Bundle bundle2 = new Bundle();
        o1 o1Var = n1Var.a;
        if (o1Var != null) {
            bundle2.putInt(str2, 0);
        } else {
            bundle2.putInt(str2, 1);
        }
        String str3 = n1.c;
        o1Var.getClass();
        Bundle bundle3 = new Bundle();
        bundle3.putInt(o1.i, o1Var.a);
        bundle3.putInt(o1.j, 0);
        bundle3.putInt(o1.k, o1Var.b);
        bundle3.putString(o1.l, o1Var.d);
        bundle3.putString(o1.m, o1Var.e);
        bundle3.putBinder(o1.o, o1Var.f);
        bundle3.putParcelable(o1.n, null);
        bundle3.putBundle(o1.p, o1Var.g);
        bundle3.putInt(o1.q, o1Var.c);
        MediaSession.Token token = o1Var.h;
        if (token != null) {
            bundle3.putParcelable(o1.r, token);
        }
        bundle2.putBundle(str3, bundle3);
        resultReceiver.send(0, bundle2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    @Override // android.support.v4.media.session.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(String str, Bundle bundle) {
        boolean booleanValue;
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        i1 i1Var = new i1(str, bundle);
        boolean j3 = d.j(str);
        q4.q qVar = this.n;
        if (!j3) {
            j0(i1Var, 0, new g0(this, i1Var, bundle), ((q4.l) qVar.b).c());
            return;
        }
        try {
            d d = d.d(i1Var);
            int i7 = d.b;
            Object obj = d.g;
            if (!d.b()) {
                h2.a.l("MediaSessionLegacyStub", "Can't execute predefined custom command: ".concat(str));
                return;
            }
            i1 i1Var2 = d.a;
            if (i1Var2 != null) {
                ia.p(i1Var2.a == 40010);
                obj.getClass();
                j0(null, 40010, new g0(this, (e2.d1) obj), ((q4.l) qVar.b).c());
                return;
            }
            g1 g1Var = this.h.t;
            if (i7 == 1) {
                if (obj != null) {
                    booleanValue = ((Boolean) obj).booleanValue();
                } else if (!g1Var.u()) {
                    booleanValue = true;
                }
                if (!booleanValue) {
                    i0(1, new g0(this, 6), ((q4.l) qVar.b).c(), false);
                    return;
                } else if (i7 != 31) {
                    i0(i7, new org.telegram.ui.web.a0(2, this, d), ((q4.l) qVar.b).c(), true);
                    return;
                } else {
                    obj.getClass();
                    l0((e2.l0) obj, false, false);
                    return;
                }
            }
            booleanValue = false;
            if (!booleanValue) {
            }
        } catch (RuntimeException e10) {
            h2.a.m("MediaSessionLegacyStub", "Failed to convert predefined custom command: " + i1Var.b, e10);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void h() {
        i0(12, new g0(this, 4), ((q4.l) this.n.b).c(), true);
    }

    public final q4.w h0(g1 g1Var) {
        int i7;
        int i10;
        long j3;
        String str;
        int i11;
        int i12;
        int i13;
        long j10;
        e2.v0 W = g1Var.W();
        boolean z9 = g1Var.p0(16) && !g1Var.P0();
        boolean z10 = W != null || h2.m0.c0(g1Var, this.q);
        if (W != null) {
            i10 = 7;
        } else {
            int i14 = n.a;
            if (g1Var.W() != null) {
                i7 = 7;
            } else {
                int i15 = g1Var.i();
                if (i15 == 1) {
                    i7 = 0;
                } else if (i15 == 2) {
                    if (!z10) {
                        i7 = 6;
                    }
                    i7 = 2;
                } else if (i15 == 3) {
                    if (!z10) {
                        i7 = 3;
                    }
                    i7 = 2;
                } else {
                    if (i15 != 4) {
                        throw new IllegalArgumentException(jg.g.j(i15, "Unrecognized State: "));
                    }
                    i7 = 1;
                }
            }
            i10 = i7;
        }
        e2.y0 a10 = ab.a(this.y, g1Var.t());
        long j11 = 128;
        for (int i16 = 0; i16 < a10.a.a.size(); i16++) {
            int a11 = a10.a.a(i16);
            if (a11 == 1) {
                j10 = z10 ? 516L : 514L;
            } else if (a11 == 2) {
                j10 = 16384;
            } else if (a11 == 3) {
                j10 = 1;
            } else if (a11 != 31) {
                switch (a11) {
                    case 5:
                        j10 = 256;
                        break;
                    case 6:
                    case 7:
                        j10 = 16;
                        break;
                    case 8:
                    case 9:
                        j10 = 32;
                        break;
                    case 10:
                        j10 = 4096;
                        break;
                    case 11:
                        j10 = 8;
                        break;
                    case 12:
                        j10 = 64;
                        break;
                    case 13:
                        j10 = 4194304;
                        break;
                    case 14:
                        j10 = 2621440;
                        break;
                    case 15:
                        j10 = 262144;
                        break;
                    default:
                        j10 = 0;
                        break;
                }
            } else {
                j10 = 240640;
            }
            j11 |= j10;
        }
        if (!this.w.isEmpty() && d.c(2, this.v)) {
            j11 &= -17;
        }
        if (!this.w.isEmpty() && d.c(3, this.v)) {
            j11 &= -33;
        }
        if (!z9) {
            j11 &= -257;
        }
        long j12 = j11;
        if (g1Var.p0(17)) {
            int o02 = g1Var.o0();
            int i17 = n.a;
            j3 = o02 == -1 ? -1L : o02;
        } else {
            j3 = -1;
        }
        float f10 = g1Var.j().a;
        float f11 = (g1Var.h() && z9) ? f10 : 0.0f;
        Bundle bundle = W != null ? new Bundle(W.c) : new Bundle();
        bundle.putAll(this.u);
        bundle.putFloat("EXO_SPEED", f10);
        e2.l0 S0 = g1Var.S0();
        if (S0 != null) {
            String str2 = S0.a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        long l10 = z9 ? g1Var.l() : -1L;
        long d02 = z9 ? g1Var.d0() : -1L;
        ArrayList arrayList = new ArrayList();
        long j13 = d02;
        long j14 = l10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i18 = 0; i18 < this.v.size(); i18++) {
            d dVar = (d) this.v.get(i18);
            i1 i1Var = dVar.a;
            Bundle bundle2 = dVar.d;
            if (i1Var != null) {
                Bundle bundle3 = i1Var.c;
                String str3 = i1Var.b;
                if (dVar.f && i1Var.a == 0) {
                    j1 j1Var = this.x;
                    if ((i1Var != null && j1Var.a.contains(i1Var)) || (((i13 = dVar.b) != -1 && a10.a(i13)) || d.j(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        int i19 = dVar.c;
                        if (TextUtils.isEmpty(str3)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty("")) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i19 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        arrayList.add(new q4.v(str3, i19, bundle3));
                    }
                }
            }
        }
        if (W != null) {
            int i20 = n.a;
            int i21 = W.a;
            if (i21 == -110) {
                i12 = 8;
            } else if (i21 == -109) {
                i12 = 11;
            } else if (i21 == -6) {
                i12 = 2;
            } else if (i21 == -2) {
                i12 = 1;
            } else if (i21 != 1) {
                switch (i21) {
                    case -107:
                        i12 = 9;
                        break;
                    case -106:
                        i12 = 7;
                        break;
                    case -105:
                        i12 = 6;
                        break;
                    case -104:
                        i12 = 5;
                        break;
                    case -103:
                        i12 = 4;
                        break;
                    case -102:
                        i12 = 3;
                        break;
                    default:
                        i12 = 0;
                        break;
                }
            } else {
                i12 = 10;
            }
            str = W.getMessage();
            i11 = i12;
        } else {
            str = null;
            i11 = 0;
        }
        return new q4.w(i10, j14, j13, f11, j12, i11, str, elapsedRealtime, arrayList, j3, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    @Override // android.support.v4.media.session.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Intent intent) {
        boolean z9;
        q4.r c10 = ((q4.l) this.n.b).c();
        c10.getClass();
        v vVar = new v(c10, 0, 0, false, null, Bundle.EMPTY);
        d0 d0Var = this.h;
        m0 m0Var = d0Var.h;
        Context context = d0Var.f;
        a0 a0Var = d0Var.d;
        Bundle extras = intent.getExtras();
        r31 r31Var = null;
        KeyEvent keyEvent = (extras == null || !extras.containsKey("android.intent.extra.KEY_EVENT")) ? null : (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
        ComponentName component = intent.getComponent();
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && ((component == null || Objects.equals(component.getPackageName(), context.getPackageName())) && keyEvent != null)) {
            d0Var.u();
            d0Var.e.getClass();
            if (keyEvent.getAction() != 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 272 && keyCode != 273) {
                    switch (keyCode) {
                    }
                    return true;
                }
                return true;
            }
            int keyCode2 = keyEvent.getKeyCode();
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.software.leanback");
            if (keyCode2 != 79 && keyCode2 != 85) {
                r31 r31Var2 = a0Var.a;
                if (r31Var2 != null) {
                    a0Var.removeCallbacks(r31Var2);
                    r31 r31Var3 = a0Var.a;
                    a0Var.a = null;
                    r31Var = r31Var3;
                }
                if (r31Var != null) {
                    h2.m0.W(a0Var, r31Var);
                }
            } else if (hasSystemFeature || keyEvent.getRepeatCount() != 0) {
                r31 r31Var4 = a0Var.a;
                if (r31Var4 != null) {
                    a0Var.removeCallbacks(r31Var4);
                    r31 r31Var5 = a0Var.a;
                    a0Var.a = null;
                    r31Var = r31Var5;
                }
                if (r31Var != null) {
                    h2.m0.W(a0Var, r31Var);
                }
            } else {
                r31 r31Var6 = a0Var.a;
                if (r31Var6 == null) {
                    r31 r31Var7 = new r31(a0Var, vVar, keyEvent, 13);
                    a0Var.a = r31Var7;
                    a0Var.postDelayed(r31Var7, ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                if (r31Var6 != null) {
                    a0Var.removeCallbacks(r31Var6);
                    a0Var.a = null;
                }
                z9 = true;
                if (!d0Var.x) {
                    boolean booleanExtra = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                    if (keyEvent.getRepeatCount() > 0 || d0Var.b(keyEvent, z9, booleanExtra)) {
                        return true;
                    }
                } else if ((keyCode2 == 85 || keyCode2 == 79) && z9) {
                    m0Var.S();
                    return true;
                }
            }
            z9 = false;
            if (!d0Var.x) {
            }
        }
        return false;
    }

    public final void i0(int i7, l0 l0Var, q4.r rVar, boolean z9) {
        d0 d0Var = this.h;
        if (d0Var.j()) {
            return;
        }
        if (rVar != null) {
            h2.m0.W(d0Var.l, new nb(this, i7, rVar, l0Var, z9));
            return;
        }
        h2.a.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i7);
    }

    public final void j0(i1 i1Var, int i7, l0 l0Var, q4.r rVar) {
        if (rVar != null) {
            h2.m0.W(this.h.l, new ub(this, i1Var, i7, rVar, l0Var, 24));
            return;
        }
        StringBuilder sb2 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object obj = i1Var;
        if (i1Var == null) {
            obj = Integer.valueOf(i7);
        }
        sb2.append(obj);
        h2.a.b("MediaSessionLegacyStub", sb2.toString());
    }

    @Override // android.support.v4.media.session.s
    public final void k() {
        i0(1, new g0(this, 12), ((q4.l) this.n.b).c(), true);
    }

    public final void l0(e2.l0 l0Var, boolean z9, boolean z10) {
        i0(31, new z(this, l0Var, z9, z10), ((q4.l) this.n.b).c(), false);
    }

    public final v m0(q4.r rVar) {
        v x10 = this.g.x(rVar);
        if (x10 == null) {
            v vVar = new v(rVar, 0, 0, this.i.b(rVar), new k0(rVar), Bundle.EMPTY);
            t m10 = this.h.m(vVar);
            this.g.b(rVar, vVar, m10.a, m10.b);
            d0 d0Var = this.h;
            if (!d0Var.x || !d0.k(vVar)) {
                d0Var.e.getClass();
            }
            x10 = vVar;
        }
        android.support.v4.media.session.q qVar = this.k;
        long j3 = this.r;
        qVar.removeMessages(1001, x10);
        qVar.sendMessageDelayed(qVar.obtainMessage(1001, x10), j3);
        return x10;
    }

    @Override // android.support.v4.media.session.s
    public final void n() {
        i0(1, new g0(this, 6), ((q4.l) this.n.b).c(), false);
    }

    public final void n0() {
        b bVar;
        int i7;
        h9.i0 i0Var = this.w;
        j1 j1Var = this.x;
        e2.y0 y0Var = this.y;
        String str = d.h;
        h9.f0 f0Var = new h9.f0(4);
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            d dVar = (d) i0Var.get(i10);
            i1 i1Var = dVar.a;
            if ((i1Var == null || !j1Var.a.contains(i1Var)) && ((i7 = dVar.b) == -1 || !y0Var.a(i7))) {
                if (dVar.f) {
                    dVar = new d(dVar.a, dVar.b, dVar.c, new Bundle(dVar.d), false, dVar.e, dVar.g);
                }
                f0Var.c(dVar);
            } else {
                f0Var.c(dVar);
            }
        }
        this.v = d.g(f0Var.f());
        boolean z9 = this.l;
        Bundle bundle = this.u;
        if (z9 && ((bVar = this.m) == null || !bVar.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.v.isEmpty() || d.c(2, this.v)) ? false : true);
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        } else {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !d.c(2, this.v));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !d.c(3, this.v));
        }
    }

    public final void o0() {
        Bundle bundle = this.u;
        boolean z9 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        n0();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z9 && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z10) {
            return;
        }
        ((q4.l) this.n.b).a.setExtras(bundle);
    }

    public final void p0(g1 g1Var) {
        h2.m0.W(this.h.l, new h0(this, g1Var, 1));
    }

    @Override // android.support.v4.media.session.s
    public final void q(String str, Bundle bundle) {
        l0(g0(str, null, null, bundle), true, true);
    }

    @Override // android.support.v4.media.session.s
    public final void u(String str, Bundle bundle) {
        l0(g0(null, null, str, bundle), true, true);
    }

    @Override // android.support.v4.media.session.s
    public final void v(Uri uri, Bundle bundle) {
        l0(g0(null, uri, null, bundle), true, true);
    }

    @Override // android.support.v4.media.session.s
    public final void w() {
        i0(2, new g0(this, 7), ((q4.l) this.n.b).c(), true);
    }

    @Override // android.support.v4.media.session.s
    public final void x(String str, Bundle bundle) {
        l0(g0(str, null, null, bundle), true, false);
    }
}
