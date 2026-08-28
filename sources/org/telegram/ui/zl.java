package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zl extends org.telegram.ui.Components.l6 {
    public final /* synthetic */ am b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl(am amVar) {
        super("alpha", 0);
        this.b = amVar;
    }

    @Override // org.telegram.ui.Components.l6
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).timeAlpha = f10;
        View view = this.b.b.M.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).timeAlpha);
    }
}
