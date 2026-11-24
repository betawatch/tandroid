// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ts3 extends rt3 {
    public final /* synthetic */ wjb W;
    public final /* synthetic */ boolean a0;
    public final /* synthetic */ ws3 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts3(ws3 ws3Var, Context context, cja cjaVar, wjb wjbVar, boolean z) {
        super(context, cjaVar, null, 4, true, null);
        this.b0 = ws3Var;
        this.W = wjbVar;
        this.a0 = z;
    }

    @Override // rt3
    public final boolean a() {
        return this.b0.r && super.a();
    }

    @Override // rt3
    public final boolean b() {
        return this.b0.s;
    }

    @Override // rt3
    public final int h() {
        return this.b0.a();
    }

    @Override // rt3
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, k96.M0(2131745025, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131753668, null));
        spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k96.M0(2131748895, null));
        spannableStringBuilder2.setSpan(new z3c(gl.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(k96.M0(2131744196, null));
        vib vibVar = new vib();
        vibVar.a |= 8;
        spannableStringBuilder3.setSpan(new wib(vibVar, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, k96.M0(2131746144, null));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        ws3 ws3Var = this.b0;
        gn gnVar = ws3Var.y;
        kl klVar = ws3Var.w;
        if (klVar != null) {
            gnVar.u(klVar.a(bkb.v0(ws3Var.x <= 0 ? bkb.o7 : bkb.O5, this.W), false));
        }
        int min = Math.min(gl.L(48.0f), getHeight());
        boolean z = this.a0;
        float f = z ? 0.0f : -gl.L(1.0f);
        gnVar.o(getScrollX(), (getHeight() + f) - min, (getWidth() + getScrollX()) - gl.L((z ? 0 : 44) + 12), f + getHeight());
        gnVar.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b0.y || super.verifyDrawable(drawable);
    }
}
