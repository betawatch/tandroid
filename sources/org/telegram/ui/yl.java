package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yl extends org.telegram.ui.Components.l6 {
    public final /* synthetic */ cm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(cm cmVar) {
        super("p2", 0);
        this.b = cmVar;
    }

    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).currentX = f10;
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
