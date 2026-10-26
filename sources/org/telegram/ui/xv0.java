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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xv0 extends Dialog {
    public float E;
    public final hh.b F;
    public final ch.b G;
    public MessageObject H;
    public boolean I;
    public vv0 J;
    public wv0 K;
    public org.telegram.ui.Cells.s1 L;
    public float M;
    public float N;
    public boolean O;
    public byte[] P;
    public org.telegram.ui.Components.fl0 Q;
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
    public final org.telegram.ui.ActionBar.u6 b;
    public boolean b0;
    public final tv0 c;
    public boolean c0;
    public final tv0 d;
    public boolean d0;
    public final tv0 e;
    public qm e0;
    public final fi.h1 f;
    public ValueAnimator f0;
    public ValueAnimator g0;
    public final TextView h;
    public final org.telegram.ui.Components.lc0 n;
    public i0.b r;
    public Bitmap s;
    public BitmapShader v;
    public Paint w;
    public Matrix x;
    public float y;

    public xv0(Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, R.style.TransparentDialog);
        this.r = i0.b.e;
        this.M = 0.0f;
        this.N = 0.0f;
        this.S = -1.0f;
        this.U = -1.0f;
        int i10 = 0;
        this.c0 = false;
        this.a = activity;
        this.b = u6Var;
        tv0 tv0Var = new tv0(this, activity, i10);
        this.c = tv0Var;
        tv0Var.setOnClickListener(new x50(this, 24));
        hh.b bVar = new hh.b();
        this.F = bVar;
        ch.b bVar2 = new ch.b(bVar);
        this.G = bVar2;
        bVar2.f = new jh.k(tv0Var);
        bVar2.g = tv0Var;
        tv0 tv0Var2 = new tv0(this, activity, 1);
        this.d = tv0Var2;
        tv0Var2.setClipToPadding(false);
        tv0Var.addView(tv0Var2, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        fi.h1 h1Var = new fi.h1(this, activity, 6);
        this.f = h1Var;
        int i11 = 2;
        h1Var.setAdapter(new bi.e5(this, activity, i11));
        tv0Var2.addView(h1Var, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        tv0 tv0Var3 = new tv0(this, activity, i11);
        this.e = tv0Var3;
        tv0Var2.addView(tv0Var3, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        org.telegram.ui.Components.lc0 lc0Var = new org.telegram.ui.Components.lc0(activity, u6Var);
        this.n = lc0Var;
        lc0Var.a(0, LocaleController.getString(R.string.PollMenuTabOption));
        lc0Var.a(1, LocaleController.getString(R.string.PollMenuTabPoll));
        tv0Var2.addView(lc0Var, org.telegram.ui.Components.gb1.i(-1, 66, 80));
        lc0Var.setOnTabClick(new t3(h1Var, 18));
        eh.d c10 = bVar2.c(lc0Var, null, false);
        c10.v(gh.c.k(u6Var));
        c10.x.e = true;
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(16.0f));
        lc0Var.setBackground(c10);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(lc0Var.getColor());
        org.telegram.messenger.vh.k(R.string.PollMenuHint, textView, 17);
        tv0Var2.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        uv0 uv0Var = new uv0(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(tv0Var, uv0Var);
    }

    public final void b(boolean z10, nv0 nv0Var) {
        ValueAnimator valueAnimator = this.f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.g0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i10 = 0;
        final int i11 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.f0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ov0
            public final /* synthetic */ xv0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        xv0 xv0Var = this.b;
                        xv0Var.y = floatValue;
                        xv0Var.c.invalidate();
                        xv0Var.d.invalidate();
                        vv0 vv0Var = xv0Var.J;
                        if (vv0Var != null) {
                            vv0Var.invalidate();
                        }
                        xv0Var.e();
                        break;
                    default:
                        xv0 xv0Var2 = this.b;
                        xv0Var2.getClass();
                        xv0Var2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.f0.addListener(new ai.l0(this, z10, nv0Var, 12));
        long j10 = !z10 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.f0;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        valueAnimator3.setInterpolator(dsVar);
        this.f0.setDuration(j10);
        this.f0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.g0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ov0
            public final /* synthetic */ xv0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        xv0 xv0Var = this.b;
                        xv0Var.y = floatValue;
                        xv0Var.c.invalidate();
                        xv0Var.d.invalidate();
                        vv0 vv0Var = xv0Var.J;
                        if (vv0Var != null) {
                            vv0Var.invalidate();
                        }
                        xv0Var.e();
                        break;
                    default:
                        xv0 xv0Var2 = this.b;
                        xv0Var2.getClass();
                        xv0Var2.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.g0.addListener(new q40(5, this, z10));
        this.g0.setDuration((long) (j10 * 1.5f));
        this.g0.setInterpolator(dsVar);
        this.g0.start();
    }

    public final void c(boolean z10) {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Components.fl0 fl0Var;
        if (z10 && (fl0Var = this.Q) != null && fl0Var.getReactionsWindow() != null && !this.Q.getReactionsWindow().q) {
            this.Q.e();
            return;
        }
        if (this.c0) {
            return;
        }
        this.c0 = true;
        this.Y = false;
        fi.h1 h1Var = this.f;
        h1Var.l();
        boolean z11 = h1Var.getCurrentPosition() == 1;
        if (z10 && z11) {
            org.telegram.ui.Cells.s1 s1Var2 = this.L;
            if (s1Var2 != null) {
                s1Var2.setVisibility(4);
                this.L.invalidate();
            }
        } else if (!z10 && (s1Var = this.L) != null) {
            s1Var.setVisibility(0);
            org.telegram.ui.Cells.s1 s1Var3 = this.L;
            s1Var3.L7 = null;
            s1Var3.invalidate();
        }
        this.d0 = !z10;
        d();
        b(false, new nv0(this, z11));
        this.c.invalidate();
    }

    public final void d() {
        if (this.Y) {
            return;
        }
        tv0 tv0Var = this.c;
        if (tv0Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = this.L;
        if (s1Var != null) {
            int[] iArr = new int[2];
            s1Var.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            i0.b bVar = this.r;
            this.W = i10 - bVar.a;
            float f7 = iArr[1] - bVar.b;
            this.X = f7;
            if (!this.b0) {
                this.b0 = true;
                this.Z = f7;
                if (this.T != null) {
                    float height = f7 + this.L.getHeight() + this.T.getHeight();
                    int height2 = tv0Var.getHeight();
                    i0.b bVar2 = this.r;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = tv0Var.getHeight();
                        i0.b bVar3 = this.r;
                        this.Z = ((((height3 - bVar3.b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - this.T.getHeight();
                    }
                }
                int I2 = this.J.I2(this.P);
                this.J.H2(I2);
                float G2 = this.J.G2(I2);
                float f10 = this.X;
                this.a0 = f10;
                float f11 = (int) G2;
                float f12 = f10 + f11;
                int height4 = tv0Var.getHeight();
                i0.b bVar4 = this.r;
                int dp = ((height4 - bVar4.b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.h;
                if (f12 > dp - textView.getHeight()) {
                    int height5 = tv0Var.getHeight();
                    i0.b bVar5 = this.r;
                    this.a0 = ((((height5 - bVar5.b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.R != null) {
                    float height6 = this.a0 + f11 + r3.getHeight();
                    int height7 = tv0Var.getHeight();
                    i0.b bVar6 = this.r;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = tv0Var.getHeight();
                        i0.b bVar7 = this.r;
                        this.a0 = (((((height8 - bVar7.b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1) - this.R.getHeight();
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
        fi.h1 h1Var = this.f;
        float positionAnimated = h1Var.getPositionAnimated();
        float lerp = AndroidUtilities.lerp(0, -h1Var.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(h1Var.getWidth(), 0, positionAnimated);
        if (this.Y) {
            ViewGroup viewGroup = this.T;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f7 = this.X;
                this.Z = f7;
                float height = f7 + this.L.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                tv0 tv0Var = this.c;
                int height2 = tv0Var.getHeight();
                i0.b bVar = this.r;
                if (height > ((height2 - bVar.b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = tv0Var.getHeight();
                    i0.b bVar2 = this.r;
                    this.Z = ((((height3 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.L.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.K.setTranslationX(AndroidUtilities.lerp(this.W, 0.0f, this.d0 ? 1.0f : this.y) + lerp2);
        this.K.setTranslationY(AndroidUtilities.lerp(this.X, this.Z, this.d0 ? 1.0f : this.y));
        ViewGroup viewGroup2 = this.T;
        tv0 tv0Var2 = this.e;
        if (viewGroup2 != null) {
            if (this.I) {
                viewGroup2.setTranslationX(((this.K.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.K.getLeft())) - AndroidUtilities.dp(8.0f)) - this.T.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.K.B3() ? AndroidUtilities.dp(48.0f) : 0)) + this.K.getLeft()) - this.T.getLeft());
            }
            this.U = tv0Var2.getMeasuredWidth() - (this.T.getX() - lerp2);
            this.T.setTranslationY(((this.K.getY() + this.K.getHeight()) - this.T.getTop()) - tv0Var2.getTop());
            this.T.setAlpha(this.y);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.y);
            this.T.setScaleX(lerp3);
            this.T.setScaleY(lerp3);
        }
        this.J.setTranslationX(AndroidUtilities.lerp(this.W, 0.0f, this.d0 ? 1.0f : this.y) + lerp);
        this.J.setTranslationY(AndroidUtilities.lerp(this.X, this.a0, this.d0 ? 1.0f : this.y));
        if (this.R != null) {
            int I2 = this.J.I2(this.P);
            this.J.H2(I2);
            float G2 = this.J.G2(I2);
            if (this.I) {
                this.R.setTranslationX(((this.J.getPollButtonsLeft() + ((lerp + 0.0f) + this.J.getLeft())) - AndroidUtilities.dp(8.0f)) - this.R.getLeft());
            } else {
                this.R.setTranslationX((((lerp + 0.0f) + (this.J.B3() ? AndroidUtilities.dp(48.0f) : 0)) + this.J.getLeft()) - this.R.getLeft());
            }
            this.S = tv0Var2.getMeasuredWidth() - (this.R.getX() - lerp2);
            this.R.setTranslationY(((this.J.getY() + ((int) G2)) - this.R.getTop()) - tv0Var2.getTop());
            this.R.setAlpha(this.y);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.y);
            this.R.setScaleX(lerp4);
            this.R.setScaleY(lerp4);
        }
        if (this.d0) {
            this.K.setAlpha(this.y);
            this.J.setAlpha(this.y);
        }
        if (this.Q != null) {
            float max = lerp2 + Math.max(0.0f, ((this.K.getBoundsLeft() + this.K.getBoundsRight()) / 2.0f) - (this.Q.getWidth() * 0.8f));
            this.Q.setTranslationX(max);
            this.Q.setTranslationY(Math.max(0.0f, ((this.K.getY() - this.Q.getHeight()) + AndroidUtilities.dp(22.0f)) - tv0Var2.getTop()));
            this.Q.setAlpha(this.y);
            View windowView = this.Q.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.y);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.y);
        org.telegram.ui.Components.lc0 lc0Var = this.n;
        lc0Var.setSelectedTab(positionAnimated);
        lc0Var.setAlpha(this.y);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        tv0 tv0Var = this.c;
        setContentView(tv0Var, layoutParams);
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
        tv0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(tv0Var, !org.telegram.ui.ActionBar.y6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.hn0.d(new e5(this, 15));
            this.O = true;
            b(true, null);
        }
    }
}
