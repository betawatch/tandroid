package qh;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class y8 implements p5 {
    public final /* synthetic */ ca a;

    public y8(ca caVar) {
        this.a = caVar;
    }

    public final void a() {
        ca caVar = this.a;
        ArrayList<s6> content = caVar.x0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            caVar.H1 = content.get(0);
        } else {
            caVar.H1 = s6.a(caVar.x0.getLayout(), caVar.x0.getContent());
        }
        s6 s6Var = caVar.H1;
        if (s6Var != null && s6Var.K) {
            i10 = 1;
        }
        caVar.L1 = i10;
        v8 v8Var = caVar.N0;
        if (v8Var != null) {
            v8Var.a(i10);
        }
        f8.a(caVar.c, caVar.H1);
        caVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        ca caVar = this.a;
        g9 g9Var = caVar.y0;
        if (g9Var == null || caVar.P1 || caVar.M1 || !g9Var.isInited()) {
            return;
        }
        ca caVar2 = this.a;
        if (caVar2.c0 != 0) {
            return;
        }
        f3 f3Var = caVar2.j1;
        if (f3Var != null) {
            f3Var.e(true);
        }
        if (this.a.q0() && (arrayList = this.a.r2) != null && !arrayList.isEmpty()) {
            ca caVar3 = this.a;
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) caVar3.r2.get(caVar3.q2)).commit();
        }
        this.a.y0.switchCamera();
        ca.a0(this.a.y0.isFrontface());
        if (this.a.q0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        g9 g9Var;
        ca caVar = this.a;
        if (caVar.M1 || caVar.P1 || caVar.c0 != 0 || (g9Var = caVar.y0) == null || !g9Var.isInited()) {
            return;
        }
        caVar.T0.e(true);
        File file = caVar.D1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            caVar.D1 = null;
        }
        n5 n5Var = caVar.z0;
        if (n5Var != null) {
            n5Var.c(true);
        }
        caVar.D1 = s6.w(caVar.c, "jpg");
        caVar.M1 = true;
        caVar.p();
        caVar.Z1 = false;
        if (caVar.y0.isFrontface() && caVar.q2 == 1) {
            ca.a(caVar);
        }
        if (!caVar.q0()) {
            g(null);
            return;
        }
        d2 d2Var = caVar.s;
        org.telegram.ui.web.d1 d1Var = new org.telegram.ui.web.d1(this, 12);
        d2Var.h(d2Var.p);
        d2Var.e(1.0f, 320L, new z1(d2Var, d1Var, 0));
    }

    public final void d(boolean z4) {
        ca caVar = this.a;
        if (caVar.O1 || !caVar.N1) {
            return;
        }
        caVar.O1 = true;
        AndroidUtilities.runOnUIThread(new w8(this, 0), z4 ? 0L : 400L);
    }

    public final void e(Runnable runnable, boolean z4) {
        g9 g9Var;
        ca caVar = this.a;
        if (caVar.N1 || caVar.O1 || caVar.P1 || caVar.c0 != 0 || (g9Var = caVar.y0) == null || g9Var.getCameraSession() == null) {
            return;
        }
        f3 f3Var = caVar.i1;
        if (f3Var != null) {
            f3Var.e(true);
        }
        f3 f3Var2 = caVar.j1;
        if (f3Var2 != null) {
            f3Var2.e(true);
        }
        caVar.T0.e(true);
        caVar.N1 = true;
        n5 n5Var = caVar.z0;
        if (n5Var != null) {
            n5Var.c(true);
        }
        File file = caVar.D1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            caVar.D1 = null;
        }
        caVar.D1 = s6.x(caVar.c, true);
        caVar.p();
        caVar.Z1 = false;
        if (caVar.y0.isFrontface() && caVar.q2 == 1) {
            ca.a(caVar);
        }
        if (caVar.q0()) {
            caVar.s.c(new x8(this, z4, runnable));
        } else {
            f(runnable, z4);
        }
    }

    public final void f(Runnable runnable, boolean z4) {
        ca caVar = this.a;
        if (caVar.y0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(caVar.y0.getCameraSessionObject(), caVar.D1, false, new mh.m5(this, 29), new x8(this, runnable, z4), caVar.y0, true);
        if (caVar.L1 != 1) {
            caVar.L1 = 1;
            caVar.F0.a(false, true);
            caVar.i0(caVar.L1 == 1, true);
            caVar.N0.a(caVar.L1);
            r5 r5Var = caVar.L0;
            boolean z10 = caVar.L1 == 1;
            r5Var.k0 = -1.0f;
            r5Var.l0 = z10;
            r5Var.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Utilities.Callback callback) {
        boolean z4;
        FileOutputStream fileOutputStream;
        ca caVar = this.a;
        int i10 = caVar.c;
        if (!caVar.q0()) {
            caVar.y0.startTakePictureAnimation(true);
        }
        if ((caVar.y0.isDual() && TextUtils.equals(caVar.y0.getCameraSession().getCurrentFlashMode(), "off")) || caVar.x0.j()) {
            if (!caVar.x0.j()) {
                caVar.y0.pauseAsTakingPicture();
            }
            Bitmap bitmap = caVar.y0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(caVar.D1.getAbsoluteFile());
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                } finally {
                }
            } catch (Exception e6) {
                e = e6;
                z4 = false;
            }
            try {
                fileOutputStream.close();
                z4 = true;
            } catch (Exception e10) {
                e = e10;
                z4 = true;
                FileLog.e(e);
                bitmap.recycle();
                if (z4) {
                }
            }
            bitmap.recycle();
        } else {
            z4 = false;
        }
        if (z4) {
            n5 n5Var = caVar.z0;
            if (n5Var != null) {
                n5Var.c(true);
            }
            caVar.M1 = CameraController.getInstance().takePicture(caVar.D1, true, caVar.y0.getCameraSessionObject(), new org.telegram.ui.web.v1(8, this, callback));
            return;
        }
        caVar.M1 = false;
        n5 n5Var2 = caVar.z0;
        if (n5Var2 != null) {
            n5Var2.c(false);
        }
        s6 m9 = s6.m(0, caVar.D1);
        m9.J0 = caVar.s0;
        m9.K0 = caVar.t0;
        if (!caVar.x0.j()) {
            caVar.H1 = m9;
            f8.a(i10, m9);
            caVar.I1 = false;
            if (callback != null) {
                callback.run(new w8(this, 1));
                return;
            } else {
                caVar.K(1, true);
                return;
            }
        }
        caVar.D1 = null;
        if (caVar.x0.l(m9)) {
            s6 a2 = s6.a(caVar.x0.getLayout(), caVar.x0.getContent());
            caVar.H1 = a2;
            f8.a(i10, a2);
            caVar.I1 = false;
            if (callback != null) {
                callback.run(null);
            }
        } else if (callback != null) {
            callback.run(null);
        }
        caVar.m0(true);
    }
}
