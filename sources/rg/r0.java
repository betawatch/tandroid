package rg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.f3;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class r0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ r0(x0 x0Var, int i10) {
        this.a = i10;
        this.b = x0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 0:
                x0 x0Var = this.b;
                viewGroup = ((f3) x0Var).containerView;
                viewGroup.invalidate();
                x0Var.y();
                break;
            default:
                x0 x0Var2 = this.b;
                viewGroup2 = ((f3) x0Var2).containerView;
                viewGroup2.invalidate();
                x0Var2.y();
                break;
        }
    }
}
