package xg;

import org.telegram.ui.Cells.f1;
import org.telegram.ui.web.a0;
import org.telegram.ui.zw;
import wg.b0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                zw zwVar = new zw(f1.h(3, "onlySelect", "dialogsType", true));
                zwVar.D2 = new a0(25, fVar, sb3);
                fVar.e.presentFragment(zwVar);
                ((b0) fVar).r.dismiss();
                break;
        }
    }
}
