package ph;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t6 b;
    public final /* synthetic */ org.telegram.ui.web.a1 c;

    public /* synthetic */ o6(t6 t6Var, org.telegram.ui.web.a1 a1Var, int i10) {
        this.a = i10;
        this.b = t6Var;
        this.c = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o6 o6Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.web.a1 a1Var = this.c;
                t6 t6Var = this.b;
                t6Var.getClass();
                try {
                    try {
                        s6 s6Var = t6Var.d1;
                        if (s6Var == null) {
                            s6Var = new s6();
                            t6Var.d1 = s6Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(t6Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            s6Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            s6Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        t6Var.d1 = t6Var.d1;
                        o6Var = new o6(t6Var, a1Var, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        t6Var.d1 = t6Var.d1;
                        o6Var = new o6(t6Var, a1Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(o6Var);
                    return;
                } catch (Throwable th2) {
                    t6Var.d1 = t6Var.d1;
                    AndroidUtilities.runOnUIThread(new o6(t6Var, a1Var, 1));
                    throw th2;
                }
            default:
                this.c.run(this.b.d1);
                return;
        }
    }
}
