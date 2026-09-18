package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class a2 extends bu {
    public final h5 c;
    public int d;
    public final o6 e;
    public final /* synthetic */ s2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(s2 s2Var, Context context, e6 e6Var) {
        super(context, e6Var);
        this.f = s2Var;
        this.c = new h5(this);
        o6 o6Var = new o6(false, true, true, false);
        this.e = o6Var;
        o6Var.k(0.2f, 160L, qr.h);
        o6Var.t(AndroidUtilities.dp(15.33f));
        o6Var.setCallback(this);
        o6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.c.a(j6.v0(this.d < 0 ? j6.p7 : j6.P5, this.f.f), false);
        o6 o6Var = this.e;
        o6Var.r(a2);
        o6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        o6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.du, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        o6 o6Var = this.e;
        if (o6Var != null) {
            this.d = 12 - charSequence.length();
            o6Var.b();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            o6Var.q(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }
}
