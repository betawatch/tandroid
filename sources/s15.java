// default package

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class s15 implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ fn7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s15(uc7 uc7Var, HashMap hashMap, String str, zh6 zh6Var, long j, int i) {
        this.d = uc7Var;
        this.e = hashMap;
        this.f = str;
        this.g = zh6Var;
        this.b = j;
        this.c = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        fn7 fn7Var = this.d;
        switch (b) {
            case 0:
                hl.c3(new as0(tL_error, tLObject, (TwoStepVerificationActivity) fn7Var, (e) obj3, this.b, (qs0) obj2, (wy) obj, this.c));
                break;
            default:
                hl.c3(new qe((uc7) fn7Var, (HashMap) obj3, (String) obj2, tLObject, (zh6) obj, this.b, this.c));
                break;
        }
    }

    public /* synthetic */ s15(TwoStepVerificationActivity twoStepVerificationActivity, e eVar, long j, qs0 qs0Var, wy wyVar, int i) {
        this.d = twoStepVerificationActivity;
        this.e = eVar;
        this.b = j;
        this.f = qs0Var;
        this.g = wyVar;
        this.c = i;
    }
}
