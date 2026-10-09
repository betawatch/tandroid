package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.ru;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class a2 extends ru {
    public final j5 c;
    public int d;
    public final q6 e;
    public final /* synthetic */ s2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(s2 s2Var, Context context, e6 e6Var) {
        super(context, e6Var);
        this.f = s2Var;
        this.c = new j5(this);
        q6 q6Var = new q6(false, true, true);
        this.e = q6Var;
        q6Var.n(0.2f, 160L, hs.h);
        q6Var.w(AndroidUtilities.dp(15.33f));
        q6Var.setCallback(this);
        q6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.c.a(i6.w0(this.d < 0 ? i6.p7 : i6.P5, this.f.f), false);
        q6 q6Var = this.e;
        q6Var.u(a2);
        q6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        q6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.tu, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        q6 q6Var = this.e;
        if (q6Var != null) {
            this.d = 12 - charSequence.length();
            q6Var.a();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            q6Var.t(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }
}
