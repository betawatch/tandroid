package pi;

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
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import ch.v;
import com.google.android.gms.internal.vision.e2;
import e2.r0;
import fi.b3;
import hi.j3;
import hi.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import jg.j0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.aj;
import org.telegram.messenger.bj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.r2;
import org.telegram.messenger.yi;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.g71;
import org.telegram.ui.hc1;
import org.telegram.ui.i51;
import org.telegram.ui.ne;
import org.telegram.ui.qj;
import org.telegram.ui.qv0;
import r0.i0;
import v4.b1;
import v4.e1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public abstract class k extends v4.k {
    public static final er V = new er(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final an F;
    public final uj0 G;
    public boolean N;
    public e1 O;
    public xn P;
    public boolean Q;
    public final e6 R;
    public ne T;
    public ne U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public k(an anVar, uj0 uj0Var, e6 e6Var) {
        this.R = e6Var;
        this.F = anVar;
        this.G = uj0Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override // v4.k
    public final void B(v4.i iVar) {
        v4.i iVar2;
        e1 e1Var = iVar.a;
        View view = e1Var == null ? null : e1Var.a;
        e1 e1Var2 = iVar.b;
        View view2 = e1Var2 != null ? e1Var2.a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(iVar.a);
            duration.translationX(iVar.e - iVar.c);
            duration.translationY(iVar.f - iVar.d);
            iVar2 = iVar;
            duration.alpha(0.0f).setListener(new h(this, iVar2, duration, view, 0)).start();
        } else {
            iVar2 = iVar;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(iVar2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new h(this, iVar2, animate, view2, 1)).start();
        }
    }

    @Override // v4.k
    public final void C(e1 e1Var, v4.j jVar) {
        T(e1Var, jVar, false);
    }

    @Override // v4.k
    public final boolean J(v4.i iVar, e1 e1Var) {
        fz0 fz0Var;
        if (r2.a) {
            a8.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(e1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = e1Var.a;
        if (this.K.contains(view) && (fz0Var = (fz0) this.U.run()) != null) {
            fz0Var.a(view);
        }
        if (iVar.b == e1Var) {
            iVar.b = null;
        } else {
            if (iVar.a != e1Var) {
                return false;
            }
            iVar.a = null;
        }
        X(view);
        d(e1Var);
        return true;
    }

    @Override // v4.k
    public final long L() {
        return 0L;
    }

    @Override // v4.k
    public void N() {
        this.G.setClipChildren(true);
        while (true) {
            ArrayList arrayList = this.L;
            if (arrayList.isEmpty()) {
                U();
                return;
            }
            ((Runnable) arrayList.remove(0)).run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(final e1 e1Var, v4.j jVar, boolean z10) {
        e1 e1Var2;
        int i7;
        x1 x1Var;
        q1 q1Var;
        boolean z11;
        float f10;
        boolean z12;
        final j jVar2;
        final q1 q1Var2;
        x1 x1Var2;
        final int i10;
        final x1 x1Var3;
        ValueAnimator valueAnimator;
        final boolean z13;
        int[] iArr;
        int i11 = jVar.c;
        int i12 = jVar.e;
        View view = e1Var.a;
        int i13 = i12 - i11;
        AnimatorSet animatorSet = new AnimatorSet();
        int i14 = 0;
        final int i15 = 1;
        if (i13 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.z.add(e1Var);
        final j jVar3 = (j) jVar;
        an anVar = this.F;
        if (anVar != null && (view instanceof f0)) {
            f0 f0Var = (f0) view;
            float translationY = f0Var.getTranslationY();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new g(this, f0Var, translationY, i14));
            animatorSet.playTogether(ofFloat);
        } else {
            if (anVar == null || !(view instanceof ra)) {
                if (view instanceof q1) {
                    final q1 q1Var3 = (q1) view;
                    final x1 transitionParams = q1Var3.getTransitionParams();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(q1Var3, q1Var3.ld, 0.0f));
                    if (jVar3.n) {
                        q1Var3.v3(jVar3.o, jVar3.p, jVar3.q, jVar3.r);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        final float f11 = q1Var3.getCurrentMessagesGroup() == null ? transitionParams.v0 : q1Var3.getCurrentMessagesGroup().m.n;
                        final float d2 = q1Var3.getCurrentMessagesGroup() == null ? q1Var3.d2() : q1Var3.getCurrentMessagesGroup().c;
                        if (f11 != d2) {
                            valueAnimator = ofFloat2;
                            z13 = true;
                        } else {
                            valueAnimator = ofFloat2;
                            z13 = false;
                        }
                        if (transitionParams.C0) {
                            z11 = false;
                            iArr = new int[4];
                            int i16 = 0;
                            for (int i17 = 4; i16 < i17; i17 = 4) {
                                iArr[i16] = q1Var3.getPhotoImage().X0[i16];
                                i16++;
                            }
                        } else {
                            z11 = false;
                            iArr = null;
                        }
                        final int[] iArr2 = iArr;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        i7 = 2;
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: pi.a
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                j jVar4 = j.this;
                                float f12 = 1.0f - floatValue;
                                float f13 = jVar4.o * f12;
                                x1 x1Var4 = transitionParams;
                                float f14 = (x1Var4.n0 * floatValue) + f13;
                                float f15 = (x1Var4.o0 * floatValue) + (jVar4.p * f12);
                                float f16 = (x1Var4.p0 * floatValue) + (jVar4.q * f12);
                                float f17 = (x1Var4.q0 * floatValue) + (jVar4.r * f12);
                                boolean z14 = z13;
                                q1 q1Var4 = q1Var3;
                                if (z14) {
                                    float f18 = (d2 * floatValue) + (f11 * f12);
                                    x1Var4.v0 = f18;
                                    if (q1Var4.getCurrentMessagesGroup() != null) {
                                        q1Var4.getCurrentMessagesGroup().m.n = f18;
                                    }
                                }
                                if (x1Var4.C0) {
                                    ImageReceiver photoImage = q1Var4.getPhotoImage();
                                    int[] iArr3 = iArr2;
                                    int[] iArr4 = x1Var4.B0;
                                    photoImage.K0((int) ((iArr4[0] * floatValue) + (iArr3[0] * f12)), (int) ((iArr4[1] * floatValue) + (iArr3[1] * f12)), (int) ((iArr4[2] * floatValue) + (iArr3[2] * f12)), (int) ((iArr4[3] * floatValue) + (iArr3[3] * f12)));
                                }
                                q1Var4.v3(f14, f15, f16, f17);
                                e1Var.a.invalidate();
                            }
                        };
                        x1Var = transitionParams;
                        q1Var = q1Var3;
                        e1Var2 = e1Var;
                        valueAnimator2.addUpdateListener(animatorUpdateListener);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[z11 ? 1 : 0] = valueAnimator2;
                        animatorSet.playTogether(animatorArr);
                    } else {
                        i7 = 2;
                        x1Var = transitionParams;
                        q1Var = q1Var3;
                        e1Var2 = e1Var;
                        z11 = false;
                    }
                    if (jVar3.v == 0 && jVar3.t == 0 && jVar3.u == 0 && jVar3.s == 0) {
                        f10 = 0.0f;
                        x1Var.l0 = 0.0f;
                        x1Var.m0 = 0.0f;
                        z12 = z11;
                    } else {
                        f10 = 0.0f;
                        uj0 uj0Var = this.G;
                        uj0Var.setClipChildren(z11);
                        uj0Var.invalidate();
                        float[] fArr = new float[i7];
                        // fill-array-data instruction
                        fArr[0] = 1.0f;
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr);
                        if (jVar3.l) {
                            x1Var.l0 = -jVar3.s;
                            x1Var.m0 = -jVar3.t;
                        } else {
                            x1Var.l0 = (-jVar3.s) - q1Var.getAnimationOffsetX();
                            x1Var.m0 = (-jVar3.t) - q1Var.getAnimationOffsetX();
                        }
                        ofFloat3.addUpdateListener(new b3(jVar3, x1Var, q1Var, 3));
                        z12 = false;
                        animatorSet.playTogether(ofFloat3);
                    }
                    bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        jVar3.j = z12;
                    }
                    if (jVar3.j) {
                        float[] fArr2 = new float[i7];
                        // fill-array-data instruction
                        fArr2[0] = 1.0f;
                        fArr2[1] = 0.0f;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr2);
                        x1 x1Var4 = x1Var;
                        final aj ajVar = currentMessagesGroup.m;
                        final uj0 uj0Var2 = (uj0) view.getParent();
                        final float f12 = currentMessagesGroup.m.n;
                        if (currentMessagesGroup.c) {
                            f10 = 1.0f;
                        }
                        final boolean z14 = f12 != f10;
                        x1Var2 = x1Var4;
                        final float f13 = f10;
                        jVar2 = jVar3;
                        q1Var2 = q1Var;
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pi.b
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                j jVar4 = jVar2;
                                aj ajVar2 = aj.this;
                                ajVar2.f = jVar4.f * floatValue;
                                ajVar2.h = jVar4.g * floatValue;
                                ajVar2.e = jVar4.h * floatValue;
                                ajVar2.g = jVar4.i * floatValue;
                                if (z14) {
                                    ajVar2.n = e2.z(1.0f, floatValue, f13, f12 * floatValue);
                                }
                                uj0 uj0Var3 = uj0Var2;
                                if (uj0Var3 != null) {
                                    uj0Var3.invalidate();
                                }
                            }
                        });
                        ofFloat4.addListener(new g71(ajVar, 15));
                        i10 = 0;
                        animatorSet.playTogether(ofFloat4);
                    } else {
                        jVar2 = jVar3;
                        q1Var2 = q1Var;
                        x1Var2 = x1Var;
                        i10 = 0;
                    }
                    if (jVar2.k) {
                        float[] fArr3 = new float[i7];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(fArr3);
                        x1Var3 = x1Var2;
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pi.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i10) {
                                    case 0:
                                        x1Var3.A0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        q1Var2.invalidate();
                                        break;
                                    default:
                                        x1Var3.L1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        q1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i10] = ofFloat5;
                        animatorSet.playTogether(animatorArr2);
                    } else {
                        x1Var3 = x1Var2;
                    }
                    if (jVar2.m) {
                        float[] fArr4 = new float[i7];
                        // fill-array-data instruction
                        fArr4[0] = 0.0f;
                        fArr4[1] = 1.0f;
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(fArr4);
                        x1Var3.h = true;
                        ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pi.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i15) {
                                    case 0:
                                        x1Var3.A0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        q1Var2.invalidate();
                                        break;
                                    default:
                                        x1Var3.L1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        q1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        animatorSet.playTogether(ofFloat6);
                    }
                } else {
                    e1Var2 = e1Var;
                    if (view instanceof t0) {
                        t0 t0Var = (t0) view;
                        s0 transitionParams2 = t0Var.getTransitionParams();
                        if (jVar3.m) {
                            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            transitionParams2.b = true;
                            ofFloat7.addUpdateListener(new v(25, transitionParams2, t0Var));
                            animatorSet.playTogether(ofFloat7);
                        }
                    }
                }
                if (z10) {
                    Interpolator interpolator = this.o;
                    if (interpolator != null) {
                        animatorSet.setInterpolator(interpolator);
                    }
                } else {
                    animatorSet.setInterpolator(er.g);
                }
                animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
                animatorSet.addListener(new z4(this, e1Var2, i13, view));
                animatorSet.start();
                this.J.put(e1Var2, animatorSet);
            }
            ra raVar = (ra) view;
            float translationY2 = raVar.getTranslationY();
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat8.addUpdateListener(new g(this, raVar, translationY2, i15));
            animatorSet.playTogether(ofFloat8);
        }
        e1Var2 = e1Var;
        if (z10) {
        }
        animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
        animatorSet.addListener(new z4(this, e1Var2, i13, view));
        animatorSet.start();
        this.J.put(e1Var2, animatorSet);
    }

    public final void U() {
        fz0 fz0Var;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (this.K.isEmpty() || (fz0Var = (fz0) this.U.run()) == null) {
            return;
        }
        ArrayList arrayList2 = fz0Var.c;
        if (fz0Var.e) {
            return;
        }
        fz0Var.e = true;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ez0 ez0Var = (ez0) obj2;
            Runnable runnable = ez0Var.d;
            if (runnable != null) {
                fz0.b(runnable);
                ez0Var.d = null;
            }
        }
        arrayList2.clear();
        dz0 dz0Var = fz0Var.a;
        if (dz0Var != null) {
            dz0Var.h();
        }
        Runnable runnable2 = fz0Var.d;
        if (runnable2 != null) {
            fz0Var.d = null;
            fz0.b(runnable2);
        }
    }

    public final void V(bj bjVar) {
        if (bjVar == null) {
            return;
        }
        ArrayList arrayList = bjVar.d;
        aj ajVar = bjVar.m;
        if (arrayList.size() == 0) {
            ajVar.i = true;
            return;
        }
        if (ajVar.b == 0 && ajVar.d == 0 && ajVar.a == 0 && ajVar.c == 0) {
            uj0 uj0Var = this.G;
            int childCount = uj0Var.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = uj0Var.getChildAt(i7);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    gj messageObject = q1Var.getMessageObject();
                    if (q1Var.getTransitionParams().w0 && arrayList.contains(messageObject)) {
                        ajVar.b = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                        ajVar.d = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                        ajVar.a = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                        ajVar.c = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                        ajVar.o = q1Var.d2();
                        ajVar.k = q1Var.J2();
                        ajVar.l = q1Var.I2();
                        ajVar.p = true;
                        break;
                    }
                }
                i7++;
            }
        }
        this.I.add(bjVar);
    }

    public abstract void W();

    public final void X(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z10 = view instanceof f0;
        uj0 uj0Var = this.G;
        if (z10) {
            int measuredHeight = (uj0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((f0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof ra) {
            int measuredHeight2 = (uj0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((ra) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof q1) {
            q1 q1Var = (q1) view;
            q1Var.getTransitionParams().e();
            q1Var.setAnimationOffsetX(0.0f);
        } else {
            if (!(view instanceof t0)) {
                view.setTranslationX(0.0f);
                return;
            }
            s0 transitionParams = ((t0) view).getTransitionParams();
            transitionParams.b = false;
            transitionParams.c = 1.0f;
        }
    }

    public final void Y(ne neVar, ne neVar2) {
        this.T = neVar;
        this.U = neVar2;
    }

    public final boolean Z(View view) {
        e1 T;
        if (this.N || (T = this.G.T(view)) == null) {
            return false;
        }
        return this.q.contains(T) || this.y.contains(T);
    }

    @Override // v4.g1, v4.m0
    public final boolean a(e1 e1Var, r0 r0Var, r0 r0Var2) {
        ArrayList arrayList;
        int i7;
        boolean a10 = super.a(e1Var, r0Var, r0Var2);
        if (a10 && this.N) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.q;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((e1) arrayList.get(i10)).c() == 0) {
                    z10 = true;
                }
                i10++;
            }
            if (z10) {
                i7 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i7 += ((e1) arrayList.get(i11)).a.getHeight();
                }
            } else {
                i7 = 0;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((e1) arrayList.get(i12)).a.setTranslationY(i7);
            }
        }
        return a10;
    }

    public final boolean a0(View view) {
        e1 T = this.G.T(view);
        if (T != null) {
            return this.p.contains(T) || this.A.contains(T);
        }
        return false;
    }

    @Override // v4.k, v4.m0
    public final void f(e1 e1Var) {
        fz0 fz0Var;
        Animator animator = (Animator) this.J.remove(e1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = e1Var.a;
        if (this.K.contains(view) && (fz0Var = (fz0) this.U.run()) != null) {
            fz0Var.a(view);
        }
        super.f(e1Var);
        X(view);
    }

    @Override // v4.k, v4.m0
    public void g() {
        if (r2.a) {
            a8.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((bj) obj).m.p = false;
        }
        arrayList.clear();
        U();
        xn xnVar = this.P;
        if (xnVar != null) {
            xnVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.j jVar = (v4.j) arrayList2.get(size2);
            X(jVar.a.a);
            v(jVar.a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            e1 e1Var = (e1) arrayList3.get(size3);
            X(e1Var.a);
            d(e1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            e1 e1Var2 = (e1) arrayList4.get(size4);
            X(e1Var2.a);
            u(e1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((v4.i) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (k()) {
            ArrayList arrayList6 = this.u;
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
                for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                    v4.j jVar2 = (v4.j) arrayList7.get(size7);
                    X(jVar2.a.a);
                    v(jVar2.a);
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
                    e1 e1Var3 = (e1) arrayList9.get(size9);
                    X(e1Var3.a);
                    u(e1Var3);
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
                    I((v4.i) arrayList11.get(size11));
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

    @Override // v4.m0
    public final long i() {
        return 250L;
    }

    @Override // v4.m0
    public final long j() {
        return 250L;
    }

    @Override // v4.m0
    public final r0 l(b1 b1Var, e1 e1Var, int i7, List list) {
        r0 l10 = super.l(b1Var, e1Var, i7, list);
        View view = e1Var.a;
        if (!(view instanceof q1)) {
            return l10;
        }
        i iVar = new i();
        iVar.a = l10.a;
        iVar.b = l10.b;
        x1 transitionParams = ((q1) view).getTransitionParams();
        iVar.c = transitionParams.b;
        iVar.d = transitionParams.c;
        iVar.e = transitionParams.d;
        iVar.f = transitionParams.e;
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x047a A[EDGE_INSN: B:226:0x047a->B:227:0x047a BREAK  A[LOOP:9: B:195:0x03c1->B:219:0x0470], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0201  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v6 */
    @Override // v4.k, v4.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z10;
        boolean z11;
        uj0 uj0Var;
        boolean z12;
        int i7;
        boolean z13;
        int size;
        int i10;
        HashMap hashMap;
        boolean z14;
        float f10;
        ArrayList arrayList;
        int i11;
        uj0 uj0Var2;
        float f11;
        boolean z15;
        ArrayList arrayList2;
        int i12;
        int i13;
        ArrayList arrayList3;
        boolean z16;
        boolean z17;
        ne neVar;
        int i14;
        bj currentMessagesGroup;
        boolean z18;
        uj0 uj0Var3;
        boolean z19;
        gj messageObject;
        ne neVar2;
        int i15;
        int i16;
        boolean z20;
        an anVar;
        Runnable runnable;
        bg0 bg0Var;
        int i17;
        k kVar = this;
        ArrayList arrayList4 = kVar.p;
        boolean isEmpty = arrayList4.isEmpty();
        ArrayList arrayList5 = kVar.r;
        boolean isEmpty2 = arrayList5.isEmpty();
        ArrayList arrayList6 = kVar.s;
        boolean isEmpty3 = arrayList6.isEmpty();
        ArrayList arrayList7 = kVar.q;
        boolean isEmpty4 = arrayList7.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        boolean z21 = kVar.N;
        uj0 uj0Var4 = kVar.G;
        if (z21) {
            z10 = false;
            for (0; i17 < arrayList7.size(); i17 + 1) {
                if (kVar.Q) {
                    i17 = ((e1) arrayList7.get(i17)).c() != (uj0Var4.getAdapter() == null ? 0 : uj0Var4.getAdapter().b()) - 1 ? i17 + 1 : 0;
                    z10 = true;
                } else {
                    if (((e1) arrayList7.get(i17)).c() != 0) {
                    }
                    z10 = true;
                }
            }
        } else {
            z10 = false;
        }
        kVar.W();
        ArrayList arrayList8 = kVar.y;
        float f12 = 1.0f;
        if (z10) {
            boolean isEmpty5 = arrayList4.isEmpty();
            boolean isEmpty6 = arrayList5.isEmpty();
            boolean isEmpty7 = arrayList6.isEmpty();
            boolean isEmpty8 = arrayList7.isEmpty();
            if (!isEmpty5 || !isEmpty6 || !isEmpty8 || !isEmpty7) {
                int i18 = 0;
                for (0; i15 < arrayList7.size(); i15 + 1) {
                    View view = ((e1) arrayList7.get(i15)).a;
                    if (view instanceof q1) {
                        q1 q1Var = (q1) view;
                        i15 = (q1Var.getCurrentPosition() != null && (q1Var.getCurrentPosition().l & 1) == 0) ? i15 + 1 : 0;
                    }
                    i18 += ((e1) arrayList7.get(i15)).a.getHeight();
                }
                int size2 = arrayList4.size();
                int i19 = 0;
                while (i19 < size2) {
                    Object obj = arrayList4.get(i19);
                    i19++;
                    kVar.D((e1) obj);
                }
                arrayList4.clear();
                if (!isEmpty6) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList5);
                    arrayList5.clear();
                    int size3 = arrayList9.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj2 = arrayList9.get(i20);
                        i20++;
                        v4.j jVar = (v4.j) obj2;
                        kVar.T(jVar.a, jVar, false);
                    }
                    arrayList9.clear();
                }
                if (!isEmpty8) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.addAll(arrayList7);
                    arrayList7.clear();
                    int size4 = arrayList10.size();
                    int i21 = 0;
                    while (i21 < size4) {
                        Object obj3 = arrayList10.get(i21);
                        i21++;
                        e1 e1Var = (e1) obj3;
                        View view2 = e1Var.a;
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList8.add(e1Var);
                        view2.setTranslationY(i18);
                        View view3 = e1Var.a;
                        view3.setScaleX(f12);
                        view3.setScaleY(f12);
                        q1 q1Var2 = view3 instanceof q1 ? (q1) view3 : null;
                        if (q1Var2 == null || !q1Var2.getTransitionParams().y0) {
                            view3.setAlpha(f12);
                        }
                        an anVar2 = kVar.F;
                        if (anVar2 != null) {
                            ArrayList arrayList11 = anVar2.J4;
                            if (q1Var2 != null && arrayList11.contains(q1Var2.getMessageObject())) {
                                arrayList11.remove(q1Var2.getMessageObject());
                                qj qjVar = anVar2.a0;
                                if (qjVar.g0 == null || !((bg0Var = qjVar.M0) == null || bg0Var.u0)) {
                                    i16 = size4;
                                } else {
                                    i16 = size4;
                                    if (System.currentTimeMillis() - qjVar.N0 > 300) {
                                        z20 = true;
                                        qjVar.N0 = -1L;
                                        if (z20) {
                                            if (gj.R4(q1Var2.getMessageObject().k)) {
                                                if (Math.abs(view2.getTranslationY()) < view2.getMeasuredHeight() * 3.0f) {
                                                    new hc1(q1Var2, anVar2.a0, kVar.G, anVar2.ia, kVar.R).f.start();
                                                }
                                            } else if (gz.o() != 0 && Math.abs(view2.getTranslationY()) < uj0Var4.getMeasuredHeight()) {
                                                anVar = anVar2;
                                                ValueAnimator valueAnimator = new i51(q1Var2, anVar2, kVar.G, anVar2.ia, kVar.R).d;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                                qj qjVar2 = anVar.a0;
                                                runnable = qjVar2.g0;
                                                if (runnable != null) {
                                                    g0.r(runnable);
                                                    qjVar2.h0 = true;
                                                    qjVar2.g0.run();
                                                    qjVar2.g0 = null;
                                                    animate.translationY(0.0f).setDuration(250L).setInterpolator(kVar.o).setListener(new j0(kVar, e1Var, view2, animate)).start();
                                                    size4 = i16;
                                                    f12 = 1.0f;
                                                }
                                            }
                                            anVar = anVar2;
                                            qj qjVar22 = anVar.a0;
                                            runnable = qjVar22.g0;
                                            if (runnable != null) {
                                            }
                                        }
                                        animate.translationY(0.0f).setDuration(250L).setInterpolator(kVar.o).setListener(new j0(kVar, e1Var, view2, animate)).start();
                                        size4 = i16;
                                        f12 = 1.0f;
                                    }
                                }
                                z20 = false;
                                qjVar.N0 = -1L;
                                if (z20) {
                                }
                                animate.translationY(0.0f).setDuration(250L).setInterpolator(kVar.o).setListener(new j0(kVar, e1Var, view2, animate)).start();
                                size4 = i16;
                                f12 = 1.0f;
                            }
                        }
                        i16 = size4;
                        animate.translationY(0.0f).setDuration(250L).setInterpolator(kVar.o).setListener(new j0(kVar, e1Var, view2, animate)).start();
                        size4 = i16;
                        f12 = 1.0f;
                    }
                    arrayList10.clear();
                }
            }
        } else {
            boolean isEmpty9 = arrayList4.isEmpty();
            boolean isEmpty10 = arrayList5.isEmpty();
            boolean isEmpty11 = arrayList6.isEmpty();
            boolean isEmpty12 = arrayList7.isEmpty();
            if (!isEmpty9 || !isEmpty10 || !isEmpty12 || !isEmpty11) {
                boolean z22 = (kVar.U == null || (neVar2 = kVar.T) == null || !((Boolean) neVar2.run()).booleanValue()) ? false : true;
                ArrayList arrayList12 = kVar.K;
                ArrayList arrayList13 = kVar.A;
                ArrayList arrayList14 = kVar.S;
                if (z22) {
                    i7 = 1;
                    LongSparseArray longSparseArray = null;
                    int i22 = 0;
                    while (i22 < arrayList4.size()) {
                        e1 e1Var2 = (e1) arrayList4.get(i22);
                        if (arrayList14.contains(e1Var2)) {
                            z18 = isEmpty10;
                            View view4 = e1Var2.a;
                            z19 = isEmpty11;
                            if (!(view4 instanceof q1) || ((q1) view4).getCurrentMessagesGroup() == null || (messageObject = ((q1) e1Var2.a).getMessageObject()) == null || messageObject.c1() == 0) {
                                uj0Var3 = uj0Var4;
                            } else {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                uj0Var3 = uj0Var4;
                                ArrayList arrayList15 = (ArrayList) longSparseArray.get(messageObject.c1());
                                if (arrayList15 == null) {
                                    long c12 = messageObject.c1();
                                    ArrayList arrayList16 = new ArrayList();
                                    longSparseArray.put(c12, arrayList16);
                                    arrayList15 = arrayList16;
                                }
                                arrayList14.remove(e1Var2);
                                arrayList4.remove(i22);
                                i22--;
                                arrayList15.add(e1Var2);
                            }
                        } else {
                            z18 = isEmpty10;
                            uj0Var3 = uj0Var4;
                            z19 = isEmpty11;
                        }
                        i22++;
                        isEmpty10 = z18;
                        isEmpty11 = z19;
                        uj0Var4 = uj0Var3;
                    }
                    z11 = isEmpty10;
                    uj0Var = uj0Var4;
                    z12 = isEmpty11;
                    i7 = i7;
                    if (longSparseArray != null) {
                        int i23 = 0;
                        z13 = false;
                        while (i23 < longSparseArray.size()) {
                            ArrayList arrayList17 = (ArrayList) longSparseArray.valueAt(i23);
                            if (arrayList17.size() > 0) {
                                View view5 = ((e1) arrayList17.get(0)).a;
                                if (!(view5 instanceof q1) || (currentMessagesGroup = ((q1) view5).getCurrentMessagesGroup()) == null || currentMessagesGroup.d.size() <= arrayList17.size()) {
                                    if (r2.a) {
                                        a8.b("animate remove group impl with thanos");
                                    }
                                    arrayList13.addAll(arrayList17);
                                    fz0 fz0Var = (fz0) kVar.U.run();
                                    for (int i24 = 0; i24 < arrayList17.size(); i24++) {
                                    }
                                    ArrayList arrayList18 = new ArrayList();
                                    i14 = i23;
                                    for (int i25 = 0; i25 < arrayList17.size(); i25++) {
                                        arrayList18.add(((e1) arrayList17.get(i25)).a);
                                    }
                                    lv0 lv0Var = new lv0(kVar, arrayList18, arrayList17, 17);
                                    dz0 dz0Var = fz0Var.a;
                                    if (dz0Var != null) {
                                        dz0Var.d(arrayList18, lv0Var);
                                        Choreographer.getInstance().postFrameCallback(fz0Var.b);
                                    } else {
                                        fz0Var.c.add(new ez0(arrayList18, lv0Var));
                                    }
                                    arrayList12.add((View) arrayList18.get(0));
                                    uj0Var.C0();
                                    z13 = true;
                                    i23 = i14 + 1;
                                } else {
                                    arrayList4.addAll(arrayList17);
                                }
                            }
                            i14 = i23;
                            i23 = i14 + 1;
                        }
                        size = arrayList4.size();
                        boolean z23 = z13;
                        i10 = 0;
                        while (true) {
                            hashMap = kVar.J;
                            if (i10 < size) {
                                break;
                            }
                            Object obj4 = arrayList4.get(i10);
                            int i26 = i10 + 1;
                            e1 e1Var3 = (e1) obj4;
                            boolean z24 = (arrayList14.remove(e1Var3) && z22) ? i7 : false;
                            if (r2.a) {
                                arrayList2 = arrayList4;
                                i12 = size;
                                a8.b("animate remove impl ".concat(z24 ? " with thanos" : ""));
                            } else {
                                arrayList2 = arrayList4;
                                i12 = size;
                            }
                            View view6 = e1Var3.a;
                            arrayList13.add(e1Var3);
                            if (!z24 || (neVar = kVar.U) == null) {
                                i13 = i26;
                                Property property = View.ALPHA;
                                arrayList3 = arrayList14;
                                float[] fArr = new float[2];
                                fArr[0] = view6.getAlpha();
                                fArr[i7] = 0.0f;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view6, (Property<View, Float>) property, fArr);
                                z16 = z24;
                                z17 = isEmpty12;
                                ofFloat.setDuration(kVar.d);
                                ofFloat.addListener(new f(kVar, view6, e1Var3));
                                hashMap.put(e1Var3, ofFloat);
                                ofFloat.start();
                            } else {
                                fz0 fz0Var2 = (fz0) neVar.run();
                                i13 = i26;
                                lv0 lv0Var2 = new lv0(kVar, view6, e1Var3, 18);
                                dz0 dz0Var2 = fz0Var2.a;
                                if (dz0Var2 != null) {
                                    dz0Var2.b(1.0f, view6, lv0Var2);
                                    Choreographer.getInstance().postFrameCallback(fz0Var2.b);
                                } else {
                                    fz0Var2.c.add(new ez0(view6, lv0Var2));
                                }
                                arrayList12.add(view6);
                                arrayList3 = arrayList14;
                                z16 = z24;
                                z17 = isEmpty12;
                            }
                            uj0Var.C0();
                            isEmpty12 = z17;
                            if (z16) {
                                z23 = i7;
                            }
                            size = i12;
                            arrayList4 = arrayList2;
                            i10 = i13;
                            arrayList14 = arrayList3;
                        }
                        z14 = isEmpty12;
                        arrayList4.clear();
                        if (!z11) {
                            ArrayList arrayList19 = new ArrayList();
                            arrayList19.addAll(arrayList5);
                            kVar.u.add(arrayList19);
                            arrayList5.clear();
                            org.telegram.ui.ActionBar.v vVar = new org.telegram.ui.ActionBar.v(kVar, arrayList19, z23, i7);
                            if (!kVar.C || isEmpty9) {
                                vVar.run();
                            } else {
                                View view7 = ((v4.j) arrayList19.get(0)).a.a;
                                WeakHashMap weakHashMap = i0.a;
                                view7.postOnAnimationDelayed(vVar, 0L);
                            }
                        }
                        if (!z12) {
                            ArrayList arrayList20 = new ArrayList();
                            arrayList20.addAll(arrayList6);
                            kVar.v.add(arrayList20);
                            arrayList6.clear();
                            pb.l lVar = new pb.l(kVar, arrayList20, false, 4);
                            if (!kVar.C || isEmpty9) {
                                lVar.run();
                            } else {
                                View view8 = ((v4.i) arrayList20.get(0)).a.a;
                                WeakHashMap weakHashMap2 = i0.a;
                                view8.postOnAnimationDelayed(lVar, 0L);
                            }
                        }
                        if (!z14) {
                            ArrayList arrayList21 = new ArrayList();
                            arrayList21.addAll(arrayList7);
                            arrayList7.clear();
                            Collections.sort(arrayList21, new qv0(11));
                            int i27 = 0;
                            for (int size5 = arrayList21.size(); i27 < size5; size5 = i11) {
                                int i28 = i27 + 1;
                                e1 e1Var4 = (e1) arrayList21.get(i27);
                                if (r2.a) {
                                    a8.b("animate add impl");
                                }
                                View view9 = e1Var4.a;
                                arrayList8.add(e1Var4);
                                if (e1Var4 == kVar.O) {
                                    view9.setAlpha(1.0f);
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                if (view9 instanceof q1) {
                                    q1 q1Var3 = (q1) view9;
                                    if (q1Var3.getAnimationOffsetX() != 0.0f) {
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(q1Var3, q1Var3.ld, q1Var3.getAnimationOffsetX(), 0.0f));
                                    }
                                    q1Var3.setPivotX(((q1Var3.getBackgroundDrawableRight() - q1Var3.getBackgroundDrawableLeft()) / 2.0f) + q1Var3.getBackgroundDrawableLeft());
                                    f10 = 0.0f;
                                    view9.animate().translationY(0.0f).setDuration(kVar.c).start();
                                } else {
                                    f10 = 0.0f;
                                    view9.animate().translationX(0.0f).translationY(0.0f).setDuration(kVar.c).start();
                                }
                                long max = (long) ((1.0f - Math.max(f10, Math.min(1.0f, view9.getBottom() / uj0Var.getMeasuredHeight()))) * 100.0f);
                                if (!(view9 instanceof q1)) {
                                    arrayList = arrayList21;
                                    i11 = size5;
                                    uj0Var2 = uj0Var;
                                    f11 = 1.0f;
                                } else if (e1Var4 == kVar.O) {
                                    xn xnVar = kVar.P;
                                    if (xnVar != null) {
                                        xnVar.h.setAlpha(0.0f);
                                    }
                                    uj0Var2 = uj0Var;
                                    uj0Var2.setClipChildren(false);
                                    final q1 q1Var4 = (q1) view9;
                                    View view10 = (View) kVar.P.getParent();
                                    float x10 = view10.getX() + kVar.P.getX() + kVar.P.h.getX();
                                    float y10 = view10.getY() + kVar.P.getY() + kVar.P.h.getY();
                                    float x11 = q1Var4.getX() + uj0Var2.getX() + q1Var4.getPhotoImage().L0;
                                    float y11 = q1Var4.getY() + uj0Var2.getY() + q1Var4.getPhotoImage().M0;
                                    final float width = kVar.P.h.getWidth();
                                    final float height = kVar.P.h.getHeight();
                                    final float f13 = q1Var4.getPhotoImage().N0;
                                    final float f14 = q1Var4.getPhotoImage().O0;
                                    final float f15 = x10 - x11;
                                    final float f16 = y10 - y11;
                                    final float f17 = q1Var4.getPhotoImage().L0;
                                    final float f18 = q1Var4.getPhotoImage().M0;
                                    q1Var4.getTransitionParams().g0 = true;
                                    q1Var4.getTransitionParams().K1 = true;
                                    q1Var4.getPhotoImage().y0(f17 + f15, f17 + f16, width, height);
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pi.d
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            q1 q1Var5 = q1.this;
                                            q1Var5.getTransitionParams().L1 = floatValue;
                                            if (q1Var5.getTransitionParams().L1 > 1.0f) {
                                                q1Var5.getTransitionParams().L1 = 1.0f;
                                            }
                                            float f19 = 1.0f - floatValue;
                                            q1Var5.getPhotoImage().y0((f15 * f19) + f17, (f16 * f19) + f18, (f13 * floatValue) + (width * f19), (f14 * floatValue) + (height * f19));
                                            q1Var5.invalidate();
                                        }
                                    });
                                    arrayList = arrayList21;
                                    i11 = size5;
                                    f11 = 1.0f;
                                    kVar = this;
                                    ofFloat2.addListener(new e(kVar, q1Var4, f17, f18, f13, f14));
                                    animatorSet.play(ofFloat2);
                                    max = max;
                                    z15 = false;
                                    view9.setAlpha(0.0f);
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), f11));
                                    if (z15) {
                                        view9.setScaleX(f11);
                                        view9.setScaleY(f11);
                                    } else {
                                        view9.setScaleX(0.9f);
                                        view9.setScaleY(0.9f);
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_Y, view9.getScaleY(), f11));
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_X, view9.getScaleX(), f11));
                                    }
                                    if (e1Var4 != kVar.O) {
                                        animatorSet.setDuration(350L);
                                        animatorSet.setInterpolator(new OvershootInterpolator());
                                    } else {
                                        animatorSet.setStartDelay(max);
                                        animatorSet.setDuration(250L);
                                    }
                                    animatorSet.addListener(new f(kVar, e1Var4, view9));
                                    hashMap.put(e1Var4, animatorSet);
                                    animatorSet.start();
                                    i27 = i28;
                                    uj0Var = uj0Var2;
                                    arrayList21 = arrayList;
                                } else {
                                    arrayList = arrayList21;
                                    i11 = size5;
                                    uj0Var2 = uj0Var;
                                    f11 = 1.0f;
                                    bj currentMessagesGroup2 = ((q1) view9).getCurrentMessagesGroup();
                                    if (currentMessagesGroup2 != null) {
                                        Long valueOf = Long.valueOf(currentMessagesGroup2.a);
                                        HashMap hashMap2 = kVar.M;
                                        Long l10 = (Long) hashMap2.get(valueOf);
                                        if (l10 == null) {
                                            hashMap2.put(Long.valueOf(currentMessagesGroup2.a), Long.valueOf(max));
                                        } else {
                                            max = l10.longValue();
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
                                z15 = true;
                                view9.setAlpha(0.0f);
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), f11));
                                if (z15) {
                                }
                                if (e1Var4 != kVar.O) {
                                }
                                animatorSet.addListener(new f(kVar, e1Var4, view9));
                                hashMap.put(e1Var4, animatorSet);
                                animatorSet.start();
                                i27 = i28;
                                uj0Var = uj0Var2;
                                arrayList21 = arrayList;
                            }
                            arrayList21.clear();
                        }
                    }
                } else {
                    z11 = isEmpty10;
                    uj0Var = uj0Var4;
                    z12 = isEmpty11;
                    i7 = 1;
                }
                z13 = false;
                size = arrayList4.size();
                boolean z232 = z13;
                i10 = 0;
                while (true) {
                    hashMap = kVar.J;
                    if (i10 < size) {
                    }
                    size = i12;
                    arrayList4 = arrayList2;
                    i10 = i13;
                    arrayList14 = arrayList3;
                }
                z14 = isEmpty12;
                arrayList4.clear();
                if (!z11) {
                }
                if (!z12) {
                }
                if (!z14) {
                }
            }
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new j3(kVar, 25));
        ofFloat3.setDuration(kVar.d + 250);
        ofFloat3.start();
    }

    @Override // v4.k, v4.g1
    public final void p(e1 e1Var) {
        R(e1Var);
        View view = e1Var.a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof q1) {
            ((q1) view).getTransitionParams().i = true;
        }
        this.q.add(e1Var);
    }

    @Override // v4.k, v4.g1
    public final boolean q(e1 e1Var, e1 e1Var2, r0 r0Var, int i7, int i10, int i11, int i12) {
        if (e1Var == e1Var2) {
            return r(e1Var, r0Var, i7, i10, i11, i12);
        }
        View view = e1Var.a;
        float animationOffsetX = view instanceof q1 ? ((q1) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(e1Var);
        int i13 = (int) ((i11 - i7) - animationOffsetX);
        int i14 = (int) ((i12 - i10) - translationY);
        if (view instanceof q1) {
            ((q1) view).setAnimationOffsetX(animationOffsetX);
        } else {
            view.setTranslationX(animationOffsetX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = e1Var2.a;
        R(e1Var2);
        if (view2 instanceof q1) {
            ((q1) view2).setAnimationOffsetX(-i13);
        } else {
            view2.setTranslationX(-i13);
        }
        view2.setTranslationY(-i14);
        view2.setAlpha(0.0f);
        this.s.add(new v4.i(e1Var, e1Var2, i7, i10, i11, i12));
        F();
        return true;
    }

    @Override // v4.k, v4.g1
    public final boolean r(e1 e1Var, r0 r0Var, int i7, int i10, int i11, int i12) {
        int translationX;
        int i13;
        q1 q1Var;
        t0 t0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        View view;
        int i14;
        float f15;
        boolean z10;
        bj bjVar;
        int i15;
        boolean P3;
        View view2 = e1Var.a;
        if (view2 instanceof q1) {
            q1 q1Var2 = (q1) view2;
            translationX = i7 + ((int) q1Var2.getAnimationOffsetX());
            i13 = q1Var2.getTransitionParams().t2 != q1Var2.getTopMediaOffset() ? (q1Var2.getTransitionParams().t2 - q1Var2.getTopMediaOffset()) + i10 : i10;
            q1Var = q1Var2;
            t0Var = null;
        } else if (view2 instanceof t0) {
            translationX = i7 + ((int) view2.getTranslationX());
            i13 = i10;
            t0Var = (t0) view2;
            q1Var = null;
        } else {
            translationX = i7 + ((int) view2.getTranslationX());
            i13 = i10;
            q1Var = null;
            t0Var = null;
        }
        int i16 = translationX;
        int translationY = i13 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (q1Var != null) {
            float f16 = q1Var.getPhotoImage().L0;
            float f17 = q1Var.getPhotoImage().M0;
            float f18 = q1Var.getPhotoImage().N0;
            float f19 = q1Var.getPhotoImage().O0;
            f10 = 0.0f;
            int i17 = 0;
            for (int i18 = 4; i17 < i18; i18 = 4) {
                iArr[i17] = q1Var.getPhotoImage().X0[i17];
                i17++;
            }
            f12 = f16;
            f13 = f17;
            f11 = f19;
            f14 = f18;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
            f14 = 0.0f;
        }
        R(e1Var);
        int i19 = i11 - i16;
        int i20 = i12 - translationY;
        if (i20 != 0) {
            view2.setTranslationY(-i20);
        }
        float f20 = f11;
        t0 t0Var2 = t0Var;
        j jVar = new j(e1Var, i16, translationY, i11, i12);
        if (q1Var != null) {
            x1 transitionParams = q1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.u0;
            Rect rect = transitionParams.E0;
            bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
            if (i19 != 0) {
                q1Var.setAnimationOffsetX(-i19);
            }
            boolean z11 = r0Var instanceof i;
            uj0 uj0Var = this.G;
            if (z11) {
                ImageReceiver photoImage = q1Var.getPhotoImage();
                view = view2;
                i iVar = (i) r0Var;
                i14 = i19;
                boolean z12 = (!transitionParams.w0 || iVar.f == f10 || iVar.e == f10) ? false : true;
                jVar.n = z12;
                if (z12) {
                    uj0Var.setClipChildren(false);
                    uj0Var.invalidate();
                    transitionParams.g0 = true;
                    if (q1Var.getMessageObject().h4()) {
                        transitionParams.n0 = f12;
                        transitionParams.o0 = f13;
                        transitionParams.p0 = f14;
                        transitionParams.q0 = f20;
                        transitionParams.B0 = iArr;
                    } else {
                        transitionParams.n0 = photoImage.L0;
                        transitionParams.o0 = photoImage.M0;
                        transitionParams.p0 = photoImage.N0;
                        transitionParams.q0 = photoImage.O0;
                        transitionParams.B0 = photoImage.X0;
                    }
                    transitionParams.C0 = false;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= 4) {
                            break;
                        }
                        if (iArr2[i21] != transitionParams.B0[i21]) {
                            transitionParams.C0 = true;
                            break;
                        }
                        i21++;
                    }
                    float f21 = transitionParams.n0;
                    float f22 = iVar.c;
                    if (f21 == f22 && transitionParams.o0 == iVar.d && transitionParams.q0 == iVar.f && transitionParams.p0 == iVar.e && !transitionParams.C0) {
                        transitionParams.g0 = false;
                        jVar.n = false;
                    } else {
                        jVar.o = f22;
                        jVar.p = iVar.d;
                        jVar.q = iVar.e;
                        jVar.r = iVar.f;
                        if (currentMessagesGroup != null) {
                            boolean z13 = currentMessagesGroup.c;
                            aj ajVar = currentMessagesGroup.m;
                            boolean z14 = ajVar.o;
                            if (z13 != z14) {
                                ajVar.n = z14 ? 1.0f : f10;
                            }
                        }
                        if (transitionParams.C0) {
                            if (transitionParams.B0 == photoImage.X0) {
                                transitionParams.B0 = new int[4];
                                for (int i22 = 0; i22 < 4; i22++) {
                                    transitionParams.B0[i22] = photoImage.X0[i22];
                                }
                            }
                            photoImage.L0(iArr2);
                        }
                        q1Var.v3(jVar.o, jVar.p, jVar.q, jVar.r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.w0 && (((P3 = q1Var.getMessageObject().P3()) && rect.left != q1Var.getBackgroundDrawableLeft()) || ((!P3 && rect.right != q1Var.getBackgroundDrawableRight()) || rect.top != q1Var.getBackgroundDrawableTop() || rect.bottom != q1Var.getBackgroundDrawableBottom()))) {
                    jVar.v = q1Var.getBackgroundDrawableBottom() - rect.bottom;
                    jVar.u = q1Var.getBackgroundDrawableTop() - rect.top;
                    if (q1Var.Y6 != transitionParams.F0) {
                        jVar.s = q1Var.getBackgroundDrawableLeft() - rect.left;
                        jVar.t = q1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (P3) {
                        jVar.s = q1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        jVar.t = q1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    jVar.l = true;
                    transitionParams.x0 = true;
                    transitionParams.h0 = -jVar.s;
                    transitionParams.i0 = -jVar.t;
                    transitionParams.k0 = -jVar.u;
                    transitionParams.j0 = -jVar.v;
                    uj0Var.setClipChildren(false);
                    uj0Var.invalidate();
                }
            } else {
                view = view2;
                i14 = i19;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    uj0 uj0Var2 = (uj0) view.getParent();
                    aj ajVar2 = currentMessagesGroup.m;
                    boolean z15 = true;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    while (i23 < uj0Var2.getChildCount()) {
                        View childAt = uj0Var2.getChildAt(i23);
                        if (childAt instanceof q1) {
                            q1 q1Var3 = (q1) childAt;
                            if (q1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !q1Var3.getMessageObject().Z) {
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                bjVar = currentMessagesGroup;
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                i15 = i23;
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if (i26 == 0 || backgroundDrawableLeft < i26) {
                                    i26 = backgroundDrawableLeft;
                                }
                                if (i27 == 0 || backgroundDrawableRight > i27) {
                                    i27 = backgroundDrawableRight;
                                }
                                if (q1Var3.getTransitionParams().w0 || ajVar2.p) {
                                    if (i24 == 0 || backgroundDrawableTop < i24) {
                                        i24 = backgroundDrawableTop;
                                    }
                                    if (i25 == 0 || backgroundDrawableBottom > i25) {
                                        i25 = backgroundDrawableBottom;
                                    }
                                    z15 = false;
                                }
                                i23 = i15 + 1;
                                currentMessagesGroup = bjVar;
                            }
                        }
                        bjVar = currentMessagesGroup;
                        i15 = i23;
                        i23 = i15 + 1;
                        currentMessagesGroup = bjVar;
                    }
                    ajVar2.p = false;
                    if (i24 == 0 && i25 == 0 && i26 == 0 && i27 == 0) {
                        jVar.j = false;
                        ajVar2.j = false;
                    } else {
                        int i28 = (-i24) + ajVar2.b;
                        jVar.f = i28;
                        int i29 = (-i25) + ajVar2.d;
                        jVar.g = i29;
                        int i30 = (-i26) + ajVar2.a;
                        jVar.h = i30;
                        int i31 = (-i27) + ajVar2.c;
                        jVar.i = i31;
                        jVar.j = true;
                        ajVar2.j = true;
                        ajVar2.f = i28;
                        ajVar2.h = i29;
                        ajVar2.e = i30;
                        ajVar2.g = i31;
                        ajVar2.n = ajVar2.o ? 1.0f : f10;
                        uj0Var2.setClipChildren(false);
                        uj0Var2.invalidate();
                    }
                    ajVar2.i = z15;
                }
            }
            Integer valueOf = Integer.valueOf(q1Var.getMessageObject().e1());
            HashMap hashMap = this.H;
            bj bjVar2 = (bj) hashMap.get(valueOf);
            if (bjVar2 != null) {
                aj ajVar3 = bjVar2.m;
                hashMap.remove(Integer.valueOf(q1Var.getMessageObject().e1()));
                if (transitionParams.w0) {
                    int backgroundDrawableLeft2 = q1Var.getBackgroundDrawableLeft() + q1Var.getLeft();
                    int backgroundDrawableRight2 = q1Var.getBackgroundDrawableRight() + q1Var.getLeft();
                    int backgroundDrawableTop2 = q1Var.getBackgroundDrawableTop() + q1Var.getPaddingTop() + q1Var.getTop();
                    int backgroundDrawableBottom2 = q1Var.getBackgroundDrawableBottom() + q1Var.getPaddingTop() + q1Var.getTop();
                    jVar.w = true;
                    transitionParams.x0 = true;
                    jVar.s = backgroundDrawableLeft2 - ajVar3.a;
                    jVar.t = backgroundDrawableRight2 - ajVar3.c;
                    jVar.u = backgroundDrawableTop2 - ajVar3.b;
                    jVar.v = backgroundDrawableBottom2 - ajVar3.d;
                    jVar.l = false;
                    transitionParams.h0 = (int) ((-r6) - q1Var.getAnimationOffsetX());
                    transitionParams.i0 = (int) ((-jVar.t) - q1Var.getAnimationOffsetX());
                    transitionParams.k0 = (int) ((-jVar.u) - q1Var.getTranslationY());
                    transitionParams.j0 = (int) ((-jVar.v) - q1Var.getTranslationY());
                    transitionParams.D0 = true;
                    uj0Var.setClipChildren(false);
                    uj0Var.invalidate();
                } else {
                    ajVar3.i = true;
                }
            }
            yi yiVar = q1Var.M;
            if (transitionParams.z0 != (q1Var.C6 || q1Var.K || (yiVar != null && (yiVar.l & 8) == 0 && q1Var.L.i))) {
                z10 = true;
                jVar.k = true;
                f15 = f10;
                transitionParams.A0 = f15;
            } else {
                f15 = f10;
                z10 = true;
            }
            boolean a10 = transitionParams.a();
            jVar.m = a10;
            if (a10) {
                transitionParams.h = z10;
                transitionParams.L1 = f15;
            }
            if (i14 == 0 && i20 == 0 && !jVar.n && !jVar.w && !jVar.j && !jVar.k && !jVar.l && !a10) {
                v(e1Var);
                return false;
            }
        } else if (t0Var2 != null) {
            s0 transitionParams2 = t0Var2.getTransitionParams();
            transitionParams2.getClass();
            if (i19 != 0) {
                view2.setTranslationX(-i19);
            }
            boolean a11 = !transitionParams2.a ? false : transitionParams2.d.F0.a();
            jVar.m = a11;
            if (a11) {
                transitionParams2.b = true;
                transitionParams2.c = 0.0f;
            }
            if (i19 == 0 && i20 == 0 && !a11) {
                v(e1Var);
                return false;
            }
        } else if (view2 instanceof f0) {
            ((f0) view2).setAnimating(true);
        } else if (view2 instanceof ra) {
            ((ra) view2).setAnimating(true);
        } else {
            if (i19 == 0 && i20 == 0) {
                v(e1Var);
                return false;
            }
            if (i19 != 0) {
                view2.setTranslationX(-i19);
            }
        }
        this.r.add(jVar);
        F();
        return true;
    }

    @Override // v4.k, v4.g1
    public final void s(e1 e1Var, r0 r0Var) {
        if (r2.a) {
            a8.b("animate remove");
        }
        super.s(e1Var, r0Var);
        View view = e1Var.a;
        if (r0Var != null) {
            int i7 = r0Var.b;
            int top = view.getTop();
            int left = view.getLeft() - r0Var.a;
            if (top - i7 != 0) {
                view.setTranslationY(-r1);
            }
            if (!(view instanceof q1)) {
                if (left != 0) {
                    view.setTranslationX(-left);
                    return;
                }
                return;
            }
            q1 q1Var = (q1) view;
            if (left != 0) {
                q1Var.setAnimationOffsetX(-left);
            }
            if (r0Var instanceof i) {
                i iVar = (i) r0Var;
                q1Var.v3(iVar.c, iVar.d, iVar.e, iVar.f);
            }
        }
    }
}
