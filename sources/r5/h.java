package r5;

import a5.j;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.d0;
import android.support.v4.media.session.g0;
import android.support.v4.media.session.w;
import android.text.TextUtils;
import android.util.Log;
import c2.v0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.q;
import com.google.android.gms.internal.cast.z;
import java.util.ArrayList;
import java.util.List;
import nh.d6;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.n;
import org.telegram.ui.Components.rk0;
import p5.c0;
import q5.o;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h {
    public static final s5.b v = new s5.b("MediaSessionManager", null);
    public final Context a;
    public final p5.b b;
    public final q c;
    public final p5.g d;
    public final q5.f e;
    public final ComponentName f;
    public final ComponentName g;
    public final j h;
    public final j i;
    public final f j;
    public final v0 k;
    public final rk0 l;
    public final c0 m;
    public q5.h n;
    public CastDevice o;
    public d0 p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public h(Context context, p5.b bVar, q qVar) {
        q5.f fVar;
        this.a = context;
        this.b = bVar;
        this.c = qVar;
        s5.b bVar2 = p5.a.l;
        l.e("Must be called from the main thread.");
        p5.a aVar = p5.a.n;
        f fVar2 = null;
        this.d = aVar != null ? aVar.b() : null;
        q5.a aVar2 = bVar.f;
        this.e = aVar2 == null ? null : aVar2.d;
        this.m = new c0(this, 2);
        String str = aVar2 == null ? null : aVar2.b;
        this.f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = aVar2 == null ? null : aVar2.a;
        this.g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        j jVar = new j(context);
        this.h = jVar;
        jVar.e = new n(this, 13);
        j jVar2 = new j(context);
        this.i = jVar2;
        jVar2.e = new d6(this, 20);
        this.k = new v0(Looper.getMainLooper(), 1);
        s5.b bVar3 = f.u;
        q5.a aVar3 = bVar.f;
        if (aVar3 != null && (fVar = aVar3.d) != null) {
            o oVar = fVar.R;
            if (oVar != null) {
                ArrayList a2 = i.a(oVar);
                int[] b10 = i.b(oVar);
                int size = a2 == null ? 0 : a2.size();
                if (a2 == null || a2.isEmpty()) {
                    Log.e(bVar3.a, bVar3.d(q5.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                } else if (a2.size() > 5) {
                    Log.e(bVar3.a, bVar3.d(q5.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                } else if (b10 == null || (b10.length) == 0) {
                    Log.e(bVar3.a, bVar3.d(q5.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                } else {
                    for (int i10 : b10) {
                        if (i10 < 0 || i10 >= size) {
                            Log.e(bVar3.a, bVar3.d(q5.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                            break;
                        }
                    }
                }
            }
            fVar2 = new f(context);
        }
        this.j = fVar2;
        this.l = new rk0(this, 8);
    }

    public final void a(q5.h hVar, CastDevice castDevice) {
        ComponentName componentName;
        p5.b bVar = this.b;
        q5.a aVar = bVar == null ? null : bVar.f;
        if (this.q || bVar == null || aVar == null || this.e == null || hVar == null || castDevice == null || (componentName = this.g) == null) {
            v.b("skip attaching media session", new Object[0]);
            return;
        }
        this.n = hVar;
        hVar.p(this.m);
        this.o = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        int i10 = z.a;
        Context context = this.a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, i10);
        if (aVar.f) {
            d0 d0Var = new d0(context, "CastMediaSession", componentName, broadcast);
            this.p = d0Var;
            j(0, null);
            CastDevice castDevice2 = this.o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                Bundle bundle = new Bundle();
                String string = context.getResources().getString(R.string.cast_casting_to_device, this.o.d);
                a0.f fVar = MediaMetadataCompat.d;
                if (fVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) fVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                    throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                }
                bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                d0Var.e(new MediaMetadataCompat(bundle));
            }
            d0Var.d(new g(this), null);
            d0Var.c(true);
            this.c.J0(d0Var);
        }
        this.q = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        MediaInfo d;
        o5.l lVar;
        boolean z10;
        boolean z11;
        ie.b bVar;
        Uri uri;
        oc.i iVar;
        o5.o c3;
        MediaInfo mediaInfo;
        q5.h hVar = this.n;
        if (hVar == null) {
            return;
        }
        int s10 = hVar.s();
        MediaInfo d10 = hVar.d();
        if (hVar.k() && (c3 = hVar.c()) != null && (mediaInfo = c3.a) != null) {
            d10 = mediaInfo;
        }
        j(s10, d10);
        if (!hVar.h()) {
            h();
            i();
            return;
        }
        if (s10 != 0) {
            f fVar = this.j;
            if (fVar != null) {
                v.b("Update media notification.", new Object[0]);
                CastDevice castDevice = this.o;
                q5.h hVar2 = this.n;
                d0 d0Var = this.p;
                if (castDevice != null && hVar2 != null && d0Var != null && (d = hVar2.d()) != null && (lVar = d.d) != null) {
                    List list = lVar.a;
                    o5.q e10 = hVar2.e();
                    if (e10 != null) {
                        int i10 = e10.B;
                        if (i10 == 1 || i10 == 2 || i10 == 3) {
                            z10 = true;
                            z11 = true;
                        } else {
                            Integer num = (Integer) e10.J.get(e10.c);
                            if (num != null) {
                                z11 = num.intValue() > 0;
                                z10 = num.intValue() < e10.C.size() + (-1);
                            }
                        }
                        boolean z12 = hVar2.f() != 2;
                        int i11 = d.b;
                        o5.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                        String string = lVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                        String str = castDevice.d;
                        ie.b bVar2 = new ie.b(z12, i11, string, str, d0Var.a.b, z10, z11);
                        boolean z13 = z12;
                        boolean z14 = z10;
                        boolean z15 = z11;
                        bVar = fVar.k;
                        if (bVar != null || z13 != bVar.a || i11 != bVar.b || !s5.a.d(string, (String) bVar.f) || !s5.a.d(str, (String) bVar.g) || z14 != bVar.c || z15 != bVar.d) {
                            fVar.k = bVar2;
                            fVar.b();
                        }
                        oc.i iVar2 = new oc.i((list != null || list.isEmpty()) ? null : (y5.a) list.get(0));
                        uri = (Uri) iVar2.b;
                        iVar = fVar.l;
                        if (iVar != null || !s5.a.d(uri, (Uri) iVar.b)) {
                            j jVar = fVar.i;
                            jVar.e = new oc.i(fVar, iVar2, false, 23);
                            jVar.u(uri);
                        }
                    }
                    z10 = false;
                    z11 = false;
                    if (hVar2.f() != 2) {
                    }
                    int i112 = d.b;
                    o5.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string2 = lVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                    String str2 = castDevice.d;
                    ie.b bVar22 = new ie.b(z12, i112, string2, str2, d0Var.a.b, z10, z11);
                    boolean z132 = z12;
                    boolean z142 = z10;
                    boolean z152 = z11;
                    bVar = fVar.k;
                    if (bVar != null) {
                    }
                    fVar.k = bVar22;
                    fVar.b();
                    oc.i iVar22 = new oc.i((list != null || list.isEmpty()) ? null : (y5.a) list.get(0));
                    uri = (Uri) iVar22.b;
                    iVar = fVar.l;
                    if (iVar != null) {
                    }
                    j jVar2 = fVar.i;
                    jVar2.e = new oc.i(fVar, iVar22, false, 23);
                    jVar2.u(uri);
                }
            }
            if (hVar.k()) {
                return;
            }
            g(true);
        }
    }

    public final long c(String str, int i10, Bundle bundle) {
        long j10;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    if (i10 == 3) {
                        j10 = 514;
                        i10 = 3;
                    } else {
                        j10 = 512;
                    }
                    if (i10 != 2) {
                        return j10;
                    }
                    return 516L;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                q5.h hVar = this.n;
                if (hVar != null && hVar.h()) {
                    o5.q e10 = hVar.e();
                    l.h(e10);
                    if ((128 & e10.n) != 0 || e10.B != 0) {
                        return 16L;
                    }
                    Integer num = (Integer) e10.J.get(e10.c);
                    if (num != null && num.intValue() > 0) {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            q5.h hVar2 = this.n;
            if (hVar2 != null && hVar2.h()) {
                o5.q e11 = hVar2.e();
                l.h(e11);
                if ((64 & e11.n) != 0 || e11.B != 0) {
                    return 32L;
                }
                Integer num2 = (Integer) e11.J.get(e11.c);
                if (num2 != null && num2.intValue() < e11.C.size() - 1) {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    public final Uri d(o5.l lVar) {
        q5.a aVar = this.b.f;
        if (aVar != null) {
            aVar.b();
        }
        List list = lVar.a;
        y5.a aVar2 = (list == null || list.isEmpty()) ? null : (y5.a) lVar.a.get(0);
        if (aVar2 == null) {
            return null;
        }
        return aVar2.b;
    }

    public final void e(Bitmap bitmap, int i10) {
        d0 d0Var = this.p;
        if (d0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        d0 d0Var2 = this.p;
        MediaMetadataCompat a2 = d0Var2 == null ? null : d0Var2.b.a();
        za.c cVar = a2 == null ? new za.c(1) : new za.c(a2);
        cVar.D(i10 == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART", bitmap);
        d0Var.e(cVar.h());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(g0 g0Var, String str, q5.d dVar) {
        int hashCode = str.hashCode();
        Context context = this.a;
        PlaybackStateCompat.CustomAction customAction = null;
        q5.f fVar = this.e;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    if (this.s == null && fVar != null) {
                        long j10 = fVar.c;
                        s5.b bVar = i.a;
                        int i10 = fVar.N;
                        if (j10 == 10000) {
                            i10 = fVar.O;
                        } else if (j10 == 30000) {
                            i10 = fVar.P;
                        }
                        int i11 = fVar.y;
                        if (j10 == 10000) {
                            i11 = fVar.A;
                        } else if (j10 == 30000) {
                            i11 = fVar.B;
                        }
                        String string = context.getResources().getString(i10);
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_REWIND)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i11 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.s = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_REWIND, string, i11, null);
                    }
                    customAction = this.s;
                    if (customAction != null) {
                        g0Var.a(customAction);
                        return;
                    }
                    return;
                }
                if (dVar != null) {
                    String str2 = dVar.c;
                    int i12 = dVar.b;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (i12 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction(str, str2, i12, null);
                }
                if (customAction != null) {
                }
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    if (this.t == null && fVar != null) {
                        String string2 = context.getResources().getString(fVar.Q);
                        int i13 = fVar.C;
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string2)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i13 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.t = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string2, i13, null);
                    }
                    customAction = this.t;
                    if (customAction != null) {
                    }
                }
                if (dVar != null) {
                }
                if (customAction != null) {
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    if (this.u == null && fVar != null) {
                        String string3 = context.getResources().getString(fVar.Q);
                        int i14 = fVar.C;
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string3)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i14 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.u = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string3, i14, null);
                    }
                    customAction = this.u;
                    if (customAction != null) {
                    }
                }
                if (dVar != null) {
                }
                if (customAction != null) {
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    if (this.r == null && fVar != null) {
                        long j11 = fVar.c;
                        s5.b bVar2 = i.a;
                        int i15 = fVar.K;
                        if (j11 == 10000) {
                            i15 = fVar.L;
                        } else if (j11 == 30000) {
                            i15 = fVar.M;
                        }
                        int i16 = fVar.v;
                        if (j11 == 10000) {
                            i16 = fVar.w;
                        } else if (j11 == 30000) {
                            i16 = fVar.x;
                        }
                        String string4 = context.getResources().getString(i15);
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_FORWARD)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string4)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i16 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.r = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string4, i16, null);
                    }
                    customAction = this.r;
                    if (customAction != null) {
                    }
                }
                if (dVar != null) {
                }
                if (customAction != null) {
                }
                break;
            default:
                if (dVar != null) {
                }
                if (customAction != null) {
                }
                break;
        }
    }

    public final void g(boolean z10) {
        if (this.b.h) {
            v0 v0Var = this.k;
            rk0 rk0Var = this.l;
            if (rk0Var != null) {
                v0Var.removeCallbacks(rk0Var);
            }
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z10) {
                    v0Var.postDelayed(rk0Var, 1000L);
                }
            }
        }
    }

    public final void h() {
        f fVar = this.j;
        if (fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            j jVar = fVar.i;
            jVar.x();
            jVar.e = null;
            NotificationManager notificationManager = fVar.b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (this.b.h) {
            this.k.removeCallbacks(this.l);
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
        }
    }

    public final void j(int i10, MediaInfo mediaInfo) {
        PlaybackStateCompat b10;
        d0 d0Var;
        o5.l lVar;
        Bitmap bitmap;
        PendingIntent activity;
        int i11;
        d0 d0Var2 = this.p;
        if (d0Var2 == null) {
            return;
        }
        w wVar = d0Var2.a;
        Bundle bundle = new Bundle();
        g0 g0Var = new g0();
        q5.h hVar = this.n;
        q5.f fVar = this.e;
        if (hVar == null || this.j == null) {
            b10 = g0Var.b();
        } else {
            g0Var.c(i10, (hVar.s() == 0 || hVar.j()) ? 0L : hVar.a(), 1.0f);
            if (i10 == 0) {
                b10 = g0Var.b();
            } else {
                o oVar = fVar != null ? fVar.R : null;
                q5.h hVar2 = this.n;
                long j10 = (hVar2 == null || hVar2.j() || this.n.n()) ? 0L : 256L;
                if (oVar != null) {
                    ArrayList a2 = i.a(oVar);
                    if (a2 != null) {
                        int size = a2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = a2.get(i12);
                            i12++;
                            ArrayList arrayList = a2;
                            q5.d dVar = (q5.d) obj;
                            int i13 = size;
                            String str = dVar.a;
                            if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                j10 = c(str, i10, bundle) | j10;
                            } else {
                                f(g0Var, str, dVar);
                            }
                            size = i13;
                            a2 = arrayList;
                        }
                    }
                } else if (fVar != null) {
                    ArrayList arrayList2 = fVar.a;
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = arrayList2.get(i14);
                        i14++;
                        ArrayList arrayList3 = arrayList2;
                        String str2 = (String) obj2;
                        if (TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                            i11 = size2;
                            j10 = c(str2, i10, bundle) | j10;
                        } else {
                            i11 = size2;
                            f(g0Var, str2, null);
                        }
                        size2 = i11;
                        arrayList2 = arrayList3;
                    }
                }
                g0Var.e = j10;
                b10 = g0Var.b();
            }
        }
        d0Var2.f(b10);
        if (fVar != null && fVar.S) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        if (fVar != null && fVar.T) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            wVar.a.setExtras(bundle);
        }
        if (i10 == 0) {
            d0Var2.e(new MediaMetadataCompat(new Bundle()));
            return;
        }
        if (this.n != null) {
            ComponentName componentName = this.f;
            if (componentName == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(componentName);
                activity = PendingIntent.getActivity(this.a, 0, intent, z.a | TLObject.FLAG_27);
            }
            if (activity != null) {
                wVar.a.setSessionActivity(activity);
            }
        }
        q5.h hVar3 = this.n;
        if (hVar3 == null || (d0Var = this.p) == null || mediaInfo == null || (lVar = mediaInfo.d) == null) {
            return;
        }
        Bundle bundle2 = lVar.b;
        long j11 = hVar3.j() ? 0L : mediaInfo.e;
        o5.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
        String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
        o5.l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
        String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
        d0 d0Var3 = this.p;
        MediaMetadataCompat a10 = d0Var3 == null ? null : d0Var3.b.a();
        za.c cVar = a10 == null ? new za.c(1) : new za.c(a10);
        cVar.E(j11, "android.media.metadata.DURATION");
        if (string != null) {
            cVar.F("android.media.metadata.TITLE", string);
            cVar.F("android.media.metadata.DISPLAY_TITLE", string);
        }
        if (string2 != null) {
            cVar.F("android.media.metadata.DISPLAY_SUBTITLE", string2);
        }
        d0Var.e(cVar.h());
        Uri d = d(lVar);
        if (d != null) {
            this.h.u(d);
            bitmap = null;
        } else {
            bitmap = null;
            e(null, 0);
        }
        Uri d10 = d(lVar);
        if (d10 != null) {
            this.i.u(d10);
        } else {
            e(bitmap, 3);
        }
    }
}
