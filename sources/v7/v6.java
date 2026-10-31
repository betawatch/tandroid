package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class v6 {
    public static d9.t a(d9.t tVar) {
        return !(tVar instanceof d9.v) ? tVar instanceof d9.u ? tVar : tVar instanceof Serializable ? new d9.u(tVar) : new d9.v(tVar) : tVar;
    }
}
