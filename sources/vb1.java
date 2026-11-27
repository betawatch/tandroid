// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ibb b;

    public /* synthetic */ vb1(ibb ibbVar, byte b) {
        this.a = b;
        this.b = ibbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ibb ibbVar = this.b;
        switch (b) {
            case 0:
                ibbVar.n();
                break;
            case 1:
                ibbVar.K0 = false;
                ibbVar.L0 = TLObject.FLAG_31;
                ibbVar.invalidate();
                ibbVar.S0.setVisibility(0);
                ibbVar.T0.setVisibility(0);
                break;
            default:
                sbb sbbVar = ibbVar.S1;
                hbb hbbVar = sbbVar.Y0;
                if (hbbVar != null) {
                    hbbVar.P = false;
                    hbbVar.b();
                    hbb hbbVar2 = sbbVar.Y0;
                    hbbVar2.m(0L);
                    ksb ksbVar = hbbVar2.G;
                    if (ksbVar != null) {
                        ksbVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
