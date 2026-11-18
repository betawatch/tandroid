package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x9 extends EditTextBoldCursor {
    public final /* synthetic */ int M1;
    public final /* synthetic */ y9 N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x9(y9 y9Var, Context context, int i7) {
        super(context);
        this.M1 = i7;
        this.N1 = y9Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final org.telegram.ui.ActionBar.i6 getResourcesProvider() {
        switch (this.M1) {
        }
        return this.N1.d;
    }
}
