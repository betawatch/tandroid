// default package

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rd8 extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final qd8 b;
    public boolean c;

    public rd8(qd8 qd8Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = qd8Var;
        this.a = z;
    }

    public static int a(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            if ((i < 24 || (i < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL) || !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")))) ? false : xke.b("EGL_EXT_protected_content")) {
                return xke.b("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        } catch (dy4 e2) {
            ncd.c("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e2.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (rd8.class) {
            if (!e) {
                d = a(context);
                e = true;
            }
            z = d != 0;
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            if (!this.c) {
                qd8 qd8Var = this.b;
                qd8Var.b.getClass();
                qd8Var.b.sendEmptyMessage(2);
                this.c = true;
            }
        }
    }
}
