package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public abstract class v6 {
    public static d9.i a(d9.i iVar) {
        return !(iVar instanceof d9.k) ? iVar instanceof d9.j ? iVar : iVar instanceof Serializable ? new d9.j(iVar) : new d9.k(iVar) : iVar;
    }
}
