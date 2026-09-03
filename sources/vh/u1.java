package vh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import k7.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class u1 extends ImageView implements org.telegram.ui.ActionBar.a6 {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public final f6 h;
    public boolean n;
    public boolean r;
    public boolean s;

    public u1(Context context, int i10, f6 f6Var) {
        super(context);
        this.e = 20;
        this.f = j6.d6;
        this.n = true;
        this.s = true;
        this.b = i10;
        this.a = i10;
        this.h = f6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        d6.a(this);
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
        w1 w1Var = new w1(getContext(), this.b);
        w1Var.d = this.f;
        w1Var.a(this.d);
        setImageDrawable(w1Var);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        boolean z4 = this.r;
        f6 f6Var = this.h;
        if (!z4) {
            setBackground(j6.Z(j6.v0(this.f, f6Var), j6.v0(j6.i6, f6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(j6.v0(j6.G6, f6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int w02 = j6.w0(null, this.s ? j6.Oh : j6.G6, false);
            setBackground(j6.Z(j6.v(j6.v0(this.f, f6Var), j6.l1(0.1f, w02)), j6.l1(0.1f, w02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
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
        w1 w1Var = new w1(getContext(), i10);
        w1Var.d = this.f;
        w1Var.a(this.d);
        AndroidUtilities.updateImageViewImageAnimated(this, w1Var);
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
        animate.alpha(z4 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(mr.h).start();
    }

    public void setPremiumLocked(boolean z4) {
        this.d = z4;
        if (getDrawable() instanceof w1) {
            ((w1) getDrawable()).a(z4);
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
