package sg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.h3;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class r0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ r0(y0 y0Var, int i10) {
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
                viewGroup = ((h3) y0Var).containerView;
                viewGroup.invalidate();
                y0Var.B();
                break;
            default:
                y0 y0Var2 = this.b;
                viewGroup2 = ((h3) y0Var2).containerView;
                viewGroup2.invalidate();
                y0Var2.B();
                break;
        }
    }
}
