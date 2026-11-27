// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ue1 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final p66 a;
    public final te1 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ ve1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue1(ve1 ve1Var, Activity activity) {
        super(activity);
        this.e = ve1Var;
        ve1Var.G = this;
        setPadding(hl.L(18.0f), hl.L(10.0f), hl.L(18.0f), hl.L(17.0f));
        byte b = 0;
        setClipChildren(false);
        p66 p66Var = new p66(activity, null);
        this.a = p66Var;
        p66Var.setTextSize(1, 15.0f);
        int i = aob.F6;
        yob.X(p66Var, i, null);
        p66Var.setGravity(ob6.a0 ? 5 : 3);
        int i2 = aob.J6;
        yob.G(p66Var, i2, null);
        int i3 = aob.K6;
        yob.C(p66Var, i3, null);
        p66Var.setPadding(hl.L(3.0f), 0, hl.L(3.0f), 0);
        te1 te1Var = new te1(b, activity, this);
        ve1Var.H = te1Var;
        this.b = te1Var;
        te1Var.setTextSize(1, 15.0f);
        yob.X(te1Var, i, null);
        te1Var.setGravity(ob6.a0 ? 5 : 3);
        yob.G(te1Var, i2, null);
        yob.C(te1Var, i3, null);
        te1Var.setPadding(hl.L(3.0f), 0, hl.L(3.0f), 0);
        addView(p66Var, tre.e(-1, -2, 48));
        addView(te1Var, tre.e(-1, -2, 48));
        if (ve1Var.y == 0) {
            p66Var.setText(hl.S2(ob6.M0(2131743315, null)));
            return;
        }
        String M0 = ob6.M0(2131752919, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int lastIndexOf = M0.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new f8c("https://fragment.com", (rmb) null), indexOf, lastIndexOf - 1, 33);
        }
        p66Var.setText(spannableStringBuilder);
    }

    public final void a() {
        te1 te1Var = this.b;
        if (te1Var.getVisibility() == 0) {
            te1Var.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), -2137483649);
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = this.c;
        final int measuredHeight = num == null ? getMeasuredHeight() : num.intValue();
        int L = hl.L(27.0f);
        p66 p66Var = this.a;
        final int height = p66Var.getHeight() + L + ((te1Var.getVisibility() != 0 || TextUtils.isEmpty(te1Var.getText())) ? 0 : hl.L(8.0f) + te1Var.getMeasuredHeight());
        final float translationY = p66Var.getTranslationY();
        final float L2 = (te1Var.getVisibility() != 0 || TextUtils.isEmpty(te1Var.getText())) ? 0.0f : hl.L(8.0f) + te1Var.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: se1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ue1 ue1Var = ue1.this;
                ue1Var.a.setTranslationY(hl.R1(translationY, L2, floatValue));
                ue1Var.c = Integer.valueOf(hl.U1(floatValue, measuredHeight, height));
                ue1Var.requestLayout();
            }
        });
        this.d.setDuration(200L);
        this.d.setInterpolator(k43.h);
        this.d.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer num = this.c;
        if (num != null) {
            i2 = View.MeasureSpec.makeMeasureSpec(num.intValue(), TLObject.FLAG_30);
        }
        super.onMeasure(i, i2);
    }
}
