package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w00 extends org.telegram.ui.Components.h00 {
    public final /* synthetic */ int Q;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w00(Object obj, Context context, int i10) {
        super(context, null);
        this.Q = i10;
        this.R = obj;
    }

    @Override // org.telegram.ui.Components.h00
    public final int getColumnsCount() {
        switch (this.Q) {
            case 0:
                return ((i10) this.R).s;
            default:
                return ((g10) this.R).d.s;
        }
    }
}
