package x2;

import android.os.Build;
import b2.x;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements d9.l {
    public final /* synthetic */ o a;
    public final /* synthetic */ j b;

    public /* synthetic */ d(o oVar, j jVar) {
        this.a = oVar;
        this.b = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r1.b != false) goto L42;
     */
    @Override // d9.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        Boolean bool;
        z2.d dVar;
        x xVar = (x) obj;
        o oVar = this.a;
        oVar.getClass();
        if (this.b.A0 && ((bool = oVar.k) == null || !bool.booleanValue())) {
            int i10 = xVar.K;
            if (i10 != -1 && i10 > 2) {
                String str = xVar.s;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32) {
                                z2.d dVar2 = oVar.i;
                                if (dVar2 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 32 || (dVar = oVar.i) == null || !dVar.b || !dVar.c() || !oVar.i.d() || !oVar.i.a(oVar.j, xVar)) {
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
