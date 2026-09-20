package ug;

import org.telegram.messenger.rk;
import org.telegram.ui.uy;
import tg.b0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                uy uyVar = new uy(rk.e(3, "onlySelect", "dialogsType", true));
                uyVar.C2 = new s5.e(7, eVar, sb3);
                eVar.e.presentFragment(uyVar);
                ((b0) eVar).r.dismiss();
                break;
        }
    }
}
