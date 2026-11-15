package wg;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ q0(u0 u0Var, int i7) {
        this.a = i7;
        this.b = u0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                u0Var.a2.clear();
                u0Var.U1.d.b(true);
                u0Var.n1(true, false);
                break;
            default:
                this.b.i1(false);
                break;
        }
    }
}
