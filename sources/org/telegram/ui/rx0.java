package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rx0 implements org.telegram.ui.ActionBar.h6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ rx0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i10;
        this.b = o2Var;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ void a(float f9) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.h6
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
                t01 t01Var = (t01) o2Var;
                org.telegram.ui.Components.jl0 jl0Var = t01Var.a;
                if (jl0Var != null) {
                    int childCount = jl0Var.getChildCount();
                    while (i11 < childCount) {
                        View childAt = t01Var.a.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.ra) {
                            ((org.telegram.ui.Cells.ra) childAt).b();
                        }
                        i11++;
                    }
                    break;
                }
                break;
            case 2:
                l11 l11Var = (l11) o2Var;
                if (l11Var.h != null && ((valueAnimator = l11Var.D) == null || !valueAnimator.isRunning())) {
                    l11Var.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, l11Var.C ? org.telegram.ui.ActionBar.g6.q6 : org.telegram.ui.ActionBar.g6.z6, false));
                }
                if (l11Var.a != null) {
                    int i12 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = l11Var.a;
                        if (i12 >= editTextBoldCursorArr.length) {
                            break;
                        } else {
                            editTextBoldCursorArr[i12].setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.l6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
                            i12++;
                        }
                    }
                }
                break;
            case 3:
                a21 a21Var = (a21) o2Var;
                a21Var.getClass();
                a21Var.setNavigationBarColor(a21Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7));
                break;
            case 4:
                i21 i21Var = (i21) o2Var;
                i21Var.a.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
                i21Var.c.l();
                break;
            case 5:
                t91 t91Var = (t91) o2Var;
                u81 u81Var = t91Var.O;
                if (u81Var != null) {
                    int childCount2 = u81Var.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        t91.l0(t91Var.O.getChildAt(i13));
                    }
                    int hiddenChildCount = t91Var.O.getHiddenChildCount();
                    for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                        t91.l0(t91Var.O.V(i14));
                    }
                    int cachedChildCount = t91Var.O.getCachedChildCount();
                    for (int i15 = 0; i15 < cachedChildCount; i15++) {
                        t91.l0(t91Var.O.P(i15));
                    }
                    int attachedScrapChildCount = t91Var.O.getAttachedScrapChildCount();
                    while (i11 < attachedScrapChildCount) {
                        t91.l0(t91Var.O.O(i11));
                        i11++;
                    }
                    t91Var.O.getRecycledViewPool().a();
                }
                tf.f fVar = t91Var.W;
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
                    } else if (childAt2 instanceof go0) {
                        ((go0) childAt2).a();
                    }
                }
                for (int i17 = 0; i17 < themeActivity.b.getCachedChildCount(); i17++) {
                    View P = themeActivity.b.P(i17);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof go0) {
                        ((go0) P).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.b.getHiddenChildCount(); i18++) {
                    View V = themeActivity.b.V(i18);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof go0) {
                        ((go0) V).a();
                    }
                }
                while (i11 < themeActivity.b.getAttachedScrapChildCount()) {
                    View O = themeActivity.b.O(i11);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof go0) {
                        ((go0) O).a();
                    }
                    i11++;
                }
                break;
            case 7:
                qc1.W((qc1) o2Var);
                break;
            case 8:
                md1 md1Var = (md1) o2Var;
                org.telegram.ui.Components.jl0 jl0Var2 = md1Var.a;
                if (jl0Var2 != null) {
                    int childCount3 = jl0Var2.getChildCount();
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt3 = md1Var.a.getChildAt(i19);
                        if (childAt3 instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.jl0 jl0Var3 = md1Var.b;
                if (jl0Var3 != null) {
                    int childCount4 = jl0Var3.getChildCount();
                    for (int i20 = 0; i20 < childCount4; i20++) {
                        View childAt4 = md1Var.b.getChildAt(i20);
                        if (childAt4 instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) childAt4).f(0);
                        }
                    }
                }
                md1Var.c.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                md1Var.B.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h6, false));
                break;
            case 9:
                ze1.X((ze1) o2Var);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) o2Var;
                org.telegram.ui.Components.jl0 jl0Var4 = usersSelectActivity.d;
                if (jl0Var4 != null) {
                    int childCount5 = jl0Var4.getChildCount();
                    for (int i21 = 0; i21 < childCount5; i21++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i21);
                        if (childAt5 instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) childAt5).f(0);
                        }
                    }
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void c(float f9) {
    }

    private final /* synthetic */ void d(float f9) {
    }

    private final /* synthetic */ void e(float f9) {
    }

    private final /* synthetic */ void f(float f9) {
    }

    private final /* synthetic */ void g(float f9) {
    }

    private final /* synthetic */ void h(float f9) {
    }

    private final /* synthetic */ void i(float f9) {
    }

    private final /* synthetic */ void j(float f9) {
    }

    private final /* synthetic */ void k(float f9) {
    }

    private final /* synthetic */ void l(float f9) {
    }

    private final /* synthetic */ void m(float f9) {
    }
}
