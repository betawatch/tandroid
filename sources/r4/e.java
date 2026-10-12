package r4;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.s;
import zf.y;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                break;
            case 1:
                rf.b bVar = (rf.b) this.b;
                uf.a aVar = bVar.k;
                uf.a aVar2 = bVar.j;
                if (bVar.n) {
                    ArrayList arrayList = bVar.b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        rf.e eVar = ((tf.e) ((sf.b) obj)).f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.c != 0) {
                        bVar.d(s.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.c != 0) {
                        bVar.d(s.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.l.postFrameCallback(bVar.m);
                    break;
                }
                break;
            case 2:
                wh.i iVar = (wh.i) this.b;
                Rect rect = iVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.j = true;
                    iVar.o.set(rect);
                    iVar.a.postRunnable(new wh.h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.l = false;
                break;
            default:
                y yVar = (y) this.b;
                if (yVar.F.get()) {
                    long j11 = yVar.b;
                    if (j11 == 0) {
                        yVar.b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        yVar.c = yVar.a;
                        yVar.f = yVar.e.getAndSet(0);
                        yVar.a = 0;
                        yVar.b = j10;
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
