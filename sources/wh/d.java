package wh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ d(g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                if (gVar.j.isEmpty()) {
                    gVar.i = true;
                    g.n = null;
                    f fVar = gVar.f;
                    if (fVar != null) {
                        fVar.a = false;
                        gVar.f = null;
                    }
                    gVar.d.removeView(gVar.e);
                    if (gVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) gVar.d.getParent()).removeView(gVar.d);
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = this.b.j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                break;
        }
    }
}
