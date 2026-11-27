// default package

import java.io.Serializable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ym2 implements mx2, Serializable {
    public final mx2 a;
    public final kx2 b;

    public ym2(kx2 kx2Var, mx2 mx2Var) {
        mx2Var.getClass();
        this.a = mx2Var;
        this.b = kx2Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ym2) {
            ym2 ym2Var = (ym2) obj;
            int i = 2;
            ym2 ym2Var2 = ym2Var;
            int i2 = 2;
            while (true) {
                mx2 mx2Var = ym2Var2.a;
                ym2Var2 = mx2Var instanceof ym2 ? (ym2) mx2Var : null;
                if (ym2Var2 == null) {
                    break;
                }
                i2++;
            }
            ym2 ym2Var3 = this;
            while (true) {
                mx2 mx2Var2 = ym2Var3.a;
                ym2Var3 = mx2Var2 instanceof ym2 ? (ym2) mx2Var2 : null;
                if (ym2Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    kx2 kx2Var = this.b;
                    if (!ur5.a(ym2Var.get(kx2Var.getKey()), kx2Var)) {
                        z = false;
                        break;
                    }
                    mx2 mx2Var3 = this.a;
                    if (!(mx2Var3 instanceof ym2)) {
                        mx2Var3.getClass();
                        kx2 kx2Var2 = (kx2) mx2Var3;
                        z = ur5.a(ym2Var.get(kx2Var2.getKey()), kx2Var2);
                        break;
                    }
                    this = (ym2) mx2Var3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // mx2
    public final Object fold(Object obj, is4 is4Var) {
        return is4Var.invoke(this.a.fold(obj, is4Var), this.b);
    }

    @Override // mx2
    public final kx2 get(lx2 lx2Var) {
        lx2Var.getClass();
        while (true) {
            kx2 kx2Var = this.b.get(lx2Var);
            if (kx2Var != null) {
                return kx2Var;
            }
            mx2 mx2Var = this.a;
            if (!(mx2Var instanceof ym2)) {
                return mx2Var.get(lx2Var);
            }
            this = (ym2) mx2Var;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // mx2
    public final mx2 minusKey(lx2 lx2Var) {
        lx2Var.getClass();
        kx2 kx2Var = this.b;
        kx2 kx2Var2 = kx2Var.get(lx2Var);
        mx2 mx2Var = this.a;
        if (kx2Var2 != null) {
            return mx2Var;
        }
        mx2 minusKey = mx2Var.minusKey(lx2Var);
        return minusKey == mx2Var ? this : minusKey == u24.a ? kx2Var : new ym2(kx2Var, minusKey);
    }

    @Override // mx2
    public final mx2 plus(mx2 mx2Var) {
        mx2Var.getClass();
        return mx2Var == u24.a ? this : (mx2) mx2Var.fold(this, new xm2((byte) 1));
    }

    public final String toString() {
        return "[" + ((String) fold("", new xm2((byte) 0))) + ']';
    }
}
