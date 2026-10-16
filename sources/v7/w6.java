package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class w6 {
    public static d9.u a(d9.u uVar) {
        return !(uVar instanceof d9.w) ? uVar instanceof d9.v ? uVar : uVar instanceof Serializable ? new d9.v(uVar) : new d9.w(uVar) : uVar;
    }
}
