package vh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n5 b;
    public final /* synthetic */ ph.h1 c;

    public /* synthetic */ i5(n5 n5Var, ph.h1 h1Var, int i10) {
        this.a = i10;
        this.b = n5Var;
        this.c = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i5 i5Var;
        switch (this.a) {
            case 0:
                ph.h1 h1Var = this.c;
                n5 n5Var = this.b;
                n5Var.getClass();
                try {
                    try {
                        m5 m5Var = n5Var.d1;
                        if (m5Var == null) {
                            m5Var = new m5();
                            n5Var.d1 = m5Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(n5Var.L.getAbsolutePath());
                        int w9 = MediaController.w(mediaExtractor, false);
                        mediaExtractor.selectTrack(w9);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(w9);
                        if (trackFormat.containsKey("color-transfer")) {
                            m5Var.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            m5Var.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        n5Var.d1 = n5Var.d1;
                        i5Var = new i5(n5Var, h1Var, 1);
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        n5Var.d1 = n5Var.d1;
                        i5Var = new i5(n5Var, h1Var, 1);
                    }
                    org.telegram.messenger.i0.g3(i5Var);
                    return;
                } catch (Throwable th2) {
                    n5Var.d1 = n5Var.d1;
                    org.telegram.messenger.i0.g3(new i5(n5Var, h1Var, 1));
                    throw th2;
                }
            default:
                this.c.a(this.b.d1);
                return;
        }
    }
}
