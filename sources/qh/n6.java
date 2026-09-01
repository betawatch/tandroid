package qh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s6 b;
    public final /* synthetic */ org.telegram.ui.web.d1 c;

    public /* synthetic */ n6(s6 s6Var, org.telegram.ui.web.d1 d1Var, int i10) {
        this.a = i10;
        this.b = s6Var;
        this.c = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n6 n6Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.web.d1 d1Var = this.c;
                s6 s6Var = this.b;
                s6Var.getClass();
                try {
                    try {
                        r6 r6Var = s6Var.d1;
                        if (r6Var == null) {
                            r6Var = new r6();
                            s6Var.d1 = r6Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(s6Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            r6Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            r6Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        s6Var.d1 = s6Var.d1;
                        n6Var = new n6(s6Var, d1Var, 1);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        s6Var.d1 = s6Var.d1;
                        n6Var = new n6(s6Var, d1Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(n6Var);
                    return;
                } catch (Throwable th2) {
                    s6Var.d1 = s6Var.d1;
                    AndroidUtilities.runOnUIThread(new n6(s6Var, d1Var, 1));
                    throw th2;
                }
            default:
                this.c.run(this.b.d1);
                return;
        }
    }
}
