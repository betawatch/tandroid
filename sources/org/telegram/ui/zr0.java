package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class zr0 extends Dialog {
    public float D;
    public float E;
    public final ri.b F;
    public final dh.c G;
    public org.telegram.messenger.ij H;
    public boolean I;
    public xr0 J;
    public yr0 K;
    public org.telegram.ui.Cells.q1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.ii0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public float Z;
    public final Context a;
    public float a0;
    public final org.telegram.ui.ActionBar.f6 b;
    public boolean b0;
    public final vr0 c;
    public boolean c0;
    public final vr0 d;
    public boolean d0;
    public final vr0 e;
    public tl e0;
    public final fi.g1 f;
    public ValueAnimator f0;
    public ValueAnimator g0;
    public final TextView h;
    public final org.telegram.ui.Components.ga0 n;
    public i0.b r;
    public Bitmap s;
    public BitmapShader w;
    public Paint x;
    public Matrix y;

    public zr0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.r = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        int i7 = 0;
        this.c0 = false;
        this.a = activity;
        this.b = f6Var;
        vr0 vr0Var = new vr0(this, activity, i7);
        this.c = vr0Var;
        vr0Var.setOnClickListener(new g40(this, 23));
        ri.b bVar = new ri.b();
        this.F = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new jh.k(vr0Var);
        cVar.i = vr0Var;
        vr0 vr0Var2 = new vr0(this, activity, 1);
        this.d = vr0Var2;
        vr0Var2.setClipToPadding(false);
        vr0Var.addView(vr0Var2, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        fi.g1 g1Var = new fi.g1(5, activity, this);
        this.f = g1Var;
        g1Var.setAdapter(new bi.g5(4, activity, this));
        vr0Var2.addView(g1Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        vr0 vr0Var3 = new vr0(this, activity, 2);
        this.e = vr0Var3;
        vr0Var2.addView(vr0Var3, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        org.telegram.ui.Components.ga0 ga0Var = new org.telegram.ui.Components.ga0(activity, f6Var);
        this.n = ga0Var;
        ga0Var.a(0, org.telegram.messenger.hd.M0(2131747167, null));
        ga0Var.a(1, org.telegram.messenger.hd.M0(2131747166, null));
        vr0Var2.addView(ga0Var, c8.ha.e(-1, 66, 80));
        ga0Var.setOnTabClick(new r3(g1Var, 19));
        fh.g c10 = cVar.c(ga0Var, null, false);
        c10.p(c8.g0.k(f6Var));
        c10.Q.e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ga0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ga0Var.getColor());
        textView.setText(org.telegram.messenger.hd.M0(2131747168, null));
        textView.setGravity(17);
        vr0Var2.addView(textView, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        wr0 wr0Var = new wr0(this, i7);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(vr0Var, wr0Var);
    }

    public final void b(boolean z9, qr0 qr0Var) {
        ValueAnimator valueAnimator = this.f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i7 = 0;
        final int i10 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, z9 ? 1.0f : 0.0f);
        this.f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.rr0
            public final /* synthetic */ zr0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i7) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        zr0 zr0Var = this.b;
                        zr0Var.D = floatValue;
                        zr0Var.c.invalidate();
                        zr0Var.d.invalidate();
                        xr0 xr0Var = zr0Var.J;
                        if (xr0Var != null) {
                            xr0Var.invalidate();
                        }
                        zr0Var.e();
                        break;
                    default:
                        zr0 zr0Var2 = this.b;
                        zr0Var2.getClass();
                        zr0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.f0.addListener(new ai.g0(this, z9, qr0Var, 12));
        long j3 = !z9 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.f0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        valueAnimator3.setInterpolator(xqVar);
        this.f0.setDuration(j3);
        this.f0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, z9 ? 1.0f : 0.0f);
        this.g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.rr0
            public final /* synthetic */ zr0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        zr0 zr0Var = this.b;
                        zr0Var.D = floatValue;
                        zr0Var.c.invalidate();
                        zr0Var.d.invalidate();
                        xr0 xr0Var = zr0Var.J;
                        if (xr0Var != null) {
                            xr0Var.invalidate();
                        }
                        zr0Var.e();
                        break;
                    default:
                        zr0 zr0Var2 = this.b;
                        zr0Var2.getClass();
                        zr0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.g0.addListener(new z40(4, this, z9));
        this.g0.setDuration((long) (j3 * 1.5f));
        this.g0.setInterpolator(xqVar);
        this.g0.start();
    }

    public final void c(boolean z9) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Components.ii0 ii0Var;
        if (z9 && (ii0Var = this.Q) != null && ii0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().q) {
            this.Q.e();
            return;
        }
        if (this.c0) {
            return;
        }
        this.c0 = true;
        this.Y = false;
        fi.g1 g1Var = this.f;
        g1Var.l();
        boolean z10 = g1Var.getCurrentPosition() == 1;
        if (z9 && z10) {
            org.telegram.ui.Cells.q1 q1Var2 = this.L;
            if (q1Var2 != null) {
                q1Var2.setVisibility(4);
                this.L.invalidate();
            }
        } else if (!z9 && (q1Var = this.L) != null) {
            q1Var.setVisibility(0);
            org.telegram.ui.Cells.q1 q1Var3 = this.L;
            q1Var3.c6 = null;
            q1Var3.invalidate();
        }
        this.d0 = !z9;
        d();
        b(false, new qr0(this, z10));
        this.c.invalidate();
    }

    public final void d() {
        if (this.Y) {
            return;
        }
        vr0 vr0Var = this.c;
        if (vr0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = this.L;
        if (q1Var != null) {
            int[] iArr = new int[2];
            q1Var.getLocationOnScreen(iArr);
            int i7 = iArr[0];
            i0.b bVar = this.r;
            this.W = i7 - bVar.a;
            float f10 = iArr[1] - bVar.b;
            this.X = f10;
            if (!this.b0) {
                this.b0 = true;
                this.Z = f10;
                if (this.T != null) {
                    float height = f10 + this.L.getHeight() + this.T.getHeight();
                    int height2 = vr0Var.getHeight();
                    i0.b bVar2 = this.r;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                        int height3 = vr0Var.getHeight();
                        i0.b bVar3 = this.r;
                        this.Z = ((((height3 - bVar3.b) - bVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                    }
                }
                int V1 = this.J.V1(this.P);
                this.J.U1(V1);
                float T1 = this.J.T1(V1);
                float f11 = this.X;
                this.a0 = f11;
                float f12 = (int) T1;
                float f13 = f11 + f12;
                int height4 = vr0Var.getHeight();
                i0.b bVar4 = this.r;
                int L = ((height4 - bVar4.b) - bVar4.d) - org.telegram.messenger.g0.L(78.0f);
                TextView textView = this.h;
                if (f13 > L - textView.getHeight()) {
                    int height5 = vr0Var.getHeight();
                    i0.b bVar5 = this.r;
                    this.a0 = ((((height5 - bVar5.b) - bVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.R != null) {
                    float height6 = this.a0 + f12 + r3.getHeight();
                    int height7 = vr0Var.getHeight();
                    i0.b bVar6 = this.r;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                        int height8 = vr0Var.getHeight();
                        i0.b bVar7 = this.r;
                        this.a0 = (((((height8 - bVar7.b) - bVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - r1) - this.R.getHeight();
                    }
                }
            }
            e();
        } else {
            this.X = 0.0f;
            this.W = 0.0f;
        }
        this.Y = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        fi.g1 g1Var = this.f;
        float positionAnimated = g1Var.getPositionAnimated();
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -g1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, g1Var.getWidth(), 0);
        if (this.Y) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f10 = this.X;
                this.Z = f10;
                float height = f10 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                vr0 vr0Var = this.c;
                int height2 = vr0Var.getHeight();
                i0.b bVar = this.r;
                if (height > ((height2 - bVar.b) - bVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = vr0Var.getHeight();
                    i0.b bVar2 = this.r;
                    this.Z = ((((height3 - bVar2.b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.K.setTranslationX(org.telegram.messenger.g0.T1(this.W, 0.0f, this.d0 ? 1.0f : this.D) + W12);
        this.K.setTranslationY(org.telegram.messenger.g0.T1(this.X, this.Z, this.d0 ? 1.0f : this.D));
        ViewGroup viewGroup2 = this.T;
        vr0 vr0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((W12 + 0.0f) + this.K.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.T.getLeft());
            } else {
                viewGroup2.setTranslationX((((W12 + 0.0f) + (this.K.Y2() ? org.telegram.messenger.g0.L(48.0f) : 0)) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = vr0Var2.getMeasuredWidth() - (this.T.getX() - W12);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - vr0Var2.getTop());
            this.T.setAlpha(this.D);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.D);
            this.T.setScaleX(T1);
            this.T.setScaleY(T1);
        }
        this.J.setTranslationX(org.telegram.messenger.g0.T1(this.W, 0.0f, this.d0 ? 1.0f : this.D) + W1);
        this.J.setTranslationY(org.telegram.messenger.g0.T1(this.X, this.a0, this.d0 ? 1.0f : this.D));
        if (this.R != null) {
            int V1 = this.J.V1(this.P);
            this.J.U1(V1);
            float T12 = this.J.T1(V1);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((W1 + 0.0f) + this.J.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.R.getLeft());
            } else {
                this.R.setTranslationX((((W1 + 0.0f) + (this.J.Y2() ? org.telegram.messenger.g0.L(48.0f) : 0)) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = vr0Var2.getMeasuredWidth() - (this.R.getX() - W12);
            this.R.setTranslationY(((this.J.getY() + ((int) T12)) - this.R.getTop()) - vr0Var2.getTop());
            this.R.setAlpha(this.D);
            float T13 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.D);
            this.R.setScaleX(T13);
            this.R.setScaleY(T13);
        }
        if (this.d0) {
            this.K.setAlpha(this.D);
            this.J.setAlpha(this.D);
        }
        if (this.Q != null) {
            float max = W12 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - vr0Var2.getTop()));
            this.Q.setAlpha(this.D);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.D);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(W1);
        textView.setAlpha(this.D);
        org.telegram.ui.Components.ga0 ga0Var = this.n;
        ga0Var.setSelectedTab(positionAnimated);
        ga0Var.setAlpha(this.D);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        vr0 vr0Var = this.c;
        setContentView(vr0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.qs.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i7 | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        vr0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(vr0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Components.jk0.d(new a5(this, 16));
            this.O = true;
            b(true, null);
        }
    }
}
