package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import bi.d5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class y extends xh.u3 {
    public final Path A0;
    public final float[] B0;
    public final /* synthetic */ int C0;
    public final /* synthetic */ d0 D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(d0 d0Var, Context context, f6 f6Var, qg.q0 q0Var, d5 d5Var, d5 d5Var2, d5 d5Var3, d5 d5Var4, d5 d5Var5, d5 d5Var6, int i10) {
        super(context, f6Var, q0Var, d5Var, null, d5Var2, d5Var3, d5Var4, d5Var5, d5Var6);
        this.D0 = d0Var;
        this.C0 = i10;
        this.A0 = new Path();
        this.B0 = new float[8];
    }

    @Override // xh.u3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.A0);
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

    @Override // xh.u3
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.C0);
    }

    @Override // xh.u3
    public final float getRealHeight() {
        return AndroidUtilities.dp(this.C0);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        a0 a0Var = this.D0.c0;
        if (a0Var != null) {
            a0Var.invalidate();
        }
    }

    @Override // xh.u3
    public final void j(int i10) {
        this.D0.c0.setRibbonColor(i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.B0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.A0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.B0, Path.Direction.CW);
    }
}
