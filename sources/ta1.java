// default package

import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ta1 {
    public Serializable a;
    public va1 b;
    public ec9 c;
    public boolean d;

    public final void a() {
        this.d = true;
        va1 va1Var = this.b;
        if (va1Var == null || !va1Var.b.k(null)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        ec9 ec9Var;
        va1 va1Var = this.b;
        if (va1Var != null) {
            ua1 ua1Var = va1Var.b;
            if (!ua1Var.isDone()) {
                ua1Var.l(new i2("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, (byte) 2));
            }
        }
        if (this.d || (ec9Var = this.c) == null) {
            return;
        }
        ec9Var.k(null);
    }
}
