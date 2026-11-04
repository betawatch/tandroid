package z2;

import android.os.Build;
import d2.v;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements f9.l {
    public final /* synthetic */ n a;
    public final /* synthetic */ i b;

    public /* synthetic */ d(n nVar, i iVar) {
        this.a = nVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r1.b != false) goto L42;
     */
    @Override // f9.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        Boolean bool;
        b3.d dVar;
        v vVar = (v) obj;
        n nVar = this.a;
        nVar.getClass();
        if (this.b.A0 && ((bool = nVar.k) == null || !bool.booleanValue())) {
            int i3 = vVar.K;
            if (i3 != -1 && i3 > 2) {
                String str = vVar.s;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32) {
                                b3.d dVar2 = nVar.i;
                                if (dVar2 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 32 || (dVar = nVar.i) == null || !dVar.b || !dVar.c() || !nVar.i.d() || !nVar.i.a(nVar.j, vVar)) {
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
