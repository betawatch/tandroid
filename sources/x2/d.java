package x2;

import android.os.Build;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements d9.g {
    public final /* synthetic */ p a;
    public final /* synthetic */ i b;

    public /* synthetic */ d(p pVar, i iVar) {
        this.a = pVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r1.b != false) goto L42;
     */
    @Override // d9.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        Boolean bool;
        k kVar;
        b2.s sVar = (b2.s) obj;
        p pVar = this.a;
        pVar.getClass();
        if (this.b.s0 && ((bool = pVar.k) == null || !bool.booleanValue())) {
            int i10 = sVar.J;
            if (i10 != -1 && i10 > 2) {
                String str = sVar.r;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32) {
                                k kVar2 = pVar.i;
                                if (kVar2 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 32 || (kVar = pVar.i) == null || !kVar.b || !kVar.b() || !pVar.i.c() || !pVar.i.a(pVar.j, sVar)) {
                                return false;
                            }
                            break;
                    }
                }
                if (Build.VERSION.SDK_INT >= 32) {
                }
                return false;
            }
        }
        return true;
    }
}
