// default package

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class zb3 extends cma {
    public static TimeInterpolator E;
    public k43 o;
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
    public byte D = 0;

    static {
        boolean z = f11.a;
    }

    public float A(View view) {
        return 0.0f;
    }

    public void B(final xb3 xb3Var) {
        final zb3 zb3Var;
        final xb3 xb3Var2;
        f89 f89Var = xb3Var.a;
        View view = f89Var == null ? null : f89Var.a;
        f89 f89Var2 = xb3Var.b;
        View view2 = f89Var2 != null ? f89Var2.a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.g).setStartDelay(0L);
            arrayList.add(xb3Var.a);
            startDelay.translationX(xb3Var.e - xb3Var.c);
            startDelay.translationY(xb3Var.f - xb3Var.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            final byte b = 0;
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: sb3
                public final /* synthetic */ zb3 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b2 = b;
                    xb3 xb3Var3 = xb3Var;
                    zb3 zb3Var2 = this.b;
                    switch (b2) {
                        case 0:
                            f89 f89Var3 = xb3Var3.a;
                            zb3Var2.O();
                            break;
                        default:
                            f89 f89Var4 = xb3Var3.b;
                            zb3Var2.O();
                            break;
                    }
                }
            });
            zb3Var = this;
            xb3Var2 = xb3Var;
            startDelay.setStartDelay(0L).setInterpolator(this.k).setListener(new wb3(zb3Var, xb3Var2, startDelay, view, b)).start();
        } else {
            zb3Var = this;
            xb3Var2 = xb3Var;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(xb3Var2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(zb3Var.f).setStartDelay(zb3Var.i() - zb3Var.f).setInterpolator(zb3Var.k).alpha(1.0f);
            if (zb3Var.A(view2) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            final byte b2 = 1;
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(zb3Var) { // from class: sb3
                public final /* synthetic */ zb3 b;

                {
                    this.b = zb3Var;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b22 = b2;
                    xb3 xb3Var3 = xb3Var2;
                    zb3 zb3Var2 = this.b;
                    switch (b22) {
                        case 0:
                            f89 f89Var3 = xb3Var3.a;
                            zb3Var2.O();
                            break;
                        default:
                            f89 f89Var4 = xb3Var3.b;
                            zb3Var2.O();
                            break;
                    }
                }
            });
            animate.setListener(new wb3(zb3Var, xb3Var2, animate, view2, (byte) 1)).start();
        }
    }

    public void C(f89 f89Var, yb3 yb3Var) {
        int i = yb3Var.b;
        int i2 = yb3Var.c;
        int i3 = yb3Var.d;
        int i4 = yb3Var.e;
        View view = f89Var.a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.z.add(f89Var);
        animate.setUpdateListener(new lk(this, f89Var, (byte) 11));
        k43 k43Var = this.o;
        if (k43Var != null) {
            animate.setInterpolator(k43Var);
        } else {
            animate.setInterpolator(this.i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new vb3(this, f89Var, i5, view, i6, animate, (byte) 0)).start();
    }

    public void D(f89 f89Var) {
        View view = f89Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(f89Var);
        if (this.l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.l).setInterpolator(this.j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new rb3(this, f89Var, (byte) 0));
        animate.setListener(new ub3(this, f89Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((f89) arrayList.get(size)).a.animate().cancel();
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

    public final void H(ArrayList arrayList, f89 f89Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xb3 xb3Var = (xb3) arrayList.get(size);
            if (J(xb3Var, f89Var) && xb3Var.a == null && xb3Var.b == null) {
                arrayList.remove(xb3Var);
            }
        }
    }

    public final void I(xb3 xb3Var) {
        f89 f89Var = xb3Var.a;
        if (f89Var != null) {
            J(xb3Var, f89Var);
        }
        f89 f89Var2 = xb3Var.b;
        if (f89Var2 != null) {
            J(xb3Var, f89Var2);
        }
    }

    public boolean J(xb3 xb3Var, f89 f89Var) {
        if (xb3Var.b == f89Var) {
            xb3Var.b = null;
        } else {
            if (xb3Var.a != f89Var) {
                return false;
            }
            xb3Var.a = null;
        }
        View view = f89Var.a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(f89Var);
        return true;
    }

    public long K(long j, long j2, long j3) {
        return Math.max(j2, j3) + j;
    }

    public long L() {
        return this.d;
    }

    public final void R(f89 f89Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        f89Var.a.animate().setInterpolator(E);
        f(f89Var);
    }

    @Override // o79
    public final boolean c(f89 f89Var, List list) {
        return !list.isEmpty() || t(f89Var);
    }

    @Override // o79
    public void f(f89 f89Var) {
        View view = f89Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((yb3) arrayList.get(size)).a == f89Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(f89Var);
                arrayList.remove(size);
            }
        }
        H(this.s, f89Var);
        if (this.p.remove(f89Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(f89Var);
        }
        if (this.q.remove(f89Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(f89Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, f89Var);
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
                if (((yb3) arrayList5.get(size4)).a == f89Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(f89Var);
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
            if (arrayList7.remove(f89Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(f89Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (this.A.remove(f89Var)) {
            boolean z = f11.a;
            grb.i("after animation is cancelled, item should not be in mRemoveAnimations list");
            return;
        }
        if (this.y.remove(f89Var)) {
            boolean z2 = f11.a;
            grb.i("after animation is cancelled, item should not be in mAddAnimations list");
        } else if (this.B.remove(f89Var)) {
            boolean z3 = f11.a;
            grb.i("after animation is cancelled, item should not be in mChangeAnimations list");
        } else if (!this.z.remove(f89Var)) {
            G();
        } else {
            boolean z4 = f11.a;
            grb.i("after animation is cancelled, item should not be in mMoveAnimations list");
        }
    }

    @Override // o79
    public void g() {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            yb3 yb3Var = (yb3) arrayList.get(size);
            View view = yb3Var.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(yb3Var.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((f89) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f89 f89Var = (f89) arrayList3.get(size3);
            View view2 = f89Var.a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(f89Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((xb3) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.u;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    yb3 yb3Var2 = (yb3) arrayList6.get(size6);
                    View view3 = yb3Var2.a.a;
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    v(yb3Var2.a);
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
                    f89 f89Var2 = (f89) arrayList8.get(size8);
                    View view4 = f89Var2.a;
                    view4.setAlpha(1.0f);
                    if (A(view4) > 0.0f) {
                        view4.setScaleX(1.0f);
                        view4.setScaleY(1.0f);
                    }
                    u(f89Var2);
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
                    I((xb3) arrayList10.get(size10));
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

    @Override // o79
    public final boolean k() {
        return (this.q.isEmpty() && this.s.isEmpty() && this.r.isEmpty() && this.p.isEmpty() && this.z.isEmpty() && this.A.isEmpty() && this.y.isEmpty() && this.B.isEmpty() && this.u.isEmpty() && this.t.isEmpty() && this.v.isEmpty()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o79
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
        byte b = 0;
        Object[] objArr = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            D((f89) obj);
        }
        arrayList.clear();
        if (!isEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.u.add(arrayList5);
            arrayList2.clear();
            tb3 tb3Var = new tb3(this, arrayList5, b);
            if (!this.C || isEmpty) {
                tb3Var.run();
            } else {
                View view = ((yb3) arrayList5.get(0)).a.a;
                long L = L();
                WeakHashMap weakHashMap = ihc.a;
                view.postOnAnimationDelayed(tb3Var, L);
            }
        }
        if (!isEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.v.add(arrayList6);
            arrayList3.clear();
            xs4 xs4Var = new xs4(this, arrayList6, objArr == true ? 1 : 0, (byte) 6);
            if (!this.C || isEmpty) {
                xs4Var.run();
            } else {
                View view2 = ((xb3) arrayList6.get(0)).a.a;
                long j = this.d;
                WeakHashMap weakHashMap2 = ihc.a;
                view2.postOnAnimationDelayed(xs4Var, j);
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.t.add(arrayList7);
        arrayList4.clear();
        tb3 tb3Var2 = new tb3(this, arrayList7, (byte) 1);
        if (!this.C || (isEmpty && isEmpty2 && isEmpty3)) {
            tb3Var2.run();
            return;
        }
        long K = K(!isEmpty ? this.d : 0L, !isEmpty2 ? j() : 0L, isEmpty3 ? 0L : i());
        View view3 = ((f89) arrayList7.get(0)).a;
        WeakHashMap weakHashMap3 = ihc.a;
        view3.postOnAnimationDelayed(tb3Var2, K);
    }

    @Override // cma
    public void p(f89 f89Var) {
        R(f89Var);
        View view = f89Var.a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.q.add(f89Var);
        F();
    }

    @Override // cma
    public boolean q(f89 f89Var, f89 f89Var2, l09 l09Var, int i, int i2, int i3, int i4) {
        if (f89Var == f89Var2) {
            return r(f89Var, l09Var, i, i2, i3, i4);
        }
        View view = f89Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(f89Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = f89Var2.a;
        R(f89Var2);
        view2.setTranslationX(-((int) ((i3 - i) - translationX)));
        view2.setTranslationY(-((int) ((i4 - i2) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.s.add(new xb3(f89Var, f89Var2, i, i2, i3, i4));
        F();
        return true;
    }

    @Override // cma
    public boolean r(f89 f89Var, l09 l09Var, int i, int i2, int i3, int i4) {
        View view = f89Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) f89Var.a.getTranslationY());
        R(f89Var);
        int i5 = i4 - translationY;
        if (i3 - translationX != 0) {
            view.setTranslationX(-r10);
        } else if (i5 == 0) {
            v(f89Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationY(-i5);
        }
        this.r.add(new yb3(f89Var, translationX, translationY, i3, i4));
        F();
        return true;
    }

    @Override // cma
    public void s(f89 f89Var, l09 l09Var) {
        R(f89Var);
        this.p.add(f89Var);
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

    public void P(f89 f89Var) {
    }

    public void z(f89 f89Var) {
    }
}
