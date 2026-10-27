package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import bi.b7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class x extends b7 {
    public final Path D0;
    public final float[] E0;
    public final /* synthetic */ int F0;
    public final /* synthetic */ c0 G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c0 c0Var, Context context, u6 u6Var, ti.g gVar, bh.f fVar, bh.f fVar2, bh.f fVar3, bh.f fVar4, bh.f fVar5, bh.f fVar6, int i10) {
        super(context, u6Var, gVar, fVar, null, fVar2, fVar3, fVar4, fVar5, fVar6);
        this.G0 = c0Var;
        this.F0 = i10;
        this.D0 = new Path();
        this.E0 = new float[8];
    }

    @Override // bi.b7, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.D0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.b) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // bi.b7
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.F0);
    }

    @Override // bi.b7
    public final float getRealHeight() {
        return AndroidUtilities.dp(this.F0);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        z zVar = this.G0.c0;
        if (zVar != null) {
            zVar.invalidate();
        }
    }

    @Override // bi.b7
    public final void k(int i10) {
        this.G0.c0.setRibbonColor(i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.E0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.D0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.E0, Path.Direction.CW);
    }
}
