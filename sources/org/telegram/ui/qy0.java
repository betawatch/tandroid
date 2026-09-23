package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class qy0 implements org.telegram.ui.ActionBar.i6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ qy0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void b() {
        ValueAnimator valueAnimator;
        int i10 = this.a;
        int i11 = 0;
        org.telegram.ui.ActionBar.n2 n2Var = this.b;
        switch (i10) {
            case 0:
                ProfileActivity.V((ProfileActivity) n2Var);
                break;
            case 1:
                p11 p11Var = (p11) n2Var;
                org.telegram.ui.Components.ml0 ml0Var = p11Var.a;
                if (ml0Var != null) {
                    int childCount = ml0Var.getChildCount();
                    while (i11 < childCount) {
                        View childAt = p11Var.a.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt).b();
                        }
                        i11++;
                    }
                    break;
                }
                break;
            case 2:
                h21 h21Var = (h21) n2Var;
                if (h21Var.h != null && ((valueAnimator = h21Var.G) == null || !valueAnimator.isRunning())) {
                    h21Var.h.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, h21Var.F ? org.telegram.ui.ActionBar.h6.q6 : org.telegram.ui.ActionBar.h6.z6, false));
                }
                if (h21Var.a != null) {
                    int i12 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = h21Var.a;
                        if (i12 >= editTextBoldCursorArr.length) {
                            break;
                        } else {
                            editTextBoldCursorArr[i12].setLineColors(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.k6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.l6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.p7, false));
                            i12++;
                        }
                    }
                }
                break;
            case 3:
                x21 x21Var = (x21) n2Var;
                x21Var.getClass();
                x21Var.setNavigationBarColor(x21Var.getThemedColor(org.telegram.ui.ActionBar.h6.a7));
                break;
            case 4:
                e31 e31Var = (e31) n2Var;
                e31Var.a.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false));
                e31Var.c.l();
                break;
            case 5:
                ra1 ra1Var = (ra1) n2Var;
                s91 s91Var = ra1Var.S;
                if (s91Var != null) {
                    int childCount2 = s91Var.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        ra1.l0(ra1Var.S.getChildAt(i13));
                    }
                    int hiddenChildCount = ra1Var.S.getHiddenChildCount();
                    for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                        ra1.l0(ra1Var.S.V(i14));
                    }
                    int cachedChildCount = ra1Var.S.getCachedChildCount();
                    for (int i15 = 0; i15 < cachedChildCount; i15++) {
                        ra1.l0(ra1Var.S.P(i15));
                    }
                    int attachedScrapChildCount = ra1Var.S.getAttachedScrapChildCount();
                    while (i11 < attachedScrapChildCount) {
                        ra1.l0(ra1Var.S.O(i11));
                        i11++;
                    }
                    ra1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = ra1Var.a0;
                if (fVar != null) {
                    fVar.g = true;
                    break;
                }
                break;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) n2Var;
                for (int i16 = 0; i16 < themeActivity.b.getChildCount(); i16++) {
                    View childAt2 = themeActivity.b.getChildAt(i16);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof zo0) {
                        ((zo0) childAt2).a();
                    }
                }
                for (int i17 = 0; i17 < themeActivity.b.getCachedChildCount(); i17++) {
                    View P = themeActivity.b.P(i17);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof zo0) {
                        ((zo0) P).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.b.getHiddenChildCount(); i18++) {
                    View V = themeActivity.b.V(i18);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof zo0) {
                        ((zo0) V).a();
                    }
                }
                while (i11 < themeActivity.b.getAttachedScrapChildCount()) {
                    View O = themeActivity.b.O(i11);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof zo0) {
                        ((zo0) O).a();
                    }
                    i11++;
                }
                break;
            case 7:
                od1.X((od1) n2Var);
                break;
            case 8:
                le1 le1Var = (le1) n2Var;
                org.telegram.ui.Components.ml0 ml0Var2 = le1Var.a;
                if (ml0Var2 != null) {
                    int childCount3 = ml0Var2.getChildCount();
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt3 = le1Var.a.getChildAt(i19);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.ml0 ml0Var3 = le1Var.b;
                if (ml0Var3 != null) {
                    int childCount4 = ml0Var3.getChildCount();
                    for (int i20 = 0; i20 < childCount4; i20++) {
                        View childAt4 = le1Var.b.getChildAt(i20);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                le1Var.c.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                le1Var.F.setProgressColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h6, false));
                break;
            case 9:
                wf1.X((wf1) n2Var);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.ml0 ml0Var4 = usersSelectActivity.d;
                if (ml0Var4 != null) {
                    int childCount5 = ml0Var4.getChildCount();
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
