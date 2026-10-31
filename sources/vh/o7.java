package vh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.q20;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o7 implements q4 {
    public final /* synthetic */ o8 a;

    public o7(o8 o8Var) {
        this.a = o8Var;
    }

    public final void a() {
        o8 o8Var = this.a;
        ArrayList<n5> content = o8Var.A0.getContent();
        int i10 = 0;
        if (content.size() == 1) {
            o8Var.K1 = content.get(0);
        } else {
            o8Var.K1 = n5.a(o8Var.A0.getLayout(), o8Var.A0.getContent());
        }
        n5 n5Var = o8Var.K1;
        if (n5Var != null && n5Var.K) {
            i10 = 1;
        }
        o8Var.O1 = i10;
        l7 l7Var = o8Var.Q0;
        if (l7Var != null) {
            l7Var.a(i10);
        }
        x6.a(o8Var.c, o8Var.K1);
        o8Var.J(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        o8 o8Var = this.a;
        t7 t7Var = o8Var.B0;
        if (t7Var == null || o8Var.S1 || o8Var.P1 || !t7Var.isInited()) {
            return;
        }
        o8 o8Var2 = this.a;
        if (o8Var2.f0 != 0) {
            return;
        }
        p2 p2Var = o8Var2.m1;
        if (p2Var != null) {
            p2Var.e(true);
        }
        if (this.a.p0() && (arrayList = this.a.u2) != null && !arrayList.isEmpty()) {
            o8 o8Var3 = this.a;
            org.telegram.messenger.w0.b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) o8Var3.u2.get(o8Var3.t2)).commit();
        }
        this.a.B0.switchCamera();
        o8.Z(this.a.B0.isFrontface());
        if (this.a.p0()) {
            this.a.s.c(null);
        } else {
            this.a.s.d();
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        o8 o8Var = this.a;
        if (o8Var.f0 != 0 || o8Var.P1 || o8Var.Q1) {
            return;
        }
        Activity activity = o8Var.b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                z11 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
                if (z11) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, zs.z1);
                }
            } else {
                z11 = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
                if (z11) {
                    activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, zs.z1);
                }
            }
            z10 = !z11;
        } else {
            z10 = true;
        }
        if (z10) {
            o8Var.e(true);
        }
    }

    public final void d() {
        t7 t7Var;
        o8 o8Var = this.a;
        if (o8Var.P1 || o8Var.S1 || o8Var.f0 != 0 || (t7Var = o8Var.B0) == null || !t7Var.isInited()) {
            return;
        }
        o8Var.W0.e(true);
        File file = o8Var.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            o8Var.G1 = null;
        }
        o4 o4Var = o8Var.C0;
        if (o4Var != null) {
            o4Var.c(true);
        }
        o8Var.G1 = n5.w(o8Var.c, "jpg");
        o8Var.P1 = true;
        o8Var.o();
        o8Var.c2 = false;
        if (o8Var.B0.isFrontface() && o8Var.t2 == 1) {
            o8.a(o8Var);
        }
        if (!o8Var.p0()) {
            h(null);
            return;
        }
        z1 z1Var = o8Var.s;
        m6 m6Var = new m6(this, 1);
        z1Var.h(z1Var.p);
        z1Var.e(1.0f, 320L, new v1(z1Var, m6Var, 0));
    }

    public final void e(boolean z10) {
        o8 o8Var = this.a;
        if (o8Var.R1 || !o8Var.Q1) {
            return;
        }
        o8Var.R1 = true;
        org.telegram.messenger.i0.h3(new m7(this, 0), z10 ? 0L : 400L);
    }

    public final void f(Runnable runnable, boolean z10) {
        t7 t7Var;
        o8 o8Var = this.a;
        if (o8Var.Q1 || o8Var.R1 || o8Var.S1 || o8Var.f0 != 0 || (t7Var = o8Var.B0) == null || t7Var.getCameraSession() == null) {
            return;
        }
        p2 p2Var = o8Var.l1;
        if (p2Var != null) {
            p2Var.e(true);
        }
        p2 p2Var2 = o8Var.m1;
        if (p2Var2 != null) {
            p2Var2.e(true);
        }
        o8Var.W0.e(true);
        o8Var.Q1 = true;
        o4 o4Var = o8Var.C0;
        if (o4Var != null) {
            o4Var.c(true);
        }
        File file = o8Var.G1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            o8Var.G1 = null;
        }
        o8Var.G1 = n5.x(o8Var.c, true);
        o8Var.o();
        o8Var.c2 = false;
        if (o8Var.B0.isFrontface() && o8Var.t2 == 1) {
            o8.a(o8Var);
        }
        if (o8Var.p0()) {
            o8Var.s.c(new n7(this, z10, runnable));
        } else {
            g(runnable, z10);
        }
    }

    public final void g(Runnable runnable, boolean z10) {
        o8 o8Var = this.a;
        if (o8Var.B0 == null) {
            return;
        }
        CameraController.getInstance().recordVideo(o8Var.B0.getCameraSessionObject(), o8Var.G1, false, new rh.d0(this, 29), new n7(this, runnable, z10), o8Var.B0, true);
        if (o8Var.O1 != 1) {
            o8Var.O1 = 1;
            o8Var.I0.a(false, true);
            o8Var.h0(o8Var.O1 == 1, true);
            o8Var.Q0.a(o8Var.O1);
            r4 r4Var = o8Var.O0;
            boolean z11 = o8Var.O1 == 1;
            r4Var.n0 = -1.0f;
            r4Var.o0 = z11;
            r4Var.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(q20 q20Var) {
        boolean z10;
        FileOutputStream fileOutputStream;
        o8 o8Var = this.a;
        int i10 = o8Var.c;
        if (!o8Var.p0()) {
            o8Var.B0.startTakePictureAnimation(true);
        }
        if ((o8Var.B0.isDual() && TextUtils.equals(o8Var.B0.getCameraSession().getCurrentFlashMode(), "off")) || o8Var.A0.j()) {
            if (!o8Var.A0.j()) {
                o8Var.B0.pauseAsTakingPicture();
            }
            Bitmap bitmap = o8Var.B0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(o8Var.G1.getAbsoluteFile());
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                } finally {
                }
            } catch (Exception e) {
                e = e;
                z10 = false;
            }
            try {
                fileOutputStream.close();
                z10 = true;
            } catch (Exception e7) {
                e = e7;
                z10 = true;
                org.telegram.messenger.f8.g(e, true);
                bitmap.recycle();
                if (z10) {
                }
            }
            bitmap.recycle();
        } else {
            z10 = false;
        }
        if (z10) {
            o4 o4Var = o8Var.C0;
            if (o4Var != null) {
                o4Var.c(true);
            }
            o8Var.P1 = CameraController.getInstance().takePicture(o8Var.G1, true, o8Var.B0.getCameraSessionObject(), new rh.e3(9, this, q20Var));
            return;
        }
        o8Var.P1 = false;
        o4 o4Var2 = o8Var.C0;
        if (o4Var2 != null) {
            o4Var2.c(false);
        }
        n5 m10 = n5.m(o8Var.G1, 0);
        m10.J0 = o8Var.v0;
        m10.K0 = o8Var.w0;
        if (!o8Var.A0.j()) {
            o8Var.K1 = m10;
            x6.a(i10, m10);
            o8Var.L1 = false;
            if (q20Var != null) {
                q20Var.a(new m7(this, 1));
                return;
            } else {
                o8Var.J(1, true);
                return;
            }
        }
        o8Var.G1 = null;
        if (o8Var.A0.l(m10)) {
            n5 a2 = n5.a(o8Var.A0.getLayout(), o8Var.A0.getContent());
            o8Var.K1 = a2;
            x6.a(i10, a2);
            o8Var.L1 = false;
            if (q20Var != null) {
                q20Var.a(null);
            }
        } else if (q20Var != null) {
            q20Var.a(null);
        }
        o8Var.l0(true);
    }
}
