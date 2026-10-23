package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class s00 extends org.telegram.ui.Components.b10 {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s00(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override // org.telegram.ui.Components.b10
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((e10) this.V).s;
            default:
                return ((c10) this.V).d.s;
        }
    }
}
