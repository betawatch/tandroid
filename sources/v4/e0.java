package v4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e0 extends androidx.emoji2.text.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(b0 b0Var, int i7) {
        super(b0Var);
        this.d = i7;
    }

    @Override // androidx.emoji2.text.g
    public final int a(View view) {
        int y10;
        int i7;
        switch (this.d) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                ((b0) this.b).getClass();
                y10 = n0.y(view);
                i7 = ((ViewGroup.MarginLayoutParams) o0Var).rightMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((b0) this.b).getClass();
                y10 = n0.v(view);
                i7 = ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin;
                break;
        }
        return y10 + i7;
    }

    @Override // androidx.emoji2.text.g
    public final int b(View view) {
        int measuredWidth;
        int i7;
        switch (this.d) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                ((b0) this.b).getClass();
                Rect rect = ((o0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin;
                i7 = ((ViewGroup.MarginLayoutParams) o0Var).rightMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((b0) this.b).getClass();
                Rect rect2 = ((o0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) o0Var2).topMargin;
                i7 = ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin;
                break;
        }
        return measuredWidth + i7;
    }

    @Override // androidx.emoji2.text.g
    public final int c(View view) {
        int measuredHeight;
        int i7;
        switch (this.d) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                ((b0) this.b).getClass();
                Rect rect = ((o0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) o0Var).topMargin;
                i7 = ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((b0) this.b).getClass();
                Rect rect2 = ((o0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) o0Var2).leftMargin;
                i7 = ((ViewGroup.MarginLayoutParams) o0Var2).rightMargin;
                break;
        }
        return measuredHeight + i7;
    }

    @Override // androidx.emoji2.text.g
    public final int d(View view) {
        int x10;
        int i7;
        switch (this.d) {
            case 0:
                o0 o0Var = (o0) view.getLayoutParams();
                ((b0) this.b).getClass();
                x10 = n0.x(view);
                i7 = ((ViewGroup.MarginLayoutParams) o0Var).leftMargin;
                break;
            default:
                o0 o0Var2 = (o0) view.getLayoutParams();
                ((b0) this.b).getClass();
                x10 = n0.z(view);
                i7 = ((ViewGroup.MarginLayoutParams) o0Var2).topMargin;
                break;
        }
        return x10 - i7;
    }

    @Override // androidx.emoji2.text.g
    public final int e() {
        switch (this.d) {
            case 0:
                return ((b0) this.b).m;
            default:
                return ((b0) this.b).n;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int f() {
        int i7;
        int E;
        switch (this.d) {
            case 0:
                b0 b0Var = (b0) this.b;
                i7 = b0Var.m;
                E = b0Var.E();
                break;
            default:
                b0 b0Var2 = (b0) this.b;
                i7 = b0Var2.n;
                E = b0Var2.C();
                break;
        }
        return i7 - E;
    }

    @Override // androidx.emoji2.text.g
    public final int g() {
        switch (this.d) {
            case 0:
                return ((b0) this.b).E();
            default:
                return ((b0) this.b).C();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((b0) this.b).k;
            default:
                return ((b0) this.b).l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((b0) this.b).l;
            default:
                return ((b0) this.b).k;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((b0) this.b).D();
            default:
                return ((b0) this.b).J();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.d) {
            case 0:
                b0 b0Var = (b0) this.b;
                return (b0Var.m - b0Var.D()) - b0Var.E();
            default:
                return ((b0) this.b).K();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l(View view) {
        switch (this.d) {
            case 0:
                b0 b0Var = (b0) this.b;
                Rect rect = (Rect) this.c;
                b0Var.L(view, rect);
                return rect.right;
            default:
                b0 b0Var2 = (b0) this.b;
                Rect rect2 = (Rect) this.c;
                b0Var2.L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int m(View view) {
        switch (this.d) {
            case 0:
                b0 b0Var = (b0) this.b;
                Rect rect = (Rect) this.c;
                b0Var.L(view, rect);
                return rect.left;
            default:
                b0 b0Var2 = (b0) this.b;
                Rect rect2 = (Rect) this.c;
                b0Var2.L(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void n(int i7) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((b0) this.b).b;
                if (recyclerView != null) {
                    int v = recyclerView.e.v();
                    for (int i10 = 0; i10 < v; i10++) {
                        recyclerView.e.u(i10).offsetLeftAndRight(i7);
                    }
                    break;
                }
                break;
            default:
                RecyclerView recyclerView2 = ((b0) this.b).b;
                if (recyclerView2 != null) {
                    int v10 = recyclerView2.e.v();
                    for (int i11 = 0; i11 < v10; i11++) {
                        recyclerView2.e.u(i11).offsetTopAndBottom(i7);
                    }
                    break;
                }
                break;
        }
    }
}
