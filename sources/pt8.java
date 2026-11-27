// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class pt8 extends xt3 {
    public final ll f2;
    public int g2;
    public final hn h2;
    public final /* synthetic */ eu8 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt8(eu8 eu8Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.i2 = eu8Var;
        this.f2 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.h2 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.setCallback(this);
        hnVar.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a = this.f2.a(aob.v0(this.g2 < 0 ? aob.p7 : aob.P5, this.i2.f), false);
        hn hnVar = this.h2;
        hnVar.u(a);
        hnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        hnVar.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        hn hnVar = this.h2;
        if (hnVar != null) {
            this.g2 = 12 - charSequence.length();
            hnVar.a();
            hnVar.t(this.g2 > 4 ? "" : String.valueOf(this.g2), true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.h2 || super.verifyDrawable(drawable);
    }
}
