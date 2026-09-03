package qh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h6 extends f2.a1 {
    public final /* synthetic */ i6 a;

    public h6(i6 i6Var) {
        this.a = i6Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            i6 i6Var = this.a;
            if (i6Var.f0) {
                i6Var.f0 = false;
            }
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        i6 i6Var = this.a;
        i6Var.d0();
        i6Var.X();
        if (!i6Var.d.H1 || i6Var.f0) {
            return;
        }
        viewGroup = ((org.telegram.ui.ActionBar.h3) i6Var).containerView;
        AndroidUtilities.hideKeyboard(viewGroup);
    }
}
