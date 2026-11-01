package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y9 extends EditTextBoldCursor {
    public final /* synthetic */ int G1;
    public final /* synthetic */ z9 H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9(z9 z9Var, Context context, int i10) {
        super(context);
        this.G1 = i10;
        this.H1 = z9Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.p6 getResourcesProvider() {
        switch (this.G1) {
        }
        return this.H1.d;
    }
}
