// default package

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sra implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;
    public final /* synthetic */ pt7[] c;
    public final /* synthetic */ TL_stars.TL_starGiftUnique d;

    public /* synthetic */ sra(wua wuaVar, pt7[] pt7VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = pt7VarArr;
        this.d = tL_starGiftUnique;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        pt7[] pt7VarArr = this.c;
        wua wuaVar = this.b;
        Long l = (Long) obj;
        switch (b) {
            case 0:
                pt7VarArr[0].dismiss();
                Context context = wuaVar.getContext();
                int i = wuaVar.a;
                long longValue = l.longValue();
                vnb vnbVar = wuaVar.J0;
                c51 c51Var = wuaVar.f2;
                Objects.requireNonNull(c51Var);
                ji7 ji7Var = new ji7(c51Var, (byte) 7);
                d31 j = wuaVar.j();
                jra jraVar = new jra(wuaVar, (byte) 11);
                HashMap hashMap = it7.a;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
                if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    TL_stars.updateStarGiftOnchainPrice updatestargiftonchainprice = new TL_stars.updateStarGiftOnchainPrice();
                    updatestargiftonchainprice.slug = tL_starGiftUnique.slug;
                    updatestargiftonchainprice.amount = longValue;
                    String i2 = it7.i(tL_starGiftUnique);
                    it7.q(context, i, updatestargiftonchainprice, tL_starGiftUnique.onchain_sale ? Boolean.valueOf(tL_starGiftUnique.fixed_sale) : null, vnbVar, ji7Var, j, new ws7(longValue, tL_starGiftUnique, context, i, vnbVar, i2, jraVar));
                    break;
                }
                break;
            default:
                pt7VarArr[0].dismiss();
                Context context2 = wuaVar.getContext();
                int i3 = wuaVar.a;
                long longValue2 = l.longValue();
                vnb vnbVar2 = wuaVar.J0;
                c51 c51Var2 = wuaVar.f2;
                Objects.requireNonNull(c51Var2);
                ji7 ji7Var2 = new ji7(c51Var2, (byte) 7);
                d31 j2 = wuaVar.j();
                jra jraVar2 = new jra(wuaVar, (byte) 9);
                HashMap hashMap2 = it7.a;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.d;
                if (!TextUtils.isEmpty(tL_starGiftUnique2.slug)) {
                    TL_stars.updateStarGiftOnchainPrice updatestargiftonchainprice2 = new TL_stars.updateStarGiftOnchainPrice();
                    updatestargiftonchainprice2.slug = tL_starGiftUnique2.slug;
                    updatestargiftonchainprice2.amount = longValue2;
                    it7.q(context2, i3, updatestargiftonchainprice2, Boolean.TRUE, vnbVar2, ji7Var2, j2, new ws7(tL_starGiftUnique2, longValue2, context2, i3, vnbVar2, it7.i(tL_starGiftUnique2), jraVar2));
                    break;
                }
                break;
        }
    }
}
