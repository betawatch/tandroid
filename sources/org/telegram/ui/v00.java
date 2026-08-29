package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v00 extends org.telegram.ui.Components.p00 {
    public final /* synthetic */ int Q;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v00(Object obj, Context context, int i10) {
        super(context, null);
        this.Q = i10;
        this.R = obj;
    }

    @Override // org.telegram.ui.Components.p00
    public final int getColumnsCount() {
        switch (this.Q) {
            case 0:
                return ((h10) this.R).s;
            default:
                return ((f10) this.R).d.s;
        }
    }
}
