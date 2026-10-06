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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ra extends FrameLayout {
    public final org.telegram.ui.Components.q90 a;
    public final org.telegram.ui.Cells.y1 b;
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
        org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(activity, null);
        this.a = q90Var;
        q90Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.i6.F6;
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        q90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.i6.J6;
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.i6.K6;
        q90Var.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        q90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(this, activity, 2);
        saVar.G = y1Var;
        this.b = y1Var;
        y1Var.setTextSize(1, 15.0f);
        y1Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        y1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        y1Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        y1Var.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        y1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(q90Var, w7.z5.e(-1, -2, 48));
        addView(y1Var, w7.z5.e(-1, -2, 48));
        if (saVar.x == 0) {
            org.telegram.ui.Cells.c1.q(R.string.UsernameHelp, q90Var);
            return;
        }
        String string = LocaleController.getString(R.string.BotUsernameHelp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.l61("https://fragment.com", (org.telegram.ui.Components.n11) null), indexOf, lastIndexOf - 1, 33);
        }
        q90Var.setText(spannableStringBuilder);
    }

    public static void a(final ra raVar) {
        org.telegram.ui.Components.q90 q90Var = raVar.a;
        org.telegram.ui.Cells.y1 y1Var = raVar.b;
        if (y1Var.getVisibility() == 0) {
            y1Var.measure(View.MeasureSpec.makeMeasureSpec((raVar.getMeasuredWidth() - raVar.getPaddingLeft()) - raVar.getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
        }
        ValueAnimator valueAnimator = raVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = raVar.c;
        final int measuredHeight = num == null ? raVar.getMeasuredHeight() : num.intValue();
        final int height = q90Var.getHeight() + AndroidUtilities.dp(27.0f) + ((y1Var.getVisibility() != 0 || TextUtils.isEmpty(y1Var.getText())) ? 0 : AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight());
        final float translationY = q90Var.getTranslationY();
        final float dp = (y1Var.getVisibility() != 0 || TextUtils.isEmpty(y1Var.getText())) ? 0.0f : AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight();
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
        raVar.d.setInterpolator(org.telegram.ui.Components.tr.h);
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
