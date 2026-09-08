package pg;

import android.graphics.Canvas;
import org.telegram.ui.Cells.f8;
import org.telegram.ui.Components.ll0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class d extends ll0 {
    public boolean X2;

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.X2 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof c) {
                c cVar = (c) getChildAt(i10);
                canvas.save();
                canvas.translate(cVar.getX(), cVar.getY());
                f8 f8Var = (f8) cVar;
                if (f8Var.L) {
                    f8Var.b(canvas, this);
                }
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.X2) {
            return;
        }
        super.invalidate();
        this.X2 = true;
    }
}
