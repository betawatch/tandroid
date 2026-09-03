package qg;

import android.graphics.Canvas;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class d extends b {
    public final tg.a E;

    public d(tg.a aVar) {
        this.E = aVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c(canvas, this.E);
    }

    @Override // qg.b
    public final tg.a i() {
        return this.E;
    }
}
