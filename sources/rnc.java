// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rnc extends qk3 {
    public final ShapeDrawable H;
    public final /* synthetic */ goc I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnc(goc gocVar, Context context) {
        super(context);
        this.I = gocVar;
        this.H = cmb.b0(gm.L(22.0f), gocVar.getThemedColor(cmb.c6));
    }

    @Override // qk3, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.H;
            shapeDrawable.getPaint().setColor(this.I.getThemedColor(cmb.c6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
