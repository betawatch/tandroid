// default package

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xl3 implements GLSurfaceView.Renderer {
    public long a;
    public boolean b;
    public int c;
    public final /* synthetic */ zl3 d;

    public xl3(zl3 zl3Var) {
        this.d = zl3Var;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.d.r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(TLObject.FLAG_14);
            return;
        }
        final byte b = 1;
        if (!this.d.y) {
            final byte b2 = 0;
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(TLObject.FLAG_14);
            if (this.d.E) {
                return;
            }
            this.d.E = true;
            final int i = this.d.F;
            this.d.post(new Runnable(this) { // from class: wl3
                public final /* synthetic */ xl3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (b2) {
                        case 0:
                            xl3 xl3Var = this.b;
                            xl3Var.d.d(i);
                            break;
                        default:
                            xl3 xl3Var2 = this.b;
                            int i2 = i;
                            zl3 zl3Var = xl3Var2.d;
                            if (zl3Var.e && !zl3Var.r && i2 == xl3Var2.d.H) {
                                zl3 zl3Var2 = xl3Var2.d;
                                zl3Var2.s = true;
                                Runnable runnable = zl3Var2.w;
                                zl3Var2.w = null;
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            return;
        }
        try {
            long nanoTime = System.nanoTime();
            this.d.a.G = this.a == 0 ? 0.016666668f : Math.min(0.1f, (nanoTime - r5) / 1.0E9f);
            this.a = nanoTime;
            zl3 zl3Var = this.d;
            zl3Var.a.c.A = zl3Var.x;
            this.d.a.onDrawFrame(gl10);
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                throw new IllegalStateException("Diamond GL error: " + glGetError);
            }
            if (this.b) {
                return;
            }
            this.b = true;
            final int i2 = this.c;
            this.d.post(new Runnable(this) { // from class: wl3
                public final /* synthetic */ xl3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (b) {
                        case 0:
                            xl3 xl3Var = this.b;
                            xl3Var.d.d(i2);
                            break;
                        default:
                            xl3 xl3Var2 = this.b;
                            int i22 = i2;
                            zl3 zl3Var2 = xl3Var2.d;
                            if (zl3Var2.e && !zl3Var2.r && i22 == xl3Var2.d.H) {
                                zl3 zl3Var22 = xl3Var2.d;
                                zl3Var22.s = true;
                                Runnable runnable = zl3Var22.w;
                                zl3Var22.w = null;
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        } catch (RuntimeException e) {
            cc4.g(e, true);
            this.d.r = true;
            this.d.post(new zg3(this, (byte) 13));
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.b = false;
        this.c = this.d.H;
        if (this.d.r) {
            return;
        }
        this.d.a.onSurfaceChanged(gl10, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        zl3 zl3Var = this.d;
        int i = zl3Var.H + 1;
        zl3Var.H = i;
        this.c = i;
        this.b = false;
        this.a = 0L;
        this.d.r = false;
        ys4 ys4Var = this.d.a;
        ys4Var.c = null;
        try {
            ys4Var.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e) {
            cc4.g(e, true);
            this.d.r = true;
            this.d.post(new zg3(this, (byte) 13));
        }
    }
}
