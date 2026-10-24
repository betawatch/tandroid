package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class w6 {
    public static d9.u a(d9.u uVar) {
        return !(uVar instanceof d9.w) ? uVar instanceof d9.v ? uVar : uVar instanceof Serializable ? new d9.v(uVar) : new d9.w(uVar) : uVar;
    }
}
