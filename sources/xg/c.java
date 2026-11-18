package xg;

import org.telegram.ui.Cells.c0;
import org.telegram.ui.cx;
import org.telegram.ui.wc1;
import wg.b0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                cx cxVar = new cx(c0.l(3, "onlySelect", "dialogsType", true));
                cxVar.E2 = new wc1(28, eVar, sb3);
                eVar.e.presentFragment(cxVar);
                ((b0) eVar).r.dismiss();
                break;
        }
    }
}
