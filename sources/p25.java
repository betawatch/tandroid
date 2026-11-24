// default package

import java.util.ArrayList;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p25 implements Runnable, jm7 {
    public boolean a;
    public final /* synthetic */ nm7 b;
    public final /* synthetic */ k16 c;
    public final /* synthetic */ c d;

    public p25(nm7 nm7Var, k16 k16Var, c cVar) {
        this.b = nm7Var;
        this.c = k16Var;
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
                if (((x25) obj).d) {
                    return;
                }
            }
            run();
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.e4) {
            a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        this.a = true;
        gm.r(this);
        this.b.n(this, nm7.e4);
        this.c.run();
    }
}
