package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ qf(zn znVar, int i10) {
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
                MessageObject messageObject3 = znVar.a5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(znVar.getParentActivity()), znVar.ba).k(false).j();
                }
                return true;
            case 1:
                return zn.R0(this.b);
            default:
                zn znVar2 = this.b;
                int i10 = znVar2.lb;
                if (i10 == 1 && (messageObject2 = znVar2.m5) != null) {
                    znVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                }
                if (znVar2.c5 == null || i10 != 2 || (messageObject = znVar2.k5) == null) {
                    return false;
                }
                znVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                return true;
        }
    }
}
