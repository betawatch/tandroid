package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class sc0 extends org.telegram.ui.Components.jv0 {
    public final /* synthetic */ cd0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc0(cd0 cd0Var, Context context, org.telegram.ui.Components.bv0 bv0Var, cd0 cd0Var2, rc0 rc0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, bv0Var, 0, null, null, null, 8, 0, cd0Var2, rc0Var, 0, d6Var, null);
        this.f2 = cd0Var;
    }

    @Override // org.telegram.ui.Components.jv0
    public final int B0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.jv0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.jv0
    public final int S0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.jv0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f2.M0;
    }
}
