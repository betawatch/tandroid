package pf;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t0 extends EditTextBoldCursor {
    public final b5 b;
    public int c;
    public final i6 d;
    public final /* synthetic */ w0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(w0 w0Var, Activity activity) {
        super(activity);
        this.e = w0Var;
        this.b = new b5(this);
        i6 i6Var = new i6(false, true, true, false);
        this.d = i6Var;
        i6Var.k(0.2f, 160L, gr.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.setCallback(this);
        i6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.b.a(f6.v0(this.c < 0 ? f6.p7 : f6.P5, this.e.getResourceProvider()), false);
        i6 i6Var = this.d;
        i6Var.r(a2);
        i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        i6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        i6 i6Var = this.d;
        if (i6Var != null) {
            this.c = 96 - charSequence.length();
            i6Var.b();
            String str = "";
            if (this.c <= 12) {
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
