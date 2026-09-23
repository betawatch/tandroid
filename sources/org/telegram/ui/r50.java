package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class r50 implements org.telegram.ui.Components.w5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.w5
    public final void invalidate() {
        switch (this.a) {
            case 0:
                Iterator it = ((s50) this.b).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                i61 i61Var = (i61) this.b;
                i61Var.getClass();
                if (!zg.f0.b && i61Var.getParent() != null) {
                    ((View) i61Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
