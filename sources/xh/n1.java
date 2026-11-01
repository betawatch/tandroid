package xh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.z60;
import org.telegram.ui.fp;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                m2 m2Var = (m2) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) == null) {
                    t3 t3Var = m2Var.w0;
                    if (t3Var != null) {
                        t3Var.a(tL_webViewResultUrl);
                        m2Var.s();
                        break;
                    }
                } else {
                    m2Var.getClass();
                    break;
                }
                break;
            case 1:
                ((z2) obj3).I0((ArrayList) obj, (q51) obj2);
                break;
            case 2:
                ((s3) obj3).Z((ArrayList) obj, (q51) obj2);
                break;
            case 3:
                ((yh.p) obj3).w.c((ArrayList) obj);
                break;
            default:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                an0 an0Var = (an0) ((zf.z) obj3);
                zx zxVar = an0Var.I0;
                org.telegram.messenger.i0.v1(zxVar.getParentActivity().getCurrentFocus());
                z60 I = z60.I(zxVar, (k6) obj);
                if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) || !TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z60 J = I.J();
                    J.c(R.drawable.ic_ab_back, dd.L0(2131753756, null), new eb0(I, 25), false);
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
                    I.c(R.drawable.msg_channel, dd.L0(2131745266, null), new bi.k(I, J, 7), false);
                }
                I.c(R.drawable.msg_info, dd.L0(2131754943, null), new fp(an0Var, zxVar, an0Var.J0, I, 18), false);
                I.c(R.drawable.msg_block2, dd.L0(2131746251, null), new fp(an0Var, zxVar, tL_sponsoredPeer, I, 19), false);
                I.k();
                I.c(R.drawable.msg_cancel, dd.L0(2131746335, null), new jg(an0Var, zxVar, I, 18), false);
                I.V(dd.X ? 3 : 5);
                I.Y = true;
                I.t = false;
                I.Z();
                break;
        }
    }
}
