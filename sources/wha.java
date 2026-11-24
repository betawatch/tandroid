// default package

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wha extends LinearLayout {
    public final pha a;
    public final boolean b;
    public final HashMap c;
    public final ArrayList d;
    public final x46 e;
    public boolean f;

    public wha(Context context, pha phaVar, boolean z) {
        super(context);
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new x46(new tha(this), s33.h, 380L);
        this.f = true;
        this.a = phaVar;
        this.b = z;
        setOrientation(0);
        setGravity(21);
    }

    public static int e(View view) {
        int measuredWidth;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (view.getMeasuredWidth() > 0 || (measuredWidth = layoutParams.width) <= 0) {
            measuredWidth = view.getMeasuredWidth();
        }
        return measuredWidth + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public static boolean g(View view) {
        if (view.getVisibility() != 8) {
            return !(view instanceof xha) || ((xha) view).D0;
        }
        return false;
    }

    public final xha a(int i, int i2) {
        return b(i, i2, null, null, gl.L(48.0f), null);
    }

    public final xha b(final int i, int i2, String str, oy8 oy8Var, int i3, String str2) {
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        pha phaVar = this.a;
        boolean z = this.b;
        final xha xhaVar = new xha(context, this, z ? phaVar.j0 : phaVar.i0, z ? phaVar.h0 : phaVar.g0, str != null, phaVar.a);
        xhaVar.setTag(Integer.valueOf(i));
        if (str != null) {
            xhaVar.F.setText(str);
            if (i3 == 0) {
                i3 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i3, -1);
            int L = gl.L(6.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
        } else {
            boolean A = ug8.A(oy8Var);
            ry8 ry8Var = xhaVar.y;
            if (A) {
                ry8Var.setAnimation(oy8Var);
            } else if (oy8Var != null) {
                ry8Var.setImageDrawable(oy8Var);
            } else if (i2 != 0) {
                ry8Var.setImageResource(i2);
            }
            layoutParams = new LinearLayout.LayoutParams(i3, -1);
            int i4 = -gl.L(5.0f);
            layoutParams.rightMargin = i4;
            layoutParams.leftMargin = i4;
        }
        addView(xhaVar, -1, layoutParams);
        xhaVar.setOnClickListener(new View.OnClickListener() { // from class: uha
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pha phaVar2 = wha.this.a;
                xha xhaVar2 = xhaVar;
                if (xhaVar2.t()) {
                    c6 c6Var = phaVar2.W;
                    if (c6Var == null || c6Var.a()) {
                        xhaVar2.U(null, null);
                        return;
                    }
                    return;
                }
                if (xhaVar2.B0) {
                    phaVar2.C(true, true);
                    return;
                }
                c6 c6Var2 = phaVar2.W;
                if (c6Var2 != null) {
                    c6Var2.b(i);
                }
            }
        });
        if (str2 != null) {
            xhaVar.setContentDescription(str2);
        }
        return xhaVar;
    }

    public final void c(int i, int i2, int i3, String str) {
        b(i, i2, null, null, i3, str);
    }

    public final void d() {
        int i;
        Iterator it = this.c.values().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            } else {
                ((vha) it.next()).b = false;
            }
        }
        float width = getWidth() - getPaddingRight();
        x46 x46Var = this.e;
        float f = x46Var.d.f.a;
        float min = Math.min(1.0f, getPillWidth() / gl.L(46.0f));
        ArrayList arrayList = x46Var.b;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u46 u46Var = (u46) obj;
            vha vhaVar = (vha) u46Var.a;
            View view = vhaVar.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            RectF b = u46Var.b();
            vhaVar.b = true;
            view.setTranslationX((((width - Math.max(f, b.right)) + b.left) + layoutParams.leftMargin) - view.getLeft());
            vhaVar.c(u46Var.c(), min);
        }
    }

    public final void f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof r7) {
                ((r7) childAt).p();
            }
        }
    }

    public float getPillWidth() {
        w46 w46Var = this.e.d;
        return (gl.L(8.0f) * w46Var.c.a) + w46Var.f.a;
    }

    public float getTargetPillWidth() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            if (g(getChildAt(i))) {
                f += e(r4);
            }
        }
        if (f > 0.0f) {
            return f + gl.L(8.0f);
        }
        return 0.0f;
    }

    public final void h() {
        int i;
        pha phaVar = this.a;
        boolean z = this.b;
        int i2 = z ? phaVar.h0 : phaVar.g0;
        int i3 = z ? phaVar.j0 : phaVar.i0;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof r7) {
                r7 r7Var = (r7) childAt;
                TextView textView = r7Var.F;
                r7Var.setIconColor(i2);
                if (textView != null) {
                    textView.setTextColor(i2);
                    i = 5;
                } else {
                    i = 1;
                }
                r7Var.setBackground(bkb.f0(i3, i, -1));
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        HashMap hashMap;
        super.onLayout(z, i, i2, i3, i4);
        ArrayList arrayList = this.d;
        arrayList.clear();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            hashMap = this.c;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            vha vhaVar = (vha) hashMap.get(childAt);
            if (vhaVar != null && g(childAt)) {
                arrayList.add(vhaVar);
            }
            i5++;
        }
        this.e.m(arrayList, !this.f && isLaidOut());
        this.f = false;
        d();
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            vha vhaVar2 = (vha) hashMap.get(childAt2);
            if (vhaVar2 != null && !vhaVar2.b && childAt2.getVisibility() != 8 && !g(childAt2)) {
                if (childAt2 instanceof xha) {
                    ((xha) childAt2).X();
                } else {
                    childAt2.setVisibility(8);
                }
            }
        }
        this.a.invalidate();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.c.put(view, new vha(view));
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
