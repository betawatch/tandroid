package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x91 extends Dialog {
    public float D;
    public final hi.b E;
    public final tg.b F;
    public org.telegram.messenger.jj G;
    public boolean H;
    public v91 I;
    public jt0 J;
    public org.telegram.ui.Cells.q1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.mj0 P;
    public ViewGroup Q;
    public float R;
    public ViewGroup S;
    public float T;
    public float U;
    public float V;
    public boolean W;
    public float X;
    public float Y;
    public boolean Z;
    public final org.telegram.ui.ActionBar.p6 a;
    public boolean a0;
    public final u91 b;
    public boolean b0;
    public final u91 c;
    public pm c0;
    public final u91 d;
    public ValueAnimator d0;
    public final hk e;
    public ValueAnimator e0;
    public final TextView f;
    public final org.telegram.ui.Components.ya0 h;
    public i0.c n;
    public Bitmap r;
    public BitmapShader s;
    public Paint w;
    public Matrix x;
    public float y;

    public x91(Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, R.style.TransparentDialog);
        this.n = i0.c.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.a0 = false;
        this.a = p6Var;
        u91 u91Var = new u91(this, activity, 0);
        this.b = u91Var;
        u91Var.setOnClickListener(new a01(this, 8));
        hi.b bVar = new hi.b();
        this.E = bVar;
        tg.b bVar2 = new tg.b(bVar);
        this.F = bVar2;
        bVar2.f = new zg.h(u91Var);
        bVar2.g = u91Var;
        u91 u91Var2 = new u91(this, activity, 1);
        this.c = u91Var2;
        u91Var2.setClipToPadding(false);
        u91Var.addView(u91Var2, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        int i10 = 4;
        hk hkVar = new hk(this, activity, i10);
        this.e = hkVar;
        hkVar.setAdapter(new mg.s(this, activity, 5));
        u91Var2.addView(hkVar, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        u91 u91Var3 = new u91(this, activity, 2);
        this.d = u91Var3;
        u91Var2.addView(u91Var3, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        org.telegram.ui.Components.ya0 ya0Var = new org.telegram.ui.Components.ya0(activity, p6Var);
        this.h = ya0Var;
        ya0Var.a(0, org.telegram.messenger.cd.L0(2131744094, null));
        ya0Var.a(1, org.telegram.messenger.cd.L0(2131744095, null));
        u91Var2.addView(ya0Var, w7.b6.e(-1, 66, 80));
        ya0Var.setOnTabClick(new s3(hkVar, 24));
        vg.f c10 = bVar2.c(ya0Var, null, false);
        c10.o(w7.b9.k(p6Var));
        c10.M.e = true;
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.q(org.telegram.messenger.i0.L(16.0f));
        ya0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ya0Var.getColor());
        textView.setText(org.telegram.messenger.cd.L0(2131744096, null));
        textView.setGravity(17);
        u91Var2.addView(textView, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        z01 z01Var = new z01(this, i10);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(u91Var, z01Var);
    }

    public final void b(boolean z10, yv0 yv0Var) {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i10 = 0;
        final int i11 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.s91
            public final /* synthetic */ x91 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        x91 x91Var = this.b;
                        x91Var.y = floatValue;
                        x91Var.b.invalidate();
                        x91Var.c.invalidate();
                        x91Var.e();
                        break;
                    default:
                        x91 x91Var2 = this.b;
                        x91Var2.getClass();
                        x91Var2.D = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.d0.addListener(new androidx.fragment.app.g(this, z10, yv0Var, 11));
        long j10 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.d0;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        valueAnimator3.setInterpolator(grVar);
        this.d0.setDuration(j10);
        this.d0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.D, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.s91
            public final /* synthetic */ x91 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        x91 x91Var = this.b;
                        x91Var.y = floatValue;
                        x91Var.b.invalidate();
                        x91Var.c.invalidate();
                        x91Var.e();
                        break;
                    default:
                        x91 x91Var2 = this.b;
                        x91Var2.getClass();
                        x91Var2.D = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.e0.addListener(new org.telegram.ui.Components.ha0(26, this, z10));
        this.e0.setDuration((long) (j10 * 1.5f));
        this.e0.setInterpolator(grVar);
        this.e0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Components.mj0 mj0Var;
        if (z10 && (mj0Var = this.P) != null && mj0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().q) {
            this.P.e();
            return;
        }
        if (this.a0) {
            return;
        }
        this.a0 = true;
        this.W = false;
        hk hkVar = this.e;
        hkVar.l();
        boolean z11 = hkVar.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.q1 q1Var2 = this.K;
            if (q1Var2 != null) {
                q1Var2.setVisibility(4);
                this.K.invalidate();
            }
        } else if (!z10 && (q1Var = this.K) != null) {
            q1Var.setVisibility(0);
            org.telegram.ui.Cells.q1 q1Var3 = this.K;
            q1Var3.a6 = -1;
            q1Var3.invalidate();
        }
        this.b0 = !z10;
        d();
        b(false, new yv0(3, this, z11));
        this.b.invalidate();
    }

    public final void d() {
        if (this.W) {
            return;
        }
        u91 u91Var = this.b;
        if (u91Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = this.K;
        if (q1Var != null) {
            int[] iArr = new int[2];
            q1Var.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            i0.c cVar = this.n;
            this.U = i10 - cVar.a;
            float f7 = iArr[1] - cVar.b;
            this.V = f7;
            if (!this.Z) {
                this.Z = true;
                this.X = f7;
                if (this.S != null) {
                    float height = f7 + this.K.getHeight() + this.S.getHeight();
                    int height2 = u91Var.getHeight();
                    i0.c cVar2 = this.n;
                    if (height > ((height2 - cVar2.b) - cVar2.d) - org.telegram.messenger.i0.L(66.0f)) {
                        int height3 = u91Var.getHeight();
                        i0.c cVar3 = this.n;
                        this.X = ((((height3 - cVar3.b) - cVar3.d) - org.telegram.messenger.i0.L(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                    }
                }
                int Z1 = this.I.Z1(this.O);
                this.I.S1(Z1);
                float R1 = this.I.R1(Z1);
                float f10 = this.V;
                this.Y = f10;
                float f11 = (int) R1;
                float f12 = f10 + f11;
                int height4 = u91Var.getHeight();
                i0.c cVar4 = this.n;
                int L = ((height4 - cVar4.b) - cVar4.d) - org.telegram.messenger.i0.L(78.0f);
                TextView textView = this.f;
                if (f12 > L - textView.getHeight()) {
                    int height5 = u91Var.getHeight();
                    i0.c cVar5 = this.n;
                    this.Y = ((((height5 - cVar5.b) - cVar5.d) - org.telegram.messenger.i0.L(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.Q != null) {
                    float height6 = this.Y + f11 + r3.getHeight();
                    int height7 = u91Var.getHeight();
                    i0.c cVar6 = this.n;
                    if (height6 > (((height7 - cVar6.b) - cVar6.d) - org.telegram.messenger.i0.L(78.0f)) - textView.getHeight()) {
                        int height8 = u91Var.getHeight();
                        i0.c cVar7 = this.n;
                        this.Y = (((((height8 - cVar7.b) - cVar7.d) - org.telegram.messenger.i0.L(78.0f)) - textView.getHeight()) - r1) - this.Q.getHeight();
                    }
                }
            }
            e();
        } else {
            this.V = 0.0f;
            this.U = 0.0f;
        }
        this.W = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        hk hkVar = this.e;
        float positionAnimated = hkVar.getPositionAnimated();
        float W1 = org.telegram.messenger.i0.W1(positionAnimated, 0, -hkVar.getWidth());
        float W12 = org.telegram.messenger.i0.W1(positionAnimated, hkVar.getWidth(), 0);
        if (this.W) {
            ViewGroup viewGroup = this.S;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f7 = this.V;
                this.X = f7;
                float height = f7 + this.K.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                u91 u91Var = this.b;
                int height2 = u91Var.getHeight();
                i0.c cVar = this.n;
                if (height > ((height2 - cVar.b) - cVar.d) - org.telegram.messenger.i0.L(66.0f)) {
                    int height3 = u91Var.getHeight();
                    i0.c cVar2 = this.n;
                    this.X = ((((height3 - cVar2.b) - cVar2.d) - org.telegram.messenger.i0.L(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.J.setTranslationX(org.telegram.messenger.i0.T1(this.U, 0.0f, this.b0 ? 1.0f : this.y) + W12);
        this.J.setTranslationY(org.telegram.messenger.i0.T1(this.V, this.X, this.b0 ? 1.0f : this.y));
        ViewGroup viewGroup2 = this.S;
        u91 u91Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.H) {
                viewGroup2.setTranslationX(((this.J.getPollButtonsLeft() + ((W12 + 0.0f) + this.J.getLeft())) - org.telegram.messenger.i0.L(8.0f)) - this.S.getLeft());
            } else {
                viewGroup2.setTranslationX((((W12 + 0.0f) + (this.J.V2() ? org.telegram.messenger.i0.L(48.0f) : 0)) + this.J.getLeft()) - this.S.getLeft());
            }
            this.T = u91Var2.getMeasuredWidth() - (this.S.getX() - W12);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - u91Var2.getTop());
            this.S.setAlpha(this.y);
            float T1 = org.telegram.messenger.i0.T1(0.75f, 1.0f, this.y);
            this.S.setScaleX(T1);
            this.S.setScaleY(T1);
        }
        this.I.setTranslationX(org.telegram.messenger.i0.T1(this.U, 0.0f, this.b0 ? 1.0f : this.y) + W1);
        this.I.setTranslationY(org.telegram.messenger.i0.T1(this.V, this.Y, this.b0 ? 1.0f : this.y));
        if (this.Q != null) {
            int Z1 = this.I.Z1(this.O);
            this.I.S1(Z1);
            float R1 = this.I.R1(Z1);
            if (this.H) {
                this.Q.setTranslationX(((this.I.getPollButtonsLeft() + ((W1 + 0.0f) + this.I.getLeft())) - org.telegram.messenger.i0.L(8.0f)) - this.Q.getLeft());
            } else {
                this.Q.setTranslationX((((W1 + 0.0f) + (this.I.V2() ? org.telegram.messenger.i0.L(48.0f) : 0)) + this.I.getLeft()) - this.Q.getLeft());
            }
            this.R = u91Var2.getMeasuredWidth() - (this.Q.getX() - W12);
            this.Q.setTranslationY(((this.I.getY() + ((int) R1)) - this.Q.getTop()) - u91Var2.getTop());
            this.Q.setAlpha(this.y);
            float T12 = org.telegram.messenger.i0.T1(0.75f, 1.0f, this.y);
            this.Q.setScaleX(T12);
            this.Q.setScaleY(T12);
        }
        if (this.b0) {
            this.J.setAlpha(this.y);
            this.I.setAlpha(this.y);
        }
        if (this.P != null) {
            float max = W12 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + org.telegram.messenger.i0.L(22.0f)) - u91Var2.getTop()));
            this.P.setAlpha(this.y);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.y);
            }
        }
        TextView textView = this.f;
        textView.setTranslationX(W1);
        textView.setAlpha(this.y);
        org.telegram.ui.Components.ya0 ya0Var = this.h;
        ya0Var.setSelectedTab(positionAnimated);
        ya0Var.setAlpha(this.y);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        u91 u91Var = this.b;
        setContentView(u91Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.zs.E1;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i10 | (-1945959040);
        org.telegram.messenger.i0.m(attributes);
        window.setAttributes(attributes);
        u91Var.setSystemUiVisibility(1284);
        org.telegram.messenger.i0.n3(u91Var, !org.telegram.ui.ActionBar.t6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.i0.M1(getContext())) {
            super.show();
            org.telegram.ui.Components.nl0.d(new z4(this, 28));
            this.N = true;
            b(true, null);
        }
    }
}
