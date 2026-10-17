package w;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public class f extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(String str, e eVar) {
        super(r2.toString());
        StringBuilder i10 = r.c.i(str, ", frames: ");
        i10.append(eVar.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(String str, e eVar, Exception exc) {
        super(r2.toString(), exc);
        StringBuilder i10 = r.c.i(str, ", frames: ");
        i10.append(eVar.a());
    }
}
