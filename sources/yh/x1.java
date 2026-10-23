package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.p6;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class x1 extends iu {
    public final i5 c;
    public int d;
    public final p6 e;
    public final /* synthetic */ p2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(p2 p2Var, Context context, d6 d6Var) {
        super(context, d6Var);
        this.f = p2Var;
        this.c = new i5(this);
        p6 p6Var = new p6(false, true, true);
        this.e = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.setCallback(this);
        p6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.c.a(h6.w0(this.d < 0 ? h6.p7 : h6.P5, this.f.f), false);
        p6 p6Var = this.e;
        p6Var.u(a2);
        p6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        p6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ku, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        p6 p6Var = this.e;
        if (p6Var != null) {
            this.d = 12 - charSequence.length();
            p6Var.a();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            p6Var.t(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }
}
