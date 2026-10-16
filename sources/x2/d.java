package x2;

import android.os.Build;
import b2.x;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements d9.m {
    public final /* synthetic */ n a;
    public final /* synthetic */ i b;

    public /* synthetic */ d(n nVar, i iVar) {
        this.a = nVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r1.b != false) goto L42;
     */
    @Override // d9.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        Boolean bool;
        z2.d dVar;
        x xVar = (x) obj;
        n nVar = this.a;
        nVar.getClass();
        if (this.b.A0 && ((bool = nVar.k) == null || !bool.booleanValue())) {
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
                                z2.d dVar2 = nVar.i;
                                if (dVar2 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 32 || (dVar = nVar.i) == null || !dVar.b || !dVar.c() || !nVar.i.d() || !nVar.i.a(nVar.j, xVar)) {
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
