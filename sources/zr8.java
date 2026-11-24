// default package

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zr8 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vs8 b;

    public /* synthetic */ zr8(vs8 vs8Var, byte b) {
        this.a = b;
        this.b = vs8Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        vs8 vs8Var = this.b;
        switch (b) {
            case 0:
                vs8Var.f(true);
                vgc vgcVar = vs8Var.n;
                int i = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                vgcVar.e(i, vs8Var.e.f(i) + 1);
                d dVar = vs8Var.a;
                if (dVar instanceof ProfileActivity) {
                    ((ProfileActivity) dVar).n3(true);
                }
                vs8Var.o();
                break;
            default:
                vs8Var.e.b(new zr8(vs8Var, (byte) 0), (String) obj);
                break;
        }
    }
}
