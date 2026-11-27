// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class uu9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xu9 b;

    public /* synthetic */ uu9(xu9 xu9Var, byte b) {
        this.a = b;
        this.b = xu9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r8.r0 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r8.r0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r8.r0 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        r8.scrollBy(r0 * r2, 0);
        hl.c3(r8.t0);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int tabSize;
        int max;
        byte b = this.a;
        xu9 xu9Var = this.b;
        int i = 1;
        switch (b) {
            case 0:
                oob oobVar = xu9Var.e;
                xu9Var.c0 = false;
                xu9Var.W = xu9Var.getScrollX() + xu9Var.a0;
                tabSize = xu9Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                xu9Var.V = ceil;
                xu9Var.U = ceil;
                if (xu9Var.e(ceil) && ceil >= 0 && ceil < oobVar.getChildCount()) {
                    try {
                        xu9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    xu9Var.e0 = 0.0f;
                    xu9Var.w = 0.0f;
                    View childAt = oobVar.getChildAt(ceil);
                    xu9Var.s = childAt;
                    xu9Var.d0 = childAt.getX() - xu9Var.getScrollX();
                    xu9Var.s.invalidate();
                    oobVar.invalidate();
                    xu9Var.j();
                    xu9Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis() - xu9Var.s0;
                if (currentTimeMillis >= 3000) {
                    if (currentTimeMillis >= 5000) {
                        max = Math.max(1, hl.L(4.0f));
                        break;
                    } else {
                        max = Math.max(1, hl.L(2.0f));
                        break;
                    }
                } else {
                    max = Math.max(1, hl.L(1.0f));
                    break;
                }
        }
    }
}
