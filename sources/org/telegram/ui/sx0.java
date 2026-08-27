package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sx0 implements org.telegram.ui.ActionBar.h6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ sx0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ void a(float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.h6
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
                t01 t01Var = (t01) n2Var;
                org.telegram.ui.Components.zk0 zk0Var = t01Var.a;
                if (zk0Var != null) {
                    int childCount = zk0Var.getChildCount();
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
                j11 j11Var = (j11) n2Var;
                if (j11Var.h != null && ((valueAnimator = j11Var.D) == null || !valueAnimator.isRunning())) {
                    j11Var.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, j11Var.C ? org.telegram.ui.ActionBar.g6.q6 : org.telegram.ui.ActionBar.g6.z6, false));
                }
                if (j11Var.a != null) {
                    int i12 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = j11Var.a;
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
                y11 y11Var = (y11) n2Var;
                y11Var.getClass();
                y11Var.setNavigationBarColor(y11Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7));
                break;
            case 4:
                g21 g21Var = (g21) n2Var;
                g21Var.a.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
                g21Var.c.l();
                break;
            case 5:
                q91 q91Var = (q91) n2Var;
                r81 r81Var = q91Var.O;
                if (r81Var != null) {
                    int childCount2 = r81Var.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        q91.l0(q91Var.O.getChildAt(i13));
                    }
                    int hiddenChildCount = q91Var.O.getHiddenChildCount();
                    for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                        q91.l0(q91Var.O.V(i14));
                    }
                    int cachedChildCount = q91Var.O.getCachedChildCount();
                    for (int i15 = 0; i15 < cachedChildCount; i15++) {
                        q91.l0(q91Var.O.P(i15));
                    }
                    int attachedScrapChildCount = q91Var.O.getAttachedScrapChildCount();
                    while (i11 < attachedScrapChildCount) {
                        q91.l0(q91Var.O.O(i11));
                        i11++;
                    }
                    q91Var.O.getRecycledViewPool().a();
                }
                rf.f fVar = q91Var.W;
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
                    } else if (childAt2 instanceof io0) {
                        ((io0) childAt2).a();
                    }
                }
                for (int i17 = 0; i17 < themeActivity.b.getCachedChildCount(); i17++) {
                    View P = themeActivity.b.P(i17);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof io0) {
                        ((io0) P).a();
                    }
                }
                for (int i18 = 0; i18 < themeActivity.b.getHiddenChildCount(); i18++) {
                    View V = themeActivity.b.V(i18);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof io0) {
                        ((io0) V).a();
                    }
                }
                while (i11 < themeActivity.b.getAttachedScrapChildCount()) {
                    View O = themeActivity.b.O(i11);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof io0) {
                        ((io0) O).a();
                    }
                    i11++;
                }
                break;
            case 7:
                nc1.W((nc1) n2Var);
                break;
            case 8:
                ld1 ld1Var = (ld1) n2Var;
                org.telegram.ui.Components.zk0 zk0Var2 = ld1Var.a;
                if (zk0Var2 != null) {
                    int childCount3 = zk0Var2.getChildCount();
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt3 = ld1Var.a.getChildAt(i19);
                        if (childAt3 instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.zk0 zk0Var3 = ld1Var.b;
                if (zk0Var3 != null) {
                    int childCount4 = zk0Var3.getChildCount();
                    for (int i20 = 0; i20 < childCount4; i20++) {
                        View childAt4 = ld1Var.b.getChildAt(i20);
                        if (childAt4 instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) childAt4).f(0);
                        }
                    }
                }
                ld1Var.c.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                ld1Var.B.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h6, false));
                break;
            case 9:
                we1.X((we1) n2Var);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.zk0 zk0Var4 = usersSelectActivity.d;
                if (zk0Var4 != null) {
                    int childCount5 = zk0Var4.getChildCount();
                    for (int i21 = 0; i21 < childCount5; i21++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i21);
                        if (childAt5 instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) childAt5).f(0);
                        }
                    }
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void c(float f10) {
    }

    private final /* synthetic */ void d(float f10) {
    }

    private final /* synthetic */ void e(float f10) {
    }

    private final /* synthetic */ void f(float f10) {
    }

    private final /* synthetic */ void g(float f10) {
    }

    private final /* synthetic */ void h(float f10) {
    }

    private final /* synthetic */ void i(float f10) {
    }

    private final /* synthetic */ void j(float f10) {
    }

    private final /* synthetic */ void k(float f10) {
    }

    private final /* synthetic */ void l(float f10) {
    }

    private final /* synthetic */ void m(float f10) {
    }
}
