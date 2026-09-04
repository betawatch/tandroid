package zh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qq;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class u3 extends qq {
    public final View b;
    public final Paint c;
    public final Path d;
    public final long e;
    public float f;

    public u3(di.d dVar, int i10) {
        super(dVar);
        Paint paint = new Paint(1);
        this.c = paint;
        Path path = new Path();
        this.d = path;
        this.e = System.currentTimeMillis();
        this.f = 1.0f;
        this.b = dVar;
        this.a.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(i10);
        path.rewind();
        path.moveTo(-AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
        path.lineTo(0.0f, -AndroidUtilities.dpf2(1.08f));
        path.lineTo(AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10 = (int) (this.f * 255.0f);
        Paint paint = this.a;
        paint.setAlpha(i10);
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
        float currentTimeMillis = ((System.currentTimeMillis() - this.e) % 400) / 400.0f;
        Paint paint2 = this.c;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * this.f));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        canvas.save();
        canvas.translate(getBounds().centerX(), getBounds().centerY() - (((AndroidUtilities.dpf2(1.166f) * 2.0f) + (AndroidUtilities.dpf2(2.16f) * 3.0f)) / 2.0f));
        int i11 = 0;
        while (i11 < 4) {
            float f7 = i11 == 0 ? 1.0f - currentTimeMillis : i11 == 3 ? currentTimeMillis : 1.0f;
            paint2.setAlpha((int) (f7 * 255.0f * this.f));
            canvas.save();
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, f7);
            canvas.scale(lerp, lerp);
            canvas.drawPath(this.d, paint2);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dpf2(3.3260002f) * f7);
            i11++;
        }
        canvas.restore();
        paint2.setAlpha(alpha);
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override // org.telegram.ui.Components.qq, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f = i10 / 255.0f;
    }
}
