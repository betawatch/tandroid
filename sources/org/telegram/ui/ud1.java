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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ud1 extends Dialog {
    public final tg.b B;
    public final og.a C;
    public MessageObject D;
    public boolean E;
    public sd1 F;
    public sv0 G;
    public org.telegram.ui.Cells.t1 H;
    public float I;
    public float J;
    public boolean K;
    public int L;
    public org.telegram.ui.Components.rk0 M;
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
    public final org.telegram.ui.ActionBar.g6 a;
    public ValueAnimator a0;
    public final rd1 b;
    public ValueAnimator b0;
    public final rd1 c;
    public final rd1 d;
    public final ek e;
    public final TextView f;
    public final org.telegram.ui.Components.wb0 h;
    public i0.b n;
    public Bitmap r;
    public BitmapShader s;
    public Paint v;
    public Matrix w;
    public float x;
    public float y;

    public ud1(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, R.style.TransparentDialog);
        this.n = i0.b.e;
        this.I = 0.0f;
        this.J = 0.0f;
        this.O = -1.0f;
        this.Q = -1.0f;
        this.X = false;
        this.a = g6Var;
        rd1 rd1Var = new rd1(this, activity, 0);
        this.b = rd1Var;
        rd1Var.setOnClickListener(new k31(this, 7));
        tg.b bVar = new tg.b();
        this.B = bVar;
        og.a aVar = new og.a(bVar);
        this.C = aVar;
        aVar.d = new vg.i(rd1Var);
        aVar.e = rd1Var;
        rd1 rd1Var2 = new rd1(this, activity, 1);
        this.c = rd1Var2;
        rd1Var2.setClipToPadding(false);
        rd1Var.addView(rd1Var2, k7.c6.e(-1, -1, 119));
        ek ekVar = new ek(this, activity, 5);
        this.e = ekVar;
        ekVar.setAdapter(new hg.u(this, activity, 4));
        rd1Var2.addView(ekVar, k7.c6.e(-1, -1, 119));
        rd1 rd1Var3 = new rd1(this, activity, 2);
        this.d = rd1Var3;
        rd1Var2.addView(rd1Var3, k7.c6.e(-1, -1, 119));
        org.telegram.ui.Components.wb0 wb0Var = new org.telegram.ui.Components.wb0(activity, g6Var);
        this.h = wb0Var;
        wb0Var.a(0, LocaleController.getString(R.string.TodoMenuTabTask));
        wb0Var.a(1, LocaleController.getString(R.string.TodoMenuTabList));
        rd1Var2.addView(wb0Var, k7.c6.e(-1, 66, 80));
        wb0Var.setOnTabClick(new w3(ekVar, 22));
        qg.b c3 = aVar.c(wb0Var, null, false);
        c3.n(sg.b.j(g6Var));
        c3.h.e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        wb0Var.setBackground(c3);
        TextView textView = new TextView(activity);
        this.f = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(wb0Var.getColor());
        org.telegram.messenger.y3.r(R.string.TodoMenuHint, textView, 17);
        rd1Var2.addView(textView, k7.c6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        qv0 qv0Var = new qv0(this, 6);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(rd1Var, qv0Var);
    }

    public final void b(boolean z4, org.telegram.ui.Components.rv0 rv0Var) {
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final int i10 = 0;
        final int i11 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z4 ? 1.0f : 0.0f);
        this.a0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.md1
            public final /* synthetic */ ud1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                switch (i10) {
                    case 0:
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ud1 ud1Var = this.b;
                        ud1Var.x = floatValue;
                        ud1Var.b.invalidate();
                        ud1Var.c.invalidate();
                        ud1Var.e();
                        break;
                    default:
                        ud1 ud1Var2 = this.b;
                        ud1Var2.getClass();
                        ud1Var2.y = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.a0.addListener(new androidx.fragment.app.g(this, z4, rv0Var, 12));
        long j10 = !z4 ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.a0;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        valueAnimator3.setInterpolator(prVar);
        this.a0.setDuration(j10);
        this.a0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y, z4 ? 1.0f : 0.0f);
        this.b0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.md1
            public final /* synthetic */ ud1 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                switch (i11) {
                    case 0:
                        float floatValue = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        ud1 ud1Var = this.b;
                        ud1Var.x = floatValue;
                        ud1Var.b.invalidate();
                        ud1Var.c.invalidate();
                        ud1Var.e();
                        break;
                    default:
                        ud1 ud1Var2 = this.b;
                        ud1Var2.getClass();
                        ud1Var2.y = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.b0.addListener(new qd1(i10, this, z4));
        this.b0.setDuration((long) (j10 * 1.5f));
        this.b0.setInterpolator(prVar);
        this.b0.start();
    }

    public final void c(boolean z4) {
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.Components.rk0 rk0Var;
        if (z4 && (rk0Var = this.M) != null && rk0Var.getReactionsWindow() != null && !this.M.getReactionsWindow().q) {
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
        b(false, new org.telegram.ui.Components.rv0(9, this, z10));
        this.b.invalidate();
    }

    public final void d() {
        if (this.T) {
            return;
        }
        rd1 rd1Var = this.b;
        if (rd1Var.getWidth() <= 0) {
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
                    int height2 = rd1Var.getHeight();
                    i0.b bVar2 = this.n;
                    if (height > ((height2 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) {
                        int height3 = rd1Var.getHeight();
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
                int height4 = rd1Var.getHeight();
                i0.b bVar4 = this.n;
                int dp = ((height4 - bVar4.b) - bVar4.d) - AndroidUtilities.dp(78.0f);
                TextView textView = this.f;
                if (f13 > dp - textView.getHeight()) {
                    int height5 = rd1Var.getHeight();
                    i0.b bVar5 = this.n;
                    this.V = ((((height5 - bVar5.b) - bVar5.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) - r1;
                }
                if (this.N != null) {
                    float height6 = this.V + f12 + r3.getHeight();
                    int height7 = rd1Var.getHeight();
                    i0.b bVar6 = this.n;
                    if (height6 > (((height7 - bVar6.b) - bVar6.d) - AndroidUtilities.dp(78.0f)) - textView.getHeight()) {
                        int height8 = rd1Var.getHeight();
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
                rd1 rd1Var = this.b;
                int height2 = rd1Var.getHeight();
                i0.b bVar = this.n;
                if (height > ((height2 - bVar.b) - bVar.d) - AndroidUtilities.dp(66.0f)) {
                    int height3 = rd1Var.getHeight();
                    i0.b bVar2 = this.n;
                    this.U = ((((height3 - bVar2.b) - bVar2.d) - AndroidUtilities.dp(66.0f)) - this.H.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.G.setTranslationX(AndroidUtilities.lerp(this.R, 0.0f, this.Y ? 1.0f : this.x) + lerp2);
        this.G.setTranslationY(AndroidUtilities.lerp(this.S, this.U, this.Y ? 1.0f : this.x));
        ViewGroup viewGroup2 = this.P;
        rd1 rd1Var2 = this.d;
        if (viewGroup2 != null) {
            if (this.E) {
                viewGroup2.setTranslationX(((this.G.getPollButtonsLeft() + ((lerp2 + 0.0f) + this.G.getLeft())) - AndroidUtilities.dp(8.0f)) - this.P.getLeft());
            } else {
                viewGroup2.setTranslationX((((lerp2 + 0.0f) + (this.G.z3() ? AndroidUtilities.dp(48.0f) : 0)) + this.G.getLeft()) - this.P.getLeft());
            }
            this.Q = rd1Var2.getMeasuredWidth() - (this.P.getX() - lerp2);
            this.P.setTranslationY(((this.G.getY() + this.G.getHeight()) - this.P.getTop()) - rd1Var2.getTop());
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
            this.O = rd1Var2.getMeasuredWidth() - (this.N.getX() - lerp2);
            this.N.setTranslationY(((this.F.getY() + ((int) G2)) - this.N.getTop()) - rd1Var2.getTop());
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
            this.M.setTranslationY(Math.max(0.0f, ((this.G.getY() - this.M.getHeight()) + AndroidUtilities.dp(22.0f)) - rd1Var2.getTop()));
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
        org.telegram.ui.Components.wb0 wb0Var = this.h;
        wb0Var.setSelectedTab(positionAnimated);
        wb0Var.setAlpha(this.x);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        rd1 rd1Var = this.b;
        setContentView(rd1Var, layoutParams);
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
        rd1Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(rd1Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Components.jm0.d(new d5(this, 28));
            this.K = true;
            b(true, null);
        }
    }
}
