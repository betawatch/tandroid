package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ vv(ry ryVar, int i10) {
        this.a = i10;
        this.b = ryVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ry ryVar = this.b;
                ryVar.O1 = (Long) obj;
                ryVar.U4();
                break;
            default:
                ry.c0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
