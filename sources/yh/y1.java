package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zt;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class y1 extends zt {
    public final h5 c;
    public int d;
    public final p6 e;
    public final /* synthetic */ q2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(q2 q2Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.f = q2Var;
        this.c = new h5(this);
        p6 p6Var = new p6(false, true, true, false);
        this.e = p6Var;
        p6Var.k(0.2f, 160L, pr.h);
        p6Var.t(AndroidUtilities.dp(15.33f));
        p6Var.setCallback(this);
        p6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.c.a(j6.v0(this.d < 0 ? j6.p7 : j6.P5, this.f.f), false);
        p6 p6Var = this.e;
        p6Var.r(a2);
        p6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        p6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bu, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        p6 p6Var = this.e;
        if (p6Var != null) {
            this.d = 12 - charSequence.length();
            p6Var.b();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            p6Var.q(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }
}
