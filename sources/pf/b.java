package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import uh.i;
import uh.j;
import w7.q;
import xf.y;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        switch (this.a) {
            case 0:
                c cVar = (c) this.b;
                sf.a aVar = cVar.k;
                sf.a aVar2 = cVar.j;
                if (cVar.n) {
                    ArrayList arrayList = cVar.b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.l.postFrameCallback(cVar.m);
                    break;
                }
                break;
            case 1:
                ((Runnable) this.b).run();
                break;
            case 2:
                j jVar = (j) this.b;
                Rect rect = jVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - jVar.h > 32 && !jVar.j && !rect.isEmpty()) {
                    jVar.h = currentTimeMillis;
                    jVar.j = true;
                    jVar.o.set(rect);
                    jVar.a.postRunnable(new i(jVar, (jVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                jVar.l = false;
                break;
            default:
                y yVar = (y) this.b;
                if (yVar.F.get()) {
                    long j10 = yVar.b;
                    if (j10 == 0) {
                        yVar.b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        yVar.c = yVar.a;
                        yVar.f = yVar.e.getAndSet(0);
                        yVar.a = 0;
                        yVar.b = j3;
                    } else {
                        yVar.a++;
                    }
                    Choreographer.getInstance().postFrameCallback(yVar.d);
                    break;
                }
                break;
        }
    }
}
