package qg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.h3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ u0(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 0:
                a1 a1Var = this.b;
                viewGroup = ((h3) a1Var).containerView;
                viewGroup.invalidate();
                a1Var.y();
                break;
            default:
                a1 a1Var2 = this.b;
                viewGroup2 = ((h3) a1Var2).containerView;
                viewGroup2.invalidate();
                a1Var2.y();
                break;
        }
    }
}
