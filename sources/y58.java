// default package

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y58 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lcb b;

    public /* synthetic */ y58(lcb lcbVar, byte b) {
        this.a = b;
        this.b = lcbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        lcb lcbVar = this.b;
        switch (b) {
            case 0:
                lcbVar.U();
                break;
            case 1:
                lcbVar.d0 = true;
                lcbVar.k(true);
                break;
            case 2:
                if (lcbVar.G != null) {
                    acb acbVar = lcbVar.w;
                    if (acbVar != null) {
                        si5.c = true;
                        acbVar.setLayerType(2, null);
                    }
                    lcbVar.G.addListener(new ubb(lcbVar, b2));
                    lcbVar.G.setDuration(320L);
                    lcbVar.G.setInterpolator(k43.h);
                    lcbVar.G.start();
                    break;
                }
                break;
            case 3:
                lcbVar.w0 = null;
                lcbVar.U();
                break;
            case 4:
                lcbVar.P(true);
                break;
            case 5:
                lcbVar.W();
                icb icbVar = lcbVar.t0;
                ImageReceiver imageReceiver = icbVar.b;
                if (imageReceiver != null) {
                    imageReceiver.v0(false, true);
                }
                ImageReceiver imageReceiver2 = icbVar.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.v0(false, true);
                    break;
                }
                break;
            default:
                lcbVar.i();
                break;
        }
    }
}
