// default package

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wna implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;
    public final /* synthetic */ jq7[] c;
    public final /* synthetic */ TL_stars.TL_starGiftUnique d;

    public /* synthetic */ wna(vqa vqaVar, jq7[] jq7VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = jq7VarArr;
        this.d = tL_starGiftUnique;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        jq7[] jq7VarArr = this.c;
        vqa vqaVar = this.b;
        Long l = (Long) obj;
        switch (b) {
            case 0:
                jq7VarArr[0].dismiss();
                Context context = vqaVar.getContext();
                int i = vqaVar.a;
                long longValue = l.longValue();
                wjb wjbVar = vqaVar.J0;
                u41 u41Var = vqaVar.f2;
                Objects.requireNonNull(u41Var);
                zf7 zf7Var = new zf7(u41Var, (byte) 6);
                u21 j = vqaVar.j();
                nna nnaVar = new nna(vqaVar, (byte) 13);
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
                if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    TL_stars.updateStarGiftOnchainPrice updatestargiftonchainprice = new TL_stars.updateStarGiftOnchainPrice();
                    updatestargiftonchainprice.slug = tL_starGiftUnique.slug;
                    updatestargiftonchainprice.amount = longValue;
                    String h = cq7.h(tL_starGiftUnique);
                    cq7.o(context, i, updatestargiftonchainprice, tL_starGiftUnique.onchain_sale ? Boolean.valueOf(tL_starGiftUnique.fixed_sale) : null, wjbVar, zf7Var, j, new yp7(longValue, tL_starGiftUnique, context, i, wjbVar, h, nnaVar));
                    break;
                }
                break;
            default:
                jq7VarArr[0].dismiss();
                Context context2 = vqaVar.getContext();
                int i2 = vqaVar.a;
                long longValue2 = l.longValue();
                wjb wjbVar2 = vqaVar.J0;
                u41 u41Var2 = vqaVar.f2;
                Objects.requireNonNull(u41Var2);
                zf7 zf7Var2 = new zf7(u41Var2, (byte) 6);
                u21 j2 = vqaVar.j();
                nna nnaVar2 = new nna(vqaVar, (byte) 11);
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.d;
                if (!TextUtils.isEmpty(tL_starGiftUnique2.slug)) {
                    TL_stars.updateStarGiftOnchainPrice updatestargiftonchainprice2 = new TL_stars.updateStarGiftOnchainPrice();
                    updatestargiftonchainprice2.slug = tL_starGiftUnique2.slug;
                    updatestargiftonchainprice2.amount = longValue2;
                    cq7.o(context2, i2, updatestargiftonchainprice2, Boolean.TRUE, wjbVar2, zf7Var2, j2, new yp7(tL_starGiftUnique2, longValue2, context2, i2, wjbVar2, cq7.h(tL_starGiftUnique2), nnaVar2));
                    break;
                }
                break;
        }
    }
}
