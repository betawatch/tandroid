package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class wy0 implements org.telegram.ui.ActionBar.k6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ wy0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
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
        org.telegram.ui.ActionBar.n2 n2Var = this.b;
        switch (i10) {
            case 0:
                ProfileActivity.V((ProfileActivity) n2Var);
                break;
            case 1:
                w11 w11Var = (w11) n2Var;
                org.telegram.ui.Components.yl0 yl0Var = w11Var.a;
                if (yl0Var != null) {
                    int childCount = yl0Var.getChildCount();
                    while (i11 < childCount) {
                        View childAt = w11Var.a.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt).b();
                        }
                        i11++;
                    }
                    break;
                }
                break;
            case 2:
                o21 o21Var = (o21) n2Var;
                if (o21Var.h != null && ((valueAnimator = o21Var.G) == null || !valueAnimator.isRunning())) {
                    o21Var.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, o21Var.F ? org.telegram.ui.ActionBar.j6.q6 : org.telegram.ui.ActionBar.j6.z6, false));
                }
                if (o21Var.a != null) {
                    int i12 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = o21Var.a;
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
                f31 f31Var = (f31) n2Var;
                f31Var.getClass();
                f31Var.setNavigationBarColor(f31Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7));
                break;
            case 4:
                m31 m31Var = (m31) n2Var;
                m31Var.a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
                m31Var.c.l();
                break;
            case 5:
                bb1 bb1Var = (bb1) n2Var;
                ca1 ca1Var = bb1Var.S;
                if (ca1Var != null) {
                    int childCount2 = ca1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        bb1.l0(bb1Var.S.getChildAt(i13));
                    }
                    int hiddenChildCount = bb1Var.S.getHiddenChildCount();
                    for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                        bb1.l0(bb1Var.S.W(i14));
                    }
                    int cachedChildCount = bb1Var.S.getCachedChildCount();
                    for (int i15 = 0; i15 < cachedChildCount; i15++) {
                        bb1.l0(bb1Var.S.Q(i15));
                    }
                    int attachedScrapChildCount = bb1Var.S.getAttachedScrapChildCount();
                    while (i11 < attachedScrapChildCount) {
                        bb1.l0(bb1Var.S.P(i11));
                        i11++;
                    }
                    bb1Var.S.getRecycledViewPool().a();
                }
                ig.f fVar = bb1Var.a0;
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
                xd1.X((xd1) n2Var);
                break;
            case 8:
                ue1 ue1Var = (ue1) n2Var;
                org.telegram.ui.Components.yl0 yl0Var2 = ue1Var.a;
                if (yl0Var2 != null) {
                    int childCount3 = yl0Var2.getChildCount();
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        View childAt3 = ue1Var.a.getChildAt(i19);
                        if (childAt3 instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt3).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.yl0 yl0Var3 = ue1Var.b;
                if (yl0Var3 != null) {
                    int childCount4 = yl0Var3.getChildCount();
                    for (int i20 = 0; i20 < childCount4; i20++) {
                        View childAt4 = ue1Var.b.getChildAt(i20);
                        if (childAt4 instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt4).f(0);
                        }
                    }
                }
                ue1Var.c.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                ue1Var.F.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h6, false));
                break;
            case 9:
                fg1.X((fg1) n2Var);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) n2Var;
                org.telegram.ui.Components.yl0 yl0Var4 = usersSelectActivity.d;
                if (yl0Var4 != null) {
                    int childCount5 = yl0Var4.getChildCount();
                    for (int i21 = 0; i21 < childCount5; i21++) {
                        View childAt5 = usersSelectActivity.d.getChildAt(i21);
                        if (childAt5 instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt5).f(0);
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
