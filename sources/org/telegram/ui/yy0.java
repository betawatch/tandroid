package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yy0 implements org.telegram.ui.ActionBar.k6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ yy0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i10;
        this.b = o2Var;
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
        org.telegram.ui.ActionBar.o2 o2Var = this.b;
        switch (i10) {
            case 0:
                ProfileActivity.V((ProfileActivity) o2Var);
                break;
            case 1:
                y11 y11Var = (y11) o2Var;
                org.telegram.ui.Components.ml0 ml0Var = y11Var.a;
                if (ml0Var != null) {
                    int childCount = ml0Var.getChildCount();
                    while (i11 < childCount) {
                        View childAt = y11Var.a.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt).b();
                        }
                        i11++;
                    }
                    break;
                }
                break;
            case 2:
                q21 q21Var = (q21) o2Var;
                if (q21Var.h != null && ((valueAnimator = q21Var.G) == null || !valueAnimator.isRunning())) {
                    q21Var.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, q21Var.F ? org.telegram.ui.ActionBar.j6.q6 : org.telegram.ui.ActionBar.j6.z6, false));
                }
                if (q21Var.a != null) {
                    int i12 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = q21Var.a;
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
                g31 g31Var = (g31) o2Var;
                g31Var.getClass();
                g31Var.setNavigationBarColor(g31Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
                break;
            case 4:
                n31 n31Var = (n31) o2Var;
                n31Var.a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
                n31Var.c.l();
                break;
            case 5:
                ab1 ab1Var = (ab1) o2Var;
                ba1 ba1Var = ab1Var.S;
                if (ba1Var != null) {
                    int childCount2 = ba1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        ab1.l0(ab1Var.S.getChildAt(i13));
                    }
                    int hiddenChildCount = ab1Var.S.getHiddenChildCount();
                    for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                        ab1.l0(ab1Var.S.W(i14));
                    }
                    int cachedChildCount = ab1Var.S.getCachedChildCount();
                    for (int i15 = 0; i15 < cachedChildCount; i15++) {
                        ab1.l0(ab1Var.S.Q(i15));
                    }
                    int attachedScrapChildCount = ab1Var.S.getAttachedScrapChildCount();
                    while (i11 < attachedScrapChildCount) {
                        ab1.l0(ab1Var.S.P(i11));
                        i11++;
                    }
                    ab1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = ab1Var.a0;
                if (fVar != null) {
                    fVar.g = true;
                    break;
                }
                break;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) o2Var;
                for (int i16 = 0; i16 < themeActivity.b.getChildCount(); i16++) {
                    View childAt2 = themeActivity.b.getChildAt(i16);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof hp0) {
                        ((hp0) childAt2).a();
                    }
                }
                for (int i17 = 0; i17 < themeActivity.b.getCachedChildCount(); i17++) {
                    View Q = themeActivity.b.Q(i17);
                    if (Q instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) Q).getAdapter().l();
                    } else if (Q instanceof hp0) {
                        ((hp0) Q).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.b.getHiddenChildCount(); i18++) {
                    View W = themeActivity.b.W(i18);
                    if (W instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) W).getAdapter().l();
                    } else if (W instanceof hp0) {
                        ((hp0) W).a();
                    }
                }
                while (i11 < themeActivity.b.getAttachedScrapChildCount()) {
                    View P = themeActivity.b.P(i11);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof hp0) {
                        ((hp0) P).a();
                    }
                    i11++;
                }
                break;
            case 7:
                xd1.X((xd1) o2Var);
                break;
            case 8:
                ue1 ue1Var = (ue1) o2Var;
                org.telegram.ui.Components.ml0 ml0Var2 = ue1Var.a;
                if (ml0Var2 != null) {
                    int childCount3 = ml0Var2.getChildCount();
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt3 = ue1Var.a.getChildAt(i19);
                        if (childAt3 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.ml0 ml0Var3 = ue1Var.b;
                if (ml0Var3 != null) {
                    int childCount4 = ml0Var3.getChildCount();
                    for (int i20 = 0; i20 < childCount4; i20++) {
                        View childAt4 = ue1Var.b.getChildAt(i20);
                        if (childAt4 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt4).f(0);
                        }
                    }
                }
                ue1Var.c.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                ue1Var.F.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h6, false));
                break;
            case 9:
                fg1.X((fg1) o2Var);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) o2Var;
                org.telegram.ui.Components.ml0 ml0Var4 = usersSelectActivity.d;
                if (ml0Var4 != null) {
                    int childCount5 = ml0Var4.getChildCount();
                    for (int i21 = 0; i21 < childCount5; i21++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i21);
                        if (childAt5 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt5).f(0);
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
