// default package

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rla extends LinearLayout {
    public final jla a;
    public final boolean b;
    public final HashMap c;
    public final ArrayList d;
    public final b76 e;
    public boolean f;

    public rla(Context context, jla jlaVar, boolean z) {
        super(context);
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new b76(new ola(this), k43.h, 380L);
        this.f = true;
        this.a = jlaVar;
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
            return !(view instanceof sla) || ((sla) view).D0;
        }
        return false;
    }

    public final sla a(int i, int i2) {
        return b(i, i2, null, null, hl.L(48.0f), null);
    }

    public final sla b(final int i, int i2, String str, b29 b29Var, int i3, String str2) {
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        jla jlaVar = this.a;
        boolean z = this.b;
        final sla slaVar = new sla(context, this, z ? jlaVar.p0 : jlaVar.o0, z ? jlaVar.n0 : jlaVar.m0, str != null, jlaVar.a);
        slaVar.setTag(Integer.valueOf(i));
        if (str != null) {
            slaVar.F.setText(str);
            if (i3 == 0) {
                i3 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i3, -1);
            int L = hl.L(6.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
        } else {
            boolean A = ik8.A(b29Var);
            e29 e29Var = slaVar.y;
            if (A) {
                e29Var.setAnimation(b29Var);
            } else if (b29Var != null) {
                e29Var.setImageDrawable(b29Var);
            } else if (i2 != 0) {
                e29Var.setImageResource(i2);
            }
            layoutParams = new LinearLayout.LayoutParams(i3, -1);
            int i4 = -hl.L(5.0f);
            layoutParams.rightMargin = i4;
            layoutParams.leftMargin = i4;
        }
        addView(slaVar, -1, layoutParams);
        slaVar.setOnClickListener(new View.OnClickListener() { // from class: pla
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jla jlaVar2 = rla.this.a;
                sla slaVar2 = slaVar;
                if (slaVar2.t()) {
                    d6 d6Var = jlaVar2.f0;
                    if (d6Var == null || d6Var.a()) {
                        slaVar2.U(null, null);
                        return;
                    }
                    return;
                }
                if (slaVar2.B0) {
                    jlaVar2.F(true, true);
                    return;
                }
                d6 d6Var2 = jlaVar2.f0;
                if (d6Var2 != null) {
                    d6Var2.b(i);
                }
            }
        });
        if (str2 != null) {
            slaVar.setContentDescription(str2);
        }
        return slaVar;
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
                ((qla) it.next()).b = false;
            }
        }
        float width = getWidth() - getPaddingRight();
        b76 b76Var = this.e;
        float f = b76Var.d.f.a;
        float min = Math.min(1.0f, getPillWidth() / hl.L(46.0f));
        ArrayList arrayList = b76Var.b;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y66 y66Var = (y66) obj;
            qla qlaVar = (qla) y66Var.a;
            View view = qlaVar.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            RectF b = y66Var.b();
            qlaVar.b = true;
            view.setTranslationX((((width - Math.max(f, b.right)) + b.left) + layoutParams.leftMargin) - view.getLeft());
            qlaVar.c(y66Var.c(), min);
        }
    }

    public final void f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof s7) {
                ((s7) childAt).p();
            }
        }
    }

    public float getPillWidth() {
        a76 a76Var = this.e.d;
        return (hl.L(8.0f) * a76Var.c.a) + a76Var.f.a;
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
            return f + hl.L(8.0f);
        }
        return 0.0f;
    }

    public final void h() {
        int i;
        jla jlaVar = this.a;
        boolean z = this.b;
        int i2 = z ? jlaVar.n0 : jlaVar.m0;
        int i3 = z ? jlaVar.p0 : jlaVar.o0;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                TextView textView = s7Var.F;
                s7Var.setIconColor(i2);
                if (textView != null) {
                    textView.setTextColor(i2);
                    i = 5;
                } else {
                    i = 1;
                }
                s7Var.setBackground(aob.f0(i3, i, -1));
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
            qla qlaVar = (qla) hashMap.get(childAt);
            if (qlaVar != null && g(childAt)) {
                arrayList.add(qlaVar);
            }
            i5++;
        }
        this.e.m(arrayList, !this.f && isLaidOut());
        this.f = false;
        d();
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            qla qlaVar2 = (qla) hashMap.get(childAt2);
            if (qlaVar2 != null && !qlaVar2.b && childAt2.getVisibility() != 8 && !g(childAt2)) {
                if (childAt2 instanceof sla) {
                    ((sla) childAt2).X();
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
        this.c.put(view, new qla(view));
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
