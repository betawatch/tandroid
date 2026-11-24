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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class t6b implements e29 {
    public final /* synthetic */ t7b a;

    public t6b(t7b t7bVar) {
        this.a = t7bVar;
    }

    public final void a() {
        f4b a;
        t7b t7bVar = this.a;
        ArrayList<f4b> content = t7bVar.B0.getContent();
        int i = 0;
        if (content.size() == 1) {
            a = content.get(0);
            t7bVar.L1 = a;
        } else {
            a = f4b.a(t7bVar.B0.getLayout(), t7bVar.B0.getContent());
            t7bVar.L1 = a;
        }
        if (a != null && a.K) {
            i = 1;
        }
        t7bVar.P1 = i;
        q6b q6bVar = t7bVar.R0;
        if (q6bVar != null) {
            q6bVar.a(i);
        }
        a6b.a(t7bVar.c, t7bVar.L1);
        t7bVar.I(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        t7b t7bVar = this.a;
        y6b y6bVar = t7bVar.C0;
        if (y6bVar == null || t7bVar.T1 || t7bVar.Q1 || !y6bVar.isInited()) {
            return;
        }
        t7b t7bVar2 = this.a;
        if (t7bVar2.g0 == 0) {
            je5 je5Var = t7bVar2.n1;
            if (je5Var != null) {
                je5Var.f(true);
            }
            if (this.a.p0() && (arrayList = this.a.v2) != null && !arrayList.isEmpty()) {
                t7b t7bVar3 = this.a;
                a.b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) t7bVar3.v2.get(t7bVar3.u2)).commit();
            }
            this.a.C0.switchCamera();
            na7.c1().edit().putBoolean("stories_camera", this.a.C0.isFrontface()).apply();
            boolean p0 = this.a.p0();
            mi4 mi4Var = this.a.s;
            if (p0) {
                mi4Var.c(null);
            } else {
                mi4Var.d();
            }
        }
    }

    public final void c() {
        boolean z;
        boolean z2;
        t7b t7bVar = this.a;
        if (t7bVar.g0 != 0 || t7bVar.Q1 || t7bVar.R1) {
            return;
        }
        Activity activity = t7bVar.b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                z2 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
                if (z2) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, kk7.y1);
                }
            } else {
                z2 = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
                if (z2) {
                    activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, kk7.y1);
                }
            }
            z = !z2;
        } else {
            z = true;
        }
        if (z) {
            t7bVar.c(true);
        }
    }

    public final void d() {
        y6b y6bVar;
        t7b t7bVar = this.a;
        if (t7bVar.Q1 || t7bVar.T1 || t7bVar.g0 != 0 || (y6bVar = t7bVar.C0) == null || !y6bVar.isInited()) {
            return;
        }
        t7bVar.X0.f(true);
        File file = t7bVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            t7bVar.H1 = null;
        }
        dv8 dv8Var = t7bVar.D0;
        if (dv8Var != null) {
            dv8Var.f(true);
        }
        t7bVar.H1 = f4b.w(t7bVar.c, "jpg");
        t7bVar.Q1 = true;
        t7bVar.m();
        byte b = 0;
        t7bVar.d2 = false;
        if (t7bVar.C0.isFrontface() && t7bVar.u2 == 1) {
            t7bVar.n();
        }
        if (!t7bVar.p0()) {
            h(null);
            return;
        }
        mi4 mi4Var = t7bVar.s;
        ae9 ae9Var = new ae9(this, (byte) 18);
        mi4Var.h(mi4Var.p);
        mi4Var.e(1.0f, 320L, new hi4(mi4Var, ae9Var, b));
    }

    public final void e(boolean z) {
        t7b t7bVar = this.a;
        if (t7bVar.S1 || !t7bVar.R1) {
            return;
        }
        t7bVar.S1 = true;
        gl.e3(new r6b(this, (byte) 0), z ? 0L : 400L);
    }

    public final void f(Runnable runnable, boolean z) {
        y6b y6bVar;
        t7b t7bVar = this.a;
        if (t7bVar.R1 || t7bVar.S1 || t7bVar.T1 || t7bVar.g0 != 0 || (y6bVar = t7bVar.C0) == null || y6bVar.getCameraSession() == null) {
            return;
        }
        je5 je5Var = t7bVar.m1;
        if (je5Var != null) {
            je5Var.f(true);
        }
        je5 je5Var2 = t7bVar.n1;
        if (je5Var2 != null) {
            je5Var2.f(true);
        }
        t7bVar.X0.f(true);
        t7bVar.R1 = true;
        dv8 dv8Var = t7bVar.D0;
        if (dv8Var != null) {
            dv8Var.f(true);
        }
        File file = t7bVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            t7bVar.H1 = null;
        }
        t7bVar.H1 = f4b.w(t7bVar.c, "mp4");
        t7bVar.m();
        t7bVar.d2 = false;
        if (t7bVar.C0.isFrontface() && t7bVar.u2 == 1) {
            t7bVar.n();
        }
        if (t7bVar.p0()) {
            t7bVar.s.c(new s6b(this, z, runnable));
        } else {
            g(runnable, z);
        }
    }

    public final void g(Runnable runnable, boolean z) {
        t7b t7bVar = this.a;
        if (t7bVar.C0 != null) {
            CameraController.getInstance().recordVideo(t7bVar.C0.getCameraSessionObject(), t7bVar.H1, false, new hza(this, (byte) 7), new s6b(this, runnable, z), t7bVar.C0, true);
            if (t7bVar.P1 != 1) {
                t7bVar.P1 = 1;
                t7bVar.J0.a(false, true);
                t7bVar.h0(t7bVar.P1 == 1, true);
                t7bVar.R0.a(t7bVar.P1);
                f29 f29Var = t7bVar.P0;
                boolean z2 = t7bVar.P1 == 1;
                f29Var.o0 = -1.0f;
                f29Var.p0 = z2;
                f29Var.invalidate();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(p8c p8cVar) {
        boolean z;
        FileOutputStream fileOutputStream;
        t7b t7bVar = this.a;
        int i = t7bVar.c;
        byte b = 1;
        if (!t7bVar.p0()) {
            t7bVar.C0.startTakePictureAnimation(true);
        }
        if ((t7bVar.C0.isDual() && TextUtils.equals(t7bVar.C0.getCameraSession().getCurrentFlashMode(), "off")) || t7bVar.B0.i()) {
            if (!t7bVar.B0.i()) {
                t7bVar.C0.pauseAsTakingPicture();
            }
            Bitmap bitmap = t7bVar.C0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(t7bVar.H1.getAbsoluteFile());
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
                fa4.g(e, true);
                bitmap.recycle();
                if (z) {
                }
            }
            bitmap.recycle();
        } else {
            z = false;
        }
        if (z) {
            dv8 dv8Var = t7bVar.D0;
            if (dv8Var != null) {
                dv8Var.f(true);
            }
            t7bVar.Q1 = CameraController.getInstance().takePicture(t7bVar.H1, true, t7bVar.C0.getCameraSessionObject(), new nu9(this, p8cVar, (byte) 15));
            return;
        }
        t7bVar.Q1 = false;
        dv8 dv8Var2 = t7bVar.D0;
        if (dv8Var2 != null) {
            dv8Var2.f(false);
        }
        f4b m = f4b.m(t7bVar.H1, 0);
        m.J0 = t7bVar.w0;
        m.K0 = t7bVar.x0;
        if (!t7bVar.B0.i()) {
            t7bVar.L1 = m;
            a6b.a(i, m);
            t7bVar.M1 = false;
            if (p8cVar != null) {
                p8cVar.a(new r6b(this, b));
                return;
            } else {
                t7bVar.I(1, true);
                return;
            }
        }
        t7bVar.H1 = null;
        if (t7bVar.B0.l(m)) {
            f4b a = f4b.a(t7bVar.B0.getLayout(), t7bVar.B0.getContent());
            t7bVar.L1 = a;
            a6b.a(i, a);
            t7bVar.M1 = false;
            if (p8cVar != null) {
                p8cVar.a(null);
            }
        } else if (p8cVar != null) {
            p8cVar.a(null);
        }
        t7bVar.l0(true);
    }
}
