// default package

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wpa implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;
    public final /* synthetic */ ms7[] c;
    public final /* synthetic */ TL_stars.TL_starGiftUnique d;

    public /* synthetic */ wpa(wsa wsaVar, ms7[] ms7VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = ms7VarArr;
        this.d = tL_starGiftUnique;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        ms7[] ms7VarArr = this.c;
        wsa wsaVar = this.b;
        Long l = (Long) obj;
        switch (b) {
            case 0:
                ms7VarArr[0].dismiss();
                Context context = wsaVar.getContext();
                int i = wsaVar.a;
                long longValue = l.longValue();
                ylb ylbVar = wsaVar.J0;
                b61 b61Var = wsaVar.f2;
                Objects.requireNonNull(b61Var);
                ci7 ci7Var = new ci7(b61Var, (byte) 6);
                c41 j = wsaVar.j();
                npa npaVar = new npa(wsaVar, (byte) 13);
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
                if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    TL_stars.updateStarGiftOnchainPrice updatestargiftonchainprice = new TL_stars.updateStarGiftOnchainPrice();
                    updatestargiftonchainprice.slug = tL_starGiftUnique.slug;
                    updatestargiftonchainprice.amount = longValue;
                    String h = fs7.h(tL_starGiftUnique);
                    fs7.o(context, i, updatestargiftonchainprice, tL_starGiftUnique.onchain_sale ? Boolean.valueOf(tL_starGiftUnique.fixed_sale) : null, ylbVar, ci7Var, j, new bs7(longValue, tL_starGiftUnique, context, i, ylbVar, h, npaVar));
                    break;
                }
                break;
            default:
                ms7VarArr[0].dismiss();
                Context context2 = wsaVar.getContext();
                int i2 = wsaVar.a;
                long longValue2 = l.longValue();
                ylb ylbVar2 = wsaVar.J0;
                b61 b61Var2 = wsaVar.f2;
                Objects.requireNonNull(b61Var2);
                ci7 ci7Var2 = new ci7(b61Var2, (byte) 6);
                c41 j2 = wsaVar.j();
                npa npaVar2 = new npa(wsaVar, (byte) 11);
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.d;
                if (!TextUtils.isEmpty(tL_starGiftUnique2.slug)) {
                    TL_stars.updateStarGiftOnchainPrice updatestargiftonchainprice2 = new TL_stars.updateStarGiftOnchainPrice();
                    updatestargiftonchainprice2.slug = tL_starGiftUnique2.slug;
                    updatestargiftonchainprice2.amount = longValue2;
                    fs7.o(context2, i2, updatestargiftonchainprice2, Boolean.TRUE, ylbVar2, ci7Var2, j2, new bs7(tL_starGiftUnique2, longValue2, context2, i2, ylbVar2, fs7.h(tL_starGiftUnique2), npaVar2));
                    break;
                }
                break;
        }
    }
}
