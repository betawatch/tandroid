// default package

import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class scc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoEncodingService b;

    public /* synthetic */ scc(VideoEncodingService videoEncodingService, byte b) {
        this.a = b;
        this.b = videoEncodingService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        VideoEncodingService videoEncodingService = this.b;
        switch (b) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.e;
                oo6 oo6Var = MediaController.w().b0;
                if (oo6Var == null) {
                    videoEncodingService.stopSelf();
                    break;
                } else {
                    videoEncodingService.a(oo6Var);
                    break;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.e;
                videoEncodingService.b();
                break;
        }
    }
}
