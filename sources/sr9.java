// default package

import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sr9 implements qr9 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public SurfaceTextureHelper b;
    public Surface c;

    public sr9() {
        EglBase eglBase = VideoCapturerDevice.getEglBase();
        SurfaceTextureHelper create = SurfaceTextureHelper.create("RtmpStreamTexture", eglBase != null ? eglBase.getEglBaseContext() : null);
        this.b = create;
        if (create != null) {
            this.c = new Surface(this.b.getSurfaceTexture());
            this.b.startListening(new c01(this, (byte) 1));
        }
    }

    @Override // qr9
    public final void a(int i, int i2) {
        SurfaceTextureHelper surfaceTextureHelper = this.b;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.setTextureSize(i, i2);
            this.b.setFrameRotation(0);
        }
    }

    @Override // qr9
    public final boolean b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            VideoSink videoSink = (VideoSink) it.next();
            if (!(videoSink instanceof VoIPService.ProxyVideoSink) || !((VoIPService.ProxyVideoSink) videoSink).isUnused()) {
                return true;
            }
        }
        return false;
    }

    @Override // qr9
    public final Surface getSurface() {
        return this.c;
    }
}
