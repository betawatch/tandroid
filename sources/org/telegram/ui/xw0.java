package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xw0 implements org.telegram.messenger.kc {
    public final /* synthetic */ Runnable[] a;

    public xw0(Runnable[] runnableArr) {
        this.a = runnableArr;
    }

    @Override // org.telegram.messenger.kc
    public final void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (imageReceiver.I()) {
            Runnable[] runnableArr = this.a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.ch0 B = imageReceiver.B();
                if (B == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (B.y()) {
                    B.B0 = new pu0(runnableArr, 7);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override // org.telegram.messenger.kc
    public final /* synthetic */ void A(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.kc
    public final /* synthetic */ void O(int i7, Drawable drawable) {
    }
}
