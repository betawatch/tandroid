package yh;

import ai.f7;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class t extends f7 {
    public final Path D0;
    public final float[] E0;
    public final /* synthetic */ v F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, Context context, d6 d6Var, o oVar, ah.f fVar, ah.f fVar2, ah.f fVar3, ah.f fVar4, ah.f fVar5, ah.f fVar6) {
        super(context, d6Var, oVar, fVar, null, fVar2, fVar3, fVar4, fVar5, fVar6);
        this.F0 = vVar;
        this.D0 = new Path();
        this.E0 = new float[8];
    }

    @Override // ai.f7, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.D0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // ai.f7
    public final int getFinalHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override // ai.f7
    public final float getRealHeight() {
        return AndroidUtilities.dp(288.0f);
    }

    @Override // ai.f7
    public final void k(int i10) {
        v vVar = this.F0;
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
