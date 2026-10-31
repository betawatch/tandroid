package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wt implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ wt(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.q8 q8Var, org.telegram.ui.Cells.q8[] q8VarArr, int i10, org.telegram.ui.Cells.f5[] f5VarArr, org.telegram.ui.Cells.t8[] t8VarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = q8Var;
        this.e = q8VarArr;
        this.b = i10;
        this.f = f5VarArr;
        this.h = t8VarArr;
        this.n = animatorSetArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        JSONObject jSONObject = null;
        int i11 = this.b;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i10) {
            case 0:
                DataAutoDownloadActivity.Y((DataAutoDownloadActivity) obj6, (org.telegram.ui.Cells.q8) obj5, (org.telegram.ui.Cells.q8[]) obj4, this.b, (org.telegram.ui.Cells.f5[]) obj3, (org.telegram.ui.Cells.t8[]) obj2, (AnimatorSet[]) obj, view);
                break;
            case 1:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj5;
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj3;
                vh.d dVar = (vh.d) obj2;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                if (!((vh.d) obj6).Q) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!dVar.Q) {
                            dVar.setLoading(true);
                            if (z0Var != null) {
                                boolean z10 = org.telegram.ui.web.z0.Q0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                z0Var.x("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new a3.b(1), new ih.s(13, zArr, z2Var));
                            break;
                        }
                    } else {
                        zArr[0] = true;
                        z2Var.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                boolean[] zArr2 = (boolean[]) obj6;
                org.telegram.ui.Wallet.z2[] z2VarArr = (org.telegram.ui.Wallet.z2[]) obj5;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj4;
                nh.p pVar = (nh.p) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    org.telegram.ui.Wallet.q qVar = new org.telegram.ui.Wallet.q(zArr2, z2VarArr, p6Var, pVar, 9);
                    if (!wallettransaction.comment_encrypted_preparing) {
                        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i11);
                        String str2 = wallettransaction.comment;
                        org.telegram.ui.Wallet.k0.H("decrypting transaction comment");
                        x10.z(new org.telegram.ui.Wallet.j(x10, qVar, str, str2), true, false);
                        break;
                    } else {
                        qVar.a(wallettransaction.comment, null);
                        break;
                    }
                }
                break;
            default:
                vh.d dVar2 = (vh.d) obj6;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj5;
                org.telegram.ui.ActionBar.z2[] z2VarArr2 = (org.telegram.ui.ActionBar.z2[]) obj4;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) obj3;
                boolean[] zArr3 = (boolean[]) obj2;
                Activity activity = (Activity) obj;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    if (starsSubscription.chat_invite_hash == null) {
                        if (starsSubscription.invoice_slug != null) {
                            zArr3[0] = true;
                            gf.f.q(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new rh.l7(dVar2), null, false, true, false);
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i12 = this.b;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_checkChatInvite, new q8(dVar2, z2VarArr2, p6Var2, i12, tL_messages_checkChatInvite, 11));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ wt(vh.d dVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var, vh.d dVar2, org.telegram.ui.web.z0 z0Var, int i10) {
        this.c = dVar;
        this.d = tL_messages_requestUrlAuth;
        this.e = zArr;
        this.f = z2Var;
        this.h = dVar2;
        this.n = z0Var;
        this.b = i10;
    }

    public /* synthetic */ wt(vh.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.z2[] z2VarArr, org.telegram.ui.ActionBar.p6 p6Var, boolean[] zArr, Activity activity) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i10;
        this.e = z2VarArr;
        this.f = p6Var;
        this.h = zArr;
        this.n = activity;
    }

    public /* synthetic */ wt(boolean[] zArr, org.telegram.ui.Wallet.z2[] z2VarArr, org.telegram.ui.ActionBar.p6 p6Var, nh.p pVar, TL_wallet.walletTransaction wallettransaction, int i10, String str) {
        this.c = zArr;
        this.d = z2VarArr;
        this.e = p6Var;
        this.f = pVar;
        this.h = wallettransaction;
        this.b = i10;
        this.n = str;
    }
}
