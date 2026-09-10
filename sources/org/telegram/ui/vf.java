package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ vf(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                eo eoVar = this.b;
                MessageObject messageObject3 = eoVar.d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(eoVar.getParentActivity()), eoVar.ea).k(false).j();
                }
                return true;
            case 1:
                return eo.R0(this.b);
            default:
                eo eoVar2 = this.b;
                int i10 = eoVar2.ob;
                if (i10 == 1 && (messageObject2 = eoVar2.p5) != null) {
                    eoVar2.E(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                }
                if (eoVar2.f5 == null || i10 != 2 || (messageObject = eoVar2.n5) == null) {
                    return false;
                }
                eoVar2.E(messageObject.getId(), 0, 0, 0, true, true);
                return true;
        }
    }
}
