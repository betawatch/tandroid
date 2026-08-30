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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rv0 extends Dialog {
    public float B;
    public final sg.b C;
    public final ng.a D;
    public MessageObject E;
    public boolean F;
    public pv0 G;
    public qv0 H;
    public org.telegram.ui.Cells.t1 I;
    public float J;
    public float K;
    public boolean L;
    public byte[] M;
    public org.telegram.ui.Components.pk0 N;
    public ViewGroup O;
    public float P;
    public ViewGroup Q;
    public float R;
    public boolean S;
    public float T;
    public float U;
    public boolean V;
    public float W;
    public float X;
    public boolean Y;
    public boolean Z;
    public final Context a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.f6 b;
    public um b0;
    public final nv0 c;
    public ValueAnimator c0;
    public final nv0 d;
    public ValueAnimator d0;
    public final nv0 e;
    public final ek f;
    public final TextView h;
    public final org.telegram.ui.Components.ub0 n;
    public i0.b r;
    public Bitmap s;
    public BitmapShader v;
    public Paint w;
    public Matrix x;
    public float y;

    public rv0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.r = i0.b.e;
        this.J = 0.0f;
        this.K = 0.0f;
        this.P = -1.0f;
        this.R = -1.0f;
        int i10 = 0;
        this.Z = false;
        this.a = activity;
        this.b = f6Var;
        nv0 nv0Var = new nv0(this, activity, i10);
        this.c = nv0Var;
        nv0Var.setOnClickListener(new e60(this, 23));
        sg.b bVar = new sg.b();
        this.C = bVar;
        ng.a aVar = new ng.a(bVar);
        this.D = aVar;
        aVar.d = new ug.i(nv0Var);
        aVar.e = nv0Var;
        nv0 nv0Var2 = new nv0(this, activity, 1);
        this.d = nv0Var2;
        nv0Var2.setClipToPadding(false);
        nv0Var.addView(nv0Var2, k7.b6.e(-1, -1, 119));
        int i11 = 2;
        ek ekVar = new ek(this, activity, 2);
        this.f = ekVar;
        ekVar.setAdapter(new gg.u(this, activity, i11));
        nv0Var2.addView(ekVar, k7.b6.e(-1, -1, 119));
        nv0 nv0Var3 = new nv0(this, activity, i11);
        this.e = nv0Var3;
        nv0Var2.addView(nv0Var3, k7.b6.e(-1, -1, 119));
        org.telegram.ui.Components.ub0 ub0Var = new org.telegram.ui.Components.ub0(activity, f6Var);
        this.n = ub0Var;
        ub0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        ub0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        nv0Var2.addView(ub0Var, k7.b6.e(-1, 66, 80));
        ub0Var.setOnTabClick(new w3(ekVar, 14));
        pg.b c3 = aVar.c(ub0Var, null, false);
        c3.n(rg.b.j(f6Var));
        c3.h.e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        ub0Var.setBackground(c3);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ub0Var.getColor());
        org.telegram.messenger.y3.r(R.string.PollMenuHint, textView, 17);
        nv0Var2.addView(textView, k7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        ov0 ov0Var = new ov0(this, i10);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(nv0Var, ov0Var);
    }

    public final void b(boolean z4, gv0 gv0Var) {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.d0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i10 = 0;
        final int i11 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z4 ? 1.0f : 0.0f);
        this.c0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.iv0
            public final /* synthetic */ rv0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        rv0 rv0Var = this.b;
                        rv0Var.y = floatValue;
                        rv0Var.c.invalidate();
                        rv0Var.d.invalidate();
                        pv0 pv0Var = rv0Var.G;
                        if (pv0Var != null) {
                            pv0Var.invalidate();
                        }
                        rv0Var.e();
                        break;
                    default:
                        rv0 rv0Var2 = this.b;
                        rv0Var2.getClass();
                        rv0Var2.B = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.c0.addListener(new androidx.fragment.app.g(this, z4, gv0Var, 10));
        long j10 = !z4 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.c0;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        valueAnimator3.setInterpolator(nrVar);
        this.c0.setDuration(j10);
        this.c0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.B, z4 ? 1.0f : 0.0f);
        this.d0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.iv0
            public final /* synthetic */ rv0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        rv0 rv0Var = this.b;
                        rv0Var.y = floatValue;
                        rv0Var.c.invalidate();
                        rv0Var.d.invalidate();
                        pv0 pv0Var = rv0Var.G;
                        if (pv0Var != null) {
                            pv0Var.invalidate();
                        }
                        rv0Var.e();
                        break;
                    default:
                        rv0 rv0Var2 = this.b;
                        rv0Var2.getClass();
                        rv0Var2.B = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.d0.addListener(new org.telegram.ui.Components.l00(26, this, z4));
        this.d0.setDuration((long) (j10 * 1.5f));
        this.d0.setInterpolator(nrVar);
        this.d0.start();
    }

    public final void c(boolean z4) {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.pk0 pk0Var;
        if (z4 && (pk0Var = this.N) != null && pk0Var.getReactionsWindow() != null && !this.N.getReactionsWindow().q) {
            this.N.e();
            return;
        }
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.V = false;
        ek ekVar = this.f;
        ekVar.l();
        boolean z10 = ekVar.getCurrentPosition() == 1;
        if (z4 && z10) {
            org.telegram.ui.Cells.t1 t1Var2 = this.I;
            if (t1Var2 != null) {
                t1Var2.setVisibility(4);
                this.I.invalidate();
            }
        } else if (!z4 && (t1Var = this.I) != null) {
            t1Var.setVisibility(0);
            org.telegram.ui.Cells.t1 t1Var3 = this.I;
            t1Var3.I7 = null;
            t1Var3.invalidate();
        }
        this.a0 = !z4;
        d();
        b(false, new gv0(this, z10));
        this.c.invalidate();
    }

    public final void d() {
        if (this.V) {
            return;
        }
        nv0 nv0Var = this.c;
        if (nv0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = this.I;
        if (t1Var != null) {
            int[] iArr = new int[2];
            t1Var.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            i0.b bVar = this.r;
            this.T = i10 - bVar.a;
            float f10 = iArr[1] - bVar.b;
            this.U = f10;
            if (!this.Y) {
                this.Y = true;
                this.W = f10;
                if (this.Q != null) {
                    float height = f10 + this.I.getHeight() + this.Q.getHeight();
                    int height2 = nv0Var.getHeight();
                    i0.b bVar2 = this.r;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = nv0Var.getHeight();
                        i0.b bVar3 = this.r;
                        this.W = ((((height3 - bVar3.b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.I.getHeight()) - this.Q.getHeight();
                    }
                }
                int I2 = this.G.I2(this.M);
                this.G.H2(I2);
                float G2 = this.G.G2(I2);
                float f11 = this.U;
                this.X = f11;
                float f12 = (int) G2;
                float f13 = f11 + f12;
                int height4 = nv0Var.getHeight();
                i0.b bVar4 = this.r;
                int dp = ((height4 - bVar4.b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.h;
                if (f13 > dp - textView.getHeight()) {
                    int height5 = nv0Var.getHeight();
                    i0.b bVar5 = this.r;
                    this.X = ((((height5 - bVar5.b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.O != null) {
                    float height6 = this.X + f12 + r3.getHeight();
                    int height7 = nv0Var.getHeight();
                    i0.b bVar6 = this.r;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = nv0Var.getHeight();
                        i0.b bVar7 = this.r;
                        this.X = (((((height8 - bVar7.b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1) - this.O.getHeight();
                    }
                }
            }
            e();
        } else {
            this.U = 0.0f;
            this.T = 0.0f;
        }
        this.V = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        ek ekVar = this.f;
        float positionAnimated = ekVar.getPositionAnimated();
        float lerp = AndroidUtilities.lerp(0, -ekVar.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(ekVar.getWidth(), 0, positionAnimated);
        if (this.V) {
            ViewGroup viewGroup = this.Q;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f10 = this.U;
                this.W = f10;
                float height = f10 + this.I.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                nv0 nv0Var = this.c;
                int height2 = nv0Var.getHeight();
                i0.b bVar = this.r;
                if (height > ((height2 - bVar.b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = nv0Var.getHeight();
                    i0.b bVar2 = this.r;
                    this.W = ((((height3 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.I.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.H.setTranslationX(AndroidUtilities.lerp(this.T, 0.0f, this.a0 ? 1.0f : this.y) + lerp2);
        this.H.setTranslationY(AndroidUtilities.lerp(this.U, this.W, this.a0 ? 1.0f : this.y));
        ViewGroup viewGroup2 = this.Q;
        nv0 nv0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.F) {
                viewGroup2.setTranslationX(((this.H.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.H.getLeft())) - AndroidUtilities.dp(8.0f)) - this.Q.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.H.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.H.getLeft()) - this.Q.getLeft());
            }
            this.R = nv0Var2.getMeasuredWidth() - (this.Q.getX() - lerp2);
            this.Q.setTranslationY(((this.H.getY() + this.H.getHeight()) - this.Q.getTop()) - nv0Var2.getTop());
            this.Q.setAlpha(this.y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.y);
            this.Q.setScaleX(lerp3);
            this.Q.setScaleY(lerp3);
        }
        this.G.setTranslationX(AndroidUtilities.lerp(this.T, 0.0f, this.a0 ? 1.0f : this.y) + lerp);
        this.G.setTranslationY(AndroidUtilities.lerp(this.U, this.X, this.a0 ? 1.0f : this.y));
        if (this.O != null) {
            int I2 = this.G.I2(this.M);
            this.G.H2(I2);
            float G2 = this.G.G2(I2);
            if (this.F) {
                this.O.setTranslationX(((this.G.getPollButtonsLeft() + ((lerp + 0.0f) + this.G.getLeft())) - AndroidUtilities.dp(8.0f)) - this.O.getLeft());
            } else {
                this.O.setTranslationX((((lerp + 0.0f) + (this.G.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.G.getLeft()) - this.O.getLeft());
            }
            this.P = nv0Var2.getMeasuredWidth() - (this.O.getX() - lerp2);
            this.O.setTranslationY(((this.G.getY() + ((int) G2)) - this.O.getTop()) - nv0Var2.getTop());
            this.O.setAlpha(this.y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.y);
            this.O.setScaleX(lerp4);
            this.O.setScaleY(lerp4);
        }
        if (this.a0) {
            this.H.setAlpha(this.y);
            this.G.setAlpha(this.y);
        }
        if (this.N != null) {
            float max = lerp2 + Math.max(0.0f, ((this.H.getBoundsLeft() + this.H.getBoundsRight()) / 2.0f) - (this.N.getWidth() * 0.8f));
            this.N.setTranslationX(max);
            this.N.setTranslationY(Math.max(0.0f, ((this.H.getY() - this.N.getHeight()) + AndroidUtilities.dp(22.0f)) - nv0Var2.getTop()));
            this.N.setAlpha(this.y);
            View windowView = this.N.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.y);
        org.telegram.ui.Components.ub0 ub0Var = this.n;
        ub0Var.setSelectedTab(positionAnimated);
        ub0Var.setAlpha(this.y);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        nv0 nv0Var = this.c;
        setContentView(nv0Var, layoutParams);
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
        nv0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(nv0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.im0.d(new d5(this, 15));
            this.L = true;
            b(true, null);
        }
    }
}
