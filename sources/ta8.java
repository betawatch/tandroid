// default package

import android.graphics.SurfaceTexture;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class ta8 implements VideoSink {
    public final EglRenderer a;
    public SurfaceTexture b;
    public boolean c;

    public ta8(ya8 ya8Var) {
        EglRenderer eglRenderer = new EglRenderer("pip-egl");
        this.a = eglRenderer;
        eglRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        ya8Var.setSurfaceTextureListener(new up5(this, (byte) 2));
        SurfaceTexture surfaceTexture = ya8Var.getSurfaceTexture();
        if (surfaceTexture == null || ya8Var.a == null) {
            return;
        }
        int width = ya8Var.getWidth();
        int height = ya8Var.getHeight();
        if (this.c || this.b == surfaceTexture) {
            return;
        }
        this.b = surfaceTexture;
        if (width > 0 && height > 0) {
            eglRenderer.setLayoutAspectRatio(width / height);
        }
        eglRenderer.createEglSurface(surfaceTexture);
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.release();
        this.b = null;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        if (this.c) {
            return;
        }
        this.a.onFrame(videoFrame);
    }

    @Override // org.webrtc.VideoSink
    public final void setParentSink(VideoSink videoSink) {
    }
}
