package v7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class k8 {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(c3.l lVar, boolean z10) {
        int i10;
        e2.x xVar = new e2.x(16);
        boolean z11 = true;
        while (true) {
            xVar.K(8);
            if (!lVar.j(xVar.a, 0, 8, true)) {
                break;
            }
            long C = xVar.C();
            int m10 = xVar.m();
            if (C != 1) {
                i10 = 8;
            } else {
                if (!lVar.j(xVar.a, 8, 8, true)) {
                    break;
                }
                C = xVar.G();
                i10 = 16;
            }
            long j10 = i10;
            if (C < j10) {
                break;
            }
            int i11 = (int) (C - j10);
            if (z11) {
                if (m10 != 1718909296 || i11 < 8) {
                    break;
                }
                xVar.K(4);
                lVar.j(xVar.a, 0, 4, false);
                if (xVar.m() != 1751476579) {
                    break;
                }
                if (!z10) {
                    break;
                }
                lVar.v(i11 - 4, false);
                z11 = false;
            } else {
                if (m10 == 1836086884) {
                    break;
                }
                if (i11 != 0) {
                    lVar.v(i11, false);
                }
            }
        }
        return false;
    }
}
