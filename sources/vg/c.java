package vg;

import org.telegram.messenger.w1;
import org.telegram.ui.uy;
import sg.x;
import ug.c0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
                uy uyVar = new uy(w1.e(3, "onlySelect", "dialogsType", true));
                uyVar.C2 = new x(8, eVar, sb3);
                eVar.e.presentFragment(uyVar);
                ((c0) eVar).r.dismiss();
                break;
        }
    }
}
