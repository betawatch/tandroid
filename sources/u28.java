// default package

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u28 extends LinearLayout implements vlb {
    public final l66 a;
    public final l66 b;
    public final /* synthetic */ w28 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u28(w28 w28Var, Context context) {
        super(context);
        ylb ylbVar;
        ylb ylbVar2;
        this.c = w28Var;
        setOrientation(1);
        int i = cmb.c6;
        d38 d38Var = w28Var.q0;
        anb.h(i, d38Var.getResourceProvider(), this);
        bf0 bf0Var = new bf0(getContext());
        bf0Var.setImageDrawable(new p09(R.raw.utyan_draw, gm.L(120.0f), gm.L(120.0f)));
        addView(bf0Var, qoe.t(nm7.E1, nm7.E1, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i2 = cmb.x6;
        ylbVar = ((d) d38Var).resourceProvider;
        l66 a = jxe.a(context2, 14.0f, i2, false, ylbVar);
        this.a = a;
        a.setGravity(17);
        a.setText(jb6.M0(!w28Var.n0 ? 2131750016 : 2131750015, null));
        addView(a, qoe.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i3 = cmb.Wc;
        ylbVar2 = ((d) d38Var).resourceProvider;
        l66 a2 = jxe.a(context3, 14.0f, i3, false, ylbVar2);
        this.b = a2;
        a2.setGravity(17);
        a2.setText(gm.F2(gm.N2(jb6.M0(2131750017, null), -1, 0, new kl7(this, (byte) 22), null), true, gm.L(2.6666667f), gm.L(1.33f), 1.0f, R.drawable.msg_mini_forumarrow));
        addView(a2, qoe.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override // vlb
    public final void updateColors() {
        d38 d38Var = this.c.q0;
        setBackgroundColor(d38Var.getThemedColor(cmb.c6));
        this.a.setTextColor(d38Var.getThemedColor(cmb.x6));
        int i = cmb.Wc;
        int themedColor = d38Var.getThemedColor(i);
        l66 l66Var = this.b;
        l66Var.setTextColor(themedColor);
        l66Var.setLinkTextColor(d38Var.getThemedColor(i));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
