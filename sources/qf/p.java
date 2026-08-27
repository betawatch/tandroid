package qf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p extends EditTextBoldCursor {
    public final b5 b;
    public int c;
    public final i6 d;
    public final /* synthetic */ c6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, c6 c6Var) {
        super(context);
        this.e = c6Var;
        this.b = new b5(this);
        i6 i6Var = new i6(false, true, true, false);
        this.d = i6Var;
        i6Var.k(0.2f, 160L, er.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.setCallback(this);
        i6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.b.a(g6.v0(this.c < 0 ? g6.p7 : g6.P5, this.e), false);
        i6 i6Var = this.d;
        i6Var.r(a2);
        i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        i6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.nt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i6 i6Var = this.d;
        if (i6Var != null) {
            this.c = 32 - charSequence.length();
            i6Var.b();
            String str = "";
            if (this.c <= 4) {
                str = "" + this.c;
            }
            i6Var.q(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
