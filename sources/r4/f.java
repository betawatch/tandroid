package r4;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.r;
import zf.x;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i10) {
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
                        bVar.d(r.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.c != 0) {
                        bVar.d(r.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
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
                x xVar = (x) this.b;
                if (xVar.F.get()) {
                    long j11 = xVar.b;
                    if (j11 == 0) {
                        xVar.b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        xVar.c = xVar.a;
                        xVar.f = xVar.e.getAndSet(0);
                        xVar.a = 0;
                        xVar.b = j10;
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
