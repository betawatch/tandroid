package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class w51 implements org.telegram.ui.Components.gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w51(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        switch (this.a) {
            case 0:
                c61 c61Var = (c61) this.b;
                e61 e61Var = (e61) this.c;
                b61 b61Var = (b61) this.d;
                ThemeActivity themeActivity = c61Var.e;
                int i10 = themeActivity.f;
                org.telegram.ui.ActionBar.i6 D0 = i10 == 1 ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.D0();
                if (i7 == e61Var.b() - 1) {
                    themeActivity.presentFragment(new t71(D0, false, 1, false, i10 == 1));
                } else {
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) e61Var.e.get(i7);
                    if (!TextUtils.isEmpty(g6Var.o) && g6Var.a != org.telegram.ui.ActionBar.j6.n) {
                        org.telegram.ui.ActionBar.d6.a(false);
                    }
                    int i11 = D0.Z;
                    int i12 = g6Var.a;
                    if (i11 != i12) {
                        org.telegram.ui.ActionBar.j6.K1(D0, i10 == 1, i12, view);
                        org.telegram.ui.ActionBar.p3.q(D0, g6Var.a);
                        org.telegram.ui.ActionBar.j6.M1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new t71(D0, false, 1, i12 >= 100, i10 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i13 = left - L;
                if (i13 < 0) {
                    b61Var.w0(i13, 0, null);
                } else {
                    int i14 = right + L;
                    if (i14 > b61Var.getMeasuredWidth()) {
                        b61Var.w0(i14 - b61Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = b61Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = b61Var.getChildAt(i15);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                fx0.a0((fx0) this.b, (Context) this.c, (String) this.d, view, i7);
                break;
        }
    }
}
