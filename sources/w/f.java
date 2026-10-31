package w;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class f extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(String str, e eVar) {
        super(r2.toString());
        StringBuilder i10 = sc.e.i(str, ", frames: ");
        i10.append(eVar.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(String str, e eVar, Exception exc) {
        super(r2.toString(), exc);
        StringBuilder i10 = sc.e.i(str, ", frames: ");
        i10.append(eVar.a());
    }
}
