package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class zc0 extends org.telegram.ui.Components.kv0 {
    public final /* synthetic */ jd0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc0(jd0 jd0Var, Context context, org.telegram.ui.Components.cv0 cv0Var, jd0 jd0Var2, yc0 yc0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0L, cv0Var, 0, null, null, null, 8, 0, jd0Var2, yc0Var, 0, e6Var, null);
        this.f2 = jd0Var;
    }

    @Override // org.telegram.ui.Components.kv0
    public final int B0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.kv0
    public final int S0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.kv0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f2.M0;
    }
}
