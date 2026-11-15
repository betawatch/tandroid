package xg;

import org.telegram.ui.Cells.y0;
import org.telegram.ui.yw;
import wg.z;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ c(f fVar, int i7) {
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
                yw ywVar = new yw(y0.j(3, "onlySelect", "dialogsType", true));
                ywVar.E2 = new d(fVar, sb3);
                fVar.e.presentFragment(ywVar);
                ((z) fVar).r.dismiss();
                break;
        }
    }
}
