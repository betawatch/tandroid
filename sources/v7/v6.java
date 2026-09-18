package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class v6 {
    public static d9.i a(d9.i iVar) {
        return !(iVar instanceof d9.k) ? iVar instanceof d9.j ? iVar : iVar instanceof Serializable ? new d9.j(iVar) : new d9.k(iVar) : iVar;
    }
}
