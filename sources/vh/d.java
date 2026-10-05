package vh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ d(f fVar, int i10) {
        this.a = i10;
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f fVar = this.b;
                if (fVar.j.isEmpty()) {
                    fVar.i = true;
                    f.n = null;
                    e eVar = fVar.f;
                    if (eVar != null) {
                        eVar.a = false;
                        fVar.f = null;
                    }
                    fVar.d.removeView(fVar.e);
                    if (fVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) fVar.d.getParent()).removeView(fVar.d);
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
