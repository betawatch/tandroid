package org.telegram.ui;

import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yr0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yr0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c30(this.b, tLObject, this.c, this.d, 22));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(this.b, (Object) tLObject, this.c, this.d, (Object) tL_error, 23));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new c30(this.b, this.c, tLObject, this.d, 25));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(this.b, (Object) tLObject, this.c, this.d, (Object) tL_error, 27));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((ProfileActivity) this.b, tLObject, (TLRPC.TL_username) this.c, (mz0) this.d, tL_error, 25));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0((ProfileActivity) this.b, tLObject, (String) this.c, (TLRPC.User) this.d, tL_error, 26));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new dy0((vz0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, false, 1));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new z61((i71) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (TLRPC.User) this.d, 0));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new dy0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.d2) this.c, tL_error, (TLRPC.TL_authorization) this.d, false, 4));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new dy0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.d2) this.c, tL_error, (TLRPC.TL_webAuthorization) this.d, false, 3));
                break;
            case 10:
                z91 z91Var = (z91) this.b;
                String str = (String) this.c;
                na1 na1Var = (na1) this.d;
                boolean z4 = true;
                wf.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        aa1 aa1Var = z91Var.r;
                        int i10 = aa1Var.i;
                        if (aa1Var != z91Var.w.w) {
                            z4 = false;
                        }
                        bVar = oa1.e0(jSONObject, i10, z4);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(z91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new dy0((Object) z91Var, (Object) bVar, str, (Object) na1Var, 7));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new dy0(this.b, tLObject, this.c, this.d, 9));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new b11(28, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.globalQueue.postRunnable(new dy0(twoStepVerificationActivity, bArr, tLObject, bArr2, 10));
                    break;
                }
        }
    }
}
