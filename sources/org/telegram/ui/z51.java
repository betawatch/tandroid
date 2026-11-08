package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z51 implements org.telegram.ui.Components.bj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z51(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        switch (this.a) {
            case 0:
                f61 f61Var = (f61) this.b;
                h61 h61Var = (h61) this.c;
                e61 e61Var = (e61) this.d;
                ThemeActivity themeActivity = f61Var.e;
                int i10 = themeActivity.f;
                org.telegram.ui.ActionBar.j6 D0 = i10 == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.D0();
                if (i7 == h61Var.b() - 1) {
                    themeActivity.presentFragment(new v71(D0, false, 1, false, i10 == 1));
                } else {
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) h61Var.e.get(i7);
                    if (!TextUtils.isEmpty(h6Var.o) && h6Var.a != org.telegram.ui.ActionBar.k6.n) {
                        org.telegram.ui.ActionBar.e6.a(false);
                    }
                    int i11 = D0.Y;
                    int i12 = h6Var.a;
                    if (i11 != i12) {
                        org.telegram.ui.ActionBar.k6.K1(D0, i10 == 1, i12, view);
                        org.telegram.ui.ActionBar.r3.q(D0, h6Var.a);
                        org.telegram.ui.ActionBar.k6.M1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new v71(D0, false, 1, i12 >= 100, i10 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i13 = left - L;
                if (i13 < 0) {
                    e61Var.w0(i13, 0, null);
                } else {
                    int i14 = right + L;
                    if (i14 > e61Var.getMeasuredWidth()) {
                        e61Var.w0(i14 - e61Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = e61Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = e61Var.getChildAt(i15);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                gx0.a0((gx0) this.b, (Context) this.c, (String) this.d, view, i7);
                break;
        }
    }
}
