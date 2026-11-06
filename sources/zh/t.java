package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
import bi.e7;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class t extends e7 {
    public final Path D0;
    public final float[] E0;
    public final /* synthetic */ v F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, Context context, f6 f6Var, o oVar, bi.l1 l1Var, bi.l1 l1Var2, bi.l1 l1Var3, bi.l1 l1Var4, bi.l1 l1Var5, bi.l1 l1Var6) {
        super(context, f6Var, oVar, l1Var, null, l1Var2, l1Var3, l1Var4, l1Var5, l1Var6);
        this.F0 = vVar;
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

    @Override // bi.e7
    public final int getFinalHeight() {
        return org.telegram.messenger.g0.L(288.0f);
    }

    @Override // bi.e7
    public final float getRealHeight() {
        return org.telegram.messenger.g0.L(288.0f);
    }

    @Override // bi.e7
    public final void k(int i7) {
        v vVar = this.F0;
        TextView textView = vVar.T1;
        if (textView == null || !k6.H1(textView.getBackground(), i7, false)) {
            return;
        }
        vVar.T1.invalidate();
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
