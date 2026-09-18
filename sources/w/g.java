package w;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
