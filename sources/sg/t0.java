package sg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.f3;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class t0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ t0(a1 a1Var, int i10) {
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
                viewGroup = ((f3) a1Var).containerView;
                viewGroup.invalidate();
                a1Var.y();
                break;
            default:
                a1 a1Var2 = this.b;
                viewGroup2 = ((f3) a1Var2).containerView;
                viewGroup2.invalidate();
                a1Var2.y();
                break;
        }
    }
}
