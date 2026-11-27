// default package

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class rab implements t59 {
    public final /* synthetic */ rbb a;

    public rab(rbb rbbVar) {
        this.a = rbbVar;
    }

    public final void a() {
        c8b a;
        rbb rbbVar = this.a;
        ArrayList<c8b> content = rbbVar.B0.getContent();
        int i = 0;
        if (content.size() == 1) {
            a = content.get(0);
            rbbVar.L1 = a;
        } else {
            a = c8b.a(rbbVar.B0.getLayout(), rbbVar.B0.getContent());
            rbbVar.L1 = a;
        }
        if (a != null && a.K) {
            i = 1;
        }
        rbbVar.P1 = i;
        oab oabVar = rbbVar.R0;
        if (oabVar != null) {
            oabVar.a(i);
        }
        y9b.a(rbbVar.c, rbbVar.L1);
        rbbVar.I(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        rbb rbbVar = this.a;
        wab wabVar = rbbVar.C0;
        if (wabVar == null || rbbVar.T1 || rbbVar.Q1 || !wabVar.isInited()) {
            return;
        }
        rbb rbbVar2 = this.a;
        if (rbbVar2.g0 == 0) {
            kg5 kg5Var = rbbVar2.n1;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
            if (this.a.p0() && (arrayList = this.a.v2) != null && !arrayList.isEmpty()) {
                rbb rbbVar3 = this.a;
                a.b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) rbbVar3.v2.get(rbbVar3.u2)).commit();
            }
            this.a.C0.switchCamera();
            uc7.e1().edit().putBoolean("stories_camera", this.a.C0.isFrontface()).apply();
            boolean p0 = this.a.p0();
            rk4 rk4Var = this.a.s;
            if (p0) {
                rk4Var.c(null);
            } else {
                rk4Var.d();
            }
        }
    }

    public final void c() {
        boolean z;
        boolean z2;
        rbb rbbVar = this.a;
        if (rbbVar.g0 != 0 || rbbVar.Q1 || rbbVar.R1) {
            return;
        }
        Activity activity = rbbVar.b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                z2 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
                if (z2) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, jn7.y1);
                }
            } else {
                z2 = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
                if (z2) {
                    activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, jn7.y1);
                }
            }
            z = !z2;
        } else {
            z = true;
        }
        if (z) {
            rbbVar.c(true);
        }
    }

    public final void d() {
        wab wabVar;
        rbb rbbVar = this.a;
        if (rbbVar.Q1 || rbbVar.T1 || rbbVar.g0 != 0 || (wabVar = rbbVar.C0) == null || !wabVar.isInited()) {
            return;
        }
        rbbVar.X0.f(true);
        File file = rbbVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            rbbVar.H1 = null;
        }
        oy8 oy8Var = rbbVar.D0;
        if (oy8Var != null) {
            oy8Var.f(true);
        }
        rbbVar.H1 = c8b.w(rbbVar.c, "jpg");
        rbbVar.Q1 = true;
        rbbVar.m();
        byte b = 0;
        rbbVar.d2 = false;
        if (rbbVar.C0.isFrontface() && rbbVar.u2 == 1) {
            rbbVar.n();
        }
        if (!rbbVar.p0()) {
            h(null);
            return;
        }
        rk4 rk4Var = rbbVar.s;
        sh9 sh9Var = new sh9(this, (byte) 18);
        rk4Var.h(rk4Var.p);
        rk4Var.e(1.0f, 320L, new mk4(rk4Var, sh9Var, b));
    }

    public final void e(boolean z) {
        rbb rbbVar = this.a;
        if (rbbVar.S1 || !rbbVar.R1) {
            return;
        }
        rbbVar.S1 = true;
        hl.d3(new pab(this, (byte) 0), z ? 0L : 400L);
    }

    public final void f(Runnable runnable, boolean z) {
        wab wabVar;
        rbb rbbVar = this.a;
        if (rbbVar.R1 || rbbVar.S1 || rbbVar.T1 || rbbVar.g0 != 0 || (wabVar = rbbVar.C0) == null || wabVar.getCameraSession() == null) {
            return;
        }
        kg5 kg5Var = rbbVar.m1;
        if (kg5Var != null) {
            kg5Var.f(true);
        }
        kg5 kg5Var2 = rbbVar.n1;
        if (kg5Var2 != null) {
            kg5Var2.f(true);
        }
        rbbVar.X0.f(true);
        rbbVar.R1 = true;
        oy8 oy8Var = rbbVar.D0;
        if (oy8Var != null) {
            oy8Var.f(true);
        }
        File file = rbbVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            rbbVar.H1 = null;
        }
        rbbVar.H1 = c8b.w(rbbVar.c, "mp4");
        rbbVar.m();
        rbbVar.d2 = false;
        if (rbbVar.C0.isFrontface() && rbbVar.u2 == 1) {
            rbbVar.n();
        }
        if (rbbVar.p0()) {
            rbbVar.s.c(new qab(this, z, runnable));
        } else {
            g(runnable, z);
        }
    }

    public final void g(Runnable runnable, boolean z) {
        rbb rbbVar = this.a;
        if (rbbVar.C0 != null) {
            CameraController.getInstance().recordVideo(rbbVar.C0.getCameraSessionObject(), rbbVar.H1, false, new hja(this, (byte) 20), new qab(this, runnable, z), rbbVar.C0, true);
            if (rbbVar.P1 != 1) {
                rbbVar.P1 = 1;
                rbbVar.J0.a(false, true);
                rbbVar.h0(rbbVar.P1 == 1, true);
                rbbVar.R0.a(rbbVar.P1);
                u59 u59Var = rbbVar.P0;
                boolean z2 = rbbVar.P1 == 1;
                u59Var.o0 = -1.0f;
                u59Var.p0 = z2;
                u59Var.invalidate();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(pcc pccVar) {
        boolean z;
        FileOutputStream fileOutputStream;
        rbb rbbVar = this.a;
        int i = rbbVar.c;
        byte b = 1;
        if (!rbbVar.p0()) {
            rbbVar.C0.startTakePictureAnimation(true);
        }
        if ((rbbVar.C0.isDual() && TextUtils.equals(rbbVar.C0.getCameraSession().getCurrentFlashMode(), "off")) || rbbVar.B0.i()) {
            if (!rbbVar.B0.i()) {
                rbbVar.C0.pauseAsTakingPicture();
            }
            Bitmap bitmap = rbbVar.C0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(rbbVar.H1.getAbsoluteFile());
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                } finally {
                }
            } catch (Exception e) {
                e = e;
                z = false;
            }
            try {
                fileOutputStream.close();
                z = true;
            } catch (Exception e2) {
                e = e2;
                z = true;
                cc4.g(e, true);
                bitmap.recycle();
                if (z) {
                }
            }
            bitmap.recycle();
        } else {
            z = false;
        }
        if (z) {
            oy8 oy8Var = rbbVar.D0;
            if (oy8Var != null) {
                oy8Var.f(true);
            }
            rbbVar.Q1 = CameraController.getInstance().takePicture(rbbVar.H1, true, rbbVar.C0.getCameraSessionObject(), new ku9(this, pccVar, (byte) 15));
            return;
        }
        rbbVar.Q1 = false;
        oy8 oy8Var2 = rbbVar.D0;
        if (oy8Var2 != null) {
            oy8Var2.f(false);
        }
        c8b m = c8b.m(rbbVar.H1, 0);
        m.J0 = rbbVar.w0;
        m.K0 = rbbVar.x0;
        if (!rbbVar.B0.i()) {
            rbbVar.L1 = m;
            y9b.a(i, m);
            rbbVar.M1 = false;
            if (pccVar != null) {
                pccVar.a(new pab(this, b));
                return;
            } else {
                rbbVar.I(1, true);
                return;
            }
        }
        rbbVar.H1 = null;
        if (rbbVar.B0.l(m)) {
            c8b a = c8b.a(rbbVar.B0.getLayout(), rbbVar.B0.getContent());
            rbbVar.L1 = a;
            y9b.a(i, a);
            rbbVar.M1 = false;
            if (pccVar != null) {
                pccVar.a(null);
            }
        } else if (pccVar != null) {
            pccVar.a(null);
        }
        rbbVar.l0(true);
    }
}
