// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wse {
    public final mse a;
    public final Integer b;

    public /* synthetic */ wse(xab xabVar) {
        this.a = (mse) xabVar.b;
        this.b = (Integer) xabVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wse)) {
            return false;
        }
        wse wseVar = (wse) obj;
        return fse.a(this.a, wseVar.a) && fse.a(this.b, wseVar.b) && fse.a(null, null) && fse.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
