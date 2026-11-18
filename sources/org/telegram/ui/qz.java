package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
