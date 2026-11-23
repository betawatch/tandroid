package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zw0 implements org.telegram.messenger.jc {
    public final /* synthetic */ Runnable[] a;

    public zw0(Runnable[] runnableArr) {
        this.a = runnableArr;
    }

    @Override // org.telegram.messenger.jc
    public final void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (imageReceiver.J()) {
            Runnable[] runnableArr = this.a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.nh0 C = imageReceiver.C();
                if (C == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (C.y()) {
                    C.B0 = new qu0(runnableArr, 7);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override // org.telegram.messenger.jc
    public final /* synthetic */ void r(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.jc
    public final /* synthetic */ void J(int i7, Drawable drawable) {
    }
}
