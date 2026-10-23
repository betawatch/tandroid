package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public abstract class w6 {
    public static d9.u a(d9.u uVar) {
        return !(uVar instanceof d9.w) ? uVar instanceof d9.v ? uVar : uVar instanceof Serializable ? new d9.v(uVar) : new d9.w(uVar) : uVar;
    }
}
