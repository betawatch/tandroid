package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ uf(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                co coVar = this.b;
                MessageObject messageObject3 = coVar.d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(coVar.getParentActivity()), coVar.ea).k(false).j();
                }
                return true;
            case 1:
                return co.R0(this.b);
            default:
                co coVar2 = this.b;
                int i10 = coVar2.ob;
                if (i10 == 1 && (messageObject2 = coVar2.p5) != null) {
                    coVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                }
                if (coVar2.f5 == null || i10 != 2 || (messageObject = coVar2.n5) == null) {
                    return false;
                }
                coVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                return true;
        }
    }
}
