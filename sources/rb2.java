// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rb2 implements p8c {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ rb2(cs5 cs5Var, int i, long j, long j2, mu1 mu1Var, wjb wjbVar) {
        this.e = cs5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = mu1Var;
        this.g = wjbVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        int i = this.b;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj3;
                wjb wjbVar = (wjb) obj2;
                Integer num = (Integer) obj;
                ((cs5) obj4).u();
                int intValue = num.intValue();
                long j = this.c;
                long j2 = this.d;
                if (intValue == 0) {
                    if (na7.q1(i).n2(j, j2, null)) {
                        im7.n(i).G(j, j2, false);
                    }
                    if (u21.a(mu1Var)) {
                        u21.z(mu1Var, 4, num.intValue(), wjbVar).j();
                        break;
                    }
                } else {
                    im7.n(i).H(j, num.intValue(), j2);
                    if (u21.a(mu1Var)) {
                        u21.z(mu1Var, 5, num.intValue(), wjbVar).j();
                        break;
                    }
                }
                break;
            default:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj4;
                String str = (String) obj3;
                t7a t7aVar = (t7a) obj2;
                if (((Boolean) obj).booleanValue()) {
                    t7aVar.run();
                    gta v = gta.v(i, false);
                    String str2 = tL_starGiftUnique.slug;
                    LongSparseArray longSparseArray = v.L;
                    LongSparseArray longSparseArray2 = v.K;
                    if (!TextUtils.isEmpty(str2)) {
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                            if (((xsa) longSparseArray.valueAt(i2)).j(str2)) {
                                arrayList.add(Long.valueOf(longSparseArray.keyAt(i2)));
                            }
                        }
                        for (int i3 = 0; i3 < longSparseArray2.size(); i3++) {
                            wsa wsaVar = (wsa) longSparseArray2.valueAt(i3);
                            xsa xsaVar = wsaVar.g;
                            boolean z = xsaVar != null && xsaVar.j(str2);
                            Iterator it = wsaVar.h.values().iterator();
                            while (it.hasNext()) {
                                z = z || ((xsa) it.next()).j(str2);
                            }
                            if (z && !arrayList.contains(Long.valueOf(longSparseArray2.keyAt(i3)))) {
                                arrayList.add(Long.valueOf(longSparseArray2.keyAt(i3)));
                            }
                        }
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            v.M(((Long) arrayList.get(i4)).longValue());
                        }
                    }
                    long j3 = this.c;
                    if (j3 != 0) {
                        gta.v(i, false).M(j3);
                        cq7.s(tL_starGiftUnique, k96.a0(null, null, 2131749662, str, cf3.r(i, j3)));
                        break;
                    } else {
                        gta.v(i, false).M(this.d);
                        c C = c.C(i);
                        String str3 = tL_starGiftUnique.gift_address;
                        wz4 wz4Var = C.B;
                        gl.r(wz4Var);
                        C.y = str3;
                        C.z = null;
                        C.A = 0;
                        C.A().d();
                        C.G().g();
                        C.J();
                        int i5 = C.A;
                        long[] jArr = c.S;
                        if (i5 < 7) {
                            C.A = i5 + 1;
                            gl.d3(wz4Var, jArr[i5]);
                        }
                        cq7.s(tL_starGiftUnique, k96.a0(null, null, 2131749663, str));
                        break;
                    }
                } else {
                    cq7.s(tL_starGiftUnique, k96.a0(null, null, 2131749620, str));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rb2(TL_stars.TL_starGiftUnique tL_starGiftUnique, String str, t7a t7aVar, int i, long j, long j2) {
        this.e = tL_starGiftUnique;
        this.f = str;
        this.g = t7aVar;
        this.b = i;
        this.c = j;
        this.d = j2;
    }
}
