// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
                p5b p5bVar = gr0Var.a;
                bgaVar.a(p5bVar == null ? "" : p5bVar.E);
                break;
            default:
                gr0Var.a0.b(gr0Var.a.E);
                break;
        }
    }
}
