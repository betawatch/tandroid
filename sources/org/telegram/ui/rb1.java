package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rb1 implements org.telegram.ui.Components.kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rb1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        Interpolator interpolator;
        int i11 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                ac1 ac1Var = (ac1) obj2;
                wb1 wb1Var = (wb1) obj;
                ThemeActivity themeActivity = ((yb1) obj3).e;
                int i12 = themeActivity.f;
                org.telegram.ui.ActionBar.g6 A0 = i12 == 1 ? org.telegram.ui.ActionBar.h6.J : org.telegram.ui.ActionBar.h6.A0();
                if (i10 == ac1Var.h() - 1) {
                    interpolator = null;
                    themeActivity.presentFragment(new od1(A0, false, 1, false, i12 == 1));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) ac1Var.e.get(i10);
                    if (!TextUtils.isEmpty(f6Var.o) && f6Var.a != org.telegram.ui.ActionBar.h6.n) {
                        org.telegram.ui.ActionBar.c6.a(false);
                    }
                    int i13 = A0.Y;
                    int i14 = f6Var.a;
                    if (i13 != i14) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(i12 == 1), null, Integer.valueOf(f6Var.a));
                        org.telegram.ui.ActionBar.b4.q(A0, f6Var.a);
                        org.telegram.ui.ActionBar.h6.F1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new od1(A0, false, 1, i14 >= 100, i12 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i15 = left - dp;
                if (i15 < 0) {
                    wb1Var.v0(i15, 0, interpolator);
                } else {
                    int i16 = right + dp;
                    if (i16 > wb1Var.getMeasuredWidth()) {
                        wb1Var.v0(i16 - wb1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = wb1Var.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = wb1Var.getChildAt(i17);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                n11.V((n11) obj3, (Context) obj2, (String) obj, view, i10);
                break;
        }
    }
}
