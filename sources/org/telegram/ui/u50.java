package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class u50 implements org.telegram.ui.Components.v5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.v5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((v50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                s61 s61Var = (s61) this.b;
                s61Var.getClass();
                if (!zg.f0.b && s61Var.getParent() != null) {
                    ((View) s61Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
