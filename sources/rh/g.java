package rh;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
import r0.b0;
import r0.i0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
