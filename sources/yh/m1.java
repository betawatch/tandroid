package yh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ zf.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ m1(z3 z3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = z3Var;
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
        z3 z3Var = this.b;
        switch (i10) {
            case 0:
                z3Var.getClass();
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                z3Var.e0.setResellPrice(aVar);
                xh.c2 c2Var = z3Var.d1;
                if (c2Var != null) {
                    c2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                hg.c.s(R.string.Gift2ResaleEnable, new Object[]{z3Var.C1()}, z3Var.getBulletinFactory(), R.raw.contact_check, 36);
                break;
            default:
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                z3Var.e0.setResellPrice(aVar);
                xh.c2 c2Var2 = z3Var.d1;
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
