package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vw extends f2.a1 {
    public boolean a;
    public final /* synthetic */ oy b;
    public final /* synthetic */ iy c;
    public final /* synthetic */ py d;

    public vw(py pyVar, oy oyVar, iy iyVar) {
        this.d = pyVar;
        this.b = oyVar;
        this.c = iyVar;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        py pyVar = this.d;
        if (i10 == 1) {
            this.a = true;
            pyVar.a3 = true;
            b4.e0 e0Var = pyVar.b0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) e0Var.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) e0Var.c).cancel();
                e0Var.c = null;
            }
            if (pyVar.U.r.getText().length() == 0 && pyVar.U.r.hasFocus()) {
                AndroidUtilities.hideKeyboard(pyVar.U.r);
                pyVar.U.r.clearFocus();
            }
        } else {
            pyVar.a3 = false;
        }
        if (i10 == 0) {
            this.a = false;
            pyVar.b2 = false;
            boolean z4 = pyVar.Y0;
            oy oyVar = this.b;
            if (z4) {
                pyVar.Y0 = false;
                if (pyVar.a1) {
                    ly lyVar = oyVar.a;
                    int i11 = ly.s3;
                    lyVar.z1();
                    pyVar.a1 = false;
                }
                oyVar.d.l();
            }
            py.r1(pyVar, oyVar);
        }
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        og.e eVar;
        ly lyVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View childAt;
        boolean z4;
        boolean z10;
        this.c.X();
        oy oyVar = this.b;
        rw rwVar = oyVar.x;
        int i12 = -i11;
        ArrayList arrayList = rwVar.x;
        ArrayList arrayList2 = rwVar.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = ((f2.m1) arrayList2.get(i13)).a;
                view.setTranslationY(view.getTranslationY() + i12);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                View view2 = ((f2.m1) arrayList.get(i14)).a;
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
        py pyVar = this.d;
        pyVar.r3(oyVar);
        pyVar.N = true;
        View view3 = pyVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (pyVar.O0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            f2.m1 K = recyclerView.K(i16);
            if (!pyVar.Z3() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = pyVar.V1;
                if (i18 == i16) {
                    int i19 = pyVar.W1;
                    int i20 = i19 - top;
                    z4 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        z10 = false;
                        if (z10 && pyVar.X1 && (z4 || pyVar.a3)) {
                            pyVar.c4(z4);
                        }
                        pyVar.V1 = i16;
                        pyVar.W1 = top;
                        pyVar.X1 = true;
                    }
                } else {
                    z4 = i16 > i18;
                }
                z10 = true;
                if (z10) {
                    pyVar.c4(z4);
                }
                pyVar.V1 = i16;
                pyVar.W1 = top;
                pyVar.X1 = true;
            }
        }
        if (!pyVar.H && recyclerView == pyVar.b0[0].a && !pyVar.g2) {
            kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                if (!kVar2.s() && !pyVar.b2 && !pyVar.C3.c()) {
                    if (i11 > 0 && pyVar.Z3() && pyVar.b0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    pyVar.N = true;
                    View view4 = pyVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        if (pyVar.fragmentView != null) {
            pyVar.m3();
        }
        kx kxVar = pyVar.C3;
        if (kxVar != null && kxVar.c() && (lyVar = oyVar.a) != null) {
            lyVar.invalidate();
        }
        hx hxVar = pyVar.B0;
        if (hxVar != null && hxVar.getPremiumHint() != null && pyVar.B0.getPremiumHint().S) {
            pyVar.B0.getPremiumHint().e(true);
        }
        ?? Z3 = pyVar.Z3();
        View childAt2 = oyVar.a.getChildAt(Z3 == true ? 1 : 0);
        pyVar.e.a(i16 > Z3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - pyVar.K) + ((float) AndroidUtilities.dp(5.0f)) < ((float) oyVar.a.getPaddingTop()), true);
        if (i11 == 0 || (eVar = pyVar.i4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        eVar.f(i10, i11);
    }
}
