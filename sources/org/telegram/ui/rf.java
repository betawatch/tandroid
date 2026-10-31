package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.r20
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                un unVar = (un) this.b;
                View view = (View) this.c;
                unVar.c8((URLSpan) obj, false, unVar.t5, view instanceof org.telegram.ui.Cells.q1 ? (org.telegram.ui.Cells.q1) view : null);
                return Boolean.TRUE;
            default:
                return jh.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
