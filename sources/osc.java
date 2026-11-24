// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class osc implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ osc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                psc pscVar = (psc) obj;
                pscVar.a.c(!r3.b(), true);
                pscVar.c.setEnabled(pscVar.a.b());
                pscVar.c.animate().alpha(pscVar.a.b() ? 1.0f : 0.5f).start();
                break;
            default:
                ry8 ry8Var = (ry8) ((jo0) obj).e;
                if (!ry8Var.b()) {
                    ry8Var.setProgress(0.0f);
                    ry8Var.d();
                    break;
                }
                break;
        }
    }
}
