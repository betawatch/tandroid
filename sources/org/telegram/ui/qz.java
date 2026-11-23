package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class qz extends org.telegram.ui.Components.yz {
    public final /* synthetic */ int V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz(int i7, Context context, Object obj) {
        super(context, null);
        this.V = i7;
        this.W = obj;
    }

    @Override // org.telegram.ui.Components.yz
    public final int getColumnsCount() {
        switch (this.V) {
            case 0:
                return ((c00) this.W).s;
            default:
                return ((a00) this.W).d.s;
        }
    }
}
