package ph;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class q2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ a3 a;

    public q2(a3 a3Var) {
        this.a = a3Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        a3 a3Var = this.a;
        if (i10 != -1) {
            if (i10 >= 10) {
                a3Var.e((MediaController.AlbumEntry) a3Var.d0.get(i10 - 10), false);
            }
        } else {
            Runnable runnable = a3Var.S;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
