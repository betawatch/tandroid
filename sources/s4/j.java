package s4;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.ws;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class j extends f1 {
    public static TimeInterpolator E;
    public Interpolator o;
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final ArrayList u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public boolean C = true;
    public long D = 0;

    static {
        boolean z10 = BuildVars.DEBUG_VERSION;
    }

    public float A(View view) {
        return 0.0f;
    }

    public void B(final h hVar) {
        j jVar;
        final h hVar2;
        c1 c1Var = hVar.a;
        View view = c1Var == null ? null : c1Var.a;
        c1 c1Var2 = hVar.b;
        View view2 = c1Var2 != null ? c1Var2.a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.g).setStartDelay(0L);
            arrayList.add(hVar.a);
            startDelay.translationX(hVar.e - hVar.c);
            startDelay.translationY(hVar.f - hVar.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            final int i10 = 0;
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: s4.d
                public final /* synthetic */ j b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            c1 c1Var3 = hVar.a;
                            this.b.O();
                            break;
                        default:
                            c1 c1Var4 = hVar.b;
                            this.b.O();
                            break;
                    }
                }
            });
            jVar = this;
            hVar2 = hVar;
            startDelay.setStartDelay(0L).setInterpolator(this.k).setListener(new g(jVar, hVar2, startDelay, view, 0)).start();
        } else {
            jVar = this;
            hVar2 = hVar;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(hVar2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(jVar.f).setStartDelay(i() - jVar.f).setInterpolator(jVar.k).alpha(1.0f);
            if (A(view2) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            final int i11 = 1;
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: s4.d
                public final /* synthetic */ j b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            c1 c1Var3 = hVar2.a;
                            this.b.O();
                            break;
                        default:
                            c1 c1Var4 = hVar2.b;
                            this.b.O();
                            break;
                    }
                }
            });
            animate.setListener(new g(jVar, hVar2, animate, view2, 1)).start();
        }
    }

    public void C(c1 c1Var, i iVar) {
        int i10 = iVar.b;
        int i11 = iVar.c;
        int i12 = iVar.d;
        int i13 = iVar.e;
        View view = c1Var.a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.z.add(c1Var);
        animate.setUpdateListener(new ah.m0(28, this, c1Var));
        Interpolator interpolator = this.o;
        if (interpolator != null) {
            animate.setInterpolator(interpolator);
        } else {
            animate.setInterpolator(this.i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new ws(this, c1Var, i14, view, i15, animate, 1)).start();
    }

    public void D(c1 c1Var) {
        View view = c1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(c1Var);
        if (this.l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.l).setInterpolator(this.j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new c(this, c1Var, 0));
        animate.setListener(new f(this, c1Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((c1) arrayList.get(size)).a.animate().cancel();
        }
    }

    public final void G() {
        if (k()) {
            return;
        }
        e();
        N();
        this.w.clear();
        this.x.clear();
    }

    public final void H(ArrayList arrayList, c1 c1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h hVar = (h) arrayList.get(size);
            if (J(hVar, c1Var) && hVar.a == null && hVar.b == null) {
                arrayList.remove(hVar);
            }
        }
    }

    public final void I(h hVar) {
        c1 c1Var = hVar.a;
        if (c1Var != null) {
            J(hVar, c1Var);
        }
        c1 c1Var2 = hVar.b;
        if (c1Var2 != null) {
            J(hVar, c1Var2);
        }
    }

    public boolean J(h hVar, c1 c1Var) {
        if (hVar.b == c1Var) {
            hVar.b = null;
        } else {
            if (hVar.a != c1Var) {
                return false;
            }
            hVar.a = null;
        }
        View view = c1Var.a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(c1Var);
        return true;
    }

    public long K(long j3, long j10, long j11) {
        return Math.max(j10, j11) + j3;
    }

    public long L() {
        return this.d;
    }

    public final void R(c1 c1Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        c1Var.a.animate().setInterpolator(E);
        f(c1Var);
    }

    public final void S() {
        this.C = false;
    }

    @Override // s4.m0
    public final boolean c(c1 c1Var, List list) {
        return !list.isEmpty() || t(c1Var);
    }

    @Override // s4.m0
    public void f(c1 c1Var) {
        View view = c1Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((i) arrayList.get(size)).a == c1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(c1Var);
                arrayList.remove(size);
            }
        }
        H(this.s, c1Var);
        if (this.p.remove(c1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(c1Var);
        }
        if (this.q.remove(c1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(c1Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, c1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.u;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((i) arrayList5.get(size4)).a == c1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(c1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.t;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(c1Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(c1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (this.A.remove(c1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
        }
        if (this.y.remove(c1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        if (this.B.remove(c1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
        }
        if (this.z.remove(c1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
        }
        G();
    }

    @Override // s4.m0
    public void g() {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            i iVar = (i) arrayList.get(size);
            View view = iVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(iVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((c1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            c1 c1Var = (c1) arrayList3.get(size3);
            View view2 = c1Var.a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(c1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((h) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.u;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    i iVar2 = (i) arrayList6.get(size6);
                    View view3 = iVar2.a.a;
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    v(iVar2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.t;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    c1 c1Var2 = (c1) arrayList8.get(size8);
                    View view4 = c1Var2.a;
                    view4.setAlpha(1.0f);
                    if (A(view4) > 0.0f) {
                        view4.setScaleX(1.0f);
                        view4.setScaleY(1.0f);
                    }
                    u(c1Var2);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.v;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    I((h) arrayList10.get(size10));
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            E(this.A);
            E(this.z);
            E(this.y);
            E(this.B);
            e();
        }
    }

    @Override // s4.m0
    public final boolean k() {
        return (this.q.isEmpty() && this.s.isEmpty() && this.r.isEmpty() && this.p.isEmpty() && this.z.isEmpty() && this.A.isEmpty() && this.y.isEmpty() && this.B.isEmpty() && this.u.isEmpty() && this.t.isEmpty() && this.v.isEmpty()) ? false : true;
    }

    @Override // s4.m0
    public void m() {
        ArrayList arrayList = this.p;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.r;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.s;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.q;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            D((c1) obj);
        }
        arrayList.clear();
        if (!isEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.u.add(arrayList5);
            arrayList2.clear();
            e eVar = new e(this, arrayList5, i10);
            if (!this.C || isEmpty) {
                eVar.run();
            } else {
                View view = ((i) arrayList5.get(0)).a.a;
                long L = L();
                WeakHashMap weakHashMap = r0.i0.a;
                view.postOnAnimationDelayed(eVar, L);
            }
        }
        if (!isEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.v.add(arrayList6);
            arrayList3.clear();
            e eVar2 = new e(this, arrayList6, 1);
            if (!this.C || isEmpty) {
                eVar2.run();
            } else {
                View view2 = ((h) arrayList6.get(0)).a.a;
                long j3 = this.d;
                WeakHashMap weakHashMap2 = r0.i0.a;
                view2.postOnAnimationDelayed(eVar2, j3);
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.t.add(arrayList7);
        arrayList4.clear();
        e eVar3 = new e(this, arrayList7, 2);
        if (!this.C || (isEmpty && isEmpty2 && isEmpty3)) {
            eVar3.run();
            return;
        }
        long K = K(!isEmpty ? this.d : 0L, !isEmpty2 ? j() : 0L, isEmpty3 ? 0L : i());
        View view3 = ((c1) arrayList7.get(0)).a;
        WeakHashMap weakHashMap3 = r0.i0.a;
        view3.postOnAnimationDelayed(eVar3, K);
    }

    @Override // s4.f1
    public void p(c1 c1Var) {
        R(c1Var);
        View view = c1Var.a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.q.add(c1Var);
        F();
    }

    @Override // s4.f1
    public boolean q(c1 c1Var, c1 c1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        if (c1Var == c1Var2) {
            return r(c1Var, q0Var, i10, i11, i12, i13);
        }
        View view = c1Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(c1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = c1Var2.a;
        R(c1Var2);
        view2.setTranslationX(-((int) ((i12 - i10) - translationX)));
        view2.setTranslationY(-((int) ((i13 - i11) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.s.add(new h(c1Var, c1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override // s4.f1
    public boolean r(c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = c1Var.a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) c1Var.a.getTranslationY());
        R(c1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(c1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.r.add(new i(c1Var, translationX, translationY, i12, i13));
        F();
        return true;
    }

    @Override // s4.f1
    public void s(c1 c1Var, b2.q0 q0Var) {
        R(c1Var);
        this.p.add(c1Var);
        F();
    }

    public void F() {
    }

    public void M() {
    }

    public void N() {
    }

    public void O() {
    }

    public void Q() {
    }

    public void P(c1 c1Var) {
    }

    public void z(c1 c1Var) {
    }
}
