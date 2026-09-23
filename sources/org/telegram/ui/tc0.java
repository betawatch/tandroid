package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class tc0 extends org.telegram.ui.Components.yu0 {
    public final /* synthetic */ dd0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc0(dd0 dd0Var, Context context, org.telegram.ui.Components.qu0 qu0Var, dd0 dd0Var2, sc0 sc0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, qu0Var, 0, null, null, null, 8, 0, dd0Var2, sc0Var, 0, d6Var, null);
        this.f2 = dd0Var;
    }

    @Override // org.telegram.ui.Components.yu0
    public final int B0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.yu0
    public final int S0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.yu0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f2.M0;
    }
}
