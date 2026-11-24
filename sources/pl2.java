// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pl2 extends ScrollView {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ yl2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl2(yl2 yl2Var, Context context, LinearLayout linearLayout) {
        super(context);
        this.b = yl2Var;
        this.a = linearLayout;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y = this.a.getY() + gl.L(1.0f);
        int L = gl.L(36.0f);
        RectF rectF = gl.P;
        rectF.set((getMeasuredWidth() - L) / 2.0f, y, (getMeasuredWidth() + L) / 2.0f, gl.L(4.0f) + y);
        bkb.s0.setColor(-10790053);
        canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ((LinearLayout.LayoutParams) this.b.l1.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i) - gl.L(24.0f)) * 0.8333333f) + gl.L(88.0f));
    }
}
