package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s50 implements org.telegram.ui.Components.y5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.y5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((t50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                t61 t61Var = (t61) this.b;
                t61Var.getClass();
                if (!zg.d0.b && t61Var.getParent() != null) {
                    ((View) t61Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
