// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z5d implements wo {
    public static final z5d c;
    public final boolean a;
    public final String b;

    static {
        rhb rhbVar = new rhb((byte) 9, false);
        rhbVar.b = Boolean.FALSE;
        c = new z5d(rhbVar);
    }

    public z5d(rhb rhbVar) {
        this.a = ((Boolean) rhbVar.b).booleanValue();
        this.b = (String) rhbVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z5d)) {
            return false;
        }
        z5d z5dVar = (z5d) obj;
        return fse.a(null, null) && this.a == z5dVar.a && fse.a(this.b, z5dVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
