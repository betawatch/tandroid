package x2;

import android.os.Build;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements d9.g {
    public final /* synthetic */ q a;
    public final /* synthetic */ j b;

    public /* synthetic */ d(q qVar, j jVar) {
        this.a = qVar;
        this.b = jVar;
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
        l lVar;
        b2.s sVar = (b2.s) obj;
        q qVar = this.a;
        qVar.getClass();
        if (this.b.s0 && ((bool = qVar.k) == null || !bool.booleanValue())) {
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
                                l lVar2 = qVar.i;
                                if (lVar2 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 32 || (lVar = qVar.i) == null || !lVar.b || !lVar.b() || !qVar.i.c() || !qVar.i.a(qVar.j, sVar)) {
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
