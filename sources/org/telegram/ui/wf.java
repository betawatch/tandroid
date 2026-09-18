package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ wf(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                bo boVar = this.b;
                MessageObject messageObject3 = boVar.d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(boVar.getParentActivity()), boVar.ea).k(false).j();
                }
                return true;
            case 1:
                return bo.R0(this.b);
            default:
                bo boVar2 = this.b;
                int i10 = boVar2.nb;
                if (i10 == 1 && (messageObject2 = boVar2.p5) != null) {
                    boVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                }
                if (boVar2.f5 == null || i10 != 2 || (messageObject = boVar2.n5) == null) {
                    return false;
                }
                boVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                return true;
        }
    }
}
