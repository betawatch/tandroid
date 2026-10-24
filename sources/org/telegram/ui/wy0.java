package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class wy0 extends org.telegram.ui.Components.oi0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, ly0 ly0Var, vy0 vy0Var, org.telegram.ui.Components.ji0 ji0Var, org.telegram.ui.Components.fi0 fi0Var) {
        super(context, j10, kVar, ly0Var, vy0Var, ji0Var, fi0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.oi0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.p5 = f7;
        profileActivity.D3();
    }
}
