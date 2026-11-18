package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r30 implements org.telegram.ui.Components.u5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r30(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.u5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((s30) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                b11 b11Var = (b11) this.b;
                b11Var.getClass();
                if (!ch.f0.b && b11Var.getParent() != null) {
                    ((View) b11Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
