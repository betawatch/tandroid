// default package

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class sf1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ f89 b;
    public final /* synthetic */ tf1 c;

    public sf1(tf1 tf1Var, View view, f89 f89Var) {
        this.c = tf1Var;
        this.a = view;
        this.b = f89Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a aVar;
        a aVar2;
        a aVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        wf1 wf1Var = this.c.n;
        int measuredHeight = wf1Var.w.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof wb2) {
            int heightWithKeyboard = (wf1Var.Y.getHeightWithKeyboard() - hl.L(48.0f)) - wf1Var.w.getTop();
            float y = view.getY();
            aVar3 = ((e) wf1Var).actionBar;
            ((wb2) view).D3(i, measuredHeight2 - i, heightWithKeyboard, 0.0f, (y + aVar3.getMeasuredHeight()) - wf1Var.Y.getBackgroundTranslationY(), wf1Var.Y.getMeasuredWidth(), wf1Var.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof dl1)) {
            return true;
        }
        aVar = ((e) wf1Var).actionBar;
        if (aVar == null || wf1Var.Y == null) {
            return true;
        }
        dl1 dl1Var = (dl1) view;
        float y2 = view.getY();
        aVar2 = ((e) wf1Var).actionBar;
        dl1Var.j0((y2 + aVar2.getMeasuredHeight()) - wf1Var.Y.getBackgroundTranslationY(), wf1Var.Y.getBackgroundSizeY());
        return true;
    }
}
