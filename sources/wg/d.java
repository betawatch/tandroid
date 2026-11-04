package wg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import r4.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d implements GLSurfaceView.Renderer {
    public long a;
    public boolean b;
    public int c;
    public final /* synthetic */ e d;

    public d(e eVar) {
        this.d = eVar;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.d.r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(TLObject.FLAG_14);
            return;
        }
        if (!this.d.y) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(TLObject.FLAG_14);
            if (this.d.E) {
                return;
            }
            this.d.E = true;
            final int i3 = this.d.F;
            final int i10 = 0;
            this.d.post(new Runnable(this) { // from class: wg.c
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            d dVar = this.b;
                            e.a(dVar.d, i3);
                            break;
                        default:
                            d dVar2 = this.b;
                            int i11 = i3;
                            e eVar = dVar2.d;
                            if (eVar.e && !eVar.r && i11 == dVar2.d.H) {
                                e eVar2 = dVar2.d;
                                eVar2.s = true;
                                Runnable runnable = eVar2.w;
                                eVar2.w = null;
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
            e eVar = this.d;
            eVar.a.c.A = eVar.x;
            this.d.a.onDrawFrame(gl10);
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                throw new IllegalStateException("Diamond GL error: " + glGetError);
            }
            if (this.b) {
                return;
            }
            this.b = true;
            final int i11 = this.c;
            final int i12 = 1;
            this.d.post(new Runnable(this) { // from class: wg.c
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            d dVar = this.b;
                            e.a(dVar.d, i11);
                            break;
                        default:
                            d dVar2 = this.b;
                            int i112 = i11;
                            e eVar2 = dVar2.d;
                            if (eVar2.e && !eVar2.r && i112 == dVar2.d.H) {
                                e eVar22 = dVar2.d;
                                eVar22.s = true;
                                Runnable runnable = eVar22.w;
                                eVar22.w = null;
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        } catch (RuntimeException e10) {
            a8.g(e10, true);
            this.d.r = true;
            this.d.post(new u(this, 25));
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i3, int i10) {
        this.b = false;
        this.c = this.d.H;
        if (this.d.r) {
            return;
        }
        this.d.a.onSurfaceChanged(gl10, i3, i10);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        e eVar = this.d;
        int i3 = eVar.H + 1;
        eVar.H = i3;
        this.c = i3;
        this.b = false;
        this.a = 0L;
        this.d.r = false;
        f fVar = this.d.a;
        fVar.c = null;
        try {
            fVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e10) {
            a8.g(e10, true);
            this.d.r = true;
            this.d.post(new u(this, 25));
        }
    }
}
