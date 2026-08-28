package xg;

import android.graphics.RectF;
import android.view.View;
import r0.j0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ h(i iVar, int i9) {
        this.a = i9;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        i iVar = this.b;
        switch (i9) {
            case 0:
                if (iVar.v != 0) {
                    iVar.h(false);
                    break;
                }
                break;
            default:
                int i10 = iVar.C - 1;
                iVar.C = i10;
                if (i10 == 0) {
                    View view = iVar.A;
                    RectF rectF = e.e;
                    iVar.j(e.Q(j0.f(view), view, view.getRootView()), false);
                    break;
                }
                break;
        }
    }
}
