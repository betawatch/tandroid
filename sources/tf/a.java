package tf;

import ai.n4;
import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import li.h;
import yf.x;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ a(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        switch (this.a) {
            case 0:
                n4 n4Var = (n4) this.b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((pe.b) n4Var.b).iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    n4Var.forceLayout();
                }
            default:
                ((x) this.b).e.incrementAndGet();
                return;
        }
    }
}
