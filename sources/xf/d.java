package xf;

import android.graphics.Canvas;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class d extends zk0 {
    public boolean T2;

    @Override // org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.T2 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof c) {
                c cVar = (c) getChildAt(i10);
                canvas.save();
                canvas.translate(cVar.getX(), cVar.getY());
                a8 a8Var = (a8) cVar;
                if (a8Var.H) {
                    a8Var.b(canvas, this);
                }
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.T2) {
            return;
        }
        super.invalidate();
        this.T2 = true;
    }
}
