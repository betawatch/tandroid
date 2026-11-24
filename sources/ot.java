// default package

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ot implements RequestDelegate {
    public final /* synthetic */ byte a = 6;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ot(int i, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Activity activity) {
        this.b = i;
        this.c = zArr;
        this.d = file;
        this.e = setcallrating;
        this.f = arrayList;
        this.g = activity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                gl.c3(new qt(obj5, this.b, obj4, (Object) tLObject, obj3, obj2, obj, (byte) 0));
                break;
            case 1:
                gl.c3(new qt(tLObject, (hd) obj5, (Context) obj4, this.b, (TL_phone.exportGroupCallInvite) obj3, (wjb) obj2, (fa5) obj));
                break;
            case 2:
                String str = LaunchActivity.C1;
                gl.c3(new qt((LaunchActivity) obj5, tLObject, this.b, (cj3) obj4, (d) obj2, (TLRPC.User) obj, (String) obj3));
                break;
            case 3:
                gl.c3(new ox1(tLObject, (d) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (gi8) obj3, (nfd) obj2, this.b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj, (byte) 4));
                break;
            case 4:
                Context context = (Context) obj5;
                wjb wjbVar = (wjb) obj4;
                byte[] bArr = (byte[]) obj3;
                d dVar = (d) obj2;
                tj9 tj9Var = (tj9) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        gl.d3(new s79(dVar, context, wjbVar, tj9Var, (byte) 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            gl.d3(new t79(dVar, i, tj9Var, (byte) 0), 200L);
                            break;
                        }
                    } else {
                        gl.d3(new s79(dVar, context, wjbVar, tj9Var, (byte) 0), 200L);
                        break;
                    }
                } else {
                    gl.c3(new e57(tLObject, (Object) context, (Object) wjbVar, (Object) bArr, (Object) dVar, (Object) tj9Var, (byte) 22));
                    break;
                }
                break;
            case 5:
                gl.c3(new qt((gk7) obj5, tLObject, obj4, (TLObject) obj2, obj, this.b, (String) obj3, (byte) 18));
                break;
            default:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Activity activity = (Activity) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    na7.q1(i).R3((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    z3a.S(j5.a(y6c.t0), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, true, null, null);
                    Toast.makeText(activity, k96.M0(2131752590, null), 1).show();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ot(hd hdVar, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, wjb wjbVar, fa5 fa5Var) {
        this.c = hdVar;
        this.d = context;
        this.b = i;
        this.e = exportgroupcallinvite;
        this.f = wjbVar;
        this.g = fa5Var;
    }

    public /* synthetic */ ot(z3a z3aVar, TLRPC.InputFile inputFile, TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument, k3a k3aVar, int i, String str) {
        this.c = z3aVar;
        this.d = inputFile;
        this.f = tL_inputMediaUploadedDocument;
        this.g = k3aVar;
        this.b = i;
        this.e = str;
    }

    public /* synthetic */ ot(Context context, wjb wjbVar, byte[] bArr, d dVar, tj9 tj9Var, int i) {
        this.c = context;
        this.d = wjbVar;
        this.e = bArr;
        this.f = dVar;
        this.g = tj9Var;
        this.b = i;
    }

    public /* synthetic */ ot(d dVar, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, gi8 gi8Var, nfd nfdVar, int i, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.c = dVar;
        this.d = tL_inputStorePaymentPremiumSubscription;
        this.e = gi8Var;
        this.f = nfdVar;
        this.b = i;
        this.g = tL_payments_canPurchaseStore;
    }

    public /* synthetic */ ot(o oVar, int i, vt vtVar, String str, nt ntVar, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.c = oVar;
        this.b = i;
        this.d = vtVar;
        this.e = str;
        this.f = ntVar;
        this.g = tL_messages_getWebPage;
    }

    public /* synthetic */ ot(LaunchActivity launchActivity, int i, cj3 cj3Var, d dVar, TLRPC.User user, String str) {
        this.c = launchActivity;
        this.b = i;
        this.d = cj3Var;
        this.f = dVar;
        this.g = user;
        this.e = str;
    }
}
