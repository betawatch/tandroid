// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wn9 extends Drawable {
    public static Paint c;
    public final /* synthetic */ byte a;
    public Paint b;

    public /* synthetic */ wn9(byte b) {
        this.a = b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - gm.L(1.0f), (getBounds().width() - gm.L(8.0f)) / 2.0f, this.b);
                break;
            default:
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), Math.max(bounds.width(), bounds.height()) / 2, this.b);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return -2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
    }

    private final void a(int i) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
