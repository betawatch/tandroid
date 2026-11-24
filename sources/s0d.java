// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s0d {
    public static final s0d b;
    public n63 a;

    static {
        s0d s0dVar = new s0d();
        s0dVar.a = null;
        b = s0dVar;
    }

    public static n63 a(Context context) {
        n63 n63Var;
        s0d s0dVar = b;
        synchronized (s0dVar) {
            n63Var = s0dVar.a;
            if (n63Var == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                n63Var = new n63();
                n63Var.a = context;
                s0dVar.a = n63Var;
            }
        }
        return n63Var;
    }
}
