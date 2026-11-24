// default package

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pr0 implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ pr0(int i, hd hdVar, Context context, long j, wjb wjbVar, st0 st0Var, p pVar) {
        this.b = i;
        this.d = hdVar;
        this.e = context;
        this.c = j;
        this.f = wjbVar;
        this.g = st0Var;
        this.h = pVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                gl.c3(new sr0(tLObject, this.b, (hd) obj5, (Context) obj3, this.c, (wjb) obj4, (st0) obj2, (p) obj));
                break;
            case 1:
                gl.c3(new sr0(this.b, tL_error, (is0) obj5, (TLRPC.TL_inputCheckPasswordSRP) obj3, (TwoStepVerificationActivity) obj4, (wy) obj2, (d) obj, this.c));
                break;
            case 2:
                h75 h75Var = (h75) obj5;
                HashSet hashSet = (HashSet) obj3;
                AtomicInteger atomicInteger = (AtomicInteger) obj4;
                fc2 fc2Var = (fc2) obj2;
                String str = (String) obj;
                boolean z = tLObject instanceof TLRPC.Updates;
                long j = this.c;
                if (z) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    na7.q1(h75Var.a).R3(updates, false);
                    gl.c3(new de2(h75Var, updates, j, (byte) 24));
                } else {
                    h75Var.getClass();
                    if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                        hashSet.add(Long.valueOf(j));
                    }
                }
                if (atomicInteger.incrementAndGet() == i && !hashSet.isEmpty()) {
                    gl.c3(new e45(h75Var, hashSet, fc2Var, str, (byte) 1));
                    break;
                }
                break;
            case 3:
                String str2 = LaunchActivity.C1;
                gl.c3(new sr0((LaunchActivity) obj5, tLObject, this.b, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.c));
                break;
            default:
                Activity activity = (Activity) obj5;
                wjb wjbVar = (wjb) obj4;
                byte[] bArr = (byte[]) obj3;
                mu1 mu1Var = (mu1) obj2;
                k27 k27Var = (k27) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        gl.d3(new r79(mu1Var, activity, wjbVar, k27Var, (byte) 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            gl.d3(new jo1(mu1Var, i, k27Var), 200L);
                            break;
                        }
                    } else {
                        gl.d3(new r79(mu1Var, activity, wjbVar, k27Var, (byte) 0), 200L);
                        break;
                    }
                } else {
                    gl.c3(new rp6(tLObject, (Object) activity, (Object) wjbVar, this.c, (Object) bArr, (Object) mu1Var, (Object) k27Var, (byte) 4));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pr0(int i, is0 is0Var, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, wy wyVar, d dVar, long j) {
        this.b = i;
        this.d = is0Var;
        this.e = tL_inputCheckPasswordSRP;
        this.f = twoStepVerificationActivity;
        this.g = wyVar;
        this.h = dVar;
        this.c = j;
    }

    public /* synthetic */ pr0(h75 h75Var, long j, HashSet hashSet, AtomicInteger atomicInteger, int i, fc2 fc2Var, String str) {
        this.d = h75Var;
        this.c = j;
        this.e = hashSet;
        this.f = atomicInteger;
        this.b = i;
        this.g = fc2Var;
        this.h = str;
    }

    public /* synthetic */ pr0(Activity activity, wjb wjbVar, long j, byte[] bArr, mu1 mu1Var, k27 k27Var, int i) {
        this.d = activity;
        this.f = wjbVar;
        this.c = j;
        this.e = bArr;
        this.g = mu1Var;
        this.h = k27Var;
        this.b = i;
    }

    public /* synthetic */ pr0(LaunchActivity launchActivity, int i, String str, String str2, TLRPC.User user, String str3, long j) {
        this.d = launchActivity;
        this.b = i;
        this.e = str;
        this.f = str2;
        this.g = user;
        this.h = str3;
        this.c = j;
    }
}
