package rg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class d extends uj0 {
    public boolean f3;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.uj0
    public final void J0(Canvas canvas, RectF rectF, long j3) {
        super.J0(canvas, rectF, j3);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof c) {
                float x10 = childAt.getX();
                float y10 = childAt.getY();
                if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                    canvas.save();
                    canvas.translate(x10, y10);
                    y7 y7Var = (y7) ((c) childAt);
                    if (y7Var.M) {
                        y7Var.b(canvas, this);
                    }
                    canvas.restore();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f3 = false;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if (getChildAt(i7) instanceof c) {
                c cVar = (c) getChildAt(i7);
                canvas.save();
                canvas.translate(cVar.getX(), cVar.getY());
                y7 y7Var = (y7) cVar;
                if (y7Var.M) {
                    y7Var.b(canvas, this);
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
