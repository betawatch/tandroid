package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.i;
import vh.j;
import w7.p;
import yf.x;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                        cVar.d(p.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.c != 0) {
                        cVar.d(p.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
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
                x xVar = (x) this.b;
                if (xVar.F.get()) {
                    long j10 = xVar.b;
                    if (j10 == 0) {
                        xVar.b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.c = xVar.a;
                        xVar.f = xVar.e.getAndSet(0);
                        xVar.a = 0;
                        xVar.b = j3;
                    } else {
                        xVar.a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    break;
                }
                break;
        }
    }
}
