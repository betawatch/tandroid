package ug;

import org.telegram.messenger.wh;
import org.telegram.ui.uy;
import tg.b0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                uy uyVar = new uy(wh.d(3, "onlySelect", "dialogsType", true));
                uyVar.C2 = new s5.e(7, eVar, sb3);
                eVar.e.presentFragment(uyVar);
                ((b0) eVar).r.dismiss();
                break;
        }
    }
}
