package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xl extends org.telegram.ui.Components.l6 {
    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).currentScale = f10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentScale);
    }
}
