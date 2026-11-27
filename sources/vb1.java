// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hbb b;

    public /* synthetic */ vb1(hbb hbbVar, byte b) {
        this.a = b;
        this.b = hbbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hbb hbbVar = this.b;
        switch (b) {
            case 0:
                hbbVar.n();
                break;
            case 1:
                hbbVar.K0 = false;
                hbbVar.L0 = TLObject.FLAG_31;
                hbbVar.invalidate();
                hbbVar.S0.setVisibility(0);
                hbbVar.T0.setVisibility(0);
                break;
            default:
                rbb rbbVar = hbbVar.S1;
                gbb gbbVar = rbbVar.Y0;
                if (gbbVar != null) {
                    gbbVar.P = false;
                    gbbVar.b();
                    gbb gbbVar2 = rbbVar.Y0;
                    gbbVar2.m(0L);
                    ksb ksbVar = gbbVar2.G;
                    if (ksbVar != null) {
                        ksbVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
