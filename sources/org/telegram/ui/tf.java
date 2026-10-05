package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ tf(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                yn ynVar = this.b;
                MessageObject messageObject3 = ynVar.b5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ynVar.getParentActivity()), ynVar.ca).k(false).j();
                }
                return true;
            case 1:
                return yn.P0(this.b);
            default:
                yn ynVar2 = this.b;
                int i10 = ynVar2.lb;
                if (i10 == 1 && (messageObject2 = ynVar2.n5) != null) {
                    ynVar2.D(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                }
                if (ynVar2.d5 == null || i10 != 2 || (messageObject = ynVar2.l5) == null) {
                    return false;
                }
                ynVar2.D(messageObject.getId(), 0, 0, 0, true, true);
                return true;
        }
    }
}
