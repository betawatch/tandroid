package sg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.f3;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                viewGroup = ((f3) y0Var).containerView;
                viewGroup.invalidate();
                y0Var.A();
                break;
            default:
                y0 y0Var2 = this.b;
                viewGroup2 = ((f3) y0Var2).containerView;
                viewGroup2.invalidate();
                y0Var2.A();
                break;
        }
    }
}
