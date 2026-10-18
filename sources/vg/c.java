package vg;

import org.telegram.messenger.lk;
import org.telegram.ui.ey;
import org.telegram.ui.web.n;
import ug.a0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                ey eyVar = new ey(lk.d(3, "onlySelect", "dialogsType", true));
                eyVar.C2 = new n(19, eVar, sb3);
                eVar.e.presentFragment(eyVar);
                ((a0) eVar).r.dismiss();
                break;
        }
    }
}
