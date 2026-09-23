package w;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public class g extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(String str, f fVar) {
        super(r2.toString());
        StringBuilder h = c.h(str, ", frames: ");
        h.append(fVar.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(String str, f fVar, Exception exc) {
        super(r2.toString(), exc);
        StringBuilder h = c.h(str, ", frames: ");
        h.append(fVar.a());
    }
}
