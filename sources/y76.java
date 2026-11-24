// default package

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class y76 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Surface b;
    public final /* synthetic */ SurfaceTexture c;

    public /* synthetic */ y76(Surface surface, SurfaceTexture surfaceTexture, byte b) {
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
                gl.c3(new y76(surface, surfaceTexture, (byte) 4));
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
