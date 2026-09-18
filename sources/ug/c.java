package ug;

import org.telegram.messenger.wh;
import org.telegram.ui.uy;
import tg.b0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
