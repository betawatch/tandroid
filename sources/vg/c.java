package vg;

import org.telegram.messenger.v0;
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.ey;
import ug.z;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                ey eyVar = new ey(v0.e(3, "onlySelect", "dialogsType", true));
                eyVar.C2 = new e8(21, eVar, sb3);
                eVar.e.presentFragment(eyVar);
                ((z) eVar).r.dismiss();
                break;
        }
    }
}
