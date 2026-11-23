package wg;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ r0(v0 v0Var, int i7) {
        this.a = i7;
        this.b = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                v0Var.a2.clear();
                v0Var.U1.d.b(true);
                v0Var.o1(true, false);
                break;
            default:
                this.b.j1(false);
                break;
        }
    }
}
