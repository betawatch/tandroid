// default package

import java.util.ArrayList;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class t25 implements Runnable, fn7 {
    public boolean a;
    public final /* synthetic */ jn7 b;
    public final /* synthetic */ z56 c;
    public final /* synthetic */ c d;

    public t25(jn7 jn7Var, z56 z56Var, c cVar) {
        this.b = jn7Var;
        this.c = z56Var;
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
                if (((b35) obj).d) {
                    return;
                }
            }
            run();
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.d4) {
            a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        this.a = true;
        hl.r(this);
        this.b.n(this, jn7.d4);
        this.c.run();
    }
}
