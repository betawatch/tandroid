// default package

import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class pac implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoEncodingService b;

    public /* synthetic */ pac(VideoEncodingService videoEncodingService, byte b) {
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
                om6 om6Var = MediaController.w().b0;
                if (om6Var == null) {
                    videoEncodingService.stopSelf();
                    break;
                } else {
                    videoEncodingService.a(om6Var);
                    break;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.e;
                videoEncodingService.b();
                break;
        }
    }
}
