// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class q83 extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;
    public boolean e;

    public q83(a93 a93Var, Context context) {
        super(context);
        yob.h(aob.d6, null, this);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, tre.d(28, 28.0f, (ob6.a0 ? 5 : 3) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(2.0f);
        addView(linearLayout, tre.i(-1.0f, -2.0f, (ob6.a0 ? 5 : 3) | 16, 64.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        if (ob6.a0) {
            linearLayout2.setGravity(5);
        }
        linearLayout2.setWeightSum(2.0f);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        int i = aob.G6;
        yob.X(textView, i, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        textView.setLines(1);
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(R.drawable.arrow_more);
        yob.s(imageView2, i, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setTranslationY(hl.L(1.0f));
        imageView2.setVisibility(8);
        if (ob6.a0) {
            linearLayout2.addView(imageView2, tre.t(16, 16, 21, 3, 0, 0, 0));
            linearLayout2.addView(textView, tre.r(-2, -2, 21));
        } else {
            linearLayout2.addView(textView, tre.r(-2, -2, 16));
            linearLayout2.addView(imageView2, tre.t(16, 16, 16, 3, 0, 0, 0));
        }
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        yob.X(textView2, aob.o6, null);
        textView2.setGravity(ob6.a0 ? 3 : 5);
        if (ob6.a0) {
            linearLayout.addView(textView2, tre.r(-2, -2, 19));
            linearLayout.addView(linearLayout2, tre.p(0, -2, 2.0f, 21));
        } else {
            linearLayout.addView(linearLayout2, tre.p(0, -2, 2.0f, 16));
            linearLayout.addView(textView2, tre.r(-2, -2, 21));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(64.0f) : 0), getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
    }
}
