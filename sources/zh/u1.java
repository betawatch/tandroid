package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;
    public final /* synthetic */ String c;

    public /* synthetic */ u1(w3 w3Var, String str, int i10) {
        this.a = i10;
        this.b = w3Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w3.i1(this.b, this.c);
                break;
            case 1:
                of.f.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 2:
                of.f.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 3:
                of.f.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 4:
                of.f.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 5:
                of.f.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 6:
                of.f.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                qc k10 = this.b.getBulletinFactory().k(false);
                k10.t = true;
                k10.j();
                break;
            default:
                w3.p0(this.b, this.c);
                break;
        }
    }
}
