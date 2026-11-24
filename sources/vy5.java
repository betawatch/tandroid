// default package

import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class vy5 implements ps4, Serializable {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public vy5(int i) {
        this.a = i;
    }

    @Override // ps4
    public final int getArity() {
        return this.a;
    }

    public final String toString() {
        h79.a.getClass();
        return i79.a(this);
    }
}
