package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;

    public /* synthetic */ wv(ty tyVar, int i10) {
        this.a = i10;
        this.b = tyVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ty tyVar = this.b;
                tyVar.O1 = (Long) obj;
                tyVar.R4();
                break;
            default:
                ty.a0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
