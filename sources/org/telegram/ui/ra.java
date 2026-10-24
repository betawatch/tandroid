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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ra extends FrameLayout {
    public final org.telegram.ui.Components.y90 a;
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
        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(activity, null);
        this.a = y90Var;
        y90Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.k6.F6;
        org.telegram.ui.ActionBar.r6.W(y90Var, i10, null);
        y90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.k6.J6;
        org.telegram.ui.ActionBar.r6.I(y90Var, i11, null);
        int i12 = org.telegram.ui.ActionBar.k6.K6;
        org.telegram.ui.ActionBar.r6.E(y90Var, i12, null);
        y90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity, 2);
        saVar.G = x1Var;
        this.b = x1Var;
        x1Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.W(x1Var, i10, null);
        x1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        org.telegram.ui.ActionBar.r6.I(x1Var, i11, null);
        org.telegram.ui.ActionBar.r6.E(x1Var, i12, null);
        x1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(y90Var, w7.z5.e(-1, -2, 48));
        addView(x1Var, w7.z5.e(-1, -2, 48));
        if (saVar.x == 0) {
            org.telegram.ui.Cells.b1.r(R.string.UsernameHelp, y90Var);
            return;
        }
        String string = LocaleController.getString(R.string.BotUsernameHelp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.q61("https://fragment.com", (org.telegram.ui.Components.q11) null), indexOf, lastIndexOf - 1, 33);
        }
        y90Var.setText(spannableStringBuilder);
    }

    public static void a(final ra raVar) {
        org.telegram.ui.Components.y90 y90Var = raVar.a;
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
        final int height = y90Var.getHeight() + AndroidUtilities.dp(27.0f) + ((x1Var.getVisibility() != 0 || TextUtils.isEmpty(x1Var.getText())) ? 0 : AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight());
        final float translationY = y90Var.getTranslationY();
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
        raVar.d.setInterpolator(org.telegram.ui.Components.bs.h);
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
