package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import bi.e7;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class x extends e7 {
    public final Path D0;
    public final float[] E0;
    public final /* synthetic */ int F0;
    public final /* synthetic */ c0 G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c0 c0Var, Context context, f6 f6Var, wg.p pVar, bi.l1 l1Var, bi.l1 l1Var2, bi.l1 l1Var3, bi.l1 l1Var4, bi.l1 l1Var5, bi.l1 l1Var6, int i7) {
        super(context, f6Var, pVar, l1Var, null, l1Var2, l1Var3, l1Var4, l1Var5, l1Var6);
        this.G0 = c0Var;
        this.F0 = i7;
        this.D0 = new Path();
        this.E0 = new float[8];
    }

    @Override // bi.e7, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.D0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.b) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // bi.e7
    public final int getFinalHeight() {
        return org.telegram.messenger.g0.L(this.F0);
    }

    @Override // bi.e7
    public final float getRealHeight() {
        return org.telegram.messenger.g0.L(this.F0);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        z zVar = this.G0.U1;
        if (zVar != null) {
            zVar.invalidate();
        }
    }

    @Override // bi.e7
    public final void k(int i7) {
        this.G0.U1.setRibbonColor(i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(12.0f);
        float[] fArr = this.E0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.D0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i7, i10, this.E0, Path.Direction.CW);
    }
}
