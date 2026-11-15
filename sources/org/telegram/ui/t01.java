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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t01 extends FrameLayout {
    public final TextView a;
    public final org.telegram.ui.Components.fh0 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final /* synthetic */ n11 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t01(n11 n11Var, Context context, boolean z10) {
        super(context);
        this.f = n11Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        addView(f10, c8.ja.e(-2, -2, z10 ? 3 : 17));
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        this.b = fh0Var;
        fh0Var.f(R.raw.unlock_icon, 20, 20, null);
        int i7 = org.telegram.ui.ActionBar.j6.Lf;
        org.telegram.ui.ActionBar.e6 e6Var = n11Var.a1;
        org.telegram.ui.ActionBar.q6.s(fh0Var, i7, e6Var, PorterDuff.Mode.SRC_ATOP);
        f10.addView(fh0Var, c8.ja.o(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f10.addView(textView, c8.ja.r(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.Nf, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ja.e(24, 24, 21));
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
        org.telegram.ui.Components.fh0 fh0Var = this.b;
        fh0Var.setTranslationX(L);
        this.a.setTranslationX((1.0f - this.d) * org.telegram.messenger.g0.L(-8.0f));
        fh0Var.setAlpha(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
    }
}
