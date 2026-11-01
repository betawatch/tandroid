package v7;

import java.io.Serializable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class v6 {
    public static d9.t a(d9.t tVar) {
        return !(tVar instanceof d9.v) ? tVar instanceof d9.u ? tVar : tVar instanceof Serializable ? new d9.u(tVar) : new d9.v(tVar) : tVar;
    }
}
