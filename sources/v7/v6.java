package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class v6 {
    public static d9.i a(d9.i iVar) {
        return !(iVar instanceof d9.k) ? iVar instanceof d9.j ? iVar : iVar instanceof Serializable ? new d9.j(iVar) : new d9.k(iVar) : iVar;
    }
}
