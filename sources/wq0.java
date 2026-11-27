// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wq0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gr0 b;

    public /* synthetic */ wq0(gr0 gr0Var, byte b) {
        this.a = b;
        this.b = gr0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        gr0 gr0Var = this.b;
        switch (b) {
            case 0:
                bga bgaVar = gr0Var.a0;
                o5b o5bVar = gr0Var.a;
                bgaVar.a(o5bVar == null ? "" : o5bVar.E);
                break;
            default:
                gr0Var.a0.b(gr0Var.a.E);
                break;
        }
    }
}
