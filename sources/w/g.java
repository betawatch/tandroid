package w;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
