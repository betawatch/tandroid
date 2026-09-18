package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                bo boVar = (bo) this.b;
                View view = (View) this.c;
                boVar.U7((URLSpan) obj, false, boVar.d5, view instanceof org.telegram.ui.Cells.t1 ? (org.telegram.ui.Cells.t1) view : null);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
