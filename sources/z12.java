// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class z12 extends wb4 {
    public final /* synthetic */ byte U;
    public final /* synthetic */ p02 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z12(c42 c42Var, fu fuVar) {
        super(0, 0, fuVar);
        this.U = (byte) 2;
        this.V = c42Var;
    }

    @Override // d49
    public final int[] t(View view, Rect rect) {
        switch (this.U) {
            case 3:
                int B = this.n - B();
                int top = (view.getTop() + rect.top) - view.getScrollY();
                int height = rect.height() + top;
                int min = Math.min(0, top);
                int max = Math.max(0, height - B);
                if (min == 0) {
                    min = Math.min(top, max);
                }
                return new int[]{0, min};
            default:
                return super.t(view, rect);
        }
    }

    @Override // d49
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        switch (this.U) {
            case 0:
                y12 y12Var = new y12(this, recyclerView.getContext());
                y12Var.a = i;
                v0(y12Var);
                break;
            case 1:
                s22 s22Var = new s22(this, recyclerView.getContext());
                s22Var.a = i;
                v0(s22Var);
                break;
            case 2:
                y32 y32Var = new y32(this, recyclerView.getContext());
                y32Var.a = i;
                v0(y32Var);
                break;
            case 3:
                b62 b62Var = new b62(this, recyclerView.getContext());
                b62Var.a = i;
                v0(b62Var);
                break;
            default:
                l62 l62Var = new l62(this, recyclerView.getContext());
                l62Var.a = i;
                v0(l62Var);
                break;
        }
    }

    @Override // t26
    public final void y0(p49 p49Var, int[] iArr) {
        switch (this.U) {
            case 2:
                super.y0(p49Var, iArr);
                iArr[1] = Math.max(iArr[1], ((c42) this.V).M.getHeight());
                break;
            default:
                super.y0(p49Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z12(p02 p02Var, int i, o39 o39Var, byte b) {
        super(i, 0, o39Var);
        this.U = b;
        this.V = p02Var;
    }
}
