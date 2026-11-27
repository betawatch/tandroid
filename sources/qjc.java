// default package

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class qjc implements Runnable {
    public SurfaceTexture a;
    public final boolean b;
    public final /* synthetic */ rjc c;

    public qjc(rjc rjcVar, boolean z) {
        this.c = rjcVar;
        this.b = z;
    }

    public final synchronized void a(SurfaceTexture surfaceTexture) {
        this.a = surfaceTexture;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0023, code lost:
    
        if (r1.hasSurface() == false) goto L18;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void run() {
        njc njcVar;
        if (this.a != null && (njcVar = this.c.r) != null) {
            if (this.b) {
                if (!(njcVar.e != EGL14.EGL_NO_SURFACE)) {
                    SurfaceTexture surfaceTexture = this.a;
                    if (!ik8.A(surfaceTexture)) {
                        throw new IllegalStateException("Invalid surface: " + this.a);
                    }
                    boolean z = this.b;
                    njc njcVar2 = this.c.r;
                    if (z) {
                        njcVar2.b(surfaceTexture, true);
                    } else {
                        njcVar2.b(surfaceTexture, false);
                    }
                    boolean z2 = this.b;
                    njc njcVar3 = this.c.r;
                    if (z2) {
                        njcVar3.c(njcVar3.e);
                        GLES20.glPixelStorei(3317, 1);
                        if (this.c.r.hasSurface()) {
                            this.c.r.makeCurrent();
                        }
                    } else {
                        njcVar3.makeCurrent();
                        GLES20.glPixelStorei(3317, 1);
                    }
                }
            }
        }
    }
}
