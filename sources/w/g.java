package w;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class g extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(String str, f fVar) {
        super(r2.toString());
        StringBuilder f10 = c.f(str, ", frames: ");
        f10.append(fVar.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(String str, f fVar, Exception exc) {
        super(r2.toString(), exc);
        StringBuilder f10 = c.f(str, ", frames: ");
        f10.append(fVar.a());
    }
}
