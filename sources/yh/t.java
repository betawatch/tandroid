package yh;

import ai.e7;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class t extends e7 {
    public final Path B0;
    public final float[] C0;
    public final /* synthetic */ v D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, Context context, d6 d6Var, o oVar, ah.f fVar, ah.f fVar2, ah.f fVar3, ah.f fVar4, ah.f fVar5, ah.f fVar6) {
        super(context, d6Var, oVar, fVar, null, fVar2, fVar3, fVar4, fVar5, fVar6);
        this.D0 = vVar;
        this.B0 = new Path();
        this.C0 = new float[8];
    }

    @Override // ai.e7, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.B0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // ai.e7
    public final int getFinalHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override // ai.e7
    public final float getRealHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override // ai.e7
    public final void k(int i10) {
        v vVar = this.D0;
        TextView textView = vVar.b0;
        if (textView == null || !h6.C1(textView.getBackground(), i10, false)) {
            return;
        }
        vVar.b0.invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.C0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.B0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.C0, Path.Direction.CW);
    }
}
