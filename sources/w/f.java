package w;

import v7.j;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class f extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(String str, e eVar) {
        super(r2.toString());
        StringBuilder h = j.h(str, ", frames: ");
        h.append(eVar.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(String str, e eVar, Exception exc) {
        super(r2.toString(), exc);
        StringBuilder h = j.h(str, ", frames: ");
        h.append(eVar.a());
    }
}
