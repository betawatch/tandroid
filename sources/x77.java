// default package

import org.telegram.messenger.voip.OpusDred;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class x77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Runnable[] c;

    public /* synthetic */ x77(boolean[] zArr, Runnable[] runnableArr, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = runnableArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable[] runnableArr = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                zArr[0] = true;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                OpusDred.lambda$whenReadyForGroupCall$1(zArr, runnableArr);
                break;
            default:
                zArr[0] = true;
                Runnable runnable2 = runnableArr[0];
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
