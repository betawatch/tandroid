// default package

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wh3 extends v79 {
    public boolean a;
    public final /* synthetic */ tj3 b;
    public final /* synthetic */ nj3 c;
    public final /* synthetic */ uj3 d;

    public wh3(uj3 uj3Var, tj3 tj3Var, nj3 nj3Var) {
        this.d = uj3Var;
        this.b = tj3Var;
        this.c = nj3Var;
    }

    @Override // v79
    public final void a(RecyclerView recyclerView, int i) {
        boolean z;
        uj3 uj3Var = this.d;
        if (i == 1) {
            this.a = true;
            uj3Var.g3 = true;
            lp lpVar = uj3Var.f0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) lpVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) lpVar.c).cancel();
                lpVar.c = null;
            }
            if (uj3Var.Y.r.getText().length() == 0 && uj3Var.Y.r.hasFocus()) {
                hl.t1(uj3Var.Y.r);
                uj3Var.Y.r.clearFocus();
            }
        } else {
            uj3Var.g3 = false;
        }
        if (i == 0) {
            this.a = false;
            uj3Var.g2 = false;
            boolean z2 = uj3Var.d1;
            tj3 tj3Var = this.b;
            if (z2) {
                uj3Var.d1 = false;
                if (uj3Var.f1) {
                    qj3 qj3Var = tj3Var.a;
                    int i2 = qj3.C3;
                    qj3Var.E1();
                    uj3Var.f1 = false;
                }
                tj3Var.d.f();
            }
            uj3Var.J2(tj3Var);
        }
        z = ((e) uj3Var).isPaused;
        if (z) {
            return;
        }
        uj3Var.w4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean] */
    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        tq3 tq3Var;
        qj3 qj3Var;
        a aVar;
        a aVar2;
        View childAt;
        boolean z;
        Object[] objArr;
        this.c.V();
        tj3 tj3Var = this.b;
        sh3 sh3Var = tj3Var.y;
        int i3 = -i2;
        ArrayList arrayList = sh3Var.x;
        ArrayList arrayList2 = sh3Var.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = ((f89) arrayList2.get(i4)).a;
                view.setTranslationY(view.getTranslationY() + i3);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                View view2 = ((f89) arrayList.get(i5)).a;
                view2.setTranslationY(view2.getTranslationY() + i3);
            }
        }
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < recyclerView.getChildCount(); i8++) {
            int S = RecyclerView.S(recyclerView.getChildAt(i8));
            if (S >= 0) {
                if (i6 == -1 || S > i6) {
                    i6 = S;
                }
                if (i7 == -1 || S < i7) {
                    i7 = S;
                }
            }
        }
        uj3 uj3Var = this.d;
        uj3Var.M2(tj3Var);
        uj3Var.R = true;
        View view3 = uj3Var.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (uj3Var.T0 != 10 && this.a && recyclerView.getChildCount() > 0 && i7 != -1) {
            f89 L = recyclerView.L(i7);
            if (!uj3Var.y3() || (L != null && L.b() >= 0)) {
                int top = L != null ? L.a.getTop() : 0;
                int i9 = uj3Var.a2;
                if (i9 == i7) {
                    int i10 = uj3Var.b2;
                    int i11 = i10 - top;
                    z = top < i10;
                    if (Math.abs(i11) <= 1) {
                        objArr = false;
                        if (objArr != false && uj3Var.c2 && (z || uj3Var.g3)) {
                            uj3Var.B3(z);
                        }
                        uj3Var.a2 = i7;
                        uj3Var.b2 = top;
                        uj3Var.c2 = true;
                    }
                } else {
                    z = i7 > i9;
                }
                objArr = true;
                if (objArr != false) {
                    uj3Var.B3(z);
                }
                uj3Var.a2 = i7;
                uj3Var.b2 = top;
                uj3Var.c2 = true;
            }
        }
        if (!uj3Var.L && recyclerView == uj3Var.f0[0].a && !uj3Var.l2) {
            aVar = ((e) uj3Var).actionBar;
            if (aVar != null) {
                aVar2 = ((e) uj3Var).actionBar;
                if (!aVar2.z() && !uj3Var.g2 && !uj3Var.H3.c()) {
                    if (i2 > 0 && uj3Var.y3() && uj3Var.f0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.U(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i2 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i2 = -top2;
                            }
                        }
                    }
                    uj3Var.R = true;
                    View view4 = uj3Var.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        li3 li3Var = uj3Var.H3;
        if (li3Var != null && li3Var.c() && (qj3Var = tj3Var.a) != null) {
            qj3Var.invalidate();
        }
        ii3 ii3Var = uj3Var.F0;
        if (ii3Var != null && ii3Var.getPremiumHint() != null && uj3Var.F0.getPremiumHint().W) {
            uj3Var.F0.getPremiumHint().f(true);
        }
        ?? y3 = uj3Var.y3();
        View childAt2 = tj3Var.a.getChildAt(y3 == true ? 1 : 0);
        uj3Var.e.a(i7 > y3 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - uj3Var.O) + ((float) hl.L(5.0f)) < ((float) tj3Var.a.getPaddingTop()), true);
        if (i2 == 0 || (tq3Var = uj3Var.q4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        tq3Var.f(i, i2);
    }
}
