package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class v6 {
    public static d9.j a(d9.j jVar) {
        return !(jVar instanceof d9.l) ? jVar instanceof d9.k ? jVar : jVar instanceof Serializable ? new d9.k(jVar) : new d9.l(jVar) : jVar;
    }
}
