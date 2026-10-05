package rg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.f3;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class s0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ s0(y0 y0Var, int i10) {
        this.a = i10;
        this.b = y0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 0:
                y0 y0Var = this.b;
                viewGroup = ((f3) y0Var).containerView;
                viewGroup.invalidate();
                y0Var.y();
                break;
            default:
                y0 y0Var2 = this.b;
                viewGroup2 = ((f3) y0Var2).containerView;
                viewGroup2.invalidate();
                y0Var2.y();
                break;
        }
    }
}
