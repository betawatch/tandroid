package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class yc0 extends org.telegram.ui.Components.yu0 {
    public final /* synthetic */ id0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc0(id0 id0Var, Context context, org.telegram.ui.Components.qu0 qu0Var, id0 id0Var2, xc0 xc0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0L, qu0Var, 0, null, null, null, 8, 0, id0Var2, xc0Var, 0, e6Var, null);
        this.f2 = id0Var;
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
