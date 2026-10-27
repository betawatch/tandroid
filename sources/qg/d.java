package qg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Cells.i8;
import org.telegram.ui.Components.nm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class d extends nm0 {
    public boolean f3;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.nm0
    public final void J0(Canvas canvas, RectF rectF, long j10) {
        super.J0(canvas, rectF, j10);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof c) {
                float x9 = childAt.getX();
                float y3 = childAt.getY();
                if (rectF.intersects(x9, y3, childAt.getWidth() + x9, childAt.getHeight() + y3)) {
                    canvas.save();
                    canvas.translate(x9, y3);
                    i8 i8Var = (i8) ((c) childAt);
                    if (i8Var.L) {
                        i8Var.b(canvas, this);
                    }
                    canvas.restore();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f3 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof c) {
                c cVar = (c) getChildAt(i10);
                canvas.save();
                canvas.translate(cVar.getX(), cVar.getY());
                i8 i8Var = (i8) cVar;
                if (i8Var.L) {
                    i8Var.b(canvas, this);
                }
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f3) {
            return;
        }
        super.invalidate();
        this.f3 = true;
    }
}
