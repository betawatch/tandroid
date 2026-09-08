package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class zv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ zv(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                uyVar.O1 = (Long) obj;
                uyVar.U4();
                break;
            default:
                uy.d0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
