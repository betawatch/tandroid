package ug;

import org.telegram.messenger.z0;
import org.telegram.ui.ry;
import tg.c0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                ry ryVar = new ry(z0.e(3, "onlySelect", "dialogsType", true));
                ryVar.C2 = new tg.d(7, eVar, sb3);
                eVar.e.presentFragment(ryVar);
                ((c0) eVar).r.dismiss();
                break;
        }
    }
}
