package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yw0 implements org.telegram.messenger.lc {
    public final /* synthetic */ Runnable[] a;

    public yw0(Runnable[] runnableArr) {
        this.a = runnableArr;
    }

    @Override // org.telegram.messenger.lc
    public final void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        if (imageReceiver.I()) {
            Runnable[] runnableArr = this.a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.zg0 B = imageReceiver.B();
                if (B == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (B.y()) {
                    B.A0 = new ru0(runnableArr, 7);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override // org.telegram.messenger.lc
    public final /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.lc
    public final /* synthetic */ void t0(int i7, Drawable drawable) {
    }
}
