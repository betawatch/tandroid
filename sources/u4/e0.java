package u4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e0 extends androidx.emoji2.text.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(b0 b0Var, int i3) {
        super(b0Var);
        this.d = i3;
    }

    @Override // androidx.emoji2.text.g
    public final int a(View view) {
        int y9;
        int i3;
        switch (this.d) {
            case 0:
                p0 p0Var = (p0) view.getLayoutParams();
                ((b0) this.b).getClass();
                y9 = o0.y(view);
                i3 = ((ViewGroup.MarginLayoutParams) p0Var).rightMargin;
                break;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                ((b0) this.b).getClass();
                y9 = o0.v(view);
                i3 = ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin;
                break;
        }
        return y9 + i3;
    }

    @Override // androidx.emoji2.text.g
    public final int b(View view) {
        int measuredWidth;
        int i3;
        switch (this.d) {
            case 0:
                p0 p0Var = (p0) view.getLayoutParams();
                ((b0) this.b).getClass();
                Rect rect = ((p0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin;
                i3 = ((ViewGroup.MarginLayoutParams) p0Var).rightMargin;
                break;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                ((b0) this.b).getClass();
                Rect rect2 = ((p0) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) p0Var2).topMargin;
                i3 = ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin;
                break;
        }
        return measuredWidth + i3;
    }

    @Override // androidx.emoji2.text.g
    public final int c(View view) {
        int measuredHeight;
        int i3;
        switch (this.d) {
            case 0:
                p0 p0Var = (p0) view.getLayoutParams();
                ((b0) this.b).getClass();
                Rect rect = ((p0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) p0Var).topMargin;
                i3 = ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin;
                break;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                ((b0) this.b).getClass();
                Rect rect2 = ((p0) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) p0Var2).leftMargin;
                i3 = ((ViewGroup.MarginLayoutParams) p0Var2).rightMargin;
                break;
        }
        return measuredHeight + i3;
    }

    @Override // androidx.emoji2.text.g
    public final int d(View view) {
        int x10;
        int i3;
        switch (this.d) {
            case 0:
                p0 p0Var = (p0) view.getLayoutParams();
                ((b0) this.b).getClass();
                x10 = o0.x(view);
                i3 = ((ViewGroup.MarginLayoutParams) p0Var).leftMargin;
                break;
            default:
                p0 p0Var2 = (p0) view.getLayoutParams();
                ((b0) this.b).getClass();
                x10 = o0.z(view);
                i3 = ((ViewGroup.MarginLayoutParams) p0Var2).topMargin;
                break;
        }
        return x10 - i3;
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
        int i3;
        int E;
        switch (this.d) {
            case 0:
                b0 b0Var = (b0) this.b;
                i3 = b0Var.m;
                E = b0Var.E();
                break;
            default:
                b0 b0Var2 = (b0) this.b;
                i3 = b0Var2.n;
                E = b0Var2.C();
                break;
        }
        return i3 - E;
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
    public final void n(int i3) {
        switch (this.d) {
            case 0:
                RecyclerView recyclerView = ((b0) this.b).b;
                if (recyclerView != null) {
                    int o10 = recyclerView.e.o();
                    for (int i10 = 0; i10 < o10; i10++) {
                        recyclerView.e.n(i10).offsetLeftAndRight(i3);
                    }
                    break;
                }
                break;
            default:
                RecyclerView recyclerView2 = ((b0) this.b).b;
                if (recyclerView2 != null) {
                    int o11 = recyclerView2.e.o();
                    for (int i11 = 0; i11 < o11; i11++) {
                        recyclerView2.e.n(i11).offsetTopAndBottom(i3);
                    }
                    break;
                }
                break;
        }
    }
}
