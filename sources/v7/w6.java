package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public abstract class w6 {
    public static d9.u a(d9.u uVar) {
        return !(uVar instanceof d9.w) ? uVar instanceof d9.v ? uVar : uVar instanceof Serializable ? new d9.v(uVar) : new d9.w(uVar) : uVar;
    }
}
