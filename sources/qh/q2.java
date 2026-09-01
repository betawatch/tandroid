package qh;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
