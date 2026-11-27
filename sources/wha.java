// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class wha implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xha b;
    public final /* synthetic */ String c;

    public /* synthetic */ wha(xha xhaVar, String str, byte b) {
        this.a = b;
        this.b = xhaVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.a) {
            case 0:
                xha xhaVar = this.b;
                String str = this.c;
                xhaVar.getClass();
                hl.c3(new wha(xhaVar, str, b));
                break;
            default:
                xha xhaVar2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                xhaVar2.f = null;
                if (!xc2.T(xhaVar2.n) && xhaVar2.s.g1 != null) {
                    arrayList = new ArrayList(xhaVar2.s.g1.participants.participants);
                }
                xhaVar2.r = 2;
                if (arrayList != null) {
                    Utilities.g.c(new jr9(xhaVar2, str2, arrayList, (byte) 16));
                } else {
                    xhaVar2.r = 1;
                }
                xhaVar2.e.g(str2, false, false, true, false, xc2.T(xhaVar2.n) ? xhaVar2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
