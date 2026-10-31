package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u extends rh.y3 {
    public final Path D0;
    public final float[] E0;
    public final /* synthetic */ w F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, Context context, p6 p6Var, o oVar, bh.c cVar, bh.c cVar2, bh.c cVar3, bh.c cVar4, bh.c cVar5, bh.c cVar6) {
        super(context, p6Var, oVar, cVar, null, cVar2, cVar3, cVar4, cVar5, cVar6);
        this.F0 = wVar;
        this.D0 = new Path();
        this.E0 = new float[8];
    }

    @Override // rh.y3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.D0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // rh.y3
    public final int getFinalHeight() {
        return org.telegram.messenger.i0.L(288.0f);
    }

    @Override // rh.y3
    public final float getRealHeight() {
        return org.telegram.messenger.i0.L(288.0f);
    }

    @Override // rh.y3
    public final void k(int i10) {
        w wVar = this.F0;
        TextView textView = wVar.T1;
        if (textView == null || !t6.H1(textView.getBackground(), i10, false)) {
            return;
        }
        wVar.T1.invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float L = org.telegram.messenger.i0.L(12.0f);
        float[] fArr = this.E0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.D0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.E0, Path.Direction.CW);
    }
}
