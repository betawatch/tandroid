package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v50 implements org.telegram.ui.Components.w5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.w5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((w50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                s61 s61Var = (s61) this.b;
                s61Var.getClass();
                if (!ah.y0.b && s61Var.getParent() != null) {
                    ((View) s61Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
