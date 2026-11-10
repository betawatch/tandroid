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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class z01 extends FrameLayout {
    public final TextView a;
    public final org.telegram.ui.Components.ch0 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final /* synthetic */ t11 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z01(t11 t11Var, Context context, boolean z9) {
        super(context);
        this.f = t11Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        addView(f10, c8.ha.e(-2, -2, z9 ? 3 : 17));
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
        this.b = ch0Var;
        ch0Var.f(R.raw.unlock_icon, 20, 20, null);
        int i7 = org.telegram.ui.ActionBar.m6.If;
        org.telegram.ui.ActionBar.h6 h6Var = t11Var.Z0;
        org.telegram.ui.ActionBar.t6.s(ch0Var, i7, h6Var, PorterDuff.Mode.SRC_ATOP);
        f10.addView(ch0Var, c8.ha.o(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f10.addView(textView, c8.ha.r(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Kf, h6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ha.e(24, 24, 21));
    }

    public final void a(String str, boolean z9) {
        this.a.setText(str);
        b(z9);
    }

    public final void b(boolean z9) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e = null;
        }
        this.d = z9 ? 1.0f : 0.0f;
        float L = (1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f);
        org.telegram.ui.Components.ch0 ch0Var = this.b;
        ch0Var.setTranslationX(L);
        this.a.setTranslationX((1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f));
        ch0Var.setAlpha(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
    }
}
