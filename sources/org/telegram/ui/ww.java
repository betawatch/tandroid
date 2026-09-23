package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ww extends s4.s0 {
    public boolean a;
    public final /* synthetic */ qy b;
    public final /* synthetic */ ky c;
    public final /* synthetic */ ry d;

    public ww(ry ryVar, qy qyVar, ky kyVar) {
        this.d = ryVar;
        this.b = qyVar;
        this.c = kyVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        ry ryVar = this.d;
        if (i10 == 1) {
            this.a = true;
            ryVar.d3 = true;
            a5.a aVar = ryVar.e0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
            }
            if (ryVar.X.r.getText().length() == 0 && ryVar.X.r.hasFocus()) {
                AndroidUtilities.hideKeyboard(ryVar.X.r);
                ryVar.X.r.clearFocus();
            }
        } else {
            ryVar.d3 = false;
        }
        if (i10 == 0) {
            this.a = false;
            ryVar.e2 = false;
            boolean z10 = ryVar.b1;
            qy qyVar = this.b;
            if (z10) {
                ryVar.b1 = false;
                if (ryVar.d1) {
                    ny nyVar = qyVar.a;
                    int i11 = ny.v3;
                    nyVar.A1();
                    ryVar.d1 = false;
                }
                qyVar.d.l();
            }
            ry.r1(ryVar, qyVar);
        }
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        ny nyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z10;
        boolean z11;
        this.c.X();
        qy qyVar = this.b;
        sw swVar = qyVar.x;
        int i12 = -i11;
        ArrayList arrayList = swVar.x;
        ArrayList arrayList2 = swVar.o;
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
        ry ryVar = this.d;
        ryVar.r3(qyVar);
        ryVar.Q = true;
        View view3 = ryVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (ryVar.R0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            s4.c1 K = recyclerView.K(i16);
            if (!ryVar.Z3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = ryVar.Y1;
                if (i18 == i16) {
                    int i19 = ryVar.Z1;
                    int i20 = i19 - top;
                    z10 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        z11 = false;
                        if (z11 && ryVar.a2 && (z10 || ryVar.d3)) {
                            ryVar.c4(z10);
                        }
                        ryVar.Y1 = i16;
                        ryVar.Z1 = top;
                        ryVar.a2 = true;
                    }
                } else {
                    z10 = i16 > i18;
                }
                z11 = true;
                if (z11) {
                    ryVar.c4(z10);
                }
                ryVar.Y1 = i16;
                ryVar.Z1 = top;
                ryVar.a2 = true;
            }
        }
        if (!ryVar.K && recyclerView == ryVar.e0[0].a && !ryVar.j2) {
            kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                if (!kVar2.s() && !ryVar.e2 && !ryVar.F3.c()) {
                    if (i11 > 0 && ryVar.Z3() && ryVar.e0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    ryVar.Q = true;
                    View view4 = ryVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (ryVar.fragmentView != null) {
            ryVar.m3();
        }
        lx lxVar = ryVar.F3;
        if (lxVar != null && lxVar.c() && (nyVar = qyVar.a) != null) {
            nyVar.invalidate();
        }
        ix ixVar = ryVar.E0;
        if (ixVar != null && ixVar.getPremiumHint() != null && ryVar.E0.getPremiumHint().V) {
            ryVar.E0.getPremiumHint().e(true);
        }
        ?? Z3 = ryVar.Z3();
        View childAt2 = qyVar.a.getChildAt(Z3 == true ? 1 : 0);
        ryVar.e.a(i16 > Z3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - ryVar.N) + ((float) AndroidUtilities.dp(5.0f)) < ((float) qyVar.a.getPaddingTop()), true);
        if (i11 == 0 || (hVar = ryVar.k4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        hVar.f(i10, i11);
    }
}
