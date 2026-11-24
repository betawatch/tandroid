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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yc4 extends FrameLayout {
    public final TextView a;
    public final ImageView b;
    public boolean c;

    public yc4(Context context) {
        super(context);
        int i;
        int i2;
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, bkb.p6, null);
        ir2.r(16.0f, 1, 2131751701, textView, null);
        textView.setGravity(k96.a0 ? 5 : 3);
        if (k96.a0) {
            i2 = 16;
            i = 0;
        } else {
            i = 16;
            i2 = 0;
        }
        textView.setPadding(i2, 0, i, 0);
        boolean z = k96.a0;
        addView(textView, nme.d(-1, -2.0f, 23, z ? 0.0f : 64.0f, 0.0f, z ? 64.0f : 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int i3 = bkb.Ei;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.x(this, drawable, i3, null, mode);
        zkb.x(this, drawable2, bkb.j7, null, mode);
        imageView.setImageDrawable(new fm2(drawable, drawable2));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        boolean z2 = k96.a0;
        addView(imageView, nme.d(32, 32.0f, (z2 ? 5 : 3) | 16, z2 ? 0.0f : 16.0f, 0.0f, z2 ? 16.0f : 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            TextView textView = this.a;
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(45.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.a.setAlpha(z ? 1.0f : 0.5f);
        this.b.setAlpha(z ? 1.0f : 0.5f);
    }
}
