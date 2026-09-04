package w;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class g extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(String str, e eVar) {
        super(r2.toString());
        StringBuilder g10 = f.g(str, ", frames: ");
        g10.append(eVar.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(String str, e eVar, Exception exc) {
        super(r2.toString(), exc);
        StringBuilder g10 = f.g(str, ", frames: ");
        g10.append(eVar.a());
    }
}
