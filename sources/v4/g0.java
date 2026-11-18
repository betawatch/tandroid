package v4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class g0 extends androidx.emoji2.text.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(c0 c0Var, int i7) {
        super(c0Var);
        this.d = i7;
    }

    @Override // androidx.emoji2.text.g
    public final int a(View view) {
        int y10;
        int i7;
        switch (this.d) {
            case 0:
                q0 q0Var = (q0) view.getLayoutParams();
                ((c0) this.b).getClass();
                y10 = p0.y(view);
                i7 = ((ViewGroup.MarginLayoutParams) q0Var).rightMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((c0) this.b).getClass();
                y10 = p0.v(view);
                i7 = ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin;
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
                q0 q0Var = (q0) view.getLayoutParams();
                ((c0) this.b).getClass();
                Rect rect = ((q0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin;
                i7 = ((ViewGroup.MarginLayoutParams) q0Var).rightMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((c0) this.b).getClass();
                Rect rect2 = ((q0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) q0Var2).topMargin;
                i7 = ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin;
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
                q0 q0Var = (q0) view.getLayoutParams();
                ((c0) this.b).getClass();
                Rect rect = ((q0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) q0Var).topMargin;
                i7 = ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((c0) this.b).getClass();
                Rect rect2 = ((q0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) q0Var2).leftMargin;
                i7 = ((ViewGroup.MarginLayoutParams) q0Var2).rightMargin;
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
                q0 q0Var = (q0) view.getLayoutParams();
                ((c0) this.b).getClass();
                x10 = p0.x(view);
                i7 = ((ViewGroup.MarginLayoutParams) q0Var).leftMargin;
                break;
            default:
                q0 q0Var2 = (q0) view.getLayoutParams();
                ((c0) this.b).getClass();
                x10 = p0.z(view);
                i7 = ((ViewGroup.MarginLayoutParams) q0Var2).topMargin;
                break;
        }
        return x10 - i7;
    }

    @Override // androidx.emoji2.text.g
    public final int e() {
        switch (this.d) {
            case 0:
                return ((c0) this.b).m;
            default:
                return ((c0) this.b).n;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int f() {
        int i7;
        int E;
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.b;
                i7 = c0Var.m;
                E = c0Var.E();
                break;
            default:
                c0 c0Var2 = (c0) this.b;
                i7 = c0Var2.n;
                E = c0Var2.C();
                break;
        }
        return i7 - E;
    }

    @Override // androidx.emoji2.text.g
    public final int g() {
        switch (this.d) {
            case 0:
                return ((c0) this.b).E();
            default:
                return ((c0) this.b).C();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((c0) this.b).k;
            default:
                return ((c0) this.b).l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((c0) this.b).l;
            default:
                return ((c0) this.b).k;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((c0) this.b).D();
            default:
                return ((c0) this.b).J();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.b;
                return (c0Var.m - c0Var.D()) - c0Var.E();
            default:
                return ((c0) this.b).K();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l(View view) {
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.b;
                Rect rect = (Rect) this.c;
                c0Var.L(view, rect);
                return rect.right;
            default:
                c0 c0Var2 = (c0) this.b;
                Rect rect2 = (Rect) this.c;
                c0Var2.L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int m(View view) {
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.b;
                Rect rect = (Rect) this.c;
                c0Var.L(view, rect);
                return rect.left;
            default:
                c0 c0Var2 = (c0) this.b;
                Rect rect2 = (Rect) this.c;
                c0Var2.L(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void n(int i7) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((c0) this.b).b;
                if (recyclerView != null) {
                    int u10 = recyclerView.e.u();
                    for (int i10 = 0; i10 < u10; i10++) {
                        recyclerView.e.t(i10).offsetLeftAndRight(i7);
                    }
                    break;
                }
                break;
            default:
                RecyclerView recyclerView2 = ((c0) this.b).b;
                if (recyclerView2 != null) {
                    int u11 = recyclerView2.e.u();
                    for (int i11 = 0; i11 < u11; i11++) {
                        recyclerView2.e.t(i11).offsetTopAndBottom(i7);
                    }
                    break;
                }
                break;
        }
    }
}
