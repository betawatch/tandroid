// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class za extends Drawable {
    public final /* synthetic */ byte a;
    public final tgb b;
    public final /* synthetic */ bb c;

    public za(bb bbVar, String str, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = bbVar;
                this.b = new tgb(str, 14.0f, gl.o());
                break;
            default:
                this.c = bbVar;
                this.b = new tgb(str, 14.0f, gl.o());
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        bb bbVar = this.c;
        tgb tgbVar = this.b;
        switch (b) {
            case 0:
                this.b.c(getBounds().centerX() - (tgbVar.c / 2.0f), getBounds().centerY(), 1.0f, bbVar.s, canvas);
                break;
            default:
                this.b.c(getBounds().centerX() - (tgbVar.c / 2.0f), getBounds().centerY(), 1.0f, bbVar.s, canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        byte b = this.a;
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        byte b = this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
