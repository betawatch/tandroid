package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class v6 {
    public static d9.j a(d9.j jVar) {
        return !(jVar instanceof d9.l) ? jVar instanceof d9.k ? jVar : jVar instanceof Serializable ? new d9.k(jVar) : new d9.l(jVar) : jVar;
    }
}
