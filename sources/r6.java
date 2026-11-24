// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class r6 extends LinearLayout {
    public boolean a;
    public final a b;
    public boolean c;
    public boolean d;
    public ArrayList e;
    public Runnable f;

    public r6(Context context, a aVar) {
        super(context);
        this.a = true;
        setOrientation(0);
        this.b = aVar;
    }

    public final r7 a(int i, int i2) {
        boolean z = this.c;
        a aVar = this.b;
        return c(i, i2, null, z ? aVar.r0 : aVar.q0, null, gm.L(48.0f), null, null);
    }

    public final r7 b(int i, int i2, ylb ylbVar) {
        boolean z = this.c;
        a aVar = this.b;
        return c(i, i2, null, z ? aVar.r0 : aVar.q0, null, gm.L(48.0f), null, ylbVar);
    }

    public final r7 c(int i, int i2, String str, int i3, Drawable drawable, int i4, String str2, ylb ylbVar) {
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.e = arrayList;
        }
        arrayList.add(Integer.valueOf(i));
        return f(-1, i, i2, str, i3, drawable, i4, str2, ylbVar);
    }

    public final r7 d(int i, Drawable drawable) {
        boolean z = this.c;
        a aVar = this.b;
        return c(i, 0, null, z ? aVar.r0 : aVar.q0, drawable, gm.L(48.0f), null, null);
    }

    public final r7 e(int i, String str) {
        boolean z = this.c;
        a aVar = this.b;
        return c(i, 0, str, z ? aVar.r0 : aVar.q0, null, 0, str, null);
    }

    public final r7 f(int i, int i2, int i3, String str, int i4, Drawable drawable, int i5, String str2, ylb ylbVar) {
        Context context = getContext();
        boolean z = this.c;
        a aVar = this.b;
        r7 r7Var = new r7(context, this, i4, z ? aVar.t0 : aVar.s0, str != null, ylbVar);
        r7Var.setTag(Integer.valueOf(i2));
        if (str != null) {
            r7Var.F.setText(str);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5 != 0 ? i5 : -2, -1);
            int L = gm.L(14.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
            addView(r7Var, i, layoutParams);
        } else {
            s09 s09Var = r7Var.y;
            if (drawable != null) {
                if (drawable instanceof p09) {
                    s09Var.setAnimation((p09) drawable);
                } else {
                    s09Var.setImageDrawable(drawable);
                }
            } else if (i3 != 0) {
                s09Var.setImageResource(i3);
            }
            addView(r7Var, i, new LinearLayout.LayoutParams(i5, -1));
        }
        r7Var.setOnClickListener(new j1(this, (byte) 3));
        if (str2 != null) {
            r7Var.setContentDescription(str2);
        }
        return r7Var;
    }

    public final r7 g(int i, int i2, int i3) {
        boolean z = this.c;
        a aVar = this.b;
        return c(i, i2, null, z ? aVar.r0 : aVar.q0, null, i3, null, null);
    }

    public int getClosingSearchFieldWidth() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof r7) {
                r7 r7Var = (r7) childAt;
                if (r7Var.v() && r7Var.w() && !r7Var.x()) {
                    View searchContainer = r7Var.getSearchContainer();
                    while (true) {
                        if (searchContainer == null) {
                            break;
                        }
                        if (searchContainer.getParent() != this) {
                            searchContainer = searchContainer.getParent() instanceof View ? (View) searchContainer.getParent() : null;
                        } else if (searchContainer.getVisibility() != 8) {
                            int measuredWidth = searchContainer.getMeasuredWidth() + i;
                            if (searchContainer.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) searchContainer.getLayoutParams();
                                i = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + measuredWidth;
                            } else {
                                i = measuredWidth;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float f = Float.POSITIVE_INFINITY;
        float f2 = Float.NEGATIVE_INFINITY;
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof r7) && childAt.getVisibility() == 0) {
                float x = childAt.getX();
                f = Math.min(f, x);
                f2 = Math.max(f2, childAt.getWidth() + x);
                z = true;
            }
        }
        if (z) {
            return (int) (f2 - f);
        }
        return 0;
    }

    public int getVisibleItemsMeasuredWidth() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof r7) && childAt.getVisibility() != 8) {
                i = childAt.getMeasuredWidth() + i;
            }
        }
        return i;
    }

    public int getVisibleItemsMeasuredWidthWithAlpha() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof r7) && childAt.getVisibility() == 0) {
                f = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f;
            }
        }
        return (int) f;
    }

    public final r7 h(int i, int i2, int i3, String str) {
        boolean z = this.c;
        a aVar = this.b;
        return c(i, i2, null, z ? aVar.r0 : aVar.q0, null, i3, str, null);
    }

    public final void i(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof r7) {
                r7 r7Var = (r7) childAt;
                if (r7Var.v() && r7Var.w()) {
                    n7 n7Var = r7Var.I;
                    if (n7Var == null || n7Var.b()) {
                        this.b.B(false);
                        r7Var.T(z);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final r7 j(int i) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i));
        if (findViewWithTag instanceof r7) {
            return (r7) findViewWithTag;
        }
        return null;
    }

    public final int k() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof r7) {
                i = childAt.getMeasuredWidth() + i;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q6 l(int i, int i2, int i3, Drawable drawable, int i4, ylb ylbVar) {
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.e = arrayList;
        }
        arrayList.add(Integer.valueOf(i));
        q6 q6Var = new q6();
        q6Var.i = 1.0f;
        q6Var.l = (byte) 8;
        q6Var.a = this;
        q6Var.b = i;
        q6Var.c = i2;
        q6Var.e = i3;
        q6Var.f = drawable;
        q6Var.g = i4;
        q6Var.h = ylbVar;
        return q6Var;
    }

    public final q6 m(ylb ylbVar) {
        boolean z = this.c;
        a aVar = this.b;
        return l(32, R.drawable.call, z ? aVar.r0 : aVar.q0, null, gm.L(48.0f), ylbVar);
    }

    public final q6 n(Drawable drawable, ylb ylbVar) {
        boolean z = this.c;
        a aVar = this.b;
        return l(14, 0, z ? aVar.r0 : aVar.q0, drawable, gm.L(48.0f), ylbVar);
    }

    public final void o(int i) {
        c6 c6Var = this.b.v0;
        if (c6Var != null) {
            c6Var.b(i);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.n();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.d) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof r7) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = -gm.L(5.0f);
                        marginLayoutParams.rightMargin = -gm.L(5.0f);
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public final boolean p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof r7) {
                r7 r7Var = (r7) childAt;
                if (r7Var.getSearchContainer() != null && r7Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(int i, int i2) {
        r7 j = j(i);
        if (j != null) {
            j.setVisibility(i2);
        }
    }

    public final void r(float f) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof r7) {
                ((r7) childAt).setTransitionOffset(f);
            }
        }
    }

    public final void s() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof r7) {
                boolean z = this.c;
                a aVar = this.b;
                childAt.setBackgroundDrawable(cmb.f0(z ? aVar.r0 : aVar.q0, 1, -1));
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public void setFilter(sh4 sh4Var) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof r7) {
                r7 r7Var = (r7) childAt;
                if (r7Var.v()) {
                    r7Var.h0.add(sh4Var);
                    if (r7Var.G.getTag() != null) {
                        r7Var.i0 = r4.size() - 1;
                    }
                    r7Var.E();
                    return;
                }
            }
        }
    }

    public void setGlassMode(boolean z) {
        this.d = z;
    }

    public void setOnLayoutListener(Runnable runnable) {
        this.f = runnable;
    }

    public void setPopupItemsSelectorColor(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof r7) {
                ((r7) childAt).setPopupItemsSelectorColor(i);
            }
        }
    }

    public void setSearchCursorColor(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof r7) {
                r7 r7Var = (r7) childAt;
                if (r7Var.v()) {
                    r7Var.getSearchField().setCursorColor(i);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof r7) {
                r7 r7Var = (r7) childAt;
                if (r7Var.v()) {
                    r7Var.P(str, false);
                    r7Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void t() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof r7) {
                r7 r7Var = (r7) childAt;
                boolean z = this.c;
                a aVar = this.b;
                r7Var.setIconColor(z ? aVar.t0 : aVar.s0);
            }
        }
    }
}
