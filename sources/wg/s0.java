package wg;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ s0(w0 w0Var, int i7) {
        this.a = i7;
        this.b = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w0 w0Var = this.b;
                w0Var.W1.clear();
                w0Var.Q1.d.b(true);
                w0Var.n1(true, false);
                break;
            default:
                this.b.i1(false);
                break;
        }
    }
}
