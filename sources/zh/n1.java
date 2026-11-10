package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.ys;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n1 extends ys {
    public final y4 Y1;
    public int Z1;
    public final h6 a2;
    public final /* synthetic */ d2 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(d2 d2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.b2 = d2Var;
        this.Y1 = new y4(this);
        h6 h6Var2 = new h6(false, true, true);
        this.a2 = h6Var2;
        h6Var2.n(0.2f, 160L, wq.h);
        h6Var2.w(org.telegram.messenger.g0.L(15.33f));
        h6Var2.setCallback(this);
        h6Var2.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a10 = this.Y1.a(m6.w0(this.Z1 < 0 ? m6.p7 : m6.P5, this.b2.f), false);
        h6 h6Var = this.a2;
        h6Var.u(a10);
        h6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        h6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ct, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        h6 h6Var = this.a2;
        if (h6Var != null) {
            this.Z1 = 12 - charSequence.length();
            h6Var.a();
            String str = "";
            if (this.Z1 <= 4) {
                str = "" + this.Z1;
            }
            h6Var.t(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a2 || super.verifyDrawable(drawable);
    }
}
