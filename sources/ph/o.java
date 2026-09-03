package ph;

import android.widget.FrameLayout;
import android.widget.ImageView;
import eg.p1;
import hg.v0;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.web.d1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class o extends sa {
    public final int U;
    public final CharSequence V;
    public w51 W;

    public o(p2 p2Var, String str, d1 d1Var) {
        super(p2Var.getParentActivity(), p2Var, true, false, false, 1, p2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.U = p2Var.getCurrentAccount();
        this.V = str;
        N();
        this.v = 0.6f;
        this.y = true;
        this.B = true;
        fixNavigationBar();
        J();
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new v0(23, this, d1Var));
    }

    @Override // org.telegram.ui.Components.sa
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(sl0Var, getContext(), this.U, 0, false, new p1(this, 25), this.resourcesProvider);
        this.W = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return this.V;
    }
}
