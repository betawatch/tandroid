package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa1 implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sa1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.am0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                za1 za1Var = (za1) this.b;
                bb1 bb1Var = (bb1) this.c;
                xa1 xa1Var = (xa1) this.d;
                ThemeActivity themeActivity = za1Var.e;
                int i11 = themeActivity.f;
                org.telegram.ui.ActionBar.j6 C0 = i11 == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.C0();
                if (i10 == bb1Var.h() - 1) {
                    themeActivity.presentFragment(new qc1(C0, false, 1, false, i11 == 1));
                } else {
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) bb1Var.e.get(i10);
                    if (!TextUtils.isEmpty(i6Var.o) && i6Var.a != org.telegram.ui.ActionBar.k6.n) {
                        org.telegram.ui.ActionBar.f6.a(false);
                    }
                    int i12 = C0.Y;
                    int i13 = i6Var.a;
                    if (i12 != i13) {
                        org.telegram.ui.ActionBar.k6.H1(C0, i11 == 1, i13, view);
                        org.telegram.ui.ActionBar.f4.p(C0, i6Var.a);
                        org.telegram.ui.ActionBar.k6.J1(themeActivity);
                    } else {
                        themeActivity.presentFragment(new qc1(C0, false, 1, i13 >= 100, i11 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i14 = left - dp;
                if (i14 < 0) {
                    xa1Var.v0(i14, 0, null);
                } else {
                    int i15 = right + dp;
                    if (i15 > xa1Var.getMeasuredWidth()) {
                        xa1Var.v0(i15 - xa1Var.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = xa1Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = xa1Var.getChildAt(i16);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).a(true);
                    }
                }
                break;
            default:
                d11.V((d11) this.b, (Context) this.c, (String) this.d, view, i10);
                break;
        }
    }
}
