package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class v6 {
    public static d9.j a(d9.j jVar) {
        return !(jVar instanceof d9.l) ? jVar instanceof d9.k ? jVar : jVar instanceof Serializable ? new d9.k(jVar) : new d9.l(jVar) : jVar;
    }
}
