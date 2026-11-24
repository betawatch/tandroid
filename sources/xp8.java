// default package

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xp8 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tq8 b;

    public /* synthetic */ xp8(tq8 tq8Var, byte b) {
        this.a = b;
        this.b = tq8Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        tq8 tq8Var = this.b;
        switch (b) {
            case 0:
                tq8Var.f(true);
                vec vecVar = tq8Var.n;
                int i = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                vecVar.e(i, tq8Var.e.f(i) + 1);
                d dVar = tq8Var.a;
                if (dVar instanceof ProfileActivity) {
                    ((ProfileActivity) dVar).j3(true);
                }
                tq8Var.o();
                break;
            default:
                tq8Var.e.b(new xp8(tq8Var, (byte) 0), (String) obj);
                break;
        }
    }
}
