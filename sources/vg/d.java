package vg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import sg.t0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
            if (this.d.D) {
                return;
            }
            this.d.D = true;
            final int i7 = this.d.E;
            final int i10 = 0;
            this.d.post(new Runnable(this) { // from class: vg.c
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            d dVar = this.b;
                            e.a(dVar.d, i7);
                            break;
                        default:
                            d dVar2 = this.b;
                            int i11 = i7;
                            e eVar = dVar2.d;
                            if (eVar.e && !eVar.r && i11 == dVar2.d.G) {
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
            this.d.post(new Runnable(this) { // from class: vg.c
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
                            if (eVar2.e && !eVar2.r && i112 == dVar2.d.G) {
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
            this.d.post(new t0(this, 24));
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        this.b = false;
        this.c = this.d.G;
        if (this.d.r) {
            return;
        }
        this.d.a.onSurfaceChanged(gl10, i7, i10);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        e eVar = this.d;
        int i7 = eVar.G + 1;
        eVar.G = i7;
        this.c = i7;
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
            this.d.post(new t0(this, 24));
        }
    }
}
