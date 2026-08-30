package ph;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class l6 extends f2.z0 {
    public final /* synthetic */ m6 a;

    public l6(m6 m6Var) {
        this.a = m6Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            m6 m6Var = this.a;
            if (m6Var.f0) {
                m6Var.f0 = false;
            }
        }
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        m6 m6Var = this.a;
        m6Var.d0();
        m6Var.X();
        if (!m6Var.d.H1 || m6Var.f0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.g3) m6Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
