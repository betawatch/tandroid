package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t00 extends org.telegram.ui.Components.e00 {
    public final /* synthetic */ int Q;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t00(Object obj, Context context, int i9) {
        super(context, null);
        this.Q = i9;
        this.R = obj;
    }

    @Override // org.telegram.ui.Components.e00
    public final int getColumnsCount() {
        switch (this.Q) {
            case 0:
                return ((f10) this.R).s;
            default:
                return ((d10) this.R).d.s;
        }
    }
}
