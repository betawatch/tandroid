package uh;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.g0;
import org.telegram.messenger.xy;
import org.telegram.messenger.ye;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d extends th.c {
    public final ye b;
    public final xy c;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(xy xyVar) {
        ac acVar;
        ac acVar2;
        this.c = xyVar;
        ye yeVar = xyVar.y;
        this.b = yeVar;
        this.a.J0(g0.L(7.0f));
        ImageReceiver imageReceiver = this.a;
        imageReceiver.G0(0, 0, true);
        String str = yeVar.g;
        int i3 = yeVar.C;
        String str2 = yeVar.I;
        if (str != null) {
            acVar = ac.g(str);
        } else {
            String str3 = yeVar.c;
            if (str3 != null) {
                acVar = ac.g(str3);
            } else if (str2 == null) {
                imageReceiver.f();
                acVar = null;
            } else {
                if (!yeVar.b || yeVar.d()) {
                    ac g7 = ac.g("thumb://" + i3 + ":" + str2);
                    imageReceiver.G0(yeVar.J, yeVar.K, true);
                    acVar2 = g7;
                    if (acVar2 == null) {
                        imageReceiver.q0(acVar2, null, null, null, null, 0);
                        return;
                    } else {
                        imageReceiver.f();
                        return;
                    }
                }
                acVar = ac.g("vthumb://" + i3 + ":" + str2);
            }
        }
        acVar2 = acVar;
        if (acVar2 == null) {
        }
    }

    @Override // th.c
    public final void c(Canvas canvas, int i3, int i10) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, i3, i10);
        imageReceiver.h(canvas, null);
    }
}
