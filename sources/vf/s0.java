package vf;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s0 extends EditTextBoldCursor {
    public final c5 b;
    public int c;
    public final j6 d;
    public final /* synthetic */ v0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(v0 v0Var, Activity activity) {
        super(activity);
        this.e = v0Var;
        this.b = new c5(this);
        j6 j6Var = new j6(false, true, true, false);
        this.d = j6Var;
        j6Var.k(0.2f, 160L, pr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.setCallback(this);
        j6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.b.a(k6.v0(this.c < 0 ? k6.p7 : k6.P5, this.e.getResourceProvider()), false);
        j6 j6Var = this.d;
        j6Var.r(a2);
        j6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        j6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.zt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        j6 j6Var = this.d;
        if (j6Var != null) {
            this.c = 96 - charSequence.length();
            j6Var.b();
            String str = "";
            if (this.c <= 12) {
                str = "" + this.c;
            }
            j6Var.q(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
