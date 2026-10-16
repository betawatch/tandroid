package sg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.e3;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class s0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ s0(y0 y0Var, int i10) {
        this.a = i10;
        this.b = y0Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 0:
                y0 y0Var = this.b;
                viewGroup = ((e3) y0Var).containerView;
                viewGroup.invalidate();
                y0Var.B();
                break;
            default:
                y0 y0Var2 = this.b;
                viewGroup2 = ((e3) y0Var2).containerView;
                viewGroup2.invalidate();
                y0Var2.B();
                break;
        }
    }
}
