package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yl extends org.telegram.ui.Components.q6 {
    @Override // org.telegram.ui.Components.q6
    public final void b(Object obj, float f9) {
        ((MessageObject.SendAnimationData) obj).currentScale = f9;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentScale);
    }
}
