// default package

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yp9 extends hd3 {
    @Override // hd3
    public final void a(Context context, int i, x40 x40Var, Handler handler, c74 c74Var, ArrayList arrayList) {
        arrayList.add(new xp9(context, this.b, handler, c74Var, x40Var));
    }

    @Override // hd3
    public final void c(Context context, int i, Handler handler, c74 c74Var, ArrayList arrayList) {
        wm6 wm6Var = new wm6(context);
        wm6Var.c = this.b;
        wm6Var.d = (short) 5000;
        wm6Var.e = handler;
        wm6Var.f = c74Var;
        wm6Var.g = (byte) 50;
        arrayList.add(new zp9(wm6Var));
    }
}
