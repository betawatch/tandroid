// default package

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qk implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((CountDownLatch) obj).countDown();
                break;
            case 1:
                ((CountDownLatch) obj).countDown();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
