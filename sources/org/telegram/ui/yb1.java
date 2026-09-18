package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb1 implements org.telegram.ui.Components.kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yb1(Object obj, Object obj2, Object obj3, int i10) {
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
                hc1 hc1Var = (hc1) obj2;
                dc1 dc1Var = (dc1) obj;
                ThemeActivity themeActivity = ((fc1) obj3).e;
                int i12 = themeActivity.f;
                org.telegram.ui.ActionBar.i6 A0 = i12 == 1 ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.A0();
                if (i10 == hc1Var.h() - 1) {
                    interpolator = null;
                    themeActivity.presentFragment(new vd1(A0, false, 1, false, i12 == 1));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) hc1Var.e.get(i10);
                    if (!TextUtils.isEmpty(g6Var.o) && g6Var.a != org.telegram.ui.ActionBar.j6.n) {
                        org.telegram.ui.ActionBar.d6.a(false);
                    }
                    int i13 = A0.Y;
                    int i14 = g6Var.a;
                    if (i13 != i14) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(i12 == 1), null, Integer.valueOf(g6Var.a));
                        org.telegram.ui.ActionBar.d4.q(A0, g6Var.a);
                        org.telegram.ui.ActionBar.j6.F1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new vd1(A0, false, 1, i14 >= 100, i12 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i15 = left - dp;
                if (i15 < 0) {
                    dc1Var.w0(i15, 0, interpolator);
                } else {
                    int i16 = right + dp;
                    if (i16 > dc1Var.getMeasuredWidth()) {
                        dc1Var.w0(i16 - dc1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = dc1Var.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = dc1Var.getChildAt(i17);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                w11.V((w11) obj3, (Context) obj2, (String) obj, view, i10);
                break;
        }
    }
}
