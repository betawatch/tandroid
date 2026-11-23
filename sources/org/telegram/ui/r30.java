package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r30 implements org.telegram.ui.Components.v5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r30(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.v5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((s30) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                c11 c11Var = (c11) this.b;
                c11Var.getClass();
                if (!ch.f0.b && c11Var.getParent() != null) {
                    ((View) c11Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
