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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zr0 extends Dialog {
    public float E;
    public float F;
    public final ui.b G;
    public final dh.c H;
    public org.telegram.messenger.fj I;
    public boolean J;
    public xr0 K;
    public yr0 L;
    public org.telegram.ui.Cells.r1 M;
    public float N;
    public float O;
    public boolean P;
    public byte[] Q;
    public org.telegram.ui.Components.xi0 R;
    public ViewGroup S;
    public float T;
    public ViewGroup U;
    public float V;
    public boolean W;
    public float X;
    public float Y;
    public boolean Z;
    public final Context a;
    public float a0;
    public final org.telegram.ui.ActionBar.i6 b;
    public float b0;
    public final vr0 c;
    public boolean c0;
    public final vr0 d;
    public boolean d0;
    public final vr0 e;
    public boolean e0;
    public final hi.q1 f;
    public ul f0;
    public ValueAnimator g0;
    public final TextView h;
    public ValueAnimator h0;
    public final org.telegram.ui.Components.ra0 n;
    public i0.b r;
    public Bitmap s;
    public BitmapShader w;
    public Paint x;
    public Matrix y;

    public zr0(Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity, R.style.TransparentDialog);
        this.r = i0.b.e;
        this.N = 0.0f;
        this.O = 0.0f;
        this.T = -1.0f;
        this.V = -1.0f;
        int i7 = 0;
        this.d0 = false;
        this.a = activity;
        this.b = i6Var;
        vr0 vr0Var = new vr0(this, activity, i7);
        this.c = vr0Var;
        vr0Var.setOnClickListener(new i40(this, 23));
        ui.b bVar = new ui.b();
        this.G = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.H = cVar;
        cVar.h = new jh.k(vr0Var);
        cVar.i = vr0Var;
        vr0 vr0Var2 = new vr0(this, activity, 1);
        this.d = vr0Var2;
        vr0Var2.setClipToPadding(false);
        vr0Var.addView(vr0Var2, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
        hi.q1 q1Var = new hi.q1(5, activity, this);
        this.f = q1Var;
        q1Var.setAdapter(new di.i4(4, activity, this));
        vr0Var2.addView(q1Var, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
        vr0 vr0Var3 = new vr0(this, activity, 2);
        this.e = vr0Var3;
        vr0Var2.addView(vr0Var3, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
        org.telegram.ui.Components.ra0 ra0Var = new org.telegram.ui.Components.ra0(activity, i6Var);
        this.n = ra0Var;
        ra0Var.a(0, org.telegram.messenger.gd.N0(2131746974, null));
        ra0Var.a(1, org.telegram.messenger.gd.N0(2131746973, null));
        vr0Var2.addView(ra0Var, c8.na.e(-1, 66, 80));
        ra0Var.setOnTabClick(new r3(q1Var, 20));
        fh.g c10 = cVar.c(ra0Var, null, false);
        c10.p(c8.j0.l(i6Var));
        c10.R.e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ra0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ra0Var.getColor());
        textView.setText(org.telegram.messenger.gd.N0(2131746975, null));
        textView.setGravity(17);
        vr0Var2.addView(textView, c8.na.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        wr0 wr0Var = new wr0(this, i7);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(vr0Var, wr0Var);
    }

    public final void b(boolean z10, qr0 qr0Var) {
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.h0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i7 = 0;
        final int i10 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.g0 = ofFloat;
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
                        zr0Var.E = floatValue;
                        zr0Var.c.invalidate();
                        zr0Var.d.invalidate();
                        xr0 xr0Var = zr0Var.K;
                        if (xr0Var != null) {
                            xr0Var.invalidate();
                        }
                        zr0Var.e();
                        break;
                    default:
                        zr0 zr0Var2 = this.b;
                        zr0Var2.getClass();
                        zr0Var2.F = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.g0.addListener(new androidx.fragment.app.g(this, z10, qr0Var, 12));
        long j3 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.g0;
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        valueAnimator3.setInterpolator(krVar);
        this.g0.setDuration(j3);
        this.g0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F, z10 ? 1.0f : 0.0f);
        this.h0 = ofFloat2;
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
                        zr0Var.E = floatValue;
                        zr0Var.c.invalidate();
                        zr0Var.d.invalidate();
                        xr0 xr0Var = zr0Var.K;
                        if (xr0Var != null) {
                            xr0Var.invalidate();
                        }
                        zr0Var.e();
                        break;
                    default:
                        zr0 zr0Var2 = this.b;
                        zr0Var2.getClass();
                        zr0Var2.F = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.h0.addListener(new b30(5, this, z10));
        this.h0.setDuration((long) (j3 * 1.5f));
        this.h0.setInterpolator(krVar);
        this.h0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.Components.xi0 xi0Var;
        if (z10 && (xi0Var = this.R) != null && xi0Var.getReactionsWindow() != null && !this.R.getReactionsWindow().q) {
            this.R.e();
            return;
        }
        if (this.d0) {
            return;
        }
        this.d0 = true;
        this.Z = false;
        hi.q1 q1Var = this.f;
        q1Var.g();
        boolean z11 = q1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.r1 r1Var2 = this.M;
            if (r1Var2 != null) {
                r1Var2.setVisibility(4);
                this.M.invalidate();
            }
        } else if (!z10 && (r1Var = this.M) != null) {
            r1Var.setVisibility(0);
            org.telegram.ui.Cells.r1 r1Var3 = this.M;
            r1Var3.d6 = null;
            r1Var3.invalidate();
        }
        this.e0 = !z10;
        d();
        b(false, new qr0(this, z11));
        this.c.invalidate();
    }

    public final void d() {
        if (this.Z) {
            return;
        }
        vr0 vr0Var = this.c;
        if (vr0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.r1 r1Var = this.M;
        if (r1Var != null) {
            int[] iArr = new int[2];
            r1Var.getLocationOnScreen(iArr);
            int i7 = iArr[0];
            i0.b bVar = this.r;
            this.X = i7 - bVar.a;
            float f10 = iArr[1] - bVar.b;
            this.Y = f10;
            if (!this.c0) {
                this.c0 = true;
                this.a0 = f10;
                if (this.U != null) {
                    float height = f10 + this.M.getHeight() + this.U.getHeight();
                    int height2 = vr0Var.getHeight();
                    i0.b bVar2 = this.r;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) {
                        int height3 = vr0Var.getHeight();
                        i0.b bVar3 = this.r;
                        this.a0 = ((((height3 - bVar3.b) - bVar3.d) - org.telegram.messenger.g0.L(66.0f)) - this.M.getHeight()) - this.U.getHeight();
                    }
                }
                int W1 = this.K.W1(this.Q);
                this.K.V1(W1);
                float U1 = this.K.U1(W1);
                float f11 = this.Y;
                this.b0 = f11;
                float f12 = (int) U1;
                float f13 = f11 + f12;
                int height4 = vr0Var.getHeight();
                i0.b bVar4 = this.r;
                int L = ((height4 - bVar4.b) - bVar4.d) - org.telegram.messenger.g0.L(78.0f);
                TextView textView = this.h;
                if (f13 > L - textView.getHeight()) {
                    int height5 = vr0Var.getHeight();
                    i0.b bVar5 = this.r;
                    this.b0 = ((((height5 - bVar5.b) - bVar5.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.S != null) {
                    float height6 = this.b0 + f12 + r3.getHeight();
                    int height7 = vr0Var.getHeight();
                    i0.b bVar6 = this.r;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) {
                        int height8 = vr0Var.getHeight();
                        i0.b bVar7 = this.r;
                        this.b0 = (((((height8 - bVar7.b) - bVar7.d) - org.telegram.messenger.g0.L(78.0f)) - textView.getHeight()) - r1) - this.S.getHeight();
                    }
                }
            }
            e();
        } else {
            this.Y = 0.0f;
            this.X = 0.0f;
        }
        this.Z = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        hi.q1 q1Var = this.f;
        float positionAnimated = q1Var.getPositionAnimated();
        float W1 = org.telegram.messenger.g0.W1(positionAnimated, 0, -q1Var.getWidth());
        float W12 = org.telegram.messenger.g0.W1(positionAnimated, q1Var.getWidth(), 0);
        if (this.Z) {
            ViewGroup viewGroup = this.U;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f10 = this.Y;
                this.a0 = f10;
                float height = f10 + this.M.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                vr0 vr0Var = this.c;
                int height2 = vr0Var.getHeight();
                i0.b bVar = this.r;
                if (height > ((height2 - bVar.b) - bVar.d) - org.telegram.messenger.g0.L(66.0f)) {
                    int height3 = vr0Var.getHeight();
                    i0.b bVar2 = this.r;
                    this.a0 = ((((height3 - bVar2.b) - bVar2.d) - org.telegram.messenger.g0.L(66.0f)) - this.M.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.L.setTranslationX(org.telegram.messenger.g0.T1(this.X, 0.0f, this.e0 ? 1.0f : this.E) + W12);
        this.L.setTranslationY(org.telegram.messenger.g0.T1(this.Y, this.a0, this.e0 ? 1.0f : this.E));
        ViewGroup viewGroup2 = this.U;
        vr0 vr0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.J) {
                viewGroup2.setTranslationX(((this.L.getPollButtonsLeft() + ((W12 + 0.0f) + this.L.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.U.getLeft());
            } else {
                viewGroup2.setTranslationX((((W12 + 0.0f) + (this.L.b3() ? org.telegram.messenger.g0.L(48.0f) : 0)) + this.L.getLeft()) - this.U.getLeft());
            }
            this.V = vr0Var2.getMeasuredWidth() - (this.U.getX() - W12);
            this.U.setTranslationY(((this.L.getY() + this.L.getHeight()) - this.U.getTop()) - vr0Var2.getTop());
            this.U.setAlpha(this.E);
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.E);
            this.U.setScaleX(T1);
            this.U.setScaleY(T1);
        }
        this.K.setTranslationX(org.telegram.messenger.g0.T1(this.X, 0.0f, this.e0 ? 1.0f : this.E) + W1);
        this.K.setTranslationY(org.telegram.messenger.g0.T1(this.Y, this.b0, this.e0 ? 1.0f : this.E));
        if (this.S != null) {
            int W13 = this.K.W1(this.Q);
            this.K.V1(W13);
            float U1 = this.K.U1(W13);
            if (this.J) {
                this.S.setTranslationX(((this.K.getPollButtonsLeft() + ((W1 + 0.0f) + this.K.getLeft())) - org.telegram.messenger.g0.L(8.0f)) - this.S.getLeft());
            } else {
                this.S.setTranslationX((((W1 + 0.0f) + (this.K.b3() ? org.telegram.messenger.g0.L(48.0f) : 0)) + this.K.getLeft()) - this.S.getLeft());
            }
            this.T = vr0Var2.getMeasuredWidth() - (this.S.getX() - W12);
            this.S.setTranslationY(((this.K.getY() + ((int) U1)) - this.S.getTop()) - vr0Var2.getTop());
            this.S.setAlpha(this.E);
            float T12 = org.telegram.messenger.g0.T1(0.75f, 1.0f, this.E);
            this.S.setScaleX(T12);
            this.S.setScaleY(T12);
        }
        if (this.e0) {
            this.L.setAlpha(this.E);
            this.K.setAlpha(this.E);
        }
        if (this.R != null) {
            float max = W12 + Math.max(0.0f, ((this.L.getBoundsLeft() + this.L.getBoundsRight()) / 2.0f) - (this.R.getWidth() * 0.8f));
            this.R.setTranslationX(max);
            this.R.setTranslationY(Math.max(0.0f, ((this.L.getY() - this.R.getHeight()) + org.telegram.messenger.g0.L(22.0f)) - vr0Var2.getTop()));
            this.R.setAlpha(this.E);
            View windowView = this.R.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.E);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(W1);
        textView.setAlpha(this.E);
        org.telegram.ui.Components.ra0 ra0Var = this.n;
        ra0Var.setSelectedTab(positionAnimated);
        ra0Var.setAlpha(this.E);
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
        attributes.gravity = org.telegram.messenger.ks.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i7 | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        vr0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.n3(vr0Var, !org.telegram.ui.ActionBar.n6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Components.yk0.d(new a5(this, 16));
            this.P = true;
            b(true, null);
        }
    }
}
