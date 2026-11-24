// default package

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz4 implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ gk7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ oz4(na7 na7Var, HashMap hashMap, String str, vf6 vf6Var, long j, int i) {
        this.d = na7Var;
        this.e = hashMap;
        this.f = str;
        this.g = vf6Var;
        this.b = j;
        this.c = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        gk7 gk7Var = this.d;
        switch (b) {
            case 0:
                gl.c3(new sr0(tL_error, tLObject, (TwoStepVerificationActivity) gk7Var, (d) obj3, this.b, (is0) obj2, (wy) obj, this.c));
                break;
            default:
                gl.c3(new oe((na7) gk7Var, (HashMap) obj3, (String) obj2, tLObject, (vf6) obj, this.b, this.c));
                break;
        }
    }

    public /* synthetic */ oz4(TwoStepVerificationActivity twoStepVerificationActivity, d dVar, long j, is0 is0Var, wy wyVar, int i) {
        this.d = twoStepVerificationActivity;
        this.e = dVar;
        this.b = j;
        this.f = is0Var;
        this.g = wyVar;
        this.c = i;
    }
}
