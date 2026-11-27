// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yt3 extends xt3 {
    public final /* synthetic */ int f2;
    public final /* synthetic */ vnb g2;
    public final /* synthetic */ boolean h2;
    public final /* synthetic */ zt3 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt3(zt3 zt3Var, Context context, vnb vnbVar, int i, vnb vnbVar2, boolean z) {
        super(context, vnbVar);
        this.i2 = zt3Var;
        this.f2 = i;
        this.g2 = vnbVar2;
        this.h2 = z;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        zt3 zt3Var = this.i2;
        hn hnVar = zt3Var.y;
        hnVar.u(zt3Var.w.a(aob.v0(zt3Var.x <= 0 ? aob.p7 : aob.P5, this.g2), false));
        hnVar.setBounds(getScrollX(), getHeight() - Math.min(hl.L(52.0f), getHeight()), hl.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        hnVar.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        if (this.h2 && menu.findItem(R.id.menu_bold) == null) {
            menu.removeItem(android.R.id.shareText);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131753664, null));
            spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ob6.M0(2131748841, null));
            spannableStringBuilder2.setSpan(new y7c(hl.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(ob6.M0(2131744090, null));
            rmb rmbVar = new rmb();
            rmbVar.a |= 8;
            spannableStringBuilder3.setSpan(new smb(rmbVar, 0), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 8, spannableStringBuilder3);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, ob6.M0(2131746064, null));
        }
    }

    @Override // xt3, org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        zt3 zt3Var = this.i2;
        hn hnVar = zt3Var.y;
        if (hnVar == null || this.f2 <= 0) {
            return;
        }
        hnVar.a();
        zt3Var.c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.i2.y || super.verifyDrawable(drawable);
    }
}
