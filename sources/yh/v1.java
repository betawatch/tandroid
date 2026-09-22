package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ String c;

    public /* synthetic */ v1(z3 z3Var, String str, int i10) {
        this.a = i10;
        this.b = z3Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z3.i1(this.b, this.c);
                break;
            case 1:
                nf.f.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 2:
                nf.f.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 3:
                nf.f.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 4:
                nf.f.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 5:
                nf.f.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 6:
                nf.f.u(r0.getContext(), MessagesController.getInstance(this.b.currentAccount).tonBlockchainExplorerUrl + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                oc k10 = this.b.getBulletinFactory().k(false);
                k10.t = true;
                k10.j();
                break;
            default:
                z3.p0(this.b, this.c);
                break;
        }
    }
}
