package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class qz extends org.telegram.ui.Components.wz {
    public final /* synthetic */ int V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz(int i7, Context context, Object obj) {
        super(context, null);
        this.V = i7;
        this.W = obj;
    }

    @Override // org.telegram.ui.Components.wz
    public final int getColumnsCount() {
        switch (this.V) {
            case 0:
                return ((c00) this.W).s;
            default:
                return ((a00) this.W).d.s;
        }
    }
}
