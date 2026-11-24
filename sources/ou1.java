// default package

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ou1 extends FrameLayout implements x74, tjb {
    public final fm0 a;
    public final fm0 b;
    public ImageView c;
    public ImageView d;
    public ih2 e;
    public wjb f;
    public float h;
    public int n;
    public il0 r;

    public ou1(Context context) {
        super(context);
        s33 s33Var = s33.h;
        this.a = new fm0(0, this, s33Var, 320L, false);
        this.b = new fm0(1, this, s33Var, 320L, true);
        this.h = 1.0f;
    }

    public static ou1 c(kl0 kl0Var, wp1 wp1Var, wjb wjbVar, Context context) {
        int i = bkb.Ml;
        int v0 = bkb.v0(i, wjbVar);
        ou1 ou1Var = new ou1(context);
        ou1Var.f = wjbVar;
        ou1Var.setBlurredBackgroundDrawable(kl0Var.c(ou1Var, wp1Var, false));
        ou1Var.setIconColor(v0);
        int L = gl.L(22.0f);
        int p1 = bkb.p1(0.15f, v0);
        int L2 = gl.L(6.0f);
        ff0 W = bkb.W(L, p1, L2, L2, L2, L2);
        vkb K = zkb.K(0.15f, i);
        ou1Var.setBackground(W);
        zkb.j(ou1Var, W, null, K, wjbVar);
        return ou1Var;
    }

    public static ou1 d(Context context, kl0 kl0Var, al0 al0Var, wjb wjbVar, int i, int i2) {
        int i3 = bkb.Ml;
        int v0 = bkb.v0(i3, wjbVar);
        ou1 ou1Var = new ou1(context);
        ou1Var.f = wjbVar;
        ou1Var.setBlurredBackgroundDrawable(kl0Var.c(ou1Var, al0Var, false));
        ou1Var.f(i, i2);
        ou1Var.setIconColor(v0);
        int L = gl.L(22.0f);
        int p1 = bkb.p1(0.15f, v0);
        int L2 = gl.L(6.0f);
        ff0 W = bkb.W(L, p1, L2, L2, L2, L2);
        vkb K = zkb.K(0.15f, i3);
        ou1Var.setBackground(W);
        zkb.j(ou1Var, W, null, K, wjbVar);
        return ou1Var;
    }

    public final void a() {
        float f = 1.0f - this.a.e;
        float R1 = gl.R1(f / 2.0f, f, this.b.e);
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setAlpha(R1);
            this.c.setScaleX(gl.R1(0.4f, 1.0f, f));
            this.c.setScaleY(gl.R1(0.4f, 1.0f, f) * this.h);
            this.c.setVisibility(f > 0.0f ? 0 : 8);
        }
    }

    public final void b() {
        float f = this.a.e;
        float R1 = gl.R1(f / 2.0f, f, this.b.e);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setAlpha(R1);
            this.d.setScaleX(gl.R1(0.4f, 1.0f, f));
            this.d.setScaleY(gl.R1(0.4f, 1.0f, f));
            int i = f > 0.0f ? 0 : 8;
            if (this.d.getVisibility() != i) {
                this.d.setVisibility(i);
                this.e.c = -1L;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.r.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z, boolean z2) {
        super.setEnabled(z);
        this.b.a(z, z2);
    }

    public final void f(int i, int i2) {
        if (this.c == null) {
            if (i == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.c, nme.e(i2, i2, 17));
            a();
        }
        this.c.setImageResource(i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.r.setBounds(0, 0, i, i2);
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            a();
            b();
        }
        if (i == 1) {
            a();
            b();
        }
    }

    public void setBlurredBackgroundDrawable(il0 il0Var) {
        this.r = il0Var;
        il0Var.q(gl.L(6.0f));
        this.r.r(gl.L(22.0f));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        e(z, false);
    }

    public void setIcon(int i) {
        f(i, 48);
    }

    public void setIconColor(int i) {
        BlendMode blendMode;
        ImageView imageView = this.c;
        if (imageView == null) {
            return;
        }
        this.n = i;
        if (Build.VERSION.SDK_INT < 29) {
            imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            return;
        }
        mk1.l();
        blendMode = BlendMode.SRC_IN;
        imageView.setColorFilter(new BlendModeColorFilter(i, blendMode));
    }

    public void setIconPadding(int i) {
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setPadding(0, i, 0, 0);
        }
    }

    @Override // tjb
    public final void updateColors() {
        il0 il0Var = this.r;
        if (il0Var != null) {
            il0Var.updateColors();
            invalidate();
        }
        int v0 = bkb.v0(bkb.Ml, this.f);
        if (this.c != null && v0 != this.n) {
            setIconColor(v0);
        }
        int L = gl.L(22.0f);
        int p1 = bkb.p1(0.15f, v0);
        if (getBackground() instanceof RippleDrawable) {
            bkb.F1(getBackground(), p1, true);
        } else {
            int L2 = gl.L(6.0f);
            setBackground(bkb.W(L, p1, L2, L2, L2, L2));
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // x74
    public final void F(float f, int i) {
    }
}
