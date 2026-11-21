package org.telegram.ui;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
