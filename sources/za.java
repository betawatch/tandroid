// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class za extends Drawable {
    public final /* synthetic */ byte a;
    public final uib b;
    public final /* synthetic */ bb c;

    public za(bb bbVar, String str, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = bbVar;
                this.b = new uib(str, 14.0f, gm.o());
                break;
            default:
                this.c = bbVar;
                this.b = new uib(str, 14.0f, gm.o());
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        bb bbVar = this.c;
        uib uibVar = this.b;
        switch (b) {
            case 0:
                this.b.c(getBounds().centerX() - (uibVar.c / 2.0f), getBounds().centerY(), 1.0f, bbVar.s, canvas);
                break;
            default:
                this.b.c(getBounds().centerX() - (uibVar.c / 2.0f), getBounds().centerY(), 1.0f, bbVar.s, canvas);
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
