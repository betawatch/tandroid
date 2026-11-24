// default package

import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
