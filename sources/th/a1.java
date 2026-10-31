package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a1 extends FrameLayout {
    public final FrameLayout a;
    public final View b;
    public final ImageView c;
    public final org.telegram.ui.n5 d;
    public boolean e;
    public ValueAnimator f;
    public boolean h;
    public float n;
    public ValueAnimator r;

    public a1(Context context, wg.b bVar) {
        super(context);
        w7.e6.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        tg.i iVar = new tg.i();
        iVar.a = bVar;
        iVar.a();
        iVar.g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f = org.telegram.messenger.i0.L(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, w7.b6.e(40, 40, 17));
        View view = new View(context);
        this.b = view;
        view.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(40.0f), -13522392));
        frameLayout.addView(view, w7.b6.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        org.telegram.ui.n5 n5Var = new org.telegram.ui.n5(context);
        this.d = n5Var;
        addView(n5Var, w7.b6.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.b6.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.e == z10 && z11) {
            return;
        }
        this.e = z10;
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f = null;
        }
        boolean z12 = true;
        org.telegram.ui.n5 n5Var = this.d;
        if (z11) {
            n5Var.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(n5Var.getAlpha(), z10 ? 0.0f : 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new z0(this, 0));
            this.f.setDuration(320L);
            this.f.setInterpolator(gr.h);
            this.f.start();
        } else {
            n5Var.setAlpha(z10 ? 0.0f : 1.0f);
            n5Var.setVisibility(z10 ? 8 : 0);
        }
        if (!this.h && z10) {
            z12 = false;
        }
        c(z12, z11);
    }

    public final void b(boolean z10, boolean z11) {
        this.h = z10;
        int i10 = R.drawable.msg_voice_unmuted;
        ImageView imageView = this.c;
        if (z11) {
            if (z10) {
                i10 = R.drawable.msg_voice_muted;
            }
            imageView.setImageResource(i10);
        } else {
            if (z10) {
                i10 = R.drawable.msg_voice_muted;
            }
            org.telegram.messenger.i0.Q3(imageView, i10);
        }
        c(z10 || !this.e, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.r = null;
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z10 ? 1.0f : 0.0f);
            this.r = ofFloat;
            ofFloat.addUpdateListener(new z0(this, 1));
            this.r.setInterpolator(gr.h);
            this.r.setDuration(420L);
            this.r.start();
            return;
        }
        float f7 = z10 ? 1.0f : 0.0f;
        this.n = f7;
        View view = this.b;
        view.setAlpha(1.0f - f7);
        view.setScaleX(1.0f - this.n);
        view.setScaleY(1.0f - this.n);
        this.c.setColorFilter(new PorterDuffColorFilter(i0.b.f(this.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
        this.a.invalidate();
    }
}
