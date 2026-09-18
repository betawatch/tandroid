package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w50 implements org.telegram.ui.Components.u5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.u5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((x50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                r61 r61Var = (r61) this.b;
                r61Var.getClass();
                if (!zg.f0.b && r61Var.getParent() != null) {
                    ((View) r61Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
