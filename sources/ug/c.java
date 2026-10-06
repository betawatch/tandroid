package ug;

import org.telegram.messenger.bi;
import org.telegram.ui.uy;
import rg.x;
import tg.b0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                uy uyVar = new uy(bi.d(3, "onlySelect", "dialogsType", true));
                uyVar.C2 = new x(9, eVar, sb3);
                eVar.e.presentFragment(uyVar);
                ((b0) eVar).r.dismiss();
                break;
        }
    }
}
