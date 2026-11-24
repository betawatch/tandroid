// default package

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class x96 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Surface b;
    public final /* synthetic */ SurfaceTexture c;

    public /* synthetic */ x96(Surface surface, SurfaceTexture surfaceTexture, byte b) {
        this.a = b;
        this.b = surface;
        this.c = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SurfaceTexture surfaceTexture = this.c;
        Surface surface = this.b;
        switch (b) {
            case 0:
                if (surface != null) {
                    surface.release();
                }
                surfaceTexture.release();
                break;
            case 1:
                if (surface != null) {
                    surface.release();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    break;
                }
                break;
            case 2:
                if (surface != null) {
                    surface.release();
                }
                surfaceTexture.release();
                break;
            case 3:
                gm.c3(new x96(surface, surfaceTexture, (byte) 4));
                break;
            default:
                if (surface != null) {
                    surface.release();
                }
                surfaceTexture.release();
                break;
        }
    }
}
