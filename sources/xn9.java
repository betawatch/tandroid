// default package

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xn9 extends vb3 {
    @Override // vb3
    public final void a(Context context, int i, x30 x30Var, Handler handler, t54 t54Var, ArrayList arrayList) {
        arrayList.add(new wn9(context, this.b, handler, t54Var, x30Var));
    }

    @Override // vb3
    public final void c(Context context, int i, Handler handler, t54 t54Var, ArrayList arrayList) {
        tk6 tk6Var = new tk6(context);
        tk6Var.c = this.b;
        tk6Var.d = (short) 5000;
        tk6Var.e = handler;
        tk6Var.f = t54Var;
        tk6Var.g = (byte) 50;
        arrayList.add(new yn9(tk6Var));
    }
}
