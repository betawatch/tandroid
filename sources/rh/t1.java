package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import h7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class t1 extends ImageView implements org.telegram.ui.ActionBar.x5 {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public final c6 h;
    public boolean n;
    public boolean r;
    public boolean s;

    public t1(Context context, int i10, c6 c6Var) {
        super(context);
        this.e = 20;
        this.f = g6.d6;
        this.n = true;
        this.s = true;
        this.b = i10;
        this.a = i10;
        this.h = c6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        b6.a(this);
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

    public final void c(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        d();
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        boolean z10 = this.r;
        c6 c6Var = this.h;
        if (!z10) {
            setBackground(g6.Z(g6.v0(this.f, c6Var), g6.v0(g6.i6, c6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(g6.v0(g6.G6, c6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int w02 = g6.w0(null, this.s ? g6.Oh : g6.G6, false);
            setBackground(g6.Z(g6.v(g6.v0(this.f, c6Var), g6.l1(0.1f, w02)), g6.l1(0.1f, w02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
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

    public final void f(int i10) {
        if (this.b == i10) {
            return;
        }
        this.b = i10;
        if (!this.c) {
            AndroidUtilities.updateImageViewImageAnimated(this, i10);
            return;
        }
        v1 v1Var = new v1(getContext(), i10);
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
        animate.alpha(z10 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(er.h).start();
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
