package qh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import g7.g6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class t1 extends ImageView implements org.telegram.ui.ActionBar.w5 {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public final b6 h;
    public boolean n;
    public boolean r;
    public boolean s;

    public t1(Context context, int i9, b6 b6Var) {
        super(context);
        this.e = 20;
        this.f = f6.d6;
        this.n = true;
        this.s = true;
        this.b = i9;
        this.a = i9;
        this.h = b6Var;
        if (i9 != 0) {
            setImageResource(i9);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        g6.a(this);
        d();
    }

    public final void a() {
        f(this.a);
    }

    public final void b() {
        if (this.s) {
            this.s = false;
            d();
        }
    }

    public final void c(int i9) {
        if (this.f == i9) {
            return;
        }
        this.f = i9;
        d();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        boolean z10 = this.r;
        b6 b6Var = this.h;
        if (!z10) {
            setBackground(f6.Z(f6.v0(this.f, b6Var), f6.v0(f6.i6, b6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(f6.v0(f6.G6, b6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int w02 = f6.w0(null, this.s ? f6.Oh : f6.G6, false);
            setBackground(f6.Z(f6.v(f6.v0(this.f, b6Var), f6.l1(0.1f, w02)), f6.l1(0.1f, w02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void e() {
        this.c = true;
        v1 v1Var = new v1(getContext(), this.b);
        v1Var.d = this.f;
        v1Var.a(this.d);
        setImageDrawable(v1Var);
    }

    public final void f(int i9) {
        if (this.b == i9) {
            return;
        }
        this.b = i9;
        if (!this.c) {
            AndroidUtilities.updateImageViewImageAnimated(this, i9);
            return;
        }
        v1 v1Var = new v1(getContext(), i9);
        v1Var.d = this.f;
        v1Var.a(this.d);
        AndroidUtilities.updateImageViewImageAnimated(this, v1Var);
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.n = z10;
        animate.alpha(z10 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(gr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof v1) {
            ((v1) getDrawable()).a(z10);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z10) {
        if (this.r == z10) {
            return;
        }
        this.r = z10;
        d();
    }
}
