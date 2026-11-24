// default package

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class r08 extends LinearLayout implements tjb {
    public final l46 a;
    public final l46 b;
    public final /* synthetic */ t08 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r08(t08 t08Var, Context context) {
        super(context);
        wjb wjbVar;
        wjb wjbVar2;
        this.c = t08Var;
        setOrientation(1);
        int i = bkb.c6;
        a18 a18Var = t08Var.q0;
        zkb.h(i, a18Var.getResourceProvider(), this);
        be0 be0Var = new be0(getContext());
        be0Var.setImageDrawable(new oy8(R.raw.utyan_draw, gl.L(120.0f), gl.L(120.0f)));
        addView(be0Var, nme.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i2 = bkb.x6;
        wjbVar = ((d) a18Var).resourceProvider;
        l46 a = hve.a(context2, 14.0f, i2, false, wjbVar);
        this.a = a;
        a.setGravity(17);
        a.setText(k96.M0(!t08Var.n0 ? 2131750067 : 2131750066, null));
        addView(a, nme.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i3 = bkb.Wc;
        wjbVar2 = ((d) a18Var).resourceProvider;
        l46 a2 = hve.a(context3, 14.0f, i3, false, wjbVar2);
        this.b = a2;
        a2.setGravity(17);
        a2.setText(gl.G2(gl.O2(k96.M0(2131750068, null), -1, 0, new oq7(this, (byte) 15), null), true, gl.L(2.6666667f), gl.L(1.33f), 1.0f, R.drawable.msg_mini_forumarrow));
        addView(a2, nme.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override // tjb
    public final void updateColors() {
        a18 a18Var = this.c.q0;
        setBackgroundColor(a18Var.getThemedColor(bkb.c6));
        this.a.setTextColor(a18Var.getThemedColor(bkb.x6));
        int i = bkb.Wc;
        int themedColor = a18Var.getThemedColor(i);
        l46 l46Var = this.b;
        l46Var.setTextColor(themedColor);
        l46Var.setLinkTextColor(a18Var.getThemedColor(i));
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
