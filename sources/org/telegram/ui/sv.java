package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ sv(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                uyVar.O1 = (Long) obj;
                uyVar.d5();
                break;
            default:
                uy.c0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
