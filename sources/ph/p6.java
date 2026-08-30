package ph;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6 b;
    public final /* synthetic */ org.telegram.ui.web.y0 c;

    public /* synthetic */ p6(u6 u6Var, org.telegram.ui.web.y0 y0Var, int i10) {
        this.a = i10;
        this.b = u6Var;
        this.c = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p6 p6Var;
        switch (this.a) {
            case 0:
                org.telegram.ui.web.y0 y0Var = this.c;
                u6 u6Var = this.b;
                u6Var.getClass();
                try {
                    try {
                        t6 t6Var = u6Var.d1;
                        if (t6Var == null) {
                            t6Var = new t6();
                            u6Var.d1 = t6Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(u6Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            t6Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            t6Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        u6Var.d1 = u6Var.d1;
                        p6Var = new p6(u6Var, y0Var, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        u6Var.d1 = u6Var.d1;
                        p6Var = new p6(u6Var, y0Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(p6Var);
                    return;
                } catch (Throwable th2) {
                    u6Var.d1 = u6Var.d1;
                    AndroidUtilities.runOnUIThread(new p6(u6Var, y0Var, 1));
                    throw th2;
                }
            default:
                this.c.run(this.b.d1);
                return;
        }
    }
}
