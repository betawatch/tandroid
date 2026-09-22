package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.q;
import yf.x;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                i iVar = (i) this.b;
                Rect rect = iVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.j = true;
                    iVar.o.set(rect);
                    iVar.a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.l = false;
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
