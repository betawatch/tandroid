package org.telegram.ui;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc b;

    public /* synthetic */ zb(vc vcVar, int i10) {
        this.a = i10;
        this.b = vcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vc.U(this.b);
                break;
            default:
                j7.l1.v(R.string.ChannelWallpaperUpdated, org.telegram.ui.Components.tc.a0(this.b), R.raw.done, 36);
                break;
        }
    }
}
