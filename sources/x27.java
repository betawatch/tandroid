// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class x27 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x27(FrameLayout frameLayout, boolean z, Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = frameLayout;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z = this.b;
        FrameLayout frameLayout = this.c;
        byte b2 = 0;
        switch (b) {
            case 0:
                f37 f37Var = (f37) frameLayout;
                Context context = (Context) obj3;
                k37 k37Var = (k37) obj2;
                k37 k37Var2 = (k37) obj;
                l37 l37Var = f37Var.d0;
                o27 o27Var = l37Var.d;
                if (!z) {
                    new u21(l37Var, l37Var.G).Q(R.raw.star_premium_2, 36, gl.N2(k96.M0(2131750566, null), -1, 0, new v27(f37Var, context, b2), null)).j();
                    break;
                } else {
                    boolean z2 = o27Var.k;
                    o27Var.k = !z2;
                    l37Var.y = false;
                    if (z2) {
                        o27Var.l = false;
                        if (k37Var != null) {
                            k37Var.a(false, true);
                        }
                    }
                    k37Var2.a(o27Var.k, true);
                    f37Var.i();
                    f37Var.l(true);
                    break;
                }
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                cs5 cs5Var = (cs5) obj;
                lca lcaVar = ((pq8) frameLayout).a;
                if (z) {
                    lcaVar.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    u21.b0(lcaVar.a).R(savedStarGift.gift.getDocument(), gl.S2(k96.a0(null, null, 2131750021, vqa.t1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    wsa wsaVar = lcaVar.e;
                    int i = tL_starGiftCollection.collection_id;
                    wsaVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    wsaVar.a(i, arrayList);
                    u21.b0(lcaVar.a).R(savedStarGift.gift.getDocument(), gl.S2(k96.a0(null, null, 2131750377, vqa.t1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                cs5Var.u();
                lcaVar.o();
                break;
        }
    }
}
