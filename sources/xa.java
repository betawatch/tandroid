// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class xa extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final ImageView c;
    public final Paint d;
    public boolean e;

    public xa(Context context) {
        super(context);
        this.d = new Paint(1);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_clear_recent);
        addView(imageView, nme.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        addView(textView, nme.d(-1, -2.0f, 19, 64.0f, 8.0f, 64.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_browser_arrowup);
        addView(imageView2, nme.d(32, 32.0f, 21, 8.0f, 8.0f, 10.0f, 8.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            canvas.drawRect(gl.L(64.0f), getHeight() - Math.max(gl.L(0.66f), 1), getWidth(), getHeight(), this.d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    public void setAsShowMore(eb ebVar) {
        ImageView imageView = this.a;
        imageView.setImageResource(R.drawable.arrow_more);
        imageView.setColorFilter(new PorterDuffColorFilter(ebVar.I, PorterDuff.Mode.SRC_IN));
    }
}
