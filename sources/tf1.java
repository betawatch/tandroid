// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tf1 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final l66 a;
    public final sf1 b;
    public Integer c;
    public ValueAnimator d;
    public final /* synthetic */ uf1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf1(uf1 uf1Var, Activity activity) {
        super(activity);
        this.e = uf1Var;
        uf1Var.G = this;
        setPadding(gm.L(18.0f), gm.L(10.0f), gm.L(18.0f), gm.L(17.0f));
        byte b = 0;
        setClipChildren(false);
        l66 l66Var = new l66(activity, null);
        this.a = l66Var;
        l66Var.setTextSize(1, 15.0f);
        int i = cmb.E6;
        anb.X(l66Var, i, null);
        l66Var.setGravity(jb6.a0 ? 5 : 3);
        int i2 = cmb.I6;
        anb.G(l66Var, i2, null);
        int i3 = cmb.J6;
        anb.C(l66Var, i3, null);
        l66Var.setPadding(gm.L(3.0f), 0, gm.L(3.0f), 0);
        sf1 sf1Var = new sf1(b, activity, this);
        uf1Var.H = sf1Var;
        this.b = sf1Var;
        sf1Var.setTextSize(1, 15.0f);
        anb.X(sf1Var, i, null);
        sf1Var.setGravity(jb6.a0 ? 5 : 3);
        anb.G(sf1Var, i2, null);
        anb.C(sf1Var, i3, null);
        sf1Var.setPadding(gm.L(3.0f), 0, gm.L(3.0f), 0);
        addView(l66Var, qoe.e(-1, -2, 48));
        addView(sf1Var, qoe.e(-1, -2, 48));
        if (uf1Var.y == 0) {
            l66Var.setText(gm.S2(jb6.M0(2131743347, null)));
            return;
        }
        String M0 = jb6.M0(2131752891, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int lastIndexOf = M0.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new g6c("https://fragment.com", (wkb) null), indexOf, lastIndexOf - 1, 33);
        }
        l66Var.setText(spannableStringBuilder);
    }

    public final void a() {
        sf1 sf1Var = this.b;
        if (sf1Var.getVisibility() == 0) {
            sf1Var.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), -2137483649);
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = this.c;
        final int measuredHeight = num == null ? getMeasuredHeight() : num.intValue();
        int L = gm.L(27.0f);
        l66 l66Var = this.a;
        final int height = l66Var.getHeight() + L + ((sf1Var.getVisibility() != 0 || TextUtils.isEmpty(sf1Var.getText())) ? 0 : gm.L(8.0f) + sf1Var.getMeasuredHeight());
        final float translationY = l66Var.getTranslationY();
        final float L2 = (sf1Var.getVisibility() != 0 || TextUtils.isEmpty(sf1Var.getText())) ? 0.0f : gm.L(8.0f) + sf1Var.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rf1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                tf1 tf1Var = tf1.this;
                tf1Var.a.setTranslationY(gm.R1(translationY, L2, floatValue));
                tf1Var.c = Integer.valueOf(gm.U1(floatValue, measuredHeight, height));
                tf1Var.requestLayout();
            }
        });
        this.d.setDuration(200L);
        this.d.setInterpolator(d53.h);
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
