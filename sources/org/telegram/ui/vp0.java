package org.telegram.ui;

import android.graphics.RectF;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vp0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vp0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new w50((aq0) this.b, tLObject, (org.telegram.messenger.d20) this.c, (TLRPC.Photo) this.d, 20));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new m90((su0) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 14));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new w50((PrivacySettingsActivity) this.b, (org.telegram.ui.ActionBar.x1) this.c, tLObject, (TL_account.setAccountTTL) this.d, 23));
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.R6;
                org.telegram.messenger.i0.g3(new m90(profileActivity, tLObject, userFull, tL_birthday, tL_error, 18));
                break;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                uw0 uw0Var = (uw0) this.d;
                RectF rectF2 = ProfileActivity.R6;
                org.telegram.messenger.i0.g3(new m90(profileActivity2, tLObject, tL_username, uw0Var, tL_error, 16));
                break;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                String str = (String) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.R6;
                org.telegram.messenger.i0.g3(new m90(profileActivity3, tLObject, str, user, tL_error, 17));
                break;
            case 6:
                org.telegram.messenger.i0.g3(new w50((dx0) this.b, tLObject, (org.telegram.messenger.d20) this.c, (TLRPC.Photo) this.d, 29));
                break;
            case 7:
                org.telegram.messenger.i0.g3(new m90(this.b, tL_error, (Object) tLObject, this.c, this.d, 21));
                break;
            case 8:
                org.telegram.messenger.i0.g3(new px0(this.b, this.c, tL_error, this.d, 2));
                break;
            case 9:
                org.telegram.messenger.i0.g3(new px0(this.b, this.c, tL_error, this.d, 1));
                break;
            case 10:
                f61 f61Var = (f61) this.b;
                String str2 = (String) this.c;
                t61 t61Var = (t61) this.d;
                boolean z10 = true;
                cg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        g61 g61Var = f61Var.r;
                        int i10 = g61Var.i;
                        if (g61Var != f61Var.x.x) {
                            z10 = false;
                        }
                        bVar = u61.g0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(f61Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.i0.g3(new px0(f61Var, bVar, str2, t61Var, 5));
                break;
            case 11:
                org.telegram.messenger.i0.g3(new px0((ha1) this.b, tLObject, (String) this.c, (org.telegram.ui.ActionBar.x1) this.d, 7));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new t11(17, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.e.c(new px0(twoStepVerificationActivity, bArr, tLObject, bArr2));
                    break;
                }
        }
    }
}
