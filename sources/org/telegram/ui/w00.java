package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w00 extends org.telegram.ui.Components.c10 {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w00(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override // org.telegram.ui.Components.c10
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((j10) this.V).s;
            default:
                return ((h10) this.V).d.s;
        }
    }
}
