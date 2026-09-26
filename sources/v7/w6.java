package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class w6 {
    public static d9.i a(d9.i iVar) {
        return !(iVar instanceof d9.k) ? iVar instanceof d9.j ? iVar : iVar instanceof Serializable ? new d9.j(iVar) : new d9.k(iVar) : iVar;
    }
}
