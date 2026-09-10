package w;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
