package ph;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class k6 extends f2.z0 {
    public final /* synthetic */ l6 a;

    public k6(l6 l6Var) {
        this.a = l6Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            l6 l6Var = this.a;
            if (l6Var.f0) {
                l6Var.f0 = false;
            }
        }
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        l6 l6Var = this.a;
        l6Var.d0();
        l6Var.X();
        if (!l6Var.d.H1 || l6Var.f0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.g3) l6Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
