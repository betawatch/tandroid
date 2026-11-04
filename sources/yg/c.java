package yg;

import org.telegram.ui.Cells.f1;
import org.telegram.ui.na1;
import org.telegram.ui.uw;
import xg.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ c(e eVar, int i3) {
        this.a = i3;
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
                uw uwVar = new uw(f1.l(3, "onlySelect", "dialogsType", true));
                uwVar.D2 = new na1(27, eVar, sb3);
                eVar.e.presentFragment(uwVar);
                ((b0) eVar).r.dismiss();
                break;
        }
    }
}
