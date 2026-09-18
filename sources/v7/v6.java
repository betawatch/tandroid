package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public abstract class v6 {
    public static d9.i a(d9.i iVar) {
        return !(iVar instanceof d9.k) ? iVar instanceof d9.j ? iVar : iVar instanceof Serializable ? new d9.j(iVar) : new d9.k(iVar) : iVar;
    }
}
