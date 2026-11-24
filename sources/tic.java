// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tic extends FrameLayout {
    public String a;
    public final ImageView b;
    public final TextView c;
    public boolean d;
    public final lhc e;
    public final RectF f;

    public tic(Context context, lhc lhcVar, int i) {
        super(context);
        this.f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.e = lhcVar;
        lhcVar.a(this);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, qoe.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, qoe.d(-2, -2.0f, 16, i != 0 ? 36.0f : 14.0f, 2.0f, 14.0f, 2.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.f;
        rectF.set(0.0f, 0.0f, width, height);
        float x = ((View) getParent()).getX() + getX();
        float y = ((View) getParent()).getY() + getY();
        lhc lhcVar = this.e;
        lhcVar.d(x, y);
        Paint paint = lhcVar.l;
        int alpha = (this.d ? paint : lhcVar.b()).getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        (this.d ? paint : lhcVar.b()).setAlpha(nm7.d4);
        canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), this.d ? paint : lhcVar.b());
        if (!this.d) {
            paint = lhcVar.b();
        }
        paint.setAlpha(alpha);
        if (lhcVar.e) {
            int alpha2 = ((Paint) lhcVar.d.a).getAlpha();
            ((Paint) lhcVar.d.a).setAlpha(nm7.d4);
            canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), (Paint) lhcVar.d.a);
            ((Paint) lhcVar.d.a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
