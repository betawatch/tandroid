package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t50 implements org.telegram.ui.Components.w5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.w5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((u50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                j61 j61Var = (j61) this.b;
                j61Var.getClass();
                if (!zg.c0.b && j61Var.getParent() != null) {
                    ((View) j61Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
