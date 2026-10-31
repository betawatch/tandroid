package xh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.ay;
import org.telegram.ui.fp;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                m2 m2Var = (m2) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) == null) {
                    s3 s3Var = m2Var.w0;
                    if (s3Var != null) {
                        s3Var.a(tL_webViewResultUrl);
                        m2Var.s();
                        break;
                    }
                } else {
                    m2Var.getClass();
                    break;
                }
                break;
            case 1:
                ((z2) obj3).H0((ArrayList) obj, (p51) obj2);
                break;
            case 2:
                ((r3) obj3).Y((ArrayList) obj, (p51) obj2);
                break;
            case 3:
                ((yh.q) obj3).w.c((ArrayList) obj);
                break;
            default:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                zm0 zm0Var = (zm0) ((zf.z) obj3);
                ay ayVar = zm0Var.I0;
                org.telegram.messenger.i0.v1(ayVar.getParentActivity().getCurrentFocus());
                z60 I = z60.I(ayVar, (k6) obj);
                if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) || !TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z60 J = I.J();
                    J.c(R.drawable.ic_ab_back, cd.L0(2131753756, null), new eb0(I, 25), false);
                    J.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J.k();
                        }
                        J.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    I.c(R.drawable.msg_channel, cd.L0(2131745266, null), new bi.k(I, J, 7), false);
                }
                I.c(R.drawable.msg_info, cd.L0(2131754943, null), new fp(zm0Var, ayVar, zm0Var.J0, I, 18), false);
                I.c(R.drawable.msg_block2, cd.L0(2131746251, null), new fp(zm0Var, ayVar, tL_sponsoredPeer, I, 19), false);
                I.k();
                I.c(R.drawable.msg_cancel, cd.L0(2131746335, null), new jg(zm0Var, ayVar, I, 18), false);
                I.V(cd.X ? 3 : 5);
                I.Y = true;
                I.t = false;
                I.Z();
                break;
        }
    }
}
