// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ve8 extends Dialog {
    public float E;
    public float F;
    public final hx4 G;
    public final kl0 H;
    public k27 I;
    public boolean J;
    public te8 K;
    public ue8 L;
    public gb2 M;
    public float N;
    public float O;
    public boolean P;
    public byte[] Q;
    public t09 R;
    public ViewGroup S;
    public float T;
    public ViewGroup U;
    public float V;
    public boolean W;
    public float X;
    public float Y;
    public boolean Z;
    public final Activity a;
    public float a0;
    public final wjb b;
    public float b0;
    public final se8 c;
    public boolean c0;
    public final se8 d;
    public boolean d0;
    public final se8 e;
    public boolean e0;
    public final vq1 f;
    public ft1 f0;
    public ValueAnimator g0;
    public final TextView h;
    public ValueAnimator h0;
    public final j37 n;
    public io5 r;
    public Bitmap s;
    public BitmapShader w;
    public Paint x;
    public Matrix y;

    public ve8(Activity activity, wjb wjbVar) {
        super(activity, R.style.TransparentDialog);
        this.r = io5.e;
        this.N = 0.0f;
        this.O = 0.0f;
        this.T = -1.0f;
        this.V = -1.0f;
        this.d0 = false;
        this.a = activity;
        this.b = wjbVar;
        se8 se8Var = new se8(this, activity, (byte) 0);
        this.c = se8Var;
        se8Var.setOnClickListener(new fr7(this, (byte) 20));
        hx4 hx4Var = new hx4();
        this.G = hx4Var;
        kl0 kl0Var = new kl0(hx4Var, hx4Var, hx4Var);
        this.H = kl0Var;
        kl0Var.h = new zec(se8Var);
        kl0Var.i = se8Var;
        se8 se8Var2 = new se8(this, activity, (byte) 1);
        this.d = se8Var2;
        se8Var2.setClipToPadding(false);
        se8Var.addView(se8Var2, nme.e(-1, -1, kk7.D1));
        vq1 vq1Var = new vq1((byte) 5, activity, this);
        this.f = vq1Var;
        vq1Var.setAdapter(new bn0((byte) 3, activity, this));
        se8Var2.addView(vq1Var, nme.e(-1, -1, kk7.D1));
        se8 se8Var3 = new se8(this, activity, (byte) 2);
        this.e = se8Var3;
        se8Var2.addView(se8Var3, nme.e(-1, -1, kk7.D1));
        j37 j37Var = new j37(activity, wjbVar);
        this.n = j37Var;
        j37Var.a(0, k96.M0(2131746975, null));
        j37Var.a(1, k96.M0(2131746974, null));
        se8Var2.addView(j37Var, nme.e(-1, 66, 80));
        j37Var.setOnTabClick(new zf7(vq1Var, (byte) 15));
        il0 c = kl0Var.c(j37Var, null, false);
        c.p(nod.k(wjbVar));
        c.S.e = true;
        c.q(gl.L(8.0f));
        c.r(gl.L(16.0f));
        j37Var.setBackground(c);
        TextView textView = new TextView(activity);
        this.h = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(j37Var.getColor());
        textView.setText(k96.M0(2131746976, null));
        textView.setGravity(17);
        se8Var2.addView(textView, nme.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        s34 s34Var = new s34((Object) this, (byte) 25);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(se8Var, s34Var);
    }

    public final void a(boolean z, ne8 ne8Var) {
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.h0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        final byte b = 0;
        final byte b2 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z ? 1.0f : 0.0f);
        this.g0 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: oe8
            public final /* synthetic */ ve8 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                byte b3 = b;
                ve8 ve8Var = this.b;
                switch (b3) {
                    case 0:
                        ve8Var.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        ve8Var.c.invalidate();
                        ve8Var.d.invalidate();
                        te8 te8Var = ve8Var.K;
                        if (te8Var != null) {
                            te8Var.invalidate();
                        }
                        ve8Var.e();
                        break;
                    default:
                        ve8Var.F = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.g0.addListener(new qw((Object) this, z, (Object) ne8Var, (byte) 7));
        long j = !z ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.g0;
        s33 s33Var = s33.h;
        valueAnimator3.setInterpolator(s33Var);
        this.g0.setDuration(j);
        this.g0.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F, z ? 1.0f : 0.0f);
        this.h0 = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: oe8
            public final /* synthetic */ ve8 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator32) {
                byte b3 = b2;
                ve8 ve8Var = this.b;
                switch (b3) {
                    case 0:
                        ve8Var.E = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        ve8Var.c.invalidate();
                        ve8Var.d.invalidate();
                        te8 te8Var = ve8Var.K;
                        if (te8Var != null) {
                            te8Var.invalidate();
                        }
                        ve8Var.e();
                        break;
                    default:
                        ve8Var.F = ((Float) valueAnimator32.getAnimatedValue()).floatValue();
                        break;
                }
            }
        });
        this.h0.addListener(new id4((byte) 24, this, z));
        this.h0.setDuration((long) (j * 1.5f));
        this.h0.setInterpolator(s33Var);
        this.h0.start();
    }

    public final void b(boolean z) {
        gb2 gb2Var;
        t09 t09Var;
        if (z && (t09Var = this.R) != null && t09Var.getReactionsWindow() != null && !this.R.getReactionsWindow().q) {
            this.R.b();
            return;
        }
        if (this.d0) {
            return;
        }
        this.d0 = true;
        this.Z = false;
        vq1 vq1Var = this.f;
        vq1Var.j();
        boolean z2 = vq1Var.getCurrentPosition() == 1;
        if (!z) {
            gb2 gb2Var2 = this.M;
            if (gb2Var2 != null) {
                gb2Var2.setVisibility(0);
                gb2 gb2Var3 = this.M;
                gb2Var3.d6 = null;
                gb2Var3.invalidate();
            }
        } else if (z2 && (gb2Var = this.M) != null) {
            gb2Var.setVisibility(4);
            this.M.invalidate();
        }
        this.e0 = !z;
        d();
        a(false, new ne8(this, z2));
        this.c.invalidate();
    }

    public final /* synthetic */ void c() {
        super.dismiss();
    }

    public final void d() {
        if (this.Z) {
            return;
        }
        se8 se8Var = this.c;
        if (se8Var.getWidth() > 0) {
            gb2 gb2Var = this.M;
            if (gb2Var != null) {
                int[] iArr = new int[2];
                gb2Var.getLocationOnScreen(iArr);
                int i = iArr[0];
                io5 io5Var = this.r;
                this.X = i - io5Var.a;
                float f = iArr[1] - io5Var.b;
                this.Y = f;
                if (!this.c0) {
                    this.c0 = true;
                    this.a0 = f;
                    if (this.U != null) {
                        float height = f + this.M.getHeight() + this.U.getHeight();
                        int height2 = se8Var.getHeight();
                        io5 io5Var2 = this.r;
                        if (height > ((height2 - io5Var2.b) - io5Var2.d) - gl.L(66.0f)) {
                            int height3 = se8Var.getHeight();
                            io5 io5Var3 = this.r;
                            this.a0 = ((((height3 - io5Var3.b) - io5Var3.d) - gl.L(66.0f)) - this.M.getHeight()) - this.U.getHeight();
                        }
                    }
                    int Y1 = this.K.Y1(this.Q);
                    this.K.X1(Y1);
                    float W1 = this.K.W1(Y1);
                    float f2 = this.Y;
                    this.b0 = f2;
                    float f3 = (int) W1;
                    float f4 = f2 + f3;
                    int height4 = se8Var.getHeight();
                    io5 io5Var4 = this.r;
                    int L = ((height4 - io5Var4.b) - io5Var4.d) - gl.L(78.0f);
                    TextView textView = this.h;
                    if (f4 > L - textView.getHeight()) {
                        int height5 = se8Var.getHeight();
                        io5 io5Var5 = this.r;
                        this.b0 = ((((height5 - io5Var5.b) - io5Var5.d) - gl.L(78.0f)) - textView.getHeight()) - r1;
                    }
                    if (this.S != null) {
                        float height6 = this.b0 + f3 + r3.getHeight();
                        int height7 = se8Var.getHeight();
                        io5 io5Var6 = this.r;
                        if (height6 > (((height7 - io5Var6.b) - io5Var6.d) - gl.L(78.0f)) - textView.getHeight()) {
                            int height8 = se8Var.getHeight();
                            io5 io5Var7 = this.r;
                            this.b0 = (((((height8 - io5Var7.b) - io5Var7.d) - gl.L(78.0f)) - textView.getHeight()) - r1) - this.S.getHeight();
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
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        b(true);
    }

    public final void e() {
        vq1 vq1Var = this.f;
        float positionAnimated = vq1Var.getPositionAnimated();
        float U1 = gl.U1(positionAnimated, 0, -vq1Var.getWidth());
        float U12 = gl.U1(positionAnimated, vq1Var.getWidth(), 0);
        if (this.Z) {
            ViewGroup viewGroup = this.U;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                float f = this.Y;
                this.a0 = f;
                float height = f + this.M.getHeight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                se8 se8Var = this.c;
                int height2 = se8Var.getHeight();
                io5 io5Var = this.r;
                if (height > ((height2 - io5Var.b) - io5Var.d) - gl.L(66.0f)) {
                    int height3 = se8Var.getHeight();
                    io5 io5Var2 = this.r;
                    this.a0 = ((((height3 - io5Var2.b) - io5Var2.d) - gl.L(66.0f)) - this.M.getHeight()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight();
                }
            }
        }
        this.L.setTranslationX(gl.R1(this.X, 0.0f, this.e0 ? 1.0f : this.E) + U12);
        this.L.setTranslationY(gl.R1(this.Y, this.a0, this.e0 ? 1.0f : this.E));
        ViewGroup viewGroup2 = this.U;
        se8 se8Var2 = this.e;
        if (viewGroup2 != null) {
            boolean z = this.J;
            ue8 ue8Var = this.L;
            if (z) {
                viewGroup2.setTranslationX(((this.L.getPollButtonsLeft() + ((U12 + 0.0f) + ue8Var.getLeft())) - gl.L(8.0f)) - this.U.getLeft());
            } else {
                viewGroup2.setTranslationX((((U12 + 0.0f) + (ue8Var.b3() ? gl.L(48.0f) : 0)) + this.L.getLeft()) - this.U.getLeft());
            }
            this.V = se8Var2.getMeasuredWidth() - (this.U.getX() - U12);
            this.U.setTranslationY(((this.L.getY() + this.L.getHeight()) - this.U.getTop()) - se8Var2.getTop());
            this.U.setAlpha(this.E);
            float R1 = gl.R1(0.75f, 1.0f, this.E);
            this.U.setScaleX(R1);
            this.U.setScaleY(R1);
        }
        this.K.setTranslationX(gl.R1(this.X, 0.0f, this.e0 ? 1.0f : this.E) + U1);
        this.K.setTranslationY(gl.R1(this.Y, this.b0, this.e0 ? 1.0f : this.E));
        if (this.S != null) {
            int Y1 = this.K.Y1(this.Q);
            this.K.X1(Y1);
            float W1 = this.K.W1(Y1);
            boolean z2 = this.J;
            ViewGroup viewGroup3 = this.S;
            te8 te8Var = this.K;
            if (z2) {
                viewGroup3.setTranslationX(((this.K.getPollButtonsLeft() + ((U1 + 0.0f) + te8Var.getLeft())) - gl.L(8.0f)) - this.S.getLeft());
            } else {
                viewGroup3.setTranslationX((((U1 + 0.0f) + (te8Var.b3() ? gl.L(48.0f) : 0)) + this.K.getLeft()) - this.S.getLeft());
            }
            this.T = se8Var2.getMeasuredWidth() - (this.S.getX() - U12);
            this.S.setTranslationY(((this.K.getY() + ((int) W1)) - this.S.getTop()) - se8Var2.getTop());
            this.S.setAlpha(this.E);
            float R12 = gl.R1(0.75f, 1.0f, this.E);
            this.S.setScaleX(R12);
            this.S.setScaleY(R12);
        }
        if (this.e0) {
            this.L.setAlpha(this.E);
            this.K.setAlpha(this.E);
        }
        if (this.R != null) {
            float max = U12 + Math.max(0.0f, ((this.L.getBoundsLeft() + this.L.getBoundsRight()) / 2.0f) - (this.R.getWidth() * 0.8f));
            this.R.setTranslationX(max);
            this.R.setTranslationY(Math.max(0.0f, ((this.L.getY() - this.R.getHeight()) + gl.L(22.0f)) - se8Var2.getTop()));
            this.R.setAlpha(this.E);
            View windowView = this.R.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(max);
                windowView.setAlpha(this.E);
            }
        }
        TextView textView = this.h;
        textView.setTranslationX(U1);
        textView.setAlpha(this.E);
        j37 j37Var = this.n;
        j37Var.setSelectedTab(positionAnimated);
        j37Var.setAlpha(this.E);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        se8 se8Var = this.c;
        setContentView(se8Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = kk7.D1;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = i | (-1945959040);
        gl.m(attributes);
        window.setAttributes(attributes);
        se8Var.setSystemUiVisibility(1284);
        gl.k3(se8Var, !bkb.I.o());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (gl.K1(getContext())) {
            super.show();
            tq9.d(new ur4((Object) this, (byte) 27));
            this.P = true;
            a(true, null);
        }
    }
}
