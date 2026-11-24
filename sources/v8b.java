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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class v8b implements i49 {
    public final /* synthetic */ v9b a;

    public v8b(v9b v9bVar) {
        this.a = v9bVar;
    }

    public final void a() {
        g6b a;
        v9b v9bVar = this.a;
        ArrayList<g6b> content = v9bVar.B0.getContent();
        int i = 0;
        if (content.size() == 1) {
            a = content.get(0);
            v9bVar.L1 = a;
        } else {
            a = g6b.a(v9bVar.B0.getLayout(), v9bVar.B0.getContent());
            v9bVar.L1 = a;
        }
        if (a != null && a.K) {
            i = 1;
        }
        v9bVar.P1 = i;
        s8b s8bVar = v9bVar.R0;
        if (s8bVar != null) {
            s8bVar.a(i);
        }
        c8b.a(v9bVar.c, v9bVar.L1);
        v9bVar.I(1, true);
    }

    public final void b() {
        ArrayList arrayList;
        v9b v9bVar = this.a;
        a9b a9bVar = v9bVar.C0;
        if (a9bVar == null || v9bVar.T1 || v9bVar.Q1 || !a9bVar.isInited()) {
            return;
        }
        v9b v9bVar2 = this.a;
        if (v9bVar2.g0 == 0) {
            hg5 hg5Var = v9bVar2.n1;
            if (hg5Var != null) {
                hg5Var.f(true);
            }
            if (this.a.p0() && (arrayList = this.a.v2) != null && !arrayList.isEmpty()) {
                v9b v9bVar3 = this.a;
                a.b.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) v9bVar3.v2.get(v9bVar3.u2)).commit();
            }
            this.a.C0.switchCamera();
            oc7.d1().edit().putBoolean("stories_camera", this.a.C0.isFrontface()).apply();
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
        v9b v9bVar = this.a;
        if (v9bVar.g0 != 0 || v9bVar.Q1 || v9bVar.R1) {
            return;
        }
        Activity activity = v9bVar.b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                z2 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
                if (z2) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, nm7.y1);
                }
            } else {
                z2 = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
                if (z2) {
                    activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, nm7.y1);
                }
            }
            z = !z2;
        } else {
            z = true;
        }
        if (z) {
            v9bVar.c(true);
        }
    }

    public final void d() {
        a9b a9bVar;
        v9b v9bVar = this.a;
        if (v9bVar.Q1 || v9bVar.T1 || v9bVar.g0 != 0 || (a9bVar = v9bVar.C0) == null || !a9bVar.isInited()) {
            return;
        }
        v9bVar.X0.f(true);
        File file = v9bVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            v9bVar.H1 = null;
        }
        ex8 ex8Var = v9bVar.D0;
        if (ex8Var != null) {
            ex8Var.f(true);
        }
        v9bVar.H1 = g6b.w(v9bVar.c, "jpg");
        v9bVar.Q1 = true;
        v9bVar.m();
        byte b = 0;
        v9bVar.d2 = false;
        if (v9bVar.C0.isFrontface() && v9bVar.u2 == 1) {
            v9bVar.n();
        }
        if (!v9bVar.p0()) {
            h(null);
            return;
        }
        rk4 rk4Var = v9bVar.s;
        eg9 eg9Var = new eg9(this, (byte) 18);
        rk4Var.h(rk4Var.p);
        rk4Var.e(1.0f, 320L, new mk4(rk4Var, eg9Var, b));
    }

    public final void e(boolean z) {
        v9b v9bVar = this.a;
        if (v9bVar.S1 || !v9bVar.R1) {
            return;
        }
        v9bVar.S1 = true;
        gm.d3(new t8b(this, (byte) 0), z ? 0L : 400L);
    }

    public final void f(Runnable runnable, boolean z) {
        a9b a9bVar;
        v9b v9bVar = this.a;
        if (v9bVar.R1 || v9bVar.S1 || v9bVar.T1 || v9bVar.g0 != 0 || (a9bVar = v9bVar.C0) == null || a9bVar.getCameraSession() == null) {
            return;
        }
        hg5 hg5Var = v9bVar.m1;
        if (hg5Var != null) {
            hg5Var.f(true);
        }
        hg5 hg5Var2 = v9bVar.n1;
        if (hg5Var2 != null) {
            hg5Var2.f(true);
        }
        v9bVar.X0.f(true);
        v9bVar.R1 = true;
        ex8 ex8Var = v9bVar.D0;
        if (ex8Var != null) {
            ex8Var.f(true);
        }
        File file = v9bVar.H1;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
            v9bVar.H1 = null;
        }
        v9bVar.H1 = g6b.w(v9bVar.c, "mp4");
        v9bVar.m();
        v9bVar.d2 = false;
        if (v9bVar.C0.isFrontface() && v9bVar.u2 == 1) {
            v9bVar.n();
        }
        if (v9bVar.p0()) {
            v9bVar.s.c(new u8b(this, z, runnable));
        } else {
            g(runnable, z);
        }
    }

    public final void g(Runnable runnable, boolean z) {
        v9b v9bVar = this.a;
        if (v9bVar.C0 != null) {
            CameraController.getInstance().recordVideo(v9bVar.C0.getCameraSessionObject(), v9bVar.H1, false, new wta(this, (byte) 11), new u8b(this, runnable, z), v9bVar.C0, true);
            if (v9bVar.P1 != 1) {
                v9bVar.P1 = 1;
                v9bVar.J0.a(false, true);
                v9bVar.h0(v9bVar.P1 == 1, true);
                v9bVar.R0.a(v9bVar.P1);
                j49 j49Var = v9bVar.P0;
                boolean z2 = v9bVar.P1 == 1;
                j49Var.o0 = -1.0f;
                j49Var.p0 = z2;
                j49Var.invalidate();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(qac qacVar) {
        boolean z;
        FileOutputStream fileOutputStream;
        v9b v9bVar = this.a;
        int i = v9bVar.c;
        byte b = 1;
        if (!v9bVar.p0()) {
            v9bVar.C0.startTakePictureAnimation(true);
        }
        if ((v9bVar.C0.isDual() && TextUtils.equals(v9bVar.C0.getCameraSession().getCurrentFlashMode(), "off")) || v9bVar.B0.i()) {
            if (!v9bVar.B0.i()) {
                v9bVar.C0.pauseAsTakingPicture();
            }
            Bitmap bitmap = v9bVar.C0.getTextureView().getBitmap();
            try {
                fileOutputStream = new FileOutputStream(v9bVar.H1.getAbsoluteFile());
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
                fc4.g(e, true);
                bitmap.recycle();
                if (z) {
                }
            }
            bitmap.recycle();
        } else {
            z = false;
        }
        if (z) {
            ex8 ex8Var = v9bVar.D0;
            if (ex8Var != null) {
                ex8Var.f(true);
            }
            v9bVar.Q1 = CameraController.getInstance().takePicture(v9bVar.H1, true, v9bVar.C0.getCameraSessionObject(), new ts9(this, qacVar, (byte) 16));
            return;
        }
        v9bVar.Q1 = false;
        ex8 ex8Var2 = v9bVar.D0;
        if (ex8Var2 != null) {
            ex8Var2.f(false);
        }
        g6b m = g6b.m(v9bVar.H1, 0);
        m.J0 = v9bVar.w0;
        m.K0 = v9bVar.x0;
        if (!v9bVar.B0.i()) {
            v9bVar.L1 = m;
            c8b.a(i, m);
            v9bVar.M1 = false;
            if (qacVar != null) {
                qacVar.a(new t8b(this, b));
                return;
            } else {
                v9bVar.I(1, true);
                return;
            }
        }
        v9bVar.H1 = null;
        if (v9bVar.B0.l(m)) {
            g6b a = g6b.a(v9bVar.B0.getLayout(), v9bVar.B0.getContent());
            v9bVar.L1 = a;
            c8b.a(i, a);
            v9bVar.M1 = false;
            if (qacVar != null) {
                qacVar.a(null);
            }
        } else if (qacVar != null) {
            qacVar.a(null);
        }
        v9bVar.l0(true);
    }
}
