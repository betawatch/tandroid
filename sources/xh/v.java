package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class v extends yh.p3 {
    public final Path A0;
    public final float[] B0;
    public final /* synthetic */ x C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, Context context, e6 e6Var, q qVar, ai.e2 e2Var, ai.e2 e2Var2, ai.e2 e2Var3, ai.e2 e2Var4, ai.e2 e2Var5, ai.e2 e2Var6) {
        super(context, e6Var, qVar, e2Var, null, e2Var2, e2Var3, e2Var4, e2Var5, e2Var6);
        this.C0 = xVar;
        this.A0 = new Path();
        this.B0 = new float[8];
    }

    @Override // yh.p3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.A0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // yh.p3
    public final int getFinalHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override // yh.p3
    public final float getRealHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override // yh.p3
    public final void j(int i10) {
        x xVar = this.C0;
        TextView textView = xVar.b0;
        if (textView == null || !i6.C1(textView.getBackground(), i10, false)) {
            return;
        }
        xVar.b0.invalidate();
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
