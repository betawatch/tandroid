package vg;

import org.telegram.messenger.sk;
import org.telegram.ui.web.o0;
import org.telegram.ui.yy;
import ug.b0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                yy yyVar = new yy(sk.d(3, "onlySelect", "dialogsType", true));
                yyVar.C2 = new o0(17, eVar, sb3);
                eVar.e.presentFragment(yyVar);
                ((b0) eVar).r.dismiss();
                break;
        }
    }
}
