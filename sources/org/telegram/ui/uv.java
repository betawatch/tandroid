package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
