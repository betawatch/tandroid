package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                co coVar = (co) this.b;
                View view = (View) this.c;
                coVar.U7((URLSpan) obj, false, coVar.d5, view instanceof org.telegram.ui.Cells.t1 ? (org.telegram.ui.Cells.t1) view : null);
                return Boolean.TRUE;
            default:
                return sh.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
