package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class x extends zh.t3 {
    public final Path A0;
    public final float[] B0;
    public final /* synthetic */ int C0;
    public final /* synthetic */ c0 D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c0 c0Var, Context context, f6 f6Var, sg.p0 p0Var, ah.f fVar, ah.f fVar2, ah.f fVar3, ah.f fVar4, ah.f fVar5, ah.f fVar6, int i10) {
        super(context, f6Var, p0Var, fVar, null, fVar2, fVar3, fVar4, fVar5, fVar6);
        this.D0 = c0Var;
        this.C0 = i10;
        this.A0 = new Path();
        this.B0 = new float[8];
    }

    @Override // zh.t3, android.view.ViewGroup, android.view.View
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

    @Override // zh.t3
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.C0);
    }

    @Override // zh.t3
    public final float getRealHeight() {
        return AndroidUtilities.dp(this.C0);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        z zVar = this.D0.c0;
        if (zVar != null) {
            zVar.invalidate();
        }
    }

    @Override // zh.t3
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
