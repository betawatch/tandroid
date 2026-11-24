// default package

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t29 extends FrameLayout {
    public int E;
    public boolean F;
    public yxa G;
    public final q29 H;
    public boolean I;
    public float J;
    public ValueAnimator K;
    public final q29 L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final /* synthetic */ v29 Q;
    public final s29 a;
    public final s29 b;
    public final s29 c;
    public final ImageReceiver d;
    public k39 e;
    public pj8 f;
    public float h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t29(v29 v29Var, Context context) {
        super(context);
        this.Q = v29Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        byte b = 1;
        this.y = true;
        byte b2 = 0;
        this.H = new q29(this, b2);
        this.J = 1.0f;
        this.L = new q29(this, b);
        this.P = true;
        s29 s29Var = new s29(this, context, b2);
        this.a = s29Var;
        s29 s29Var2 = new s29(this, context, b);
        this.b = s29Var2;
        s29Var.getImageReceiver().M(0);
        s29Var.getImageReceiver().v0 = false;
        s29 s29Var3 = new s29(this, context, (byte) 2);
        this.c = s29Var3;
        addView(s29Var, qoe.e(34, 34, 17));
        addView(s29Var3, qoe.e(34, 34, 17));
        addView(s29Var2, qoe.e(34, 34, 17));
        if (v29Var.N0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        s29Var.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        s29Var2.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        s29Var2.a.M(0);
        ImageReceiver imageReceiver = s29Var2.a;
        imageReceiver.u0 = false;
        imageReceiver.v0 = false;
        s29Var3.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    public final void a() {
        s29 s29Var = this.b;
        vm vmVar = s29Var.e;
        ImageReceiver imageReceiver = vmVar != null ? vmVar.k : s29Var.a;
        if (imageReceiver == null || imageReceiver.y() == null) {
            return;
        }
        v29 v29Var = this.Q;
        if (v29Var.y0 != null || this.O || !v29Var.H0) {
            imageReceiver.y().start();
        } else if (imageReceiver.y().b0 <= 2) {
            imageReceiver.y().stop();
        }
    }

    public final void b(int i) {
        if (!this.Q.k0) {
            c();
            this.n = true;
            if (this.r) {
                return;
            }
            this.b.setVisibility(0);
            this.b.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
            this.b.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
            return;
        }
        gm.r(this.H);
        if (!this.r) {
            if (this.n) {
                return;
            }
            this.J = 0.0f;
            this.b.setScaleX(0.0f);
            this.b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new p29(this, (byte) 0));
            this.K.setDuration(150L);
            this.K.setInterpolator(d53.h);
            this.K.setStartDelay((long) (i * this.Q.c));
            this.K.start();
            this.n = true;
            return;
        }
        if (this.a.getImageReceiver().y() == null || this.a.getImageReceiver().y().t() || this.n) {
            if (this.a.getImageReceiver().y() != null && this.n && !this.a.getImageReceiver().y().l0 && !this.a.getImageReceiver().y().t()) {
                this.a.getImageReceiver().y().I(this.a.getImageReceiver().y().e[0] - 1, false, false);
            }
            this.b.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
            this.b.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
            return;
        }
        this.n = true;
        if (i == 0) {
            this.F = false;
            this.a.getImageReceiver().y().stop();
            this.a.getImageReceiver().y().I(0, false, false);
            this.H.run();
            return;
        }
        this.F = true;
        this.a.getImageReceiver().y().stop();
        this.a.getImageReceiver().y().I(0, false, false);
        gm.d3(this.H, i);
    }

    public final void c() {
        boolean z = this.r;
        v29 v29Var = this.Q;
        s29 s29Var = this.b;
        if (z) {
            gm.r(this.H);
            s29 s29Var2 = this.a;
            if (s29Var2.getImageReceiver().y() != null && !s29Var2.getImageReceiver().y().t()) {
                s29Var2.getImageReceiver().y().stop();
                if (v29Var.k0) {
                    s29Var2.getImageReceiver().y().I(0, false, true);
                } else {
                    s29Var2.getImageReceiver().y().I(s29Var2.getImageReceiver().y().e[0] - 1, false, true);
                }
            }
            s29Var.setVisibility(4);
            s29Var2.setVisibility(0);
            this.w = false;
            s29Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
            s29Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
        } else {
            s29Var.animate().cancel();
            if (v29Var.O0) {
                s29Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
                s29Var.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
            } else {
                s29Var.setScaleY(0.0f);
                s29Var.setScaleX(0.0f);
            }
        }
        this.n = false;
    }

    public final void d(int i, k39 k39Var) {
        v29 v29Var = this.Q;
        ylb ylbVar = v29Var.l0;
        byte b = v29Var.N0;
        f(k39Var, false);
        k39 k39Var2 = this.e;
        if (k39Var2 != null && k39Var2.equals(k39Var)) {
            this.E = i;
            e(k39Var);
            return;
        }
        boolean p = z8c.h(v29Var.K).p();
        boolean z = (b == 3 && !p) || (b == 5 && k39Var.d && !p);
        this.I = z;
        s29 s29Var = this.b;
        if (z && this.f == null) {
            pj8 pj8Var = new pj8(1, null, getContext());
            this.f = pj8Var;
            pj8Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.f.setImageReceiver(s29Var.getImageReceiver());
            addView(this.f, qoe.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        pj8 pj8Var2 = this.f;
        if (pj8Var2 != null) {
            pj8Var2.setVisibility(this.I ? 0 : 8);
        }
        c();
        this.e = k39Var;
        this.r = k39Var.a || (k39Var.f != null && ((v29Var.n() || v29Var.H0) && e86.e(8200)));
        if (b == 4 || this.e.b) {
            this.r = false;
        }
        k39 k39Var3 = this.e;
        boolean z2 = k39Var3.a;
        s29 s29Var2 = this.c;
        s29 s29Var3 = this.a;
        if (z2 || k39Var3.f != null) {
            e(k39Var);
            s29Var2.setAnimatedEmojiDrawable(null);
            if (s29Var3.getImageReceiver().y() != null) {
                s29Var3.getImageReceiver().y().I(0, false, false);
            }
            pj8 pj8Var3 = this.f;
            if (pj8Var3 != null) {
                pj8Var3.setAnimatedEmojiDrawable(null);
            }
        } else {
            s29Var2.getImageReceiver().f();
            s29Var.getImageReceiver().f();
            vm vmVar = new vm(4, v29Var.K, this.e.g);
            vm vmVar2 = new vm(3, v29Var.K, this.e.g);
            if (b == 1 || b == 2 || b == 4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                vmVar.setColorFilter(new PorterDuffColorFilter(-1, mode));
                vmVar2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            } else {
                int i2 = cmb.u6;
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                anb.x(this, vmVar, i2, ylbVar, mode2);
                anb.x(this, vmVar2, i2, ylbVar, mode2);
            }
            s29Var2.setAnimatedEmojiDrawable(vmVar);
            s29Var.setAnimatedEmojiDrawable(vmVar2);
            pj8 pj8Var4 = this.f;
            if (pj8Var4 != null) {
                pj8Var4.setAnimatedEmojiDrawable(vmVar2);
            }
        }
        setFocusable(true);
        boolean z3 = this.r;
        this.s = z3;
        if (z3) {
            this.w = false;
            s29Var3.setVisibility(0);
            s29Var.setVisibility(8);
        } else {
            s29Var3.setVisibility(8);
            s29Var.setVisibility(0);
            this.w = true;
        }
        ViewGroup.LayoutParams layoutParams = s29Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = s29Var.getLayoutParams();
        int L = gm.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = s29Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = s29Var3.getLayoutParams();
        int L2 = gm.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        mm mmVar;
        if (this.x && this.y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - gm.L(1.0f);
            k39 k39Var = this.e;
            v29 v29Var = this.Q;
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (k39Var == null || !k39Var.a) ? v29Var.I0 : v29Var.J0);
        }
        vm vmVar = this.b.e;
        if (vmVar != null && (mmVar = vmVar.k) != null) {
            if (this.E == 0) {
                mmVar.r0(gm.L(6.0f), 0, 0, gm.L(6.0f));
            } else {
                mmVar.q0(this.x ? gm.L(6.0f) : 0);
            }
        }
        k39 k39Var2 = this.e;
        if (k39Var2 != null && k39Var2.a && this.G != null && e86.e(8200) && e86.e(131072)) {
            RectF rectF = gm.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            p09 y = this.a.getImageReceiver().y();
            this.G.j = (int) (r2.b.size() * ((y == null || (i = y.b0) <= 30) ? 0.0f : Utilities.l((i - 30) / 30.0f)));
            this.G.g(rectF);
            this.G.d();
            this.G.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    public final void e(k39 k39Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        s29 s29Var;
        meb mebVar;
        ?? r14;
        TLRPC.Document document;
        v29 v29Var = this.Q;
        byte b = v29Var.N0;
        s29 s29Var2 = this.a;
        s29 s29Var3 = this.b;
        if (k39Var != null && k39Var.a) {
            s29Var2.getImageReceiver().g0(new p09(R.raw.star_reaction, gm.L(30.0f), gm.L(30.0f)));
            s29Var3.getImageReceiver().g0(getContext().getResources().getDrawable(R.drawable.star_reaction));
            if (this.G == null) {
                this.G = new yxa(1, gda.o() == 2 ? 45 : 18);
                return;
            }
            return;
        }
        if (b == 4 && k39Var != null && k39Var.f != null) {
            s29Var2.getImageReceiver().g0(gw3.g(k39Var.f));
            s29Var3.getImageReceiver().g0(gw3.g(k39Var.f));
            return;
        }
        k39 k39Var2 = this.e;
        if (k39Var2.b) {
            oc7 r1 = oc7.r1(v29Var.K);
            long j = this.e.g;
            if (r1.X4 != null) {
                for (int i = 0; i < r1.X4.documents.size(); i++) {
                    if (r1.X4.documents.get(i).id == j) {
                        document = r1.X4.documents.get(i);
                        break;
                    }
                }
            }
            document = null;
            s29Var3.getImageReceiver().Z(gn5.b(document), "60_60_firstframe", null, null, this.r ? null : eq3.f(document, cmb.l6, 0.2f, null), 0L, "tgs", this.e, 0);
            return;
        }
        if (k39Var2.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) hs6.d0(v29Var.K).r.get(this.e.f);
            if (tL_availableReaction2 != null) {
                meb f = eq3.f(tL_availableReaction2.activate_animation, cmb.l6, 0.2f, null);
                if (!e86.e(8200) || b == 4) {
                    tL_availableReaction = tL_availableReaction2;
                    s29Var = s29Var2;
                    boolean z = false;
                    mebVar = f;
                    if (gda.o() <= 0 || b == 4) {
                        s29Var3.getImageReceiver().Z(gn5.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : mebVar, 0L, "tgs", this.e, 0);
                        r14 = z;
                    } else {
                        s29Var.getImageReceiver().Z(gn5.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, mebVar, 0L, "tgs", k39Var, 0);
                        s29Var3.getImageReceiver().Z(gn5.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.r ? null : mebVar, 0L, "tgs", this.e, 0);
                        r14 = z;
                    }
                } else {
                    mebVar = f;
                    s29Var = s29Var2;
                    r14 = 0;
                    tL_availableReaction = tL_availableReaction2;
                    s29Var2.getImageReceiver().Z(gn5.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, mebVar, 0L, "tgs", k39Var, 0);
                    s29Var3.getImageReceiver().Z(gn5.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.r ? null : mebVar, 0L, "tgs", this.e, 0);
                }
                if (s29Var.getImageReceiver().y() != null) {
                    s29Var.getImageReceiver().y().I(r14, r14, true);
                }
                this.c.getImageReceiver().Z(gn5.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, mebVar, 0L, "tgs", k39Var, 0);
                ImageReceiver imageReceiver = this.d;
                imageReceiver.v0 = r14;
                hs6.d0(v29Var.K);
                hs6.n1(imageReceiver, gn5.b(tL_availableReaction.around_animation), g39.a());
            }
            pj8 pj8Var = this.f;
            if (pj8Var != null) {
                pj8Var.setImageReceiver(s29Var3.getImageReceiver());
            }
        }
    }

    public final void f(k39 k39Var, boolean z) {
        boolean z2 = this.x;
        boolean contains = this.Q.e0.contains(k39Var);
        this.x = contains;
        if (contains != z2) {
            s29 s29Var = this.b;
            s29 s29Var2 = this.a;
            if (z) {
                ViewPropertyAnimator duration = s29Var.animate().scaleX(this.J * (this.x ? 0.76f : 1.0f)).scaleY(this.J * (this.x ? 0.76f : 1.0f)).setDuration(240L);
                d53 d53Var = d53.h;
                duration.setInterpolator(d53Var).start();
                s29Var2.animate().scaleX(this.J * (this.x ? 0.76f : 1.0f)).scaleY(this.J * (this.x ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(d53Var).start();
            } else {
                s29Var.setScaleX(this.J * (contains ? 0.76f : 1.0f));
                s29Var.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
                s29Var2.setScaleX(this.J * (this.x ? 0.76f : 1.0f));
                s29Var2.setScaleY(this.J * (this.x ? 0.76f : 1.0f));
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
        this.d.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.K();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        k39 k39Var = this.e;
        if (k39Var != null) {
            String str = k39Var.f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
            } else {
                accessibilityNodeInfo.setText(jb6.M0(2131754890, null));
                accessibilityNodeInfo.setEnabled(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b;
        u29 u29Var;
        if (this.P) {
            v29 v29Var = this.Q;
            if (v29Var.R == null) {
                int action = motionEvent.getAction();
                q29 q29Var = this.L;
                if (action == 0) {
                    this.O = true;
                    this.M = motionEvent.getX();
                    this.N = motionEvent.getY();
                    if (this.h == 1.0f && !this.I && (b = v29Var.N0) != 3 && b != 4 && b != 5 && ((u29Var = v29Var.h0) == null || u29Var.h())) {
                        gm.d3(q29Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                byte b2 = 2;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.M - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.N - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.O && ((v29Var.m0 == null || v29Var.o0 > 0.8f) && v29Var.h0 != null)) {
                    v29Var.s0 = true;
                    if (System.currentTimeMillis() - v29Var.t0 > 300) {
                        v29Var.t0 = System.currentTimeMillis();
                        v29Var.h0.g(this, this.e, v29Var.o0 > 0.8f, false);
                    }
                }
                if (!v29Var.s0 && v29Var.m0 != null) {
                    v29Var.p0 = 0.0f;
                    float f = v29Var.o0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    v29Var.R = ofFloat;
                    ofFloat.addUpdateListener(new j29(v29Var, f));
                    v29Var.R.addListener(new lv7(v29Var, b2));
                    v29Var.R.setDuration(150L);
                    v29Var.R.setInterpolator(d53.f);
                    v29Var.R.start();
                }
                gm.r(q29Var);
                this.O = false;
                return true;
            }
        }
        return false;
    }
}
