package vi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import m4.d0;
import org.telegram.messenger.me;
import org.telegram.messenger.u0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ g c;

    public /* synthetic */ c(h hVar, g gVar, int i7) {
        this.a = 4;
        this.b = hVar;
        this.c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        switch (this.a) {
            case 0:
                h hVar = this.b;
                g gVar = this.c;
                hVar.g.O(gVar.a, gVar.b);
                return;
            case 1:
                h hVar2 = this.b;
                g gVar2 = this.c;
                d0 d0Var = hVar2.g;
                long j3 = gVar2.a;
                d0Var.getClass();
                return;
            case 2:
                h hVar3 = this.b;
                g gVar3 = this.c;
                hVar3.g.O(gVar3.a, gVar3.b);
                return;
            case 3:
                h hVar4 = this.b;
                g gVar4 = this.c;
                d0 d0Var2 = hVar4.g;
                long j10 = gVar4.a;
                d0Var2.getClass();
                return;
            default:
                h hVar5 = this.b;
                g gVar5 = this.c;
                d0 d0Var3 = hVar5.g;
                long j11 = gVar5.a;
                synchronized (((e0.g) d0Var3.b).f) {
                    file = (File) ((HashMap) ((e0.g) d0Var3.b).g).remove(Long.valueOf(j11));
                }
                if (file != null) {
                    ((Handler) ((e0.g) d0Var3.b).d).post(new u0(d0Var3, j11, (me) d0Var3.a, file, 0));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c(h hVar, g gVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = hVar;
        this.c = gVar;
    }

    public /* synthetic */ c(h hVar, g gVar, Exception exc) {
        this.a = 3;
        this.b = hVar;
        this.c = gVar;
    }
}
