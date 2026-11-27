// default package

import java.io.Serializable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
