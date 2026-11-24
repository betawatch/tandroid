// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ru9 extends EditTextBoldCursor {
    public final km M1;
    public int N1;
    public final ho O1;
    public final /* synthetic */ ylb P1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru9(Context context, ylb ylbVar) {
        super(context);
        this.P1 = ylbVar;
        this.M1 = new km(this);
        ho hoVar = new ho(false, true, true);
        this.O1 = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.setCallback(this);
        hoVar.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a = this.M1.a(cmb.v0(this.N1 < 0 ? cmb.o7 : cmb.O5, this.P1), false);
        ho hoVar = this.O1;
        hoVar.u(a);
        hoVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        hoVar.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(36.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        ho hoVar = this.O1;
        if (hoVar != null) {
            this.N1 = 12 - charSequence.length();
            hoVar.a();
            hoVar.t(this.N1 > 4 ? "" : String.valueOf(this.N1), true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.O1 || super.verifyDrawable(drawable);
    }
}
