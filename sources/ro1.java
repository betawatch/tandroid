// default package

import android.content.Context;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ro1 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ro1(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        d S;
        byte b = this.a;
        TLRPC.Updates updates = null;
        int i = this.b;
        byte b2 = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj4;
                yv1Var.getClass();
                gm.c3(new i77((Object) yv1Var, this.b, obj, obj2, obj3, (byte) 8));
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                k16 k16Var = (k16) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = LaunchActivity.C1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    oc7.r1(launchActivity.P).T3(updates, false);
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    gm.c3(new fd5(launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, (byte) 23));
                }
                gm.c3(new i77((Object) launchActivity, (Object) k16Var, (Object) tL_error, (Object) updates, this.b, (byte) 17));
                break;
            case 2:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.b;
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse) {
                    c41.b0(passkeysActivity).f0("FALSE", false);
                    arrayList.add(Utilities.j(i, arrayList.size(), 0), passkey);
                    passkeysActivity.a.g3.O(true);
                    break;
                } else if (tL_error2 != null) {
                    c41.b0(passkeysActivity).g0(tL_error2, false);
                    arrayList.add(Utilities.j(i, arrayList.size(), 0), passkey);
                    passkeysActivity.a.g3.O(true);
                    break;
                }
                break;
            case 3:
                jac jacVar = (jac) obj4;
                Context context = (Context) obj3;
                w13 w13Var = (w13) obj;
                Throwable th = (Throwable) obj2;
                if ((th instanceof m13) || (th instanceof q13)) {
                    gm.c3(new c25(jacVar, b2));
                    break;
                } else if (th instanceof r13) {
                    gm.c3(new c25(jacVar, (byte) 2));
                    break;
                } else if (th != null) {
                    fc4.g(th, true);
                    gm.c3(new bl7(jacVar, th, (byte) 21));
                    break;
                } else {
                    TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
                    try {
                        JSONObject jSONObject = new JSONObject(w13Var.a.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
                        TL_account.inputPasskeyCredentialPublicKey inputpasskeycredentialpublickey = new TL_account.inputPasskeyCredentialPublicKey();
                        registerpasskey.credential = inputpasskeycredentialpublickey;
                        inputpasskeycredentialpublickey.id = jSONObject.getString("id");
                        registerpasskey.credential.raw_id = jSONObject.getString("rawId");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                        TL_account.inputPasskeyResponseRegister inputpasskeyresponseregister = new TL_account.inputPasskeyResponseRegister();
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        inputpasskeyresponseregister.client_data = tL_dataJSON;
                        tL_dataJSON.data = new String(Base64.decode(jSONObject2.getString("clientDataJSON"), 8));
                        inputpasskeyresponseregister.attestation_object = Base64.decode(jSONObject2.getString("attestationObject"), 8);
                        StringBuilder sb = new StringBuilder();
                        sb.append("AAGUID: ");
                        byte[] copyOfRange = Arrays.copyOfRange(inputpasskeyresponseregister.attestation_object, 67, 83);
                        StringBuilder sb2 = new StringBuilder(copyOfRange.length << 1);
                        for (byte b3 : copyOfRange) {
                            sb2.append(String.format("%02x", Byte.valueOf(b3)));
                        }
                        sb.append(sb2.toString());
                        fc4.b(sb.toString());
                        registerpasskey.credential.response = inputpasskeyresponseregister;
                        gm.c3(new v36((Object) context, this.b, (Object) registerpasskey, (Object) jacVar, (byte) 17));
                        break;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        gm.c3(new d25(jacVar, e, (byte) 3));
                        return;
                    }
                }
                break;
            case 4:
                qac qacVar = (qac) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                HashSet hashSet = ((b3c) obj4).G;
                if (tL_textWithEntities != null) {
                    hashSet.remove(Integer.valueOf(i));
                    qacVar.a(tL_textWithEntities);
                    break;
                } else if (tL_error3 != null) {
                    if ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error3.text) && (S = LaunchActivity.S()) != null) {
                        u31 K = c41.b0(S).K(R.raw.star_premium_2, jb6.M0(2131744016, null), jb6.M0(2131744015, null), new sq8(S, (byte) 28));
                        K.j = 5000;
                        K.k(true);
                    }
                    hashSet.remove(Integer.valueOf(i));
                    qacVar.a(null);
                    break;
                }
                break;
            default:
                mqc mqcVar = (mqc) obj4;
                TL_wallet.card cardVar = (TL_wallet.card) obj3;
                TL_wallet.card cardVar2 = (TL_wallet.card) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                mqcVar.g1 = 0;
                if (cardVar2 != null) {
                    mqc.e0(i, cardVar2);
                    if (!mqcVar.b1) {
                        if (mqcVar.e1) {
                            mqcVar.c1 = cardVar2;
                            mqcVar.d1 = mqc.T(cardVar2);
                            mqcVar.Q();
                            break;
                        } else {
                            mqcVar.d(cardVar2);
                            break;
                        }
                    }
                } else {
                    if (cardVar != null) {
                        mqc.e0(i, cardVar);
                    }
                    if (!mqcVar.b1) {
                        if (tL_error4 != null) {
                            c41.b0(mqcVar.a).g0(tL_error4, false);
                            if ("WALLET_NFT_NOT_OWNED".equals(tL_error4.text)) {
                                mqcVar.E1 = true;
                                c.C(i).A().d();
                            }
                        }
                        mqcVar.e1 = false;
                        TL_wallet.card cardVar3 = mqcVar.c1;
                        if (cardVar3 != null) {
                            mqcVar.d(cardVar3);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ ro1(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
