package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ vf(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                MessageObject messageObject3 = znVar.d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.kb.a(znVar.getParentActivity()), znVar.ea).k(false).j();
                }
                return true;
            case 1:
                return zn.t0(this.b);
            default:
                zn znVar2 = this.b;
                int i10 = znVar2.nb;
                if (i10 == 1 && (messageObject2 = znVar2.p5) != null) {
                    znVar2.E(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                }
                if (znVar2.f5 == null || i10 != 2 || (messageObject = znVar2.n5) == null) {
                    return false;
                }
                znVar2.E(messageObject.getId(), 0, 0, 0, true, true);
                return true;
        }
    }
}
