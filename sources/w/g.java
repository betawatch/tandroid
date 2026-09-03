package w;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
