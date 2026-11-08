package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.Picture;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class b0 extends c0 {
    public final Picture e;
    public boolean f;

    public b0(int i7, int i10, int i11, int i12) {
        super(i7, i10, i11, i12);
        this.e = new Picture();
    }

    @Override // org.telegram.utils.twidget.c0
    public final Canvas a() {
        this.f = true;
        return this.e.beginRecording(Math.max(1, this.c - this.a), Math.max(1, this.d - this.b));
    }

    @Override // org.telegram.utils.twidget.c0
    public final void b() {
        if (this.f) {
            d();
        }
    }

    @Override // org.telegram.utils.twidget.c0
    public final void c(Canvas canvas, float f10) {
        Canvas canvas2;
        int save;
        if (this.f || f10 <= 0.0f) {
            return;
        }
        int i7 = this.b;
        int i10 = this.a;
        if (f10 < 1.0f) {
            canvas2 = canvas;
            save = canvas2.saveLayerAlpha(i10, i7, this.c, this.d, Math.round(f10 * 255.0f));
        } else {
            canvas2 = canvas;
            save = canvas2.save();
        }
        canvas2.translate(i10, i7);
        canvas2.drawPicture(this.e);
        canvas2.restoreToCount(save);
    }

    @Override // org.telegram.utils.twidget.c0
    public final void d() {
        this.e.endRecording();
        this.f = false;
    }

    @Override // org.telegram.utils.twidget.c0
    public final boolean e() {
        return true;
    }
}
