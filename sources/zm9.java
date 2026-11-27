// default package

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.Window;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zm9 implements hj, y27, qv0, ty9, tka, bf7, i27, bv9, jt1, v78, li1, i89, ep2, h23, a43, v30, rv9, je8 {
    public static zm9 c;
    public static final an9 d = new an9(0, 0, 0, false, false);
    public static final Object e = new Object();
    public static volatile zm9 f;
    public final /* synthetic */ byte a;
    public Object b;

    public zm9(byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.b = new LongSparseArray();
                break;
            case 27:
                this.b = new ConcurrentHashMap(16);
                break;
            default:
                this.b = new lh2[pj.values().length];
                break;
        }
    }

    public static synchronized zm9 I0() {
        zm9 zm9Var;
        synchronized (zm9.class) {
            zm9Var = c;
            if (zm9Var == null) {
                zm9Var = new zm9((byte) 0, false);
                c = zm9Var;
            }
        }
        return zm9Var;
    }

    public static zm9 J0(Context context) {
        zm9 zm9Var;
        synchronized (e) {
            if (f == null) {
                Context applicationContext = context.getApplicationContext();
                boolean z = false;
                zm9 zm9Var2 = new zm9((byte) 1, z);
                ym4 ym4Var = new ym4((byte) 8, z);
                ym4Var.b = applicationContext;
                ym4Var.c = applicationContext.getContentResolver();
                zm9Var2.b = ym4Var;
                f = zm9Var2;
            }
            zm9Var = f;
        }
        return zm9Var;
    }

    @Override // bf7
    public final void A(boolean z) {
        wk5 wk5Var;
        wk5 wk5Var2;
        wk5 wk5Var3;
        wk5 wk5Var4;
        j81 j81Var = (j81) this.b;
        j81Var.finishFragment();
        wk5Var = ((e) j81Var).parentLayout;
        if (wk5Var != null) {
            wk5Var2 = ((e) j81Var).parentLayout;
            if (wk5Var2.getFragmentStack().size() >= 2) {
                wk5Var3 = ((e) j81Var).parentLayout;
                List fragmentStack = wk5Var3.getFragmentStack();
                wk5Var4 = ((e) j81Var).parentLayout;
                e eVar = (e) fragmentStack.get(wk5Var4.getFragmentStack().size() - 2);
                if (eVar instanceof zu1) {
                    ((zu1) eVar).k6(j81Var.Q, j81Var.R + 86400, z);
                    return;
                }
                return;
            }
        }
        zu1 zu1Var = j81Var.O;
        if (zu1Var != null) {
            zu1Var.k6(j81Var.Q, j81Var.R + 86400, z);
        }
    }

    @Override // je8
    public final boolean A0() {
        return true;
    }

    @Override // h23
    public final void B(Object obj) {
        w03 w03Var = (w03) obj;
        w03Var.getClass();
        va1 va1Var = (va1) this.b;
        if (va1Var.r() instanceof sm7) {
            va1Var.resumeWith(new ge9(w03Var));
        }
    }

    @Override // bv9
    public final boolean B0(int i, View view) {
        return false;
    }

    @Override // i27
    public final void C(f27 f27Var, j27 j27Var) {
        ((fd1) this.b).f.removeCallbacksAndMessages(f27Var);
    }

    @Override // v30
    public final void C0(long j, int i, long j2) {
        lh2 lh2Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new m30((Object) lh2Var, i, j, j2, (byte) 0));
        }
    }

    @Override // rv9
    public final boolean C1(int i) {
        return i == ((gx9) this.b).e0;
    }

    @Override // rv9
    public final zh6 D0() {
        return null;
    }

    @Override // je8
    public final boolean E() {
        iv3 iv3Var = (iv3) this.b;
        return (iv3Var.N1 == iv3Var.l1 && iv3Var.x1 && "inapp".equals(uc7.s1(iv3Var.a).k4.Q0.f)) ? false : true;
    }

    @Override // je8
    public final boolean E0() {
        return false;
    }

    @Override // je8
    public final boolean G(boolean z, float f2, cz9 cz9Var) {
        return false;
    }

    @Override // je8
    public final boolean H() {
        return false;
    }

    public final LongSparseArray H0(long j, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.b).get(j);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j2);
    }

    @Override // ep2
    public final void I(long j) {
        ((io2) this.b).presentFragment(zu1.ha(j));
    }

    @Override // je8
    public final void J(Rect rect) {
        rect.setEmpty();
    }

    @Override // je8
    public final View K(LaunchActivity launchActivity) {
        return null;
    }

    public final boolean K0(ry6 ry6Var) {
        ym4 ym4Var = (ym4) this.b;
        uy6 uy6Var = ry6Var.a;
        ym4Var.getClass();
        int i = uy6Var.c;
        String str = uy6Var.a;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 == 23 && str.equals("android.media.session.MediaController")) {
                return true;
            }
            ApplicationInfo applicationInfo = ((Context) ym4Var.b).getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                if (i2 < 28) {
                    i = applicationInfo.uid;
                }
                if (i == 1000 || i == Process.myUid() || ym4Var.m0(uy6Var, "android.permission.STATUS_BAR_SERVICE") || ym4Var.m0(uy6Var, "android.permission.MEDIA_CONTENT_CONTROL")) {
                    return true;
                }
                String string = Settings.Secure.getString((ContentResolver) ym4Var.c, "enabled_notification_listeners");
                if (string != null) {
                    for (String str2 : string.split(":")) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str2);
                        if (unflattenFromString != null && unflattenFromString.getPackageName().equals(str)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            efd.b("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    @Override // v30
    public final void M(qf5 qf5Var) {
        lh2 lh2Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new n30(lh2Var, qf5Var, (byte) 1));
        }
    }

    public final void M0(oy8 oy8Var, Thread thread, Throwable th) {
        yy2 yy2Var = (yy2) this.b;
        synchronized (yy2Var) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            dee.a();
            try {
                try {
                    ucc.a(((i03) yy2Var.e.b).b(new wy2(yy2Var, System.currentTimeMillis(), th, thread, oy8Var)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e2) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e2);
            }
        }
    }

    public final void N0(long j, long j2, long j3, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray();
            longSparseArray.put(j, longSparseArray2);
        }
        LongSparseArray longSparseArray3 = (LongSparseArray) longSparseArray2.get(j2);
        if (longSparseArray3 == null) {
            longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j2, longSparseArray3);
        }
        longSparseArray3.get(j3);
        longSparseArray3.put(j3, obj);
    }

    @Override // jt1
    public final void O(String str) {
        ((zu1) ((bn0) this.b).c).ta(str, false);
    }

    public final Object O0(long j, long j2, long j3) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.b).get(j);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j2)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j3);
        longSparseArray.remove(j3);
        return obj;
    }

    @Override // je8
    public final View P() {
        return ((iv3) this.b).N1;
    }

    @Override // je8
    public final boolean Q() {
        return false;
    }

    @Override // je8
    public final int S() {
        return 0;
    }

    @Override // je8
    public final int U() {
        return ((iv3) this.b).O1;
    }

    @Override // ep2
    public final void W() {
        io2 io2Var = (io2) this.b;
        fm0 fm0Var = io2Var.a;
        fp2 fp2Var = io2Var.w;
        fm0Var.a(fp2Var.n && fp2Var.l == 0, true);
        io2Var.d.g3.O(true);
    }

    @Override // je8
    public final boolean X() {
        return false;
    }

    @Override // rv9
    public final void X1(ArrayList arrayList) {
        gx9 gx9Var = (gx9) this.b;
        for (int i = 0; i < arrayList.size(); i++) {
            gx9Var.K.add(((qv9) arrayList.get(i)).a);
        }
        dj3 dj3Var = gx9Var.V;
        if (dj3Var != null) {
            dj3Var.d(gx9Var.E0 > 0, false);
        }
        gx9Var.f();
    }

    @Override // je8
    public final boolean Y() {
        return false;
    }

    @Override // v30
    public final void Z() {
        ((FfmpegAudioRenderer) this.b).u();
    }

    @Override // rv9
    public final zh6 Z0() {
        return null;
    }

    @Override // je8
    public final dg8 a0() {
        return null;
    }

    @Override // je8
    public final void b() {
        hyc hycVar = ((iv3) this.b).m1;
        if (hycVar == null || !hycVar.x) {
            return;
        }
        hycVar.a.f0();
        hycVar.n();
        hycVar.g0.d(true, true);
    }

    @Override // a43
    public final void b0() {
        ((q33) this.b).e.invalidate();
    }

    @Override // bv9
    public final void c(int i, boolean z) {
        tg1 tg1Var = ((rg1) this.b).f;
        tg1Var.E = i;
        tg1Var.d(true);
    }

    @Override // ep2
    public final void close() {
        ((io2) this.b).finishFragment();
    }

    @Override // v30
    public final void d(int i) {
        lh2 lh2Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new zd((Object) lh2Var, i, (byte) 4));
        }
    }

    @Override // je8
    public final boolean d0() {
        return false;
    }

    @Override // tka
    public final float e0() {
        return c00.d(9.66f, eg0.f(((z61) this.b).Q), 0);
    }

    @Override // y27
    public final void f(f27 f27Var, boolean z) {
        switch (this.a) {
            case 3:
                if (f27Var instanceof zdb) {
                    ((zdb) f27Var).z.k().c(false);
                }
                y27 y27Var = ((c9) this.b).e;
                if (y27Var != null) {
                    y27Var.f(f27Var, z);
                    break;
                }
                break;
            default:
                ((cp) this.b).g(f27Var);
                break;
        }
    }

    @Override // li1
    public final void f0(boolean z) {
        ((vnc) this.b).setEditPillHidden(z);
    }

    @Override // je8
    public final void g0() {
        iv3 iv3Var = (iv3) this.b;
        iv3Var.M1 = null;
        iv3Var.F0();
    }

    @Override // ty9
    public final CharSequence getContentDescription() {
        j20 j20Var = (j20) this.b;
        return ob6.a0("AccDescrPlayerDuration", null, 2131754801, ob6.G(j20Var.w2 / 60, "Minutes", new Object[0]) + ' ' + ob6.G(j20Var.w2 % 60, "Seconds", new Object[0]), ob6.G(j20Var.x2 / 60, "Minutes", new Object[0]) + ' ' + ob6.G(j20Var.x2 % 60, "Seconds", new Object[0]));
    }

    @Override // je8
    public final long getDuration() {
        return 0L;
    }

    @Override // v30
    public final void h(boolean z) {
        lh2 lh2Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new xac((byte) 3, lh2Var, z));
        }
    }

    @Override // v30
    public final void h0(Exception exc) {
        efd.d("DecoderAudioRenderer", "Audio sink error", exc);
        lh2 lh2Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new k30(lh2Var, exc, (byte) 1));
        }
    }

    @Override // je8
    public final boolean i() {
        return false;
    }

    @Override // ty9
    public final int i0() {
        return 0;
    }

    @Override // tka
    public final int j0() {
        return ((z61) this.b).R;
    }

    @Override // je8
    public final long k() {
        return 0L;
    }

    @Override // i27
    public final void k0(f27 f27Var, j27 j27Var) {
        fd1 fd1Var = (fd1) this.b;
        Handler handler = fd1Var.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fd1Var.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (f27Var == ((ed1) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new dd1(this, i2 < arrayList.size() ? (ed1) arrayList.get(i2) : null, j27Var, f27Var), f27Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // v30
    public final void l0() {
        ((FfmpegAudioRenderer) this.b).b0 = true;
    }

    @Override // li1
    public final void m0(RectF rectF) {
        ((vnc) this.b).l(rectF);
    }

    @Override // v30
    public final void n(long j) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        ffmpegAudioRenderer.i0 = true;
        lh2 lh2Var = ffmpegAudioRenderer.K;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new kt((Object) lh2Var, j, (byte) 2));
        }
    }

    @Override // i89
    public final void n0(View view, boolean z) {
        if (z == ((ChatAttachAlertPhotoLayout) this.b).L && (view instanceof d88)) {
            d88 d88Var = (d88) view;
            d88Var.y.c(d88Var);
        }
    }

    @Override // ty9
    public final void o(boolean z, float f2) {
        if (z) {
            MediaController.z().k0(MediaController.z().v0, f2);
        }
        r47 r47Var = MediaController.z().v0;
        if (r47Var == null || !r47Var.I3()) {
            return;
        }
        ((j20) this.b).X0(r47Var, false);
    }

    @Override // h23
    public final void onResult(Object obj) {
        d13 d13Var = (d13) obj;
        d13Var.getClass();
        va1 va1Var = (va1) this.b;
        if (va1Var.r() instanceof sm7) {
            va1Var.resumeWith(d13Var);
        }
    }

    @Override // rv9
    public final void p(int i) {
        gx9 gx9Var = (gx9) this.b;
        gx9Var.E0--;
        gx9Var.f0 = i;
        if (gx9Var.g0 != i) {
            gx9Var.s.clear();
        }
        if (gx9Var.h0 != i) {
            gx9Var.J.clear();
        }
        gx9Var.O = true;
        dj3 dj3Var = gx9Var.V;
        if (dj3Var != null) {
            dj3Var.d(gx9Var.E0 > 0, true);
        }
        gx9Var.f();
        dj3 dj3Var2 = gx9Var.V;
        if (dj3Var2 != null) {
            dj3Var2.c();
        }
    }

    @Override // je8
    public final void p0() {
        ((iv3) this.b).G0();
    }

    @Override // je8
    public final int q() {
        return 0;
    }

    @Override // je8
    public final int q0() {
        return ((iv3) this.b).P1;
    }

    @Override // i89
    public final void r(boolean z) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
        chatAttachAlertPhotoLayout.M = z ? (byte) 1 : (byte) 0;
        chatAttachAlertPhotoLayout.F.f1(true);
    }

    @Override // je8
    public final float r0() {
        return 0.0f;
    }

    @Override // i89
    public final boolean s0(int i) {
        no6 M = ((ChatAttachAlertPhotoLayout) this.b).H.M(i);
        return M != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(M.C));
    }

    @Override // tka
    public final void t(boolean z) {
        fm0 fm0Var = ((z61) this.b).U;
        if (fm0Var == null || fm0Var.f == z) {
            return;
        }
        fm0Var.a(z, true);
    }

    @Override // v30
    public final void u(qf5 qf5Var) {
        lh2 lh2Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new n30(lh2Var, qf5Var, (byte) 0));
        }
    }

    @Override // je8
    public final boolean v() {
        return false;
    }

    @Override // i89
    public final boolean w(int i) {
        return ((ChatAttachAlertPhotoLayout) this.b).H.d(i) == 0;
    }

    @Override // li1
    public final View x0() {
        return (vnc) this.b;
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        switch (this.a) {
            case 2:
                b1 b1Var = (b1) this.b;
                b1Var.n1(i, i2, z);
                b1Var.dismiss();
                break;
            default:
                hl.d3(new zd((Object) this, i, (byte) 6), 50L);
                break;
        }
    }

    @Override // v78
    public final void y0() {
        try {
            Intent intent = new Intent();
            intent.setType("video/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
            Intent intent2 = new Intent("android.intent.action.PICK");
            intent2.setType("image/*");
            Intent createChooser = Intent.createChooser(intent2, null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            ((zu1) this.b).startActivityForResult(createChooser, 1);
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override // v30
    public final void z() {
        ((FfmpegAudioRenderer) this.b).h0 = true;
    }

    @Override // y27
    public final boolean z0(f27 f27Var) {
        switch (this.a) {
            case 3:
                c9 c9Var = (c9) this.b;
                if (f27Var != c9Var.c) {
                    j27 j27Var = ((zdb) f27Var).A;
                    y27 y27Var = c9Var.e;
                    if (y27Var != null) {
                        return y27Var.z0(f27Var);
                    }
                }
                return false;
            default:
                Window.Callback callback = ((cp) this.b).f.getCallback();
                if (callback == null) {
                    return true;
                }
                callback.onMenuOpened(jn7.s1, f27Var);
                return true;
        }
    }

    @Override // v30
    public final void D() {
    }

    @Override // a43
    public final void L0() {
    }

    @Override // je8
    public final void T() {
    }

    @Override // bv9
    public final void e() {
    }

    @Override // je8
    public final void j() {
    }

    @Override // v30
    public final void w0() {
    }

    @Override // ty9
    public final void x() {
    }

    @Override // a43
    public final void F0(boolean z) {
    }

    @Override // je8
    public final void G0(int i) {
    }

    @Override // je8
    public final void L(View view) {
    }

    @Override // je8
    public final void N(View view) {
    }

    @Override // je8
    public final void R(ne8 ne8Var) {
    }

    @Override // je8
    public final void V(float f2) {
    }

    @Override // bv9
    public final void a(float f2) {
    }

    @Override // jt1
    public final void c0(int i) {
    }

    @Override // je8
    public final void g(long j) {
    }

    @Override // je8
    public final void l(View view) {
    }

    @Override // v78
    public final void m(ArrayList arrayList) {
    }

    @Override // je8
    public final void o0(View view) {
    }

    @Override // a43
    public final void t0(boolean z) {
    }

    @Override // jt1
    public final void F(boolean z, boolean z2) {
    }

    @Override // je8
    public final void s(SurfaceTexture surfaceTexture, Bitmap bitmap) {
    }

    @Override // je8
    public final void u0(int i, ArrayList arrayList) {
    }

    public /* synthetic */ zm9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public zm9(al5 al5Var) {
        this.a = (byte) 9;
        xve.h(al5Var);
        this.b = al5Var;
    }

    public /* synthetic */ zm9(byte b, boolean z) {
        this.a = b;
    }

    @Override // je8
    public final void v0(Canvas canvas, int i, int i2) {
    }
}
