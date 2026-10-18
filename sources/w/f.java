package w;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class f extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(String str, e eVar) {
        super(r2.toString());
        StringBuilder i10 = r4.c.i(str, ", frames: ");
        i10.append(eVar.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(String str, e eVar, Exception exc) {
        super(r2.toString(), exc);
        StringBuilder i10 = r4.c.i(str, ", frames: ");
        i10.append(eVar.a());
    }
}
