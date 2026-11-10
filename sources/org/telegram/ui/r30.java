package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r30 implements org.telegram.ui.Components.n5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r30(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.n5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((s30) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                d11 d11Var = (d11) this.b;
                d11Var.getClass();
                if (!ch.e0.b && d11Var.getParent() != null) {
                    ((View) d11Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
