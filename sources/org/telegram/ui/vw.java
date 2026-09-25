package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class vw extends s4.s0 {
    public boolean a;
    public final /* synthetic */ py b;
    public final /* synthetic */ jy c;
    public final /* synthetic */ qy d;

    public vw(qy qyVar, py pyVar, jy jyVar) {
        this.d = qyVar;
        this.b = pyVar;
        this.c = jyVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        qy qyVar = this.d;
        if (i10 == 1) {
            this.a = true;
            qyVar.d3 = true;
            a5.a aVar = qyVar.e0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
            }
            if (qyVar.X.r.getText().length() == 0 && qyVar.X.r.hasFocus()) {
                AndroidUtilities.hideKeyboard(qyVar.X.r);
                qyVar.X.r.clearFocus();
            }
        } else {
            qyVar.d3 = false;
        }
        if (i10 == 0) {
            this.a = false;
            qyVar.e2 = false;
            boolean z10 = qyVar.b1;
            py pyVar = this.b;
            if (z10) {
                qyVar.b1 = false;
                if (qyVar.d1) {
                    my myVar = pyVar.a;
                    int i11 = my.v3;
                    myVar.A1();
                    qyVar.d1 = false;
                }
                pyVar.d.l();
            }
            qy.r1(qyVar, pyVar);
        }
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        my myVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z10;
        boolean z11;
        this.c.X();
        py pyVar = this.b;
        rw rwVar = pyVar.x;
        int i12 = -i11;
        ArrayList arrayList = rwVar.x;
        ArrayList arrayList2 = rwVar.o;
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
        qy qyVar = this.d;
        qyVar.r3(pyVar);
        qyVar.Q = true;
        View view3 = qyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (qyVar.R0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            s4.c1 K = recyclerView.K(i16);
            if (!qyVar.Z3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = qyVar.Y1;
                if (i18 == i16) {
                    int i19 = qyVar.Z1;
                    int i20 = i19 - top;
                    z10 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        z11 = false;
                        if (z11 && qyVar.a2 && (z10 || qyVar.d3)) {
                            qyVar.c4(z10);
                        }
                        qyVar.Y1 = i16;
                        qyVar.Z1 = top;
                        qyVar.a2 = true;
                    }
                } else {
                    z10 = i16 > i18;
                }
                z11 = true;
                if (z11) {
                    qyVar.c4(z10);
                }
                qyVar.Y1 = i16;
                qyVar.Z1 = top;
                qyVar.a2 = true;
            }
        }
        if (!qyVar.K && recyclerView == qyVar.e0[0].a && !qyVar.j2) {
            kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                if (!kVar2.s() && !qyVar.e2 && !qyVar.F3.c()) {
                    if (i11 > 0 && qyVar.Z3() && qyVar.e0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    qyVar.Q = true;
                    View view4 = qyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (qyVar.fragmentView != null) {
            qyVar.m3();
        }
        kx kxVar = qyVar.F3;
        if (kxVar != null && kxVar.c() && (myVar = pyVar.a) != null) {
            myVar.invalidate();
        }
        hx hxVar = qyVar.E0;
        if (hxVar != null && hxVar.getPremiumHint() != null && qyVar.E0.getPremiumHint().V) {
            qyVar.E0.getPremiumHint().e(true);
        }
        ?? Z3 = qyVar.Z3();
        View childAt2 = pyVar.a.getChildAt(Z3 == true ? 1 : 0);
        qyVar.e.a(i16 > Z3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - qyVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) pyVar.a.getPaddingTop()), true);
        if (i11 == 0 || (hVar = qyVar.k4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        hVar.f(i10, i11);
    }
}
