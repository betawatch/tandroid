// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                kca kcaVar = gr0Var.a0;
                s1b s1bVar = gr0Var.a;
                kcaVar.a(s1bVar == null ? "" : s1bVar.E);
                break;
            default:
                gr0Var.a0.b(gr0Var.a.E);
                break;
        }
    }
}
