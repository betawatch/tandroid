// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class r74 extends gt3 {
    public final kl e2;
    public int f2;
    public final gn g2;
    public final /* synthetic */ int h2;
    public final /* synthetic */ wjb i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r74(Activity activity, wjb wjbVar, int i, wjb wjbVar2) {
        super(activity, wjbVar);
        this.h2 = i;
        this.i2 = wjbVar2;
        this.e2 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.g2 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.setCallback(this);
        gnVar.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a = this.e2.a(bkb.v0(this.f2 < 0 ? bkb.o7 : bkb.O5, this.i2), false);
        gn gnVar = this.g2;
        gnVar.u(a);
        gnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        gnVar.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131753668, null));
        spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k96.M0(2131748895, null));
        spannableStringBuilder2.setSpan(new z3c(gl.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_link, 8, k96.M0(2131751732, null));
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, k96.M0(2131746144, null));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, lt3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        gn gnVar = this.g2;
        if (gnVar != null) {
            this.f2 = this.h2 - charSequence.length();
            gnVar.a();
            gnVar.t(this.f2 > 4 ? "" : String.valueOf(this.f2), true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.g2 || super.verifyDrawable(drawable);
    }
}
