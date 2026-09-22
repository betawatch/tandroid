package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xy0 implements org.telegram.ui.ActionBar.j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ xy0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.ActionBar.j6
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.j6
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
                x11 x11Var = (x11) n2Var;
                org.telegram.ui.Components.ll0 ll0Var = x11Var.a;
                if (ll0Var != null) {
                    int childCount = ll0Var.getChildCount();
                    while (i11 < childCount) {
                        View childAt = x11Var.a.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt).b();
                        }
                        i11++;
                    }
                    break;
                }
                break;
            case 2:
                p21 p21Var = (p21) n2Var;
                if (p21Var.h != null && ((valueAnimator = p21Var.G) == null || !valueAnimator.isRunning())) {
                    p21Var.h.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, p21Var.F ? org.telegram.ui.ActionBar.i6.q6 : org.telegram.ui.ActionBar.i6.z6, false));
                }
                if (p21Var.a != null) {
                    int i12 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = p21Var.a;
                        if (i12 >= editTextBoldCursorArr.length) {
                            break;
                        } else {
                            editTextBoldCursorArr[i12].setLineColors(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.k6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.l6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.p7, false));
                            i12++;
                        }
                    }
                }
                break;
            case 3:
                f31 f31Var = (f31) n2Var;
                f31Var.getClass();
                f31Var.setNavigationBarColor(f31Var.getThemedColor(org.telegram.ui.ActionBar.i6.a7));
                break;
            case 4:
                m31 m31Var = (m31) n2Var;
                m31Var.a.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.a7, false));
                m31Var.c.l();
                break;
            case 5:
                za1 za1Var = (za1) n2Var;
                aa1 aa1Var = za1Var.S;
                if (aa1Var != null) {
                    int childCount2 = aa1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        za1.l0(za1Var.S.getChildAt(i13));
                    }
                    int hiddenChildCount = za1Var.S.getHiddenChildCount();
                    for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                        za1.l0(za1Var.S.V(i14));
                    }
                    int cachedChildCount = za1Var.S.getCachedChildCount();
                    for (int i15 = 0; i15 < cachedChildCount; i15++) {
                        za1.l0(za1Var.S.P(i15));
                    }
                    int attachedScrapChildCount = za1Var.S.getAttachedScrapChildCount();
                    while (i11 < attachedScrapChildCount) {
                        za1.l0(za1Var.S.O(i11));
                        i11++;
                    }
                    za1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = za1Var.a0;
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
                wd1.X((wd1) n2Var);
                break;
            case 8:
                te1 te1Var = (te1) n2Var;
                org.telegram.ui.Components.ll0 ll0Var2 = te1Var.a;
                if (ll0Var2 != null) {
                    int childCount3 = ll0Var2.getChildCount();
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt3 = te1Var.a.getChildAt(i19);
                        if (childAt3 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.ll0 ll0Var3 = te1Var.b;
                if (ll0Var3 != null) {
                    int childCount4 = ll0Var3.getChildCount();
                    for (int i20 = 0; i20 < childCount4; i20++) {
                        View childAt4 = te1Var.b.getChildAt(i20);
                        if (childAt4 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt4).f(0);
                        }
                    }
                }
                te1Var.c.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                te1Var.F.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h6, false));
                break;
            case 9:
                eg1.X((eg1) n2Var);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.ll0 ll0Var4 = usersSelectActivity.d;
                if (ll0Var4 != null) {
                    int childCount5 = ll0Var4.getChildCount();
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
