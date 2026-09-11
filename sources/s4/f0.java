package s4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class f0 extends androidx.emoji2.text.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(c0 c0Var, int i10) {
        super(c0Var);
        this.d = i10;
    }

    @Override // androidx.emoji2.text.g
    public final int a(View view) {
        int y3;
        int i10;
        switch (this.d) {
            case 0:
                p0 p0Var = (p0) view.getLayoutParams();
                ((c0) this.b).getClass();
                y3 = o0.y(view);
                i10 = ((ViewGroup.MarginLayoutParams) p0Var).rightMargin;
                break;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                ((c0) this.b).getClass();
                y3 = o0.v(view);
                i10 = ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin;
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
                p0 p0Var = (p0) view.getLayoutParams();
                ((c0) this.b).getClass();
                Rect rect = ((p0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) p0Var).rightMargin;
                break;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                ((c0) this.b).getClass();
                Rect rect2 = ((p0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) p0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin;
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
                p0 p0Var = (p0) view.getLayoutParams();
                ((c0) this.b).getClass();
                Rect rect = ((p0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) p0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin;
                break;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                ((c0) this.b).getClass();
                Rect rect2 = ((p0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) p0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) p0Var2).rightMargin;
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
                p0 p0Var = (p0) view.getLayoutParams();
                ((c0) this.b).getClass();
                x10 = o0.x(view);
                i10 = ((ViewGroup.MarginLayoutParams) p0Var).leftMargin;
                break;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                ((c0) this.b).getClass();
                x10 = o0.z(view);
                i10 = ((ViewGroup.MarginLayoutParams) p0Var2).topMargin;
                break;
        }
        return x10 - i10;
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
        int i10;
        int E;
        switch (this.d) {
            case 0:
                c0 c0Var = (c0) this.b;
                i10 = c0Var.m;
                E = c0Var.E();
                break;
            default:
                c0 c0Var2 = (c0) this.b;
                i10 = c0Var2.n;
                E = c0Var2.C();
                break;
        }
        return i10 - E;
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
    public final void n(int i10) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((c0) this.b).b;
                if (recyclerView != null) {
                    int y3 = recyclerView.e.y();
                    for (int i11 = 0; i11 < y3; i11++) {
                        recyclerView.e.x(i11).offsetLeftAndRight(i10);
                    }
                    break;
                }
                break;
            default:
                RecyclerView recyclerView2 = ((c0) this.b).b;
                if (recyclerView2 != null) {
                    int y10 = recyclerView2.e.y();
                    for (int i12 = 0; i12 < y10; i12++) {
                        recyclerView2.e.x(i12).offsetTopAndBottom(i10);
                    }
                    break;
                }
                break;
        }
    }
}
