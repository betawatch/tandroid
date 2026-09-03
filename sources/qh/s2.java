package qh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class s2 extends f2.a1 {
    public final /* synthetic */ z2 a;

    public s2(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        z2 z2Var = this.a;
        if (!z2Var.n.H1 || (w0Var = z2Var.D) == null || w0Var.getSearchField() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(z2Var.D.getSearchContainer());
    }
}
