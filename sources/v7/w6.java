package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class w6 {
    public static d9.j a(d9.j jVar) {
        return !(jVar instanceof d9.l) ? jVar instanceof d9.k ? jVar : jVar instanceof Serializable ? new d9.k(jVar) : new d9.l(jVar) : jVar;
    }
}
