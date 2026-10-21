package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zx0 implements org.telegram.ui.ActionBar.i6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ zx0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
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
                ProfileActivity.n0((ProfileActivity) n2Var);
                break;
            case 1:
                z01 z01Var = (z01) n2Var;
                org.telegram.ui.Components.jm0 jm0Var = z01Var.a;
                if (jm0Var != null) {
                    int childCount = jm0Var.getChildCount();
                    while (i11 < childCount) {
                        View childAt = z01Var.a.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt).b();
                        }
                        i11++;
                    }
                    break;
                }
                break;
            case 2:
                s11 s11Var = (s11) n2Var;
                if (s11Var.h != null && ((valueAnimator = s11Var.G) == null || !valueAnimator.isRunning())) {
                    s11Var.h.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, s11Var.F ? org.telegram.ui.ActionBar.h6.q6 : org.telegram.ui.ActionBar.h6.z6, false));
                }
                if (s11Var.a != null) {
                    int i12 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = s11Var.a;
                        if (i12 >= editTextBoldCursorArr.length) {
                            break;
                        } else {
                            editTextBoldCursorArr[i12].setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.l6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false));
                            i12++;
                        }
                    }
                }
                break;
            case 3:
                z11 z11Var = (z11) n2Var;
                z11Var.a.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
                z11Var.c.l();
                break;
            case 4:
                p91 p91Var = (p91) n2Var;
                q81 q81Var = p91Var.S;
                if (q81Var != null) {
                    int childCount2 = q81Var.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        p91.l0(p91Var.S.getChildAt(i13));
                    }
                    int hiddenChildCount = p91Var.S.getHiddenChildCount();
                    for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                        p91.l0(p91Var.S.V(i14));
                    }
                    int cachedChildCount = p91Var.S.getCachedChildCount();
                    for (int i15 = 0; i15 < cachedChildCount; i15++) {
                        p91.l0(p91Var.S.P(i15));
                    }
                    int attachedScrapChildCount = p91Var.S.getAttachedScrapChildCount();
                    while (i11 < attachedScrapChildCount) {
                        p91.l0(p91Var.S.O(i11));
                        i11++;
                    }
                    p91Var.S.getRecycledViewPool().a();
                }
                jg.f fVar = p91Var.a0;
                if (fVar != null) {
                    fVar.a = true;
                    break;
                }
                break;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) n2Var;
                for (int i16 = 0; i16 < themeActivity.b.getChildCount(); i16++) {
                    View childAt2 = themeActivity.b.getChildAt(i16);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof no0) {
                        ((no0) childAt2).a();
                    }
                }
                for (int i17 = 0; i17 < themeActivity.b.getCachedChildCount(); i17++) {
                    View P = themeActivity.b.P(i17);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof no0) {
                        ((no0) P).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.b.getHiddenChildCount(); i18++) {
                    View V = themeActivity.b.V(i18);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof no0) {
                        ((no0) V).a();
                    }
                }
                while (i11 < themeActivity.b.getAttachedScrapChildCount()) {
                    View O = themeActivity.b.O(i11);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof no0) {
                        ((no0) O).a();
                    }
                    i11++;
                }
                break;
            case 6:
                kc1.X((kc1) n2Var);
                break;
            case 7:
                gd1 gd1Var = (gd1) n2Var;
                org.telegram.ui.Components.jm0 jm0Var2 = gd1Var.a;
                if (jm0Var2 != null) {
                    int childCount3 = jm0Var2.getChildCount();
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt3 = gd1Var.a.getChildAt(i19);
                        if (childAt3 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.jm0 jm0Var3 = gd1Var.b;
                if (jm0Var3 != null) {
                    int childCount4 = jm0Var3.getChildCount();
                    for (int i20 = 0; i20 < childCount4; i20++) {
                        View childAt4 = gd1Var.b.getChildAt(i20);
                        if (childAt4 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt4).f(0);
                        }
                    }
                }
                gd1Var.c.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                gd1Var.F.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h6, false));
                break;
            case 8:
                re1.X((re1) n2Var);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.jm0 jm0Var4 = usersSelectActivity.d;
                if (jm0Var4 != null) {
                    int childCount5 = jm0Var4.getChildCount();
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
}
