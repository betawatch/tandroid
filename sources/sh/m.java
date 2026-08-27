package sh;

import ag.t2;
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
import f2.l1;
import f2.o1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import jh.g3;
import lh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.e01;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.ye;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.aa1;
import org.telegram.ui.ck;
import org.telegram.ui.oh1;
import org.telegram.ui.rn;
import org.telegram.ui.sg;
import r0.j0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class m extends f2.l {
    public static final er V = new er(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final rn F;
    public final zk0 G;
    public boolean N;
    public o1 O;
    public wn P;
    public boolean Q;
    public final c6 R;
    public sg T;
    public sg U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public m(rn rnVar, zk0 zk0Var, c6 c6Var) {
        this.R = c6Var;
        this.F = rnVar;
        this.G = zk0Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override // f2.l
    public final void B(f2.j jVar) {
        f2.j jVar2;
        o1 o1Var = jVar.a;
        View view = o1Var == null ? null : o1Var.a;
        o1 o1Var2 = jVar.b;
        View view2 = o1Var2 != null ? o1Var2.a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(jVar.a);
            duration.translationX(jVar.e - jVar.c);
            duration.translationY(jVar.f - jVar.d);
            jVar2 = jVar;
            duration.alpha(0.0f).setListener(new j(this, jVar2, duration, view, 0)).start();
        } else {
            jVar2 = jVar;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(jVar2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new j(this, jVar2, animate, view2, 1)).start();
        }
    }

    @Override // f2.l
    public final void C(o1 o1Var, f2.k kVar) {
        T(o1Var, kVar, false);
    }

    @Override // f2.l
    public final boolean J(f2.j jVar, o1 o1Var) {
        f01 f01Var;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(o1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = o1Var.a;
        if (this.K.contains(view) && (f01Var = (f01) this.U.run()) != null) {
            f01Var.a(view);
        }
        if (jVar.b == o1Var) {
            jVar.b = null;
        } else {
            if (jVar.a != o1Var) {
                return false;
            }
            jVar.a = null;
        }
        X(view);
        d(o1Var);
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
    /* JADX WARN: Removed duplicated region for block: B:11:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(final o1 o1Var, f2.k kVar, boolean z10) {
        o1 o1Var2;
        r1 r1Var;
        s1 s1Var;
        int i10;
        float f10;
        boolean z11;
        final l lVar;
        final s1 s1Var2;
        r1 r1Var2;
        final int i11;
        final r1 r1Var3;
        ValueAnimator valueAnimator;
        final boolean z12;
        char c10;
        int[] iArr;
        int i12 = kVar.c;
        int i13 = kVar.e;
        View view = o1Var.a;
        int i14 = i13 - i12;
        AnimatorSet animatorSet = new AnimatorSet();
        int i15 = 0;
        final int i16 = 1;
        if (i14 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.z.add(o1Var);
        final l lVar2 = (l) kVar;
        rn rnVar = this.F;
        if (rnVar != null && (view instanceof h0)) {
            h0 h0Var = (h0) view;
            float translationY = h0Var.getTranslationY();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new g(this, h0Var, translationY, i15));
            animatorSet.playTogether(ofFloat);
        } else {
            if (rnVar == null || !(view instanceof ua)) {
                if (view instanceof s1) {
                    final s1 s1Var3 = (s1) view;
                    final r1 transitionParams = s1Var3.getTransitionParams();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(s1Var3, s1Var3.we, 0.0f));
                    if (lVar2.n) {
                        s1Var3.T3(lVar2.o, lVar2.p, lVar2.q, lVar2.r);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        final float f11 = s1Var3.getCurrentMessagesGroup() == null ? transitionParams.u0 : s1Var3.getCurrentMessagesGroup().transitionParams.captionEnterProgress;
                        final float O2 = s1Var3.getCurrentMessagesGroup() == null ? s1Var3.O2() : s1Var3.getCurrentMessagesGroup().hasCaption;
                        if (f11 != O2) {
                            valueAnimator = ofFloat2;
                            z12 = true;
                        } else {
                            valueAnimator = ofFloat2;
                            z12 = false;
                        }
                        if (transitionParams.B0) {
                            c10 = 0;
                            iArr = new int[4];
                            for (int i17 = 0; i17 < 4; i17++) {
                                iArr[i17] = s1Var3.getPhotoImage().getRoundRadius()[i17];
                            }
                        } else {
                            c10 = 0;
                            iArr = null;
                        }
                        final int[] iArr2 = iArr;
                        ValueAnimator valueAnimator2 = valueAnimator;
                        i10 = 2;
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: sh.a
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                l lVar3 = l.this;
                                float f12 = 1.0f - floatValue;
                                float f13 = lVar3.o * f12;
                                r1 r1Var4 = transitionParams;
                                float f14 = (r1Var4.m0 * floatValue) + f13;
                                float f15 = (r1Var4.n0 * floatValue) + (lVar3.p * f12);
                                float f16 = (r1Var4.o0 * floatValue) + (lVar3.q * f12);
                                float f17 = (r1Var4.p0 * floatValue) + (lVar3.r * f12);
                                boolean z13 = z12;
                                s1 s1Var4 = s1Var3;
                                if (z13) {
                                    float f18 = (O2 * floatValue) + (f11 * f12);
                                    r1Var4.u0 = f18;
                                    if (s1Var4.getCurrentMessagesGroup() != null) {
                                        s1Var4.getCurrentMessagesGroup().transitionParams.captionEnterProgress = f18;
                                    }
                                }
                                if (r1Var4.B0) {
                                    ImageReceiver photoImage = s1Var4.getPhotoImage();
                                    int[] iArr3 = iArr2;
                                    int[] iArr4 = r1Var4.A0;
                                    photoImage.setRoundRadius((int) ((iArr4[0] * floatValue) + (iArr3[0] * f12)), (int) ((iArr4[1] * floatValue) + (iArr3[1] * f12)), (int) ((iArr4[2] * floatValue) + (iArr3[2] * f12)), (int) ((iArr4[3] * floatValue) + (iArr3[3] * f12)));
                                }
                                s1Var4.T3(f14, f15, f16, f17);
                                o1Var.a.invalidate();
                            }
                        };
                        r1Var = transitionParams;
                        s1Var = s1Var3;
                        o1Var2 = o1Var;
                        valueAnimator2.addUpdateListener(animatorUpdateListener);
                        Animator[] animatorArr = new Animator[1];
                        animatorArr[c10] = valueAnimator2;
                        animatorSet.playTogether(animatorArr);
                    } else {
                        r1Var = transitionParams;
                        s1Var = s1Var3;
                        o1Var2 = o1Var;
                        i10 = 2;
                    }
                    if (lVar2.v == 0 && lVar2.t == 0 && lVar2.u == 0 && lVar2.s == 0) {
                        f10 = 0.0f;
                        r1Var.k0 = 0.0f;
                        r1Var.l0 = 0.0f;
                        z11 = false;
                    } else {
                        f10 = 0.0f;
                        zk0 zk0Var = this.G;
                        zk0Var.setClipChildren(false);
                        zk0Var.invalidate();
                        float[] fArr = new float[i10];
                        // fill-array-data instruction
                        fArr[0] = 1.0f;
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr);
                        if (lVar2.l) {
                            r1Var.k0 = -lVar2.s;
                            r1Var.l0 = -lVar2.t;
                        } else {
                            r1Var.k0 = (-lVar2.s) - s1Var.getAnimationOffsetX();
                            r1Var.l0 = (-lVar2.t) - s1Var.getAnimationOffsetX();
                        }
                        ofFloat3.addUpdateListener(new g3(lVar2, r1Var, s1Var, 3));
                        z11 = false;
                        animatorSet.playTogether(ofFloat3);
                    }
                    MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        lVar2.j = z11;
                    }
                    if (lVar2.j) {
                        float[] fArr2 = new float[i10];
                        // fill-array-data instruction
                        fArr2[0] = 1.0f;
                        fArr2[1] = 0.0f;
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(fArr2);
                        r1 r1Var4 = r1Var;
                        final MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                        final zk0 zk0Var2 = (zk0) view.getParent();
                        final float f12 = currentMessagesGroup.transitionParams.captionEnterProgress;
                        if (currentMessagesGroup.hasCaption) {
                            f10 = 1.0f;
                        }
                        final boolean z13 = f12 != f10;
                        r1Var2 = r1Var4;
                        final float f13 = f10;
                        lVar = lVar2;
                        s1Var2 = s1Var;
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sh.b
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
                                    transitionParams3.captionEnterProgress = com.google.android.recaptcha.internal.a.z(1.0f, floatValue, f13, f12 * floatValue);
                                }
                                zk0 zk0Var3 = zk0Var2;
                                if (zk0Var3 != null) {
                                    zk0Var3.invalidate();
                                }
                            }
                        });
                        ofFloat4.addListener(new h(transitionParams2));
                        i11 = 0;
                        animatorSet.playTogether(ofFloat4);
                    } else {
                        lVar = lVar2;
                        s1Var2 = s1Var;
                        r1Var2 = r1Var;
                        i11 = 0;
                    }
                    if (lVar.k) {
                        float[] fArr3 = new float[i10];
                        // fill-array-data instruction
                        fArr3[0] = 0.0f;
                        fArr3[1] = 1.0f;
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(fArr3);
                        r1Var3 = r1Var2;
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sh.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i11) {
                                    case 0:
                                        r1Var3.z0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        s1Var2.invalidate();
                                        break;
                                    default:
                                        r1Var3.K1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        s1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i11] = ofFloat5;
                        animatorSet.playTogether(animatorArr2);
                    } else {
                        r1Var3 = r1Var2;
                    }
                    if (lVar.m) {
                        float[] fArr4 = new float[i10];
                        // fill-array-data instruction
                        fArr4[0] = 0.0f;
                        fArr4[1] = 1.0f;
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(fArr4);
                        r1Var3.g = true;
                        ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sh.c
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i16) {
                                    case 0:
                                        r1Var3.z0 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        s1Var2.invalidate();
                                        break;
                                    default:
                                        r1Var3.K1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        s1Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        animatorSet.playTogether(ofFloat6);
                    }
                } else {
                    o1Var2 = o1Var;
                    if (view instanceof v0) {
                        v0 v0Var = (v0) view;
                        u0 transitionParams3 = v0Var.getTransitionParams();
                        if (lVar2.m) {
                            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            transitionParams3.b = true;
                            ofFloat7.addUpdateListener(new t2(28, transitionParams3, v0Var));
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
                animatorSet.addListener(new i(this, o1Var2, i14, view));
                animatorSet.start();
                this.J.put(o1Var2, animatorSet);
            }
            ua uaVar = (ua) view;
            float translationY2 = uaVar.getTranslationY();
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat8.addUpdateListener(new g(this, uaVar, translationY2, i16));
            animatorSet.playTogether(ofFloat8);
        }
        o1Var2 = o1Var;
        if (z10) {
        }
        animatorSet.setDuration((long) (250 * (z10 ? 1.9f : 1.0f)));
        animatorSet.addListener(new i(this, o1Var2, i14, view));
        animatorSet.start();
        this.J.put(o1Var2, animatorSet);
    }

    public final void U() {
        f01 f01Var;
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
        if (this.K.isEmpty() || (f01Var = (f01) this.U.run()) == null) {
            return;
        }
        ArrayList arrayList2 = f01Var.c;
        if (f01Var.e) {
            return;
        }
        f01Var.e = true;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            e01 e01Var = (e01) obj2;
            Runnable runnable = e01Var.d;
            if (runnable != null) {
                f01.b(runnable);
                e01Var.d = null;
            }
        }
        arrayList2.clear();
        d01 d01Var = f01Var.a;
        if (d01Var != null) {
            d01Var.i();
        }
        Runnable runnable2 = f01Var.d;
        if (runnable2 != null) {
            f01Var.d = null;
            f01.b(runnable2);
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
            zk0 zk0Var = this.G;
            int childCount = zk0Var.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = zk0Var.getChildAt(i10);
                if (childAt instanceof s1) {
                    s1 s1Var = (s1) childAt;
                    MessageObject messageObject = s1Var.getMessageObject();
                    if (s1Var.getTransitionParams().v0 && groupedMessages.messages.contains(messageObject)) {
                        groupedMessages.transitionParams.top = s1Var.getBackgroundDrawableTop() + s1Var.getPaddingTop() + s1Var.getTop();
                        groupedMessages.transitionParams.bottom = s1Var.getBackgroundDrawableBottom() + s1Var.getPaddingTop() + s1Var.getTop();
                        groupedMessages.transitionParams.left = s1Var.getBackgroundDrawableLeft() + s1Var.getLeft();
                        groupedMessages.transitionParams.right = s1Var.getBackgroundDrawableRight() + s1Var.getLeft();
                        groupedMessages.transitionParams.drawCaptionLayout = s1Var.O2();
                        groupedMessages.transitionParams.pinnedTop = s1Var.m3();
                        groupedMessages.transitionParams.pinnedBotton = s1Var.l3();
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
        boolean z10 = view instanceof h0;
        zk0 zk0Var = this.G;
        if (z10) {
            int measuredHeight = (zk0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((h0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof ua) {
            int measuredHeight2 = (zk0Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((ua) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof s1) {
            s1 s1Var = (s1) view;
            s1Var.getTransitionParams().j();
            s1Var.setAnimationOffsetX(0.0f);
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

    public final void Y(sg sgVar, sg sgVar2) {
        this.T = sgVar;
        this.U = sgVar2;
    }

    public final boolean Z(View view) {
        o1 T;
        if (this.N || (T = this.G.T(view)) == null) {
            return false;
        }
        return this.q.contains(T) || this.y.contains(T);
    }

    @Override // f2.r1, f2.v0
    public final boolean a(o1 o1Var, p pVar, p pVar2) {
        ArrayList arrayList;
        int i10;
        boolean a2 = super.a(o1Var, pVar, pVar2);
        if (a2 && this.N) {
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                arrayList = this.q;
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((o1) arrayList.get(i11)).c() == 0) {
                    z10 = true;
                }
                i11++;
            }
            if (z10) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    i10 += ((o1) arrayList.get(i12)).a.getHeight();
                }
            } else {
                i10 = 0;
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((o1) arrayList.get(i13)).a.setTranslationY(i10);
            }
        }
        return a2;
    }

    public final boolean a0(View view) {
        o1 T = this.G.T(view);
        if (T != null) {
            return this.p.contains(T) || this.A.contains(T);
        }
        return false;
    }

    @Override // f2.l, f2.v0
    public final void f(o1 o1Var) {
        f01 f01Var;
        Animator animator = (Animator) this.J.remove(o1Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = o1Var.a;
        if (this.K.contains(view) && (f01Var = (f01) this.U.run()) != null) {
            f01Var.a(view);
        }
        super.f(o1Var);
        X(view);
    }

    @Override // f2.l, f2.v0
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
        wn wnVar = this.P;
        if (wnVar != null) {
            wnVar.h.setAlpha(1.0f);
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
            o1 o1Var = (o1) arrayList3.get(size3);
            X(o1Var.a);
            d(o1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            o1 o1Var2 = (o1) arrayList4.get(size4);
            X(o1Var2.a);
            u(o1Var2);
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
                    o1 o1Var3 = (o1) arrayList9.get(size9);
                    X(o1Var3.a);
                    u(o1Var3);
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

    @Override // f2.v0
    public final long i() {
        return 250L;
    }

    @Override // f2.v0
    public final long j() {
        return 250L;
    }

    @Override // f2.v0
    public final p l(l1 l1Var, o1 o1Var, int i10, List list) {
        p l10 = super.l(l1Var, o1Var, i10, list);
        View view = o1Var.a;
        if (!(view instanceof s1)) {
            return l10;
        }
        k kVar = new k();
        kVar.a = l10.a;
        kVar.b = l10.b;
        r1 transitionParams = ((s1) view).getTransitionParams();
        kVar.c = transitionParams.a;
        kVar.d = transitionParams.b;
        kVar.e = transitionParams.c;
        kVar.f = transitionParams.d;
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0483 A[EDGE_INSN: B:225:0x0483->B:226:0x0483 BREAK  A[LOOP:9: B:194:0x03cb->B:218:0x0477], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0200  */
    @Override // f2.l, f2.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int size;
        int i10;
        HashMap hashMap;
        float f10;
        int i11;
        boolean z15;
        ArrayList arrayList2;
        int i12;
        int i13;
        boolean z16;
        ArrayList arrayList3;
        ArrayList arrayList4;
        sg sgVar;
        int i14;
        MessageObject.GroupedMessages currentMessagesGroup;
        boolean z17;
        boolean z18;
        ArrayList arrayList5;
        boolean z19;
        MessageObject messageObject;
        sg sgVar2;
        int i15;
        int i16;
        boolean z20;
        rn rnVar;
        Runnable runnable;
        ye yeVar;
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
        boolean z21 = this.N;
        zk0 zk0Var = this.G;
        if (z21) {
            z10 = false;
            while (i17 < arrayList9.size()) {
                if (this.Q) {
                    i17 = ((o1) arrayList9.get(i17)).c() != (zk0Var.getAdapter() == null ? 0 : zk0Var.getAdapter().h()) - 1 ? i17 + 1 : 0;
                    z10 = true;
                } else {
                    if (((o1) arrayList9.get(i17)).c() != 0) {
                    }
                    z10 = true;
                }
            }
        } else {
            z10 = false;
        }
        W();
        ArrayList arrayList10 = this.y;
        float f11 = 1.0f;
        if (z10) {
            boolean isEmpty5 = arrayList6.isEmpty();
            boolean isEmpty6 = arrayList7.isEmpty();
            boolean isEmpty7 = arrayList8.isEmpty();
            boolean isEmpty8 = arrayList9.isEmpty();
            if (!isEmpty5 || !isEmpty6 || !isEmpty8 || !isEmpty7) {
                int i18 = 0;
                while (i15 < arrayList9.size()) {
                    View view = ((o1) arrayList9.get(i15)).a;
                    if (view instanceof s1) {
                        s1 s1Var = (s1) view;
                        i15 = (s1Var.getCurrentPosition() != null && (s1Var.getCurrentPosition().flags & 1) == 0) ? i15 + 1 : 0;
                    }
                    i18 += ((o1) arrayList9.get(i15)).a.getHeight();
                }
                int size2 = arrayList6.size();
                int i19 = 0;
                while (i19 < size2) {
                    Object obj = arrayList6.get(i19);
                    i19++;
                    D((o1) obj);
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
                        o1 o1Var = (o1) arrayList12.get(i21);
                        View view2 = o1Var.a;
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList10.add(o1Var);
                        view2.setTranslationY(i18);
                        View view3 = o1Var.a;
                        view3.setScaleX(f11);
                        view3.setScaleY(f11);
                        s1 s1Var2 = view3 instanceof s1 ? (s1) view3 : null;
                        if (s1Var2 == null || !s1Var2.getTransitionParams().x0) {
                            view3.setAlpha(f11);
                        }
                        rn rnVar2 = this.F;
                        if (rnVar2 != null) {
                            ArrayList arrayList13 = rnVar2.q4;
                            if (s1Var2 != null && arrayList13.contains(s1Var2.getMessageObject())) {
                                arrayList13.remove(s1Var2.getMessageObject());
                                ck ckVar = rnVar2.U;
                                if (ckVar.b0 == null || !((yeVar = ckVar.H0) == null || yeVar.m0)) {
                                    i16 = size4;
                                } else {
                                    i16 = size4;
                                    if (System.currentTimeMillis() - ckVar.I0 > 300) {
                                        z20 = true;
                                        ckVar.I0 = -1L;
                                        if (z20) {
                                            if (s1Var2.getMessageObject().isVoice()) {
                                                if (Math.abs(view2.getTranslationY()) < view2.getMeasuredHeight() * 3.0f) {
                                                    new oh1(s1Var2, rnVar2.U, this.G, rnVar2.I9, this.R).f.start();
                                                }
                                            } else if (SharedConfig.getDevicePerformanceClass() != 0 && Math.abs(view2.getTranslationY()) < zk0Var.getMeasuredHeight()) {
                                                rnVar = rnVar2;
                                                ValueAnimator valueAnimator = new aa1(s1Var2, rnVar2, this.G, rnVar2.I9, this.R).d;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                                ck ckVar2 = rnVar.U;
                                                runnable = ckVar2.b0;
                                                if (runnable != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(runnable);
                                                    ckVar2.c0 = true;
                                                    ckVar2.b0.run();
                                                    ckVar2.b0 = null;
                                                    animate.translationY(0.0f).setDuration(250L).setInterpolator(this.o).setListener(new ls((f2.l) this, o1Var, (Object) view2, (Object) animate, 5)).start();
                                                    i18 = i18;
                                                    i21 = i22;
                                                    size4 = i16;
                                                    f11 = 1.0f;
                                                }
                                            }
                                            rnVar = rnVar2;
                                            ck ckVar22 = rnVar.U;
                                            runnable = ckVar22.b0;
                                            if (runnable != null) {
                                            }
                                        }
                                        animate.translationY(0.0f).setDuration(250L).setInterpolator(this.o).setListener(new ls((f2.l) this, o1Var, (Object) view2, (Object) animate, 5)).start();
                                        i18 = i18;
                                        i21 = i22;
                                        size4 = i16;
                                        f11 = 1.0f;
                                    }
                                }
                                z20 = false;
                                ckVar.I0 = -1L;
                                if (z20) {
                                }
                                animate.translationY(0.0f).setDuration(250L).setInterpolator(this.o).setListener(new ls((f2.l) this, o1Var, (Object) view2, (Object) animate, 5)).start();
                                i18 = i18;
                                i21 = i22;
                                size4 = i16;
                                f11 = 1.0f;
                            }
                        }
                        i16 = size4;
                        animate.translationY(0.0f).setDuration(250L).setInterpolator(this.o).setListener(new ls((f2.l) this, o1Var, (Object) view2, (Object) animate, 5)).start();
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
                boolean z22 = (this.U == null || (sgVar2 = this.T) == null || !((Boolean) sgVar2.run()).booleanValue()) ? false : true;
                ArrayList arrayList14 = this.K;
                ArrayList arrayList15 = this.A;
                char c10 = 1;
                ArrayList arrayList16 = this.S;
                if (z22) {
                    LongSparseArray longSparseArray = null;
                    int i23 = 0;
                    while (i23 < arrayList6.size()) {
                        o1 o1Var2 = (o1) arrayList6.get(i23);
                        if (arrayList16.contains(o1Var2)) {
                            z17 = isEmpty10;
                            View view4 = o1Var2.a;
                            z18 = isEmpty11;
                            if ((view4 instanceof s1) && ((s1) view4).getCurrentMessagesGroup() != null && (messageObject = ((s1) o1Var2.a).getMessageObject()) != null && messageObject.getGroupId() != 0) {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                arrayList5 = arrayList10;
                                z19 = z22;
                                ArrayList arrayList17 = (ArrayList) longSparseArray.get(messageObject.getGroupId());
                                if (arrayList17 == null) {
                                    long groupId = messageObject.getGroupId();
                                    ArrayList arrayList18 = new ArrayList();
                                    longSparseArray.put(groupId, arrayList18);
                                    arrayList17 = arrayList18;
                                }
                                arrayList16.remove(o1Var2);
                                arrayList6.remove(i23);
                                i23--;
                                arrayList17.add(o1Var2);
                                i23++;
                                z22 = z19;
                                isEmpty10 = z17;
                                isEmpty11 = z18;
                                arrayList10 = arrayList5;
                            }
                        } else {
                            z17 = isEmpty10;
                            z18 = isEmpty11;
                        }
                        arrayList5 = arrayList10;
                        z19 = z22;
                        i23++;
                        z22 = z19;
                        isEmpty10 = z17;
                        isEmpty11 = z18;
                        arrayList10 = arrayList5;
                    }
                    z11 = isEmpty10;
                    z12 = isEmpty11;
                    arrayList = arrayList10;
                    z13 = z22;
                    if (longSparseArray != null) {
                        int i24 = 0;
                        z14 = false;
                        while (i24 < longSparseArray.size()) {
                            ArrayList arrayList19 = (ArrayList) longSparseArray.valueAt(i24);
                            if (arrayList19.size() > 0) {
                                View view5 = ((o1) arrayList19.get(0)).a;
                                if (!(view5 instanceof s1) || (currentMessagesGroup = ((s1) view5).getCurrentMessagesGroup()) == null || currentMessagesGroup.messages.size() <= arrayList19.size()) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("animate remove group impl with thanos");
                                    }
                                    arrayList15.addAll(arrayList19);
                                    f01 f01Var = (f01) this.U.run();
                                    for (int i25 = 0; i25 < arrayList19.size(); i25++) {
                                    }
                                    ArrayList arrayList20 = new ArrayList();
                                    i14 = i24;
                                    for (int i26 = 0; i26 < arrayList19.size(); i26++) {
                                        arrayList20.add(((o1) arrayList19.get(i26)).a);
                                    }
                                    qf.a aVar = new qf.a(this, arrayList20, arrayList19, 12);
                                    d01 d01Var = f01Var.a;
                                    if (d01Var != null) {
                                        d01Var.f(arrayList20, aVar);
                                        Choreographer.getInstance().postFrameCallback(f01Var.b);
                                    } else {
                                        f01Var.c.add(new e01(arrayList20, aVar));
                                    }
                                    arrayList14.add((View) arrayList20.get(0));
                                    zk0Var.B0();
                                    z14 = true;
                                    i24 = i14 + 1;
                                } else {
                                    arrayList6.addAll(arrayList19);
                                }
                            }
                            i14 = i24;
                            i24 = i14 + 1;
                        }
                        size = arrayList6.size();
                        boolean z23 = z14;
                        i10 = 0;
                        while (true) {
                            hashMap = this.J;
                            if (i10 < size) {
                                break;
                            }
                            Object obj3 = arrayList6.get(i10);
                            int i27 = i10 + 1;
                            o1 o1Var3 = (o1) obj3;
                            boolean z24 = arrayList16.remove(o1Var3) && z13;
                            if (BuildVars.LOGS_ENABLED) {
                                arrayList2 = arrayList6;
                                i12 = size;
                                FileLog.d("animate remove impl ".concat(z24 ? " with thanos" : ""));
                            } else {
                                arrayList2 = arrayList6;
                                i12 = size;
                            }
                            View view6 = o1Var3.a;
                            arrayList15.add(o1Var3);
                            if (!z24 || (sgVar = this.U) == null) {
                                i13 = i27;
                                z16 = z13;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view6, (Property<View, Float>) View.ALPHA, view6.getAlpha(), 0.0f);
                                arrayList3 = arrayList15;
                                arrayList4 = arrayList16;
                                ofFloat.setDuration(this.d);
                                ofFloat.addListener(new f(this, view6, o1Var3));
                                hashMap.put(o1Var3, ofFloat);
                                ofFloat.start();
                            } else {
                                f01 f01Var2 = (f01) sgVar.run();
                                i13 = i27;
                                qf.a aVar2 = new qf.a(this, view6, o1Var3, 13);
                                d01 d01Var2 = f01Var2.a;
                                if (d01Var2 != null) {
                                    d01Var2.e(view6, 1.0f, aVar2);
                                    Choreographer.getInstance().postFrameCallback(f01Var2.b);
                                } else {
                                    f01Var2.c.add(new e01(view6, aVar2));
                                }
                                arrayList14.add(view6);
                                z16 = z13;
                                arrayList3 = arrayList15;
                                arrayList4 = arrayList16;
                            }
                            zk0Var.B0();
                            if (z24) {
                                z23 = true;
                            }
                            arrayList15 = arrayList3;
                            arrayList16 = arrayList4;
                            size = i12;
                            arrayList6 = arrayList2;
                            i10 = i13;
                            z13 = z16;
                        }
                        arrayList6.clear();
                        if (!z11) {
                            ArrayList arrayList21 = new ArrayList();
                            arrayList21.addAll(arrayList7);
                            this.u.add(arrayList21);
                            arrayList7.clear();
                            hc.k kVar2 = new hc.k(this, arrayList21, z23, 2);
                            if (!this.C || isEmpty9) {
                                kVar2.run();
                            } else {
                                View view7 = ((f2.k) arrayList21.get(0)).a.a;
                                WeakHashMap weakHashMap = j0.a;
                                view7.postOnAnimationDelayed(kVar2, 0L);
                            }
                        }
                        if (!z12) {
                            ArrayList arrayList22 = new ArrayList();
                            arrayList22.addAll(arrayList8);
                            this.v.add(arrayList22);
                            arrayList8.clear();
                            o0.m mVar = new o0.m(this, arrayList22, false, 6);
                            if (!this.C || isEmpty9) {
                                mVar.run();
                            } else {
                                View view8 = ((f2.j) arrayList22.get(0)).a.a;
                                WeakHashMap weakHashMap2 = j0.a;
                                view8.postOnAnimationDelayed(mVar, 0L);
                            }
                        }
                        if (!isEmpty12) {
                            ArrayList arrayList23 = new ArrayList();
                            arrayList23.addAll(arrayList9);
                            arrayList9.clear();
                            Collections.sort(arrayList23, new lp0(25));
                            int size5 = arrayList23.size();
                            int i28 = 0;
                            while (i28 < size5) {
                                int i29 = i28 + 1;
                                o1 o1Var4 = (o1) arrayList23.get(i28);
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("animate add impl");
                                }
                                View view9 = o1Var4.a;
                                ArrayList arrayList24 = arrayList;
                                arrayList24.add(o1Var4);
                                if (o1Var4 == this.O) {
                                    view9.setAlpha(1.0f);
                                }
                                AnimatorSet animatorSet = new AnimatorSet();
                                if (view9 instanceof s1) {
                                    s1 s1Var3 = (s1) view9;
                                    if (s1Var3.getAnimationOffsetX() != 0.0f) {
                                        b1 b1Var = s1Var3.we;
                                        float[] fArr = new float[2];
                                        fArr[0] = s1Var3.getAnimationOffsetX();
                                        fArr[c10] = 0.0f;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(s1Var3, b1Var, fArr));
                                    }
                                    s1Var3.setPivotX(((s1Var3.getBackgroundDrawableRight() - s1Var3.getBackgroundDrawableLeft()) / 2.0f) + s1Var3.getBackgroundDrawableLeft());
                                    f10 = 0.0f;
                                    view9.animate().translationY(0.0f).setDuration(this.c).start();
                                } else {
                                    f10 = 0.0f;
                                    view9.animate().translationX(0.0f).translationY(0.0f).setDuration(this.c).start();
                                }
                                long max = (long) ((1.0f - Math.max(f10, Math.min(1.0f, view9.getBottom() / zk0Var.getMeasuredHeight()))) * 100.0f);
                                if (!(view9 instanceof s1)) {
                                    i11 = size5;
                                } else if (o1Var4 == this.O) {
                                    wn wnVar = this.P;
                                    if (wnVar != null) {
                                        wnVar.h.setAlpha(0.0f);
                                    }
                                    zk0Var.setClipChildren(false);
                                    final s1 s1Var4 = (s1) view9;
                                    View view10 = (View) this.P.getParent();
                                    float x8 = view10.getX() + this.P.getX() + this.P.h.getX();
                                    float y10 = view10.getY() + this.P.getY() + this.P.h.getY();
                                    float x10 = s1Var4.getX() + zk0Var.getX() + s1Var4.getPhotoImage().getImageX();
                                    float y11 = s1Var4.getY() + zk0Var.getY() + s1Var4.getPhotoImage().getImageY();
                                    final float width = this.P.h.getWidth();
                                    final float height = this.P.h.getHeight();
                                    final float imageWidth = s1Var4.getPhotoImage().getImageWidth();
                                    final float imageHeight = s1Var4.getPhotoImage().getImageHeight();
                                    final float f12 = x8 - x10;
                                    final float f13 = y10 - y11;
                                    final float imageX = s1Var4.getPhotoImage().getImageX();
                                    final float imageY = s1Var4.getPhotoImage().getImageY();
                                    s1Var4.getTransitionParams().f0 = true;
                                    s1Var4.getTransitionParams().J1 = true;
                                    s1Var4.getPhotoImage().setImageCoords(imageX + f12, imageX + f13, width, height);
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sh.d
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            s1 s1Var5 = s1.this;
                                            s1Var5.getTransitionParams().K1 = floatValue;
                                            if (s1Var5.getTransitionParams().K1 > 1.0f) {
                                                s1Var5.getTransitionParams().K1 = 1.0f;
                                            }
                                            float f14 = 1.0f - floatValue;
                                            s1Var5.getPhotoImage().setImageCoords((f12 * f14) + imageX, (f13 * f14) + imageY, (imageWidth * floatValue) + (width * f14), (imageHeight * floatValue) + (height * f14));
                                            s1Var5.invalidate();
                                        }
                                    });
                                    i11 = size5;
                                    ofFloat2.addListener(new e(this, s1Var4, imageX, imageY, imageWidth, imageHeight));
                                    animatorSet.play(ofFloat2);
                                    max = max;
                                    z15 = false;
                                    view9.setAlpha(0.0f);
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), 1.0f));
                                    if (z15) {
                                        view9.setScaleX(1.0f);
                                        view9.setScaleY(1.0f);
                                    } else {
                                        view9.setScaleX(0.9f);
                                        view9.setScaleY(0.9f);
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_Y, view9.getScaleY(), 1.0f));
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.SCALE_X, view9.getScaleX(), 1.0f));
                                    }
                                    if (o1Var4 != this.O) {
                                        animatorSet.setDuration(350L);
                                        animatorSet.setInterpolator(new OvershootInterpolator());
                                    } else {
                                        animatorSet.setStartDelay(max);
                                        animatorSet.setDuration(250L);
                                    }
                                    animatorSet.addListener(new f(this, o1Var4, view9));
                                    hashMap.put(o1Var4, animatorSet);
                                    animatorSet.start();
                                    i28 = i29;
                                    arrayList = arrayList24;
                                    size5 = i11;
                                    c10 = 1;
                                } else {
                                    i11 = size5;
                                    MessageObject.GroupedMessages currentMessagesGroup2 = ((s1) view9).getCurrentMessagesGroup();
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
                                z15 = true;
                                view9.setAlpha(0.0f);
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view9, (Property<View, Float>) View.ALPHA, view9.getAlpha(), 1.0f));
                                if (z15) {
                                }
                                if (o1Var4 != this.O) {
                                }
                                animatorSet.addListener(new f(this, o1Var4, view9));
                                hashMap.put(o1Var4, animatorSet);
                                animatorSet.start();
                                i28 = i29;
                                arrayList = arrayList24;
                                size5 = i11;
                                c10 = 1;
                            }
                            arrayList23.clear();
                        }
                    }
                } else {
                    z11 = isEmpty10;
                    z12 = isEmpty11;
                    arrayList = arrayList10;
                    z13 = z22;
                }
                z14 = false;
                size = arrayList6.size();
                boolean z232 = z14;
                i10 = 0;
                while (true) {
                    hashMap = this.J;
                    if (i10 < size) {
                    }
                    arrayList15 = arrayList3;
                    arrayList16 = arrayList4;
                    size = i12;
                    arrayList6 = arrayList2;
                    i10 = i13;
                    z13 = z16;
                }
                arrayList6.clear();
                if (!z11) {
                }
                if (!z12) {
                }
                if (!isEmpty12) {
                }
            }
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new m2(this, 21));
        ofFloat3.setDuration(this.d + 250);
        ofFloat3.start();
    }

    @Override // f2.l, f2.r1
    public final void p(o1 o1Var) {
        R(o1Var);
        View view = o1Var.a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof s1) {
            ((s1) view).getTransitionParams().h = true;
        }
        this.q.add(o1Var);
    }

    @Override // f2.l, f2.r1
    public final boolean q(o1 o1Var, o1 o1Var2, p pVar, int i10, int i11, int i12, int i13) {
        if (o1Var == o1Var2) {
            return r(o1Var, pVar, i10, i11, i12, i13);
        }
        View view = o1Var.a;
        float animationOffsetX = view instanceof s1 ? ((s1) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(o1Var);
        int i14 = (int) ((i12 - i10) - animationOffsetX);
        int i15 = (int) ((i13 - i11) - translationY);
        if (view instanceof s1) {
            ((s1) view).setAnimationOffsetX(animationOffsetX);
        } else {
            view.setTranslationX(animationOffsetX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = o1Var2.a;
        R(o1Var2);
        if (view2 instanceof s1) {
            ((s1) view2).setAnimationOffsetX(-i14);
        } else {
            view2.setTranslationX(-i14);
        }
        view2.setTranslationY(-i15);
        view2.setAlpha(0.0f);
        this.s.add(new f2.j(o1Var, o1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override // f2.l, f2.r1
    public final boolean r(o1 o1Var, p pVar, int i10, int i11, int i12, int i13) {
        int translationX;
        int i14;
        s1 s1Var;
        v0 v0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        View view;
        int i15;
        float f15;
        boolean z10;
        MessageObject.GroupedMessages groupedMessages;
        int i16;
        boolean isOutOwner;
        View view2 = o1Var.a;
        if (view2 instanceof s1) {
            s1 s1Var2 = (s1) view2;
            translationX = i10 + ((int) s1Var2.getAnimationOffsetX());
            i14 = s1Var2.getTransitionParams().s2 != s1Var2.getTopMediaOffset() ? (s1Var2.getTransitionParams().s2 - s1Var2.getTopMediaOffset()) + i11 : i11;
            s1Var = s1Var2;
            v0Var = null;
        } else if (view2 instanceof v0) {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            v0Var = (v0) view2;
            s1Var = null;
        } else {
            translationX = i10 + ((int) view2.getTranslationX());
            i14 = i11;
            s1Var = null;
            v0Var = null;
        }
        int i17 = translationX;
        int translationY = i14 + ((int) view2.getTranslationY());
        int[] iArr = new int[4];
        if (s1Var != null) {
            float imageX = s1Var.getPhotoImage().getImageX();
            float imageY = s1Var.getPhotoImage().getImageY();
            f12 = s1Var.getPhotoImage().getImageWidth();
            float imageHeight = s1Var.getPhotoImage().getImageHeight();
            f10 = 0.0f;
            for (int i18 = 0; i18 < 4; i18++) {
                iArr[i18] = s1Var.getPhotoImage().getRoundRadius()[i18];
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
        R(o1Var);
        int i19 = i12 - i17;
        int i20 = i13 - translationY;
        if (i20 != 0) {
            view2.setTranslationY(-i20);
        }
        float f16 = f11;
        v0 v0Var2 = v0Var;
        float f17 = f12;
        l lVar = new l(o1Var, i17, translationY, i12, i13);
        if (s1Var != null) {
            r1 transitionParams = s1Var.getTransitionParams();
            transitionParams.getClass();
            int[] iArr2 = transitionParams.t0;
            Rect rect = transitionParams.D0;
            MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
            if (i19 != 0) {
                s1Var.setAnimationOffsetX(-i19);
            }
            boolean z11 = pVar instanceof k;
            zk0 zk0Var = this.G;
            if (z11) {
                ImageReceiver photoImage = s1Var.getPhotoImage();
                view = view2;
                k kVar = (k) pVar;
                i15 = i19;
                boolean z12 = (!transitionParams.v0 || kVar.f == f10 || kVar.e == f10) ? false : true;
                lVar.n = z12;
                if (z12) {
                    zk0Var.setClipChildren(false);
                    zk0Var.invalidate();
                    transitionParams.f0 = true;
                    if (s1Var.getMessageObject().isRoundVideo()) {
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
                                for (int i22 = 0; i22 < 4; i22++) {
                                    transitionParams.A0[i22] = photoImage.getRoundRadius()[i22];
                                }
                            }
                            photoImage.setRoundRadius(iArr2);
                        }
                        s1Var.T3(lVar.o, lVar.p, lVar.q, lVar.r);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.v0 && (((isOutOwner = s1Var.getMessageObject().isOutOwner()) && rect.left != s1Var.getBackgroundDrawableLeft()) || ((!isOutOwner && rect.right != s1Var.getBackgroundDrawableRight()) || rect.top != s1Var.getBackgroundDrawableTop() || rect.bottom != s1Var.getBackgroundDrawableBottom()))) {
                    lVar.v = s1Var.getBackgroundDrawableBottom() - rect.bottom;
                    lVar.u = s1Var.getBackgroundDrawableTop() - rect.top;
                    if (s1Var.C8 != transitionParams.E0) {
                        lVar.s = s1Var.getBackgroundDrawableLeft() - rect.left;
                        lVar.t = s1Var.getBackgroundDrawableRight() - rect.right;
                    } else if (isOutOwner) {
                        lVar.s = s1Var.getBackgroundDrawableLeft() - rect.left;
                    } else {
                        lVar.t = s1Var.getBackgroundDrawableRight() - rect.right;
                    }
                    lVar.l = true;
                    transitionParams.w0 = true;
                    transitionParams.g0 = -lVar.s;
                    transitionParams.h0 = -lVar.t;
                    transitionParams.j0 = -lVar.u;
                    transitionParams.i0 = -lVar.v;
                    zk0Var.setClipChildren(false);
                    zk0Var.invalidate();
                }
            } else {
                view = view2;
                i15 = i19;
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.I;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    zk0 zk0Var2 = (zk0) view.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    boolean z15 = true;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    while (i23 < zk0Var2.getChildCount()) {
                        View childAt = zk0Var2.getChildAt(i23);
                        if (childAt instanceof s1) {
                            s1 s1Var3 = (s1) childAt;
                            if (s1Var3.getCurrentMessagesGroup() == currentMessagesGroup && !s1Var3.getMessageObject().deleted) {
                                int backgroundDrawableLeft = s1Var3.getBackgroundDrawableLeft() + s1Var3.getLeft();
                                groupedMessages = currentMessagesGroup;
                                int backgroundDrawableRight = s1Var3.getBackgroundDrawableRight() + s1Var3.getLeft();
                                i16 = i23;
                                int backgroundDrawableTop = s1Var3.getBackgroundDrawableTop() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                int backgroundDrawableBottom = s1Var3.getBackgroundDrawableBottom() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                if (i26 == 0 || backgroundDrawableLeft < i26) {
                                    i26 = backgroundDrawableLeft;
                                }
                                if (i27 == 0 || backgroundDrawableRight > i27) {
                                    i27 = backgroundDrawableRight;
                                }
                                if (s1Var3.getTransitionParams().v0 || transitionParams3.isNewGroup) {
                                    if (i24 == 0 || backgroundDrawableTop < i24) {
                                        i24 = backgroundDrawableTop;
                                    }
                                    if (i25 == 0 || backgroundDrawableBottom > i25) {
                                        i25 = backgroundDrawableBottom;
                                    }
                                    z15 = false;
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
                        lVar.j = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i28 = (-i24) + transitionParams3.top;
                        lVar.f = i28;
                        int i29 = (-i25) + transitionParams3.bottom;
                        lVar.g = i29;
                        int i30 = (-i26) + transitionParams3.left;
                        lVar.h = i30;
                        int i31 = (-i27) + transitionParams3.right;
                        lVar.i = i31;
                        lVar.j = true;
                        transitionParams3.backgroundChangeBounds = true;
                        transitionParams3.offsetTop = i28;
                        transitionParams3.offsetBottom = i29;
                        transitionParams3.offsetLeft = i30;
                        transitionParams3.offsetRight = i31;
                        transitionParams3.captionEnterProgress = transitionParams3.drawCaptionLayout ? 1.0f : 0.0f;
                        zk0Var2.setClipChildren(false);
                        zk0Var2.invalidate();
                    }
                    transitionParams3.drawBackgroundForDeletedItems = z15;
                }
            }
            Integer valueOf = Integer.valueOf(s1Var.getMessageObject().getId());
            HashMap hashMap = this.H;
            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hashMap.get(valueOf);
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                hashMap.remove(Integer.valueOf(s1Var.getMessageObject().getId()));
                if (transitionParams.v0) {
                    int backgroundDrawableLeft2 = s1Var.getBackgroundDrawableLeft() + s1Var.getLeft();
                    int backgroundDrawableRight2 = s1Var.getBackgroundDrawableRight() + s1Var.getLeft();
                    int backgroundDrawableTop2 = s1Var.getBackgroundDrawableTop() + s1Var.getPaddingTop() + s1Var.getTop();
                    int backgroundDrawableBottom2 = s1Var.getBackgroundDrawableBottom() + s1Var.getPaddingTop() + s1Var.getTop();
                    lVar.w = true;
                    transitionParams.w0 = true;
                    lVar.s = backgroundDrawableLeft2 - transitionParams4.left;
                    lVar.t = backgroundDrawableRight2 - transitionParams4.right;
                    lVar.u = backgroundDrawableTop2 - transitionParams4.top;
                    lVar.v = backgroundDrawableBottom2 - transitionParams4.bottom;
                    lVar.l = false;
                    transitionParams.g0 = (int) ((-r6) - s1Var.getAnimationOffsetX());
                    transitionParams.h0 = (int) ((-lVar.t) - s1Var.getAnimationOffsetX());
                    transitionParams.j0 = (int) ((-lVar.u) - s1Var.getTranslationY());
                    transitionParams.i0 = (int) ((-lVar.v) - s1Var.getTranslationY());
                    transitionParams.C0 = true;
                    zk0Var.setClipChildren(false);
                    zk0Var.invalidate();
                } else {
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition = s1Var.H;
            if (transitionParams.y0 != (s1Var.g8 || s1Var.F || (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && s1Var.G.isDocuments))) {
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
            if (i15 == 0 && i20 == 0 && !lVar.n && !lVar.w && !lVar.j && !lVar.k && !lVar.l && !f20) {
                v(o1Var);
                return false;
            }
        } else if (v0Var2 != null) {
            u0 transitionParams5 = v0Var2.getTransitionParams();
            transitionParams5.getClass();
            if (i19 != 0) {
                view2.setTranslationX(-i19);
            }
            boolean a2 = !transitionParams5.a ? false : transitionParams5.d.y0.a();
            lVar.m = a2;
            if (a2) {
                transitionParams5.b = true;
                transitionParams5.c = 0.0f;
            }
            if (i19 == 0 && i20 == 0 && !a2) {
                v(o1Var);
                return false;
            }
        } else if (view2 instanceof h0) {
            ((h0) view2).setAnimating(true);
        } else if (view2 instanceof ua) {
            ((ua) view2).setAnimating(true);
        } else {
            if (i19 == 0 && i20 == 0) {
                v(o1Var);
                return false;
            }
            if (i19 != 0) {
                view2.setTranslationX(-i19);
            }
        }
        this.r.add(lVar);
        F();
        return true;
    }

    @Override // f2.l, f2.r1
    public final void s(o1 o1Var, p pVar) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        super.s(o1Var, pVar);
        View view = o1Var.a;
        if (pVar != null) {
            int i10 = pVar.b;
            int top = view.getTop();
            int left = view.getLeft() - pVar.a;
            if (top - i10 != 0) {
                view.setTranslationY(-r1);
            }
            if (!(view instanceof s1)) {
                if (left != 0) {
                    view.setTranslationX(-left);
                    return;
                }
                return;
            }
            s1 s1Var = (s1) view;
            if (left != 0) {
                s1Var.setAnimationOffsetX(-left);
            }
            if (pVar instanceof k) {
                k kVar = (k) pVar;
                s1Var.T3(kVar.c, kVar.d, kVar.e, kVar.f);
            }
        }
    }
}
