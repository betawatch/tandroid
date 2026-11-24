// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x3d {
    public final gp a;
    public final o94 b;

    public /* synthetic */ x3d(gp gpVar, o94 o94Var) {
        this.a = gpVar;
        this.b = o94Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x3d)) {
            return false;
        }
        x3d x3dVar = (x3d) obj;
        return fse.a(this.a, x3dVar.a) && fse.a(this.b, x3dVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        wm4 wm4Var = new wm4(this);
        wm4Var.a(this.a, "key");
        wm4Var.a(this.b, "feature");
        return wm4Var.toString();
    }
}
