package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class z1 extends bu {
    public final f5 c;
    public int d;
    public final m6 e;
    public final /* synthetic */ r2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(r2 r2Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.f = r2Var;
        this.c = new f5(this);
        m6 m6Var = new m6(false, true, true, false);
        this.e = m6Var;
        m6Var.k(0.2f, 160L, qr.h);
        m6Var.t(AndroidUtilities.dp(15.33f));
        m6Var.setCallback(this);
        m6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.c.a(j6.v0(this.d < 0 ? j6.p7 : j6.P5, this.f.f), false);
        m6 m6Var = this.e;
        m6Var.r(a2);
        m6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        m6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.du, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m6 m6Var = this.e;
        if (m6Var != null) {
            this.d = 12 - charSequence.length();
            m6Var.b();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            m6Var.q(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }
}
