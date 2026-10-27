package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa1 implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wa1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.am0
    public final void c(int i10, View view) {
        switch (this.a) {
            case 0:
                db1 db1Var = (db1) this.b;
                fb1 fb1Var = (fb1) this.c;
                bb1 bb1Var = (bb1) this.d;
                ThemeActivity themeActivity = db1Var.e;
                int i11 = themeActivity.f;
                org.telegram.ui.ActionBar.x6 C0 = i11 == 1 ? org.telegram.ui.ActionBar.y6.J : org.telegram.ui.ActionBar.y6.C0();
                if (i10 == fb1Var.h() - 1) {
                    themeActivity.presentFragment(new vc1(C0, false, 1, false, i11 == 1));
                } else {
                    org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) fb1Var.e.get(i10);
                    if (!TextUtils.isEmpty(w6Var.o) && w6Var.a != org.telegram.ui.ActionBar.y6.n) {
                        org.telegram.ui.ActionBar.t6.a(false);
                    }
                    int i12 = C0.Y;
                    int i13 = w6Var.a;
                    if (i12 != i13) {
                        org.telegram.ui.ActionBar.y6.H1(C0, i11 == 1, i13, view);
                        org.telegram.ui.ActionBar.h4.p(C0, w6Var.a);
                        org.telegram.ui.ActionBar.y6.J1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new vc1(C0, false, 1, i13 >= 100, i11 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i14 = left - dp;
                if (i14 < 0) {
                    bb1Var.w0(i14, 0, null);
                } else {
                    int i15 = right + dp;
                    if (i15 > bb1Var.getMeasuredWidth()) {
                        bb1Var.w0(i15 - bb1Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = bb1Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = bb1Var.getChildAt(i16);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                j11.W((j11) this.b, (Context) this.c, (String) this.d, view, i10);
                break;
        }
    }
}
