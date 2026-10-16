package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
