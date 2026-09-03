package pg;

import android.graphics.Canvas;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
