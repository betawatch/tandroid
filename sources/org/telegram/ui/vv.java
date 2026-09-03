package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ vv(py pyVar, int i10) {
        this.a = i10;
        this.b = pyVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                py pyVar = this.b;
                pyVar.L1 = (Long) obj;
                pyVar.U4();
                break;
            default:
                py.c0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
