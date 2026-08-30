package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class uw extends f2.z0 {
    public boolean a;
    public final /* synthetic */ ny b;
    public final /* synthetic */ hy c;
    public final /* synthetic */ oy d;

    public uw(oy oyVar, ny nyVar, hy hyVar) {
        this.d = oyVar;
        this.b = nyVar;
        this.c = hyVar;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        oy oyVar = this.d;
        if (i10 == 1) {
            this.a = true;
            oyVar.a3 = true;
            b4.e0 e0Var = oyVar.b0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) e0Var.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) e0Var.c).cancel();
                e0Var.c = null;
            }
            if (oyVar.U.r.getText().length() == 0 && oyVar.U.r.hasFocus()) {
                AndroidUtilities.hideKeyboard(oyVar.U.r);
                oyVar.U.r.clearFocus();
            }
        } else {
            oyVar.a3 = false;
        }
        if (i10 == 0) {
            this.a = false;
            oyVar.b2 = false;
            boolean z4 = oyVar.Y0;
            ny nyVar = this.b;
            if (z4) {
                oyVar.Y0 = false;
                if (oyVar.a1) {
                    ky kyVar = nyVar.a;
                    int i11 = ky.s3;
                    kyVar.A1();
                    oyVar.a1 = false;
                }
                nyVar.d.l();
            }
            oy.r1(oyVar, nyVar);
        }
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        ky kyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z4;
        boolean z10;
        this.c.X();
        ny nyVar = this.b;
        qw qwVar = nyVar.x;
        int i12 = -i11;
        ArrayList arrayList = qwVar.x;
        ArrayList arrayList2 = qwVar.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = ((f2.l1) arrayList2.get(i13)).a;
                view.setTranslationY(view.getTranslationY() + i12);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                View view2 = ((f2.l1) arrayList.get(i14)).a;
                view2.setTranslationY(view2.getTranslationY() + i12);
            }
        }
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < recyclerView.getChildCount(); i17++) {
            int R = RecyclerView.R(recyclerView.getChildAt(i17));
            if (R >= 0) {
                if (i15 == -1 || R > i15) {
                    i15 = R;
                }
                if (i16 == -1 || R < i16) {
                    i16 = R;
                }
            }
        }
        oy oyVar = this.d;
        oyVar.r3(nyVar);
        oyVar.N = true;
        View view3 = oyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (oyVar.O0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            f2.l1 K = recyclerView.K(i16);
            if (!oyVar.Z3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = oyVar.V1;
                if (i18 == i16) {
                    int i19 = oyVar.W1;
                    int i20 = i19 - top;
                    z4 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        z10 = false;
                        if (z10 && oyVar.X1 && (z4 || oyVar.a3)) {
                            oyVar.c4(z4);
                        }
                        oyVar.V1 = i16;
                        oyVar.W1 = top;
                        oyVar.X1 = true;
                    }
                } else {
                    z4 = i16 > i18;
                }
                z10 = true;
                if (z10) {
                    oyVar.c4(z4);
                }
                oyVar.V1 = i16;
                oyVar.W1 = top;
                oyVar.X1 = true;
            }
        }
        if (!oyVar.H && recyclerView == oyVar.b0[0].a && !oyVar.g2) {
            kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                if (!kVar2.s() && !oyVar.b2 && !oyVar.C3.c()) {
                    if (i11 > 0 && oyVar.Z3() && oyVar.b0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    oyVar.N = true;
                    View view4 = oyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (oyVar.fragmentView != null) {
            oyVar.m3();
        }
        jx jxVar = oyVar.C3;
        if (jxVar != null && jxVar.c() && (kyVar = nyVar.a) != null) {
            kyVar.invalidate();
        }
        gx gxVar = oyVar.B0;
        if (gxVar != null && gxVar.getPremiumHint() != null && oyVar.B0.getPremiumHint().S) {
            oyVar.B0.getPremiumHint().e(true);
        }
        ?? Z3 = oyVar.Z3();
        View childAt2 = nyVar.a.getChildAt(Z3 == true ? 1 : 0);
        oyVar.e.a(i16 > Z3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - oyVar.K) + ((float) AndroidUtilities.dp(5.0f)) < ((float) nyVar.a.getPaddingTop()), true);
        if (i11 == 0 || (eVar = oyVar.i4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        eVar.f(i10, i11);
    }
}
