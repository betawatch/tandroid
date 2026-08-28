package rh;

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
import d5.p;
import f2.n1;
import f2.q1;
import ih.i3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kh.g4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.c01;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yn;
import org.telegram.ui.ak;
import org.telegram.ui.ca1;
import org.telegram.ui.fm;
import org.telegram.ui.ph1;
import org.telegram.ui.qg;
import org.telegram.ui.qn;
import r0.j0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class m extends f2.n {
    public static final gr V = new gr(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final qn F;
    public final wk0 G;
    public boolean N;
    public q1 O;
    public yn P;
    public boolean Q;
    public final b6 R;
    public qg T;
    public qg U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public m(qn qnVar, wk0 wk0Var, b6 b6Var) {
        this.R = b6Var;
        this.F = qnVar;
        this.G = wk0Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override // f2.n
    public final void B(f2.l lVar) {
        f2.l lVar2;
        q1 q1Var = lVar.a;
        View view = q1Var == null ? null : q1Var.a;
        q1 q1Var2 = lVar.b;
        View view2 = q1Var2 != null ? q1Var2.a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(lVar.a);
            duration.translationX(lVar.e - lVar.c);
            duration.translationY(lVar.f - lVar.d);
            lVar2 = lVar;
            duration.alpha(0.0f).setListener(new j(this, lVar2, duration, view, 0)).start();
        } else {
            lVar2 = lVar;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(lVar2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new j(this, lVar2, animate, view2, 1)).start();
        }
    }

    @Override // f2.n
    public final void C(q1 q1Var, f2.m mVar) {
        T(q1Var, mVar, false);
    }

    @Override // f2.n
    public final boolean J(f2.l lVar, q1 q1Var) {
        d01 d01Var;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(q1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = q1Var.a;
        if (this.K.contains(view) && (d01Var = (d01) this.U.run()) != null) {
            d01Var.a(view);
        }
        if (lVar.b == q1Var) {
            lVar.b = null;
        } else {
            if (lVar.a != q1Var) {
                return false;
            }
            lVar.a = null;
        }
        X(view);
        d(q1Var);
        return true;
    }

    @Override // f2.n
    public final long L() {
        return 0L;
    }

    @Override // f2.n
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
    /* JADX WARN: Removed duplicated region for block: B:11:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(final q1 q1Var, f2.m mVar, boolean z10) {
        q1 q1Var2;
        s1 s1Var;
        t1 t1Var;
        int i9;
        float f10;
        boolean z11;
        final l lVar;
        final t1 t1Var2;
        s1 s1Var2;
        final int i10;
        final s1 s1Var3;
        ValueAnimator valueAnimator;
        final boolean z12;
        char c10;
        int[] iArr;
        int i11 = mVar.c;
        int i12 = mVar.e;
        View view = q1Var.a;
        int i13 = i12 - i11;
        AnimatorSet animatorSet = new AnimatorSet();
        int i14 = 0;
        final int i15 = 1;
        if (i13 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.z.add(q1Var);
        final l lVar2 = (l) mVar;
        qn qnVar = this.F;
        if (qnVar != null && (view instanceof h0)) {
            h0 h0Var = (h0) view;
            float translationY = h0Var.getTranslationY();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new g(this, h0Var, translationY, i14));
            animatorSet.playTogether(ofFloat);
        } else {
            if (qnVar == null || !(view instanceof xa)) {
                if (view instanceof t1) {
                    final t1 t1Var3 = (t1) view;
                    final s1 transitionParams = t1Var3.getTransitionParams();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(t1Var3, t1Var3.we, 0.0f));
                    if (lVar2.n) {
                        t1Var3.U3(lVar2.o, lVar2.p, lVar2.q, lVar2.r);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        final float f11 = t1Var3.getCurrentMessagesGroup() == null ? transitionParams.u0 : t1Var3.getCurrentMessagesGroup().transitionParams.captionEnterProgress;
                        final float P2 = t1Var3.getCurrentMessagesGroup() == null ? t1Var3.P2() : t1Var3.getCurrentMessagesGroup().hasCaption;
                        if (f11 != P2) {
                            valueAnimator = ofFloat2;
                            z12 = true;
                        } else {
                            valueAnimator = ofFloat2;
                            z12 = false;
                        }
                        if (transitionParams.B0) {
                            c10 = 0;
                            iArr = new int[4];
                            for (int i16 = 0; i16 < 4; i16++) {
                                iArr[i16] = t1Var3.getPhotoImage().getRoundRadius()[i16];
                            }
                        } else {
                            c10 = 0;
                            iArr = null;
                        }
                        final int[] iArr2 = iArr;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        i9 = 2;
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: rh.a
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                l lVar3 = l.this;
                                float f12 = 1.0f - floatValue;
                                float f13 = lVar3.o * f12;
                                s1 s1Var4 = transitionParams;
                                float f14 = (s1Var4.m0 * floatValue) + f13;
                                float f15 = (s1Var4.n0 * floatValue) + (lVar3.p * f12);
                                float f16 = (s1Var4.o0 * floatValue) + (lVar3.q * f12);
                                float f17 = (s1Var4.p0 * floatValue) + (lVar3.r * f12);
                                boolean z13 = z12;
                                t1 t1Var4 = t1Var3;
                                if (z13) {
                                    float f18 = (P2 * floatValue) + (f11 * f12);
                                    s1Var4.u0 = f18;
                                    if (t1Var4.getCurrentMessagesGroup() != null) {
                                        t1Var4.getCurrentMessagesGroup().transitionParams.captionEnterProgress = f18;
                                    }
                                }
                                if (s1Var4.B0) {
                                    ImageReceiver photoImage = t1Var4.getPhotoImage();
                                    int[] iArr3 = iArr2;
                                    int[] iArr4 = s1Var4.A0;
                                    photoImage.setRoundRadius((int) ((iArr4[0] * floatValue) + (iArr3[0] * f12)), (int) ((iArr4[1] * floatValue) + (iArr3[1] * f12)), (int) ((iArr4[2] * floatValue) + (iArr3[2] * f12)), (int) ((iArr4[3] * floatValue) + (iArr3[3] * f12)));
                                }
                                t1Var4.U3(f14, f15, f16, f17);
                                q1Var.a.invalidate();
                            }
                        };
                        s1Var = transitionParams;
                        t1Var = t1Var3;
                        q1Var2 = q1Var;
                        valueAnimator2.addUpdateListener(animatorUpdateListener);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[c10] = valueAnimator2;
                        animatorSet.playTogether(animatorArr);
                    } else {
                        s1Var = transitionParams;
                        t1Var = t1Var3;
                        q1Var2 = q1Var;
                        i9 = 2;
                    }
                    if (lVar2.v == 0 && lVar2.t == 0 && lVar2.u == 0 && lVar2.s == 0) {
                        f10 = 0.0f;
                        s1Var.k0 = 0.0f;
                        s1Var.l0 = 0.0f;
                        z11 = false;
                    } else {
                        f10 = 0.0f;
                        wk0 wk0Var = this.G;
                        wk0Var.setClipChildren(false);
                        wk0Var.invalidate();
                        float[] fArr = new float[i9];
                        // fill-array-data instruction
                        fArr[0] = 1.0f;
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr);
                        if (lVar2.l) {
                            s1Var.k0 = -lVar2.s;
                            s1Var.l0 = -lVar2.t;
                        } else {
                            s1Var.k0 = (-lVar2.s) - t1Var.getAnimationOffsetX();
                            s1Var.l0 = (-lVar2.t) - t1Var.getAnimationOffsetX();
                        }
                        ofFloat3.addUpdateListener(new i3(lVar2, s1Var, t1Var, 3));
                        z11 = false;
                        animatorSet.playTogether(ofFloat3);
                    }
                    MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        lVar2.j = z11;
                    }
                    if (lVar2.j) {
                        float[] fArr2 = new float[i9];
                        // fill-array-data instruction
                        fArr2[0] = 1.0f;
                        fArr2[1] = 0.0f;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr2);
                        s1 s1Var4 = s1Var;
                        final MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                        final wk0 wk0Var2 = (wk0) view.getParent();
                        final float f12 = currentMessagesGroup.transitionParams.captionEnterProgress;
                        if (currentMessagesGroup.hasCaption) {
                            f10 = 1.0f;
                        }
                        final boolean z13 = f12 != f10;
                        s1Var2 = s1Var4;
                        final float f13 = f10;
                        lVar = lVar2;
                        t1Var2 = t1Var;
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rh.b
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                l lVar3 = lVar;
                                MessageObject.GroupedMessages.TransitionParams transitionParams3 = MessageObject.GroupedMessages.TransitionParams.this;
                                transitionParams3.offsetTop = lVar3.f * floatValue;
                                transitionParams3.offsetBottom = lVar3.g * floatValue;
                                transitionParams3.offsetLeft = lVar3.h * floatValue;
                                transitionParams3.offsetRight = lVar3.i * floatValue;
                                if (z13) {
                                    transitionParams3.captionEnterProgress = e2.c.z(1.0f, floatValue, f13, f12 * floatValue);
                                }
                                wk0 wk0Var3 = wk0Var2;
                                if (wk0Var3 != null) {
                                    wk0Var3.invalidate();
                                }
                            }
                        });
                        ofFloat4.addListener(new h(transitionParams2));
                        i10 = 0;
                        animatorSet.playTogether(ofFloat4);
                    } else {
                        lVar = lVar2;
                        t1Var2 = t1Var;
                        s1Var2 = s1Var;
                        i10 = 0;
                    }
                    if (lVar.k) {
                        float[] fArr3 = new float[i9];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(fArr3);
                        s1Var3 = s1Var2;
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rh.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i10) {
                                    case 0:
                                        s1Var3.z0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        t1Var2.invalidate();
                                        break;
                                    default:
                                        s1Var3.K1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        t1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i10] = ofFloat5;
                        animatorSet.playTogether(animatorArr2);
                    } else {
                        s1Var3 = s1Var2;
                    }
                    if (lVar.m) {
                        float[] fArr4 = new float[i9];
                        // fill-array-data instruction
                        fArr4[0] = 0.0f;
                        fArr4[1] = 1.0f;
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(fArr4);
                        s1Var3.g = true;
                        ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rh.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i15) {
                                    case 0:
                                        s1Var3.z0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        t1Var2.invalidate();
                                        break;
                                    default:
                                        s1Var3.K1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        t1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        animatorSet.playTogether(ofFloat6);
                    }
                } else {
                    q1Var2 = q1Var;
                    if (view instanceof w0) {
                        w0 w0Var = (w0) view;
                        v0 transitionParams3 = w0Var.getTransitionParams();
                        if (lVar2.m) {
                            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            transitionParams3.b = true;
                            ofFloat7.addUpdateListener(new f2.g(27, transitionParams3, w0Var));
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
                    animatorSet.setInterpolator(gr.g);
                }
                animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
                animatorSet.addListener(new i(this, q1Var2, i13, view));
                animatorSet.start();
                this.J.put(q1Var2, animatorSet);
            }
            xa xaVar = (xa) view;
            float translationY2 = xaVar.getTranslationY();
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat8.addUpdateListener(new g(this, xaVar, translationY2, i15));
            animatorSet.playTogether(ofFloat8);
        }
        q1Var2 = q1Var;
        if (z10) {
        }
        animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
        animatorSet.addListener(new i(this, q1Var2, i13, view));
        animatorSet.start();
        this.J.put(q1Var2, animatorSet);
    }

    public final void U() {
        d01 d01Var;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (this.K.isEmpty() || (d01Var = (d01) this.U.run()) == null) {
            return;
        }
        ArrayList arrayList2 = d01Var.c;
        if (d01Var.e) {
            return;
        }
        d01Var.e = true;
        int size2 = arrayList2.size();
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            c01 c01Var = (c01) obj2;
            Runnable runnable = c01Var.d;
            if (runnable != null) {
                d01.b(runnable);
                c01Var.d = null;
            }
        }
        arrayList2.clear();
        b01 b01Var = d01Var.a;
        if (b01Var != null) {
            b01Var.i();
        }
        Runnable runnable2 = d01Var.d;
        if (runnable2 != null) {
            d01Var.d = null;
            d01.b(runnable2);
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
            wk0 wk0Var = this.G;
            int childCount = wk0Var.getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 >= childCount) {
                    break;
                }
                View childAt = wk0Var.getChildAt(i9);
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
                i9++;
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
        boolean z10 = view instanceof h0;
        wk0 wk0Var = this.G;
        if (z10) {
            int measuredHeight = (wk0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
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
            int measuredHeight2 = (wk0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
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
            if (!(view instanceof w0)) {
                view.setTranslationX(0.0f);
                return;
            }
            v0 transitionParams = ((w0) view).getTransitionParams();
            transitionParams.b = false;
            transitionParams.c = 1.0f;
        }
    }

    public final void Y(qg qgVar, qg qgVar2) {
        this.T = qgVar;
        this.U = qgVar2;
    }

    public final boolean Z(View view) {
        q1 T;
        if (this.N || (T = this.G.T(view)) == null) {
            return false;
        }
        return this.q.contains(T) || this.y.contains(T);
    }

    @Override // f2.t1, f2.w0
    public final boolean a(q1 q1Var, p pVar, p pVar2) {
        ArrayList arrayList;
        int i9;
        boolean a2 = super.a(q1Var, pVar, pVar2);
        if (a2 && this.N) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.q;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((q1) arrayList.get(i10)).c() == 0) {
                    z10 = true;
                }
                i10++;
            }
            if (z10) {
                i9 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i9 += ((q1) arrayList.get(i11)).a.getHeight();
                }
            } else {
                i9 = 0;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((q1) arrayList.get(i12)).a.setTranslationY(i9);
            }
        }
        return a2;
    }

    public final boolean a0(View view) {
        q1 T = this.G.T(view);
        if (T != null) {
            return this.p.contains(T) || this.A.contains(T);
        }
        return false;
    }

    @Override // f2.n, f2.w0
    public final void f(q1 q1Var) {
        d01 d01Var;
        Animator animator = (Animator) this.J.remove(q1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = q1Var.a;
        if (this.K.contains(view) && (d01Var = (d01) this.U.run()) != null) {
            d01Var.a(view);
        }
        super.f(q1Var);
        X(view);
    }

    @Override // f2.n, f2.w0
    public void g() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((MessageObject.GroupedMessages) obj).transitionParams.isNewGroup = false;
        }
        arrayList.clear();
        U();
        yn ynVar = this.P;
        if (ynVar != null) {
            ynVar.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.m mVar = (f2.m) arrayList2.get(size2);
            X(mVar.a.a);
            v(mVar.a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            q1 q1Var = (q1) arrayList3.get(size3);
            X(q1Var.a);
            d(q1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            q1 q1Var2 = (q1) arrayList4.get(size4);
            X(q1Var2.a);
            u(q1Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((f2.l) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (k()) {
            ArrayList arrayList6 = this.u;
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
                for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                    f2.m mVar2 = (f2.m) arrayList7.get(size7);
                    X(mVar2.a.a);
                    v(mVar2.a);
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
                    q1 q1Var3 = (q1) arrayList9.get(size9);
                    X(q1Var3.a);
                    u(q1Var3);
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
                    I((f2.l) arrayList11.get(size11));
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

    @Override // f2.w0
    public final long i() {
        return 250L;
    }

    @Override // f2.w0
    public final long j() {
        return 250L;
    }

    @Override // f2.w0
    public final p l(n1 n1Var, q1 q1Var, int i9, List list) {
        p l10 = super.l(n1Var, q1Var, i9, list);
        View view = q1Var.a;
        if (!(view instanceof t1)) {
            return l10;
        }
        k kVar = new k();
        kVar.a = l10.a;
        kVar.b = l10.b;
        s1 transitionParams = ((t1) view).getTransitionParams();
        kVar.c = transitionParams.a;
        kVar.d = transitionParams.b;
        kVar.e = transitionParams.c;
        kVar.f = transitionParams.d;
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0477 A[EDGE_INSN: B:227:0x0477->B:228:0x0477 BREAK  A[LOOP:9: B:195:0x03bf->B:220:0x03bf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0200  */
    @Override // f2.n, f2.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z10;
        boolean z11;
        wk0 wk0Var;
        boolean z12;
        long j10;
        boolean z13;
        int size;
        int i9;
        HashMap hashMap;
        float f10;
        int i10;
        ArrayList arrayList;
        wk0 wk0Var2;
        float f11;
        boolean z14;
        ArrayList arrayList2;
        int i11;
        int i12;
        ArrayList arrayList3;
        boolean z15;
        ArrayList arrayList4;
        qg qgVar;
        int i13;
        MessageObject.GroupedMessages currentMessagesGroup;
        boolean z16;
        wk0 wk0Var3;
        boolean z17;
        MessageObject messageObject;
        qg qgVar2;
        int i14;
        int i15;
        boolean z18;
        qn qnVar;
        Runnable runnable;
        cf cfVar;
        int i16;
        m mVar = this;
        ArrayList arrayList5 = mVar.p;
        boolean isEmpty = arrayList5.isEmpty();
        ArrayList arrayList6 = mVar.r;
        boolean isEmpty2 = arrayList6.isEmpty();
        ArrayList arrayList7 = mVar.s;
        boolean isEmpty3 = arrayList7.isEmpty();
        ArrayList arrayList8 = mVar.q;
        boolean isEmpty4 = arrayList8.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        boolean z19 = mVar.N;
        wk0 wk0Var4 = mVar.G;
        if (z19) {
            z10 = false;
            while (i16 < arrayList8.size()) {
                if (mVar.Q) {
                    i16 = ((q1) arrayList8.get(i16)).c() != (wk0Var4.getAdapter() == null ? 0 : wk0Var4.getAdapter().h()) - 1 ? i16 + 1 : 0;
                    z10 = true;
                } else {
                    if (((q1) arrayList8.get(i16)).c() != 0) {
                    }
                    z10 = true;
                }
            }
        } else {
            z10 = false;
        }
        mVar.W();
        ArrayList arrayList9 = mVar.y;
        float f12 = 1.0f;
        if (z10) {
            boolean isEmpty5 = arrayList5.isEmpty();
            boolean isEmpty6 = arrayList6.isEmpty();
            boolean isEmpty7 = arrayList7.isEmpty();
            boolean isEmpty8 = arrayList8.isEmpty();
            if (!isEmpty5 || !isEmpty6 || !isEmpty8 || !isEmpty7) {
                int i17 = 0;
                while (i14 < arrayList8.size()) {
                    View view = ((q1) arrayList8.get(i14)).a;
                    if (view instanceof t1) {
                        t1 t1Var = (t1) view;
                        i14 = (t1Var.getCurrentPosition() != null && (t1Var.getCurrentPosition().flags & 1) == 0) ? i14 + 1 : 0;
                    }
                    i17 += ((q1) arrayList8.get(i14)).a.getHeight();
                }
                int size2 = arrayList5.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj = arrayList5.get(i18);
                    i18++;
                    mVar.D((q1) obj);
                }
                arrayList5.clear();
                if (!isEmpty6) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.addAll(arrayList6);
                    arrayList6.clear();
                    int size3 = arrayList10.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj2 = arrayList10.get(i19);
                        i19++;
                        f2.m mVar2 = (f2.m) obj2;
                        mVar.T(mVar2.a, mVar2, false);
                    }
                    arrayList10.clear();
                }
                if (!isEmpty8) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.addAll(arrayList8);
                    arrayList8.clear();
                    int size4 = arrayList11.size();
                    int i20 = 0;
                    while (i20 < size4) {
                        Object obj3 = arrayList11.get(i20);
                        i20++;
                        q1 q1Var = (q1) obj3;
                        View view2 = q1Var.a;
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList9.add(q1Var);
                        view2.setTranslationY(i17);
                        View view3 = q1Var.a;
                        view3.setScaleX(f12);
                        view3.setScaleY(f12);
                        t1 t1Var2 = view3 instanceof t1 ? (t1) view3 : null;
                        if (t1Var2 == null || !t1Var2.getTransitionParams().x0) {
                            view3.setAlpha(f12);
                        }
                        qn qnVar2 = mVar.F;
                        if (qnVar2 != null) {
                            ArrayList arrayList12 = qnVar2.q4;
                            if (t1Var2 != null && arrayList12.contains(t1Var2.getMessageObject())) {
                                arrayList12.remove(t1Var2.getMessageObject());
                                ak akVar = qnVar2.U;
                                if (akVar.b0 == null || !((cfVar = akVar.H0) == null || cfVar.m0)) {
                                    i15 = size4;
                                } else {
                                    i15 = size4;
                                    if (System.currentTimeMillis() - akVar.I0 > 300) {
                                        z18 = true;
                                        akVar.I0 = -1L;
                                        if (z18) {
                                            if (t1Var2.getMessageObject().isVoice()) {
                                                if (Math.abs(view2.getTranslationY()) < view2.getMeasuredHeight() * 3.0f) {
                                                    new ph1(t1Var2, qnVar2.U, mVar.G, qnVar2.I9, mVar.R).f.start();
                                                }
                                            } else if (SharedConfig.getDevicePerformanceClass() != 0 && Math.abs(view2.getTranslationY()) < wk0Var4.getMeasuredHeight()) {
                                                qnVar = qnVar2;
                                                ValueAnimator valueAnimator = new ca1(t1Var2, qnVar2, mVar.G, qnVar2.I9, mVar.R).d;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                                ak akVar2 = qnVar.U;
                                                runnable = akVar2.b0;
                                                if (runnable != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                                    akVar2.c0 = true;
                                                    akVar2.b0.run();
                                                    akVar2.b0 = null;
                                                    animate.translationY(0.0f).setDuration(250L).setInterpolator(mVar.o).setListener(new of.h0(mVar, q1Var, view2, animate)).start();
                                                    size4 = i15;
                                                    f12 = 1.0f;
                                                }
                                            }
                                            qnVar = qnVar2;
                                            ak akVar22 = qnVar.U;
                                            runnable = akVar22.b0;
                                            if (runnable != null) {
                                            }
                                        }
                                        animate.translationY(0.0f).setDuration(250L).setInterpolator(mVar.o).setListener(new of.h0(mVar, q1Var, view2, animate)).start();
                                        size4 = i15;
                                        f12 = 1.0f;
                                    }
                                }
                                z18 = false;
                                akVar.I0 = -1L;
                                if (z18) {
                                }
                                animate.translationY(0.0f).setDuration(250L).setInterpolator(mVar.o).setListener(new of.h0(mVar, q1Var, view2, animate)).start();
                                size4 = i15;
                                f12 = 1.0f;
                            }
                        }
                        i15 = size4;
                        animate.translationY(0.0f).setDuration(250L).setInterpolator(mVar.o).setListener(new of.h0(mVar, q1Var, view2, animate)).start();
                        size4 = i15;
                        f12 = 1.0f;
                    }
                    arrayList11.clear();
                }
            }
        } else {
            boolean isEmpty9 = arrayList5.isEmpty();
            boolean isEmpty10 = arrayList6.isEmpty();
            boolean isEmpty11 = arrayList7.isEmpty();
            boolean isEmpty12 = arrayList8.isEmpty();
            if (!isEmpty9 || !isEmpty10 || !isEmpty12 || !isEmpty11) {
                boolean z20 = (mVar.U == null || (qgVar2 = mVar.T) == null || !((Boolean) qgVar2.run()).booleanValue()) ? false : true;
                ArrayList arrayList13 = mVar.K;
                ArrayList arrayList14 = mVar.A;
                char c10 = 1;
                ArrayList arrayList15 = mVar.S;
                if (z20) {
                    LongSparseArray longSparseArray = null;
                    int i21 = 0;
                    j10 = 0;
                    while (i21 < arrayList5.size()) {
                        q1 q1Var2 = (q1) arrayList5.get(i21);
                        if (arrayList15.contains(q1Var2)) {
                            z16 = isEmpty10;
                            View view4 = q1Var2.a;
                            z17 = isEmpty11;
                            if (!(view4 instanceof t1) || ((t1) view4).getCurrentMessagesGroup() == null || (messageObject = ((t1) q1Var2.a).getMessageObject()) == null || messageObject.getGroupId() == 0) {
                                wk0Var3 = wk0Var4;
                            } else {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                wk0Var3 = wk0Var4;
                                ArrayList arrayList16 = (ArrayList) longSparseArray.get(messageObject.getGroupId());
                                if (arrayList16 == null) {
                                    long groupId = messageObject.getGroupId();
                                    ArrayList arrayList17 = new ArrayList();
                                    longSparseArray.put(groupId, arrayList17);
                                    arrayList16 = arrayList17;
                                }
                                arrayList15.remove(q1Var2);
                                arrayList5.remove(i21);
                                i21--;
                                arrayList16.add(q1Var2);
                            }
                        } else {
                            z16 = isEmpty10;
                            wk0Var3 = wk0Var4;
                            z17 = isEmpty11;
                        }
                        i21++;
                        isEmpty10 = z16;
                        isEmpty11 = z17;
                        wk0Var4 = wk0Var3;
                    }
                    z11 = isEmpty10;
                    wk0Var = wk0Var4;
                    z12 = isEmpty11;
                    if (longSparseArray != null) {
                        int i22 = 0;
                        z13 = false;
                        while (i22 < longSparseArray.size()) {
                            ArrayList arrayList18 = (ArrayList) longSparseArray.valueAt(i22);
                            if (arrayList18.size() > 0) {
                                View view5 = ((q1) arrayList18.get(0)).a;
                                if (!(view5 instanceof t1) || (currentMessagesGroup = ((t1) view5).getCurrentMessagesGroup()) == null || currentMessagesGroup.messages.size() <= arrayList18.size()) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("animate remove group impl with thanos");
                                    }
                                    arrayList14.addAll(arrayList18);
                                    d01 d01Var = (d01) mVar.U.run();
                                    for (int i23 = 0; i23 < arrayList18.size(); i23++) {
                                    }
                                    ArrayList arrayList19 = new ArrayList();
                                    i13 = i22;
                                    for (int i24 = 0; i24 < arrayList18.size(); i24++) {
                                        arrayList19.add(((q1) arrayList18.get(i24)).a);
                                    }
                                    pf.a aVar = new pf.a(mVar, arrayList19, arrayList18, 12);
                                    b01 b01Var = d01Var.a;
                                    if (b01Var != null) {
                                        b01Var.f(arrayList19, aVar);
                                        Choreographer.getInstance().postFrameCallback(d01Var.b);
                                    } else {
                                        d01Var.c.add(new c01(arrayList19, aVar));
                                    }
                                    arrayList13.add((View) arrayList19.get(0));
                                    wk0Var.B0();
                                    z13 = true;
                                    i22 = i13 + 1;
                                } else {
                                    arrayList5.addAll(arrayList18);
                                }
                            }
                            i13 = i22;
                            i22 = i13 + 1;
                        }
                        size = arrayList5.size();
                        boolean z21 = z13;
                        i9 = 0;
                        while (true) {
                            hashMap = mVar.J;
                            if (i9 < size) {
                                break;
                            }
                            Object obj4 = arrayList5.get(i9);
                            int i25 = i9 + 1;
                            q1 q1Var3 = (q1) obj4;
                            boolean z22 = arrayList15.remove(q1Var3) && z20;
                            if (BuildVars.LOGS_ENABLED) {
                                arrayList2 = arrayList5;
                                i11 = size;
                                FileLog.d("animate remove impl ".concat(z22 ? " with thanos" : ""));
                            } else {
                                arrayList2 = arrayList5;
                                i11 = size;
                            }
                            View view6 = q1Var3.a;
                            arrayList14.add(q1Var3);
                            if (!z22 || (qgVar = mVar.U) == null) {
                                i12 = i25;
                                arrayList3 = arrayList15;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view6, (Property<View, Float>) View.ALPHA, view6.getAlpha(), 0.0f);
                                z15 = z20;
                                arrayList4 = arrayList13;
                                ofFloat.setDuration(mVar.d);
                                ofFloat.addListener(new f(mVar, view6, q1Var3));
                                hashMap.put(q1Var3, ofFloat);
                                ofFloat.start();
                            } else {
                                d01 d01Var2 = (d01) qgVar.run();
                                i12 = i25;
                                pf.a aVar2 = new pf.a(mVar, view6, q1Var3, 13);
                                b01 b01Var2 = d01Var2.a;
                                if (b01Var2 != null) {
                                    b01Var2.e(view6, 1.0f, aVar2);
                                    Choreographer.getInstance().postFrameCallback(d01Var2.b);
                                } else {
                                    d01Var2.c.add(new c01(view6, aVar2));
                                }
                                arrayList13.add(view6);
                                arrayList3 = arrayList15;
                                z15 = z20;
                                arrayList4 = arrayList13;
                            }
                            wk0Var.B0();
                            z20 = z15;
                            arrayList13 = arrayList4;
                            size = i11;
                            arrayList5 = arrayList2;
                            i9 = i12;
                            arrayList15 = arrayList3;
                            if (z22) {
                                z21 = true;
                            }
                        }
                        arrayList5.clear();
                        if (!z11) {
                            ArrayList arrayList20 = new ArrayList();
                            arrayList20.addAll(arrayList6);
                            mVar.u.add(arrayList20);
                            arrayList6.clear();
                            gc.j jVar = new gc.j(mVar, arrayList20, z21, 2);
                            if (!mVar.C || isEmpty9) {
                                jVar.run();
                            } else {
                                View view7 = ((f2.m) arrayList20.get(0)).a.a;
                                WeakHashMap weakHashMap = j0.a;
                                view7.postOnAnimationDelayed(jVar, j10);
                            }
                        }
                        if (!z12) {
                            ArrayList arrayList21 = new ArrayList();
                            arrayList21.addAll(arrayList7);
                            mVar.v.add(arrayList21);
                            arrayList7.clear();
                            fm fmVar = new fm(5, mVar, arrayList21);
                            if (!mVar.C || isEmpty9) {
                                fmVar.run();
                            } else {
                                View view8 = ((f2.l) arrayList21.get(0)).a.a;
                                WeakHashMap weakHashMap2 = j0.a;
                                view8.postOnAnimationDelayed(fmVar, 0L);
                            }
                        }
                        if (!isEmpty12) {
                            ArrayList arrayList22 = new ArrayList();
                            arrayList22.addAll(arrayList8);
                            arrayList8.clear();
                            Collections.sort(arrayList22, new jn0(23));
                            int size5 = arrayList22.size();
                            int i26 = 0;
                            while (i26 < size5) {
                                int i27 = i26 + 1;
                                q1 q1Var4 = (q1) arrayList22.get(i26);
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("animate add impl");
                                }
                                View view9 = q1Var4.a;
                                arrayList9.add(q1Var4);
                                if (q1Var4 == mVar.O) {
                                    view9.setAlpha(1.0f);
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                if (view9 instanceof t1) {
                                    t1 t1Var3 = (t1) view9;
                                    if (t1Var3.getAnimationOffsetX() != 0.0f) {
                                        c1 c1Var = t1Var3.we;
                                        float[] fArr = new float[2];
                                        fArr[0] = t1Var3.getAnimationOffsetX();
                                        fArr[c10] = 0.0f;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(t1Var3, c1Var, fArr));
                                    }
                                    t1Var3.setPivotX(((t1Var3.getBackgroundDrawableRight() - t1Var3.getBackgroundDrawableLeft()) / 2.0f) + t1Var3.getBackgroundDrawableLeft());
                                    f10 = 0.0f;
                                    view9.animate().translationY(0.0f).setDuration(mVar.c).start();
                                } else {
                                    f10 = 0.0f;
                                    view9.animate().translationX(0.0f).translationY(0.0f).setDuration(mVar.c).start();
                                }
                                long max = (long) ((1.0f - Math.max(f10, Math.min(1.0f, view9.getBottom() / wk0Var.getMeasuredHeight()))) * 100.0f);
                                if (!(view9 instanceof t1)) {
                                    i10 = size5;
                                    arrayList = arrayList22;
                                    wk0Var2 = wk0Var;
                                    f11 = 1.0f;
                                } else if (q1Var4 == mVar.O) {
                                    yn ynVar = mVar.P;
                                    if (ynVar != null) {
                                        ynVar.h.setAlpha(0.0f);
                                    }
                                    wk0Var2 = wk0Var;
                                    wk0Var2.setClipChildren(false);
                                    final t1 t1Var4 = (t1) view9;
                                    View view10 = (View) mVar.P.getParent();
                                    float x10 = view10.getX() + mVar.P.getX() + mVar.P.h.getX();
                                    float y10 = view10.getY() + mVar.P.getY() + mVar.P.h.getY();
                                    float x11 = t1Var4.getX() + wk0Var2.getX() + t1Var4.getPhotoImage().getImageX();
                                    float y11 = t1Var4.getY() + wk0Var2.getY() + t1Var4.getPhotoImage().getImageY();
                                    final float width = mVar.P.h.getWidth();
                                    final float height = mVar.P.h.getHeight();
                                    final float imageWidth = t1Var4.getPhotoImage().getImageWidth();
                                    final float imageHeight = t1Var4.getPhotoImage().getImageHeight();
                                    final float f13 = x10 - x11;
                                    final float f14 = y10 - y11;
                                    final float imageX = t1Var4.getPhotoImage().getImageX();
                                    final float imageY = t1Var4.getPhotoImage().getImageY();
                                    t1Var4.getTransitionParams().f0 = true;
                                    t1Var4.getTransitionParams().J1 = true;
                                    t1Var4.getPhotoImage().setImageCoords(imageX + f13, imageX + f14, width, height);
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rh.d
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            t1 t1Var5 = t1.this;
                                            t1Var5.getTransitionParams().K1 = floatValue;
                                            if (t1Var5.getTransitionParams().K1 > 1.0f) {
                                                t1Var5.getTransitionParams().K1 = 1.0f;
                                            }
                                            float f15 = 1.0f - floatValue;
                                            t1Var5.getPhotoImage().setImageCoords((f13 * f15) + imageX, (f14 * f15) + imageY, (imageWidth * floatValue) + (width * f15), (imageHeight * floatValue) + (height * f15));
                                            t1Var5.invalidate();
                                        }
                                    });
                                    i10 = size5;
                                    arrayList = arrayList22;
                                    f11 = 1.0f;
                                    mVar = this;
                                    ofFloat2.addListener(new e(mVar, t1Var4, imageX, imageY, imageWidth, imageHeight));
                                    animatorSet.play(ofFloat2);
                                    max = max;
                                    z14 = false;
                                    view9.setAlpha(0.0f);
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), f11));
                                    if (z14) {
                                        view9.setScaleX(f11);
                                        view9.setScaleY(f11);
                                    } else {
                                        view9.setScaleX(0.9f);
                                        view9.setScaleY(0.9f);
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_Y, view9.getScaleY(), f11));
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_X, view9.getScaleX(), f11));
                                    }
                                    if (q1Var4 != mVar.O) {
                                        animatorSet.setDuration(350L);
                                        animatorSet.setInterpolator(new OvershootInterpolator());
                                    } else {
                                        animatorSet.setStartDelay(max);
                                        animatorSet.setDuration(250L);
                                    }
                                    animatorSet.addListener(new f(mVar, q1Var4, view9));
                                    hashMap.put(q1Var4, animatorSet);
                                    animatorSet.start();
                                    i26 = i27;
                                    wk0Var = wk0Var2;
                                    size5 = i10;
                                    arrayList22 = arrayList;
                                    c10 = 1;
                                } else {
                                    i10 = size5;
                                    arrayList = arrayList22;
                                    wk0Var2 = wk0Var;
                                    f11 = 1.0f;
                                    MessageObject.GroupedMessages currentMessagesGroup2 = ((t1) view9).getCurrentMessagesGroup();
                                    if (currentMessagesGroup2 != null) {
                                        Long valueOf = Long.valueOf(currentMessagesGroup2.groupId);
                                        HashMap hashMap2 = mVar.M;
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
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), f11));
                                if (z14) {
                                }
                                if (q1Var4 != mVar.O) {
                                }
                                animatorSet.addListener(new f(mVar, q1Var4, view9));
                                hashMap.put(q1Var4, animatorSet);
                                animatorSet.start();
                                i26 = i27;
                                wk0Var = wk0Var2;
                                size5 = i10;
                                arrayList22 = arrayList;
                                c10 = 1;
                            }
                            arrayList22.clear();
                        }
                    }
                } else {
                    z11 = isEmpty10;
                    wk0Var = wk0Var4;
                    z12 = isEmpty11;
                    j10 = 0;
                }
                z13 = false;
                size = arrayList5.size();
                boolean z212 = z13;
                i9 = 0;
                while (true) {
                    hashMap = mVar.J;
                    if (i9 < size) {
                    }
                }
                arrayList5.clear();
                if (!z11) {
                }
                if (!z12) {
                }
                if (!isEmpty12) {
                }
            }
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new g4(mVar, 18));
        ofFloat3.setDuration(mVar.d + 250);
        ofFloat3.start();
    }

    @Override // f2.n, f2.t1
    public final void p(q1 q1Var) {
        R(q1Var);
        View view = q1Var.a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof t1) {
            ((t1) view).getTransitionParams().h = true;
        }
        this.q.add(q1Var);
    }

    @Override // f2.n, f2.t1
    public final boolean q(q1 q1Var, q1 q1Var2, p pVar, int i9, int i10, int i11, int i12) {
        if (q1Var == q1Var2) {
            return r(q1Var, pVar, i9, i10, i11, i12);
        }
        View view = q1Var.a;
        float animationOffsetX = view instanceof t1 ? ((t1) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(q1Var);
        int i13 = (int) ((i11 - i9) - animationOffsetX);
        int i14 = (int) ((i12 - i10) - translationY);
        if (view instanceof t1) {
            ((t1) view).setAnimationOffsetX(animationOffsetX);
        } else {
            view.setTranslationX(animationOffsetX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = q1Var2.a;
        R(q1Var2);
        if (view2 instanceof t1) {
            ((t1) view2).setAnimationOffsetX(-i13);
        } else {
            view2.setTranslationX(-i13);
        }
        view2.setTranslationY(-i14);
        view2.setAlpha(0.0f);
        this.s.add(new f2.l(q1Var, q1Var2, i9, i10, i11, i12));
        F();
        return true;
    }

    @Override // f2.n, f2.t1
    public final boolean r(q1 q1Var, p pVar, int i9, int i10, int i11, int i12) {
        int translationX;
        int i13;
        t1 t1Var;
        w0 w0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        View view;
        int i14;
        float f15;
        boolean z10;
        MessageObject.GroupedMessages groupedMessages;
        int i15;
        boolean isOutOwner;
        View view2 = q1Var.a;
        if (view2 instanceof t1) {
            t1 t1Var2 = (t1) view2;
            translationX = i9 + ((int) t1Var2.getAnimationOffsetX());
            i13 = t1Var2.getTransitionParams().s2 != t1Var2.getTopMediaOffset() ? (t1Var2.getTransitionParams().s2 - t1Var2.getTopMediaOffset()) + i10 : i10;
            t1Var = t1Var2;
            w0Var = null;
        } else if (view2 instanceof w0) {
            translationX = i9 + ((int) view2.getTranslationX());
            i13 = i10;
            w0Var = (w0) view2;
            t1Var = null;
        } else {
            translationX = i9 + ((int) view2.getTranslationX());
            i13 = i10;
            t1Var = null;
            w0Var = null;
        }
        int i16 = translationX;
        int translationY = i13 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (t1Var != null) {
            float imageX = t1Var.getPhotoImage().getImageX();
            float imageY = t1Var.getPhotoImage().getImageY();
            f12 = t1Var.getPhotoImage().getImageWidth();
            float imageHeight = t1Var.getPhotoImage().getImageHeight();
            f10 = 0.0f;
            for (int i17 = 0; i17 < 4; i17++) {
                iArr[i17] = t1Var.getPhotoImage().getRoundRadius()[i17];
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
        R(q1Var);
        int i18 = i11 - i16;
        int i19 = i12 - translationY;
        if (i19 != 0) {
            view2.setTranslationY(-i19);
        }
        float f16 = f11;
        w0 w0Var2 = w0Var;
        float f17 = f12;
        l lVar = new l(q1Var, i16, translationY, i11, i12);
        if (t1Var != null) {
            s1 transitionParams = t1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.t0;
            Rect rect = transitionParams.D0;
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (i18 != 0) {
                t1Var.setAnimationOffsetX(-i18);
            }
            boolean z11 = pVar instanceof k;
            wk0 wk0Var = this.G;
            if (z11) {
                ImageReceiver photoImage = t1Var.getPhotoImage();
                view = view2;
                k kVar = (k) pVar;
                i14 = i18;
                boolean z12 = (!transitionParams.v0 || kVar.f == f10 || kVar.e == f10) ? false : true;
                lVar.n = z12;
                if (z12) {
                    wk0Var.setClipChildren(false);
                    wk0Var.invalidate();
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
                    int i20 = 0;
                    while (true) {
                        if (i20 >= 4) {
                            break;
                        }
                        if (iArr2[i20] != transitionParams.A0[i20]) {
                            transitionParams.B0 = true;
                            break;
                        }
                        i20++;
                    }
                    float f18 = transitionParams.m0;
                    float f19 = kVar.c;
                    if (f18 == f19 && transitionParams.n0 == kVar.d && transitionParams.p0 == kVar.f && transitionParams.o0 == kVar.e && !transitionParams.B0) {
                        transitionParams.f0 = false;
                        lVar.n = false;
                    } else {
                        lVar.o = f19;
                        lVar.p = kVar.d;
                        lVar.q = kVar.e;
                        lVar.r = kVar.f;
                        if (currentMessagesGroup != null) {
                            boolean z13 = currentMessagesGroup.hasCaption;
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            boolean z14 = transitionParams2.drawCaptionLayout;
                            if (z13 != z14) {
                                transitionParams2.captionEnterProgress = z14 ? 1.0f : 0.0f;
                            }
                        }
                        if (transitionParams.B0) {
                            if (transitionParams.A0 == photoImage.getRoundRadius()) {
                                transitionParams.A0 = new int[4];
                                for (int i21 = 0; i21 < 4; i21++) {
                                    transitionParams.A0[i21] = photoImage.getRoundRadius()[i21];
                                }
                            }
                            photoImage.setRoundRadius(iArr2);
                        }
                        t1Var.U3(lVar.o, lVar.p, lVar.q, lVar.r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.v0 && (((isOutOwner = t1Var.getMessageObject().isOutOwner()) && rect.left != t1Var.getBackgroundDrawableLeft()) || ((!isOutOwner && rect.right != t1Var.getBackgroundDrawableRight()) || rect.top != t1Var.getBackgroundDrawableTop() || rect.bottom != t1Var.getBackgroundDrawableBottom()))) {
                    lVar.v = t1Var.getBackgroundDrawableBottom() - rect.bottom;
                    lVar.u = t1Var.getBackgroundDrawableTop() - rect.top;
                    if (t1Var.C8 != transitionParams.E0) {
                        lVar.s = t1Var.getBackgroundDrawableLeft() - rect.left;
                        lVar.t = t1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (isOutOwner) {
                        lVar.s = t1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        lVar.t = t1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    lVar.l = true;
                    transitionParams.w0 = true;
                    transitionParams.g0 = -lVar.s;
                    transitionParams.h0 = -lVar.t;
                    transitionParams.j0 = -lVar.u;
                    transitionParams.i0 = -lVar.v;
                    wk0Var.setClipChildren(false);
                    wk0Var.invalidate();
                }
            } else {
                view = view2;
                i14 = i18;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    wk0 wk0Var2 = (wk0) view.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    boolean z15 = true;
                    int i22 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    while (i22 < wk0Var2.getChildCount()) {
                        View childAt = wk0Var2.getChildAt(i22);
                        if (childAt instanceof t1) {
                            t1 t1Var3 = (t1) childAt;
                            if (t1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !t1Var3.getMessageObject().deleted) {
                                int backgroundDrawableLeft = t1Var3.getBackgroundDrawableLeft() + t1Var3.getLeft();
                                groupedMessages = currentMessagesGroup;
                                int backgroundDrawableRight = t1Var3.getBackgroundDrawableRight() + t1Var3.getLeft();
                                i15 = i22;
                                int backgroundDrawableTop = t1Var3.getBackgroundDrawableTop() + t1Var3.getPaddingTop() + t1Var3.getTop();
                                int backgroundDrawableBottom = t1Var3.getBackgroundDrawableBottom() + t1Var3.getPaddingTop() + t1Var3.getTop();
                                if (i25 == 0 || backgroundDrawableLeft < i25) {
                                    i25 = backgroundDrawableLeft;
                                }
                                if (i26 == 0 || backgroundDrawableRight > i26) {
                                    i26 = backgroundDrawableRight;
                                }
                                if (t1Var3.getTransitionParams().v0 || transitionParams3.isNewGroup) {
                                    if (i23 == 0 || backgroundDrawableTop < i23) {
                                        i23 = backgroundDrawableTop;
                                    }
                                    if (i24 == 0 || backgroundDrawableBottom > i24) {
                                        i24 = backgroundDrawableBottom;
                                    }
                                    z15 = false;
                                }
                                i22 = i15 + 1;
                                currentMessagesGroup = groupedMessages;
                            }
                        }
                        groupedMessages = currentMessagesGroup;
                        i15 = i22;
                        i22 = i15 + 1;
                        currentMessagesGroup = groupedMessages;
                    }
                    transitionParams3.isNewGroup = false;
                    if (i23 == 0 && i24 == 0 && i25 == 0 && i26 == 0) {
                        lVar.j = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i27 = (-i23) + transitionParams3.top;
                        lVar.f = i27;
                        int i28 = (-i24) + transitionParams3.bottom;
                        lVar.g = i28;
                        int i29 = (-i25) + transitionParams3.left;
                        lVar.h = i29;
                        int i30 = (-i26) + transitionParams3.right;
                        lVar.i = i30;
                        lVar.j = true;
                        transitionParams3.backgroundChangeBounds = true;
                        transitionParams3.offsetTop = i27;
                        transitionParams3.offsetBottom = i28;
                        transitionParams3.offsetLeft = i29;
                        transitionParams3.offsetRight = i30;
                        transitionParams3.captionEnterProgress = transitionParams3.drawCaptionLayout ? 1.0f : 0.0f;
                        wk0Var2.setClipChildren(false);
                        wk0Var2.invalidate();
                    }
                    transitionParams3.drawBackgroundForDeletedItems = z15;
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
                    lVar.w = true;
                    transitionParams.w0 = true;
                    lVar.s = backgroundDrawableLeft2 - transitionParams4.left;
                    lVar.t = backgroundDrawableRight2 - transitionParams4.right;
                    lVar.u = backgroundDrawableTop2 - transitionParams4.top;
                    lVar.v = backgroundDrawableBottom2 - transitionParams4.bottom;
                    lVar.l = false;
                    transitionParams.g0 = (int) ((-r6) - t1Var.getAnimationOffsetX());
                    transitionParams.h0 = (int) ((-lVar.t) - t1Var.getAnimationOffsetX());
                    transitionParams.j0 = (int) ((-lVar.u) - t1Var.getTranslationY());
                    transitionParams.i0 = (int) ((-lVar.v) - t1Var.getTranslationY());
                    transitionParams.C0 = true;
                    wk0Var.setClipChildren(false);
                    wk0Var.invalidate();
                } else {
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition = t1Var.H;
            if (transitionParams.y0 != (t1Var.g8 || t1Var.F || (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && t1Var.G.isDocuments))) {
                z10 = true;
                lVar.k = true;
                f15 = 0.0f;
                transitionParams.z0 = 0.0f;
            } else {
                f15 = 0.0f;
                z10 = true;
            }
            boolean f20 = transitionParams.f();
            lVar.m = f20;
            if (f20) {
                transitionParams.g = z10;
                transitionParams.K1 = f15;
            }
            if (i14 == 0 && i19 == 0 && !lVar.n && !lVar.w && !lVar.j && !lVar.k && !lVar.l && !f20) {
                v(q1Var);
                return false;
            }
        } else if (w0Var2 != null) {
            v0 transitionParams5 = w0Var2.getTransitionParams();
            transitionParams5.getClass();
            if (i18 != 0) {
                view2.setTranslationX(-i18);
            }
            boolean a2 = !transitionParams5.a ? false : transitionParams5.d.y0.a();
            lVar.m = a2;
            if (a2) {
                transitionParams5.b = true;
                transitionParams5.c = 0.0f;
            }
            if (i18 == 0 && i19 == 0 && !a2) {
                v(q1Var);
                return false;
            }
        } else if (view2 instanceof h0) {
            ((h0) view2).setAnimating(true);
        } else if (view2 instanceof xa) {
            ((xa) view2).setAnimating(true);
        } else {
            if (i18 == 0 && i19 == 0) {
                v(q1Var);
                return false;
            }
            if (i18 != 0) {
                view2.setTranslationX(-i18);
            }
        }
        this.r.add(lVar);
        F();
        return true;
    }

    @Override // f2.n, f2.t1
    public final void s(q1 q1Var, p pVar) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        super.s(q1Var, pVar);
        View view = q1Var.a;
        if (pVar != null) {
            int i9 = pVar.b;
            int top = view.getTop();
            int left = view.getLeft() - pVar.a;
            if (top - i9 != 0) {
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
            if (pVar instanceof k) {
                k kVar = (k) pVar;
                t1Var.U3(kVar.c, kVar.d, kVar.e, kVar.f);
            }
        }
    }
}
