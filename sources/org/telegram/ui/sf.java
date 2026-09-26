package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ sf(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                MessageObject messageObject3 = wnVar.d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.ea).k(false).j();
                }
                return true;
            case 1:
                return wn.s0(this.b);
            default:
                wn wnVar2 = this.b;
                int i10 = wnVar2.nb;
                if (i10 == 1 && (messageObject2 = wnVar2.p5) != null) {
                    wnVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                }
                if (wnVar2.f5 == null || i10 != 2 || (messageObject = wnVar2.n5) == null) {
                    return false;
                }
                wnVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                return true;
        }
    }
}
