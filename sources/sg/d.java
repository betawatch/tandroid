package sg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.FileLog;
import rg.x1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class d implements GLSurfaceView.Renderer {
    public long a;
    public boolean b;
    public int c;
    public final /* synthetic */ f d;

    public d(f fVar) {
        this.d = fVar;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.d.r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            return;
        }
        if (!this.d.x) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (this.d.y) {
                return;
            }
            this.d.y = true;
            final int i10 = this.d.E;
            final int i11 = 0;
            this.d.post(new Runnable(this) { // from class: sg.c
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            d dVar = this.b;
                            f.a(dVar.d, i10);
                            break;
                        default:
                            d dVar2 = this.b;
                            int i12 = i10;
                            f fVar = dVar2.d;
                            if (fVar.e && !fVar.r && i12 == dVar2.d.G) {
                                f fVar2 = dVar2.d;
                                fVar2.s = true;
                                Runnable runnable = fVar2.v;
                                fVar2.v = null;
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
            f fVar = this.d;
            fVar.a.c.A = fVar.w;
            this.d.a.onDrawFrame(gl10);
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                throw new IllegalStateException("Diamond GL error: " + glGetError);
            }
            if (this.b) {
                return;
            }
            this.b = true;
            final int i12 = this.c;
            final int i13 = 1;
            this.d.post(new Runnable(this) { // from class: sg.c
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            d dVar = this.b;
                            f.a(dVar.d, i12);
                            break;
                        default:
                            d dVar2 = this.b;
                            int i122 = i12;
                            f fVar2 = dVar2.d;
                            if (fVar2.e && !fVar2.r && i122 == dVar2.d.G) {
                                f fVar22 = dVar2.d;
                                fVar22.s = true;
                                Runnable runnable = fVar22.v;
                                fVar22.v = null;
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        } catch (RuntimeException e7) {
            FileLog.e(e7);
            this.d.r = true;
            this.d.post(new x1(this, 3));
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.b = false;
        this.c = this.d.G;
        if (this.d.r) {
            return;
        }
        this.d.a.onSurfaceChanged(gl10, i10, i11);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        f fVar = this.d;
        int i10 = fVar.G + 1;
        fVar.G = i10;
        this.c = i10;
        this.b = false;
        this.a = 0L;
        this.d.r = false;
        g gVar = this.d.a;
        gVar.c = null;
        try {
            gVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e7) {
            FileLog.e(e7);
            this.d.r = true;
            this.d.post(new x1(this, 3));
        }
    }
}
