// default package

import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tra implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;
    public final /* synthetic */ String c;

    public /* synthetic */ tra(wua wuaVar, String str, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wua wuaVar = this.b;
                String str = this.c;
                m01.w(wuaVar.getContext(), uc7.s1(wuaVar.a).k4.O1.f + str, false);
                break;
            case 1:
                wua wuaVar2 = this.b;
                String str2 = this.c;
                m01.w(wuaVar2.getContext(), uc7.s1(wuaVar2.a).k4.O1.f + str2, false);
                break;
            case 2:
                wua wuaVar3 = this.b;
                String str3 = this.c;
                m01.w(wuaVar3.getContext(), uc7.s1(wuaVar3.a).k4.O1.f + str3, false);
                break;
            case 3:
                wua wuaVar4 = this.b;
                String str4 = this.c;
                m01.w(wuaVar4.getContext(), uc7.s1(wuaVar4.a).k4.O1.f + str4, false);
                break;
            case 4:
                wua wuaVar5 = this.b;
                String str5 = this.c;
                long j = wuaVar5.S1;
                wuaVar5.f2.setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    wuaVar5.dismiss();
                    e Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof zu1) {
                            zu1 zu1Var = (zu1) Q;
                            if (zu1Var.a() == j) {
                                d31.b0(zu1Var).I(R.raw.gift, ob6.M0(2131744753, null), hl.S2(ob6.a0(null, null, 2131744751, wf3.s(j)))).k(true);
                                break;
                            }
                        }
                        jn7 f = jn7.f(wuaVar5.a);
                        Long valueOf = Long.valueOf(j);
                        Boolean bool = Boolean.FALSE;
                        f.k(6, valueOf, bool);
                        jn7.f(wuaVar5.a).k(5, Long.valueOf(j), bool);
                        zu1 ha = zu1.ha(j);
                        ha.whenFullyVisible(new ida(wuaVar5, ha, (byte) 15));
                        Q.presentFragment(ha);
                        break;
                    }
                } else {
                    wuaVar5.A2(0, true, null);
                    break;
                }
                break;
            case 5:
                wua wuaVar6 = this.b;
                hl.g(this.c);
                v21 k = wuaVar6.j().k(false);
                k.u = true;
                k.j();
                break;
            case 6:
                wua wuaVar7 = this.b;
                String str6 = this.c;
                wuaVar7.dismiss();
                m01.u(wuaVar7.getContext(), "https://" + uc7.s1(wuaVar7.a).N2 + "/" + str6);
                break;
            case 7:
                wua wuaVar8 = this.b;
                String str7 = this.c;
                m01.w(wuaVar8.getContext(), uc7.s1(wuaVar8.a).k4.O1.f + str7, false);
                break;
            default:
                wua wuaVar9 = this.b;
                String str8 = this.c;
                m01.w(wuaVar9.getContext(), uc7.s1(wuaVar9.a).k4.O1.f + str8, false);
                break;
        }
    }
}
