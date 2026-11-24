// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ru3 extends qu3 {
    public final /* synthetic */ int e2;
    public final /* synthetic */ ylb f2;
    public final /* synthetic */ boolean g2;
    public final /* synthetic */ su3 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru3(su3 su3Var, Context context, ylb ylbVar, int i, ylb ylbVar2, boolean z) {
        super(context, ylbVar);
        this.h2 = su3Var;
        this.e2 = i;
        this.f2 = ylbVar2;
        this.g2 = z;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        su3 su3Var = this.h2;
        ho hoVar = su3Var.y;
        hoVar.u(su3Var.w.a(cmb.v0(su3Var.x <= 0 ? cmb.o7 : cmb.O5, this.f2), false));
        hoVar.setBounds(getScrollX(), getHeight() - Math.min(gm.L(52.0f), getHeight()), gm.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        hoVar.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        if (this.g2 && menu.findItem(R.id.menu_bold) == null) {
            menu.removeItem(android.R.id.shareText);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131753636, null));
            spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.M0(2131748844, null));
            spannableStringBuilder2.setSpan(new z5c(gm.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(jb6.M0(2131744122, null));
            wkb wkbVar = new wkb();
            wkbVar.a |= 8;
            spannableStringBuilder3.setSpan(new xkb(wkbVar, 0), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 8, spannableStringBuilder3);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, jb6.M0(2131746070, null));
        }
    }

    @Override // qu3, org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        su3 su3Var = this.h2;
        ho hoVar = su3Var.y;
        if (hoVar == null || this.e2 <= 0) {
            return;
        }
        hoVar.a();
        su3Var.c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.h2.y || super.verifyDrawable(drawable);
    }
}
