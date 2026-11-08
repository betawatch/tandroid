package rh;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
import r0.b0;
import r0.i0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ g(h hVar, int i7) {
        this.a = i7;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        h hVar = this.b;
        switch (i7) {
            case 0:
                if (hVar.w != 0) {
                    hVar.i(false);
                    break;
                }
                break;
            default:
                int i10 = hVar.G - 1;
                hVar.G = i10;
                if (i10 == 0) {
                    View view = hVar.E;
                    RectF rectF = d.e;
                    WeakHashMap weakHashMap = i0.a;
                    hVar.k(d.e1(b0.a(view), view, view.getRootView()), false);
                    break;
                }
                break;
        }
    }
}
