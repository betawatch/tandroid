package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zl extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ dm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl(dm dmVar) {
        super("p2", 0);
        this.b = dmVar;
    }

    @Override // org.telegram.ui.Components.q6
    public final void b(Object obj, float f9) {
        ((MessageObject.SendAnimationData) obj).currentX = f9;
        View view = this.b.b.M.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentX);
    }
}
