package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra1 implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ra1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        Interpolator interpolator;
        int i11 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                ab1 ab1Var = (ab1) obj2;
                wa1 wa1Var = (wa1) obj;
                ThemeActivity themeActivity = ((ya1) obj3).e;
                int i12 = themeActivity.f;
                org.telegram.ui.ActionBar.f6 A0 = i12 == 1 ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.A0();
                if (i10 == ab1Var.h() - 1) {
                    interpolator = null;
                    themeActivity.presentFragment(new qc1(A0, false, 1, false, i12 == 1));
                } else {
                    interpolator = null;
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) ab1Var.e.get(i10);
                    if (!TextUtils.isEmpty(e6Var.o) && e6Var.a != org.telegram.ui.ActionBar.g6.n) {
                        org.telegram.ui.ActionBar.b6.a(false);
                    }
                    int i13 = A0.U;
                    int i14 = e6Var.a;
                    if (i13 != i14) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, A0, Boolean.valueOf(i12 == 1), null, Integer.valueOf(e6Var.a));
                        org.telegram.ui.ActionBar.b4.q(A0, e6Var.a);
                        org.telegram.ui.ActionBar.g6.F1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new qc1(A0, false, 1, i14 >= 100, i12 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i15 = left - dp;
                if (i15 < 0) {
                    wa1Var.v0(i15, 0, interpolator);
                } else {
                    int i16 = right + dp;
                    if (i16 > wa1Var.getMeasuredWidth()) {
                        wa1Var.v0(i16 - wa1Var.getMeasuredWidth(), 0, interpolator);
                    }
                }
                int childCount = wa1Var.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = wa1Var.getChildAt(i17);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                t01.V((t01) obj3, (Context) obj2, (String) obj, view, i10);
                break;
        }
    }
}
