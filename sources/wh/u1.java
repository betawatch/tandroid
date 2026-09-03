package wh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import k7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class u1 extends ImageView implements b6 {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public final g6 h;
    public boolean n;
    public boolean r;
    public boolean s;

    public u1(Context context, int i10, g6 g6Var) {
        super(context);
        this.e = 20;
        this.f = k6.d6;
        this.n = true;
        this.s = true;
        this.b = i10;
        this.a = i10;
        this.h = g6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        e6.a(this);
        e();
    }

    public final void a() {
        f(this.a);
    }

    public final void b() {
        if (this.s) {
            this.s = false;
            e();
        }
    }

    public final void c(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        e();
    }

    public final void d() {
        this.c = true;
        x1 x1Var = new x1(getContext(), this.b);
        x1Var.d = this.f;
        x1Var.a(this.d);
        setImageDrawable(x1Var);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        boolean z4 = this.r;
        g6 g6Var = this.h;
        if (!z4) {
            setBackground(k6.Z(k6.v0(this.f, g6Var), k6.v0(k6.i6, g6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(k6.v0(k6.G6, g6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int w02 = k6.w0(null, this.s ? k6.Oh : k6.G6, false);
            setBackground(k6.Z(k6.v(k6.v0(this.f, g6Var), k6.l1(0.1f, w02)), k6.l1(0.1f, w02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
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
        x1 x1Var = new x1(getContext(), i10);
        x1Var.d = this.f;
        x1Var.a(this.d);
        AndroidUtilities.updateImageViewImageAnimated(this, x1Var);
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        if (this.n == z4) {
            return;
        }
        setClickable(z4);
        ViewPropertyAnimator animate = animate();
        this.n = z4;
        animate.alpha(z4 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(pr.h).start();
    }

    public void setPremiumLocked(boolean z4) {
        this.d = z4;
        if (getDrawable() instanceof x1) {
            ((x1) getDrawable()).a(z4);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z4) {
        if (this.r == z4) {
            return;
        }
        this.r = z4;
        e();
    }
}
