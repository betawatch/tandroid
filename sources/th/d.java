package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.dz;
import org.telegram.messenger.ff;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class d extends sh.c {
    public final ff b;
    public final dz c;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(dz dzVar) {
        gc gcVar;
        gc gcVar2;
        this.c = dzVar;
        ff ffVar = dzVar.y;
        this.b = ffVar;
        this.a.J0(g0.L(7.0f));
        ImageReceiver imageReceiver = this.a;
        imageReceiver.G0(0, 0, true);
        String str = ffVar.g;
        int i7 = ffVar.C;
        String str2 = ffVar.I;
        if (str != null) {
            gcVar = gc.g(str);
        } else {
            String str3 = ffVar.c;
            if (str3 != null) {
                gcVar = gc.g(str3);
            } else if (str2 == null) {
                imageReceiver.f();
                gcVar = null;
            } else {
                if (!ffVar.b || ffVar.d()) {
                    gc g10 = gc.g("thumb://" + i7 + ":" + str2);
                    imageReceiver.G0(ffVar.J, ffVar.K, true);
                    gcVar2 = g10;
                    if (gcVar2 == null) {
                        imageReceiver.q0(gcVar2, null, null, null, null, 0);
                        return;
                    } else {
                        imageReceiver.f();
                        return;
                    }
                }
                gcVar = gc.g("vthumb://" + i7 + ":" + str2);
            }
        }
        gcVar2 = gcVar;
        if (gcVar2 == null) {
        }
    }

    @Override // sh.c
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}
