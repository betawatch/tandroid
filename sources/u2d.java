// default package

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class u2d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v2d b;

    public /* synthetic */ u2d(v2d v2dVar, byte b) {
        this.a = b;
        this.b = v2dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v2d v2dVar = this.b;
        switch (b) {
            case 0:
                if (v2dVar.w != 0) {
                    v2dVar.i(false);
                    break;
                }
                break;
            default:
                int i = v2dVar.H - 1;
                v2dVar.H = i;
                if (i == 0) {
                    View view = v2dVar.F;
                    RectF rectF = j1d.e;
                    WeakHashMap weakHashMap = ihc.a;
                    v2dVar.k(j1d.a(bhc.a(view), view, view.getRootView()), false);
                    break;
                }
                break;
        }
    }
}
