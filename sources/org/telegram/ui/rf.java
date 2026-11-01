package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements org.telegram.messenger.s20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.s20
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                un unVar = (un) this.b;
                View view = (View) this.c;
                unVar.g8((URLSpan) obj, false, unVar.t5, view instanceof org.telegram.ui.Cells.q1 ? (org.telegram.ui.Cells.q1) view : null);
                return Boolean.TRUE;
            default:
                return jh.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
