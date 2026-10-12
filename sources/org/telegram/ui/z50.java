package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class z50 implements org.telegram.ui.Components.y5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.y5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((a60) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                a71 a71Var = (a71) this.b;
                a71Var.getClass();
                if (!ah.x0.b && a71Var.getParent() != null) {
                    ((View) a71Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
