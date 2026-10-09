package s4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g0 extends androidx.emoji2.text.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(d0 d0Var, int i10) {
        super(d0Var);
        this.d = i10;
    }

    @Override // androidx.emoji2.text.g
    public final int a(View view) {
        int y3;
        int i10;
        switch (this.d) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                ((d0) this.b).getClass();
                y3 = p0.y(view);
                i10 = ((ViewGroup.MarginLayoutParams) q0Var).rightMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((d0) this.b).getClass();
                y3 = p0.v(view);
                i10 = ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin;
                break;
        }
        return y3 + i10;
    }

    @Override // androidx.emoji2.text.g
    public final int b(View view) {
        int measuredWidth;
        int i10;
        switch (this.d) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                ((d0) this.b).getClass();
                Rect rect = ((q0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var).rightMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((d0) this.b).getClass();
                Rect rect2 = ((q0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) q0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin;
                break;
        }
        return measuredWidth + i10;
    }

    @Override // androidx.emoji2.text.g
    public final int c(View view) {
        int measuredHeight;
        int i10;
        switch (this.d) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                ((d0) this.b).getClass();
                Rect rect = ((q0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) q0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((d0) this.b).getClass();
                Rect rect2 = ((q0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) q0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) q0Var2).rightMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override // androidx.emoji2.text.g
    public final int d(View view) {
        int x10;
        int i10;
        switch (this.d) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                ((d0) this.b).getClass();
                x10 = p0.x(view);
                i10 = ((ViewGroup.MarginLayoutParams) q0Var).leftMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((d0) this.b).getClass();
                x10 = p0.z(view);
                i10 = ((ViewGroup.MarginLayoutParams) q0Var2).topMargin;
                break;
        }
        return x10 - i10;
    }

    @Override // androidx.emoji2.text.g
    public final int e() {
        switch (this.d) {
            case 0:
                return ((d0) this.b).m;
            default:
                return ((d0) this.b).n;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int f() {
        int i10;
        int E;
        switch (this.d) {
            case 0:
                d0 d0Var = (d0) this.b;
                i10 = d0Var.m;
                E = d0Var.E();
                break;
            default:
                d0 d0Var2 = (d0) this.b;
                i10 = d0Var2.n;
                E = d0Var2.C();
                break;
        }
        return i10 - E;
    }

    @Override // androidx.emoji2.text.g
    public final int g() {
        switch (this.d) {
            case 0:
                return ((d0) this.b).E();
            default:
                return ((d0) this.b).C();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((d0) this.b).k;
            default:
                return ((d0) this.b).l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((d0) this.b).l;
            default:
                return ((d0) this.b).k;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((d0) this.b).D();
            default:
                return ((d0) this.b).J();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.d) {
            case 0:
                d0 d0Var = (d0) this.b;
                return (d0Var.m - d0Var.D()) - d0Var.E();
            default:
                return ((d0) this.b).K();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l(View view) {
        switch (this.d) {
            case 0:
                d0 d0Var = (d0) this.b;
                Rect rect = (Rect) this.c;
                d0Var.L(view, rect);
                return rect.right;
            default:
                d0 d0Var2 = (d0) this.b;
                Rect rect2 = (Rect) this.c;
                d0Var2.L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int m(View view) {
        switch (this.d) {
            case 0:
                d0 d0Var = (d0) this.b;
                Rect rect = (Rect) this.c;
                d0Var.L(view, rect);
                return rect.left;
            default:
                d0 d0Var2 = (d0) this.b;
                Rect rect2 = (Rect) this.c;
                d0Var2.L(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void n(int i10) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((d0) this.b).b;
                if (recyclerView != null) {
                    int D = recyclerView.e.D();
                    for (int i11 = 0; i11 < D; i11++) {
                        recyclerView.e.C(i11).offsetLeftAndRight(i10);
                    }
                    break;
                }
                break;
            default:
                RecyclerView recyclerView2 = ((d0) this.b).b;
                if (recyclerView2 != null) {
                    int D2 = recyclerView2.e.D();
                    for (int i12 = 0; i12 < D2; i12++) {
                        recyclerView2.e.C(i12).offsetTopAndBottom(i10);
                    }
                    break;
                }
                break;
        }
    }
}
