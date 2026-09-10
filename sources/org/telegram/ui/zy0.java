package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class zy0 implements org.telegram.ui.ActionBar.k6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public /* synthetic */ zy0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void b() {
        ValueAnimator valueAnimator;
        int i10 = this.a;
        int i11 = 0;
        org.telegram.ui.ActionBar.p2 p2Var = this.b;
        switch (i10) {
            case 0:
                ProfileActivity.V((ProfileActivity) p2Var);
                break;
            case 1:
                c21 c21Var = (c21) p2Var;
                org.telegram.ui.Components.vl0 vl0Var = c21Var.a;
                if (vl0Var != null) {
                    int childCount = vl0Var.getChildCount();
                    while (i11 < childCount) {
                        View childAt = c21Var.a.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt).b();
                        }
                        i11++;
                    }
                    break;
                }
                break;
            case 2:
                u21 u21Var = (u21) p2Var;
                if (u21Var.h != null && ((valueAnimator = u21Var.G) == null || !valueAnimator.isRunning())) {
                    u21Var.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, u21Var.F ? org.telegram.ui.ActionBar.j6.q6 : org.telegram.ui.ActionBar.j6.z6, false));
                }
                if (u21Var.a != null) {
                    int i12 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = u21Var.a;
                        if (i12 >= editTextBoldCursorArr.length) {
                            break;
                        } else {
                            editTextBoldCursorArr[i12].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                            i12++;
                        }
                    }
                }
                break;
            case 3:
                k31 k31Var = (k31) p2Var;
                k31Var.getClass();
                k31Var.setNavigationBarColor(k31Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
                break;
            case 4:
                r31 r31Var = (r31) p2Var;
                r31Var.a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
                r31Var.c.l();
                break;
            case 5:
                fb1 fb1Var = (fb1) p2Var;
                ga1 ga1Var = fb1Var.S;
                if (ga1Var != null) {
                    int childCount2 = ga1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        fb1.l0(fb1Var.S.getChildAt(i13));
                    }
                    int hiddenChildCount = fb1Var.S.getHiddenChildCount();
                    for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                        fb1.l0(fb1Var.S.V(i14));
                    }
                    int cachedChildCount = fb1Var.S.getCachedChildCount();
                    for (int i15 = 0; i15 < cachedChildCount; i15++) {
                        fb1.l0(fb1Var.S.P(i15));
                    }
                    int attachedScrapChildCount = fb1Var.S.getAttachedScrapChildCount();
                    while (i11 < attachedScrapChildCount) {
                        fb1.l0(fb1Var.S.O(i11));
                        i11++;
                    }
                    fb1Var.S.getRecycledViewPool().a();
                }
                hg.f fVar = fb1Var.a0;
                if (fVar != null) {
                    fVar.g = true;
                    break;
                }
                break;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) p2Var;
                for (int i16 = 0; i16 < themeActivity.b.getChildCount(); i16++) {
                    View childAt2 = themeActivity.b.getChildAt(i16);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof fp0) {
                        ((fp0) childAt2).a();
                    }
                }
                for (int i17 = 0; i17 < themeActivity.b.getCachedChildCount(); i17++) {
                    View P = themeActivity.b.P(i17);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof fp0) {
                        ((fp0) P).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.b.getHiddenChildCount(); i18++) {
                    View V = themeActivity.b.V(i18);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof fp0) {
                        ((fp0) V).a();
                    }
                }
                while (i11 < themeActivity.b.getAttachedScrapChildCount()) {
                    View O = themeActivity.b.O(i11);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof fp0) {
                        ((fp0) O).a();
                    }
                    i11++;
                }
                break;
            case 7:
                ae1.X((ae1) p2Var);
                break;
            case 8:
                xe1 xe1Var = (xe1) p2Var;
                org.telegram.ui.Components.vl0 vl0Var2 = xe1Var.a;
                if (vl0Var2 != null) {
                    int childCount3 = vl0Var2.getChildCount();
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt3 = xe1Var.a.getChildAt(i19);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.vl0 vl0Var3 = xe1Var.b;
                if (vl0Var3 != null) {
                    int childCount4 = vl0Var3.getChildCount();
                    for (int i20 = 0; i20 < childCount4; i20++) {
                        View childAt4 = xe1Var.b.getChildAt(i20);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                xe1Var.c.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                xe1Var.F.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h6, false));
                break;
            case 9:
                ig1.X((ig1) p2Var);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) p2Var;
                org.telegram.ui.Components.vl0 vl0Var4 = usersSelectActivity.d;
                if (vl0Var4 != null) {
                    int childCount5 = vl0Var4.getChildCount();
                    for (int i21 = 0; i21 < childCount5; i21++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i21);
                        if (childAt5 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt5).f(0);
                        }
                    }
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void c(float f7) {
    }

    private final /* synthetic */ void d(float f7) {
    }

    private final /* synthetic */ void e(float f7) {
    }

    private final /* synthetic */ void f(float f7) {
    }

    private final /* synthetic */ void g(float f7) {
    }

    private final /* synthetic */ void h(float f7) {
    }

    private final /* synthetic */ void i(float f7) {
    }

    private final /* synthetic */ void j(float f7) {
    }

    private final /* synthetic */ void k(float f7) {
    }

    private final /* synthetic */ void l(float f7) {
    }

    private final /* synthetic */ void m(float f7) {
    }
}
