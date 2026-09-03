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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class x8 implements o5 {
    public final /* synthetic */ ba a;

    public x8(ba baVar) {
        this.a = baVar;
    }

    public final void a() {
        ba baVar = this.a;
        ArrayList<r6> content = baVar.x0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            baVar.H1 = content.get(0);
        } else {
            baVar.H1 = r6.a(baVar.x0.getLayout(), baVar.x0.getContent());
        }
        r6 r6Var = baVar.H1;
        if (r6Var != null && r6Var.K) {
            i10 = 1;
        }
        baVar.L1 = i10;
        u8 u8Var = baVar.N0;
        if (u8Var != null) {
            u8Var.a(i10);
        }
        e8.a(baVar.c, baVar.H1);
        baVar.K(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        ba baVar = this.a;
        f9 f9Var = baVar.y0;
        if (f9Var == null || baVar.P1 || baVar.M1 || !f9Var.isInited()) {
            return;
        }
        ba baVar2 = this.a;
        if (baVar2.c0 != 0) {
            return;
        }
        e3 e3Var = baVar2.j1;
        if (e3Var != null) {
            e3Var.e(true);
        }
        if (this.a.q0() && (arrayList = this.a.r2) != null && !arrayList.isEmpty()) {
            ba baVar3 = this.a;
            ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) baVar3.r2.get(baVar3.q2)).commit();
        }
        this.a.y0.switchCamera();
        ba.a0(this.a.y0.isFrontface());
        if (this.a.q0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        f9 f9Var;
        ba baVar = this.a;
        if (baVar.M1 || baVar.P1 || baVar.c0 != 0 || (f9Var = baVar.y0) == null || !f9Var.isInited()) {
            return;
        }
        baVar.T0.e(true);
        File file = baVar.D1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            baVar.D1 = null;
        }
        m5 m5Var = baVar.z0;
        if (m5Var != null) {
            m5Var.c(true);
        }
        baVar.D1 = r6.w(baVar.c, "jpg");
        baVar.M1 = true;
        baVar.p();
        baVar.Z1 = false;
        if (baVar.y0.isFrontface() && baVar.q2 == 1) {
            ba.a(baVar);
        }
        if (!baVar.q0()) {
            g(null);
            return;
        }
        c2 c2Var = baVar.s;
        org.telegram.ui.web.d1 d1Var = new org.telegram.ui.web.d1(this, 12);
        c2Var.h(c2Var.p);
        c2Var.e(1.0f, 320L, new y1(c2Var, d1Var, 0));
    }

    public final void d(boolean z4) {
        ba baVar = this.a;
        if (baVar.O1 || !baVar.N1) {
            return;
        }
        baVar.O1 = true;
        AndroidUtilities.runOnUIThread(new v8(this, 0), z4 ? 0L : 400L);
    }

    public final void e(Runnable runnable, boolean z4) {
        f9 f9Var;
        ba baVar = this.a;
        if (baVar.N1 || baVar.O1 || baVar.P1 || baVar.c0 != 0 || (f9Var = baVar.y0) == null || f9Var.getCameraSession() == null) {
            return;
        }
        e3 e3Var = baVar.i1;
        if (e3Var != null) {
            e3Var.e(true);
        }
        e3 e3Var2 = baVar.j1;
        if (e3Var2 != null) {
            e3Var2.e(true);
        }
        baVar.T0.e(true);
        baVar.N1 = true;
        m5 m5Var = baVar.z0;
        if (m5Var != null) {
            m5Var.c(true);
        }
        File file = baVar.D1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            baVar.D1 = null;
        }
        baVar.D1 = r6.x(baVar.c, true);
        baVar.p();
        baVar.Z1 = false;
        if (baVar.y0.isFrontface() && baVar.q2 == 1) {
            ba.a(baVar);
        }
        if (baVar.q0()) {
            baVar.s.c(new w8(this, z4, runnable));
        } else {
            f(runnable, z4);
        }
    }

    public final void f(Runnable runnable, boolean z4) {
        ba baVar = this.a;
        if (baVar.y0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(baVar.y0.getCameraSessionObject(), baVar.D1, false, new mh.m5(this, 29), new w8(this, runnable, z4), baVar.y0, true);
        if (baVar.L1 != 1) {
            baVar.L1 = 1;
            baVar.F0.a(false, true);
            baVar.i0(baVar.L1 == 1, true);
            baVar.N0.a(baVar.L1);
            q5 q5Var = baVar.L0;
            boolean z10 = baVar.L1 == 1;
            q5Var.k0 = -1.0f;
            q5Var.l0 = z10;
            q5Var.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Utilities.Callback callback) {
        boolean z4;
        FileOutputStream fileOutputStream;
        ba baVar = this.a;
        int i10 = baVar.c;
        if (!baVar.q0()) {
            baVar.y0.startTakePictureAnimation(true);
        }
        if ((baVar.y0.isDual() && TextUtils.equals(baVar.y0.getCameraSession().getCurrentFlashMode(), "off")) || baVar.x0.j()) {
            if (!baVar.x0.j()) {
                baVar.y0.pauseAsTakingPicture();
            }
            Bitmap bitmap = baVar.y0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(baVar.D1.getAbsoluteFile());
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
            m5 m5Var = baVar.z0;
            if (m5Var != null) {
                m5Var.c(true);
            }
            baVar.M1 = CameraController.getInstance().takePicture(baVar.D1, true, baVar.y0.getCameraSessionObject(), new org.telegram.ui.web.a2(7, this, callback));
            return;
        }
        baVar.M1 = false;
        m5 m5Var2 = baVar.z0;
        if (m5Var2 != null) {
            m5Var2.c(false);
        }
        r6 m9 = r6.m(0, baVar.D1);
        m9.J0 = baVar.s0;
        m9.K0 = baVar.t0;
        if (!baVar.x0.j()) {
            baVar.H1 = m9;
            e8.a(i10, m9);
            baVar.I1 = false;
            if (callback != null) {
                callback.run(new v8(this, 1));
                return;
            } else {
                baVar.K(1, true);
                return;
            }
        }
        baVar.D1 = null;
        if (baVar.x0.l(m9)) {
            r6 a2 = r6.a(baVar.x0.getLayout(), baVar.x0.getContent());
            baVar.H1 = a2;
            e8.a(i10, a2);
            baVar.I1 = false;
            if (callback != null) {
                callback.run(null);
            }
        } else if (callback != null) {
            callback.run(null);
        }
        baVar.m0(true);
    }
}
