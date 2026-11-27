// default package

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x58 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lcb b;

    public /* synthetic */ x58(lcb lcbVar, byte b) {
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
                    zbb zbbVar = lcbVar.w;
                    if (zbbVar != null) {
                        si5.c = true;
                        zbbVar.setLayerType(2, null);
                    }
                    lcbVar.G.addListener(new tbb(lcbVar, b2));
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
