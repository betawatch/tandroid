package yi;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;
import jb.m;
import org.telegram.messenger.ke;
import org.telegram.messenger.u0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                jVar.g.B0(hVar.a, hVar.b);
                return;
            case 1:
                j jVar2 = this.b;
                h hVar2 = this.c;
                m mVar = jVar2.g;
                long j3 = hVar2.a;
                mVar.getClass();
                return;
            case 2:
                j jVar3 = this.b;
                h hVar3 = this.c;
                jVar3.g.B0(hVar3.a, hVar3.b);
                return;
            case 3:
                j jVar4 = this.b;
                h hVar4 = this.c;
                m mVar2 = jVar4.g;
                long j10 = hVar4.a;
                mVar2.getClass();
                return;
            default:
                j jVar5 = this.b;
                h hVar5 = this.c;
                m mVar3 = jVar5.g;
                long j11 = hVar5.a;
                synchronized (((e0.g) mVar3.c).f) {
                    file = (File) ((HashMap) ((e0.g) mVar3.c).g).remove(Long.valueOf(j11));
                }
                if (file != null) {
                    ((Handler) ((e0.g) mVar3.c).d).post(new u0(mVar3, j11, (ke) mVar3.b, file, 0));
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
