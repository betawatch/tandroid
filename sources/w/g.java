package w;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
