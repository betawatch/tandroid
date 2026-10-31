package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class st0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.u5 a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public boolean e;
    public eu0 f;
    public org.telegram.ui.Components.d5 h;
    public Drawable n;

    public st0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.a = u5Var;
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setTextSize(15);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        linearLayout.addView(u5Var, w7.b6.o(-1, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.y6, p6Var);
        textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        linearLayout.addView(textView, w7.b6.q(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, w7.b6.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, w7.b6.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.M6, p6Var, PorterDuff.Mode.SRC_ATOP);
        addView(imageView2, w7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(eu0 eu0Var, boolean z10) {
        boolean q6 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q();
        ImageView imageView = this.d;
        if (q6 && eu0Var.a == 12 && eu0Var.b == R.drawable.filled_premium_status2) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long h = org.telegram.messenger.h20.h(org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).f());
            b(h == null ? 0L : h.longValue(), false);
        } else {
            imageView.setVisibility(0);
            org.telegram.ui.Components.d5 d5Var = this.h;
            if (d5Var != null) {
                d5Var.b();
                this.h = null;
            }
        }
        this.f = eu0Var;
        this.a.l(eu0Var.c, false);
        this.b.setText(eu0Var.d);
        this.c.setImageResource(eu0Var.b);
        this.e = z10;
    }

    public final void b(long j10, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j10 != 0) {
            this.h.j(j10, z10);
            return;
        }
        if (this.n == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
            this.n = mutate;
            org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.v6, null, PorterDuff.Mode.SRC_IN);
        }
        this.h.g(this.n, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.s) - org.telegram.messenger.i0.L(21.0f), (getHeight() - this.h.s) / 2, getWidth() - org.telegram.messenger.i0.L(21.0f), (getHeight() + this.h.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.v6, false)));
            this.h.draw(canvas);
        }
        if (this.e) {
            canvas.drawRect(org.telegram.messenger.i0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.d5 d5Var = this.h;
        if (d5Var != null) {
            d5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.d5 d5Var = this.h;
        if (d5Var != null) {
            d5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
