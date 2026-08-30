package pg;

import android.graphics.Canvas;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d extends b {
    public final sg.a E;

    public d(sg.a aVar) {
        this.E = aVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c(canvas, this.E);
    }

    @Override // pg.b
    public final sg.a i() {
        return this.E;
    }
}
