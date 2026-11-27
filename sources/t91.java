// default package

import java.io.Serializable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class t91 {
    public Serializable a;
    public v91 b;
    public sd9 c;
    public boolean d;

    public final void a() {
        this.d = true;
        v91 v91Var = this.b;
        if (v91Var == null || !v91Var.b.k(null)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        sd9 sd9Var;
        v91 v91Var = this.b;
        if (v91Var != null) {
            u91 u91Var = v91Var.b;
            if (!u91Var.isDone()) {
                u91Var.l(new j2("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, (byte) 2));
            }
        }
        if (this.d || (sd9Var = this.c) == null) {
            return;
        }
        sd9Var.k(null);
    }
}
