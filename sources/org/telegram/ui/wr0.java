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
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wr0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jn0((bs0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 5));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((gx0) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 25));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new jn0((PrivacySettingsActivity) this.b, (org.telegram.ui.ActionBar.c2) this.c, tLObject, (TL_account.setAccountTTL) this.d, 8));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((ProfileActivity) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 29));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((ProfileActivity) this.b, tLObject, (TLRPC.TL_username) this.c, (fz0) this.d, tL_error, 27));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g30((ProfileActivity) this.b, tLObject, (String) this.c, (TLRPC.User) this.d, tL_error, 28));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new jn0((nz0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 14));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new k01((l61) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (TLRPC.User) this.d, 2));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new jn0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.c2) this.c, tL_error, (TLRPC.TL_authorization) this.d, 17));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new jn0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.c2) this.c, tL_error, (TLRPC.TL_webAuthorization) this.d, 16));
                break;
            case 10:
                f91 f91Var = (f91) this.b;
                String str = (String) this.c;
                t91 t91Var = (t91) this.d;
                boolean z10 = true;
                kg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        g91 g91Var = f91Var.r;
                        int i10 = g91Var.i;
                        if (g91Var != f91Var.w.w) {
                            z10 = false;
                        }
                        bVar = u91.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(f91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new jn0(f91Var, bVar, str, t91Var, 20));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new jn0((pd1) this.b, tLObject, (String) this.c, (org.telegram.ui.ActionBar.c2) this.d, 22));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new o71(17, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.globalQueue.postRunnable(new jn0(twoStepVerificationActivity, bArr, tLObject, bArr2, 23));
                    break;
                }
        }
    }
}
