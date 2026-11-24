// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class slc extends fj3 {
    public final ShapeDrawable H;
    public final /* synthetic */ hmc I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slc(hmc hmcVar, Context context) {
        super(context);
        this.I = hmcVar;
        this.H = bkb.b0(gl.L(22.0f), hmcVar.getThemedColor(bkb.c6));
    }

    @Override // fj3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.H;
            shapeDrawable.getPaint().setColor(this.I.getThemedColor(bkb.c6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
