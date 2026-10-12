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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class us0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ us0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ss0((zs0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new l90(this.b, tLObject, this.c, this.d, tL_error, 17));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ss0(this.b, this.c, tLObject, this.d, 3));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new l90(this.b, tLObject, this.c, this.d, tL_error, 21));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new l90(this.b, tLObject, this.c, this.d, tL_error, 19));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new l90(this.b, tLObject, this.c, this.d, tL_error, 20));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ss0((n01) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 9));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new l90(this.b, tL_error, tLObject, this.c, this.d, 24));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ss0(this.b, this.c, (Object) tL_error, this.d, 12));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ss0(this.b, this.c, (Object) tL_error, this.d, 11));
                break;
            case 10:
                sa1 sa1Var = (sa1) this.b;
                String str = (String) this.c;
                gb1 gb1Var = (gb1) this.d;
                boolean z10 = true;
                kg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        ta1 ta1Var = sa1Var.r;
                        int i10 = ta1Var.i;
                        if (ta1Var != sa1Var.w.w) {
                            z10 = false;
                        }
                        bVar = hb1.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(sa1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new ss0(sa1Var, bVar, str, gb1Var, 15));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ss0((df1) this.b, tLObject, (String) this.c, (org.telegram.ui.ActionBar.a2) this.d, 17));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new je1(6, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.globalQueue.postRunnable(new ss0((Object) twoStepVerificationActivity, (Object) bArr, tLObject, (Object) bArr2, 18));
                    break;
                }
        }
    }
}
