package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                wn wnVar = (wn) this.b;
                View view = (View) this.c;
                wnVar.U7((URLSpan) obj, false, wnVar.d5, view instanceof org.telegram.ui.Cells.u1 ? (org.telegram.ui.Cells.u1) view : null);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
