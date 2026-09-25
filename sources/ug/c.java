package ug;

import org.telegram.messenger.ok;
import org.telegram.ui.qy;
import tg.b0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ c(e eVar, int i10) {
        this.a = i10;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.E();
                break;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                qy qyVar = new qy(ok.e(3, "onlySelect", "dialogsType", true));
                qyVar.C2 = new s5.e(8, eVar, sb3);
                eVar.e.presentFragment(qyVar);
                ((b0) eVar).r.dismiss();
                break;
        }
    }
}
