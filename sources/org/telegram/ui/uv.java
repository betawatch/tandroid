package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
