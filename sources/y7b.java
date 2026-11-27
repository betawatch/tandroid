// default package

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class y7b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c8b b;
    public final /* synthetic */ ii7 c;

    public /* synthetic */ y7b(c8b c8bVar, ii7 ii7Var, byte b) {
        this.a = b;
        this.b = c8bVar;
        this.c = ii7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y7b y7bVar;
        byte b = this.a;
        ii7 ii7Var = this.c;
        c8b c8bVar = this.b;
        switch (b) {
            case 0:
                ii7Var.a(c8bVar.d1);
                return;
            default:
                c8bVar.getClass();
                byte b2 = 0;
                try {
                    try {
                        b8b b8bVar = c8bVar.d1;
                        if (b8bVar == null) {
                            b8bVar = new b8b();
                            c8bVar.d1 = b8bVar;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(c8bVar.L.getAbsolutePath());
                        int t = MediaController.t(mediaExtractor, false);
                        mediaExtractor.selectTrack(t);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(t);
                        if (trackFormat.containsKey("color-transfer")) {
                            b8bVar.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            b8bVar.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        c8bVar.d1 = c8bVar.d1;
                        y7bVar = new y7b(c8bVar, ii7Var, b2);
                    } catch (Exception e) {
                        cc4.g(e, true);
                        c8bVar.d1 = c8bVar.d1;
                        y7bVar = new y7b(c8bVar, ii7Var, b2);
                    }
                    hl.c3(y7bVar);
                    return;
                } catch (Throwable th) {
                    c8bVar.d1 = c8bVar.d1;
                    hl.c3(new y7b(c8bVar, ii7Var, b2));
                    throw th;
                }
        }
    }
}
