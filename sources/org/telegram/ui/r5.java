package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r5 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ r5(z5 z5Var, int i10) {
        this.a = i10;
        this.b = z5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.S = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            default:
                AndroidUtilities.runOnUIThread(new i0(3, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
