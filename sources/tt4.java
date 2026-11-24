// default package

import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tt4 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vt4 b;

    public /* synthetic */ tt4(vt4 vt4Var, byte b) {
        this.a = b;
        this.b = vt4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        vt4 vt4Var = this.b;
        switch (b) {
            case 0:
                vt4Var.c(null);
                break;
            default:
                LinearLayout linearLayout = vt4Var.e;
                if (linearLayout != null && !vt4Var.O) {
                    vt4Var.e = null;
                    vt4Var.h(linearLayout, false);
                    break;
                }
                break;
        }
    }
}
