// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class sm8 {
    public final um4 a;
    public final long b;

    public sm8(um8 um8Var, um4 um4Var) {
        long length;
        this.a = um4Var;
        long length2 = ((um8Var.b.length() + um8Var.a.length()) << 1) + 128;
        j26 j26Var = (j26) um4Var.b;
        if (j26Var == null) {
            length = 1024;
        } else {
            length = (((int[]) j26Var.c) == null ? 0L : ((int[]) j26Var.c).length << 2) + (((int[]) j26Var.b).length << 2) + 64;
        }
        this.b = length2 + length;
    }
}
