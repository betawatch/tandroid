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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class sab implements t59 {
    public final /* synthetic */ sbb a;

    public sab(sbb sbbVar) {
        this.a = sbbVar;
    }

    public final void a() {
        c8b a;
        sbb sbbVar = this.a;
        ArrayList<c8b> content = sbbVar.B0.getContent();
        int i = 0;
        if (content.size() == 1) {
            a = content.get(0);
            sbbVar.L1 = a;
        } else {
            a = c8b.a(sbbVar.B0.getLayout(), sbbVar.B0.getContent());
            sbbVar.L1 = a;
        }
        if (a != null && a.K) {
            i = 1;
        }
        sbbVar.P1 = i;
        pab pabVar = sbbVar.R0;
        if (pabVar != null) {
            pabVar.a(i);
        }
        y9b.a(sbbVar.c, sbbVar.L1);
        sbbVar.I(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        sbb sbbVar = this.a;
        xab xabVar = sbbVar.C0;
        if (xabVar == null || sbbVar.T1 || sbbVar.Q1 || !xabVar.isInited()) {
            return;
        }
        sbb sbbVar2 = this.a;
        if (sbbVar2.g0 == 0) {
            kg5 kg5Var = sbbVar2.n1;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
            if (this.a.p0() && (arrayList = this.a.v2) != null && !arrayList.isEmpty()) {
                sbb sbbVar3 = this.a;
                a.b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) sbbVar3.v2.get(sbbVar3.u2)).commit();
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
        sbb sbbVar = this.a;
        if (sbbVar.g0 != 0 || sbbVar.Q1 || sbbVar.R1) {
            return;
        }
        Activity activity = sbbVar.b;
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
            sbbVar.c(true);
        }
    }

    public final void d() {
        xab xabVar;
        sbb sbbVar = this.a;
        if (sbbVar.Q1 || sbbVar.T1 || sbbVar.g0 != 0 || (xabVar = sbbVar.C0) == null || !xabVar.isInited()) {
            return;
        }
        sbbVar.X0.f(true);
        File file = sbbVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            sbbVar.H1 = null;
        }
        oy8 oy8Var = sbbVar.D0;
        if (oy8Var != null) {
            oy8Var.f(true);
        }
        sbbVar.H1 = c8b.w(sbbVar.c, "jpg");
        sbbVar.Q1 = true;
        sbbVar.m();
        byte b = 0;
        sbbVar.d2 = false;
        if (sbbVar.C0.isFrontface() && sbbVar.u2 == 1) {
            sbbVar.n();
        }
        if (!sbbVar.p0()) {
            h(null);
            return;
        }
        rk4 rk4Var = sbbVar.s;
        sh9 sh9Var = new sh9(this, (byte) 18);
        rk4Var.h(rk4Var.p);
        rk4Var.e(1.0f, 320L, new mk4(rk4Var, sh9Var, b));
    }

    public final void e(boolean z) {
        sbb sbbVar = this.a;
        if (sbbVar.S1 || !sbbVar.R1) {
            return;
        }
        sbbVar.S1 = true;
        hl.d3(new qab(this, (byte) 0), z ? 0L : 400L);
    }

    public final void f(Runnable runnable, boolean z) {
        xab xabVar;
        sbb sbbVar = this.a;
        if (sbbVar.R1 || sbbVar.S1 || sbbVar.T1 || sbbVar.g0 != 0 || (xabVar = sbbVar.C0) == null || xabVar.getCameraSession() == null) {
            return;
        }
        kg5 kg5Var = sbbVar.m1;
        if (kg5Var != null) {
            kg5Var.f(true);
        }
        kg5 kg5Var2 = sbbVar.n1;
        if (kg5Var2 != null) {
            kg5Var2.f(true);
        }
        sbbVar.X0.f(true);
        sbbVar.R1 = true;
        oy8 oy8Var = sbbVar.D0;
        if (oy8Var != null) {
            oy8Var.f(true);
        }
        File file = sbbVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            sbbVar.H1 = null;
        }
        sbbVar.H1 = c8b.w(sbbVar.c, "mp4");
        sbbVar.m();
        sbbVar.d2 = false;
        if (sbbVar.C0.isFrontface() && sbbVar.u2 == 1) {
            sbbVar.n();
        }
        if (sbbVar.p0()) {
            sbbVar.s.c(new rab(this, z, runnable));
        } else {
            g(runnable, z);
        }
    }

    public final void g(Runnable runnable, boolean z) {
        sbb sbbVar = this.a;
        if (sbbVar.C0 != null) {
            CameraController.getInstance().recordVideo(sbbVar.C0.getCameraSessionObject(), sbbVar.H1, false, new hja(this, (byte) 20), new rab(this, runnable, z), sbbVar.C0, true);
            if (sbbVar.P1 != 1) {
                sbbVar.P1 = 1;
                sbbVar.J0.a(false, true);
                sbbVar.h0(sbbVar.P1 == 1, true);
                sbbVar.R0.a(sbbVar.P1);
                u59 u59Var = sbbVar.P0;
                boolean z2 = sbbVar.P1 == 1;
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
        sbb sbbVar = this.a;
        int i = sbbVar.c;
        byte b = 1;
        if (!sbbVar.p0()) {
            sbbVar.C0.startTakePictureAnimation(true);
        }
        if ((sbbVar.C0.isDual() && TextUtils.equals(sbbVar.C0.getCameraSession().getCurrentFlashMode(), "off")) || sbbVar.B0.i()) {
            if (!sbbVar.B0.i()) {
                sbbVar.C0.pauseAsTakingPicture();
            }
            Bitmap bitmap = sbbVar.C0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(sbbVar.H1.getAbsoluteFile());
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
            oy8 oy8Var = sbbVar.D0;
            if (oy8Var != null) {
                oy8Var.f(true);
            }
            sbbVar.Q1 = CameraController.getInstance().takePicture(sbbVar.H1, true, sbbVar.C0.getCameraSessionObject(), new ku9(this, pccVar, (byte) 15));
            return;
        }
        sbbVar.Q1 = false;
        oy8 oy8Var2 = sbbVar.D0;
        if (oy8Var2 != null) {
            oy8Var2.f(false);
        }
        c8b m = c8b.m(sbbVar.H1, 0);
        m.J0 = sbbVar.w0;
        m.K0 = sbbVar.x0;
        if (!sbbVar.B0.i()) {
            sbbVar.L1 = m;
            y9b.a(i, m);
            sbbVar.M1 = false;
            if (pccVar != null) {
                pccVar.a(new qab(this, b));
                return;
            } else {
                sbbVar.I(1, true);
                return;
            }
        }
        sbbVar.H1 = null;
        if (sbbVar.B0.l(m)) {
            c8b a = c8b.a(sbbVar.B0.getLayout(), sbbVar.B0.getContent());
            sbbVar.L1 = a;
            y9b.a(i, a);
            sbbVar.M1 = false;
            if (pccVar != null) {
                pccVar.a(null);
            }
        } else if (pccVar != null) {
            pccVar.a(null);
        }
        sbbVar.l0(true);
    }
}
