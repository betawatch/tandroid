package vi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import m2.t;
import org.telegram.messenger.ge;
import org.telegram.messenger.u0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ i c;

    public /* synthetic */ c(j jVar, i iVar, int i3) {
        this.a = 4;
        this.b = jVar;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        switch (this.a) {
            case 0:
                j jVar = this.b;
                i iVar = this.c;
                jVar.g.C0(iVar.a, iVar.b);
                return;
            case 1:
                j jVar2 = this.b;
                i iVar2 = this.c;
                t tVar = jVar2.g;
                long j10 = iVar2.a;
                tVar.getClass();
                return;
            case 2:
                j jVar3 = this.b;
                i iVar3 = this.c;
                jVar3.g.C0(iVar3.a, iVar3.b);
                return;
            case 3:
                j jVar4 = this.b;
                i iVar4 = this.c;
                t tVar2 = jVar4.g;
                long j11 = iVar4.a;
                tVar2.getClass();
                return;
            default:
                j jVar5 = this.b;
                i iVar5 = this.c;
                t tVar3 = jVar5.g;
                long j12 = iVar5.a;
                synchronized (((e0.g) tVar3.c).f) {
                    file = (File) ((HashMap) ((e0.g) tVar3.c).g).remove(Long.valueOf(j12));
                }
                if (file != null) {
                    ((Handler) ((e0.g) tVar3.c).d).post(new u0(tVar3, j12, (ge) tVar3.b, file, 0));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c(j jVar, i iVar, long j10, long j11, int i3) {
        this.a = i3;
        this.b = jVar;
        this.c = iVar;
    }

    public /* synthetic */ c(j jVar, i iVar, Exception exc) {
        this.a = 3;
        this.b = jVar;
        this.c = iVar;
    }
}
