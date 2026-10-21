package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public abstract class w6 {
    public static d9.u a(d9.u uVar) {
        return !(uVar instanceof d9.w) ? uVar instanceof d9.v ? uVar : uVar instanceof Serializable ? new d9.v(uVar) : new d9.w(uVar) : uVar;
    }
}
