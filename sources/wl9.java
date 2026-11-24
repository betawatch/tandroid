// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wl9 extends Drawable {
    public static Paint c;
    public final /* synthetic */ byte a;
    public Paint b;

    public /* synthetic */ wl9(byte b) {
        this.a = b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - gl.L(1.0f), (getBounds().width() - gl.L(8.0f)) / 2.0f, this.b);
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
