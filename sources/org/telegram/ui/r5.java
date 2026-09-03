package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r5 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;

    public /* synthetic */ r5(a6 a6Var, int i10) {
        this.a = i10;
        this.b = a6Var;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.P = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(18, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
