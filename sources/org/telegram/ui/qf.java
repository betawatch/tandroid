package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                sn snVar = (sn) this.b;
                View view = (View) this.c;
                snVar.X7((URLSpan) obj, false, snVar.d5, view instanceof org.telegram.ui.Cells.u1 ? (org.telegram.ui.Cells.u1) view : null);
                return Boolean.TRUE;
            default:
                return sh.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
