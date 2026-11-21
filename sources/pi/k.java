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
import bi.z0;
import ch.w;
import com.google.android.gms.internal.vision.e2;
import e2.r0;
import fi.z2;
import hi.j3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import jg.j0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.aj;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.s2;
import org.telegram.messenger.xi;
import org.telegram.messenger.zi;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.v;
import org.telegram.ui.Cells.g0;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.bn;
import org.telegram.ui.eg0;
import org.telegram.ui.k71;
import org.telegram.ui.kc1;
import org.telegram.ui.l51;
import org.telegram.ui.qe;
import org.telegram.ui.qw0;
import org.telegram.ui.rj;
import r0.i0;
import v4.c1;
import v4.f1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public abstract class k extends v4.k {
    public static final nr V = new nr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final bn F;
    public final ek0 G;
    public boolean N;
    public f1 O;
    public io P;
    public boolean Q;
    public final h6 R;
    public qe T;
    public qe U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public k(bn bnVar, ek0 ek0Var, h6 h6Var) {
        this.R = h6Var;
        this.F = bnVar;
        this.G = ek0Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override // v4.k
    public final void B(v4.i iVar) {
        v4.i iVar2;
        f1 f1Var = iVar.a;
        View view = f1Var == null ? null : f1Var.a;
        f1 f1Var2 = iVar.b;
        View view2 = f1Var2 != null ? f1Var2.a : null;
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
    public final void C(f1 f1Var, v4.j jVar) {
        T(f1Var, jVar, false);
    }

    @Override // v4.k
    public final boolean J(v4.i iVar, f1 f1Var) {
        oz0 oz0Var;
        if (s2.a) {
            a8.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(f1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = f1Var.a;
        if (this.K.contains(view) && (oz0Var = (oz0) this.U.run()) != null) {
            oz0Var.a(view);
        }
        if (iVar.b == f1Var) {
            iVar.b = null;
        } else {
            if (iVar.a != f1Var) {
                return false;
            }
            iVar.a = null;
        }
        X(view);
        d(f1Var);
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
    public final void T(final f1 f1Var, v4.j jVar, boolean z10) {
        f1 f1Var2;
        int i7;
        y1 y1Var;
        r1 r1Var;
        boolean z11;
        float f10;
        boolean z12;
        final j jVar2;
        final r1 r1Var2;
        y1 y1Var2;
        final int i10;
        final y1 y1Var3;
        ValueAnimator valueAnimator;
        final boolean z13;
        int[] iArr;
        int i11 = jVar.c;
        int i12 = jVar.e;
        View view = f1Var.a;
        int i13 = i12 - i11;
        AnimatorSet animatorSet = new AnimatorSet();
        int i14 = 0;
        final int i15 = 1;
        if (i13 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.z.add(f1Var);
        final j jVar3 = (j) jVar;
        bn bnVar = this.F;
        if (bnVar != null && (view instanceof g0)) {
            g0 g0Var = (g0) view;
            float translationY = g0Var.getTranslationY();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new g(this, g0Var, translationY, i14));
            animatorSet.playTogether(ofFloat);
        } else {
            if (bnVar == null || !(view instanceof ta)) {
                if (view instanceof r1) {
                    final r1 r1Var3 = (r1) view;
                    final y1 transitionParams = r1Var3.getTransitionParams();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(r1Var3, r1Var3.ld, 0.0f));
                    if (jVar3.n) {
                        r1Var3.w3(jVar3.o, jVar3.p, jVar3.q, jVar3.r);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        final float f11 = r1Var3.getCurrentMessagesGroup() == null ? transitionParams.v0 : r1Var3.getCurrentMessagesGroup().m.n;
                        final float d2 = r1Var3.getCurrentMessagesGroup() == null ? r1Var3.d2() : r1Var3.getCurrentMessagesGroup().c;
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
                                iArr[i16] = r1Var3.getPhotoImage().X0[i16];
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
                                y1 y1Var4 = transitionParams;
                                float f14 = (y1Var4.n0 * floatValue) + f13;
                                float f15 = (y1Var4.o0 * floatValue) + (jVar4.p * f12);
                                float f16 = (y1Var4.p0 * floatValue) + (jVar4.q * f12);
                                float f17 = (y1Var4.q0 * floatValue) + (jVar4.r * f12);
                                boolean z14 = z13;
                                r1 r1Var4 = r1Var3;
                                if (z14) {
                                    float f18 = (d2 * floatValue) + (f11 * f12);
                                    y1Var4.v0 = f18;
                                    if (r1Var4.getCurrentMessagesGroup() != null) {
                                        r1Var4.getCurrentMessagesGroup().m.n = f18;
                                    }
                                }
                                if (y1Var4.C0) {
                                    ImageReceiver photoImage = r1Var4.getPhotoImage();
                                    int[] iArr3 = iArr2;
                                    int[] iArr4 = y1Var4.B0;
                                    photoImage.K0((int) ((iArr4[0] * floatValue) + (iArr3[0] * f12)), (int) ((iArr4[1] * floatValue) + (iArr3[1] * f12)), (int) ((iArr4[2] * floatValue) + (iArr3[2] * f12)), (int) ((iArr4[3] * floatValue) + (iArr3[3] * f12)));
                                }
                                r1Var4.w3(f14, f15, f16, f17);
                                f1Var.a.invalidate();
                            }
                        };
                        y1Var = transitionParams;
                        r1Var = r1Var3;
                        f1Var2 = f1Var;
                        valueAnimator2.addUpdateListener(animatorUpdateListener);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[z11 ? 1 : 0] = valueAnimator2;
                        animatorSet.playTogether(animatorArr);
                    } else {
                        i7 = 2;
                        y1Var = transitionParams;
                        r1Var = r1Var3;
                        f1Var2 = f1Var;
                        z11 = false;
                    }
                    if (jVar3.v == 0 && jVar3.t == 0 && jVar3.u == 0 && jVar3.s == 0) {
                        f10 = 0.0f;
                        y1Var.l0 = 0.0f;
                        y1Var.m0 = 0.0f;
                        z12 = z11;
                    } else {
                        f10 = 0.0f;
                        ek0 ek0Var = this.G;
                        ek0Var.setClipChildren(z11);
                        ek0Var.invalidate();
                        float[] fArr = new float[i7];
                        // fill-array-data instruction
                        fArr[0] = 1.0f;
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr);
                        if (jVar3.l) {
                            y1Var.l0 = -jVar3.s;
                            y1Var.m0 = -jVar3.t;
                        } else {
                            y1Var.l0 = (-jVar3.s) - r1Var.getAnimationOffsetX();
                            y1Var.m0 = (-jVar3.t) - r1Var.getAnimationOffsetX();
                        }
                        ofFloat3.addUpdateListener(new z2(jVar3, y1Var, r1Var, 3));
                        z12 = false;
                        animatorSet.playTogether(ofFloat3);
                    }
                    aj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        jVar3.j = z12;
                    }
                    if (jVar3.j) {
                        float[] fArr2 = new float[i7];
                        // fill-array-data instruction
                        fArr2[0] = 1.0f;
                        fArr2[1] = 0.0f;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr2);
                        y1 y1Var4 = y1Var;
                        final zi ziVar = currentMessagesGroup.m;
                        final ek0 ek0Var2 = (ek0) view.getParent();
                        final float f12 = currentMessagesGroup.m.n;
                        if (currentMessagesGroup.c) {
                            f10 = 1.0f;
                        }
                        final boolean z14 = f12 != f10;
                        y1Var2 = y1Var4;
                        final float f13 = f10;
                        jVar2 = jVar3;
                        r1Var2 = r1Var;
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pi.b
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                j jVar4 = jVar2;
                                zi ziVar2 = zi.this;
                                ziVar2.f = jVar4.f * floatValue;
                                ziVar2.h = jVar4.g * floatValue;
                                ziVar2.e = jVar4.h * floatValue;
                                ziVar2.g = jVar4.i * floatValue;
                                if (z14) {
                                    ziVar2.n = e2.z(1.0f, floatValue, f13, f12 * floatValue);
                                }
                                ek0 ek0Var3 = ek0Var2;
                                if (ek0Var3 != null) {
                                    ek0Var3.invalidate();
                                }
                            }
                        });
                        ofFloat4.addListener(new k71(ziVar, 15));
                        i10 = 0;
                        animatorSet.playTogether(ofFloat4);
                    } else {
                        jVar2 = jVar3;
                        r1Var2 = r1Var;
                        y1Var2 = y1Var;
                        i10 = 0;
                    }
                    if (jVar2.k) {
                        float[] fArr3 = new float[i7];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(fArr3);
                        y1Var3 = y1Var2;
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pi.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i10) {
                                    case 0:
                                        y1Var3.A0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        r1Var2.invalidate();
                                        break;
                                    default:
                                        y1Var3.L1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        r1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i10] = ofFloat5;
                        animatorSet.playTogether(animatorArr2);
                    } else {
                        y1Var3 = y1Var2;
                    }
                    if (jVar2.m) {
                        float[] fArr4 = new float[i7];
                        // fill-array-data instruction
                        fArr4[0] = 0.0f;
                        fArr4[1] = 1.0f;
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(fArr4);
                        y1Var3.h = true;
                        ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pi.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i15) {
                                    case 0:
                                        y1Var3.A0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        r1Var2.invalidate();
                                        break;
                                    default:
                                        y1Var3.L1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        r1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        animatorSet.playTogether(ofFloat6);
                    }
                } else {
                    f1Var2 = f1Var;
                    if (view instanceof v0) {
                        v0 v0Var = (v0) view;
                        u0 transitionParams2 = v0Var.getTransitionParams();
                        if (jVar3.m) {
                            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            transitionParams2.b = true;
                            ofFloat7.addUpdateListener(new w(25, transitionParams2, v0Var));
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
                    animatorSet.setInterpolator(nr.g);
                }
                animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
                animatorSet.addListener(new z0(this, f1Var2, i13, view));
                animatorSet.start();
                this.J.put(f1Var2, animatorSet);
            }
            ta taVar = (ta) view;
            float translationY2 = taVar.getTranslationY();
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat8.addUpdateListener(new g(this, taVar, translationY2, i15));
            animatorSet.playTogether(ofFloat8);
        }
        f1Var2 = f1Var;
        if (z10) {
        }
        animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
        animatorSet.addListener(new z0(this, f1Var2, i13, view));
        animatorSet.start();
        this.J.put(f1Var2, animatorSet);
    }

    public final void U() {
        oz0 oz0Var;
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
        if (this.K.isEmpty() || (oz0Var = (oz0) this.U.run()) == null) {
            return;
        }
        ArrayList arrayList2 = oz0Var.c;
        if (oz0Var.e) {
            return;
        }
        oz0Var.e = true;
        int size2 = arrayList2.size();
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            nz0 nz0Var = (nz0) obj2;
            Runnable runnable = nz0Var.d;
            if (runnable != null) {
                oz0.b(runnable);
                nz0Var.d = null;
            }
        }
        arrayList2.clear();
        mz0 mz0Var = oz0Var.a;
        if (mz0Var != null) {
            mz0Var.h();
        }
        Runnable runnable2 = oz0Var.d;
        if (runnable2 != null) {
            oz0Var.d = null;
            oz0.b(runnable2);
        }
    }

    public final void V(aj ajVar) {
        if (ajVar == null) {
            return;
        }
        ArrayList arrayList = ajVar.d;
        zi ziVar = ajVar.m;
        if (arrayList.size() == 0) {
            ziVar.i = true;
            return;
        }
        if (ziVar.b == 0 && ziVar.d == 0 && ziVar.a == 0 && ziVar.c == 0) {
            ek0 ek0Var = this.G;
            int childCount = ek0Var.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = ek0Var.getChildAt(i7);
                if (childAt instanceof r1) {
                    r1 r1Var = (r1) childAt;
                    fj messageObject = r1Var.getMessageObject();
                    if (r1Var.getTransitionParams().w0 && arrayList.contains(messageObject)) {
                        ziVar.b = r1Var.getBackgroundDrawableTop() + r1Var.getPaddingTop() + r1Var.getTop();
                        ziVar.d = r1Var.getBackgroundDrawableBottom() + r1Var.getPaddingTop() + r1Var.getTop();
                        ziVar.a = r1Var.getBackgroundDrawableLeft() + r1Var.getLeft();
                        ziVar.c = r1Var.getBackgroundDrawableRight() + r1Var.getLeft();
                        ziVar.o = r1Var.d2();
                        ziVar.k = r1Var.L2();
                        ziVar.l = r1Var.K2();
                        ziVar.p = true;
                        break;
                    }
                }
                i7++;
            }
        }
        this.I.add(ajVar);
    }

    public abstract void W();

    public final void X(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z10 = view instanceof g0;
        ek0 ek0Var = this.G;
        if (z10) {
            int measuredHeight = (ek0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((g0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof ta) {
            int measuredHeight2 = (ek0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((ta) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof r1) {
            r1 r1Var = (r1) view;
            r1Var.getTransitionParams().e();
            r1Var.setAnimationOffsetX(0.0f);
        } else {
            if (!(view instanceof v0)) {
                view.setTranslationX(0.0f);
                return;
            }
            u0 transitionParams = ((v0) view).getTransitionParams();
            transitionParams.b = false;
            transitionParams.c = 1.0f;
        }
    }

    public final void Y(qe qeVar, qe qeVar2) {
        this.T = qeVar;
        this.U = qeVar2;
    }

    public final boolean Z(View view) {
        f1 T;
        if (this.N || (T = this.G.T(view)) == null) {
            return false;
        }
        return this.q.contains(T) || this.y.contains(T);
    }

    @Override // v4.h1, v4.n0
    public final boolean a(f1 f1Var, r0 r0Var, r0 r0Var2) {
        ArrayList arrayList;
        int i7;
        boolean a10 = super.a(f1Var, r0Var, r0Var2);
        if (a10 && this.N) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.q;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((f1) arrayList.get(i10)).c() == 0) {
                    z10 = true;
                }
                i10++;
            }
            if (z10) {
                i7 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i7 += ((f1) arrayList.get(i11)).a.getHeight();
                }
            } else {
                i7 = 0;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((f1) arrayList.get(i12)).a.setTranslationY(i7);
            }
        }
        return a10;
    }

    public final boolean a0(View view) {
        f1 T = this.G.T(view);
        if (T != null) {
            return this.p.contains(T) || this.A.contains(T);
        }
        return false;
    }

    @Override // v4.k, v4.n0
    public final void f(f1 f1Var) {
        oz0 oz0Var;
        Animator animator = (Animator) this.J.remove(f1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = f1Var.a;
        if (this.K.contains(view) && (oz0Var = (oz0) this.U.run()) != null) {
            oz0Var.a(view);
        }
        super.f(f1Var);
        X(view);
    }

    @Override // v4.k, v4.n0
    public void g() {
        if (s2.a) {
            a8.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((aj) obj).m.p = false;
        }
        arrayList.clear();
        U();
        io ioVar = this.P;
        if (ioVar != null) {
            ioVar.h.setAlpha(1.0f);
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
            f1 f1Var = (f1) arrayList3.get(size3);
            X(f1Var.a);
            d(f1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            f1 f1Var2 = (f1) arrayList4.get(size4);
            X(f1Var2.a);
            u(f1Var2);
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
                    f1 f1Var3 = (f1) arrayList9.get(size9);
                    X(f1Var3.a);
                    u(f1Var3);
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

    @Override // v4.n0
    public final long i() {
        return 250L;
    }

    @Override // v4.n0
    public final long j() {
        return 250L;
    }

    @Override // v4.n0
    public final r0 l(c1 c1Var, f1 f1Var, int i7, List list) {
        r0 l10 = super.l(c1Var, f1Var, i7, list);
        View view = f1Var.a;
        if (!(view instanceof r1)) {
            return l10;
        }
        i iVar = new i();
        iVar.a = l10.a;
        iVar.b = l10.b;
        y1 transitionParams = ((r1) view).getTransitionParams();
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
    @Override // v4.k, v4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z10;
        boolean z11;
        ek0 ek0Var;
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
        ek0 ek0Var2;
        float f11;
        boolean z15;
        ArrayList arrayList2;
        int i12;
        int i13;
        ArrayList arrayList3;
        boolean z16;
        boolean z17;
        qe qeVar;
        int i14;
        aj currentMessagesGroup;
        boolean z18;
        ek0 ek0Var3;
        boolean z19;
        fj messageObject;
        qe qeVar2;
        int i15;
        int i16;
        boolean z20;
        bn bnVar;
        Runnable runnable;
        eg0 eg0Var;
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
        ek0 ek0Var4 = kVar.G;
        if (z21) {
            z10 = false;
            for (0; i17 < arrayList7.size(); i17 + 1) {
                if (kVar.Q) {
                    i17 = ((f1) arrayList7.get(i17)).c() != (ek0Var4.getAdapter() == null ? 0 : ek0Var4.getAdapter().b()) - 1 ? i17 + 1 : 0;
                    z10 = true;
                } else {
                    if (((f1) arrayList7.get(i17)).c() != 0) {
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
                    View view = ((f1) arrayList7.get(i15)).a;
                    if (view instanceof r1) {
                        r1 r1Var = (r1) view;
                        i15 = (r1Var.getCurrentPosition() != null && (r1Var.getCurrentPosition().l & 1) == 0) ? i15 + 1 : 0;
                    }
                    i18 += ((f1) arrayList7.get(i15)).a.getHeight();
                }
                int size2 = arrayList4.size();
                int i19 = 0;
                while (i19 < size2) {
                    Object obj = arrayList4.get(i19);
                    i19++;
                    kVar.D((f1) obj);
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
                        f1 f1Var = (f1) obj3;
                        View view2 = f1Var.a;
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList8.add(f1Var);
                        view2.setTranslationY(i18);
                        View view3 = f1Var.a;
                        view3.setScaleX(f12);
                        view3.setScaleY(f12);
                        r1 r1Var2 = view3 instanceof r1 ? (r1) view3 : null;
                        if (r1Var2 == null || !r1Var2.getTransitionParams().y0) {
                            view3.setAlpha(f12);
                        }
                        bn bnVar2 = kVar.F;
                        if (bnVar2 != null) {
                            ArrayList arrayList11 = bnVar2.K4;
                            if (r1Var2 != null && arrayList11.contains(r1Var2.getMessageObject())) {
                                arrayList11.remove(r1Var2.getMessageObject());
                                rj rjVar = bnVar2.a0;
                                if (rjVar.g0 == null || !((eg0Var = rjVar.M0) == null || eg0Var.u0)) {
                                    i16 = size4;
                                } else {
                                    i16 = size4;
                                    if (System.currentTimeMillis() - rjVar.N0 > 300) {
                                        z20 = true;
                                        rjVar.N0 = -1L;
                                        if (z20) {
                                            if (fj.R4(r1Var2.getMessageObject().k)) {
                                                if (Math.abs(view2.getTranslationY()) < view2.getMeasuredHeight() * 3.0f) {
                                                    new kc1(r1Var2, bnVar2.a0, kVar.G, bnVar2.ja, kVar.R).f.start();
                                                }
                                            } else if (bz.o() != 0 && Math.abs(view2.getTranslationY()) < ek0Var4.getMeasuredHeight()) {
                                                bnVar = bnVar2;
                                                ValueAnimator valueAnimator = new l51(r1Var2, bnVar2, kVar.G, bnVar2.ja, kVar.R).d;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                                rj rjVar2 = bnVar.a0;
                                                runnable = rjVar2.g0;
                                                if (runnable != null) {
                                                    org.telegram.messenger.g0.r(runnable);
                                                    rjVar2.h0 = true;
                                                    rjVar2.g0.run();
                                                    rjVar2.g0 = null;
                                                    animate.translationY(0.0f).setDuration(250L).setInterpolator(kVar.o).setListener(new j0(kVar, f1Var, view2, animate)).start();
                                                    size4 = i16;
                                                    f12 = 1.0f;
                                                }
                                            }
                                            bnVar = bnVar2;
                                            rj rjVar22 = bnVar.a0;
                                            runnable = rjVar22.g0;
                                            if (runnable != null) {
                                            }
                                        }
                                        animate.translationY(0.0f).setDuration(250L).setInterpolator(kVar.o).setListener(new j0(kVar, f1Var, view2, animate)).start();
                                        size4 = i16;
                                        f12 = 1.0f;
                                    }
                                }
                                z20 = false;
                                rjVar.N0 = -1L;
                                if (z20) {
                                }
                                animate.translationY(0.0f).setDuration(250L).setInterpolator(kVar.o).setListener(new j0(kVar, f1Var, view2, animate)).start();
                                size4 = i16;
                                f12 = 1.0f;
                            }
                        }
                        i16 = size4;
                        animate.translationY(0.0f).setDuration(250L).setInterpolator(kVar.o).setListener(new j0(kVar, f1Var, view2, animate)).start();
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
                boolean z22 = (kVar.U == null || (qeVar2 = kVar.T) == null || !((Boolean) qeVar2.run()).booleanValue()) ? false : true;
                ArrayList arrayList12 = kVar.K;
                ArrayList arrayList13 = kVar.A;
                ArrayList arrayList14 = kVar.S;
                if (z22) {
                    i7 = 1;
                    LongSparseArray longSparseArray = null;
                    int i22 = 0;
                    while (i22 < arrayList4.size()) {
                        f1 f1Var2 = (f1) arrayList4.get(i22);
                        if (arrayList14.contains(f1Var2)) {
                            z18 = isEmpty10;
                            View view4 = f1Var2.a;
                            z19 = isEmpty11;
                            if (!(view4 instanceof r1) || ((r1) view4).getCurrentMessagesGroup() == null || (messageObject = ((r1) f1Var2.a).getMessageObject()) == null || messageObject.c1() == 0) {
                                ek0Var3 = ek0Var4;
                            } else {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                ek0Var3 = ek0Var4;
                                ArrayList arrayList15 = (ArrayList) longSparseArray.get(messageObject.c1());
                                if (arrayList15 == null) {
                                    long c12 = messageObject.c1();
                                    ArrayList arrayList16 = new ArrayList();
                                    longSparseArray.put(c12, arrayList16);
                                    arrayList15 = arrayList16;
                                }
                                arrayList14.remove(f1Var2);
                                arrayList4.remove(i22);
                                i22--;
                                arrayList15.add(f1Var2);
                            }
                        } else {
                            z18 = isEmpty10;
                            ek0Var3 = ek0Var4;
                            z19 = isEmpty11;
                        }
                        i22++;
                        isEmpty10 = z18;
                        isEmpty11 = z19;
                        ek0Var4 = ek0Var3;
                    }
                    z11 = isEmpty10;
                    ek0Var = ek0Var4;
                    z12 = isEmpty11;
                    i7 = i7;
                    if (longSparseArray != null) {
                        int i23 = 0;
                        z13 = false;
                        while (i23 < longSparseArray.size()) {
                            ArrayList arrayList17 = (ArrayList) longSparseArray.valueAt(i23);
                            if (arrayList17.size() > 0) {
                                View view5 = ((f1) arrayList17.get(0)).a;
                                if (!(view5 instanceof r1) || (currentMessagesGroup = ((r1) view5).getCurrentMessagesGroup()) == null || currentMessagesGroup.d.size() <= arrayList17.size()) {
                                    if (s2.a) {
                                        a8.b("animate remove group impl with thanos");
                                    }
                                    arrayList13.addAll(arrayList17);
                                    oz0 oz0Var = (oz0) kVar.U.run();
                                    for (int i24 = 0; i24 < arrayList17.size(); i24++) {
                                    }
                                    ArrayList arrayList18 = new ArrayList();
                                    i14 = i23;
                                    for (int i25 = 0; i25 < arrayList17.size(); i25++) {
                                        arrayList18.add(((f1) arrayList17.get(i25)).a);
                                    }
                                    es0 es0Var = new es0((Object) kVar, (Object) arrayList18, (Serializable) arrayList17, 22);
                                    mz0 mz0Var = oz0Var.a;
                                    if (mz0Var != null) {
                                        mz0Var.d(arrayList18, es0Var);
                                        Choreographer.getInstance().postFrameCallback(oz0Var.b);
                                    } else {
                                        oz0Var.c.add(new nz0(arrayList18, es0Var));
                                    }
                                    arrayList12.add((View) arrayList18.get(0));
                                    ek0Var.C0();
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
                            f1 f1Var3 = (f1) obj4;
                            boolean z24 = (arrayList14.remove(f1Var3) && z22) ? i7 : false;
                            if (s2.a) {
                                arrayList2 = arrayList4;
                                i12 = size;
                                a8.b("animate remove impl ".concat(z24 ? " with thanos" : ""));
                            } else {
                                arrayList2 = arrayList4;
                                i12 = size;
                            }
                            View view6 = f1Var3.a;
                            arrayList13.add(f1Var3);
                            if (!z24 || (qeVar = kVar.U) == null) {
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
                                ofFloat.addListener(new f(kVar, view6, f1Var3));
                                hashMap.put(f1Var3, ofFloat);
                                ofFloat.start();
                            } else {
                                oz0 oz0Var2 = (oz0) qeVar.run();
                                i13 = i26;
                                es0 es0Var2 = new es0(kVar, view6, f1Var3, 23);
                                mz0 mz0Var2 = oz0Var2.a;
                                if (mz0Var2 != null) {
                                    mz0Var2.b(1.0f, view6, es0Var2);
                                    Choreographer.getInstance().postFrameCallback(oz0Var2.b);
                                } else {
                                    oz0Var2.c.add(new nz0(view6, es0Var2));
                                }
                                arrayList12.add(view6);
                                arrayList3 = arrayList14;
                                z16 = z24;
                                z17 = isEmpty12;
                            }
                            ek0Var.C0();
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
                            v vVar = new v(kVar, arrayList19, z23, i7);
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
                            Collections.sort(arrayList21, new qw0(10));
                            int i27 = 0;
                            for (int size5 = arrayList21.size(); i27 < size5; size5 = i11) {
                                int i28 = i27 + 1;
                                f1 f1Var4 = (f1) arrayList21.get(i27);
                                if (s2.a) {
                                    a8.b("animate add impl");
                                }
                                View view9 = f1Var4.a;
                                arrayList8.add(f1Var4);
                                if (f1Var4 == kVar.O) {
                                    view9.setAlpha(1.0f);
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                if (view9 instanceof r1) {
                                    r1 r1Var3 = (r1) view9;
                                    if (r1Var3.getAnimationOffsetX() != 0.0f) {
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(r1Var3, r1Var3.ld, r1Var3.getAnimationOffsetX(), 0.0f));
                                    }
                                    r1Var3.setPivotX(((r1Var3.getBackgroundDrawableRight() - r1Var3.getBackgroundDrawableLeft()) / 2.0f) + r1Var3.getBackgroundDrawableLeft());
                                    f10 = 0.0f;
                                    view9.animate().translationY(0.0f).setDuration(kVar.c).start();
                                } else {
                                    f10 = 0.0f;
                                    view9.animate().translationX(0.0f).translationY(0.0f).setDuration(kVar.c).start();
                                }
                                long max = (long) ((1.0f - Math.max(f10, Math.min(1.0f, view9.getBottom() / ek0Var.getMeasuredHeight()))) * 100.0f);
                                if (!(view9 instanceof r1)) {
                                    arrayList = arrayList21;
                                    i11 = size5;
                                    ek0Var2 = ek0Var;
                                    f11 = 1.0f;
                                } else if (f1Var4 == kVar.O) {
                                    io ioVar = kVar.P;
                                    if (ioVar != null) {
                                        ioVar.h.setAlpha(0.0f);
                                    }
                                    ek0Var2 = ek0Var;
                                    ek0Var2.setClipChildren(false);
                                    final r1 r1Var4 = (r1) view9;
                                    View view10 = (View) kVar.P.getParent();
                                    float x10 = view10.getX() + kVar.P.getX() + kVar.P.h.getX();
                                    float y10 = view10.getY() + kVar.P.getY() + kVar.P.h.getY();
                                    float x11 = r1Var4.getX() + ek0Var2.getX() + r1Var4.getPhotoImage().L0;
                                    float y11 = r1Var4.getY() + ek0Var2.getY() + r1Var4.getPhotoImage().M0;
                                    final float width = kVar.P.h.getWidth();
                                    final float height = kVar.P.h.getHeight();
                                    final float f13 = r1Var4.getPhotoImage().N0;
                                    final float f14 = r1Var4.getPhotoImage().O0;
                                    final float f15 = x10 - x11;
                                    final float f16 = y10 - y11;
                                    final float f17 = r1Var4.getPhotoImage().L0;
                                    final float f18 = r1Var4.getPhotoImage().M0;
                                    r1Var4.getTransitionParams().g0 = true;
                                    r1Var4.getTransitionParams().K1 = true;
                                    r1Var4.getPhotoImage().y0(f17 + f15, f17 + f16, width, height);
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pi.d
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            r1 r1Var5 = r1.this;
                                            r1Var5.getTransitionParams().L1 = floatValue;
                                            if (r1Var5.getTransitionParams().L1 > 1.0f) {
                                                r1Var5.getTransitionParams().L1 = 1.0f;
                                            }
                                            float f19 = 1.0f - floatValue;
                                            r1Var5.getPhotoImage().y0((f15 * f19) + f17, (f16 * f19) + f18, (f13 * floatValue) + (width * f19), (f14 * floatValue) + (height * f19));
                                            r1Var5.invalidate();
                                        }
                                    });
                                    arrayList = arrayList21;
                                    i11 = size5;
                                    f11 = 1.0f;
                                    kVar = this;
                                    ofFloat2.addListener(new e(kVar, r1Var4, f17, f18, f13, f14));
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
                                    if (f1Var4 != kVar.O) {
                                        animatorSet.setDuration(350L);
                                        animatorSet.setInterpolator(new OvershootInterpolator());
                                    } else {
                                        animatorSet.setStartDelay(max);
                                        animatorSet.setDuration(250L);
                                    }
                                    animatorSet.addListener(new f(kVar, f1Var4, view9));
                                    hashMap.put(f1Var4, animatorSet);
                                    animatorSet.start();
                                    i27 = i28;
                                    ek0Var = ek0Var2;
                                    arrayList21 = arrayList;
                                } else {
                                    arrayList = arrayList21;
                                    i11 = size5;
                                    ek0Var2 = ek0Var;
                                    f11 = 1.0f;
                                    aj currentMessagesGroup2 = ((r1) view9).getCurrentMessagesGroup();
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
                                if (f1Var4 != kVar.O) {
                                }
                                animatorSet.addListener(new f(kVar, f1Var4, view9));
                                hashMap.put(f1Var4, animatorSet);
                                animatorSet.start();
                                i27 = i28;
                                ek0Var = ek0Var2;
                                arrayList21 = arrayList;
                            }
                            arrayList21.clear();
                        }
                    }
                } else {
                    z11 = isEmpty10;
                    ek0Var = ek0Var4;
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

    @Override // v4.k, v4.h1
    public final void p(f1 f1Var) {
        R(f1Var);
        View view = f1Var.a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof r1) {
            ((r1) view).getTransitionParams().i = true;
        }
        this.q.add(f1Var);
    }

    @Override // v4.k, v4.h1
    public final boolean q(f1 f1Var, f1 f1Var2, r0 r0Var, int i7, int i10, int i11, int i12) {
        if (f1Var == f1Var2) {
            return r(f1Var, r0Var, i7, i10, i11, i12);
        }
        View view = f1Var.a;
        float animationOffsetX = view instanceof r1 ? ((r1) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(f1Var);
        int i13 = (int) ((i11 - i7) - animationOffsetX);
        int i14 = (int) ((i12 - i10) - translationY);
        if (view instanceof r1) {
            ((r1) view).setAnimationOffsetX(animationOffsetX);
        } else {
            view.setTranslationX(animationOffsetX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = f1Var2.a;
        R(f1Var2);
        if (view2 instanceof r1) {
            ((r1) view2).setAnimationOffsetX(-i13);
        } else {
            view2.setTranslationX(-i13);
        }
        view2.setTranslationY(-i14);
        view2.setAlpha(0.0f);
        this.s.add(new v4.i(f1Var, f1Var2, i7, i10, i11, i12));
        F();
        return true;
    }

    @Override // v4.k, v4.h1
    public final boolean r(f1 f1Var, r0 r0Var, int i7, int i10, int i11, int i12) {
        int translationX;
        int i13;
        r1 r1Var;
        v0 v0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        View view;
        int i14;
        float f15;
        boolean z10;
        aj ajVar;
        int i15;
        boolean P3;
        View view2 = f1Var.a;
        if (view2 instanceof r1) {
            r1 r1Var2 = (r1) view2;
            translationX = i7 + ((int) r1Var2.getAnimationOffsetX());
            i13 = r1Var2.getTransitionParams().t2 != r1Var2.getTopMediaOffset() ? (r1Var2.getTransitionParams().t2 - r1Var2.getTopMediaOffset()) + i10 : i10;
            r1Var = r1Var2;
            v0Var = null;
        } else if (view2 instanceof v0) {
            translationX = i7 + ((int) view2.getTranslationX());
            i13 = i10;
            v0Var = (v0) view2;
            r1Var = null;
        } else {
            translationX = i7 + ((int) view2.getTranslationX());
            i13 = i10;
            r1Var = null;
            v0Var = null;
        }
        int i16 = translationX;
        int translationY = i13 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (r1Var != null) {
            float f16 = r1Var.getPhotoImage().L0;
            float f17 = r1Var.getPhotoImage().M0;
            float f18 = r1Var.getPhotoImage().N0;
            float f19 = r1Var.getPhotoImage().O0;
            f10 = 0.0f;
            int i17 = 0;
            for (int i18 = 4; i17 < i18; i18 = 4) {
                iArr[i17] = r1Var.getPhotoImage().X0[i17];
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
        R(f1Var);
        int i19 = i11 - i16;
        int i20 = i12 - translationY;
        if (i20 != 0) {
            view2.setTranslationY(-i20);
        }
        float f20 = f11;
        v0 v0Var2 = v0Var;
        j jVar = new j(f1Var, i16, translationY, i11, i12);
        if (r1Var != null) {
            y1 transitionParams = r1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.u0;
            Rect rect = transitionParams.E0;
            aj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
            if (i19 != 0) {
                r1Var.setAnimationOffsetX(-i19);
            }
            boolean z11 = r0Var instanceof i;
            ek0 ek0Var = this.G;
            if (z11) {
                ImageReceiver photoImage = r1Var.getPhotoImage();
                view = view2;
                i iVar = (i) r0Var;
                i14 = i19;
                boolean z12 = (!transitionParams.w0 || iVar.f == f10 || iVar.e == f10) ? false : true;
                jVar.n = z12;
                if (z12) {
                    ek0Var.setClipChildren(false);
                    ek0Var.invalidate();
                    transitionParams.g0 = true;
                    if (r1Var.getMessageObject().h4()) {
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
                            zi ziVar = currentMessagesGroup.m;
                            boolean z14 = ziVar.o;
                            if (z13 != z14) {
                                ziVar.n = z14 ? 1.0f : f10;
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
                        r1Var.w3(jVar.o, jVar.p, jVar.q, jVar.r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.w0 && (((P3 = r1Var.getMessageObject().P3()) && rect.left != r1Var.getBackgroundDrawableLeft()) || ((!P3 && rect.right != r1Var.getBackgroundDrawableRight()) || rect.top != r1Var.getBackgroundDrawableTop() || rect.bottom != r1Var.getBackgroundDrawableBottom()))) {
                    jVar.v = r1Var.getBackgroundDrawableBottom() - rect.bottom;
                    jVar.u = r1Var.getBackgroundDrawableTop() - rect.top;
                    if (r1Var.Y6 != transitionParams.F0) {
                        jVar.s = r1Var.getBackgroundDrawableLeft() - rect.left;
                        jVar.t = r1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (P3) {
                        jVar.s = r1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        jVar.t = r1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    jVar.l = true;
                    transitionParams.x0 = true;
                    transitionParams.h0 = -jVar.s;
                    transitionParams.i0 = -jVar.t;
                    transitionParams.k0 = -jVar.u;
                    transitionParams.j0 = -jVar.v;
                    ek0Var.setClipChildren(false);
                    ek0Var.invalidate();
                }
            } else {
                view = view2;
                i14 = i19;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    ek0 ek0Var2 = (ek0) view.getParent();
                    zi ziVar2 = currentMessagesGroup.m;
                    boolean z15 = true;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    while (i23 < ek0Var2.getChildCount()) {
                        View childAt = ek0Var2.getChildAt(i23);
                        if (childAt instanceof r1) {
                            r1 r1Var3 = (r1) childAt;
                            if (r1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !r1Var3.getMessageObject().Z) {
                                int backgroundDrawableLeft = r1Var3.getBackgroundDrawableLeft() + r1Var3.getLeft();
                                ajVar = currentMessagesGroup;
                                int backgroundDrawableRight = r1Var3.getBackgroundDrawableRight() + r1Var3.getLeft();
                                i15 = i23;
                                int backgroundDrawableTop = r1Var3.getBackgroundDrawableTop() + r1Var3.getPaddingTop() + r1Var3.getTop();
                                int backgroundDrawableBottom = r1Var3.getBackgroundDrawableBottom() + r1Var3.getPaddingTop() + r1Var3.getTop();
                                if (i26 == 0 || backgroundDrawableLeft < i26) {
                                    i26 = backgroundDrawableLeft;
                                }
                                if (i27 == 0 || backgroundDrawableRight > i27) {
                                    i27 = backgroundDrawableRight;
                                }
                                if (r1Var3.getTransitionParams().w0 || ziVar2.p) {
                                    if (i24 == 0 || backgroundDrawableTop < i24) {
                                        i24 = backgroundDrawableTop;
                                    }
                                    if (i25 == 0 || backgroundDrawableBottom > i25) {
                                        i25 = backgroundDrawableBottom;
                                    }
                                    z15 = false;
                                }
                                i23 = i15 + 1;
                                currentMessagesGroup = ajVar;
                            }
                        }
                        ajVar = currentMessagesGroup;
                        i15 = i23;
                        i23 = i15 + 1;
                        currentMessagesGroup = ajVar;
                    }
                    ziVar2.p = false;
                    if (i24 == 0 && i25 == 0 && i26 == 0 && i27 == 0) {
                        jVar.j = false;
                        ziVar2.j = false;
                    } else {
                        int i28 = (-i24) + ziVar2.b;
                        jVar.f = i28;
                        int i29 = (-i25) + ziVar2.d;
                        jVar.g = i29;
                        int i30 = (-i26) + ziVar2.a;
                        jVar.h = i30;
                        int i31 = (-i27) + ziVar2.c;
                        jVar.i = i31;
                        jVar.j = true;
                        ziVar2.j = true;
                        ziVar2.f = i28;
                        ziVar2.h = i29;
                        ziVar2.e = i30;
                        ziVar2.g = i31;
                        ziVar2.n = ziVar2.o ? 1.0f : f10;
                        ek0Var2.setClipChildren(false);
                        ek0Var2.invalidate();
                    }
                    ziVar2.i = z15;
                }
            }
            Integer valueOf = Integer.valueOf(r1Var.getMessageObject().e1());
            HashMap hashMap = this.H;
            aj ajVar2 = (aj) hashMap.get(valueOf);
            if (ajVar2 != null) {
                zi ziVar3 = ajVar2.m;
                hashMap.remove(Integer.valueOf(r1Var.getMessageObject().e1()));
                if (transitionParams.w0) {
                    int backgroundDrawableLeft2 = r1Var.getBackgroundDrawableLeft() + r1Var.getLeft();
                    int backgroundDrawableRight2 = r1Var.getBackgroundDrawableRight() + r1Var.getLeft();
                    int backgroundDrawableTop2 = r1Var.getBackgroundDrawableTop() + r1Var.getPaddingTop() + r1Var.getTop();
                    int backgroundDrawableBottom2 = r1Var.getBackgroundDrawableBottom() + r1Var.getPaddingTop() + r1Var.getTop();
                    jVar.w = true;
                    transitionParams.x0 = true;
                    jVar.s = backgroundDrawableLeft2 - ziVar3.a;
                    jVar.t = backgroundDrawableRight2 - ziVar3.c;
                    jVar.u = backgroundDrawableTop2 - ziVar3.b;
                    jVar.v = backgroundDrawableBottom2 - ziVar3.d;
                    jVar.l = false;
                    transitionParams.h0 = (int) ((-r6) - r1Var.getAnimationOffsetX());
                    transitionParams.i0 = (int) ((-jVar.t) - r1Var.getAnimationOffsetX());
                    transitionParams.k0 = (int) ((-jVar.u) - r1Var.getTranslationY());
                    transitionParams.j0 = (int) ((-jVar.v) - r1Var.getTranslationY());
                    transitionParams.D0 = true;
                    ek0Var.setClipChildren(false);
                    ek0Var.invalidate();
                } else {
                    ziVar3.i = true;
                }
            }
            xi xiVar = r1Var.M;
            if (transitionParams.z0 != (r1Var.C6 || r1Var.K || (xiVar != null && (xiVar.l & 8) == 0 && r1Var.L.i))) {
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
                v(f1Var);
                return false;
            }
        } else if (v0Var2 != null) {
            u0 transitionParams2 = v0Var2.getTransitionParams();
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
                v(f1Var);
                return false;
            }
        } else if (view2 instanceof g0) {
            ((g0) view2).setAnimating(true);
        } else if (view2 instanceof ta) {
            ((ta) view2).setAnimating(true);
        } else {
            if (i19 == 0 && i20 == 0) {
                v(f1Var);
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

    @Override // v4.k, v4.h1
    public final void s(f1 f1Var, r0 r0Var) {
        if (s2.a) {
            a8.b("animate remove");
        }
        super.s(f1Var, r0Var);
        View view = f1Var.a;
        if (r0Var != null) {
            int i7 = r0Var.b;
            int top = view.getTop();
            int left = view.getLeft() - r0Var.a;
            if (top - i7 != 0) {
                view.setTranslationY(-r1);
            }
            if (!(view instanceof r1)) {
                if (left != 0) {
                    view.setTranslationX(-left);
                    return;
                }
                return;
            }
            r1 r1Var = (r1) view;
            if (left != 0) {
                r1Var.setAnimationOffsetX(-left);
            }
            if (r0Var instanceof i) {
                i iVar = (i) r0Var;
                r1Var.w3(iVar.c, iVar.d, iVar.e, iVar.f);
            }
        }
    }
}
