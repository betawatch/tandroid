package qh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;
    public final /* synthetic */ org.telegram.ui.web.d1 c;

    public /* synthetic */ m6(r6 r6Var, org.telegram.ui.web.d1 d1Var, int i10) {
        this.a = i10;
        this.b = r6Var;
        this.c = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m6 m6Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.web.d1 d1Var = this.c;
                r6 r6Var = this.b;
                r6Var.getClass();
                try {
                    try {
                        q6 q6Var = r6Var.d1;
                        if (q6Var == null) {
                            q6Var = new q6();
                            r6Var.d1 = q6Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(r6Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            q6Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            q6Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        r6Var.d1 = r6Var.d1;
                        m6Var = new m6(r6Var, d1Var, 1);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        r6Var.d1 = r6Var.d1;
                        m6Var = new m6(r6Var, d1Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(m6Var);
                    return;
                } catch (Throwable th2) {
                    r6Var.d1 = r6Var.d1;
                    AndroidUtilities.runOnUIThread(new m6(r6Var, d1Var, 1));
                    throw th2;
                }
            default:
                this.c.run(this.b.d1);
                return;
        }
    }
}
