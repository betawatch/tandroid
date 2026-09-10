package tg;

import org.telegram.messenger.a2;
import org.telegram.ui.wy;
import sg.b0;
import sg.f0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                wy wyVar = new wy(a2.e(3, "onlySelect", "dialogsType", true));
                wyVar.C2 = new f0(1, eVar, sb3);
                eVar.e.presentFragment(wyVar);
                ((b0) eVar).r.dismiss();
                break;
        }
    }
}
