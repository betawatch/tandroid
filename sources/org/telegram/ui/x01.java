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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class x01 extends FrameLayout {
    public final TextView a;
    public final org.telegram.ui.Components.ph0 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final /* synthetic */ r11 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x01(r11 r11Var, Context context, boolean z10) {
        super(context);
        this.f = r11Var;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        addView(g10, c8.ma.e(-2, -2, z10 ? 3 : 17));
        org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(context);
        this.b = ph0Var;
        ph0Var.f(R.raw.unlock_icon, 20, 20, null);
        int i7 = org.telegram.ui.ActionBar.n6.Lf;
        org.telegram.ui.ActionBar.i6 i6Var = r11Var.a1;
        org.telegram.ui.ActionBar.u6.s(ph0Var, i7, i6Var, PorterDuff.Mode.SRC_ATOP);
        g10.addView(ph0Var, c8.ma.o(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
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
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Nf, i6Var, PorterDuff.Mode.MULTIPLY);
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
        org.telegram.ui.Components.ph0 ph0Var = this.b;
        ph0Var.setTranslationX(L);
        this.a.setTranslationX((1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f));
        ph0Var.setAlpha(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
    }
}
