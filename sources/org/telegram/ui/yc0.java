package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class yc0 extends org.telegram.ui.Components.xu0 {
    public final /* synthetic */ id0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc0(id0 id0Var, Context context, org.telegram.ui.Components.pu0 pu0Var, id0 id0Var2, xc0 xc0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, pu0Var, 0, null, null, null, 8, 0, id0Var2, xc0Var, 0, f6Var, null);
        this.f2 = id0Var;
    }

    @Override // org.telegram.ui.Components.xu0
    public final int B0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.xu0
    public final int S0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.xu0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f2.M0;
    }
}
