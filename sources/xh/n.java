package xh;

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
import eg.q;
import f2.j1;
import f2.m1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import oh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.z01;
import org.telegram.ui.du;
import org.telegram.ui.fi1;
import org.telegram.ui.jk;
import org.telegram.ui.ra1;
import org.telegram.ui.ug;
import org.telegram.ui.xn;
import org.telegram.ui.zy;
import r0.j0;
import uf.h1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public abstract class n extends f2.l {
    public static final pr V = new pr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final xn F;
    public final tl0 G;
    public boolean N;
    public m1 O;
    public ho P;
    public boolean Q;
    public final g6 R;
    public ug T;
    public ug U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public n(xn xnVar, tl0 tl0Var, g6 g6Var) {
        this.R = g6Var;
        this.F = xnVar;
        this.G = tl0Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override // f2.l
    public final void B(f2.j jVar) {
        f2.j jVar2;
        m1 m1Var = jVar.a;
        View view = m1Var == null ? null : m1Var.a;
        m1 m1Var2 = jVar.b;
        View view2 = m1Var2 != null ? m1Var2.a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(jVar.a);
            duration.translationX(jVar.e - jVar.c);
            duration.translationY(jVar.f - jVar.d);
            jVar2 = jVar;
            duration.alpha(0.0f).setListener(new k(this, jVar2, duration, view, 0)).start();
        } else {
            jVar2 = jVar;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(jVar2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new k(this, jVar2, animate, view2, 1)).start();
        }
    }

    @Override // f2.l
    public final void C(m1 m1Var, f2.k kVar) {
        T(m1Var, kVar, false);
    }

    @Override // f2.l
    public final boolean J(f2.j jVar, m1 m1Var) {
        b11 b11Var;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(m1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = m1Var.a;
        if (this.K.contains(view) && (b11Var = (b11) this.U.run()) != null) {
            b11Var.a(view);
        }
        if (jVar.b == m1Var) {
            jVar.b = null;
        } else {
            if (jVar.a != m1Var) {
                return false;
            }
            jVar.a = null;
        }
        X(view);
        d(m1Var);
        return true;
    }

    @Override // f2.l
    public final long L() {
        return 0L;
    }

    @Override // f2.l
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
    /* JADX WARN: Removed duplicated region for block: B:11:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(final m1 m1Var, f2.k kVar, boolean z4) {
        m1 m1Var2;
        s1 s1Var;
        t1 t1Var;
        int i10;
        float f10;
        boolean z10;
        final m mVar;
        final t1 t1Var2;
        s1 s1Var2;
        final int i11;
        final s1 s1Var3;
        float f11;
        final boolean z11;
        int[] iArr;
        int i12 = kVar.c;
        int i13 = kVar.e;
        View view = m1Var.a;
        int i14 = i13 - i12;
        AnimatorSet animatorSet = new AnimatorSet();
        int i15 = 0;
        final int i16 = 1;
        if (i14 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.z.add(m1Var);
        final m mVar2 = (m) kVar;
        xn xnVar = this.F;
        if (xnVar != null && (view instanceof h0)) {
            h0 h0Var = (h0) view;
            float translationY = h0Var.getTranslationY();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new h(this, h0Var, translationY, i15));
            animatorSet.playTogether(ofFloat);
        } else {
            if (xnVar == null || !(view instanceof xa)) {
                if (view instanceof t1) {
                    final t1 t1Var3 = (t1) view;
                    final s1 transitionParams = t1Var3.getTransitionParams();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(t1Var3, t1Var3.xe, 0.0f));
                    if (mVar2.n) {
                        t1Var3.U3(mVar2.o, mVar2.p, mVar2.q, mVar2.r);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        float f12 = t1Var3.getCurrentMessagesGroup() == null ? transitionParams.u0 : t1Var3.getCurrentMessagesGroup().transitionParams.captionEnterProgress;
                        final float P2 = t1Var3.getCurrentMessagesGroup() == null ? t1Var3.P2() : t1Var3.getCurrentMessagesGroup().hasCaption;
                        if (f12 != P2) {
                            f11 = f12;
                            z11 = true;
                        } else {
                            f11 = f12;
                            z11 = false;
                        }
                        if (transitionParams.B0) {
                            iArr = new int[4];
                            for (int i17 = 0; i17 < 4; i17++) {
                                iArr[i17] = t1Var3.getPhotoImage().getRoundRadius()[i17];
                            }
                        } else {
                            iArr = null;
                        }
                        final float f13 = f11;
                        final int[] iArr2 = iArr;
                        i10 = 2;
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: xh.a
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                m mVar3 = m.this;
                                float f14 = 1.0f - floatValue;
                                float f15 = mVar3.o * f14;
                                s1 s1Var4 = transitionParams;
                                float f16 = (s1Var4.m0 * floatValue) + f15;
                                float f17 = (s1Var4.n0 * floatValue) + (mVar3.p * f14);
                                float f18 = (s1Var4.o0 * floatValue) + (mVar3.q * f14);
                                float f19 = (s1Var4.p0 * floatValue) + (mVar3.r * f14);
                                boolean z12 = z11;
                                t1 t1Var4 = t1Var3;
                                if (z12) {
                                    float f20 = (P2 * floatValue) + (f13 * f14);
                                    s1Var4.u0 = f20;
                                    if (t1Var4.getCurrentMessagesGroup() != null) {
                                        t1Var4.getCurrentMessagesGroup().transitionParams.captionEnterProgress = f20;
                                    }
                                }
                                if (s1Var4.B0) {
                                    ImageReceiver photoImage = t1Var4.getPhotoImage();
                                    int[] iArr3 = iArr2;
                                    int[] iArr4 = s1Var4.A0;
                                    photoImage.setRoundRadius((int) ((iArr4[0] * floatValue) + (iArr3[0] * f14)), (int) ((iArr4[1] * floatValue) + (iArr3[1] * f14)), (int) ((iArr4[2] * floatValue) + (iArr3[2] * f14)), (int) ((iArr4[3] * floatValue) + (iArr3[3] * f14)));
                                }
                                t1Var4.U3(f16, f17, f18, f19);
                                m1Var.a.invalidate();
                            }
                        };
                        s1Var = transitionParams;
                        t1Var = t1Var3;
                        m1Var2 = m1Var;
                        ofFloat2.addUpdateListener(animatorUpdateListener);
                        animatorSet.playTogether(ofFloat2);
                    } else {
                        s1Var = transitionParams;
                        t1Var = t1Var3;
                        m1Var2 = m1Var;
                        i10 = 2;
                    }
                    if (mVar2.v == 0 && mVar2.t == 0 && mVar2.u == 0 && mVar2.s == 0) {
                        f10 = 0.0f;
                        s1Var.k0 = 0.0f;
                        s1Var.l0 = 0.0f;
                        z10 = false;
                    } else {
                        f10 = 0.0f;
                        tl0 tl0Var = this.G;
                        tl0Var.setClipChildren(false);
                        tl0Var.invalidate();
                        float[] fArr = new float[i10];
                        // fill-array-data instruction
                        fArr[0] = 1.0f;
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr);
                        if (mVar2.l) {
                            s1Var.k0 = -mVar2.s;
                            s1Var.l0 = -mVar2.t;
                        } else {
                            s1Var.k0 = (-mVar2.s) - t1Var.getAnimationOffsetX();
                            s1Var.l0 = (-mVar2.t) - t1Var.getAnimationOffsetX();
                        }
                        ofFloat3.addUpdateListener(new q(mVar2, s1Var, t1Var, 4));
                        z10 = false;
                        animatorSet.playTogether(ofFloat3);
                    }
                    MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        mVar2.j = z10;
                    }
                    if (mVar2.j) {
                        float[] fArr2 = new float[i10];
                        // fill-array-data instruction
                        fArr2[0] = 1.0f;
                        fArr2[1] = 0.0f;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr2);
                        s1 s1Var4 = s1Var;
                        final MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                        final tl0 tl0Var2 = (tl0) view.getParent();
                        final float f14 = currentMessagesGroup.transitionParams.captionEnterProgress;
                        if (currentMessagesGroup.hasCaption) {
                            f10 = 1.0f;
                        }
                        final boolean z12 = f14 != f10;
                        s1Var2 = s1Var4;
                        final float f15 = f10;
                        mVar = mVar2;
                        t1Var2 = t1Var;
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xh.b
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                m mVar3 = mVar;
                                MessageObject.GroupedMessages.TransitionParams transitionParams3 = MessageObject.GroupedMessages.TransitionParams.this;
                                transitionParams3.offsetTop = mVar3.f * floatValue;
                                transitionParams3.offsetBottom = mVar3.g * floatValue;
                                transitionParams3.offsetLeft = mVar3.h * floatValue;
                                transitionParams3.offsetRight = mVar3.i * floatValue;
                                if (z12) {
                                    transitionParams3.captionEnterProgress = e2.c.w(1.0f, floatValue, f15, f14 * floatValue);
                                }
                                tl0 tl0Var3 = tl0Var2;
                                if (tl0Var3 != null) {
                                    tl0Var3.invalidate();
                                }
                            }
                        });
                        ofFloat4.addListener(new i(transitionParams2));
                        i11 = 0;
                        animatorSet.playTogether(ofFloat4);
                    } else {
                        mVar = mVar2;
                        t1Var2 = t1Var;
                        s1Var2 = s1Var;
                        i11 = 0;
                    }
                    if (mVar.k) {
                        float[] fArr3 = new float[i10];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(fArr3);
                        s1Var3 = s1Var2;
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xh.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i11) {
                                    case 0:
                                        s1Var3.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        t1Var2.invalidate();
                                        break;
                                    default:
                                        s1Var3.K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        t1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[i11] = ofFloat5;
                        animatorSet.playTogether(animatorArr);
                    } else {
                        s1Var3 = s1Var2;
                    }
                    if (mVar.m) {
                        float[] fArr4 = new float[i10];
                        // fill-array-data instruction
                        fArr4[0] = 0.0f;
                        fArr4[1] = 1.0f;
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(fArr4);
                        s1Var3.g = true;
                        ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xh.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i16) {
                                    case 0:
                                        s1Var3.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        t1Var2.invalidate();
                                        break;
                                    default:
                                        s1Var3.K1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        t1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        animatorSet.playTogether(ofFloat6);
                    }
                } else {
                    m1Var2 = m1Var;
                    if (view instanceof v0) {
                        v0 v0Var = (v0) view;
                        u0 transitionParams3 = v0Var.getTransitionParams();
                        if (mVar2.m) {
                            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            transitionParams3.b = true;
                            ofFloat7.addUpdateListener(new d(0, transitionParams3, v0Var));
                            animatorSet.playTogether(ofFloat7);
                        }
                    }
                }
                if (z4) {
                    Interpolator interpolator = this.o;
                    if (interpolator != null) {
                        animatorSet.setInterpolator(interpolator);
                    }
                } else {
                    animatorSet.setInterpolator(pr.g);
                }
                animatorSet.setDuration((long) (250 * (z4 ? 1.9f : 1.0f)));
                animatorSet.addListener(new j(this, m1Var2, i14, view));
                animatorSet.start();
                this.J.put(m1Var2, animatorSet);
            }
            xa xaVar = (xa) view;
            float translationY2 = xaVar.getTranslationY();
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat8.addUpdateListener(new h(this, xaVar, translationY2, i16));
            animatorSet.playTogether(ofFloat8);
        }
        m1Var2 = m1Var;
        if (z4) {
        }
        animatorSet.setDuration((long) (250 * (z4 ? 1.9f : 1.0f)));
        animatorSet.addListener(new j(this, m1Var2, i14, view));
        animatorSet.start();
        this.J.put(m1Var2, animatorSet);
    }

    public final void U() {
        b11 b11Var;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (this.K.isEmpty() || (b11Var = (b11) this.U.run()) == null) {
            return;
        }
        ArrayList arrayList2 = b11Var.c;
        if (b11Var.e) {
            return;
        }
        b11Var.e = true;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            a11 a11Var = (a11) obj2;
            Runnable runnable = a11Var.d;
            if (runnable != null) {
                b11.b(runnable);
                a11Var.d = null;
            }
        }
        arrayList2.clear();
        z01 z01Var = b11Var.a;
        if (z01Var != null) {
            z01Var.i();
        }
        Runnable runnable2 = b11Var.d;
        if (runnable2 != null) {
            b11Var.d = null;
            b11.b(runnable2);
        }
    }

    public final void V(MessageObject.GroupedMessages groupedMessages) {
        if (groupedMessages == null) {
            return;
        }
        if (groupedMessages.messages.size() == 0) {
            groupedMessages.transitionParams.drawBackgroundForDeletedItems = true;
            return;
        }
        MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
        if (transitionParams.top == 0 && transitionParams.bottom == 0 && transitionParams.left == 0 && transitionParams.right == 0) {
            tl0 tl0Var = this.G;
            int childCount = tl0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = tl0Var.getChildAt(i10);
                if (childAt instanceof t1) {
                    t1 t1Var = (t1) childAt;
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (t1Var.getTransitionParams().v0 && groupedMessages.messages.contains(messageObject)) {
                        groupedMessages.transitionParams.top = t1Var.getBackgroundDrawableTop() + t1Var.getPaddingTop() + t1Var.getTop();
                        groupedMessages.transitionParams.bottom = t1Var.getBackgroundDrawableBottom() + t1Var.getPaddingTop() + t1Var.getTop();
                        groupedMessages.transitionParams.left = t1Var.getBackgroundDrawableLeft() + t1Var.getLeft();
                        groupedMessages.transitionParams.right = t1Var.getBackgroundDrawableRight() + t1Var.getLeft();
                        groupedMessages.transitionParams.drawCaptionLayout = t1Var.P2();
                        groupedMessages.transitionParams.pinnedTop = t1Var.n3();
                        groupedMessages.transitionParams.pinnedBotton = t1Var.m3();
                        groupedMessages.transitionParams.isNewGroup = true;
                        break;
                    }
                }
                i10++;
            }
        }
        this.I.add(groupedMessages);
    }

    public abstract void W();

    public final void X(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z4 = view instanceof h0;
        tl0 tl0Var = this.G;
        if (z4) {
            int measuredHeight = (tl0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((h0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof xa) {
            int measuredHeight2 = (tl0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((xa) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof t1) {
            t1 t1Var = (t1) view;
            t1Var.getTransitionParams().j();
            t1Var.setAnimationOffsetX(0.0f);
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

    public final void Y(ug ugVar, ug ugVar2) {
        this.T = ugVar;
        this.U = ugVar2;
    }

    public final boolean Z(View view) {
        m1 T;
        if (this.N || (T = this.G.T(view)) == null) {
            return false;
        }
        return this.q.contains(T) || this.y.contains(T);
    }

    @Override // f2.p1, f2.u0
    public final boolean a(m1 m1Var, c5.e eVar, c5.e eVar2) {
        ArrayList arrayList;
        int i10;
        boolean a2 = super.a(m1Var, eVar, eVar2);
        if (a2 && this.N) {
            int i11 = 0;
            boolean z4 = false;
            while (true) {
                arrayList = this.q;
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((m1) arrayList.get(i11)).c() == 0) {
                    z4 = true;
                }
                i11++;
            }
            if (z4) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    i10 += ((m1) arrayList.get(i12)).a.getHeight();
                }
            } else {
                i10 = 0;
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((m1) arrayList.get(i13)).a.setTranslationY(i10);
            }
        }
        return a2;
    }

    public final boolean a0(View view) {
        m1 T = this.G.T(view);
        if (T != null) {
            return this.p.contains(T) || this.A.contains(T);
        }
        return false;
    }

    @Override // f2.l, f2.u0
    public final void f(m1 m1Var) {
        b11 b11Var;
        Animator animator = (Animator) this.J.remove(m1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = m1Var.a;
        if (this.K.contains(view) && (b11Var = (b11) this.U.run()) != null) {
            b11Var.a(view);
        }
        super.f(m1Var);
        X(view);
    }

    @Override // f2.l, f2.u0
    public void g() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((MessageObject.GroupedMessages) obj).transitionParams.isNewGroup = false;
        }
        arrayList.clear();
        U();
        ho hoVar = this.P;
        if (hoVar != null) {
            hoVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.k kVar = (f2.k) arrayList2.get(size2);
            X(kVar.a.a);
            v(kVar.a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            m1 m1Var = (m1) arrayList3.get(size3);
            X(m1Var.a);
            d(m1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            m1 m1Var2 = (m1) arrayList4.get(size4);
            X(m1Var2.a);
            u(m1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((f2.j) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (k()) {
            ArrayList arrayList6 = this.u;
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
                for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                    f2.k kVar2 = (f2.k) arrayList7.get(size7);
                    X(kVar2.a.a);
                    v(kVar2.a);
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
                    m1 m1Var3 = (m1) arrayList9.get(size9);
                    X(m1Var3.a);
                    u(m1Var3);
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
                    I((f2.j) arrayList11.get(size11));
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

    @Override // f2.u0
    public final long i() {
        return 250L;
    }

    @Override // f2.u0
    public final long j() {
        return 250L;
    }

    @Override // f2.u0
    public final c5.e l(j1 j1Var, m1 m1Var, int i10, List list) {
        c5.e l10 = super.l(j1Var, m1Var, i10, list);
        View view = m1Var.a;
        if (!(view instanceof t1)) {
            return l10;
        }
        l lVar = new l();
        lVar.a = l10.a;
        lVar.b = l10.b;
        s1 transitionParams = ((t1) view).getTransitionParams();
        lVar.c = transitionParams.a;
        lVar.d = transitionParams.b;
        lVar.e = transitionParams.c;
        lVar.f = transitionParams.d;
        return lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0483 A[EDGE_INSN: B:226:0x0483->B:227:0x0483 BREAK  A[LOOP:9: B:194:0x03cb->B:219:0x03cb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0200  */
    @Override // f2.l, f2.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z4;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        boolean z12;
        boolean z13;
        int size;
        int i10;
        HashMap hashMap;
        float f10;
        int i11;
        boolean z14;
        ArrayList arrayList2;
        int i12;
        int i13;
        boolean z15;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ug ugVar;
        int i14;
        MessageObject.GroupedMessages currentMessagesGroup;
        boolean z16;
        boolean z17;
        ArrayList arrayList5;
        boolean z18;
        MessageObject messageObject;
        ug ugVar2;
        int i15;
        int i16;
        boolean z19;
        xn xnVar;
        Runnable runnable;
        cf cfVar;
        int i17;
        ArrayList arrayList6 = this.p;
        boolean isEmpty = arrayList6.isEmpty();
        ArrayList arrayList7 = this.r;
        boolean isEmpty2 = arrayList7.isEmpty();
        ArrayList arrayList8 = this.s;
        boolean isEmpty3 = arrayList8.isEmpty();
        ArrayList arrayList9 = this.q;
        boolean isEmpty4 = arrayList9.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        boolean z20 = this.N;
        tl0 tl0Var = this.G;
        if (z20) {
            z4 = false;
            while (i17 < arrayList9.size()) {
                if (this.Q) {
                    i17 = ((m1) arrayList9.get(i17)).c() != (tl0Var.getAdapter() == null ? 0 : tl0Var.getAdapter().h()) - 1 ? i17 + 1 : 0;
                    z4 = true;
                } else {
                    if (((m1) arrayList9.get(i17)).c() != 0) {
                    }
                    z4 = true;
                }
            }
        } else {
            z4 = false;
        }
        W();
        ArrayList arrayList10 = this.y;
        float f11 = 1.0f;
        if (z4) {
            boolean isEmpty5 = arrayList6.isEmpty();
            boolean isEmpty6 = arrayList7.isEmpty();
            boolean isEmpty7 = arrayList8.isEmpty();
            boolean isEmpty8 = arrayList9.isEmpty();
            if (!isEmpty5 || !isEmpty6 || !isEmpty8 || !isEmpty7) {
                int i18 = 0;
                while (i15 < arrayList9.size()) {
                    View view = ((m1) arrayList9.get(i15)).a;
                    if (view instanceof t1) {
                        t1 t1Var = (t1) view;
                        i15 = (t1Var.getCurrentPosition() != null && (t1Var.getCurrentPosition().flags & 1) == 0) ? i15 + 1 : 0;
                    }
                    i18 += ((m1) arrayList9.get(i15)).a.getHeight();
                }
                int size2 = arrayList6.size();
                int i19 = 0;
                while (i19 < size2) {
                    Object obj = arrayList6.get(i19);
                    i19++;
                    D((m1) obj);
                }
                arrayList6.clear();
                if (!isEmpty6) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.addAll(arrayList7);
                    arrayList7.clear();
                    int size3 = arrayList11.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj2 = arrayList11.get(i20);
                        i20++;
                        f2.k kVar = (f2.k) obj2;
                        T(kVar.a, kVar, false);
                    }
                    arrayList11.clear();
                }
                if (!isEmpty8) {
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.addAll(arrayList9);
                    arrayList9.clear();
                    int size4 = arrayList12.size();
                    int i21 = 0;
                    while (i21 < size4) {
                        int i22 = i21 + 1;
                        m1 m1Var = (m1) arrayList12.get(i21);
                        View view2 = m1Var.a;
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList10.add(m1Var);
                        view2.setTranslationY(i18);
                        View view3 = m1Var.a;
                        view3.setScaleX(f11);
                        view3.setScaleY(f11);
                        t1 t1Var2 = view3 instanceof t1 ? (t1) view3 : null;
                        if (t1Var2 == null || !t1Var2.getTransitionParams().x0) {
                            view3.setAlpha(f11);
                        }
                        xn xnVar2 = this.F;
                        if (xnVar2 != null) {
                            ArrayList arrayList13 = xnVar2.r4;
                            if (t1Var2 != null && arrayList13.contains(t1Var2.getMessageObject())) {
                                arrayList13.remove(t1Var2.getMessageObject());
                                jk jkVar = xnVar2.V;
                                if (jkVar.c0 == null || !((cfVar = jkVar.I0) == null || cfVar.n0)) {
                                    i16 = size4;
                                } else {
                                    i16 = size4;
                                    if (System.currentTimeMillis() - jkVar.J0 > 300) {
                                        z19 = true;
                                        jkVar.J0 = -1L;
                                        if (z19) {
                                            if (t1Var2.getMessageObject().isVoice()) {
                                                if (Math.abs(view2.getTranslationY()) < view2.getMeasuredHeight() * 3.0f) {
                                                    new fi1(t1Var2, xnVar2.V, this.G, xnVar2.J9, this.R).f.start();
                                                }
                                            } else if (SharedConfig.getDevicePerformanceClass() != 0 && Math.abs(view2.getTranslationY()) < tl0Var.getMeasuredHeight()) {
                                                xnVar = xnVar2;
                                                ValueAnimator valueAnimator = new ra1(t1Var2, xnVar2, this.G, xnVar2.J9, this.R).d;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                                jk jkVar2 = xnVar.V;
                                                runnable = jkVar2.c0;
                                                if (runnable != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                                    jkVar2.d0 = true;
                                                    jkVar2.c0.run();
                                                    jkVar2.c0 = null;
                                                    animate.translationY(0.0f).setDuration(250L).setInterpolator(this.o).setListener(new xs((f2.l) this, m1Var, (Object) view2, (Object) animate, 5)).start();
                                                    i18 = i18;
                                                    i21 = i22;
                                                    size4 = i16;
                                                    f11 = 1.0f;
                                                }
                                            }
                                            xnVar = xnVar2;
                                            jk jkVar22 = xnVar.V;
                                            runnable = jkVar22.c0;
                                            if (runnable != null) {
                                            }
                                        }
                                        animate.translationY(0.0f).setDuration(250L).setInterpolator(this.o).setListener(new xs((f2.l) this, m1Var, (Object) view2, (Object) animate, 5)).start();
                                        i18 = i18;
                                        i21 = i22;
                                        size4 = i16;
                                        f11 = 1.0f;
                                    }
                                }
                                z19 = false;
                                jkVar.J0 = -1L;
                                if (z19) {
                                }
                                animate.translationY(0.0f).setDuration(250L).setInterpolator(this.o).setListener(new xs((f2.l) this, m1Var, (Object) view2, (Object) animate, 5)).start();
                                i18 = i18;
                                i21 = i22;
                                size4 = i16;
                                f11 = 1.0f;
                            }
                        }
                        i16 = size4;
                        animate.translationY(0.0f).setDuration(250L).setInterpolator(this.o).setListener(new xs((f2.l) this, m1Var, (Object) view2, (Object) animate, 5)).start();
                        i18 = i18;
                        i21 = i22;
                        size4 = i16;
                        f11 = 1.0f;
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
                boolean z21 = (this.U == null || (ugVar2 = this.T) == null || !((Boolean) ugVar2.run()).booleanValue()) ? false : true;
                ArrayList arrayList14 = this.K;
                ArrayList arrayList15 = this.A;
                char c3 = 1;
                ArrayList arrayList16 = this.S;
                if (z21) {
                    LongSparseArray longSparseArray = null;
                    int i23 = 0;
                    while (i23 < arrayList6.size()) {
                        m1 m1Var2 = (m1) arrayList6.get(i23);
                        if (arrayList16.contains(m1Var2)) {
                            z16 = isEmpty10;
                            View view4 = m1Var2.a;
                            z17 = isEmpty11;
                            if ((view4 instanceof t1) && ((t1) view4).getCurrentMessagesGroup() != null && (messageObject = ((t1) m1Var2.a).getMessageObject()) != null && messageObject.getGroupId() != 0) {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                arrayList5 = arrayList10;
                                z18 = z21;
                                ArrayList arrayList17 = (ArrayList) longSparseArray.get(messageObject.getGroupId());
                                if (arrayList17 == null) {
                                    long groupId = messageObject.getGroupId();
                                    ArrayList arrayList18 = new ArrayList();
                                    longSparseArray.put(groupId, arrayList18);
                                    arrayList17 = arrayList18;
                                }
                                arrayList16.remove(m1Var2);
                                arrayList6.remove(i23);
                                i23--;
                                arrayList17.add(m1Var2);
                                i23++;
                                z21 = z18;
                                isEmpty10 = z16;
                                isEmpty11 = z17;
                                arrayList10 = arrayList5;
                            }
                        } else {
                            z16 = isEmpty10;
                            z17 = isEmpty11;
                        }
                        arrayList5 = arrayList10;
                        z18 = z21;
                        i23++;
                        z21 = z18;
                        isEmpty10 = z16;
                        isEmpty11 = z17;
                        arrayList10 = arrayList5;
                    }
                    z10 = isEmpty10;
                    z11 = isEmpty11;
                    arrayList = arrayList10;
                    z12 = z21;
                    if (longSparseArray != null) {
                        int i24 = 0;
                        z13 = false;
                        while (i24 < longSparseArray.size()) {
                            ArrayList arrayList19 = (ArrayList) longSparseArray.valueAt(i24);
                            if (arrayList19.size() > 0) {
                                View view5 = ((m1) arrayList19.get(0)).a;
                                if (!(view5 instanceof t1) || (currentMessagesGroup = ((t1) view5).getCurrentMessagesGroup()) == null || currentMessagesGroup.messages.size() <= arrayList19.size()) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("animate remove group impl with thanos");
                                    }
                                    arrayList15.addAll(arrayList19);
                                    b11 b11Var = (b11) this.U.run();
                                    for (int i25 = 0; i25 < arrayList19.size(); i25++) {
                                    }
                                    ArrayList arrayList20 = new ArrayList();
                                    i14 = i24;
                                    for (int i26 = 0; i26 < arrayList19.size(); i26++) {
                                        arrayList20.add(((m1) arrayList19.get(i26)).a);
                                    }
                                    h1 h1Var = new h1(this, arrayList20, arrayList19, 14);
                                    z01 z01Var = b11Var.a;
                                    if (z01Var != null) {
                                        z01Var.f(arrayList20, h1Var);
                                        Choreographer.getInstance().postFrameCallback(b11Var.b);
                                    } else {
                                        b11Var.c.add(new a11(arrayList20, h1Var));
                                    }
                                    arrayList14.add((View) arrayList20.get(0));
                                    tl0Var.B0();
                                    z13 = true;
                                    i24 = i14 + 1;
                                } else {
                                    arrayList6.addAll(arrayList19);
                                }
                            }
                            i14 = i24;
                            i24 = i14 + 1;
                        }
                        size = arrayList6.size();
                        boolean z22 = z13;
                        i10 = 0;
                        while (true) {
                            hashMap = this.J;
                            if (i10 < size) {
                                break;
                            }
                            Object obj3 = arrayList6.get(i10);
                            int i27 = i10 + 1;
                            m1 m1Var3 = (m1) obj3;
                            boolean z23 = arrayList16.remove(m1Var3) && z12;
                            if (BuildVars.LOGS_ENABLED) {
                                arrayList2 = arrayList6;
                                i12 = size;
                                FileLog.d("animate remove impl ".concat(z23 ? " with thanos" : ""));
                            } else {
                                arrayList2 = arrayList6;
                                i12 = size;
                            }
                            View view6 = m1Var3.a;
                            arrayList15.add(m1Var3);
                            if (!z23 || (ugVar = this.U) == null) {
                                i13 = i27;
                                z15 = z12;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view6, (Property<View, Float>) View.ALPHA, view6.getAlpha(), 0.0f);
                                arrayList3 = arrayList15;
                                arrayList4 = arrayList16;
                                ofFloat.setDuration(this.d);
                                ofFloat.addListener(new g(this, view6, m1Var3));
                                hashMap.put(m1Var3, ofFloat);
                                ofFloat.start();
                            } else {
                                b11 b11Var2 = (b11) ugVar.run();
                                i13 = i27;
                                h1 h1Var2 = new h1(this, view6, m1Var3, 15);
                                z01 z01Var2 = b11Var2.a;
                                if (z01Var2 != null) {
                                    z01Var2.e(view6, 1.0f, h1Var2);
                                    Choreographer.getInstance().postFrameCallback(b11Var2.b);
                                } else {
                                    b11Var2.c.add(new a11(view6, h1Var2));
                                }
                                arrayList14.add(view6);
                                z15 = z12;
                                arrayList3 = arrayList15;
                                arrayList4 = arrayList16;
                            }
                            tl0Var.B0();
                            arrayList15 = arrayList3;
                            arrayList16 = arrayList4;
                            size = i12;
                            arrayList6 = arrayList2;
                            i10 = i13;
                            z12 = z15;
                            if (z23) {
                                z22 = true;
                            }
                        }
                        arrayList6.clear();
                        if (!z10) {
                            ArrayList arrayList21 = new ArrayList();
                            arrayList21.addAll(arrayList7);
                            this.u.add(arrayList21);
                            arrayList7.clear();
                            kc.k kVar2 = new kc.k(this, arrayList21, z22, 2);
                            if (!this.C || isEmpty9) {
                                kVar2.run();
                            } else {
                                View view7 = ((f2.k) arrayList21.get(0)).a.a;
                                WeakHashMap weakHashMap = j0.a;
                                view7.postOnAnimationDelayed(kVar2, 0L);
                            }
                        }
                        if (!z11) {
                            ArrayList arrayList22 = new ArrayList();
                            arrayList22.addAll(arrayList8);
                            this.v.add(arrayList22);
                            arrayList8.clear();
                            zy zyVar = new zy(13, this, arrayList22);
                            if (!this.C || isEmpty9) {
                                zyVar.run();
                            } else {
                                View view8 = ((f2.j) arrayList22.get(0)).a.a;
                                WeakHashMap weakHashMap2 = j0.a;
                                view8.postOnAnimationDelayed(zyVar, 0L);
                            }
                        }
                        if (!isEmpty12) {
                            ArrayList arrayList23 = new ArrayList();
                            arrayList23.addAll(arrayList9);
                            arrayList9.clear();
                            Collections.sort(arrayList23, new du(25));
                            int size5 = arrayList23.size();
                            int i28 = 0;
                            while (i28 < size5) {
                                int i29 = i28 + 1;
                                m1 m1Var4 = (m1) arrayList23.get(i28);
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("animate add impl");
                                }
                                View view9 = m1Var4.a;
                                ArrayList arrayList24 = arrayList;
                                arrayList24.add(m1Var4);
                                if (m1Var4 == this.O) {
                                    view9.setAlpha(1.0f);
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                if (view9 instanceof t1) {
                                    t1 t1Var3 = (t1) view9;
                                    if (t1Var3.getAnimationOffsetX() != 0.0f) {
                                        b1 b1Var = t1Var3.xe;
                                        float[] fArr = new float[2];
                                        fArr[0] = t1Var3.getAnimationOffsetX();
                                        fArr[c3] = 0.0f;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(t1Var3, b1Var, fArr));
                                    }
                                    t1Var3.setPivotX(((t1Var3.getBackgroundDrawableRight() - t1Var3.getBackgroundDrawableLeft()) / 2.0f) + t1Var3.getBackgroundDrawableLeft());
                                    f10 = 0.0f;
                                    view9.animate().translationY(0.0f).setDuration(this.c).start();
                                } else {
                                    f10 = 0.0f;
                                    view9.animate().translationX(0.0f).translationY(0.0f).setDuration(this.c).start();
                                }
                                long max = (long) ((1.0f - Math.max(f10, Math.min(1.0f, view9.getBottom() / tl0Var.getMeasuredHeight()))) * 100.0f);
                                if (!(view9 instanceof t1)) {
                                    i11 = size5;
                                } else if (m1Var4 == this.O) {
                                    ho hoVar = this.P;
                                    if (hoVar != null) {
                                        hoVar.h.setAlpha(0.0f);
                                    }
                                    tl0Var.setClipChildren(false);
                                    final t1 t1Var4 = (t1) view9;
                                    View view10 = (View) this.P.getParent();
                                    float x10 = view10.getX() + this.P.getX() + this.P.h.getX();
                                    float y10 = view10.getY() + this.P.getY() + this.P.h.getY();
                                    float x11 = t1Var4.getX() + tl0Var.getX() + t1Var4.getPhotoImage().getImageX();
                                    float y11 = t1Var4.getY() + tl0Var.getY() + t1Var4.getPhotoImage().getImageY();
                                    final float width = this.P.h.getWidth();
                                    final float height = this.P.h.getHeight();
                                    final float imageWidth = t1Var4.getPhotoImage().getImageWidth();
                                    final float imageHeight = t1Var4.getPhotoImage().getImageHeight();
                                    final float f12 = x10 - x11;
                                    final float f13 = y10 - y11;
                                    final float imageX = t1Var4.getPhotoImage().getImageX();
                                    final float imageY = t1Var4.getPhotoImage().getImageY();
                                    t1Var4.getTransitionParams().f0 = true;
                                    t1Var4.getTransitionParams().J1 = true;
                                    t1Var4.getPhotoImage().setImageCoords(imageX + f12, imageX + f13, width, height);
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xh.e
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            t1 t1Var5 = t1.this;
                                            t1Var5.getTransitionParams().K1 = floatValue;
                                            if (t1Var5.getTransitionParams().K1 > 1.0f) {
                                                t1Var5.getTransitionParams().K1 = 1.0f;
                                            }
                                            float f14 = 1.0f - floatValue;
                                            t1Var5.getPhotoImage().setImageCoords((f12 * f14) + imageX, (f13 * f14) + imageY, (imageWidth * floatValue) + (width * f14), (imageHeight * floatValue) + (height * f14));
                                            t1Var5.invalidate();
                                        }
                                    });
                                    i11 = size5;
                                    ofFloat2.addListener(new f(this, t1Var4, imageX, imageY, imageWidth, imageHeight));
                                    animatorSet.play(ofFloat2);
                                    max = max;
                                    z14 = false;
                                    view9.setAlpha(0.0f);
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), 1.0f));
                                    if (z14) {
                                        view9.setScaleX(1.0f);
                                        view9.setScaleY(1.0f);
                                    } else {
                                        view9.setScaleX(0.9f);
                                        view9.setScaleY(0.9f);
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_Y, view9.getScaleY(), 1.0f));
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_X, view9.getScaleX(), 1.0f));
                                    }
                                    if (m1Var4 != this.O) {
                                        animatorSet.setDuration(350L);
                                        animatorSet.setInterpolator(new OvershootInterpolator());
                                    } else {
                                        animatorSet.setStartDelay(max);
                                        animatorSet.setDuration(250L);
                                    }
                                    animatorSet.addListener(new g(this, m1Var4, view9));
                                    hashMap.put(m1Var4, animatorSet);
                                    animatorSet.start();
                                    i28 = i29;
                                    arrayList = arrayList24;
                                    size5 = i11;
                                    c3 = 1;
                                } else {
                                    i11 = size5;
                                    MessageObject.GroupedMessages currentMessagesGroup2 = ((t1) view9).getCurrentMessagesGroup();
                                    if (currentMessagesGroup2 != null) {
                                        Long valueOf = Long.valueOf(currentMessagesGroup2.groupId);
                                        HashMap hashMap2 = this.M;
                                        Long l10 = (Long) hashMap2.get(valueOf);
                                        if (l10 == null) {
                                            hashMap2.put(Long.valueOf(currentMessagesGroup2.groupId), Long.valueOf(max));
                                        } else {
                                            max = l10.longValue();
                                            if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                                                animatorSet.setStartDelay(140L);
                                            }
                                        }
                                    }
                                    max = max;
                                    if (currentMessagesGroup2 != null) {
                                        animatorSet.setStartDelay(140L);
                                    }
                                }
                                z14 = true;
                                view9.setAlpha(0.0f);
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), 1.0f));
                                if (z14) {
                                }
                                if (m1Var4 != this.O) {
                                }
                                animatorSet.addListener(new g(this, m1Var4, view9));
                                hashMap.put(m1Var4, animatorSet);
                                animatorSet.start();
                                i28 = i29;
                                arrayList = arrayList24;
                                size5 = i11;
                                c3 = 1;
                            }
                            arrayList23.clear();
                        }
                    }
                } else {
                    z10 = isEmpty10;
                    z11 = isEmpty11;
                    arrayList = arrayList10;
                    z12 = z21;
                }
                z13 = false;
                size = arrayList6.size();
                boolean z222 = z13;
                i10 = 0;
                while (true) {
                    hashMap = this.J;
                    if (i10 < size) {
                    }
                }
                arrayList6.clear();
                if (!z10) {
                }
                if (!z11) {
                }
                if (!isEmpty12) {
                }
            }
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new f5(this, 27));
        ofFloat3.setDuration(this.d + 250);
        ofFloat3.start();
    }

    @Override // f2.l, f2.p1
    public final void p(m1 m1Var) {
        R(m1Var);
        View view = m1Var.a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof t1) {
            ((t1) view).getTransitionParams().h = true;
        }
        this.q.add(m1Var);
    }

    @Override // f2.l, f2.p1
    public final boolean q(m1 m1Var, m1 m1Var2, c5.e eVar, int i10, int i11, int i12, int i13) {
        if (m1Var == m1Var2) {
            return r(m1Var, eVar, i10, i11, i12, i13);
        }
        View view = m1Var.a;
        float animationOffsetX = view instanceof t1 ? ((t1) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(m1Var);
        int i14 = (int) ((i12 - i10) - animationOffsetX);
        int i15 = (int) ((i13 - i11) - translationY);
        if (view instanceof t1) {
            ((t1) view).setAnimationOffsetX(animationOffsetX);
        } else {
            view.setTranslationX(animationOffsetX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = m1Var2.a;
        R(m1Var2);
        if (view2 instanceof t1) {
            ((t1) view2).setAnimationOffsetX(-i14);
        } else {
            view2.setTranslationX(-i14);
        }
        view2.setTranslationY(-i15);
        view2.setAlpha(0.0f);
        this.s.add(new f2.j(m1Var, m1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override // f2.l, f2.p1
    public final boolean r(m1 m1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        int translationX;
        int i14;
        t1 t1Var;
        v0 v0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        View view;
        int i15;
        float f15;
        boolean z4;
        MessageObject.GroupedMessages groupedMessages;
        int i16;
        boolean isOutOwner;
        View view2 = m1Var.a;
        if (view2 instanceof t1) {
            t1 t1Var2 = (t1) view2;
            translationX = i10 + ((int) t1Var2.getAnimationOffsetX());
            i14 = t1Var2.getTransitionParams().s2 != t1Var2.getTopMediaOffset() ? (t1Var2.getTransitionParams().s2 - t1Var2.getTopMediaOffset()) + i11 : i11;
            t1Var = t1Var2;
            v0Var = null;
        } else if (view2 instanceof v0) {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            v0Var = (v0) view2;
            t1Var = null;
        } else {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            t1Var = null;
            v0Var = null;
        }
        int i17 = translationX;
        int translationY = i14 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (t1Var != null) {
            float imageX = t1Var.getPhotoImage().getImageX();
            float imageY = t1Var.getPhotoImage().getImageY();
            f12 = t1Var.getPhotoImage().getImageWidth();
            float imageHeight = t1Var.getPhotoImage().getImageHeight();
            f10 = 0.0f;
            for (int i18 = 0; i18 < 4; i18++) {
                iArr[i18] = t1Var.getPhotoImage().getRoundRadius()[i18];
            }
            f13 = imageX;
            f11 = imageHeight;
            f14 = imageY;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
            f14 = 0.0f;
        }
        R(m1Var);
        int i19 = i12 - i17;
        int i20 = i13 - translationY;
        if (i20 != 0) {
            view2.setTranslationY(-i20);
        }
        float f16 = f11;
        v0 v0Var2 = v0Var;
        float f17 = f12;
        m mVar = new m(m1Var, i17, translationY, i12, i13);
        if (t1Var != null) {
            s1 transitionParams = t1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.t0;
            Rect rect = transitionParams.D0;
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (i19 != 0) {
                t1Var.setAnimationOffsetX(-i19);
            }
            boolean z10 = eVar instanceof l;
            tl0 tl0Var = this.G;
            if (z10) {
                ImageReceiver photoImage = t1Var.getPhotoImage();
                view = view2;
                l lVar = (l) eVar;
                i15 = i19;
                boolean z11 = (!transitionParams.v0 || lVar.f == f10 || lVar.e == f10) ? false : true;
                mVar.n = z11;
                if (z11) {
                    tl0Var.setClipChildren(false);
                    tl0Var.invalidate();
                    transitionParams.f0 = true;
                    if (t1Var.getMessageObject().isRoundVideo()) {
                        transitionParams.m0 = f13;
                        transitionParams.n0 = f14;
                        transitionParams.o0 = f17;
                        transitionParams.p0 = f16;
                        transitionParams.A0 = iArr;
                    } else {
                        transitionParams.m0 = photoImage.getImageX();
                        transitionParams.n0 = photoImage.getImageY();
                        transitionParams.o0 = photoImage.getImageWidth();
                        transitionParams.p0 = photoImage.getImageHeight();
                        transitionParams.A0 = photoImage.getRoundRadius();
                    }
                    transitionParams.B0 = false;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= 4) {
                            break;
                        }
                        if (iArr2[i21] != transitionParams.A0[i21]) {
                            transitionParams.B0 = true;
                            break;
                        }
                        i21++;
                    }
                    float f18 = transitionParams.m0;
                    float f19 = lVar.c;
                    if (f18 == f19 && transitionParams.n0 == lVar.d && transitionParams.p0 == lVar.f && transitionParams.o0 == lVar.e && !transitionParams.B0) {
                        transitionParams.f0 = false;
                        mVar.n = false;
                    } else {
                        mVar.o = f19;
                        mVar.p = lVar.d;
                        mVar.q = lVar.e;
                        mVar.r = lVar.f;
                        if (currentMessagesGroup != null) {
                            boolean z12 = currentMessagesGroup.hasCaption;
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            boolean z13 = transitionParams2.drawCaptionLayout;
                            if (z12 != z13) {
                                transitionParams2.captionEnterProgress = z13 ? 1.0f : 0.0f;
                            }
                        }
                        if (transitionParams.B0) {
                            if (transitionParams.A0 == photoImage.getRoundRadius()) {
                                transitionParams.A0 = new int[4];
                                for (int i22 = 0; i22 < 4; i22++) {
                                    transitionParams.A0[i22] = photoImage.getRoundRadius()[i22];
                                }
                            }
                            photoImage.setRoundRadius(iArr2);
                        }
                        t1Var.U3(mVar.o, mVar.p, mVar.q, mVar.r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.v0 && (((isOutOwner = t1Var.getMessageObject().isOutOwner()) && rect.left != t1Var.getBackgroundDrawableLeft()) || ((!isOutOwner && rect.right != t1Var.getBackgroundDrawableRight()) || rect.top != t1Var.getBackgroundDrawableTop() || rect.bottom != t1Var.getBackgroundDrawableBottom()))) {
                    mVar.v = t1Var.getBackgroundDrawableBottom() - rect.bottom;
                    mVar.u = t1Var.getBackgroundDrawableTop() - rect.top;
                    if (t1Var.D8 != transitionParams.E0) {
                        mVar.s = t1Var.getBackgroundDrawableLeft() - rect.left;
                        mVar.t = t1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (isOutOwner) {
                        mVar.s = t1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        mVar.t = t1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    mVar.l = true;
                    transitionParams.w0 = true;
                    transitionParams.g0 = -mVar.s;
                    transitionParams.h0 = -mVar.t;
                    transitionParams.j0 = -mVar.u;
                    transitionParams.i0 = -mVar.v;
                    tl0Var.setClipChildren(false);
                    tl0Var.invalidate();
                }
            } else {
                view = view2;
                i15 = i19;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    tl0 tl0Var2 = (tl0) view.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    boolean z14 = true;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    while (i23 < tl0Var2.getChildCount()) {
                        View childAt = tl0Var2.getChildAt(i23);
                        if (childAt instanceof t1) {
                            t1 t1Var3 = (t1) childAt;
                            if (t1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !t1Var3.getMessageObject().deleted) {
                                int backgroundDrawableLeft = t1Var3.getBackgroundDrawableLeft() + t1Var3.getLeft();
                                groupedMessages = currentMessagesGroup;
                                int backgroundDrawableRight = t1Var3.getBackgroundDrawableRight() + t1Var3.getLeft();
                                i16 = i23;
                                int backgroundDrawableTop = t1Var3.getBackgroundDrawableTop() + t1Var3.getPaddingTop() + t1Var3.getTop();
                                int backgroundDrawableBottom = t1Var3.getBackgroundDrawableBottom() + t1Var3.getPaddingTop() + t1Var3.getTop();
                                if (i26 == 0 || backgroundDrawableLeft < i26) {
                                    i26 = backgroundDrawableLeft;
                                }
                                if (i27 == 0 || backgroundDrawableRight > i27) {
                                    i27 = backgroundDrawableRight;
                                }
                                if (t1Var3.getTransitionParams().v0 || transitionParams3.isNewGroup) {
                                    if (i24 == 0 || backgroundDrawableTop < i24) {
                                        i24 = backgroundDrawableTop;
                                    }
                                    if (i25 == 0 || backgroundDrawableBottom > i25) {
                                        i25 = backgroundDrawableBottom;
                                    }
                                    z14 = false;
                                }
                                i23 = i16 + 1;
                                currentMessagesGroup = groupedMessages;
                            }
                        }
                        groupedMessages = currentMessagesGroup;
                        i16 = i23;
                        i23 = i16 + 1;
                        currentMessagesGroup = groupedMessages;
                    }
                    transitionParams3.isNewGroup = false;
                    if (i24 == 0 && i25 == 0 && i26 == 0 && i27 == 0) {
                        mVar.j = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i28 = (-i24) + transitionParams3.top;
                        mVar.f = i28;
                        int i29 = (-i25) + transitionParams3.bottom;
                        mVar.g = i29;
                        int i30 = (-i26) + transitionParams3.left;
                        mVar.h = i30;
                        int i31 = (-i27) + transitionParams3.right;
                        mVar.i = i31;
                        mVar.j = true;
                        transitionParams3.backgroundChangeBounds = true;
                        transitionParams3.offsetTop = i28;
                        transitionParams3.offsetBottom = i29;
                        transitionParams3.offsetLeft = i30;
                        transitionParams3.offsetRight = i31;
                        transitionParams3.captionEnterProgress = transitionParams3.drawCaptionLayout ? 1.0f : 0.0f;
                        tl0Var2.setClipChildren(false);
                        tl0Var2.invalidate();
                    }
                    transitionParams3.drawBackgroundForDeletedItems = z14;
                }
            }
            Integer valueOf = Integer.valueOf(t1Var.getMessageObject().getId());
            HashMap hashMap = this.H;
            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hashMap.get(valueOf);
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                hashMap.remove(Integer.valueOf(t1Var.getMessageObject().getId()));
                if (transitionParams.v0) {
                    int backgroundDrawableLeft2 = t1Var.getBackgroundDrawableLeft() + t1Var.getLeft();
                    int backgroundDrawableRight2 = t1Var.getBackgroundDrawableRight() + t1Var.getLeft();
                    int backgroundDrawableTop2 = t1Var.getBackgroundDrawableTop() + t1Var.getPaddingTop() + t1Var.getTop();
                    int backgroundDrawableBottom2 = t1Var.getBackgroundDrawableBottom() + t1Var.getPaddingTop() + t1Var.getTop();
                    mVar.w = true;
                    transitionParams.w0 = true;
                    mVar.s = backgroundDrawableLeft2 - transitionParams4.left;
                    mVar.t = backgroundDrawableRight2 - transitionParams4.right;
                    mVar.u = backgroundDrawableTop2 - transitionParams4.top;
                    mVar.v = backgroundDrawableBottom2 - transitionParams4.bottom;
                    mVar.l = false;
                    transitionParams.g0 = (int) ((-r6) - t1Var.getAnimationOffsetX());
                    transitionParams.h0 = (int) ((-mVar.t) - t1Var.getAnimationOffsetX());
                    transitionParams.j0 = (int) ((-mVar.u) - t1Var.getTranslationY());
                    transitionParams.i0 = (int) ((-mVar.v) - t1Var.getTranslationY());
                    transitionParams.C0 = true;
                    tl0Var.setClipChildren(false);
                    tl0Var.invalidate();
                } else {
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition = t1Var.I;
            if (transitionParams.y0 != (t1Var.h8 || t1Var.G || (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && t1Var.H.isDocuments))) {
                z4 = true;
                mVar.k = true;
                f15 = 0.0f;
                transitionParams.z0 = 0.0f;
            } else {
                f15 = 0.0f;
                z4 = true;
            }
            boolean f20 = transitionParams.f();
            mVar.m = f20;
            if (f20) {
                transitionParams.g = z4;
                transitionParams.K1 = f15;
            }
            if (i15 == 0 && i20 == 0 && !mVar.n && !mVar.w && !mVar.j && !mVar.k && !mVar.l && !f20) {
                v(m1Var);
                return false;
            }
        } else if (v0Var2 != null) {
            u0 transitionParams5 = v0Var2.getTransitionParams();
            transitionParams5.getClass();
            if (i19 != 0) {
                view2.setTranslationX(-i19);
            }
            boolean a2 = !transitionParams5.a ? false : transitionParams5.d.z0.a();
            mVar.m = a2;
            if (a2) {
                transitionParams5.b = true;
                transitionParams5.c = 0.0f;
            }
            if (i19 == 0 && i20 == 0 && !a2) {
                v(m1Var);
                return false;
            }
        } else if (view2 instanceof h0) {
            ((h0) view2).setAnimating(true);
        } else if (view2 instanceof xa) {
            ((xa) view2).setAnimating(true);
        } else {
            if (i19 == 0 && i20 == 0) {
                v(m1Var);
                return false;
            }
            if (i19 != 0) {
                view2.setTranslationX(-i19);
            }
        }
        this.r.add(mVar);
        F();
        return true;
    }

    @Override // f2.l, f2.p1
    public final void s(m1 m1Var, c5.e eVar) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        super.s(m1Var, eVar);
        View view = m1Var.a;
        if (eVar != null) {
            int i10 = eVar.b;
            int top = view.getTop();
            int left = view.getLeft() - eVar.a;
            if (top - i10 != 0) {
                view.setTranslationY(-r1);
            }
            if (!(view instanceof t1)) {
                if (left != 0) {
                    view.setTranslationX(-left);
                    return;
                }
                return;
            }
            t1 t1Var = (t1) view;
            if (left != 0) {
                t1Var.setAnimationOffsetX(-left);
            }
            if (eVar instanceof l) {
                l lVar = (l) eVar;
                t1Var.U3(lVar.c, lVar.d, lVar.e, lVar.f);
            }
        }
    }
}
