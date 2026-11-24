// default package

import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rn2 implements cy2, Serializable {
    public final cy2 a;
    public final ay2 b;

    public rn2(ay2 ay2Var, cy2 cy2Var) {
        cy2Var.getClass();
        this.a = cy2Var;
        this.b = ay2Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof rn2) {
            rn2 rn2Var = (rn2) obj;
            int i = 2;
            rn2 rn2Var2 = rn2Var;
            int i2 = 2;
            while (true) {
                cy2 cy2Var = rn2Var2.a;
                rn2Var2 = cy2Var instanceof rn2 ? (rn2) cy2Var : null;
                if (rn2Var2 == null) {
                    break;
                }
                i2++;
            }
            rn2 rn2Var3 = this;
            while (true) {
                cy2 cy2Var2 = rn2Var3.a;
                rn2Var3 = cy2Var2 instanceof rn2 ? (rn2) cy2Var2 : null;
                if (rn2Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    ay2 ay2Var = this.b;
                    if (!rr5.a(rn2Var.get(ay2Var.getKey()), ay2Var)) {
                        z = false;
                        break;
                    }
                    cy2 cy2Var3 = this.a;
                    if (!(cy2Var3 instanceof rn2)) {
                        cy2Var3.getClass();
                        ay2 ay2Var2 = (ay2) cy2Var3;
                        z = rr5.a(rn2Var.get(ay2Var2.getKey()), ay2Var2);
                        break;
                    }
                    this = (rn2) cy2Var3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // cy2
    public final Object fold(Object obj, fs4 fs4Var) {
        return fs4Var.invoke(this.a.fold(obj, fs4Var), this.b);
    }

    @Override // cy2
    public final ay2 get(by2 by2Var) {
        by2Var.getClass();
        while (true) {
            ay2 ay2Var = this.b.get(by2Var);
            if (ay2Var != null) {
                return ay2Var;
            }
            cy2 cy2Var = this.a;
            if (!(cy2Var instanceof rn2)) {
                return cy2Var.get(by2Var);
            }
            this = (rn2) cy2Var;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // cy2
    public final cy2 minusKey(by2 by2Var) {
        by2Var.getClass();
        ay2 ay2Var = this.b;
        ay2 ay2Var2 = ay2Var.get(by2Var);
        cy2 cy2Var = this.a;
        if (ay2Var2 != null) {
            return cy2Var;
        }
        cy2 minusKey = cy2Var.minusKey(by2Var);
        return minusKey == cy2Var ? this : minusKey == k34.a ? ay2Var : new rn2(ay2Var, minusKey);
    }

    @Override // cy2
    public final cy2 plus(cy2 cy2Var) {
        cy2Var.getClass();
        return cy2Var == k34.a ? this : (cy2) cy2Var.fold(this, new qn2((byte) 1));
    }

    public final String toString() {
        return "[" + ((String) fold("", new qn2((byte) 0))) + ']';
    }
}
