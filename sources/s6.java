// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class s6 extends LinearLayout {
    public boolean a;
    public final a b;
    public boolean c;
    public boolean d;
    public ArrayList e;
    public Runnable f;

    public s6(Context context, a aVar) {
        super(context);
        this.a = true;
        setOrientation(0);
        this.b = aVar;
    }

    public final s7 a(int i, int i2) {
        boolean z = this.c;
        a aVar = this.b;
        return c(i, i2, null, z ? aVar.r0 : aVar.q0, null, hl.L(48.0f), null, null);
    }

    public final s7 b(int i, int i2, vnb vnbVar) {
        boolean z = this.c;
        a aVar = this.b;
        return c(i, i2, null, z ? aVar.r0 : aVar.q0, null, hl.L(48.0f), null, vnbVar);
    }

    public final s7 c(int i, int i2, String str, int i3, Drawable drawable, int i4, String str2, vnb vnbVar) {
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.e = arrayList;
        }
        arrayList.add(Integer.valueOf(i));
        return f(-1, i, i2, str, i3, drawable, i4, str2, vnbVar);
    }

    public final s7 d(int i, Drawable drawable) {
        boolean z = this.c;
        a aVar = this.b;
        return c(i, 0, null, z ? aVar.r0 : aVar.q0, drawable, hl.L(48.0f), null, null);
    }

    public final s7 e(int i, String str) {
        boolean z = this.c;
        a aVar = this.b;
        return c(i, 0, str, z ? aVar.r0 : aVar.q0, null, 0, str, null);
    }

    public final s7 f(int i, int i2, int i3, String str, int i4, Drawable drawable, int i5, String str2, vnb vnbVar) {
        Context context = getContext();
        boolean z = this.c;
        a aVar = this.b;
        s7 s7Var = new s7(context, this, i4, z ? aVar.t0 : aVar.s0, str != null, vnbVar);
        s7Var.setTag(Integer.valueOf(i2));
        if (str != null) {
            s7Var.F.setText(str);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5 != 0 ? i5 : -2, -1);
            int L = hl.L(14.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
            addView(s7Var, i, layoutParams);
        } else {
            e29 e29Var = s7Var.y;
            if (drawable != null) {
                if (drawable instanceof b29) {
                    e29Var.setAnimation((b29) drawable);
                } else {
                    e29Var.setImageDrawable(drawable);
                }
            } else if (i3 != 0) {
                e29Var.setImageResource(i3);
            }
            addView(s7Var, i, new LinearLayout.LayoutParams(i5, -1));
        }
        s7Var.setOnClickListener(new k1(this, (byte) 3));
        if (str2 != null) {
            s7Var.setContentDescription(str2);
        }
        return s7Var;
    }

    public final s7 g(int i, int i2, int i3) {
        boolean z = this.c;
        a aVar = this.b;
        return c(i, i2, null, z ? aVar.r0 : aVar.q0, null, i3, null, null);
    }

    public int getClosingSearchFieldWidth() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.v() && s7Var.w() && !s7Var.x()) {
                    View searchContainer = s7Var.getSearchContainer();
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
            if ((childAt instanceof s7) && childAt.getVisibility() == 0) {
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
            if ((childAt instanceof s7) && childAt.getVisibility() != 8) {
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
            if ((childAt instanceof s7) && childAt.getVisibility() == 0) {
                f = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f;
            }
        }
        return (int) f;
    }

    public final s7 h(int i, int i2, int i3, String str) {
        boolean z = this.c;
        a aVar = this.b;
        return c(i, i2, null, z ? aVar.r0 : aVar.q0, null, i3, str, null);
    }

    public final void i(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.v() && s7Var.w()) {
                    o7 o7Var = s7Var.I;
                    if (o7Var == null || o7Var.b()) {
                        this.b.C(false);
                        s7Var.T(z);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final s7 j(int i) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i));
        if (findViewWithTag instanceof s7) {
            return (s7) findViewWithTag;
        }
        return null;
    }

    public final int k() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof s7) {
                i = childAt.getMeasuredWidth() + i;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r6 l(int i, int i2, int i3, Drawable drawable, int i4, vnb vnbVar) {
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.e = arrayList;
        }
        arrayList.add(Integer.valueOf(i));
        r6 r6Var = new r6();
        r6Var.i = 1.0f;
        r6Var.l = (byte) 8;
        r6Var.a = this;
        r6Var.b = i;
        r6Var.c = i2;
        r6Var.e = i3;
        r6Var.f = drawable;
        r6Var.g = i4;
        r6Var.h = vnbVar;
        return r6Var;
    }

    public final r6 m(vnb vnbVar) {
        boolean z = this.c;
        a aVar = this.b;
        return l(32, R.drawable.call, z ? aVar.r0 : aVar.q0, null, hl.L(48.0f), vnbVar);
    }

    public final r6 n(Drawable drawable, vnb vnbVar) {
        boolean z = this.c;
        a aVar = this.b;
        return l(14, 0, z ? aVar.r0 : aVar.q0, drawable, hl.L(48.0f), vnbVar);
    }

    public final void o(int i) {
        d6 d6Var = this.b.v0;
        if (d6Var != null) {
            d6Var.b(i);
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
                if (childAt instanceof s7) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = -hl.L(5.0f);
                        marginLayoutParams.rightMargin = -hl.L(5.0f);
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
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.getSearchContainer() != null && s7Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(int i, int i2) {
        s7 j = j(i);
        if (j != null) {
            j.setVisibility(i2);
        }
    }

    public final void r(float f) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof s7) {
                ((s7) childAt).setTransitionOffset(f);
            }
        }
    }

    public final void s() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof s7) {
                boolean z = this.c;
                a aVar = this.b;
                childAt.setBackgroundDrawable(aob.f0(z ? aVar.r0 : aVar.q0, 1, -1));
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

    public void setFilter(ph4 ph4Var) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.v()) {
                    s7Var.h0.add(ph4Var);
                    if (s7Var.G.getTag() != null) {
                        s7Var.i0 = r4.size() - 1;
                    }
                    s7Var.E();
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
            if (childAt instanceof s7) {
                ((s7) childAt).setPopupItemsSelectorColor(i);
            }
        }
    }

    public void setSearchCursorColor(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.v()) {
                    s7Var.getSearchField().setCursorColor(i);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.v()) {
                    s7Var.P(str, false);
                    s7Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void t() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                boolean z = this.c;
                a aVar = this.b;
                s7Var.setIconColor(z ? aVar.t0 : aVar.s0);
            }
        }
    }
}
