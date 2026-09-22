package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u50 implements org.telegram.ui.Components.u5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.u5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((v50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                q61 q61Var = (q61) this.b;
                q61Var.getClass();
                if (!zg.f0.b && q61Var.getParent() != null) {
                    ((View) q61Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
