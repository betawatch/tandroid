package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ra extends FrameLayout {
    public final org.telegram.ui.Components.c90 a;
    public final org.telegram.ui.Cells.x1 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ sa e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(sa saVar, Activity activity) {
        super(activity);
        this.e = saVar;
        saVar.F = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(activity, null);
        this.a = c90Var;
        c90Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.j6.F6;
        c90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        c90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.j6.J6;
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.j6.K6;
        c90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        c90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity, 2);
        saVar.G = x1Var;
        this.b = x1Var;
        x1Var.setTextSize(1, 15.0f);
        x1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        x1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        x1Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        x1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(c90Var, w7.x5.e(-1, -2, 48));
        addView(x1Var, w7.x5.e(-1, -2, 48));
        if (saVar.x == 0) {
            org.telegram.ui.Cells.p6.p(R.string.UsernameHelp, c90Var);
            return;
        }
        String string = LocaleController.getString(R.string.BotUsernameHelp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.n51("https://fragment.com", (org.telegram.ui.Components.p01) null), indexOf, lastIndexOf - 1, 33);
        }
        c90Var.setText(spannableStringBuilder);
    }

    public static void a(final ra raVar) {
        org.telegram.ui.Components.c90 c90Var = raVar.a;
        org.telegram.ui.Cells.x1 x1Var = raVar.b;
        if (x1Var.getVisibility() == 0) {
            x1Var.measure(View.MeasureSpec.makeMeasureSpec((raVar.getMeasuredWidth() - raVar.getPaddingLeft()) - raVar.getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
        }
        ValueAnimator valueAnimator = raVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = raVar.c;
        final int measuredHeight = num == null ? raVar.getMeasuredHeight() : num.intValue();
        final int height = c90Var.getHeight() + AndroidUtilities.dp(27.0f) + ((x1Var.getVisibility() != 0 || TextUtils.isEmpty(x1Var.getText())) ? 0 : AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight());
        final float translationY = c90Var.getTranslationY();
        final float dp = (x1Var.getVisibility() != 0 || TextUtils.isEmpty(x1Var.getText())) ? 0.0f : AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        raVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.qa
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ra raVar2 = ra.this;
                raVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                raVar2.a.setTranslationY(AndroidUtilities.lerp(translationY, dp, floatValue));
                raVar2.c = Integer.valueOf(AndroidUtilities.lerp(measuredHeight, height, floatValue));
                raVar2.requestLayout();
            }
        });
        raVar.d.setDuration(200L);
        raVar.d.setInterpolator(org.telegram.ui.Components.qr.h);
        raVar.d.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        Integer num = this.c;
        if (num != null) {
            i11 = View.MeasureSpec.makeMeasureSpec(num.intValue(), TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
