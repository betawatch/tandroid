// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class q22 extends td4 {
    public final /* synthetic */ byte U;
    public final /* synthetic */ f12 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q22(s42 s42Var, gu guVar) {
        super(0, 0, guVar);
        this.U = (byte) 2;
        this.V = s42Var;
    }

    @Override // q79
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

    @Override // q79
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        switch (this.U) {
            case 0:
                p22 p22Var = new p22(this, recyclerView.getContext());
                p22Var.a = i;
                v0(p22Var);
                break;
            case 1:
                j32 j32Var = new j32(this, recyclerView.getContext());
                j32Var.a = i;
                v0(j32Var);
                break;
            case 2:
                o42 o42Var = new o42(this, recyclerView.getContext());
                o42Var.a = i;
                v0(o42Var);
                break;
            case 3:
                r62 r62Var = new r62(this, recyclerView.getContext());
                r62Var.a = i;
                v0(r62Var);
                break;
            default:
                b72 b72Var = new b72(this, recyclerView.getContext());
                b72Var.a = i;
                v0(b72Var);
                break;
        }
    }

    @Override // x46
    public final void y0(c89 c89Var, int[] iArr) {
        switch (this.U) {
            case 2:
                super.y0(c89Var, iArr);
                iArr[1] = Math.max(iArr[1], ((s42) this.V).M.getHeight());
                break;
            default:
                super.y0(c89Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q22(f12 f12Var, int i, d79 d79Var, byte b) {
        super(i, 0, d79Var);
        this.U = b;
        this.V = f12Var;
    }
}
