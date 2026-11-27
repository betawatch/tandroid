// default package

import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class pec implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoEncodingService b;

    public /* synthetic */ pec(VideoEncodingService videoEncodingService, byte b) {
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
                videoEncodingService.b();
                break;
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.e;
                so6 so6Var = MediaController.z().b0;
                if (so6Var == null) {
                    videoEncodingService.stopSelf();
                    break;
                } else {
                    videoEncodingService.a(so6Var);
                    break;
                }
        }
    }
}
