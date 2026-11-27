// default package

import android.widget.AbsListView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class r76 implements AbsListView.OnScrollListener {
    public final /* synthetic */ s76 a;

    public r76(s76 s76Var) {
        this.a = s76Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        s76 s76Var = this.a;
        q76 q76Var = s76Var.H;
        op opVar = s76Var.P;
        if (i != 1 || opVar.getInputMethodMode() == 2 || opVar.getContentView() == null) {
            return;
        }
        s76Var.L.removeCallbacks(q76Var);
        q76Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
