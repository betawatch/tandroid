// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pef {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ pef(sm2 sm2Var) {
        this.a = (Boolean) sm2Var.b;
        this.b = (Boolean) sm2Var.c;
        this.c = (Boolean) sm2Var.d;
        this.d = (Boolean) sm2Var.e;
        this.e = (Boolean) sm2Var.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pef)) {
            return false;
        }
        pef pefVar = (pef) obj;
        return fse.a(this.a, pefVar.a) && fse.a(this.b, pefVar.b) && fse.a(this.c, pefVar.c) && fse.a(this.d, pefVar.d) && fse.a(this.e, pefVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
