// default package

import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class u80 {
    public w80 a;
    public List b;
    public List c;
    public Boolean d;
    public rz2 e;
    public List f;
    public int g;
    public byte h;

    public final v80 a() {
        w80 w80Var;
        if (this.h == 1 && (w80Var = this.a) != null) {
            return new v80(w80Var, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" execution");
        }
        if ((this.h & 1) == 0) {
            sb.append(" uiOrientation");
        }
        grb.i(bs2.o("Missing required properties:", sb));
        return null;
    }
}
