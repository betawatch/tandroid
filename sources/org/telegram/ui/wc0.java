package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class wc0 extends org.telegram.ui.Components.qv0 {
    public final /* synthetic */ gd0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc0(gd0 gd0Var, Context context, org.telegram.ui.Components.iv0 iv0Var, gd0 gd0Var2, vc0 vc0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, iv0Var, 0, null, null, null, 8, 0, gd0Var2, vc0Var, 0, d6Var, null);
        this.f2 = gd0Var;
    }

    @Override // org.telegram.ui.Components.qv0
    public final int B0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.qv0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.qv0
    public final int S0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.qv0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f2.M0;
    }
}
