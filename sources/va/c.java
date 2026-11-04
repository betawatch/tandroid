package va;

import b8.yf;
import ja.d;
import n9.h;
import n9.k;
import p1.e;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public static final e c = yf.a("|S||P|");
    public static final e d = yf.a("|S|id");
    public static final String[] e = {"*", "FCM", "GCM", ""};
    public final d a;
    public final String b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(h hVar) {
        hVar.a();
        this.a = new d(hVar.a, "com.google.android.gms.appid");
        hVar.a();
        k kVar = hVar.c;
        String str = kVar.e;
        if (str == null) {
            hVar.a();
            str = kVar.b;
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
