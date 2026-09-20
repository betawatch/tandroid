package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                if (!zg.e0.b && s61Var.getParent() != null) {
                    ((View) s61Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
