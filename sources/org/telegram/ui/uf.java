package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                yn ynVar = (yn) this.b;
                View view = (View) this.c;
                ynVar.U7((URLSpan) obj, false, ynVar.b5, view instanceof org.telegram.ui.Cells.u1 ? (org.telegram.ui.Cells.u1) view : null);
                return Boolean.TRUE;
            default:
                return rh.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
