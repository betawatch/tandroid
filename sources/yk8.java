// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class yk8 implements kt8 {
    public final /* synthetic */ byte a = 1;
    public final kt8 b;
    public final mo5 c;

    public yk8(mo5 mo5Var, kt8 kt8Var) {
        this.c = mo5Var;
        this.b = kt8Var;
    }

    @Override // lt8
    public final Object get() {
        byte b = this.a;
        mo5 mo5Var = this.c;
        kt8 kt8Var = this.b;
        switch (b) {
            case 0:
                return new xk8((Context) mo5Var.a, (v8c) kt8Var.get());
            default:
                return new p69((sr) kt8Var.get(), (sw2) mo5Var.a);
        }
    }

    public yk8(kt8 kt8Var, mo5 mo5Var) {
        this.b = kt8Var;
        this.c = mo5Var;
    }
}
