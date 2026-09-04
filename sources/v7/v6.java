package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class v6 {
    public static d9.j a(d9.j jVar) {
        return !(jVar instanceof d9.l) ? jVar instanceof d9.k ? jVar : jVar instanceof Serializable ? new d9.k(jVar) : new d9.l(jVar) : jVar;
    }
}
