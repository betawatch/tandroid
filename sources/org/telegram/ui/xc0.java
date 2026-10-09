package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xc0 extends org.telegram.ui.Components.bw0 {
    public final /* synthetic */ hd0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc0(hd0 hd0Var, Context context, org.telegram.ui.Components.tv0 tv0Var, hd0 hd0Var2, wc0 wc0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0L, tv0Var, 0, null, null, null, 8, 0, hd0Var2, wc0Var, 0, e6Var, null);
        this.f2 = hd0Var;
    }

    @Override // org.telegram.ui.Components.bw0
    public final int B0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.bw0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.bw0
    public final int S0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.bw0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f2.M0;
    }
}
