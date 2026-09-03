package qh;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class p2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ z2 a;

    public p2(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        z2 z2Var = this.a;
        if (i10 != -1) {
            if (i10 >= 10) {
                z2Var.e((MediaController.AlbumEntry) z2Var.d0.get(i10 - 10), false);
            }
        } else {
            Runnable runnable = z2Var.S;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
