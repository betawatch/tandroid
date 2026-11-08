package xg;

import org.telegram.ui.Cells.f1;
import org.telegram.ui.web.a0;
import org.telegram.ui.ww;
import wg.b0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ d(f fVar, int i7) {
        this.a = i7;
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.E();
                break;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                f fVar = this.b;
                sb2.append(fVar.h);
                String sb3 = sb2.toString();
                ww wwVar = new ww(f1.h(3, "onlySelect", "dialogsType", true));
                wwVar.C2 = new a0(25, fVar, sb3);
                fVar.e.presentFragment(wwVar);
                ((b0) fVar).r.dismiss();
                break;
        }
    }
}
