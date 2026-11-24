// default package

import java.util.ArrayList;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class p05 implements Runnable, gk7 {
    public boolean a;
    public final /* synthetic */ kk7 b;
    public final /* synthetic */ kz5 c;
    public final /* synthetic */ c d;

    public p05(kk7 kk7Var, kz5 kz5Var, c cVar) {
        this.b = kk7Var;
        this.c = kz5Var;
        this.d = cVar;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        c cVar = this.d;
        if (cVar.e != null) {
            ArrayList arrayList = cVar.J;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((x05) obj).d) {
                    return;
                }
            }
            run();
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.c4) {
            a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        this.a = true;
        gl.r(this);
        this.b.n(this, kk7.c4);
        this.c.run();
    }
}
