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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class sa extends FrameLayout {
    public final org.telegram.ui.Components.z90 a;
    public final org.telegram.ui.Cells.w1 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ ta e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(ta taVar, Activity activity) {
        super(activity);
        this.e = taVar;
        taVar.F = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(activity, null);
        this.a = z90Var;
        z90Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.y6.F6;
        org.telegram.ui.ActionBar.f7.V(z90Var, i10, null);
        z90Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.y6.J6;
        org.telegram.ui.ActionBar.f7.H(z90Var, i11, null);
        int i12 = org.telegram.ui.ActionBar.y6.K6;
        org.telegram.ui.ActionBar.f7.D(z90Var, i12, null);
        z90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity, 2);
        taVar.G = w1Var;
        this.b = w1Var;
        w1Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.f7.V(w1Var, i10, null);
        w1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        org.telegram.ui.ActionBar.f7.H(w1Var, i11, null);
        org.telegram.ui.ActionBar.f7.D(w1Var, i12, null);
        w1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(z90Var, org.telegram.ui.Components.gb1.i(-1, -2, 48));
        addView(w1Var, org.telegram.ui.Components.gb1.i(-1, -2, 48));
        if (taVar.x == 0) {
            d3.s(R.string.UsernameHelp, z90Var);
            return;
        }
        String string = LocaleController.getString(R.string.BotUsernameHelp);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.x61("https://fragment.com", (org.telegram.ui.Components.y11) null), indexOf, lastIndexOf - 1, 33);
        }
        z90Var.setText(spannableStringBuilder);
    }

    public static void a(final sa saVar) {
        org.telegram.ui.Components.z90 z90Var = saVar.a;
        org.telegram.ui.Cells.w1 w1Var = saVar.b;
        if (w1Var.getVisibility() == 0) {
            w1Var.measure(View.MeasureSpec.makeMeasureSpec((saVar.getMeasuredWidth() - saVar.getPaddingLeft()) - saVar.getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
        }
        ValueAnimator valueAnimator = saVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = saVar.c;
        final int measuredHeight = num == null ? saVar.getMeasuredHeight() : num.intValue();
        final int height = z90Var.getHeight() + AndroidUtilities.dp(27.0f) + ((w1Var.getVisibility() != 0 || TextUtils.isEmpty(w1Var.getText())) ? 0 : AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight());
        final float translationY = z90Var.getTranslationY();
        final float dp = (w1Var.getVisibility() != 0 || TextUtils.isEmpty(w1Var.getText())) ? 0.0f : AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        saVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ra
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                sa saVar2 = sa.this;
                saVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                saVar2.a.setTranslationY(AndroidUtilities.lerp(translationY, dp, floatValue));
                saVar2.c = Integer.valueOf(AndroidUtilities.lerp(measuredHeight, height, floatValue));
                saVar2.requestLayout();
            }
        });
        saVar.d.setDuration(200L);
        saVar.d.setInterpolator(org.telegram.ui.Components.ds.h);
        saVar.d.start();
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
