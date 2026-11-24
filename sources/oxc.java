// default package

import android.graphics.Canvas;
import android.graphics.Picture;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oxc extends pxc {
    public final Picture e;
    public boolean f;

    public oxc(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.e = new Picture();
    }

    @Override // pxc
    public final Canvas a() {
        this.f = true;
        return this.e.beginRecording(Math.max(1, this.c - this.a), Math.max(1, this.d - this.b));
    }

    @Override // pxc
    public final void b() {
        if (this.f) {
            d();
        }
    }

    @Override // pxc
    public final void c(Canvas canvas, float f) {
        Canvas canvas2;
        int save;
        if (this.f || f <= 0.0f) {
            return;
        }
        int i = this.b;
        int i2 = this.a;
        if (f < 1.0f) {
            canvas2 = canvas;
            save = canvas2.saveLayerAlpha(i2, i, this.c, this.d, Math.round(f * 255.0f));
        } else {
            canvas2 = canvas;
            save = canvas2.save();
        }
        canvas2.translate(i2, i);
        canvas2.drawPicture(this.e);
        canvas2.restoreToCount(save);
    }

    @Override // pxc
    public final void d() {
        this.e.endRecording();
        this.f = false;
    }
}
