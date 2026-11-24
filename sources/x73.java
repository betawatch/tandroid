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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class x73 extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;
    public boolean e;

    public x73(h83 h83Var, Context context) {
        super(context);
        zkb.h(bkb.c6, null, this);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.d(28, 28.0f, (k96.a0 ? 5 : 3) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(2.0f);
        addView(linearLayout, nme.i(-1.0f, -2.0f, (k96.a0 ? 5 : 3) | 16, 64.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        if (k96.a0) {
            linearLayout2.setGravity(5);
        }
        linearLayout2.setWeightSum(2.0f);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        int i = bkb.F6;
        zkb.X(textView, i, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        textView.setLines(1);
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(R.drawable.arrow_more);
        zkb.s(imageView2, i, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setTranslationY(gl.L(1.0f));
        imageView2.setVisibility(8);
        if (k96.a0) {
            linearLayout2.addView(imageView2, nme.t(16, 16, 21, 3, 0, 0, 0));
            linearLayout2.addView(textView, nme.r(-2, -2, 21));
        } else {
            linearLayout2.addView(textView, nme.r(-2, -2, 16));
            linearLayout2.addView(imageView2, nme.t(16, 16, 16, 3, 0, 0, 0));
        }
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        zkb.X(textView2, bkb.n6, null);
        textView2.setGravity(k96.a0 ? 3 : 5);
        if (k96.a0) {
            linearLayout.addView(textView2, nme.r(-2, -2, 19));
            linearLayout.addView(linearLayout2, nme.p(0, -2, 2.0f, 21));
        } else {
            linearLayout.addView(linearLayout2, nme.p(0, -2, 2.0f, 16));
            linearLayout.addView(textView2, nme.r(-2, -2, 21));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(64.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
    }
}
