// default package

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rg1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ u69 b;
    public final /* synthetic */ sg1 c;

    public rg1(sg1 sg1Var, View view, u69 u69Var) {
        this.c = sg1Var;
        this.a = view;
        this.b = u69Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a aVar;
        a aVar2;
        a aVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        vg1 vg1Var = this.c.n;
        int measuredHeight = vg1Var.w.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof rc2) {
            int heightWithKeyboard = (vg1Var.Y.getHeightWithKeyboard() - gm.L(48.0f)) - vg1Var.w.getTop();
            float y = view.getY();
            aVar3 = ((d) vg1Var).actionBar;
            ((rc2) view).D3(i, measuredHeight2 - i, heightWithKeyboard, 0.0f, (y + aVar3.getMeasuredHeight()) - vg1Var.Y.getBackgroundTranslationY(), vg1Var.Y.getMeasuredWidth(), vg1Var.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof cm1)) {
            return true;
        }
        aVar = ((d) vg1Var).actionBar;
        if (aVar == null || vg1Var.Y == null) {
            return true;
        }
        cm1 cm1Var = (cm1) view;
        float y2 = view.getY();
        aVar2 = ((d) vg1Var).actionBar;
        cm1Var.j0((y2 + aVar2.getMeasuredHeight()) - vg1Var.Y.getBackgroundTranslationY(), vg1Var.Y.getBackgroundSizeY());
        return true;
    }
}
