package wg;

import org.telegram.messenger.wh;
import org.telegram.ui.bh1;
import org.telegram.ui.ey;
import vg.b0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
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
                ey eyVar = new ey(wh.c(3, "onlySelect", "dialogsType", true));
                eyVar.C2 = new bh1(25, eVar, sb3);
                eVar.e.presentFragment(eyVar);
                ((b0) eVar).r.dismiss();
                break;
        }
    }
}
