package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb1 implements org.telegram.ui.Components.ml0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sb1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        Interpolator interpolator;
        int i11 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                bc1 bc1Var = (bc1) obj2;
                xb1 xb1Var = (xb1) obj;
                ThemeActivity themeActivity = ((zb1) obj3).e;
                int i12 = themeActivity.f;
                org.telegram.ui.ActionBar.h6 A0 = i12 == 1 ? org.telegram.ui.ActionBar.i6.J : org.telegram.ui.ActionBar.i6.A0();
                if (i10 == bc1Var.h() - 1) {
                    interpolator = null;
                    themeActivity.presentFragment(new pd1(A0, false, 1, false, i12 == 1));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) bc1Var.e.get(i10);
                    if (!TextUtils.isEmpty(f6Var.o) && f6Var.a != org.telegram.ui.ActionBar.i6.n) {
                        org.telegram.ui.ActionBar.c6.a(false);
                    }
                    int i13 = A0.Y;
                    int i14 = f6Var.a;
                    if (i13 != i14) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(i12 == 1), null, Integer.valueOf(f6Var.a));
                        org.telegram.ui.ActionBar.c4.q(A0, f6Var.a);
                        org.telegram.ui.ActionBar.i6.F1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new pd1(A0, false, 1, i14 >= 100, i12 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i15 = left - dp;
                if (i15 < 0) {
                    xb1Var.w0(i15, 0, interpolator);
                } else {
                    int i16 = right + dp;
                    if (i16 > xb1Var.getMeasuredWidth()) {
                        xb1Var.w0(i16 - xb1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = xb1Var.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = xb1Var.getChildAt(i17);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                p11.T((p11) obj3, (Context) obj2, (String) obj, view, i10);
                break;
        }
    }
}
