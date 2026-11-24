// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yg3 extends hia {
    public static final DecelerateInterpolator F = new DecelerateInterpolator();
    public boolean A;
    public int B;
    public int C;
    public final yi3 D;
    public final /* synthetic */ bj3 E;
    public final ArrayList o = new ArrayList();
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
    public ue3 z;

    public yg3(yi3 yi3Var, bj3 bj3Var) {
        this.E = bj3Var;
        this.m = false;
        this.D = yi3Var;
    }

    public final void A() {
        if (k()) {
            return;
        }
        e();
    }

    public final void B(ArrayList arrayList, s49 s49Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ik3 ik3Var = (ik3) arrayList.get(size);
            if (C(ik3Var, s49Var) && ik3Var.a == null && ik3Var.b == null) {
                arrayList.remove(ik3Var);
            }
        }
    }

    public final boolean C(ik3 ik3Var, s49 s49Var) {
        if (ik3Var.b == s49Var) {
            ik3Var.b = null;
        } else {
            if (ik3Var.a != s49Var) {
                return false;
            }
            ik3Var.a = null;
        }
        View view = s49Var.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(s49Var);
        return true;
    }

    public final void D() {
        this.B = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.C = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.z = null;
        this.A = false;
    }

    public final void E(s49 s49Var) {
        s49Var.a.animate().setInterpolator(F);
        f(s49Var);
    }

    @Override // b49
    public final void f(s49 s49Var) {
        View view = s49Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((jk3) arrayList.get(size)).a == s49Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(s49Var);
                arrayList.remove(size);
            }
        }
        B(this.r, s49Var);
        if (this.o.remove(s49Var)) {
            if (view instanceof ue3) {
                ((ue3) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(s49Var);
        }
        if (this.p.remove(s49Var)) {
            if (view instanceof ue3) {
                ((ue3) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(s49Var);
        }
        ArrayList arrayList2 = this.u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, s49Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((jk3) arrayList5.get(size4)).a == s49Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(s49Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(s49Var)) {
                if (view instanceof ue3) {
                    ((ue3) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(s49Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.x.remove(s49Var);
        this.v.remove(s49Var);
        this.y.remove(s49Var);
        this.w.remove(s49Var);
        A();
    }

    @Override // b49
    public final void g() {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            jk3 jk3Var = (jk3) arrayList.get(size);
            View view = jk3Var.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(jk3Var.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s49 s49Var = (s49) arrayList2.get(size2);
            View view2 = s49Var.a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(s49Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            s49 s49Var2 = (s49) arrayList3.get(size3);
            View view3 = s49Var2.a;
            if (view3 instanceof ue3) {
                ((ue3) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(s49Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ik3 ik3Var = (ik3) arrayList4.get(size4);
            s49 s49Var3 = ik3Var.a;
            if (s49Var3 != null) {
                C(ik3Var, s49Var3);
            }
            s49 s49Var4 = ik3Var.b;
            if (s49Var4 != null) {
                C(ik3Var, s49Var4);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.t;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    jk3 jk3Var2 = (jk3) arrayList6.get(size6);
                    View view4 = jk3Var2.a.a;
                    view4.setTranslationY(0.0f);
                    view4.setTranslationX(0.0f);
                    v(jk3Var2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.s;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    s49 s49Var5 = (s49) arrayList8.get(size8);
                    View view5 = s49Var5.a;
                    if (view5 instanceof ue3) {
                        ((ue3) view5).setClipProgress(0.0f);
                    } else {
                        view5.setAlpha(1.0f);
                    }
                    u(s49Var5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.u;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    ik3 ik3Var2 = (ik3) arrayList10.get(size10);
                    s49 s49Var6 = ik3Var2.a;
                    if (s49Var6 != null) {
                        C(ik3Var2, s49Var6);
                    }
                    s49 s49Var7 = ik3Var2.b;
                    if (s49Var7 != null) {
                        C(ik3Var2, s49Var7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            z(this.x);
            z(this.w);
            z(this.v);
            z(this.y);
            e();
        }
    }

    @Override // b49
    public final boolean k() {
        if (!this.p.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.r;
        return (arrayList.isEmpty() && this.q.isEmpty() && arrayList.isEmpty() && this.w.isEmpty() && this.x.isEmpty() && this.v.isEmpty() && this.y.isEmpty() && this.t.isEmpty() && this.s.isEmpty() && this.u.isEmpty()) ? false : true;
    }

    @Override // b49
    public final void m() {
        ArrayList arrayList;
        int i;
        long j;
        ArrayList arrayList2 = this.o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        long j2 = (!this.A || isEmpty) ? 0L : 180L;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            byte b = 0;
            s49 s49Var = (s49) obj;
            View view = s49Var.a;
            this.x.add(s49Var);
            if (!(view instanceof ue3) || this.A) {
                arrayList = arrayList2;
                i = size;
                j = j2;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).setStartDelay(0L).alpha(0.0f).setListener(new hk3(this, s49Var, animate, view)).start();
            } else {
                ue3 ue3Var = (ue3) view;
                ue3 ue3Var2 = this.z;
                arrayList = arrayList2;
                DecelerateInterpolator decelerateInterpolator = F;
                if (view == ue3Var2) {
                    i = size;
                    if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight = ue3Var2.getMeasuredHeight();
                        int i3 = this.B;
                        this.C = measuredHeight - i3;
                        this.z.setTopClip(i3);
                        this.z.setBottomClip(this.C);
                    } else if (this.C != Integer.MAX_VALUE) {
                        int measuredHeight2 = ue3Var2.getMeasuredHeight() - this.C;
                        this.B = measuredHeight2;
                        this.z.setTopClip(measuredHeight2);
                        this.z.setBottomClip(this.C);
                    }
                    ue3Var.setElevation(-1.0f);
                    ue3Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(ue3Var, rn.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new gk3(this, s49Var, ue3Var, b));
                    duration.start();
                    j = j2;
                } else {
                    i = size;
                    j = j2;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(ue3Var, (Property<ue3, Float>) View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new gk3(this, s49Var, ue3Var, (byte) 1));
                    duration2.start();
                }
            }
            arrayList2 = arrayList;
            size = i;
            j2 = j;
        }
        final long j3 = j2;
        arrayList2.clear();
        if (!isEmpty2) {
            final ArrayList arrayList6 = new ArrayList(arrayList3);
            this.t.add(arrayList6);
            arrayList3.clear();
            final byte b2 = 0;
            new Runnable(this) { // from class: ek3
                public final /* synthetic */ yg3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    long j4 = 180;
                    ArrayList arrayList7 = arrayList6;
                    switch (b3) {
                        case 0:
                            int size2 = arrayList7.size();
                            int i4 = 0;
                            while (true) {
                                yg3 yg3Var = this.b;
                                if (i4 >= size2) {
                                    arrayList7.clear();
                                    yg3Var.t.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj2 = arrayList7.get(i4);
                                    i4++;
                                    jk3 jk3Var = (jk3) obj2;
                                    s49 s49Var2 = jk3Var.a;
                                    int i5 = jk3Var.b;
                                    int i6 = jk3Var.c;
                                    int i7 = jk3Var.d;
                                    int i8 = jk3Var.e;
                                    View view2 = s49Var2.a;
                                    int i9 = i7 - i5;
                                    int i10 = i8 - i6;
                                    if (i9 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i10 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i6 > i8) {
                                        yg3Var.C = i6 - i8;
                                    } else {
                                        yg3Var.B = i10;
                                    }
                                    ue3 ue3Var3 = yg3Var.z;
                                    if (ue3Var3 != null) {
                                        if (yg3Var.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = ue3Var3.getMeasuredHeight();
                                            int i11 = yg3Var.B;
                                            yg3Var.C = measuredHeight3 - i11;
                                            yg3Var.z.setTopClip(i11);
                                            yg3Var.z.setBottomClip(yg3Var.C);
                                        } else if (yg3Var.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = ue3Var3.getMeasuredHeight() - yg3Var.C;
                                            yg3Var.B = measuredHeight4;
                                            yg3Var.z.setTopClip(measuredHeight4);
                                            yg3Var.z.setBottomClip(yg3Var.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    yg3Var.w.add(s49Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new cb3(yg3Var, s49Var2, i9, view2, i10, animate2, (byte) 1)).start();
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i12 = 0;
                            while (true) {
                                yg3 yg3Var2 = this.b;
                                if (i12 >= size3) {
                                    arrayList7.clear();
                                    yg3Var2.u.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj3 = arrayList7.get(i12);
                                    i12++;
                                    ik3 ik3Var = (ik3) obj3;
                                    ArrayList arrayList8 = yg3Var2.y;
                                    s49 s49Var3 = ik3Var.a;
                                    s49 s49Var4 = ik3Var.b;
                                    if (s49Var3 != null && s49Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j4);
                                        View view3 = s49Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(s49Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(ik3Var.a);
                                        arrayList8.add(ik3Var.b);
                                        animatorSet.addListener(new ga2(yg3Var2, ik3Var, s49Var3, animatorSet, (byte) 1));
                                        animatorSet.start();
                                    }
                                    j4 = 180;
                                }
                            }
                            break;
                    }
                }
            }.run();
        }
        if (!isEmpty3) {
            final ArrayList arrayList7 = new ArrayList(arrayList4);
            this.u.add(arrayList7);
            arrayList4.clear();
            final byte b3 = 1;
            new Runnable(this) { // from class: ek3
                public final /* synthetic */ yg3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b32 = b3;
                    long j4 = 180;
                    ArrayList arrayList72 = arrayList7;
                    switch (b32) {
                        case 0:
                            int size2 = arrayList72.size();
                            int i4 = 0;
                            while (true) {
                                yg3 yg3Var = this.b;
                                if (i4 >= size2) {
                                    arrayList72.clear();
                                    yg3Var.t.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj2 = arrayList72.get(i4);
                                    i4++;
                                    jk3 jk3Var = (jk3) obj2;
                                    s49 s49Var2 = jk3Var.a;
                                    int i5 = jk3Var.b;
                                    int i6 = jk3Var.c;
                                    int i7 = jk3Var.d;
                                    int i8 = jk3Var.e;
                                    View view2 = s49Var2.a;
                                    int i9 = i7 - i5;
                                    int i10 = i8 - i6;
                                    if (i9 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i10 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i6 > i8) {
                                        yg3Var.C = i6 - i8;
                                    } else {
                                        yg3Var.B = i10;
                                    }
                                    ue3 ue3Var3 = yg3Var.z;
                                    if (ue3Var3 != null) {
                                        if (yg3Var.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = ue3Var3.getMeasuredHeight();
                                            int i11 = yg3Var.B;
                                            yg3Var.C = measuredHeight3 - i11;
                                            yg3Var.z.setTopClip(i11);
                                            yg3Var.z.setBottomClip(yg3Var.C);
                                        } else if (yg3Var.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = ue3Var3.getMeasuredHeight() - yg3Var.C;
                                            yg3Var.B = measuredHeight4;
                                            yg3Var.z.setTopClip(measuredHeight4);
                                            yg3Var.z.setBottomClip(yg3Var.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    yg3Var.w.add(s49Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new cb3(yg3Var, s49Var2, i9, view2, i10, animate2, (byte) 1)).start();
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i12 = 0;
                            while (true) {
                                yg3 yg3Var2 = this.b;
                                if (i12 >= size3) {
                                    arrayList72.clear();
                                    yg3Var2.u.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj3 = arrayList72.get(i12);
                                    i12++;
                                    ik3 ik3Var = (ik3) obj3;
                                    ArrayList arrayList8 = yg3Var2.y;
                                    s49 s49Var3 = ik3Var.a;
                                    s49 s49Var4 = ik3Var.b;
                                    if (s49Var3 != null && s49Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j4);
                                        View view3 = s49Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(s49Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(ik3Var.a);
                                        arrayList8.add(ik3Var.b);
                                        animatorSet.addListener(new ga2(yg3Var2, ik3Var, s49Var3, animatorSet, (byte) 1));
                                        animatorSet.start();
                                    }
                                    j4 = 180;
                                }
                            }
                            break;
                    }
                }
            }.run();
        }
        if (!isEmpty4) {
            final ArrayList arrayList8 = new ArrayList(arrayList5);
            this.s.add(arrayList8);
            arrayList5.clear();
            new Runnable(arrayList8, j3) { // from class: fk3
                public final /* synthetic */ ArrayList b;
                public final /* synthetic */ short c;

                /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
                {
                    this.c = (int) j3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    long j4 = this.c;
                    ArrayList arrayList9 = this.b;
                    int size2 = arrayList9.size();
                    int i4 = 0;
                    while (true) {
                        yg3 yg3Var = yg3.this;
                        if (i4 >= size2) {
                            arrayList9.clear();
                            yg3Var.s.remove(arrayList9);
                            return;
                        }
                        Object obj2 = arrayList9.get(i4);
                        i4++;
                        s49 s49Var2 = (s49) obj2;
                        View view2 = s49Var2.a;
                        yg3Var.v.add(s49Var2);
                        ViewPropertyAnimator animate2 = view2.animate();
                        animate2.alpha(1.0f).setDuration(180L).setStartDelay(j4).setListener(new hk3(yg3Var, s49Var2, view2, animate2)).start();
                    }
                }
            }.run();
        }
        this.A = false;
    }

    @Override // hia
    public final void p(s49 s49Var) {
        E(s49Var);
        View view = s49Var.a;
        if (!(view instanceof ue3)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.p;
        arrayList.add(s49Var);
        if (arrayList.size() > 2) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((s49) arrayList.get(i)).a.setAlpha(0.0f);
                if (((s49) arrayList.get(i)).a instanceof ue3) {
                    ((ue3) ((s49) arrayList.get(i)).a).setMoving(true);
                }
            }
        }
    }

    @Override // hia
    public final boolean q(s49 s49Var, s49 s49Var2, zw8 zw8Var, int i, int i2, int i3, int i4) {
        View view = s49Var.a;
        if (!(view instanceof ue3)) {
            return false;
        }
        E(s49Var);
        E(s49Var2);
        View view2 = s49Var2.a;
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
        view2.setTranslationX(0.0f);
        ik3 ik3Var = new ik3();
        ik3Var.a = s49Var;
        ik3Var.b = s49Var2;
        ik3Var.c = i;
        ik3Var.d = i2;
        ik3Var.e = i3;
        ik3Var.f = i4;
        this.r.add(ik3Var);
        return true;
    }

    @Override // hia
    public final boolean r(s49 s49Var, zw8 zw8Var, int i, int i2, int i3, int i4) {
        View view = s49Var.a;
        int translationX = i + ((int) view.getTranslationX());
        View view2 = s49Var.a;
        int translationY = i2 + ((int) view2.getTranslationY());
        E(s49Var);
        int i5 = i4 - translationY;
        if (i3 - translationX != 0) {
            view.setTranslationX(-r1);
        } else if (i5 == 0) {
            v(s49Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationY(-i5);
        }
        if (view2 instanceof ue3) {
            ((ue3) view2).setMoving(true);
        } else if (view2 instanceof nj3) {
            ((nj3) view2).a = true;
        }
        jk3 jk3Var = new jk3();
        jk3Var.a = s49Var;
        jk3Var.b = translationX;
        jk3Var.c = translationY;
        jk3Var.d = i3;
        jk3Var.e = i4;
        this.q.add(jk3Var);
        return true;
    }

    @Override // hia
    public final void s(s49 s49Var, zw8 zw8Var) {
        E(s49Var);
        this.o.add(s49Var);
        if (this.A) {
            return;
        }
        ue3 ue3Var = null;
        int i = 0;
        while (true) {
            yi3 yi3Var = this.D;
            if (i >= yi3Var.getChildCount()) {
                break;
            }
            View childAt = yi3Var.getChildAt(i);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof ue3)) {
                ue3Var = (ue3) childAt;
            }
            i++;
        }
        if (s49Var.a == ue3Var) {
            this.z = ue3Var;
        }
    }

    @Override // hia
    public final void y() {
        bj3 bj3Var = this.E;
        if (bj3Var.c.K0() == 0) {
            View m = bj3Var.c.m(0);
            if (m != null) {
                m.invalidate();
            }
            if (bj3Var.w == 2) {
                bj3Var.w = (byte) 1;
            }
            dh3 dh3Var = bj3Var.n;
            if (dh3Var != null) {
                dh3Var.b();
            }
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s49) arrayList.get(size)).a.animate().cancel();
        }
    }
}
