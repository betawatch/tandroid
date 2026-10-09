package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yw extends s4.t0 {
    public boolean a;
    public final /* synthetic */ sy b;
    public final /* synthetic */ my c;
    public final /* synthetic */ ty d;

    public yw(ty tyVar, sy syVar, my myVar) {
        this.d = tyVar;
        this.b = syVar;
        this.c = myVar;
    }

    @Override // s4.t0
    public final void a(RecyclerView recyclerView, int i10) {
        ty tyVar = this.d;
        if (i10 == 1) {
            this.a = true;
            tyVar.d3 = true;
            a5.a aVar = tyVar.e0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
            }
            if (tyVar.X.r.getText().length() == 0 && tyVar.X.r.hasFocus()) {
                AndroidUtilities.hideKeyboard(tyVar.X.r);
                tyVar.X.r.clearFocus();
            }
        } else {
            tyVar.d3 = false;
        }
        if (i10 == 0) {
            this.a = false;
            tyVar.e2 = false;
            boolean z10 = tyVar.b1;
            sy syVar = this.b;
            if (z10) {
                tyVar.b1 = false;
                if (tyVar.d1) {
                    py pyVar = syVar.a;
                    int i11 = py.t3;
                    pyVar.B1();
                    tyVar.d1 = false;
                }
                syVar.d.l();
            }
            ty.o1(tyVar, syVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        py pyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z10;
        Object[] objArr;
        this.c.X();
        sy syVar = this.b;
        uw uwVar = syVar.x;
        int i12 = -i11;
        ArrayList arrayList = uwVar.x;
        ArrayList arrayList2 = uwVar.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = ((s4.d1) arrayList2.get(i13)).a;
                view.setTranslationY(view.getTranslationY() + i12);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                View view2 = ((s4.d1) arrayList.get(i14)).a;
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
        ty tyVar = this.d;
        tyVar.o3(syVar);
        tyVar.Q = true;
        View view3 = tyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (tyVar.R0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            s4.d1 K = recyclerView.K(i16);
            if (!tyVar.W3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = tyVar.Y1;
                if (i18 == i16) {
                    int i19 = tyVar.Z1;
                    int i20 = i19 - top;
                    z10 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        objArr = false;
                        if (objArr != false && tyVar.a2 && (z10 || tyVar.d3)) {
                            tyVar.Z3(z10);
                        }
                        tyVar.Y1 = i16;
                        tyVar.Z1 = top;
                        tyVar.a2 = true;
                    }
                } else {
                    z10 = i16 > i18;
                }
                objArr = true;
                if (objArr != false) {
                    tyVar.Z3(z10);
                }
                tyVar.Y1 = i16;
                tyVar.Z1 = top;
                tyVar.a2 = true;
            }
        }
        if (!tyVar.K && recyclerView == tyVar.e0[0].a && !tyVar.j2) {
            kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                if (!kVar2.t() && !tyVar.e2 && !tyVar.F3.c()) {
                    if (i11 > 0 && tyVar.W3() && tyVar.e0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    tyVar.Q = true;
                    View view4 = tyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (tyVar.fragmentView != null) {
            tyVar.j3();
        }
        nx nxVar = tyVar.F3;
        if (nxVar != null && nxVar.c() && (pyVar = syVar.a) != null) {
            pyVar.invalidate();
        }
        kx kxVar = tyVar.E0;
        if (kxVar != null && kxVar.getPremiumHint() != null && tyVar.E0.getPremiumHint().V) {
            tyVar.E0.getPremiumHint().e(true);
        }
        ?? W3 = tyVar.W3();
        View childAt2 = syVar.a.getChildAt(W3 == true ? 1 : 0);
        tyVar.e.a(i16 > W3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - tyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) syVar.a.getPaddingTop()), true);
        if (i11 == 0 || (hVar = tyVar.k4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        hVar.f(i10, i11);
    }
}
