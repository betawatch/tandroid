package ph;

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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class a9 implements r5 {
    public final /* synthetic */ da a;

    public a9(da daVar) {
        this.a = daVar;
    }

    public final void a() {
        da daVar = this.a;
        ArrayList<u6> content = daVar.x0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            daVar.H1 = content.get(0);
        } else {
            daVar.H1 = u6.a(daVar.x0.getLayout(), daVar.x0.getContent());
        }
        u6 u6Var = daVar.H1;
        if (u6Var != null && u6Var.K) {
            i10 = 1;
        }
        daVar.L1 = i10;
        x8 x8Var = daVar.N0;
        if (x8Var != null) {
            x8Var.a(i10);
        }
        g8.a(daVar.c, daVar.H1);
        daVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        da daVar = this.a;
        i9 i9Var = daVar.y0;
        if (i9Var == null || daVar.P1 || daVar.M1 || !i9Var.isInited()) {
            return;
        }
        da daVar2 = this.a;
        if (daVar2.c0 != 0) {
            return;
        }
        f3 f3Var = daVar2.j1;
        if (f3Var != null) {
            f3Var.e(true);
        }
        if (this.a.q0() && (arrayList = this.a.r2) != null && !arrayList.isEmpty()) {
            da daVar3 = this.a;
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) daVar3.r2.get(daVar3.q2)).commit();
        }
        this.a.y0.switchCamera();
        da.a0(this.a.y0.isFrontface());
        if (this.a.q0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        i9 i9Var;
        da daVar = this.a;
        if (daVar.M1 || daVar.P1 || daVar.c0 != 0 || (i9Var = daVar.y0) == null || !i9Var.isInited()) {
            return;
        }
        daVar.T0.e(true);
        File file = daVar.D1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            daVar.D1 = null;
        }
        p5 p5Var = daVar.z0;
        if (p5Var != null) {
            p5Var.c(true);
        }
        daVar.D1 = u6.w(daVar.c, "jpg");
        daVar.M1 = true;
        daVar.p();
        daVar.Z1 = false;
        if (daVar.y0.isFrontface() && daVar.q2 == 1) {
            da.a(daVar);
        }
        if (!daVar.q0()) {
            g(null);
            return;
        }
        d2 d2Var = daVar.s;
        org.telegram.ui.web.y0 y0Var = new org.telegram.ui.web.y0(this, 12);
        d2Var.h(d2Var.p);
        d2Var.e(1.0f, 320L, new z1(d2Var, y0Var, 0));
    }

    public final void d(boolean z4) {
        da daVar = this.a;
        if (daVar.O1 || !daVar.N1) {
            return;
        }
        daVar.O1 = true;
        AndroidUtilities.runOnUIThread(new y8(this, 0), z4 ? 0L : 400L);
    }

    public final void e(Runnable runnable, boolean z4) {
        i9 i9Var;
        da daVar = this.a;
        if (daVar.N1 || daVar.O1 || daVar.P1 || daVar.c0 != 0 || (i9Var = daVar.y0) == null || i9Var.getCameraSession() == null) {
            return;
        }
        f3 f3Var = daVar.i1;
        if (f3Var != null) {
            f3Var.e(true);
        }
        f3 f3Var2 = daVar.j1;
        if (f3Var2 != null) {
            f3Var2.e(true);
        }
        daVar.T0.e(true);
        daVar.N1 = true;
        p5 p5Var = daVar.z0;
        if (p5Var != null) {
            p5Var.c(true);
        }
        File file = daVar.D1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            daVar.D1 = null;
        }
        daVar.D1 = u6.x(daVar.c, true);
        daVar.p();
        daVar.Z1 = false;
        if (daVar.y0.isFrontface() && daVar.q2 == 1) {
            da.a(daVar);
        }
        if (daVar.q0()) {
            daVar.s.c(new z8(this, z4, runnable));
        } else {
            f(runnable, z4);
        }
    }

    public final void f(Runnable runnable, boolean z4) {
        da daVar = this.a;
        if (daVar.y0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(daVar.y0.getCameraSessionObject(), daVar.D1, false, new lh.m5(this, 28), new z8(this, runnable, z4), daVar.y0, true);
        if (daVar.L1 != 1) {
            daVar.L1 = 1;
            daVar.F0.a(false, true);
            daVar.i0(daVar.L1 == 1, true);
            daVar.N0.a(daVar.L1);
            t5 t5Var = daVar.L0;
            boolean z10 = daVar.L1 == 1;
            t5Var.k0 = -1.0f;
            t5Var.l0 = z10;
            t5Var.invalidate();
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
        da daVar = this.a;
        int i10 = daVar.c;
        if (!daVar.q0()) {
            daVar.y0.startTakePictureAnimation(true);
        }
        if ((daVar.y0.isDual() && TextUtils.equals(daVar.y0.getCameraSession().getCurrentFlashMode(), "off")) || daVar.x0.j()) {
            if (!daVar.x0.j()) {
                daVar.y0.pauseAsTakingPicture();
            }
            Bitmap bitmap = daVar.y0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(daVar.D1.getAbsoluteFile());
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                } finally {
                }
            } catch (Exception e) {
                e = e;
                z4 = false;
            }
            try {
                fileOutputStream.close();
                z4 = true;
            } catch (Exception e6) {
                e = e6;
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
            p5 p5Var = daVar.z0;
            if (p5Var != null) {
                p5Var.c(true);
            }
            daVar.M1 = CameraController.getInstance().takePicture(daVar.D1, true, daVar.y0.getCameraSessionObject(), new org.telegram.ui.web.u1(8, this, callback));
            return;
        }
        daVar.M1 = false;
        p5 p5Var2 = daVar.z0;
        if (p5Var2 != null) {
            p5Var2.c(false);
        }
        u6 m9 = u6.m(0, daVar.D1);
        m9.J0 = daVar.s0;
        m9.K0 = daVar.t0;
        if (!daVar.x0.j()) {
            daVar.H1 = m9;
            g8.a(i10, m9);
            daVar.I1 = false;
            if (callback != null) {
                callback.run(new y8(this, 1));
                return;
            } else {
                daVar.K(1, true);
                return;
            }
        }
        daVar.D1 = null;
        if (daVar.x0.l(m9)) {
            u6 a2 = u6.a(daVar.x0.getLayout(), daVar.x0.getContent());
            daVar.H1 = a2;
            g8.a(i10, a2);
            daVar.I1 = false;
            if (callback != null) {
                callback.run(null);
            }
        } else if (callback != null) {
            callback.run(null);
        }
        daVar.m0(true);
    }
}
