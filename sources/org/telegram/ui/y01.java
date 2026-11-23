package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class y01 extends FrameLayout {
    public final TextView a;
    public final org.telegram.ui.Components.rh0 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final /* synthetic */ s11 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y01(s11 s11Var, Context context, boolean z10) {
        super(context);
        this.f = s11Var;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        addView(g10, c8.ma.e(-2, -2, z10 ? 3 : 17));
        org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(context);
        this.b = rh0Var;
        rh0Var.f(R.raw.unlock_icon, 20, 20, null);
        int i7 = org.telegram.ui.ActionBar.m6.Lf;
        org.telegram.ui.ActionBar.h6 h6Var = s11Var.a1;
        org.telegram.ui.ActionBar.t6.s(rh0Var, i7, h6Var, PorterDuff.Mode.SRC_ATOP);
        g10.addView(rh0Var, c8.ma.o(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        g10.addView(textView, c8.ma.r(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Nf, h6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ma.e(24, 24, 21));
    }

    public final void a(String str, boolean z10) {
        this.a.setText(str);
        b(z10);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e = null;
        }
        this.d = z10 ? 1.0f : 0.0f;
        float L = (1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f);
        org.telegram.ui.Components.rh0 rh0Var = this.b;
        rh0Var.setTranslationX(L);
        this.a.setTranslationX((1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f));
        rh0Var.setAlpha(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
    }
}
