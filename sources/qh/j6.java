package qh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class j6 extends f2.a1 {
    public final /* synthetic */ k6 a;

    public j6(k6 k6Var) {
        this.a = k6Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            k6 k6Var = this.a;
            if (k6Var.f0) {
                k6Var.f0 = false;
            }
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        k6 k6Var = this.a;
        k6Var.d0();
        k6Var.X();
        if (!k6Var.d.H1 || k6Var.f0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.h3) k6Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
