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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class re1 extends Dialog {
    public final gh.b E;
    public final bh.b F;
    public MessageObject G;
    public boolean H;
    public pe1 I;
    public qw0 J;
    public org.telegram.ui.Cells.u1 K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public org.telegram.ui.Components.gl0 P;
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
    public final org.telegram.ui.ActionBar.c6 a;
    public boolean a0;
    public final oe1 b;
    public boolean b0;
    public final oe1 c;
    public bn c0;
    public final oe1 d;
    public ValueAnimator d0;
    public final di.h1 e;
    public ValueAnimator e0;
    public final TextView f;
    public final org.telegram.ui.Components.tc0 h;
    public i0.b n;
    public Bitmap r;
    public BitmapShader s;
    public Paint v;
    public Matrix w;
    public float x;
    public float y;

    public re1(Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, R.style.TransparentDialog);
        this.n = i0.b.e;
        this.L = 0.0f;
        this.M = 0.0f;
        this.R = -1.0f;
        this.T = -1.0f;
        this.a0 = false;
        this.a = c6Var;
        oe1 oe1Var = new oe1(this, activity, 0);
        this.b = oe1Var;
        oe1Var.setOnClickListener(new v41(this, 5));
        gh.b bVar = new gh.b();
        this.E = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.F = bVar2;
        bVar2.f = new ih.j(oe1Var);
        bVar2.g = oe1Var;
        oe1 oe1Var2 = new oe1(this, activity, 1);
        this.c = oe1Var2;
        oe1Var2.setClipToPadding(false);
        oe1Var.addView(oe1Var2, w7.z5.e(-1, -1, 119));
        di.h1 h1Var = new di.h1(this, activity, 8);
        this.e = h1Var;
        int i10 = 2;
        h1Var.setAdapter(new nw0(this, activity, i10));
        oe1Var2.addView(h1Var, w7.z5.e(-1, -1, 119));
        oe1 oe1Var3 = new oe1(this, activity, i10);
        this.d = oe1Var3;
        oe1Var2.addView(oe1Var3, w7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.tc0 tc0Var = new org.telegram.ui.Components.tc0(activity, c6Var);
        this.h = tc0Var;
        tc0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        tc0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        oe1Var2.addView(tc0Var, w7.z5.e(-1, 66, 80));
        tc0Var.setOnTabClick(new v3(h1Var, 25));
        dh.d c10 = bVar2.c(tc0Var, null, false);
        c10.o(fh.b.k(c6Var));
        c10.j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        tc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(tc0Var.getColor());
        org.telegram.messenger.sk.m(R.string.TodoMenuHint, textView, 17);
        oe1Var2.addView(textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 66.0f, -1, 80));
        ow0 ow0Var = new ow0(this, 6);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(oe1Var, ow0Var);
    }

    public final void b(boolean z10, org.telegram.ui.Components.zr0 zr0Var) {
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.d0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ke1
            public final /* synthetic */ re1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        re1 re1Var = this.b;
                        re1Var.x = floatValue;
                        re1Var.b.invalidate();
                        re1Var.c.invalidate();
                        re1Var.e();
                        break;
                    default:
                        re1 re1Var2 = this.b;
                        re1Var2.getClass();
                        re1Var2.y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.d0.addListener(new ah.q0(this, z10, zr0Var, 12));
        long j10 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.d0;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        valueAnimator3.setInterpolator(esVar);
        this.d0.setDuration(j10);
        this.d0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.e0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ke1
            public final /* synthetic */ re1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        re1 re1Var = this.b;
                        re1Var.x = floatValue;
                        re1Var.b.invalidate();
                        re1Var.c.invalidate();
                        re1Var.e();
                        break;
                    default:
                        re1 re1Var2 = this.b;
                        re1Var2.getClass();
                        re1Var2.y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.e0.addListener(new i50(11, this, z10));
        this.e0.setDuration((long) (j10 * 1.5f));
        this.e0.setInterpolator(esVar);
        this.e0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.Components.gl0 gl0Var;
        if (z10 && (gl0Var = this.P) != null && gl0Var.getReactionsWindow() != null && !this.P.getReactionsWindow().q) {
            this.P.e();
            return;
        }
        if (this.a0) {
            return;
        }
        this.a0 = true;
        this.W = false;
        di.h1 h1Var = this.e;
        h1Var.l();
        boolean z11 = h1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.u1 u1Var2 = this.K;
            if (u1Var2 != null) {
                u1Var2.setVisibility(4);
                this.K.invalidate();
            }
        } else if (!z10 && (u1Var = this.K) != null) {
            u1Var.setVisibility(0);
            org.telegram.ui.Cells.u1 u1Var3 = this.K;
            u1Var3.K7 = -1;
            u1Var3.invalidate();
        }
        this.b0 = !z10;
        d();
        b(false, new org.telegram.ui.Components.zr0(14, this, z11));
        this.b.invalidate();
    }

    public final void d() {
        if (this.W) {
            return;
        }
        oe1 oe1Var = this.b;
        if (oe1Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = this.K;
        if (u1Var != null) {
            int[] iArr = new int[2];
            u1Var.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            i0.b bVar = this.n;
            this.U = i10 - bVar.a;
            float f7 = iArr[1] - bVar.b;
            this.V = f7;
            if (!this.Z) {
                this.Z = true;
                this.X = f7;
                if (this.S != null) {
                    float height = f7 + this.K.getHeight() + this.S.getHeight();
                    int height2 = oe1Var.getHeight();
                    i0.b bVar2 = this.n;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = oe1Var.getHeight();
                        i0.b bVar3 = this.n;
                        this.X = ((((height3 - bVar3.b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - this.S.getHeight();
                    }
                }
                int O2 = this.I.O2(this.O);
                this.I.H2(O2);
                float G2 = this.I.G2(O2);
                float f10 = this.V;
                this.Y = f10;
                float f11 = (int) G2;
                float f12 = f10 + f11;
                int height4 = oe1Var.getHeight();
                i0.b bVar4 = this.n;
                int dp = ((height4 - bVar4.b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.f;
                if (f12 > dp - textView.getHeight()) {
                    int height5 = oe1Var.getHeight();
                    i0.b bVar5 = this.n;
                    this.Y = ((((height5 - bVar5.b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.Q != null) {
                    float height6 = this.Y + f11 + r3.getHeight();
                    int height7 = oe1Var.getHeight();
                    i0.b bVar6 = this.n;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = oe1Var.getHeight();
                        i0.b bVar7 = this.n;
                        this.Y = (((((height8 - bVar7.b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1) - this.Q.getHeight();
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
        di.h1 h1Var = this.e;
        float positionAnimated = h1Var.getPositionAnimated();
        float lerp = AndroidUtilities.lerp(0, -h1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(h1Var.getWidth(), 0, positionAnimated);
        if (this.W) {
            ViewGroup viewGroup = this.S;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f7 = this.V;
                this.X = f7;
                float height = f7 + this.K.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                oe1 oe1Var = this.b;
                int height2 = oe1Var.getHeight();
                i0.b bVar = this.n;
                if (height > ((height2 - bVar.b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = oe1Var.getHeight();
                    i0.b bVar2 = this.n;
                    this.X = ((((height3 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.K.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.J.setTranslationX(AndroidUtilities.lerp(this.U, 0.0f, this.b0 ? 1.0f : this.x) + lerp2);
        this.J.setTranslationY(AndroidUtilities.lerp(this.V, this.X, this.b0 ? 1.0f : this.x));
        ViewGroup viewGroup2 = this.S;
        oe1 oe1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.H) {
                viewGroup2.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.S.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.J.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.J.getLeft()) - this.S.getLeft());
            }
            this.T = oe1Var2.getMeasuredWidth() - (this.S.getX() - lerp2);
            this.S.setTranslationY(((this.J.getY() + this.J.getHeight()) - this.S.getTop()) - oe1Var2.getTop());
            this.S.setAlpha(this.x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.x);
            this.S.setScaleX(lerp3);
            this.S.setScaleY(lerp3);
        }
        this.I.setTranslationX(AndroidUtilities.lerp(this.U, 0.0f, this.b0 ? 1.0f : this.x) + lerp);
        this.I.setTranslationY(AndroidUtilities.lerp(this.V, this.Y, this.b0 ? 1.0f : this.x));
        if (this.Q != null) {
            int O2 = this.I.O2(this.O);
            this.I.H2(O2);
            float G2 = this.I.G2(O2);
            if (this.H) {
                this.Q.setTranslationX(((this.I.getPollButtonsLeft() + ((lerp + 0.0f) + this.I.getLeft())) - AndroidUtilities.dp(8.0f)) - this.Q.getLeft());
            } else {
                this.Q.setTranslationX((((lerp + 0.0f) + (this.I.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.I.getLeft()) - this.Q.getLeft());
            }
            this.R = oe1Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.I.getY() + ((int) G2)) - this.Q.getTop()) - oe1Var2.getTop());
            this.Q.setAlpha(this.x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.x);
            this.Q.setScaleX(lerp4);
            this.Q.setScaleY(lerp4);
        }
        if (this.b0) {
            this.J.setAlpha(this.x);
            this.I.setAlpha(this.x);
        }
        if (this.P != null) {
            float max = lerp2 + Math.max(0.0f, ((this.J.getBoundsLeft() + this.J.getBoundsRight()) / 2.0f) - (this.P.getWidth() * 0.8f));
            this.P.setTranslationX(max);
            this.P.setTranslationY(Math.max(0.0f, ((this.J.getY() - this.P.getHeight()) + AndroidUtilities.dp(22.0f)) - oe1Var2.getTop()));
            this.P.setAlpha(this.x);
            View windowView = this.P.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.x);
            }
        }
        TextView textView = this.f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.x);
        org.telegram.ui.Components.tc0 tc0Var = this.h;
        tc0Var.setSelectedTab(positionAnimated);
        tc0Var.setAlpha(this.x);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        oe1 oe1Var = this.b;
        setContentView(oe1Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i10 | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        oe1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(oe1Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.cn0.d(new f5(this, 28));
            this.N = true;
            b(true, null);
        }
    }
}
