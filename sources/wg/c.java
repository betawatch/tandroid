package wg;

import org.telegram.messenger.vh;
import org.telegram.ui.cy;
import org.telegram.ui.zg1;
import vg.b0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
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
                cy cyVar = new cy(vh.c(3, "onlySelect", "dialogsType", true));
                cyVar.C2 = new zg1(25, eVar, sb3);
                eVar.e.presentFragment(cyVar);
                ((b0) eVar).r.dismiss();
                break;
        }
    }
}
