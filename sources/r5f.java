// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r5f {
    public final o5f a;
    public final Integer b;

    public /* synthetic */ r5f(rhb rhbVar) {
        this.a = (o5f) rhbVar.b;
        this.b = (Integer) rhbVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r5f)) {
            return false;
        }
        r5f r5fVar = (r5f) obj;
        return fse.a(this.a, r5fVar.a) && fse.a(this.b, r5fVar.b) && fse.a(null, null) && fse.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
