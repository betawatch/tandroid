package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class a2 extends bu {
    public final g5 c;
    public int d;
    public final n6 e;
    public final /* synthetic */ s2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(s2 s2Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.f = s2Var;
        this.c = new g5(this);
        n6 n6Var = new n6(false, true, true, false);
        this.e = n6Var;
        n6Var.k(0.2f, 160L, qr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.setCallback(this);
        n6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.c.a(j6.v0(this.d < 0 ? j6.p7 : j6.P5, this.f.f), false);
        n6 n6Var = this.e;
        n6Var.r(a2);
        n6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        n6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.du, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        n6 n6Var = this.e;
        if (n6Var != null) {
            this.d = 12 - charSequence.length();
            n6Var.b();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            n6Var.q(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }
}
