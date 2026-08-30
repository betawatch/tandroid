package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u51 extends FrameLayout {
    public final TextView a;
    public final org.telegram.ui.Components.jj0 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final /* synthetic */ q61 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u51(q61 q61Var, Context context, boolean z4) {
        super(context);
        this.f = q61Var;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        addView(f10, k7.b6.e(-2, -2, z4 ? 3 : 17));
        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context);
        this.b = jj0Var;
        jj0Var.f(R.raw.unlock_icon, 20, 20, null);
        int i10 = org.telegram.ui.ActionBar.j6.Te;
        org.telegram.ui.ActionBar.f6 f6Var = q61Var.W0;
        jj0Var.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        f10.addView(jj0Var, k7.b6.n(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        f10.addView(textView, k7.b6.q(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ve, f6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, k7.b6.e(24, 24, 21));
    }

    public final void a(String str, boolean z4) {
        this.a.setText(str);
        b(z4);
    }

    public final void b(boolean z4) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e = null;
        }
        this.d = z4 ? 1.0f : 0.0f;
        float dp = (1.0f - this.d) * AndroidUtilities.dp(-8.0f);
        org.telegram.ui.Components.jj0 jj0Var = this.b;
        jj0Var.setTranslationX(dp);
        this.a.setTranslationX((1.0f - this.d) * AndroidUtilities.dp(-8.0f));
        jj0Var.setAlpha(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
    }
}
