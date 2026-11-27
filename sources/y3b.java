// default package

import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y3b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ StickersActivity b;

    public /* synthetic */ y3b(StickersActivity stickersActivity, byte b) {
        this.a = b;
        this.b = stickersActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        StickersActivity stickersActivity = this.b;
        switch (b) {
            case 0:
                stickersActivity.o0();
                break;
            default:
                stickersActivity.n--;
                break;
        }
    }
}
