package v4;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.sd;
import java.util.WeakHashMap;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class v {
    public static final sd b = new sd(3);
    public static final sd c = new sd(4);
    public int a = -1;

    public static int c(int i7, int i10) {
        int i11;
        int i12 = i7 & 789516;
        if (i12 == 0) {
            return i7;
        }
        int i13 = i7 & (~i12);
        if (i10 == 0) {
            i11 = i12 << 2;
        } else {
            int i14 = i12 << 1;
            i13 |= (-789517) & i14;
            i11 = (i14 & 789516) << 2;
        }
        return i13 | i11;
    }

    public static int l(int i7, int i10) {
        int i11 = i10 | i7;
        return (i7 << 16) | (i10 << 8) | i11;
    }

    public void a(RecyclerView recyclerView, d1 d1Var) {
        View view = d1Var.a;
        Object tag = view.getTag();
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.a0.h(view, floatValue);
        }
        view.setTag(null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int b(int i7, int i10) {
        int i11;
        int i12 = i7 & 3158064;
        if (i12 == 0) {
            return i7;
        }
        int i13 = i7 & (~i12);
        if (i10 == 0) {
            i11 = i12 >> 2;
        } else {
            int i14 = i12 >> 1;
            i13 |= (-3158065) & i14;
            i11 = (i14 & 3158064) >> 2;
        }
        return i13 | i11;
    }

    public long d(RecyclerView recyclerView, int i7, float f10, float f11) {
        l0 itemAnimator = recyclerView.getItemAnimator();
        return itemAnimator == null ? i7 == 8 ? 200L : 250L : i7 == 8 ? itemAnimator.j() : itemAnimator.d;
    }

    public abstract int e(RecyclerView recyclerView, d1 d1Var);

    public float g() {
        return 0.5f;
    }

    public final int i(int i7, int i10, long j3) {
        if (this.a == -1) {
            this.a = org.telegram.messenger.g0.L(20.0f);
        }
        int interpolation = (int) (b.getInterpolation(j3 <= 500 ? j3 / 500.0f : 1.0f) * ((int) (c.getInterpolation(Math.min(1.0f, (Math.abs(i10) * 1.0f) / i7)) * ((int) Math.signum(i10)) * this.a)));
        return interpolation == 0 ? i10 > 0 ? 1 : -1 : interpolation;
    }

    public boolean j() {
        return true;
    }

    public boolean k() {
        return !(this instanceof cx);
    }

    public void m(Canvas canvas, RecyclerView recyclerView, d1 d1Var, float f10, float f11, int i7, boolean z9) {
        View view = d1Var.a;
        if (z9 && view.getTag() == null) {
            WeakHashMap weakHashMap = r0.i0.a;
            Float valueOf = Float.valueOf(r0.a0.e(view));
            int childCount = recyclerView.getChildCount();
            float f12 = 0.0f;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = r0.i0.a;
                    float e10 = r0.a0.e(childAt);
                    if (e10 > f12) {
                        f12 = e10;
                    }
                }
            }
            r0.a0.h(view, f12 + 1.0f);
            view.setTag(valueOf);
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    public abstract boolean n(RecyclerView recyclerView, d1 d1Var, d1 d1Var2);

    public void o(RecyclerView recyclerView, d1 d1Var, d1 d1Var2, int i7, int i10, int i11) {
        View view = d1Var2.a;
        n0 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof b0) {
            ((b0) layoutManager).b1(d1Var.a, view, i10, i11);
            return;
        }
        if (layoutManager.d()) {
            if (n0.x(view) <= recyclerView.getPaddingLeft()) {
                recyclerView.v0(i7);
            }
            if (n0.y(view) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.v0(i7);
            }
        }
        if (layoutManager.e()) {
            if (n0.z(view) <= recyclerView.getPaddingTop()) {
                recyclerView.v0(i7);
            }
            if (n0.v(view) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.v0(i7);
            }
        }
    }

    public abstract void q(d1 d1Var);

    public float f(float f10) {
        return f10;
    }

    public float h(float f10) {
        return f10;
    }

    public void p(d1 d1Var, int i7) {
    }
}
