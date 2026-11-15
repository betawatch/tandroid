package yi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.le;
import org.telegram.messenger.u0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ i c;

    public /* synthetic */ c(j jVar, i iVar, int i7) {
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
                jVar.g.P0(iVar.a, iVar.b);
                return;
            case 1:
                j jVar2 = this.b;
                i iVar2 = this.c;
                k8.a aVar = jVar2.g;
                long j3 = iVar2.a;
                aVar.getClass();
                return;
            case 2:
                j jVar3 = this.b;
                i iVar3 = this.c;
                jVar3.g.P0(iVar3.a, iVar3.b);
                return;
            case 3:
                j jVar4 = this.b;
                i iVar4 = this.c;
                k8.a aVar2 = jVar4.g;
                long j10 = iVar4.a;
                aVar2.getClass();
                return;
            default:
                j jVar5 = this.b;
                i iVar5 = this.c;
                k8.a aVar3 = jVar5.g;
                long j11 = iVar5.a;
                synchronized (((e0.g) aVar3.c).f) {
                    file = (File) ((HashMap) ((e0.g) aVar3.c).g).remove(Long.valueOf(j11));
                }
                if (file != null) {
                    ((Handler) ((e0.g) aVar3.c).d).post(new u0(aVar3, j11, (le) aVar3.b, file, 0));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c(j jVar, i iVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = jVar;
        this.c = iVar;
    }

    public /* synthetic */ c(j jVar, i iVar, Exception exc) {
        this.a = 3;
        this.b = jVar;
        this.c = iVar;
    }
}
