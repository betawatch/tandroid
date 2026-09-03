package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                zn znVar = (zn) this.b;
                View view = (View) this.c;
                znVar.U7((URLSpan) obj, false, znVar.a5, view instanceof org.telegram.ui.Cells.s1 ? (org.telegram.ui.Cells.s1) view : null);
                return Boolean.TRUE;
            default:
                return eh.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
