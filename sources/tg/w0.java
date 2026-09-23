package tg;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ w0(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                a1 a1Var = this.b;
                a1Var.e0.clear();
                a1Var.Y.d.b(true);
                a1Var.b0(true, false);
                break;
            default:
                this.b.W(false);
                break;
        }
    }
}
