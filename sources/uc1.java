// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l9b b;

    public /* synthetic */ uc1(l9b l9bVar, byte b) {
        this.a = b;
        this.b = l9bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        l9b l9bVar = this.b;
        switch (b) {
            case 0:
                l9bVar.n();
                break;
            case 1:
                l9bVar.K0 = false;
                l9bVar.L0 = TLObject.FLAG_31;
                l9bVar.invalidate();
                l9bVar.S0.setVisibility(0);
                l9bVar.T0.setVisibility(0);
                break;
            default:
                v9b v9bVar = l9bVar.S1;
                k9b k9bVar = v9bVar.Y0;
                if (k9bVar != null) {
                    k9bVar.P = false;
                    k9bVar.b();
                    k9b k9bVar2 = v9bVar.Y0;
                    k9bVar2.m(0L);
                    lqb lqbVar = k9bVar2.G;
                    if (lqbVar != null) {
                        lqbVar.setProgress(0L);
                        break;
                    }
                }
                break;
        }
    }
}
