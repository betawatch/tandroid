package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ uv(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                qy qyVar = this.b;
                qyVar.O1 = (Long) obj;
                qyVar.U4();
                break;
            default:
                qy.c0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
