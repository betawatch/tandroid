package sh;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ long c;

    public /* synthetic */ h(n nVar, long j10, int i10) {
        this.a = i10;
        this.b = nVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.c, r0.b, new j(this.b, 0));
                break;
            default:
                n nVar = this.b;
                nVar.getClass();
                nVar.presentFragment(zn.R9(this.c));
                break;
        }
    }
}
