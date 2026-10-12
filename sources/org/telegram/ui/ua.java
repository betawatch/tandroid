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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ua extends FrameLayout {
    public final org.telegram.ui.Components.da0 a;
    public final org.telegram.ui.Cells.y1 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ va e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(va vaVar, Activity activity) {
        super(activity);
        this.e = vaVar;
        vaVar.F = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(activity, null);
        this.a = da0Var;
        da0Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.g6.F6;
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        da0Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.g6.J6;
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.g6.K6;
        da0Var.setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        da0Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(this, activity, 2);
        vaVar.G = y1Var;
        this.b = y1Var;
        y1Var.setTextSize(1, 15.0f);
        y1Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        y1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        y1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        y1Var.setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        y1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(da0Var, w7.a6.e(-1, -2, 48));
        addView(y1Var, w7.a6.e(-1, -2, 48));
        if (vaVar.x == 0) {
            org.telegram.ui.Cells.d0.q(R.string.UsernameHelp, da0Var);
            return;
        }
        String string = LocaleController.getString(R.string.BotUsernameHelp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p61("https://fragment.com", (org.telegram.ui.Components.p11) null), indexOf, lastIndexOf - 1, 33);
        }
        da0Var.setText(spannableStringBuilder);
    }

    public static void a(final ua uaVar) {
        org.telegram.ui.Components.da0 da0Var = uaVar.a;
        org.telegram.ui.Cells.y1 y1Var = uaVar.b;
        if (y1Var.getVisibility() == 0) {
            y1Var.measure(View.MeasureSpec.makeMeasureSpec((uaVar.getMeasuredWidth() - uaVar.getPaddingLeft()) - uaVar.getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
        }
        ValueAnimator valueAnimator = uaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = uaVar.c;
        final int measuredHeight = num == null ? uaVar.getMeasuredHeight() : num.intValue();
        final int height = da0Var.getHeight() + AndroidUtilities.dp(27.0f) + ((y1Var.getVisibility() != 0 || TextUtils.isEmpty(y1Var.getText())) ? 0 : AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight());
        final float translationY = da0Var.getTranslationY();
        final float dp = (y1Var.getVisibility() != 0 || TextUtils.isEmpty(y1Var.getText())) ? 0.0f : AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        uaVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ta
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ua uaVar2 = ua.this;
                uaVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                uaVar2.a.setTranslationY(AndroidUtilities.lerp(translationY, dp, floatValue));
                uaVar2.c = Integer.valueOf(AndroidUtilities.lerp(measuredHeight, height, floatValue));
                uaVar2.requestLayout();
            }
        });
        uaVar.d.setDuration(200L);
        uaVar.d.setInterpolator(org.telegram.ui.Components.es.h);
        uaVar.d.start();
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
