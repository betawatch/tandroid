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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w71 extends Dialog {
    public float E;
    public final si.b F;
    public final eh.c G;
    public org.telegram.messenger.zi H;
    public boolean I;
    public u71 J;
    public or0 K;
    public org.telegram.ui.Cells.q1 L;
    public float M;
    public float N;
    public boolean O;
    public int P;
    public org.telegram.ui.Components.li0 Q;
    public ViewGroup R;
    public float S;
    public ViewGroup T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public float Y;
    public float Z;
    public final org.telegram.ui.ActionBar.e6 a;
    public boolean a0;
    public final t71 b;
    public boolean b0;
    public final t71 c;
    public boolean c0;
    public final t71 d;
    public pl d0;
    public final gi.g1 e;
    public ValueAnimator e0;
    public final TextView f;
    public ValueAnimator f0;
    public final org.telegram.ui.Components.ba0 h;
    public i0.b n;
    public Bitmap r;
    public BitmapShader s;
    public Paint w;
    public Matrix x;
    public float y;

    public w71(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, R.style.TransparentDialog);
        this.n = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        this.b0 = false;
        this.a = e6Var;
        t71 t71Var = new t71(this, activity, 0);
        this.b = t71Var;
        t71Var.setOnClickListener(new cy0(this, 8));
        si.b bVar = new si.b();
        this.F = bVar;
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new kh.k(t71Var);
        cVar.i = t71Var;
        t71 t71Var2 = new t71(this, activity, 1);
        this.c = t71Var2;
        t71Var2.setClipToPadding(false);
        t71Var.addView(t71Var2, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        gi.g1 g1Var = new gi.g1(7, activity, this);
        this.e = g1Var;
        g1Var.setAdapter(new ci.o4(6, activity, this));
        t71Var2.addView(g1Var, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        t71 t71Var3 = new t71(this, activity, 2);
        this.d = t71Var3;
        t71Var2.addView(t71Var3, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        org.telegram.ui.Components.ba0 ba0Var = new org.telegram.ui.Components.ba0(activity, e6Var);
        this.h = ba0Var;
        ba0Var.a(0, org.telegram.messenger.bd.M0(2131744079, null));
        ba0Var.a(1, org.telegram.messenger.bd.M0(2131744080, null));
        t71Var2.addView(ba0Var, b8.mf.e(-1, 66, 80));
        ba0Var.setOnTabClick(new s3(g1Var, 24));
        gh.g c2 = cVar.c(ba0Var, null, false);
        c2.p(b8.cd.k(e6Var));
        c2.R.e = true;
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.r(org.telegram.messenger.g0.L(16.0f));
        ba0Var.setBackground(c2);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ba0Var.getColor());
        textView.setText(org.telegram.messenger.bd.M0(2131744081, null));
        textView.setGravity(17);
        t71Var2.addView(textView, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        mr0 mr0Var = new mr0(this, 5);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(t71Var, mr0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.up0 up0Var) {
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i3 = 0;
        final int i10 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.r71
            public final /* synthetic */ w71 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i3) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        w71 w71Var = this.b;
                        w71Var.y = floatValue;
                        w71Var.b.invalidate();
                        w71Var.c.invalidate();
                        w71Var.e();
                        break;
                    default:
                        w71 w71Var2 = this.b;
                        w71Var2.getClass();
                        w71Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.e0.addListener(new androidx.fragment.app.g(this, z10, up0Var, 14));
        long j10 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.e0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        valueAnimator3.setInterpolator(xqVar);
        this.e0.setDuration(j10);
        this.e0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.f0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.r71
            public final /* synthetic */ w71 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        w71 w71Var = this.b;
                        w71Var.y = floatValue;
                        w71Var.b.invalidate();
                        w71Var.c.invalidate();
                        w71Var.e();
                        break;
                    default:
                        w71 w71Var2 = this.b;
                        w71Var2.getClass();
                        w71Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.f0.addListener(new u40(10, this, z10));
        this.f0.setDuration((long) (j10 * 1.5f));
        this.f0.setInterpolator(xqVar);
        this.f0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Components.li0 li0Var;
        if (z10 && (li0Var = this.Q) != null && li0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().q) {
            this.Q.e();
            return;
        }
        if (this.b0) {
            return;
        }
        this.b0 = true;
        this.X = false;
        gi.g1 g1Var = this.e;
        g1Var.g();
        boolean z11 = g1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.q1 q1Var2 = this.L;
            if (q1Var2 != null) {
                q1Var2.setVisibility(4);
                this.L.invalidate();
            }
        } else if (!z10 && (q1Var = this.L) != null) {
            q1Var.setVisibility(0);
            org.telegram.ui.Cells.q1 q1Var3 = this.L;
            q1Var3.b6 = -1;
            q1Var3.invalidate();
        }
        this.c0 = !z10;
        d();
        b(false, new org.telegram.ui.Components.up0(14, this, z11));
        this.b.invalidate();
    }

    public final void d() {
        if (this.X) {
            return;
        }
        t71 t71Var = this.b;
        if (t71Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = this.L;
        if (q1Var != null) {
            int[] iArr = new int[2];
            q1Var.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            i0.b bVar = this.n;
            this.V = i3 - bVar.a;
            float f10 = iArr[1] - bVar.b;
            this.W = f10;
            if (!this.a0) {
                this.a0 = true;
                this.Y = f10;
                if (this.T != null) {
                    float height = f10 + this.L.getHeight() + this.T.getHeight();
                    int height2 = t71Var.getHeight();
                    i0.b bVar2 = this.n;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                        int height3 = t71Var.getHeight();
                        i0.b bVar3 = this.n;
                        this.Y = ((((height3 - bVar3.b) - bVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                    }
                }
                int b22 = this.J.b2(this.P);
                this.J.U1(b22);
                float T1 = this.J.T1(b22);
                float f11 = this.W;
                this.Z = f11;
                float f12 = (int) T1;
                float f13 = f11 + f12;
                int height4 = t71Var.getHeight();
                i0.b bVar4 = this.n;
                int L = ((height4 - bVar4.b) - bVar4.d) - org.telegram.messenger.g0.L(78.0f);
                TextView textView = this.f;
                if (f13 > L - textView.getHeight()) {
                    int height5 = t71Var.getHeight();
                    i0.b bVar5 = this.n;
                    this.Z = ((((height5 - bVar5.b) - bVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.R != null) {
                    float height6 = this.Z + f12 + r3.getHeight();
                    int height7 = t71Var.getHeight();
                    i0.b bVar6 = this.n;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                        int height8 = t71Var.getHeight();
                        i0.b bVar7 = this.n;
                        this.Z = (((((height8 - bVar7.b) - bVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - r1) - this.R.getHeight();
                    }
                }
            }
            e();
        } else {
            this.W = 0.0f;
            this.V = 0.0f;
        }
        this.X = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        gi.g1 g1Var = this.e;
        float positionAnimated = g1Var.getPositionAnimated();
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -g1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, g1Var.getWidth(), 0);
        if (this.X) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f10 = this.W;
                this.Y = f10;
                float height = f10 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                t71 t71Var = this.b;
                int height2 = t71Var.getHeight();
                i0.b bVar = this.n;
                if (height > ((height2 - bVar.b) - bVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = t71Var.getHeight();
                    i0.b bVar2 = this.n;
                    this.Y = ((((height3 - bVar2.b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.K.setTranslationX(org.telegram.messenger.g0.T1(this.V, 0.0f, this.c0 ? 1.0f : this.y) + W12);
        this.K.setTranslationY(org.telegram.messenger.g0.T1(this.W, this.Y, this.c0 ? 1.0f : this.y));
        ViewGroup viewGroup2 = this.T;
        t71 t71Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((W12 + 0.0f) + this.K.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.T.getLeft());
            } else {
                viewGroup2.setTranslationX((((W12 + 0.0f) + (this.K.X2() ? org.telegram.messenger.g0.L(48.0f) : 0)) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = t71Var2.getMeasuredWidth() - (this.T.getX() - W12);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - t71Var2.getTop());
            this.T.setAlpha(this.y);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.y);
            this.T.setScaleX(T1);
            this.T.setScaleY(T1);
        }
        this.J.setTranslationX(org.telegram.messenger.g0.T1(this.V, 0.0f, this.c0 ? 1.0f : this.y) + W1);
        this.J.setTranslationY(org.telegram.messenger.g0.T1(this.W, this.Z, this.c0 ? 1.0f : this.y));
        if (this.R != null) {
            int b22 = this.J.b2(this.P);
            this.J.U1(b22);
            float T12 = this.J.T1(b22);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((W1 + 0.0f) + this.J.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.R.getLeft());
            } else {
                this.R.setTranslationX((((W1 + 0.0f) + (this.J.X2() ? org.telegram.messenger.g0.L(48.0f) : 0)) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = t71Var2.getMeasuredWidth() - (this.R.getX() - W12);
            this.R.setTranslationY(((this.J.getY() + ((int) T12)) - this.R.getTop()) - t71Var2.getTop());
            this.R.setAlpha(this.y);
            float T13 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.y);
            this.R.setScaleX(T13);
            this.R.setScaleY(T13);
        }
        if (this.c0) {
            this.K.setAlpha(this.y);
            this.J.setAlpha(this.y);
        }
        if (this.Q != null) {
            float max = W12 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - t71Var2.getTop()));
            this.Q.setAlpha(this.y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.y);
            }
        }
        TextView textView = this.f;
        textView.setTranslationX(W1);
        textView.setAlpha(this.y);
        org.telegram.ui.Components.ba0 ba0Var = this.h;
        ba0Var.setSelectedTab(positionAnimated);
        ba0Var.setAlpha(this.y);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        t71 t71Var = this.b;
        setContentView(t71Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.hs.E1;
        attributes.dimAmount = 0.0f;
        int i3 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i3 | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        t71Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(t71Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Components.nk0.d(new c5(this, 28));
            this.O = true;
            b(true, null);
        }
    }
}
