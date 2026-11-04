package sh;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
import r0.b0;
import r0.i0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ g(h hVar, int i3) {
        this.a = i3;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        h hVar = this.b;
        switch (i3) {
            case 0:
                if (hVar.w != 0) {
                    hVar.i(false);
                    break;
                }
                break;
            default:
                int i10 = hVar.H - 1;
                hVar.H = i10;
                if (i10 == 0) {
                    View view = hVar.F;
                    RectF rectF = d.e;
                    WeakHashMap weakHashMap = i0.a;
                    hVar.k(d.e1(b0.a(view), view, view.getRootView()), false);
                    break;
                }
                break;
        }
    }
}
