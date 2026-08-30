package ph;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class t2 extends f2.z0 {
    public final /* synthetic */ a3 a;

    public t2(a3 a3Var) {
        this.a = a3Var;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        a3 a3Var = this.a;
        if (!a3Var.n.H1 || (w0Var = a3Var.D) == null || w0Var.getSearchField() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(a3Var.D.getSearchContainer());
    }
}
