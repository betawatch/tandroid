package ph;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
