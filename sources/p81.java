// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p81 extends ja {
    public s71 c;
    public b81 d;

    public final boolean equals(Object obj) {
        b81 b81Var;
        b81 b81Var2;
        s71 s71Var;
        s71 s71Var2;
        if (this == obj) {
            return true;
        }
        if (obj != null && p81.class == obj.getClass()) {
            p81 p81Var = (p81) obj;
            int i = this.a;
            if (i == p81Var.a) {
                if (i == 1 && (s71Var = this.c) != null && (s71Var2 = p81Var.c) != null) {
                    return s71Var.a == s71Var2.a;
                }
                if (i == 2 && (b81Var = this.d) != null && (b81Var2 = p81Var.d) != null) {
                    return Objects.equals(b81Var.a, b81Var2.a);
                }
            }
        }
        return false;
    }
}
