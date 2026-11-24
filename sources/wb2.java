// default package

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class wb2 extends sc3 {
    public static final d53 V = new d53(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final yv1 F;
    public final r59 G;
    public boolean N;
    public u69 O;
    public ua2 P;
    public boolean Q;
    public final ylb R;
    public tp1 T;
    public um1 U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public wb2(yv1 yv1Var, r59 r59Var, ylb ylbVar) {
        this.R = ylbVar;
        this.F = yv1Var;
        this.G = r59Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override // sc3
    public final void B(qc3 qc3Var) {
        wb2 wb2Var;
        qc3 qc3Var2;
        u69 u69Var = qc3Var.a;
        View view = u69Var == null ? null : u69Var.a;
        u69 u69Var2 = qc3Var.b;
        View view2 = u69Var2 != null ? u69Var2.a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(qc3Var.a);
            duration.translationX(qc3Var.e - qc3Var.c);
            duration.translationY(qc3Var.f - qc3Var.d);
            wb2Var = this;
            qc3Var2 = qc3Var;
            duration.alpha(0.0f).setListener(new tb2(wb2Var, qc3Var2, duration, view, (byte) 0)).start();
        } else {
            wb2Var = this;
            qc3Var2 = qc3Var;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(qc3Var2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new tb2(wb2Var, qc3Var2, animate, view2, (byte) 1)).start();
        }
    }

    @Override // sc3
    public final void C(u69 u69Var, rc3 rc3Var) {
        S(u69Var, rc3Var, false);
    }

    @Override // sc3
    public final boolean J(qc3 qc3Var, u69 u69Var) {
        jlb jlbVar;
        if (e21.a) {
            fc4.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(u69Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = u69Var.a;
        if (this.K.contains(view) && (jlbVar = (jlb) this.U.run()) != null) {
            jlbVar.a(view);
        }
        if (qc3Var.b == u69Var) {
            qc3Var.b = null;
        } else {
            if (qc3Var.a != u69Var) {
                return false;
            }
            qc3Var.a = null;
        }
        W(view);
        d(u69Var);
        return true;
    }

    @Override // sc3
    public final long L() {
        return 0L;
    }

    @Override // sc3
    public void N() {
        this.G.setClipChildren(true);
        while (true) {
            ArrayList arrayList = this.L;
            if (arrayList.isEmpty()) {
                T();
                return;
            }
            ((Runnable) arrayList.remove(0)).run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(final u69 u69Var, rc3 rc3Var, boolean z) {
        u69 u69Var2;
        yc2 yc2Var;
        int i;
        rc2 rc2Var;
        boolean z2;
        float f;
        boolean z3;
        final vb2 vb2Var;
        final rc2 rc2Var2;
        yc2 yc2Var2;
        final byte b;
        final yc2 yc2Var3;
        ValueAnimator valueAnimator;
        final boolean z4;
        int[] iArr;
        int i2 = rc3Var.c;
        int i3 = rc3Var.e;
        View view = u69Var.a;
        int i4 = i3 - i2;
        AnimatorSet animatorSet = new AnimatorSet();
        byte b2 = 0;
        final byte b3 = 1;
        if (i4 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.z.add(u69Var);
        final vb2 vb2Var2 = (vb2) rc3Var;
        if (this.F != null) {
            if (view instanceof er0) {
                er0 er0Var = (er0) view;
                float translationY = er0Var.getTranslationY();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new sb2(this, er0Var, translationY, b2));
                animatorSet.playTogether(ofFloat);
            } else if (view instanceof h9c) {
                h9c h9cVar = (h9c) view;
                float translationY2 = h9cVar.getTranslationY();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new sb2(this, h9cVar, translationY2, b3));
                animatorSet.playTogether(ofFloat2);
            }
            u69Var2 = u69Var;
            if (z) {
                d53 d53Var = this.o;
                if (d53Var != null) {
                    animatorSet.setInterpolator(d53Var);
                }
            } else {
                animatorSet.setInterpolator(d53.g);
            }
            animatorSet.setDuration((long) (250.0f * (z ? 1.9f : 1.0f)));
            animatorSet.addListener(new dr1(this, u69Var2, i4, view));
            animatorSet.start();
            this.J.put(u69Var2, animatorSet);
        }
        if (view instanceof rc2) {
            final rc2 rc2Var3 = (rc2) view;
            final yc2 transitionParams = rc2Var3.getTransitionParams();
            animatorSet.playTogether(ObjectAnimator.ofFloat(rc2Var3, rc2Var3.xd, 0.0f));
            if (vb2Var2.n) {
                rc2Var3.x3(vb2Var2.o, vb2Var2.p, vb2Var2.q, vb2Var2.r);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                final float f2 = rc2Var3.getCurrentMessagesGroup() == null ? transitionParams.v0 : rc2Var3.getCurrentMessagesGroup().m.n;
                final float f22 = rc2Var3.getCurrentMessagesGroup() == null ? rc2Var3.f2() : rc2Var3.getCurrentMessagesGroup().c;
                if (f2 != f22) {
                    valueAnimator = ofFloat3;
                    z4 = true;
                } else {
                    valueAnimator = ofFloat3;
                    z4 = false;
                }
                if (transitionParams.C0) {
                    z2 = false;
                    iArr = new int[4];
                    int i5 = 0;
                    for (int i6 = 4; i5 < i6; i6 = 4) {
                        iArr[i5] = rc2Var3.getPhotoImage().X0[i5];
                        i5++;
                    }
                } else {
                    z2 = false;
                    iArr = null;
                }
                final int[] iArr2 = iArr;
                ValueAnimator valueAnimator2 = valueAnimator;
                i = 2;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: lb2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        vb2 vb2Var3 = vb2.this;
                        float f3 = 1.0f - floatValue;
                        float f4 = vb2Var3.o * f3;
                        yc2 yc2Var4 = transitionParams;
                        float f5 = (yc2Var4.n0 * floatValue) + f4;
                        float f6 = (yc2Var4.o0 * floatValue) + (vb2Var3.p * f3);
                        float f7 = (yc2Var4.p0 * floatValue) + (vb2Var3.q * f3);
                        float f8 = (yc2Var4.q0 * floatValue) + (vb2Var3.r * f3);
                        boolean z5 = z4;
                        rc2 rc2Var4 = rc2Var3;
                        if (z5) {
                            float f9 = (f22 * floatValue) + (f2 * f3);
                            yc2Var4.v0 = f9;
                            if (rc2Var4.getCurrentMessagesGroup() != null) {
                                rc2Var4.getCurrentMessagesGroup().m.n = f9;
                            }
                        }
                        if (yc2Var4.C0) {
                            ImageReceiver photoImage = rc2Var4.getPhotoImage();
                            int[] iArr3 = iArr2;
                            int[] iArr4 = yc2Var4.B0;
                            photoImage.r0((int) ((iArr4[0] * floatValue) + (iArr3[0] * f3)), (int) ((iArr4[1] * floatValue) + (iArr3[1] * f3)), (int) ((iArr4[2] * floatValue) + (iArr3[2] * f3)), (int) ((iArr4[3] * floatValue) + (iArr3[3] * f3)));
                        }
                        rc2Var4.x3(f5, f6, f7, f8);
                        u69Var.a.invalidate();
                    }
                };
                yc2Var = transitionParams;
                rc2Var = rc2Var3;
                u69Var2 = u69Var;
                valueAnimator2.addUpdateListener(animatorUpdateListener);
                Animator[] animatorArr = new Animator[1];
                animatorArr[z2 ? 1 : 0] = valueAnimator2;
                animatorSet.playTogether(animatorArr);
            } else {
                yc2Var = transitionParams;
                i = 2;
                rc2Var = rc2Var3;
                u69Var2 = u69Var;
                z2 = false;
            }
            if (vb2Var2.v == 0 && vb2Var2.t == 0 && vb2Var2.u == 0 && vb2Var2.s == 0) {
                f = 0.0f;
                yc2Var.l0 = 0.0f;
                yc2Var.m0 = 0.0f;
                z3 = z2;
            } else {
                f = 0.0f;
                r59 r59Var = this.G;
                r59Var.setClipChildren(z2);
                r59Var.invalidate();
                float[] fArr = new float[i];
                // fill-array-data instruction
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr);
                boolean z5 = vb2Var2.l;
                int i7 = vb2Var2.s;
                if (z5) {
                    yc2Var.l0 = -i7;
                    yc2Var.m0 = -vb2Var2.t;
                } else {
                    yc2Var.l0 = (-i7) - rc2Var.getAnimationOffsetX();
                    yc2Var.m0 = (-vb2Var2.t) - rc2Var.getAnimationOffsetX();
                }
                ofFloat4.addUpdateListener(new nl(vb2Var2, yc2Var, rc2Var, b3));
                z3 = false;
                animatorSet.playTogether(ofFloat4);
            }
            f47 currentMessagesGroup = rc2Var.getCurrentMessagesGroup();
            if (currentMessagesGroup == null) {
                vb2Var2.j = z3;
            }
            if (vb2Var2.j) {
                float[] fArr2 = new float[i];
                // fill-array-data instruction
                fArr2[0] = 1.0f;
                fArr2[1] = 0.0f;
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(fArr2);
                yc2 yc2Var4 = yc2Var;
                final e47 e47Var = currentMessagesGroup.m;
                final r59 r59Var2 = (r59) view.getParent();
                final float f3 = currentMessagesGroup.m.n;
                if (currentMessagesGroup.c) {
                    f = 1.0f;
                }
                final boolean z6 = f3 != f;
                yc2Var2 = yc2Var4;
                final float f4 = f;
                vb2Var = vb2Var2;
                rc2Var2 = rc2Var;
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mb2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        vb2 vb2Var3 = vb2Var;
                        e47 e47Var2 = e47.this;
                        e47Var2.f = vb2Var3.f * floatValue;
                        e47Var2.h = vb2Var3.g * floatValue;
                        e47Var2.e = vb2Var3.h * floatValue;
                        e47Var2.g = vb2Var3.i * floatValue;
                        if (z6) {
                            e47Var2.n = td4.A(1.0f, floatValue, f4, f3 * floatValue);
                        }
                        r59 r59Var3 = r59Var2;
                        if (r59Var3 != null) {
                            r59Var3.invalidate();
                        }
                    }
                });
                ofFloat5.addListener(new b91((Object) e47Var, (byte) 23));
                b = 0;
                animatorSet.playTogether(ofFloat5);
            } else {
                vb2Var = vb2Var2;
                rc2Var2 = rc2Var;
                yc2Var2 = yc2Var;
                b = 0;
            }
            if (vb2Var.k) {
                float[] fArr3 = new float[i];
                // fill-array-data instruction
                fArr3[0] = 0.0f;
                fArr3[1] = 1.0f;
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(fArr3);
                yc2Var3 = yc2Var2;
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nb2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        byte b4 = b;
                        rc2 rc2Var4 = rc2Var2;
                        yc2 yc2Var5 = yc2Var3;
                        switch (b4) {
                            case 0:
                                yc2Var5.A0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                rc2Var4.invalidate();
                                break;
                            default:
                                yc2Var5.L1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                rc2Var4.invalidate();
                                break;
                        }
                    }
                });
                Animator[] animatorArr2 = new Animator[1];
                animatorArr2[b] = ofFloat6;
                animatorSet.playTogether(animatorArr2);
            } else {
                yc2Var3 = yc2Var2;
            }
            if (vb2Var.m) {
                float[] fArr4 = new float[i];
                // fill-array-data instruction
                fArr4[0] = 0.0f;
                fArr4[1] = 1.0f;
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(fArr4);
                yc2Var3.h = true;
                ofFloat7.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nb2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        byte b4 = b3;
                        rc2 rc2Var4 = rc2Var2;
                        yc2 yc2Var5 = yc2Var3;
                        switch (b4) {
                            case 0:
                                yc2Var5.A0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                rc2Var4.invalidate();
                                break;
                            default:
                                yc2Var5.L1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                rc2Var4.invalidate();
                                break;
                        }
                    }
                });
                animatorSet.playTogether(ofFloat7);
            }
        } else {
            u69Var2 = u69Var;
            if (view instanceof cm1) {
                cm1 cm1Var = (cm1) view;
                bm1 transitionParams2 = cm1Var.getTransitionParams();
                if (vb2Var2.m) {
                    ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    transitionParams2.b = true;
                    ofFloat8.addUpdateListener(new pl(transitionParams2, cm1Var, (byte) 9));
                    animatorSet.playTogether(ofFloat8);
                }
            }
        }
        if (z) {
        }
        animatorSet.setDuration((long) (250.0f * (z ? 1.9f : 1.0f)));
        animatorSet.addListener(new dr1(this, u69Var2, i4, view));
        animatorSet.start();
        this.J.put(u69Var2, animatorSet);
    }

    public final void T() {
        jlb jlbVar;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (this.K.isEmpty() || (jlbVar = (jlb) this.U.run()) == null) {
            return;
        }
        ArrayList arrayList2 = jlbVar.c;
        if (jlbVar.e) {
            return;
        }
        jlbVar.e = true;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ilb ilbVar = (ilb) obj2;
            Runnable runnable = ilbVar.d;
            if (runnable != null) {
                jlb.b(runnable);
                ilbVar.d = null;
            }
        }
        arrayList2.clear();
        hlb hlbVar = jlbVar.a;
        if (hlbVar != null) {
            hlbVar.g();
        }
        Runnable runnable2 = jlbVar.d;
        if (runnable2 != null) {
            jlbVar.d = null;
            jlb.b(runnable2);
        }
    }

    public final void U(f47 f47Var) {
        if (f47Var == null) {
            return;
        }
        ArrayList arrayList = f47Var.d;
        e47 e47Var = f47Var.m;
        if (arrayList.size() == 0) {
            e47Var.i = true;
            return;
        }
        if (e47Var.b == 0 && e47Var.d == 0 && e47Var.a == 0 && e47Var.c == 0) {
            r59 r59Var = this.G;
            int childCount = r59Var.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = r59Var.getChildAt(i);
                if (childAt instanceof rc2) {
                    rc2 rc2Var = (rc2) childAt;
                    k47 messageObject = rc2Var.getMessageObject();
                    if (rc2Var.getTransitionParams().w0 && arrayList.contains(messageObject)) {
                        e47Var.b = rc2Var.getBackgroundDrawableTop() + rc2Var.getPaddingTop() + rc2Var.getTop();
                        e47Var.d = rc2Var.getBackgroundDrawableBottom() + rc2Var.getPaddingTop() + rc2Var.getTop();
                        e47Var.a = rc2Var.getBackgroundDrawableLeft() + rc2Var.getLeft();
                        e47Var.c = rc2Var.getBackgroundDrawableRight() + rc2Var.getLeft();
                        e47Var.o = rc2Var.f2();
                        e47Var.k = rc2Var.L2();
                        e47Var.l = rc2Var.K2();
                        e47Var.p = true;
                        break;
                    }
                }
                i++;
            }
        }
        this.I.add(f47Var);
    }

    public abstract void V();

    public final void W(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z = view instanceof er0;
        r59 r59Var = this.G;
        if (z) {
            int measuredHeight = (r59Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((er0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof h9c) {
            int measuredHeight2 = (r59Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((h9c) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof rc2) {
            rc2 rc2Var = (rc2) view;
            rc2Var.getTransitionParams().e();
            rc2Var.setAnimationOffsetX(0.0f);
        } else {
            if (!(view instanceof cm1)) {
                view.setTranslationX(0.0f);
                return;
            }
            bm1 transitionParams = ((cm1) view).getTransitionParams();
            transitionParams.b = false;
            transitionParams.c = 1.0f;
        }
    }

    public final void X(tp1 tp1Var, um1 um1Var) {
        this.T = tp1Var;
        this.U = um1Var;
    }

    public final boolean Y(View view) {
        u69 T;
        if (this.N || (T = this.G.T(view)) == null) {
            return false;
        }
        return this.q.contains(T) || this.y.contains(T);
    }

    public final boolean Z(View view) {
        u69 T = this.G.T(view);
        if (T != null) {
            return this.p.contains(T) || this.A.contains(T);
        }
        return false;
    }

    @Override // jka, d69
    public final boolean a(u69 u69Var, az8 az8Var, az8 az8Var2) {
        ArrayList arrayList;
        int i;
        boolean a = super.a(u69Var, az8Var, az8Var2);
        if (a && this.N) {
            int i2 = 0;
            boolean z = false;
            while (true) {
                arrayList = this.q;
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (((u69) arrayList.get(i2)).c() == 0) {
                    z = true;
                }
                i2++;
            }
            if (z) {
                i = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    i += ((u69) arrayList.get(i3)).a.getHeight();
                }
            } else {
                i = 0;
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((u69) arrayList.get(i4)).a.setTranslationY(i);
            }
        }
        return a;
    }

    @Override // sc3, d69
    public final void f(u69 u69Var) {
        jlb jlbVar;
        Animator animator = (Animator) this.J.remove(u69Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = u69Var.a;
        if (this.K.contains(view) && (jlbVar = (jlb) this.U.run()) != null) {
            jlbVar.a(view);
        }
        super.f(u69Var);
        W(view);
    }

    @Override // sc3, d69
    public void g() {
        if (e21.a) {
            fc4.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((f47) obj).m.p = false;
        }
        arrayList.clear();
        T();
        ua2 ua2Var = this.P;
        if (ua2Var != null) {
            ua2Var.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            rc3 rc3Var = (rc3) arrayList2.get(size2);
            W(rc3Var.a.a);
            v(rc3Var.a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            u69 u69Var = (u69) arrayList3.get(size3);
            W(u69Var.a);
            d(u69Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            u69 u69Var2 = (u69) arrayList4.get(size4);
            W(u69Var2.a);
            u(u69Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((qc3) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (k()) {
            ArrayList arrayList6 = this.u;
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
                for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                    rc3 rc3Var2 = (rc3) arrayList7.get(size7);
                    W(rc3Var2.a.a);
                    v(rc3Var2.a);
                    arrayList7.remove(size7);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(arrayList7);
                    }
                }
            }
            ArrayList arrayList8 = this.t;
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
                for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                    u69 u69Var3 = (u69) arrayList9.get(size9);
                    W(u69Var3.a);
                    u(u69Var3);
                    arrayList9.remove(size9);
                    if (arrayList9.isEmpty()) {
                        arrayList8.remove(arrayList9);
                    }
                }
            }
            ArrayList arrayList10 = this.v;
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                ArrayList arrayList11 = (ArrayList) arrayList10.get(size10);
                for (int size11 = arrayList11.size() - 1; size11 >= 0; size11--) {
                    I((qc3) arrayList11.get(size11));
                    if (arrayList11.isEmpty()) {
                        arrayList10.remove(arrayList11);
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

    @Override // d69
    public final long i() {
        return 250L;
    }

    @Override // d69
    public final long j() {
        return 250L;
    }

    @Override // d69
    public final az8 l(r69 r69Var, u69 u69Var, int i, List list) {
        az8 l = super.l(r69Var, u69Var, i, list);
        View view = u69Var.a;
        if (!(view instanceof rc2)) {
            return l;
        }
        ub2 ub2Var = new ub2((byte) 4);
        ub2Var.b = l.b;
        ub2Var.c = l.c;
        yc2 transitionParams = ((rc2) view).getTransitionParams();
        ub2Var.e = transitionParams.b;
        ub2Var.f = transitionParams.c;
        ub2Var.g = transitionParams.d;
        ub2Var.h = transitionParams.e;
        return ub2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x047c A[EDGE_INSN: B:223:0x047c->B:224:0x047c BREAK  A[LOOP:9: B:192:0x03be->B:216:0x046f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fc  */
    @Override // sc3, d69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        int size;
        int i;
        HashMap hashMap;
        int i2;
        boolean z6;
        ArrayList arrayList2;
        int i3;
        int i4;
        boolean z7;
        ArrayList arrayList3;
        ArrayList arrayList4;
        um1 um1Var;
        int i5;
        f47 currentMessagesGroup;
        boolean z8;
        boolean z9;
        ArrayList arrayList5;
        boolean z10;
        k47 messageObject;
        tp1 tp1Var;
        int i6;
        int i7;
        boolean z11;
        yv1 yv1Var;
        Runnable runnable;
        j67 j67Var;
        int i8;
        wb2 wb2Var = this;
        ArrayList arrayList6 = wb2Var.p;
        boolean isEmpty = arrayList6.isEmpty();
        ArrayList arrayList7 = wb2Var.r;
        boolean isEmpty2 = arrayList7.isEmpty();
        ArrayList arrayList8 = wb2Var.s;
        boolean isEmpty3 = arrayList8.isEmpty();
        ArrayList arrayList9 = wb2Var.q;
        boolean isEmpty4 = arrayList9.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        boolean z12 = wb2Var.N;
        r59 r59Var = wb2Var.G;
        byte b = 1;
        if (z12) {
            z = false;
            for (0; i8 < arrayList9.size(); i8 + 1) {
                if (wb2Var.Q) {
                    i8 = ((u69) arrayList9.get(i8)).c() != (r59Var.getAdapter() == null ? 0 : r59Var.getAdapter().b()) - 1 ? i8 + 1 : 0;
                    z = true;
                } else {
                    if (((u69) arrayList9.get(i8)).c() != 0) {
                    }
                    z = true;
                }
            }
        } else {
            z = false;
        }
        wb2Var.V();
        ArrayList arrayList10 = wb2Var.y;
        float f = 1.0f;
        if (z) {
            boolean isEmpty5 = arrayList6.isEmpty();
            boolean isEmpty6 = arrayList7.isEmpty();
            boolean isEmpty7 = arrayList8.isEmpty();
            boolean isEmpty8 = arrayList9.isEmpty();
            if (!isEmpty5 || !isEmpty6 || !isEmpty8 || !isEmpty7) {
                int i9 = 0;
                for (0; i6 < arrayList9.size(); i6 + 1) {
                    View view = ((u69) arrayList9.get(i6)).a;
                    if (view instanceof rc2) {
                        rc2 rc2Var = (rc2) view;
                        i6 = (rc2Var.getCurrentPosition() != null && (rc2Var.getCurrentPosition().l & 1) == 0) ? i6 + 1 : 0;
                    }
                    i9 += ((u69) arrayList9.get(i6)).a.getHeight();
                }
                int size2 = arrayList6.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList6.get(i10);
                    i10++;
                    wb2Var.D((u69) obj);
                }
                arrayList6.clear();
                if (!isEmpty6) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.addAll(arrayList7);
                    arrayList7.clear();
                    int size3 = arrayList11.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj2 = arrayList11.get(i11);
                        i11++;
                        rc3 rc3Var = (rc3) obj2;
                        wb2Var.S(rc3Var.a, rc3Var, false);
                    }
                    arrayList11.clear();
                }
                if (!isEmpty8) {
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.addAll(arrayList9);
                    arrayList9.clear();
                    int i12 = 0;
                    for (int size4 = arrayList12.size(); i12 < size4; size4 = i7) {
                        int i13 = i12 + 1;
                        u69 u69Var = (u69) arrayList12.get(i12);
                        View view2 = u69Var.a;
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList10.add(u69Var);
                        view2.setTranslationY(i9);
                        View view3 = u69Var.a;
                        view3.setScaleX(f);
                        view3.setScaleY(f);
                        rc2 rc2Var2 = view3 instanceof rc2 ? (rc2) view3 : null;
                        if (rc2Var2 == null || !rc2Var2.getTransitionParams().y0) {
                            view3.setAlpha(f);
                        }
                        yv1 yv1Var2 = wb2Var.F;
                        if (yv1Var2 != null) {
                            ArrayList arrayList13 = yv1Var2.K4;
                            if (rc2Var2 != null && arrayList13.contains(rc2Var2.getMessageObject())) {
                                arrayList13.remove(rc2Var2.getMessageObject());
                                ms1 ms1Var = yv1Var2.a0;
                                if (ms1Var.g0 == null || !((j67Var = ms1Var.M0) == null || j67Var.u0)) {
                                    i7 = size4;
                                } else {
                                    i7 = size4;
                                    if (System.currentTimeMillis() - ms1Var.N0 > 300) {
                                        z11 = true;
                                        ms1Var.N0 = -1L;
                                        if (z11) {
                                            if (k47.Q4(rc2Var2.getMessageObject().k)) {
                                                if (Math.abs(view2.getTranslationY()) < view2.getMeasuredHeight() * 3.0f) {
                                                    new mlc(rc2Var2, yv1Var2.a0, wb2Var.G, yv1Var2.ja, wb2Var.R).f.start();
                                                }
                                            } else if (gda.o() != 0 && Math.abs(view2.getTranslationY()) < r59Var.getMeasuredHeight()) {
                                                yv1Var = yv1Var2;
                                                ValueAnimator valueAnimator = new pjb(rc2Var2, yv1Var2, wb2Var.G, yv1Var2.ja, wb2Var.R).d;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                                ms1 ms1Var2 = yv1Var.a0;
                                                runnable = ms1Var2.g0;
                                                if (runnable != null) {
                                                    gm.r(runnable);
                                                    ms1Var2.h0 = true;
                                                    ms1Var2.g0.run();
                                                    ms1Var2.g0 = null;
                                                }
                                            }
                                            yv1Var = yv1Var2;
                                            ms1 ms1Var22 = yv1Var.a0;
                                            runnable = ms1Var22.g0;
                                            if (runnable != null) {
                                            }
                                        }
                                        animate.translationY(0.0f).setDuration(250L).setInterpolator(wb2Var.o).setListener(new rb2((Object) wb2Var, (Object) u69Var, view2, (Object) animate, (byte) 0)).start();
                                        i9 = i9;
                                        i12 = i13;
                                        f = 1.0f;
                                    }
                                }
                                z11 = false;
                                ms1Var.N0 = -1L;
                                if (z11) {
                                }
                                animate.translationY(0.0f).setDuration(250L).setInterpolator(wb2Var.o).setListener(new rb2((Object) wb2Var, (Object) u69Var, view2, (Object) animate, (byte) 0)).start();
                                i9 = i9;
                                i12 = i13;
                                f = 1.0f;
                            }
                        }
                        i7 = size4;
                        animate.translationY(0.0f).setDuration(250L).setInterpolator(wb2Var.o).setListener(new rb2((Object) wb2Var, (Object) u69Var, view2, (Object) animate, (byte) 0)).start();
                        i9 = i9;
                        i12 = i13;
                        f = 1.0f;
                    }
                    arrayList12.clear();
                }
            }
        } else {
            boolean isEmpty9 = arrayList6.isEmpty();
            boolean isEmpty10 = arrayList7.isEmpty();
            boolean isEmpty11 = arrayList8.isEmpty();
            boolean isEmpty12 = arrayList9.isEmpty();
            if (!isEmpty9 || !isEmpty10 || !isEmpty12 || !isEmpty11) {
                boolean z13 = (wb2Var.U == null || (tp1Var = wb2Var.T) == null || !((Boolean) tp1Var.run()).booleanValue()) ? false : true;
                ArrayList arrayList14 = wb2Var.K;
                ArrayList arrayList15 = wb2Var.A;
                ArrayList arrayList16 = wb2Var.S;
                if (z13) {
                    LongSparseArray longSparseArray = null;
                    int i14 = 0;
                    while (i14 < arrayList6.size()) {
                        u69 u69Var2 = (u69) arrayList6.get(i14);
                        if (arrayList16.contains(u69Var2)) {
                            z8 = isEmpty10;
                            View view4 = u69Var2.a;
                            z9 = isEmpty11;
                            if ((view4 instanceof rc2) && ((rc2) view4).getCurrentMessagesGroup() != null && (messageObject = ((rc2) u69Var2.a).getMessageObject()) != null && messageObject.c1() != 0) {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                arrayList5 = arrayList10;
                                z10 = z13;
                                ArrayList arrayList17 = (ArrayList) longSparseArray.get(messageObject.c1());
                                if (arrayList17 == null) {
                                    long c1 = messageObject.c1();
                                    ArrayList arrayList18 = new ArrayList();
                                    longSparseArray.put(c1, arrayList18);
                                    arrayList17 = arrayList18;
                                }
                                arrayList16.remove(u69Var2);
                                arrayList6.remove(i14);
                                i14--;
                                arrayList17.add(u69Var2);
                                i14++;
                                z13 = z10;
                                isEmpty10 = z8;
                                isEmpty11 = z9;
                                arrayList10 = arrayList5;
                            }
                        } else {
                            z8 = isEmpty10;
                            z9 = isEmpty11;
                        }
                        arrayList5 = arrayList10;
                        z10 = z13;
                        i14++;
                        z13 = z10;
                        isEmpty10 = z8;
                        isEmpty11 = z9;
                        arrayList10 = arrayList5;
                    }
                    z2 = isEmpty10;
                    z3 = isEmpty11;
                    arrayList = arrayList10;
                    z4 = z13;
                    if (longSparseArray != null) {
                        int i15 = 0;
                        z5 = false;
                        while (i15 < longSparseArray.size()) {
                            ArrayList arrayList19 = (ArrayList) longSparseArray.valueAt(i15);
                            if (arrayList19.size() > 0) {
                                View view5 = ((u69) arrayList19.get(0)).a;
                                if (!(view5 instanceof rc2) || (currentMessagesGroup = ((rc2) view5).getCurrentMessagesGroup()) == null || currentMessagesGroup.d.size() <= arrayList19.size()) {
                                    if (e21.a) {
                                        fc4.b("animate remove group impl with thanos");
                                    }
                                    arrayList15.addAll(arrayList19);
                                    jlb jlbVar = (jlb) wb2Var.U.run();
                                    for (int i16 = 0; i16 < arrayList19.size(); i16++) {
                                    }
                                    ArrayList arrayList20 = new ArrayList();
                                    i5 = i15;
                                    for (int i17 = 0; i17 < arrayList19.size(); i17++) {
                                        arrayList20.add(((u69) arrayList19.get(i17)).a);
                                    }
                                    co1 co1Var = new co1((Object) wb2Var, (Object) arrayList20, (Object) arrayList19, (byte) 18);
                                    hlb hlbVar = jlbVar.a;
                                    if (hlbVar != null) {
                                        hlbVar.d(arrayList20, co1Var);
                                        Choreographer.getInstance().postFrameCallback(jlbVar.b);
                                    } else {
                                        jlbVar.c.add(new ilb(arrayList20, co1Var));
                                    }
                                    arrayList14.add((View) arrayList20.get(0));
                                    r59Var.D0();
                                    z5 = true;
                                    i15 = i5 + 1;
                                } else {
                                    arrayList6.addAll(arrayList19);
                                }
                            }
                            i5 = i15;
                            i15 = i5 + 1;
                        }
                        size = arrayList6.size();
                        boolean z14 = z5;
                        i = 0;
                        while (true) {
                            hashMap = wb2Var.J;
                            if (i < size) {
                                break;
                            }
                            Object obj3 = arrayList6.get(i);
                            int i18 = i + 1;
                            u69 u69Var3 = (u69) obj3;
                            boolean z15 = arrayList16.remove(u69Var3) && z4;
                            if (e21.a) {
                                arrayList2 = arrayList6;
                                i3 = size;
                                fc4.b("animate remove impl ".concat(z15 ? " with thanos" : ""));
                            } else {
                                arrayList2 = arrayList6;
                                i3 = size;
                            }
                            View view6 = u69Var3.a;
                            arrayList15.add(u69Var3);
                            if (!z15 || (um1Var = wb2Var.U) == null) {
                                i4 = i18;
                                z7 = z4;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view6, (Property<View, Float>) View.ALPHA, view6.getAlpha(), 0.0f);
                                arrayList3 = arrayList15;
                                arrayList4 = arrayList16;
                                ofFloat.setDuration(wb2Var.d);
                                ofFloat.addListener(new qb2(wb2Var, view6, u69Var3));
                                hashMap.put(u69Var3, ofFloat);
                                ofFloat.start();
                            } else {
                                jlb jlbVar2 = (jlb) um1Var.run();
                                i4 = i18;
                                co1 co1Var2 = new co1((Object) wb2Var, (Object) view6, (Object) u69Var3, (byte) 19);
                                hlb hlbVar2 = jlbVar2.a;
                                if (hlbVar2 != null) {
                                    hlbVar2.b(1.0f, view6, co1Var2);
                                    Choreographer.getInstance().postFrameCallback(jlbVar2.b);
                                } else {
                                    jlbVar2.c.add(new ilb(view6, co1Var2));
                                }
                                arrayList14.add(view6);
                                z7 = z4;
                                arrayList3 = arrayList15;
                                arrayList4 = arrayList16;
                            }
                            r59Var.D0();
                            if (z15) {
                                z14 = true;
                            }
                            arrayList15 = arrayList3;
                            size = i3;
                            arrayList6 = arrayList2;
                            i = i4;
                            arrayList16 = arrayList4;
                            z4 = z7;
                        }
                        arrayList6.clear();
                        if (!z2) {
                            ArrayList arrayList21 = new ArrayList();
                            arrayList21.addAll(arrayList7);
                            wb2Var.u.add(arrayList21);
                            arrayList7.clear();
                            p6 p6Var = new p6(wb2Var, arrayList21, z14, b);
                            if (!wb2Var.C || isEmpty9) {
                                p6Var.run();
                            } else {
                                View view7 = ((rc3) arrayList21.get(0)).a.a;
                                WeakHashMap weakHashMap = kfc.a;
                                view7.postOnAnimationDelayed(p6Var, 0L);
                            }
                        }
                        if (!z3) {
                            ArrayList arrayList22 = new ArrayList();
                            arrayList22.addAll(arrayList8);
                            wb2Var.v.add(arrayList22);
                            arrayList8.clear();
                            tnd tndVar = new tnd((Object) wb2Var, (Object) arrayList22, false, (byte) 4);
                            if (!wb2Var.C || isEmpty9) {
                                tndVar.run();
                            } else {
                                View view8 = ((qc3) arrayList22.get(0)).a.a;
                                WeakHashMap weakHashMap2 = kfc.a;
                                view8.postOnAnimationDelayed(tndVar, 0L);
                            }
                        }
                        if (!isEmpty12) {
                            ArrayList arrayList23 = new ArrayList();
                            arrayList23.addAll(arrayList9);
                            arrayList9.clear();
                            Collections.sort(arrayList23, new sa((byte) 23));
                            int i19 = 0;
                            for (int size5 = arrayList23.size(); i19 < size5; size5 = i2) {
                                int i20 = i19 + 1;
                                u69 u69Var4 = (u69) arrayList23.get(i19);
                                if (e21.a) {
                                    fc4.b("animate add impl");
                                }
                                View view9 = u69Var4.a;
                                ArrayList arrayList24 = arrayList;
                                arrayList24.add(u69Var4);
                                if (u69Var4 == wb2Var.O) {
                                    view9.setAlpha(1.0f);
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                if (view9 instanceof rc2) {
                                    rc2 rc2Var3 = (rc2) view9;
                                    if (rc2Var3.getAnimationOffsetX() != 0.0f) {
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(rc2Var3, rc2Var3.xd, rc2Var3.getAnimationOffsetX(), 0.0f));
                                    }
                                    rc2Var3.setPivotX(((rc2Var3.getBackgroundDrawableRight() - rc2Var3.getBackgroundDrawableLeft()) / 2.0f) + rc2Var3.getBackgroundDrawableLeft());
                                    view9.animate().translationY(0.0f).setDuration(wb2Var.c).start();
                                } else {
                                    view9.animate().translationX(0.0f).translationY(0.0f).setDuration(wb2Var.c).start();
                                }
                                long max = (long) ((1.0f - Math.max(0.0f, Math.min(1.0f, view9.getBottom() / r59Var.getMeasuredHeight()))) * 100.0f);
                                if (!(view9 instanceof rc2)) {
                                    i2 = size5;
                                } else if (u69Var4 == wb2Var.O) {
                                    ua2 ua2Var = wb2Var.P;
                                    if (ua2Var != null) {
                                        ua2Var.h.setAlpha(0.0f);
                                    }
                                    r59Var.setClipChildren(false);
                                    final rc2 rc2Var4 = (rc2) view9;
                                    View view10 = (View) wb2Var.P.getParent();
                                    float x = view10.getX() + wb2Var.P.getX() + wb2Var.P.h.getX();
                                    float y = view10.getY() + wb2Var.P.getY() + wb2Var.P.h.getY();
                                    float x2 = rc2Var4.getX() + r59Var.getX() + rc2Var4.getPhotoImage().L0;
                                    float y2 = rc2Var4.getY() + r59Var.getY() + rc2Var4.getPhotoImage().M0;
                                    final float width = wb2Var.P.h.getWidth();
                                    final float height = wb2Var.P.h.getHeight();
                                    final float f2 = rc2Var4.getPhotoImage().N0;
                                    final float f3 = rc2Var4.getPhotoImage().O0;
                                    final float f4 = x - x2;
                                    final float f5 = y - y2;
                                    final float f6 = rc2Var4.getPhotoImage().L0;
                                    final float f7 = rc2Var4.getPhotoImage().M0;
                                    rc2Var4.getTransitionParams().g0 = true;
                                    rc2Var4.getTransitionParams().K1 = true;
                                    rc2Var4.getPhotoImage().i0(f6 + f4, f6 + f5, width, height);
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ob2
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            rc2 rc2Var5 = rc2.this;
                                            rc2Var5.getTransitionParams().L1 = floatValue;
                                            if (rc2Var5.getTransitionParams().L1 > 1.0f) {
                                                rc2Var5.getTransitionParams().L1 = 1.0f;
                                            }
                                            float f8 = 1.0f - floatValue;
                                            rc2Var5.getPhotoImage().i0((f4 * f8) + f6, (f5 * f8) + f7, (f2 * floatValue) + (width * f8), (f3 * floatValue) + (height * f8));
                                            rc2Var5.invalidate();
                                        }
                                    });
                                    i2 = size5;
                                    wb2Var = this;
                                    ofFloat2.addListener(new pb2(wb2Var, rc2Var4, f6, f7, f2, f3));
                                    animatorSet.play(ofFloat2);
                                    max = max;
                                    z6 = false;
                                    view9.setAlpha(0.0f);
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), 1.0f));
                                    if (z6) {
                                        view9.setScaleX(1.0f);
                                        view9.setScaleY(1.0f);
                                    } else {
                                        view9.setScaleX(0.9f);
                                        view9.setScaleY(0.9f);
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_Y, view9.getScaleY(), 1.0f));
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_X, view9.getScaleX(), 1.0f));
                                    }
                                    if (u69Var4 != wb2Var.O) {
                                        animatorSet.setDuration(350L);
                                        animatorSet.setInterpolator(new OvershootInterpolator());
                                    } else {
                                        animatorSet.setStartDelay(max);
                                        animatorSet.setDuration(250L);
                                    }
                                    animatorSet.addListener(new qb2(wb2Var, u69Var4, view9));
                                    hashMap.put(u69Var4, animatorSet);
                                    animatorSet.start();
                                    i19 = i20;
                                    arrayList = arrayList24;
                                } else {
                                    i2 = size5;
                                    f47 currentMessagesGroup2 = ((rc2) view9).getCurrentMessagesGroup();
                                    if (currentMessagesGroup2 != null) {
                                        Long valueOf = Long.valueOf(currentMessagesGroup2.a);
                                        HashMap hashMap2 = wb2Var.M;
                                        Long l = (Long) hashMap2.get(valueOf);
                                        if (l == null) {
                                            hashMap2.put(Long.valueOf(currentMessagesGroup2.a), Long.valueOf(max));
                                        } else {
                                            max = l.longValue();
                                            if (currentMessagesGroup2 != null && currentMessagesGroup2.m.j) {
                                                animatorSet.setStartDelay(140L);
                                            }
                                        }
                                    }
                                    max = max;
                                    if (currentMessagesGroup2 != null) {
                                        animatorSet.setStartDelay(140L);
                                    }
                                }
                                z6 = true;
                                view9.setAlpha(0.0f);
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), 1.0f));
                                if (z6) {
                                }
                                if (u69Var4 != wb2Var.O) {
                                }
                                animatorSet.addListener(new qb2(wb2Var, u69Var4, view9));
                                hashMap.put(u69Var4, animatorSet);
                                animatorSet.start();
                                i19 = i20;
                                arrayList = arrayList24;
                            }
                            arrayList23.clear();
                        }
                    }
                } else {
                    z2 = isEmpty10;
                    z3 = isEmpty11;
                    arrayList = arrayList10;
                    z4 = z13;
                }
                z5 = false;
                size = arrayList6.size();
                boolean z142 = z5;
                i = 0;
                while (true) {
                    hashMap = wb2Var.J;
                    if (i < size) {
                    }
                    arrayList15 = arrayList3;
                    size = i3;
                    arrayList6 = arrayList2;
                    i = i4;
                    arrayList16 = arrayList4;
                    z4 = z7;
                }
                arrayList6.clear();
                if (!z2) {
                }
                if (!z3) {
                }
                if (!isEmpty12) {
                }
            }
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new et1(wb2Var, (byte) 6));
        ofFloat3.setDuration(wb2Var.d + 250);
        ofFloat3.start();
    }

    @Override // sc3, jka
    public final void p(u69 u69Var) {
        R(u69Var);
        View view = u69Var.a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof rc2) {
            ((rc2) view).getTransitionParams().i = true;
        }
        this.q.add(u69Var);
    }

    @Override // sc3, jka
    public final boolean q(u69 u69Var, u69 u69Var2, az8 az8Var, int i, int i2, int i3, int i4) {
        if (u69Var == u69Var2) {
            return r(u69Var, az8Var, i, i2, i3, i4);
        }
        View view = u69Var.a;
        float animationOffsetX = view instanceof rc2 ? ((rc2) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(u69Var);
        int i5 = (int) ((i3 - i) - animationOffsetX);
        int i6 = (int) ((i4 - i2) - translationY);
        if (view instanceof rc2) {
            ((rc2) view).setAnimationOffsetX(animationOffsetX);
        } else {
            view.setTranslationX(animationOffsetX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = u69Var2.a;
        R(u69Var2);
        if (view2 instanceof rc2) {
            ((rc2) view2).setAnimationOffsetX(-i5);
        } else {
            view2.setTranslationX(-i5);
        }
        view2.setTranslationY(-i6);
        view2.setAlpha(0.0f);
        this.s.add(new qc3(u69Var, u69Var2, i, i2, i3, i4));
        F();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e0, code lost:
    
        if (r6.top != r9.getBackgroundDrawableTop()) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e8, code lost:
    
        if (r6.bottom == r9.getBackgroundDrawableBottom()) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0216  */
    @Override // sc3, jka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(u69 u69Var, az8 az8Var, int i, int i2, int i3, int i4) {
        int translationX;
        int i5;
        rc2 rc2Var;
        cm1 cm1Var;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        View view;
        int i6;
        float f6;
        boolean z;
        f47 f47Var;
        int i7;
        boolean O3;
        View view2 = u69Var.a;
        if (view2 instanceof rc2) {
            rc2 rc2Var2 = (rc2) view2;
            translationX = i + ((int) rc2Var2.getAnimationOffsetX());
            i5 = rc2Var2.getTransitionParams().t2 != rc2Var2.getTopMediaOffset() ? (rc2Var2.getTransitionParams().t2 - rc2Var2.getTopMediaOffset()) + i2 : i2;
            rc2Var = rc2Var2;
            cm1Var = null;
        } else if (view2 instanceof cm1) {
            translationX = i + ((int) view2.getTranslationX());
            i5 = i2;
            cm1Var = (cm1) view2;
            rc2Var = null;
        } else {
            translationX = i + ((int) view2.getTranslationX());
            i5 = i2;
            rc2Var = null;
            cm1Var = null;
        }
        int i8 = translationX;
        int translationY = i5 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (rc2Var != null) {
            float f7 = rc2Var.getPhotoImage().L0;
            float f8 = rc2Var.getPhotoImage().M0;
            float f9 = rc2Var.getPhotoImage().N0;
            float f10 = rc2Var.getPhotoImage().O0;
            f = 0.0f;
            int i9 = 0;
            for (int i10 = 4; i9 < i10; i10 = 4) {
                iArr[i9] = rc2Var.getPhotoImage().X0[i9];
                i9++;
            }
            f3 = f7;
            f4 = f8;
            f2 = f10;
            f5 = f9;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
            f5 = 0.0f;
        }
        R(u69Var);
        int i11 = i3 - i8;
        int i12 = i4 - translationY;
        if (i12 != 0) {
            view2.setTranslationY(-i12);
        }
        float f11 = f2;
        cm1 cm1Var2 = cm1Var;
        vb2 vb2Var = new vb2(u69Var, i8, translationY, i3, i4);
        if (rc2Var != null) {
            yc2 transitionParams = rc2Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.u0;
            Rect rect = transitionParams.E0;
            f47 currentMessagesGroup = rc2Var.getCurrentMessagesGroup();
            if (i11 != 0) {
                rc2Var.setAnimationOffsetX(-i11);
            }
            boolean z2 = az8Var instanceof ub2;
            r59 r59Var = this.G;
            if (z2) {
                ImageReceiver photoImage = rc2Var.getPhotoImage();
                view = view2;
                ub2 ub2Var = (ub2) az8Var;
                i6 = i11;
                boolean z3 = (!transitionParams.w0 || ub2Var.h == f || ub2Var.g == f) ? false : true;
                vb2Var.n = z3;
                if (z3) {
                    r59Var.setClipChildren(false);
                    r59Var.invalidate();
                    transitionParams.g0 = true;
                    if (rc2Var.getMessageObject().g4()) {
                        transitionParams.n0 = f3;
                        transitionParams.o0 = f4;
                        transitionParams.p0 = f5;
                        transitionParams.q0 = f11;
                        transitionParams.B0 = iArr;
                    } else {
                        transitionParams.n0 = photoImage.L0;
                        transitionParams.o0 = photoImage.M0;
                        transitionParams.p0 = photoImage.N0;
                        transitionParams.q0 = photoImage.O0;
                        transitionParams.B0 = photoImage.X0;
                    }
                    transitionParams.C0 = false;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= 4) {
                            break;
                        }
                        if (iArr2[i13] != transitionParams.B0[i13]) {
                            transitionParams.C0 = true;
                            break;
                        }
                        i13++;
                    }
                    float f12 = transitionParams.n0;
                    float f13 = ub2Var.e;
                    if (f12 == f13 && transitionParams.o0 == ub2Var.f && transitionParams.q0 == ub2Var.h && transitionParams.p0 == ub2Var.g && !transitionParams.C0) {
                        transitionParams.g0 = false;
                        vb2Var.n = false;
                    } else {
                        vb2Var.o = f13;
                        vb2Var.p = ub2Var.f;
                        vb2Var.q = ub2Var.g;
                        vb2Var.r = ub2Var.h;
                        if (currentMessagesGroup != null) {
                            boolean z4 = currentMessagesGroup.c;
                            e47 e47Var = currentMessagesGroup.m;
                            boolean z5 = e47Var.o;
                            if (z4 != z5) {
                                e47Var.n = z5 ? 1.0f : f;
                            }
                        }
                        if (transitionParams.C0) {
                            if (transitionParams.B0 == photoImage.X0) {
                                transitionParams.B0 = new int[4];
                                for (int i14 = 0; i14 < 4; i14++) {
                                    transitionParams.B0[i14] = photoImage.X0[i14];
                                }
                            }
                            photoImage.s0(iArr2);
                        }
                        rc2Var.x3(vb2Var.o, vb2Var.p, vb2Var.q, vb2Var.r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.w0) {
                    if ((O3 = rc2Var.getMessageObject().O3())) {
                        vb2Var.v = rc2Var.getBackgroundDrawableBottom() - rect.bottom;
                        vb2Var.u = rc2Var.getBackgroundDrawableTop() - rect.top;
                        if (rc2Var.Y6 == transitionParams.F0) {
                            vb2Var.s = rc2Var.getBackgroundDrawableLeft() - rect.left;
                            vb2Var.t = rc2Var.getBackgroundDrawableRight() - rect.right;
                        } else if (O3) {
                            vb2Var.s = rc2Var.getBackgroundDrawableLeft() - rect.left;
                        } else {
                            vb2Var.t = rc2Var.getBackgroundDrawableRight() - rect.right;
                        }
                        vb2Var.l = true;
                        transitionParams.x0 = true;
                        transitionParams.h0 = -vb2Var.s;
                        transitionParams.i0 = -vb2Var.t;
                        transitionParams.k0 = -vb2Var.u;
                        transitionParams.j0 = -vb2Var.v;
                        r59Var.setClipChildren(false);
                        r59Var.invalidate();
                    } else {
                        vb2Var.v = rc2Var.getBackgroundDrawableBottom() - rect.bottom;
                        vb2Var.u = rc2Var.getBackgroundDrawableTop() - rect.top;
                        if (rc2Var.Y6 == transitionParams.F0) {
                        }
                        vb2Var.l = true;
                        transitionParams.x0 = true;
                        transitionParams.h0 = -vb2Var.s;
                        transitionParams.i0 = -vb2Var.t;
                        transitionParams.k0 = -vb2Var.u;
                        transitionParams.j0 = -vb2Var.v;
                        r59Var.setClipChildren(false);
                        r59Var.invalidate();
                    }
                }
            } else {
                view = view2;
                i6 = i11;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    r59 r59Var2 = (r59) view.getParent();
                    e47 e47Var2 = currentMessagesGroup.m;
                    boolean z6 = true;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    while (i15 < r59Var2.getChildCount()) {
                        View childAt = r59Var2.getChildAt(i15);
                        if (childAt instanceof rc2) {
                            rc2 rc2Var3 = (rc2) childAt;
                            if (rc2Var3.getCurrentMessagesGroup() == currentMessagesGroup && !rc2Var3.getMessageObject().Z) {
                                int backgroundDrawableLeft = rc2Var3.getBackgroundDrawableLeft() + rc2Var3.getLeft();
                                f47Var = currentMessagesGroup;
                                int backgroundDrawableRight = rc2Var3.getBackgroundDrawableRight() + rc2Var3.getLeft();
                                i7 = i15;
                                int backgroundDrawableTop = rc2Var3.getBackgroundDrawableTop() + rc2Var3.getPaddingTop() + rc2Var3.getTop();
                                int backgroundDrawableBottom = rc2Var3.getBackgroundDrawableBottom() + rc2Var3.getPaddingTop() + rc2Var3.getTop();
                                if (i18 == 0 || backgroundDrawableLeft < i18) {
                                    i18 = backgroundDrawableLeft;
                                }
                                if (i19 == 0 || backgroundDrawableRight > i19) {
                                    i19 = backgroundDrawableRight;
                                }
                                if (rc2Var3.getTransitionParams().w0 || e47Var2.p) {
                                    if (i16 == 0 || backgroundDrawableTop < i16) {
                                        i16 = backgroundDrawableTop;
                                    }
                                    if (i17 == 0 || backgroundDrawableBottom > i17) {
                                        i17 = backgroundDrawableBottom;
                                    }
                                    z6 = false;
                                }
                                i15 = i7 + 1;
                                currentMessagesGroup = f47Var;
                            }
                        }
                        f47Var = currentMessagesGroup;
                        i7 = i15;
                        i15 = i7 + 1;
                        currentMessagesGroup = f47Var;
                    }
                    e47Var2.p = false;
                    if (i16 == 0 && i17 == 0 && i18 == 0 && i19 == 0) {
                        vb2Var.j = false;
                        e47Var2.j = false;
                    } else {
                        int i20 = (-i16) + e47Var2.b;
                        vb2Var.f = i20;
                        int i21 = (-i17) + e47Var2.d;
                        vb2Var.g = i21;
                        int i22 = (-i18) + e47Var2.a;
                        vb2Var.h = i22;
                        int i23 = (-i19) + e47Var2.c;
                        vb2Var.i = i23;
                        vb2Var.j = true;
                        e47Var2.j = true;
                        e47Var2.f = i20;
                        e47Var2.h = i21;
                        e47Var2.e = i22;
                        e47Var2.g = i23;
                        e47Var2.n = e47Var2.o ? 1.0f : f;
                        r59Var2.setClipChildren(false);
                        r59Var2.invalidate();
                    }
                    e47Var2.i = z6;
                }
            }
            Integer valueOf = Integer.valueOf(rc2Var.getMessageObject().e1());
            HashMap hashMap = this.H;
            f47 f47Var2 = (f47) hashMap.get(valueOf);
            if (f47Var2 != null) {
                e47 e47Var3 = f47Var2.m;
                hashMap.remove(Integer.valueOf(rc2Var.getMessageObject().e1()));
                if (transitionParams.w0) {
                    int backgroundDrawableLeft2 = rc2Var.getBackgroundDrawableLeft() + rc2Var.getLeft();
                    int backgroundDrawableRight2 = rc2Var.getBackgroundDrawableRight() + rc2Var.getLeft();
                    int backgroundDrawableTop2 = rc2Var.getBackgroundDrawableTop() + rc2Var.getPaddingTop() + rc2Var.getTop();
                    int backgroundDrawableBottom2 = rc2Var.getBackgroundDrawableBottom() + rc2Var.getPaddingTop() + rc2Var.getTop();
                    vb2Var.w = true;
                    transitionParams.x0 = true;
                    vb2Var.s = backgroundDrawableLeft2 - e47Var3.a;
                    vb2Var.t = backgroundDrawableRight2 - e47Var3.c;
                    vb2Var.u = backgroundDrawableTop2 - e47Var3.b;
                    vb2Var.v = backgroundDrawableBottom2 - e47Var3.d;
                    vb2Var.l = false;
                    transitionParams.h0 = (int) ((-r6) - rc2Var.getAnimationOffsetX());
                    transitionParams.i0 = (int) ((-vb2Var.t) - rc2Var.getAnimationOffsetX());
                    transitionParams.k0 = (int) ((-vb2Var.u) - rc2Var.getTranslationY());
                    transitionParams.j0 = (int) ((-vb2Var.v) - rc2Var.getTranslationY());
                    transitionParams.D0 = true;
                    r59Var.setClipChildren(false);
                    r59Var.invalidate();
                } else {
                    e47Var3.i = true;
                }
            }
            c47 c47Var = rc2Var.M;
            if (transitionParams.z0 != (rc2Var.C6 || rc2Var.K || (c47Var != null && (c47Var.l & 8) == 0 && rc2Var.L.i))) {
                z = true;
                vb2Var.k = true;
                f6 = f;
                transitionParams.A0 = f6;
            } else {
                f6 = f;
                z = true;
            }
            boolean a = transitionParams.a();
            vb2Var.m = a;
            if (a) {
                transitionParams.h = z;
                transitionParams.L1 = f6;
            }
            if (i6 == 0 && i12 == 0 && !vb2Var.n && !vb2Var.w && !vb2Var.j && !vb2Var.k && !vb2Var.l && !a) {
                v(u69Var);
                return false;
            }
        } else if (cm1Var2 != null) {
            bm1 transitionParams2 = cm1Var2.getTransitionParams();
            transitionParams2.getClass();
            if (i11 != 0) {
                view2.setTranslationX(-i11);
            }
            boolean a2 = !transitionParams2.a ? false : transitionParams2.d.F0.a();
            vb2Var.m = a2;
            if (a2) {
                transitionParams2.b = true;
                transitionParams2.c = 0.0f;
            }
            if (i11 == 0 && i12 == 0 && !a2) {
                v(u69Var);
                return false;
            }
        } else if (view2 instanceof er0) {
            ((er0) view2).setAnimating(true);
        } else if (view2 instanceof h9c) {
            ((h9c) view2).setAnimating(true);
        } else if (i11 != 0) {
            view2.setTranslationX(-i11);
        } else if (i12 == 0) {
            v(u69Var);
            return false;
        }
        this.r.add(vb2Var);
        F();
        return true;
    }

    @Override // sc3, jka
    public final void s(u69 u69Var, az8 az8Var) {
        if (e21.a) {
            fc4.b("animate remove");
        }
        super.s(u69Var, az8Var);
        View view = u69Var.a;
        if (az8Var != null) {
            int i = az8Var.c;
            int top = view.getTop();
            int left = view.getLeft() - az8Var.b;
            if (top - i != 0) {
                view.setTranslationY(-r0);
            }
            if (!(view instanceof rc2)) {
                if (left != 0) {
                    view.setTranslationX(-left);
                    return;
                }
                return;
            }
            rc2 rc2Var = (rc2) view;
            if (left != 0) {
                rc2Var.setAnimationOffsetX(-left);
            }
            if (az8Var instanceof ub2) {
                ub2 ub2Var = (ub2) az8Var;
                rc2Var.x3(ub2Var.e, ub2Var.f, ub2Var.g, ub2Var.h);
            }
        }
    }
}
