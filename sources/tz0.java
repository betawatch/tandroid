// default package

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.view.Surface;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class tz0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vz0 b;

    public /* synthetic */ tz0(vz0 vz0Var, byte b) {
        this.a = b;
        this.b = vz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        vz0 vz0Var = this.b;
        switch (b) {
            case 0:
                vz0Var.u = true;
                vz0Var.c.removeCallbacksAndMessages(null);
                MediaExtractor mediaExtractor = vz0Var.n;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                    vz0Var.n = null;
                }
                vz0Var.m = -1L;
                vz0Var.r.clear();
                MediaCodec mediaCodec = vz0Var.g;
                if (mediaCodec != null) {
                    try {
                        mediaCodec.stop();
                    } catch (Throwable unused) {
                    }
                    vz0Var.g.release();
                    vz0Var.g = null;
                }
                vz0Var.h = null;
                SurfaceTextureHelper surfaceTextureHelper = vz0Var.d;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.stopListening();
                    vz0Var.d.dispose();
                    vz0Var.d = null;
                }
                Surface surface = vz0Var.e;
                if (surface != null) {
                    surface.release();
                    vz0Var.e = null;
                }
                vz0Var.b.quitSafely();
                return;
            case 1:
                try {
                    EglBase eglBase = VideoCapturerDevice.getEglBase();
                    SurfaceTextureHelper create = SurfaceTextureHelper.create("BroadcastTileTexture", eglBase != null ? eglBase.getEglBaseContext() : null);
                    vz0Var.d = create;
                    if (create == null) {
                        throw new IllegalStateException("no SurfaceTextureHelper");
                    }
                    vz0Var.e = new Surface(vz0Var.d.getSurfaceTexture());
                    vz0Var.d.startListening(new uz0(vz0Var, b2));
                    return;
                } catch (Throwable th) {
                    vz0Var.v.b(vz0Var.a, th);
                    return;
                }
            default:
                vz0Var.t = false;
                if (vz0Var.u || vz0Var.e == null) {
                    return;
                }
                try {
                    vz0Var.a();
                    if (vz0Var.f.isEmpty() || vz0Var.t || vz0Var.u) {
                        return;
                    }
                    vz0Var.t = true;
                    vz0Var.c.postDelayed(new tz0(vz0Var, (byte) 2), 16L);
                    return;
                } catch (Throwable th2) {
                    vz0Var.v.b(vz0Var.a, th2);
                    return;
                }
        }
    }
}
