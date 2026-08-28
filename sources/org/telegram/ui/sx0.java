package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sx0 implements org.telegram.ui.ActionBar.g6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ sx0(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i9;
        this.b = o2Var;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ void a(float f10) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void b() {
        ValueAnimator valueAnimator;
        int i9 = this.a;
        int i10 = 0;
        org.telegram.ui.ActionBar.o2 o2Var = this.b;
        switch (i9) {
            case 0:
                ProfileActivity.U((ProfileActivity) o2Var);
                break;
            case 1:
                s01 s01Var = (s01) o2Var;
                org.telegram.ui.Components.wk0 wk0Var = s01Var.a;
                if (wk0Var != null) {
                    int childCount = wk0Var.getChildCount();
                    while (i10 < childCount) {
                        View childAt = s01Var.a.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt).b();
                        }
                        i10++;
                    }
                    break;
                }
                break;
            case 2:
                k11 k11Var = (k11) o2Var;
                if (k11Var.h != null && ((valueAnimator = k11Var.D) == null || !valueAnimator.isRunning())) {
                    k11Var.h.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, k11Var.C ? org.telegram.ui.ActionBar.f6.q6 : org.telegram.ui.ActionBar.f6.z6, false));
                }
                if (k11Var.a != null) {
                    int i11 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = k11Var.a;
                        if (i11 >= editTextBoldCursorArr.length) {
                            break;
                        } else {
                            editTextBoldCursorArr[i11].setLineColors(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.l6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
                            i11++;
                        }
                    }
                }
                break;
            case 3:
                z11 z11Var = (z11) o2Var;
                z11Var.getClass();
                z11Var.setNavigationBarColor(z11Var.getThemedColor(org.telegram.ui.ActionBar.f6.a7));
                break;
            case 4:
                h21 h21Var = (h21) o2Var;
                h21Var.a.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
                h21Var.c.l();
                break;
            case 5:
                s91 s91Var = (s91) o2Var;
                t81 t81Var = s91Var.O;
                if (t81Var != null) {
                    int childCount2 = t81Var.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        s91.k0(s91Var.O.getChildAt(i12));
                    }
                    int hiddenChildCount = s91Var.O.getHiddenChildCount();
                    for (int i13 = 0; i13 < hiddenChildCount; i13++) {
                        s91.k0(s91Var.O.V(i13));
                    }
                    int cachedChildCount = s91Var.O.getCachedChildCount();
                    for (int i14 = 0; i14 < cachedChildCount; i14++) {
                        s91.k0(s91Var.O.P(i14));
                    }
                    int attachedScrapChildCount = s91Var.O.getAttachedScrapChildCount();
                    while (i10 < attachedScrapChildCount) {
                        s91.k0(s91Var.O.O(i10));
                        i10++;
                    }
                    s91Var.O.getRecycledViewPool().a();
                }
                qf.f fVar = s91Var.W;
                if (fVar != null) {
                    fVar.g = true;
                    break;
                }
                break;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) o2Var;
                for (int i15 = 0; i15 < themeActivity.b.getChildCount(); i15++) {
                    View childAt2 = themeActivity.b.getChildAt(i15);
                    if (childAt2 instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt2).getAdapter().l();
                    } else if (childAt2 instanceof ho0) {
                        ((ho0) childAt2).a();
                    }
                }
                for (int i16 = 0; i16 < themeActivity.b.getCachedChildCount(); i16++) {
                    View P = themeActivity.b.P(i16);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof ho0) {
                        ((ho0) P).a();
                    }
                }
                for (int i17 = 0; i17 < themeActivity.b.getHiddenChildCount(); i17++) {
                    View V = themeActivity.b.V(i17);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof ho0) {
                        ((ho0) V).a();
                    }
                }
                while (i10 < themeActivity.b.getAttachedScrapChildCount()) {
                    View O = themeActivity.b.O(i10);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof ho0) {
                        ((ho0) O).a();
                    }
                    i10++;
                }
                break;
            case 7:
                oc1.V((oc1) o2Var);
                break;
            case 8:
                kd1 kd1Var = (kd1) o2Var;
                org.telegram.ui.Components.wk0 wk0Var2 = kd1Var.a;
                if (wk0Var2 != null) {
                    int childCount3 = wk0Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        View childAt3 = kd1Var.a.getChildAt(i18);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.wk0 wk0Var3 = kd1Var.b;
                if (wk0Var3 != null) {
                    int childCount4 = wk0Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount4; i19++) {
                        View childAt4 = kd1Var.b.getChildAt(i19);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                kd1Var.c.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
                kd1Var.B.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h6, false));
                break;
            case 9:
                we1.W((we1) o2Var);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) o2Var;
                org.telegram.ui.Components.wk0 wk0Var4 = usersSelectActivity.d;
                if (wk0Var4 != null) {
                    int childCount5 = wk0Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount5; i20++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i20);
                        if (childAt5 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt5).f(0);
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
