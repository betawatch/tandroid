package yh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ zf.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ m1(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = x3Var;
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
        x3 x3Var = this.b;
        switch (i10) {
            case 0:
                x3Var.getClass();
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                x3Var.e0.setResellPrice(aVar);
                xh.d2 d2Var = x3Var.d1;
                if (d2Var != null) {
                    d2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                hg.c.q(R.string.Gift2ResaleEnable, new Object[]{x3Var.C1()}, x3Var.getBulletinFactory(), R.raw.contact_check, 36);
                break;
            default:
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                x3Var.e0.setResellPrice(aVar);
                xh.d2 d2Var2 = x3Var.d1;
                if (d2Var2 != null) {
                    d2Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
