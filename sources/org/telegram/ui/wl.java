package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wl extends org.telegram.ui.Components.l6 {
    @Override // org.telegram.ui.Components.l6
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).currentScale = f10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentScale);
    }
}
