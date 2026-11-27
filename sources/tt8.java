// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tt8 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ au8 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ tt8(au8 au8Var, TL_stars.SavedStarGift savedStarGift, byte b) {
        this.a = b;
        this.b = au8Var;
        this.c = savedStarGift;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        au8 au8Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                au8Var.a.e.b(new tt8(au8Var, savedStarGift, b2), (String) obj);
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                cga cgaVar = au8Var.a;
                zwa zwaVar = cgaVar.e;
                int i = tL_starGiftCollection.collection_id;
                zwaVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                zwaVar.a(i, arrayList);
                cgaVar.f(true);
                uic uicVar = cgaVar.n;
                int i2 = tL_starGiftCollection.collection_id;
                uicVar.e(i2, cgaVar.e.f(i2) + 1);
                e eVar = cgaVar.a;
                if (eVar instanceof ProfileActivity) {
                    ((ProfileActivity) eVar).k3(true);
                }
                cgaVar.o();
                d31.b0(eVar).R(savedStarGift.gift.getDocument(), hl.S2(ob6.a0(null, null, 2131750354, wua.u1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
