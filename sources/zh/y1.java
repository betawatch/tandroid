package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.r6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class y1 extends ju {
    public final j5 c;
    public int d;
    public final r6 e;
    public final /* synthetic */ r2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(r2 r2Var, Context context, u6 u6Var) {
        super(context, u6Var);
        this.f = r2Var;
        this.c = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.e = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.setCallback(this);
        r6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.c.a(y6.w0(this.d < 0 ? y6.p7 : y6.P5, this.f.f), false);
        r6 r6Var = this.e;
        r6Var.u(a2);
        r6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        r6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.lu, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        r6 r6Var = this.e;
        if (r6Var != null) {
            this.d = 12 - charSequence.length();
            r6Var.a();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            r6Var.t(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }
}
