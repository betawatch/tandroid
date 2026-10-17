package vg;

import org.telegram.messenger.wh;
import org.telegram.ui.ey;
import org.telegram.ui.web.c0;
import ug.z;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                ey eyVar = new ey(wh.d(3, "onlySelect", "dialogsType", true));
                eyVar.C2 = new c0(18, eVar, sb3);
                eVar.e.presentFragment(eyVar);
                ((z) eVar).r.dismiss();
                break;
        }
    }
}
