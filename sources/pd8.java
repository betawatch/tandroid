// default package

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pd8 extends ld8 {
    public final jm6 b;
    public final y3a c;

    public pd8(y3a y3aVar) {
        gl5 gl5Var;
        this.c = y3aVar;
        jm6 jm6Var = y3aVar.y;
        this.b = jm6Var;
        this.a.q0(gl.L(7.0f));
        ImageReceiver imageReceiver = this.a;
        imageReceiver.o0(0, 0, true);
        String str = jm6Var.g;
        int i = jm6Var.C;
        String str2 = jm6Var.I;
        if (str != null) {
            gl5Var = gl5.g(str);
        } else {
            String str3 = jm6Var.c;
            if (str3 != null) {
                gl5Var = gl5.g(str3);
            } else if (str2 == null) {
                imageReceiver.f();
                gl5Var = null;
            } else if (!jm6Var.b || jm6Var.d()) {
                gl5Var = gl5.g("thumb://" + i + ":" + str2);
                imageReceiver.o0(jm6Var.J, jm6Var.K, true);
            } else {
                gl5Var = gl5.g("vthumb://" + i + ":" + str2);
            }
        }
        gl5 gl5Var2 = gl5Var;
        if (gl5Var2 != null) {
            imageReceiver.d0(gl5Var2, null, null, null, null, 0);
        } else {
            imageReceiver.f();
        }
    }
}
