package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ef;
import org.telegram.messenger.fc;
import org.telegram.messenger.g0;
import org.telegram.messenger.yy;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class d extends sh.d {
    public final ef b;
    public final yy c;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(yy yyVar) {
        fc fcVar;
        fc fcVar2;
        this.c = yyVar;
        ef efVar = yyVar.y;
        this.b = efVar;
        this.a.J0(g0.L(7.0f));
        ImageReceiver imageReceiver = this.a;
        imageReceiver.G0(0, 0, true);
        String str = efVar.g;
        int i7 = efVar.C;
        String str2 = efVar.I;
        if (str != null) {
            fcVar = fc.g(str);
        } else {
            String str3 = efVar.c;
            if (str3 != null) {
                fcVar = fc.g(str3);
            } else if (str2 == null) {
                imageReceiver.f();
                fcVar = null;
            } else {
                if (!efVar.b || efVar.d()) {
                    fc g10 = fc.g("thumb://" + i7 + ":" + str2);
                    imageReceiver.G0(efVar.J, efVar.K, true);
                    fcVar2 = g10;
                    if (fcVar2 == null) {
                        imageReceiver.q0(fcVar2, null, null, null, null, 0);
                        return;
                    } else {
                        imageReceiver.f();
                        return;
                    }
                }
                fcVar = fc.g("vthumb://" + i7 + ":" + str2);
            }
        }
        fcVar2 = fcVar;
        if (fcVar2 == null) {
        }
    }

    @Override // sh.d
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}
