package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
