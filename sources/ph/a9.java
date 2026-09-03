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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class a9 implements q5 {
    public final /* synthetic */ da a;

    public a9(da daVar) {
        this.a = daVar;
    }

    public final void a() {
        da daVar = this.a;
        ArrayList<t6> content = daVar.x0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            daVar.H1 = content.get(0);
        } else {
            daVar.H1 = t6.a(daVar.x0.getLayout(), daVar.x0.getContent());
        }
        t6 t6Var = daVar.H1;
        if (t6Var != null && t6Var.K) {
            i10 = 1;
        }
        daVar.L1 = i10;
        w8 w8Var = daVar.N0;
        if (w8Var != null) {
            w8Var.a(i10);
        }
        f8.a(daVar.c, daVar.H1);
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
        o5 o5Var = daVar.z0;
        if (o5Var != null) {
            o5Var.c(true);
        }
        daVar.D1 = t6.w(daVar.c, "jpg");
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
        org.telegram.ui.web.a1 a1Var = new org.telegram.ui.web.a1(this, 12);
        d2Var.h(d2Var.p);
        d2Var.e(1.0f, 320L, new z1(d2Var, a1Var, 0));
    }

    public final void d(boolean z4) {
        da daVar = this.a;
        if (daVar.O1 || !daVar.N1) {
            return;
        }
        daVar.O1 = true;
        AndroidUtilities.runOnUIThread(new x8(this, 0), z4 ? 0L : 400L);
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
        o5 o5Var = daVar.z0;
        if (o5Var != null) {
            o5Var.c(true);
        }
        File file = daVar.D1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            daVar.D1 = null;
        }
        daVar.D1 = t6.x(daVar.c, true);
        daVar.p();
        daVar.Z1 = false;
        if (daVar.y0.isFrontface() && daVar.q2 == 1) {
            da.a(daVar);
        }
        if (daVar.q0()) {
            daVar.s.c(new y8(this, z4, runnable));
        } else {
            f(runnable, z4);
        }
    }

    public final void f(Runnable runnable, boolean z4) {
        da daVar = this.a;
        if (daVar.y0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(daVar.y0.getCameraSessionObject(), daVar.D1, false, new z8(this, 0), new y8(this, runnable, z4), daVar.y0, true);
        if (daVar.L1 != 1) {
            daVar.L1 = 1;
            daVar.F0.a(false, true);
            daVar.i0(daVar.L1 == 1, true);
            daVar.N0.a(daVar.L1);
            s5 s5Var = daVar.L0;
            boolean z10 = daVar.L1 == 1;
            s5Var.k0 = -1.0f;
            s5Var.l0 = z10;
            s5Var.invalidate();
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
            o5 o5Var = daVar.z0;
            if (o5Var != null) {
                o5Var.c(true);
            }
            daVar.M1 = CameraController.getInstance().takePicture(daVar.D1, true, daVar.y0.getCameraSessionObject(), new s1(6, this, callback));
            return;
        }
        daVar.M1 = false;
        o5 o5Var2 = daVar.z0;
        if (o5Var2 != null) {
            o5Var2.c(false);
        }
        t6 m9 = t6.m(0, daVar.D1);
        m9.J0 = daVar.s0;
        m9.K0 = daVar.t0;
        if (!daVar.x0.j()) {
            daVar.H1 = m9;
            f8.a(i10, m9);
            daVar.I1 = false;
            if (callback != null) {
                callback.run(new x8(this, 1));
                return;
            } else {
                daVar.K(1, true);
                return;
            }
        }
        daVar.D1 = null;
        if (daVar.x0.l(m9)) {
            t6 a2 = t6.a(daVar.x0.getLayout(), daVar.x0.getContent());
            daVar.H1 = a2;
            f8.a(i10, a2);
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
