// default package

import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vt2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ vt2(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.lambda$cancelRequest$9(runnable);
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                ExecutorService executorService = DictationLid.a;
                DictationAsr.O();
                runnable.run();
                break;
            case 3:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 4:
                gm.r(runnable);
                gm.c3(runnable);
                break;
            case 5:
                gm.r(runnable);
                gm.c3(runnable);
                break;
            default:
                gm.r(runnable);
                gm.c3(runnable);
                break;
        }
    }
}
