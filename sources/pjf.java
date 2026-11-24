// default package

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class pjf implements hfd {
    public transient z1f a;
    public transient d3 b;

    public final Map a() {
        d3 d3Var = this.b;
        if (d3Var != null) {
            return d3Var;
        }
        wjf wjfVar = (wjf) this;
        d3 d3Var2 = new d3(wjfVar, wjfVar.c, (byte) 1);
        this.b = d3Var2;
        return d3Var2;
    }

    public final Set b() {
        z1f z1fVar = this.a;
        if (z1fVar != null) {
            return z1fVar;
        }
        wjf wjfVar = (wjf) this;
        z1f z1fVar2 = new z1f(wjfVar, wjfVar.c);
        this.a = z1fVar2;
        return z1fVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hfd) {
            return a().equals(((pjf) ((hfd) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((dq2) ((d3) a()).d).hashCode();
    }

    public final String toString() {
        return ((dq2) ((d3) a()).d).toString();
    }
}
