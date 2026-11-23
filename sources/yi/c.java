package yi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.le;
import org.telegram.messenger.u0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ h c;

    public /* synthetic */ c(j jVar, h hVar, int i7) {
        this.a = 4;
        this.b = jVar;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        switch (this.a) {
            case 0:
                j jVar = this.b;
                h hVar = this.c;
                jVar.g.K0(hVar.a, hVar.b);
                return;
            case 1:
                j jVar2 = this.b;
                h hVar2 = this.c;
                k8.a aVar = jVar2.g;
                long j3 = hVar2.a;
                aVar.getClass();
                return;
            case 2:
                j jVar3 = this.b;
                h hVar3 = this.c;
                jVar3.g.K0(hVar3.a, hVar3.b);
                return;
            case 3:
                j jVar4 = this.b;
                h hVar4 = this.c;
                k8.a aVar2 = jVar4.g;
                long j10 = hVar4.a;
                aVar2.getClass();
                return;
            default:
                j jVar5 = this.b;
                h hVar5 = this.c;
                k8.a aVar3 = jVar5.g;
                long j11 = hVar5.a;
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

    public /* synthetic */ c(j jVar, h hVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = jVar;
        this.c = hVar;
    }

    public /* synthetic */ c(j jVar, h hVar, Exception exc) {
        this.a = 3;
        this.b = jVar;
        this.c = hVar;
    }
}
