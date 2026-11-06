package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fz;
import org.telegram.messenger.g0;
import org.telegram.messenger.gf;
import org.telegram.messenger.hc;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class d extends sh.c {
    public final gf b;
    public final fz c;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(fz fzVar) {
        hc hcVar;
        hc hcVar2;
        this.c = fzVar;
        gf gfVar = fzVar.y;
        this.b = gfVar;
        this.a.J0(g0.L(7.0f));
        ImageReceiver imageReceiver = this.a;
        imageReceiver.G0(0, 0, true);
        String str = gfVar.g;
        int i7 = gfVar.C;
        String str2 = gfVar.I;
        if (str != null) {
            hcVar = hc.g(str);
        } else {
            String str3 = gfVar.c;
            if (str3 != null) {
                hcVar = hc.g(str3);
            } else if (str2 == null) {
                imageReceiver.f();
                hcVar = null;
            } else {
                if (!gfVar.b || gfVar.d()) {
                    hc g10 = hc.g("thumb://" + i7 + ":" + str2);
                    imageReceiver.G0(gfVar.J, gfVar.K, true);
                    hcVar2 = g10;
                    if (hcVar2 == null) {
                        imageReceiver.q0(hcVar2, null, null, null, null, 0);
                        return;
                    } else {
                        imageReceiver.f();
                        return;
                    }
                }
                hcVar = hc.g("vthumb://" + i7 + ":" + str2);
            }
        }
        hcVar2 = hcVar;
        if (hcVar2 == null) {
        }
    }

    @Override // sh.c
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}
