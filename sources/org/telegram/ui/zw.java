package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class zw extends s4.s0 {
    public boolean a;
    public final /* synthetic */ ty b;
    public final /* synthetic */ ny c;
    public final /* synthetic */ uy d;

    public zw(uy uyVar, ty tyVar, ny nyVar) {
        this.d = uyVar;
        this.b = tyVar;
        this.c = nyVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        uy uyVar = this.d;
        if (i10 == 1) {
            this.a = true;
            uyVar.d3 = true;
            a5.a aVar = uyVar.e0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
            }
            if (uyVar.X.r.getText().length() == 0 && uyVar.X.r.hasFocus()) {
                AndroidUtilities.hideKeyboard(uyVar.X.r);
                uyVar.X.r.clearFocus();
            }
        } else {
            uyVar.d3 = false;
        }
        if (i10 == 0) {
            this.a = false;
            uyVar.e2 = false;
            boolean z10 = uyVar.b1;
            ty tyVar = this.b;
            if (z10) {
                uyVar.b1 = false;
                if (uyVar.d1) {
                    qy qyVar = tyVar.a;
                    int i11 = qy.v3;
                    qyVar.z1();
                    uyVar.d1 = false;
                }
                tyVar.d.l();
            }
            uy.r1(uyVar, tyVar);
        }
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        qy qyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z10;
        boolean z11;
        this.c.X();
        ty tyVar = this.b;
        vw vwVar = tyVar.x;
        int i12 = -i11;
        ArrayList arrayList = vwVar.x;
        ArrayList arrayList2 = vwVar.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = ((s4.c1) arrayList2.get(i13)).a;
                view.setTranslationY(view.getTranslationY() + i12);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                View view2 = ((s4.c1) arrayList.get(i14)).a;
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
        uy uyVar = this.d;
        uyVar.r3(tyVar);
        uyVar.Q = true;
        View view3 = uyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (uyVar.R0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            s4.c1 K = recyclerView.K(i16);
            if (!uyVar.Z3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = uyVar.Y1;
                if (i18 == i16) {
                    int i19 = uyVar.Z1;
                    int i20 = i19 - top;
                    z10 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        z11 = false;
                        if (z11 && uyVar.a2 && (z10 || uyVar.d3)) {
                            uyVar.c4(z10);
                        }
                        uyVar.Y1 = i16;
                        uyVar.Z1 = top;
                        uyVar.a2 = true;
                    }
                } else {
                    z10 = i16 > i18;
                }
                z11 = true;
                if (z11) {
                    uyVar.c4(z10);
                }
                uyVar.Y1 = i16;
                uyVar.Z1 = top;
                uyVar.a2 = true;
            }
        }
        if (!uyVar.K && recyclerView == uyVar.e0[0].a && !uyVar.j2) {
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                if (!kVar2.s() && !uyVar.e2 && !uyVar.F3.c()) {
                    if (i11 > 0 && uyVar.Z3() && uyVar.e0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    uyVar.Q = true;
                    View view4 = uyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (uyVar.fragmentView != null) {
            uyVar.m3();
        }
        ox oxVar = uyVar.F3;
        if (oxVar != null && oxVar.c() && (qyVar = tyVar.a) != null) {
            qyVar.invalidate();
        }
        lx lxVar = uyVar.E0;
        if (lxVar != null && lxVar.getPremiumHint() != null && uyVar.E0.getPremiumHint().V) {
            uyVar.E0.getPremiumHint().e(true);
        }
        ?? Z3 = uyVar.Z3();
        View childAt2 = tyVar.a.getChildAt(Z3 == true ? 1 : 0);
        uyVar.e.a(i16 > Z3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - uyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) tyVar.a.getPaddingTop()), true);
        if (i11 == 0 || (fVar = uyVar.l4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        fVar.f(i10, i11);
    }
}
