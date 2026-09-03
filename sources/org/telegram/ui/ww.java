package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ww extends f2.z0 {
    public boolean a;
    public final /* synthetic */ py b;
    public final /* synthetic */ jy c;
    public final /* synthetic */ qy d;

    public ww(qy qyVar, py pyVar, jy jyVar) {
        this.d = qyVar;
        this.b = pyVar;
        this.c = jyVar;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        qy qyVar = this.d;
        if (i10 == 1) {
            this.a = true;
            qyVar.a3 = true;
            b4.e0 e0Var = qyVar.b0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) e0Var.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) e0Var.c).cancel();
                e0Var.c = null;
            }
            if (qyVar.U.r.getText().length() == 0 && qyVar.U.r.hasFocus()) {
                AndroidUtilities.hideKeyboard(qyVar.U.r);
                qyVar.U.r.clearFocus();
            }
        } else {
            qyVar.a3 = false;
        }
        if (i10 == 0) {
            this.a = false;
            qyVar.b2 = false;
            boolean z4 = qyVar.Y0;
            py pyVar = this.b;
            if (z4) {
                qyVar.Y0 = false;
                if (qyVar.a1) {
                    my myVar = pyVar.a;
                    int i11 = my.s3;
                    myVar.z1();
                    qyVar.a1 = false;
                }
                pyVar.d.l();
            }
            qy.r1(qyVar, pyVar);
        }
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        my myVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z4;
        boolean z10;
        this.c.X();
        py pyVar = this.b;
        sw swVar = pyVar.x;
        int i12 = -i11;
        ArrayList arrayList = swVar.x;
        ArrayList arrayList2 = swVar.o;
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
        qy qyVar = this.d;
        qyVar.r3(pyVar);
        qyVar.N = true;
        View view3 = qyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (qyVar.O0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            f2.l1 K = recyclerView.K(i16);
            if (!qyVar.Z3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = qyVar.V1;
                if (i18 == i16) {
                    int i19 = qyVar.W1;
                    int i20 = i19 - top;
                    z4 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        z10 = false;
                        if (z10 && qyVar.X1 && (z4 || qyVar.a3)) {
                            qyVar.c4(z4);
                        }
                        qyVar.V1 = i16;
                        qyVar.W1 = top;
                        qyVar.X1 = true;
                    }
                } else {
                    z4 = i16 > i18;
                }
                z10 = true;
                if (z10) {
                    qyVar.c4(z4);
                }
                qyVar.V1 = i16;
                qyVar.W1 = top;
                qyVar.X1 = true;
            }
        }
        if (!qyVar.H && recyclerView == qyVar.b0[0].a && !qyVar.g2) {
            kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                if (!kVar2.s() && !qyVar.b2 && !qyVar.C3.c()) {
                    if (i11 > 0 && qyVar.Z3() && qyVar.b0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    qyVar.N = true;
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
        lx lxVar = qyVar.C3;
        if (lxVar != null && lxVar.c() && (myVar = pyVar.a) != null) {
            myVar.invalidate();
        }
        ix ixVar = qyVar.B0;
        if (ixVar != null && ixVar.getPremiumHint() != null && qyVar.B0.getPremiumHint().S) {
            qyVar.B0.getPremiumHint().e(true);
        }
        ?? Z3 = qyVar.Z3();
        View childAt2 = pyVar.a.getChildAt(Z3 == true ? 1 : 0);
        qyVar.e.a(i16 > Z3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - qyVar.K) + ((float) AndroidUtilities.dp(5.0f)) < ((float) pyVar.a.getPaddingTop()), true);
        if (i11 == 0 || (eVar = qyVar.i4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        eVar.f(i10, i11);
    }
}
