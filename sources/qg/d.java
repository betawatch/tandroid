package qg;

import android.graphics.Canvas;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
