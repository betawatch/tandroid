package xg;

import org.telegram.ui.Cells.c0;
import org.telegram.ui.bx;
import org.telegram.ui.uc1;
import wg.a0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ c(e eVar, int i7) {
        this.a = i7;
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
                bx bxVar = new bx(c0.l(3, "onlySelect", "dialogsType", true));
                bxVar.E2 = new uc1(28, eVar, sb3);
                eVar.e.presentFragment(bxVar);
                ((a0) eVar).r.dismiss();
                break;
        }
    }
}
