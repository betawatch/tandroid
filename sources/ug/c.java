package ug;

import org.telegram.messenger.bi;
import org.telegram.ui.ty;
import qg.x1;
import tg.b0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                ty tyVar = new ty(bi.d(3, "onlySelect", "dialogsType", true));
                tyVar.C2 = new x1(12, eVar, sb3);
                eVar.e.presentFragment(tyVar);
                ((b0) eVar).r.dismiss();
                break;
        }
    }
}
