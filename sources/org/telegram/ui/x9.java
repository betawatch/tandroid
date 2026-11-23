package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
    public final org.telegram.ui.ActionBar.h6 getResourcesProvider() {
        switch (this.M1) {
        }
        return this.N1.d;
    }
}
