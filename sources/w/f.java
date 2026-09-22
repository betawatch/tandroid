package w;

import v7.j0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public class f extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(String str, e eVar) {
        super(r2.toString());
        StringBuilder h = j0.h(str, ", frames: ");
        h.append(eVar.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(String str, e eVar, Exception exc) {
        super(r2.toString(), exc);
        StringBuilder h = j0.h(str, ", frames: ");
        h.append(eVar.a());
    }
}
