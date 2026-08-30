package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy b;

    public /* synthetic */ uv(oy oyVar, int i10) {
        this.a = i10;
        this.b = oyVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                oy oyVar = this.b;
                oyVar.L1 = (Long) obj;
                oyVar.U4();
                break;
            default:
                oy.c0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
