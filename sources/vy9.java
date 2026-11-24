// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vy9 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zy9 b;

    public /* synthetic */ vy9(zy9 zy9Var, byte b) {
        this.a = b;
        this.b = zy9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        zy9 zy9Var = this.b;
        switch (b) {
            case 0:
                zy9Var.Z1.clear();
                zy9Var.T1.d.b(true);
                zy9Var.i1(true, false);
                break;
            default:
                zy9Var.d1(false);
                break;
        }
    }
}
