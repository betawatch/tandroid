package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class z1 extends bu {
    public final f5 c;
    public int d;
    public final m6 e;
    public final /* synthetic */ r2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(r2 r2Var, Context context, e6 e6Var) {
        super(context, e6Var);
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
        int a2 = this.c.a(i6.v0(this.d < 0 ? i6.p7 : i6.P5, this.f.f), false);
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
