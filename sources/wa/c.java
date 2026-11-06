package wa;

import c8.qb;
import ka.d;
import o9.g;
import o9.i;
import q1.e;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c {
    public static final e c = qb.a("|S||P|");
    public static final e d = qb.a("|S|id");
    public static final String[] e = {"*", "FCM", "GCM", ""};
    public final d a;
    public final String b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(g gVar) {
        gVar.a();
        this.a = new d(gVar.a, "com.google.android.gms.appid");
        gVar.a();
        i iVar = gVar.c;
        String str = iVar.e;
        if (str == null) {
            gVar.a();
            str = iVar.b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.b = str;
    }
}
