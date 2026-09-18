package yh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ zf.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ m1(a4 a4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = a4Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        zf.b bVar = zf.b.a;
        zf.b bVar2 = zf.b.b;
        Runnable runnable = this.e;
        zf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        a4 a4Var = this.b;
        switch (i10) {
            case 0:
                a4Var.getClass();
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                a4Var.e0.setResellPrice(aVar);
                xh.c2 c2Var = a4Var.d1;
                if (c2Var != null) {
                    c2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                hg.k0.s(R.string.Gift2ResaleEnable, new Object[]{a4Var.C1()}, a4Var.getBulletinFactory(), R.raw.contact_check, 36);
                break;
            default:
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                a4Var.e0.setResellPrice(aVar);
                xh.c2 c2Var2 = a4Var.d1;
                if (c2Var2 != null) {
                    c2Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
