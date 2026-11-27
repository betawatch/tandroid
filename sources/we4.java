// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class we4 extends FrameLayout {
    public final TextView a;
    public final ImageView b;
    public boolean c;

    public we4(Context context) {
        super(context);
        int i;
        int i2;
        TextView textView = new TextView(context);
        this.a = textView;
        yob.X(textView, aob.q6, null);
        bs2.r(16.0f, 1, 2131751678, textView, null);
        textView.setGravity(ob6.a0 ? 5 : 3);
        if (ob6.a0) {
            i2 = 16;
            i = 0;
        } else {
            i = 16;
            i2 = 0;
        }
        textView.setPadding(i2, 0, i, 0);
        boolean z = ob6.a0;
        addView(textView, tre.d(-1, -2.0f, 23, z ? 0.0f : 64.0f, 0.0f, z ? 64.0f : 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int i3 = aob.Fi;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.x(this, drawable, i3, null, mode);
        yob.x(this, drawable2, aob.k7, null, mode);
        imageView.setImageDrawable(new zm2(drawable, drawable2));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        boolean z2 = ob6.a0;
        addView(imageView, tre.d(32, 32.0f, (z2 ? 5 : 3) | 16, z2 ? 0.0f : 16.0f, 0.0f, z2 ? 16.0f : 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            TextView textView = this.a;
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), aob.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(45.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.a.setAlpha(z ? 1.0f : 0.5f);
        this.b.setAlpha(z ? 1.0f : 0.5f);
    }
}
