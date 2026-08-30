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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rd1 extends Dialog {
    public final sg.b B;
    public final ng.a C;
    public MessageObject D;
    public boolean E;
    public pd1 F;
    public qv0 G;
    public org.telegram.ui.Cells.t1 H;
    public float I;
    public float J;
    public boolean K;
    public int L;
    public org.telegram.ui.Components.pk0 M;
    public ViewGroup N;
    public float O;
    public ViewGroup P;
    public float Q;
    public float R;
    public float S;
    public boolean T;
    public float U;
    public float V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public um Z;
    public final org.telegram.ui.ActionBar.f6 a;
    public ValueAnimator a0;
    public final od1 b;
    public ValueAnimator b0;
    public final od1 c;
    public final od1 d;
    public final ek e;
    public final TextView f;
    public final org.telegram.ui.Components.ub0 h;
    public i0.b n;
    public Bitmap r;
    public BitmapShader s;
    public Paint v;
    public Matrix w;
    public float x;
    public float y;

    public rd1(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, R.style.TransparentDialog);
        this.n = i0.b.e;
        this.I = 0.0f;
        this.J = 0.0f;
        this.O = -1.0f;
        this.Q = -1.0f;
        this.X = false;
        this.a = f6Var;
        od1 od1Var = new od1(this, activity, 0);
        this.b = od1Var;
        od1Var.setOnClickListener(new i31(this, 7));
        sg.b bVar = new sg.b();
        this.B = bVar;
        ng.a aVar = new ng.a(bVar);
        this.C = aVar;
        aVar.d = new ug.i(od1Var);
        aVar.e = od1Var;
        od1 od1Var2 = new od1(this, activity, 1);
        this.c = od1Var2;
        od1Var2.setClipToPadding(false);
        od1Var.addView(od1Var2, k7.b6.e(-1, -1, 119));
        ek ekVar = new ek(this, activity, 5);
        this.e = ekVar;
        ekVar.setAdapter(new gg.u(this, activity, 4));
        od1Var2.addView(ekVar, k7.b6.e(-1, -1, 119));
        od1 od1Var3 = new od1(this, activity, 2);
        this.d = od1Var3;
        od1Var2.addView(od1Var3, k7.b6.e(-1, -1, 119));
        org.telegram.ui.Components.ub0 ub0Var = new org.telegram.ui.Components.ub0(activity, f6Var);
        this.h = ub0Var;
        ub0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        ub0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        od1Var2.addView(ub0Var, k7.b6.e(-1, 66, 80));
        ub0Var.setOnTabClick(new w3(ekVar, 22));
        pg.b c3 = aVar.c(ub0Var, null, false);
        c3.n(rg.b.j(f6Var));
        c3.h.e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        ub0Var.setBackground(c3);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(ub0Var.getColor());
        org.telegram.messenger.y3.r(R.string.TodoMenuHint, textView, 17);
        od1Var2.addView(textView, k7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        ov0 ov0Var = new ov0(this, 6);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(od1Var, ov0Var);
    }

    public final void b(boolean z4, org.telegram.ui.Components.kv0 kv0Var) {
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        int i10 = 2;
        final int i11 = 0;
        final int i12 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z4 ? 1.0f : 0.0f);
        this.a0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kd1
            public final /* synthetic */ rd1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        rd1 rd1Var = this.b;
                        rd1Var.x = floatValue;
                        rd1Var.b.invalidate();
                        rd1Var.c.invalidate();
                        rd1Var.e();
                        break;
                    default:
                        rd1 rd1Var2 = this.b;
                        rd1Var2.getClass();
                        rd1Var2.y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.a0.addListener(new androidx.fragment.app.g(this, z4, kv0Var, 12));
        long j10 = !z4 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.a0;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        valueAnimator3.setInterpolator(nrVar);
        this.a0.setDuration(j10);
        this.a0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y, z4 ? 1.0f : 0.0f);
        this.b0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kd1
            public final /* synthetic */ rd1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i12) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        rd1 rd1Var = this.b;
                        rd1Var.x = floatValue;
                        rd1Var.b.invalidate();
                        rd1Var.c.invalidate();
                        rd1Var.e();
                        break;
                    default:
                        rd1 rd1Var2 = this.b;
                        rd1Var2.getClass();
                        rd1Var2.y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.b0.addListener(new l61(i10, this, z4));
        this.b0.setDuration((long) (j10 * 1.5f));
        this.b0.setInterpolator(nrVar);
        this.b0.start();
    }

    public final void c(boolean z4) {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.pk0 pk0Var;
        if (z4 && (pk0Var = this.M) != null && pk0Var.getReactionsWindow() != null && !this.M.getReactionsWindow().q) {
            this.M.e();
            return;
        }
        if (this.X) {
            return;
        }
        this.X = true;
        this.T = false;
        ek ekVar = this.e;
        ekVar.l();
        boolean z10 = ekVar.getCurrentPosition() == 1;
        if (z4 && z10) {
            org.telegram.ui.Cells.t1 t1Var2 = this.H;
            if (t1Var2 != null) {
                t1Var2.setVisibility(4);
                this.H.invalidate();
            }
        } else if (!z4 && (t1Var = this.H) != null) {
            t1Var.setVisibility(0);
            org.telegram.ui.Cells.t1 t1Var3 = this.H;
            t1Var3.H7 = -1;
            t1Var3.invalidate();
        }
        this.Y = !z4;
        d();
        b(false, new org.telegram.ui.Components.kv0(10, this, z10));
        this.b.invalidate();
    }

    public final void d() {
        if (this.T) {
            return;
        }
        od1 od1Var = this.b;
        if (od1Var.getWidth() <= 0) {
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = this.H;
        if (t1Var != null) {
            int[] iArr = new int[2];
            t1Var.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            i0.b bVar = this.n;
            this.R = i10 - bVar.a;
            float f10 = iArr[1] - bVar.b;
            this.S = f10;
            if (!this.W) {
                this.W = true;
                this.U = f10;
                if (this.P != null) {
                    float height = f10 + this.H.getHeight() + this.P.getHeight();
                    int height2 = od1Var.getHeight();
                    i0.b bVar2 = this.n;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = od1Var.getHeight();
                        i0.b bVar3 = this.n;
                        this.U = ((((height3 - bVar3.b) - bVar3.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - this.P.getHeight();
                    }
                }
                int O2 = this.F.O2(this.L);
                this.F.H2(O2);
                float G2 = this.F.G2(O2);
                float f11 = this.S;
                this.V = f11;
                float f12 = (int) G2;
                float f13 = f11 + f12;
                int height4 = od1Var.getHeight();
                i0.b bVar4 = this.n;
                int dp = ((height4 - bVar4.b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.f;
                if (f13 > dp - textView.getHeight()) {
                    int height5 = od1Var.getHeight();
                    i0.b bVar5 = this.n;
                    this.V = ((((height5 - bVar5.b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.N != null) {
                    float height6 = this.V + f12 + r3.getHeight();
                    int height7 = od1Var.getHeight();
                    i0.b bVar6 = this.n;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = od1Var.getHeight();
                        i0.b bVar7 = this.n;
                        this.V = (((((height8 - bVar7.b) - bVar7.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1) - this.N.getHeight();
                    }
                }
            }
            e();
        } else {
            this.S = 0.0f;
            this.R = 0.0f;
        }
        this.T = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c(true);
    }

    public final void e() {
        ek ekVar = this.e;
        float positionAnimated = ekVar.getPositionAnimated();
        float lerp = AndroidUtilities.lerp(0, -ekVar.getWidth(), positionAnimated);
        float lerp2 = AndroidUtilities.lerp(ekVar.getWidth(), 0, positionAnimated);
        if (this.T) {
            ViewGroup viewGroup = this.P;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f10 = this.S;
                this.U = f10;
                float height = f10 + this.H.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                od1 od1Var = this.b;
                int height2 = od1Var.getHeight();
                i0.b bVar = this.n;
                if (height > ((height2 - bVar.b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = od1Var.getHeight();
                    i0.b bVar2 = this.n;
                    this.U = ((((height3 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.G.setTranslationX(AndroidUtilities.lerp(this.R, 0.0f, this.Y ? 1.0f : this.x) + lerp2);
        this.G.setTranslationY(AndroidUtilities.lerp(this.S, this.U, this.Y ? 1.0f : this.x));
        ViewGroup viewGroup2 = this.P;
        od1 od1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.E) {
                viewGroup2.setTranslationX(((this.G.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.G.getLeft())) - AndroidUtilities.dp(8.0f)) - this.P.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.G.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.G.getLeft()) - this.P.getLeft());
            }
            this.Q = od1Var2.getMeasuredWidth() - (this.P.getX() - lerp2);
            this.P.setTranslationY(((this.G.getY() + this.G.getHeight()) - this.P.getTop()) - od1Var2.getTop());
            this.P.setAlpha(this.x);
            float lerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.x);
            this.P.setScaleX(lerp3);
            this.P.setScaleY(lerp3);
        }
        this.F.setTranslationX(AndroidUtilities.lerp(this.R, 0.0f, this.Y ? 1.0f : this.x) + lerp);
        this.F.setTranslationY(AndroidUtilities.lerp(this.S, this.V, this.Y ? 1.0f : this.x));
        if (this.N != null) {
            int O2 = this.F.O2(this.L);
            this.F.H2(O2);
            float G2 = this.F.G2(O2);
            if (this.E) {
                this.N.setTranslationX(((this.F.getPollButtonsLeft() + ((lerp + 0.0f) + this.F.getLeft())) - AndroidUtilities.dp(8.0f)) - this.N.getLeft());
            } else {
                this.N.setTranslationX((((lerp + 0.0f) + (this.F.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.F.getLeft()) - this.N.getLeft());
            }
            this.O = od1Var2.getMeasuredWidth() - (this.N.getX() - lerp2);
            this.N.setTranslationY(((this.F.getY() + ((int) G2)) - this.N.getTop()) - od1Var2.getTop());
            this.N.setAlpha(this.x);
            float lerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.x);
            this.N.setScaleX(lerp4);
            this.N.setScaleY(lerp4);
        }
        if (this.Y) {
            this.G.setAlpha(this.x);
            this.F.setAlpha(this.x);
        }
        if (this.M != null) {
            float max = lerp2 + Math.max(0.0f, ((this.G.getBoundsLeft() + this.G.getBoundsRight()) / 2.0f) - (this.M.getWidth() * 0.8f));
            this.M.setTranslationX(max);
            this.M.setTranslationY(Math.max(0.0f, ((this.G.getY() - this.M.getHeight()) + AndroidUtilities.dp(22.0f)) - od1Var2.getTop()));
            this.M.setAlpha(this.x);
            View windowView = this.M.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.x);
            }
        }
        TextView textView = this.f;
        textView.setTranslationX(lerp);
        textView.setAlpha(this.x);
        org.telegram.ui.Components.ub0 ub0Var = this.h;
        ub0Var.setSelectedTab(positionAnimated);
        ub0Var.setAlpha(this.x);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        od1 od1Var = this.b;
        setContentView(od1Var, layoutParams);
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
        od1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(od1Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.im0.d(new d5(this, 28));
            this.K = true;
            b(true, null);
        }
    }
}
