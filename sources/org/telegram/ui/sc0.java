package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sc0 extends org.telegram.ui.Components.yu0 {
    public final /* synthetic */ cd0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc0(cd0 cd0Var, Context context, org.telegram.ui.Components.qu0 qu0Var, cd0 cd0Var2, rc0 rc0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, qu0Var, 0, null, null, null, 8, 0, cd0Var2, rc0Var, 0, f6Var, null);
        this.c2 = cd0Var;
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
        return this.c2.J0;
    }
}
