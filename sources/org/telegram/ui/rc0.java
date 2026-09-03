package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rc0 extends org.telegram.ui.Components.yu0 {
    public final /* synthetic */ bd0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc0(bd0 bd0Var, Context context, org.telegram.ui.Components.qu0 qu0Var, bd0 bd0Var2, qc0 qc0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0L, qu0Var, 0, null, null, null, 8, 0, bd0Var2, qc0Var, 0, g6Var, null);
        this.c2 = bd0Var;
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
