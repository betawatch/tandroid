package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
