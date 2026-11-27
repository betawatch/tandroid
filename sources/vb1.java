// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
