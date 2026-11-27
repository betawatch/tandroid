// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class s0a extends FrameLayout {
    public final TextView a;
    public final e29 b;
    public final ImageView c;
    public float d;
    public ValueAnimator e;
    public final /* synthetic */ n1a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0a(n1a n1aVar, Context context, boolean z) {
        super(context);
        this.f = n1aVar;
        LinearLayout j = uh9.j(context, 0);
        addView(j, tre.e(-2, -2, z ? 3 : 17));
        e29 e29Var = new e29(context);
        this.b = e29Var;
        e29Var.f(R.raw.unlock_icon, 20, 20, null);
        int i = aob.Lf;
        vnb vnbVar = n1aVar.a1;
        yob.s(e29Var, i, vnbVar, PorterDuff.Mode.SRC_ATOP);
        j.addView(e29Var, tre.o(20, 20));
        TextView textView = new TextView(context);
        this.a = textView;
        yob.X(textView, i, vnbVar);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        j.addView(textView, tre.r(-2, -2, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.Nf, vnbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, tre.e(24, 24, 21));
    }

    public final void a(String str, boolean z) {
        this.a.setText(str);
        b(z);
    }

    public final void b(boolean z) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e = null;
        }
        this.d = z ? 1.0f : 0.0f;
        float L = (1.0f - this.d) * hl.L(-8.0f);
        e29 e29Var = this.b;
        e29Var.setTranslationX(L);
        this.a.setTranslationX((1.0f - this.d) * hl.L(-8.0f));
        e29Var.setAlpha(this.d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(30.0f), TLObject.FLAG_30));
    }
}
