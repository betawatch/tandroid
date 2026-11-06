package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class x9 extends EditTextBoldCursor {
    public final /* synthetic */ int G1;
    public final /* synthetic */ y9 H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x9(y9 y9Var, Context context, int i7) {
        super(context);
        this.G1 = i7;
        this.H1 = y9Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        switch (this.G1) {
        }
        return this.H1.d;
    }
}
