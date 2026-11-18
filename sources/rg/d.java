package rg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class d extends ck0 {
    public boolean f3;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.ck0
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
                    a8 a8Var = (a8) ((c) childAt);
                    if (a8Var.M) {
                        a8Var.b(canvas, this);
                    }
                    canvas.restore();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ck0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f3 = false;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if (getChildAt(i7) instanceof c) {
                c cVar = (c) getChildAt(i7);
                canvas.save();
                canvas.translate(cVar.getX(), cVar.getY());
                a8 a8Var = (a8) cVar;
                if (a8Var.M) {
                    a8Var.b(canvas, this);
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
