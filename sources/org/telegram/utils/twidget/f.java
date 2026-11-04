package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.Picture;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class f extends g {
    public final Picture e;
    public boolean f;

    public f(int i3, int i10, int i11, int i12) {
        super(i3, i10, i11, i12);
        this.e = new Picture();
    }

    @Override // org.telegram.utils.twidget.g
    public final Canvas a() {
        this.f = true;
        return this.e.beginRecording(Math.max(1, this.c - this.a), Math.max(1, this.d - this.b));
    }

    @Override // org.telegram.utils.twidget.g
    public final boolean b(Canvas canvas) {
        return true;
    }

    @Override // org.telegram.utils.twidget.g
    public final void c() {
        if (this.f) {
            e();
        }
    }

    @Override // org.telegram.utils.twidget.g
    public final void d(Canvas canvas, float f10) {
        Canvas canvas2;
        int save;
        if (this.f || f10 <= 0.0f) {
            return;
        }
        int i3 = this.b;
        int i10 = this.a;
        if (f10 < 1.0f) {
            canvas2 = canvas;
            save = canvas2.saveLayerAlpha(i10, i3, this.c, this.d, Math.round(f10 * 255.0f));
        } else {
            canvas2 = canvas;
            save = canvas2.save();
        }
        canvas2.translate(i10, i3);
        canvas2.drawPicture(this.e);
        canvas2.restoreToCount(save);
    }

    @Override // org.telegram.utils.twidget.g
    public final void e() {
        this.e.endRecording();
        this.f = false;
    }

    @Override // org.telegram.utils.twidget.g
    public final boolean f() {
        return true;
    }
}
