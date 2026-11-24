// default package

import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qr0 implements View.OnClickListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ qr0(ds0 ds0Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, p pVar, int i, long j, st0 st0Var) {
        this.d = ds0Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f = pVar;
        this.c = i;
        this.b = j;
        this.h = st0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        st0 st0Var;
        byte b = this.a;
        int i = 0;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                final ds0 ds0Var = (ds0) callback;
                final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) obj3;
                final p pVar = (p) obj2;
                st0 st0Var2 = (st0) obj;
                final d S = LaunchActivity.S();
                if (S != null) {
                    ds0Var.W1 = true;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 1);
                    if (!tL_messages_preparedInlineMessage.peer_types.isEmpty()) {
                        bundle.putBoolean("allowGroups", false);
                        bundle.putBoolean("allowMegagroups", false);
                        bundle.putBoolean("allowLegacyGroups", false);
                        bundle.putBoolean("allowUsers", false);
                        bundle.putBoolean("allowChannels", false);
                        bundle.putBoolean("allowBots", false);
                        ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_messages_preparedInlineMessage.peer_types;
                        int size = arrayList.size();
                        while (i < size) {
                            TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i);
                            int i2 = i + 1;
                            TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                            if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                bundle.putBoolean("allowUsers", true);
                                st0Var = st0Var2;
                            } else {
                                st0Var = st0Var2;
                                if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                    bundle.putBoolean("allowBots", true);
                                } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                    bundle.putBoolean("allowChannels", true);
                                } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                    bundle.putBoolean("allowLegacyGroups", true);
                                } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                    bundle.putBoolean("allowMegagroups", true);
                                }
                            }
                            st0Var2 = st0Var;
                            i = i2;
                        }
                    }
                    bs0 bs0Var = new bs0(ds0Var, bundle, pVar);
                    final int i3 = this.c;
                    final long j = this.b;
                    bs0Var.E2 = new wi3() { // from class: rr0
                        @Override // wi3
                        public final boolean F() {
                            return false;
                        }

                        @Override // wi3
                        public final boolean r(cj3 cj3Var, ArrayList arrayList2, CharSequence charSequence, boolean z, boolean z2, int i4, int i5, qvb qvbVar) {
                            TLRPC.TL_forumTopic f;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i6 = 0;
                            while (true) {
                                r5 = null;
                                r5 = null;
                                k27 k27Var = null;
                                if (i6 >= size2) {
                                    break;
                                }
                                Object obj4 = arrayList2.get(i6);
                                i6++;
                                zc7 zc7Var = (zc7) obj4;
                                long j2 = zc7Var.a;
                                long j3 = zc7Var.b;
                                if (!cf3.B(j2)) {
                                    int i7 = i3;
                                    if (j3 != 0 && (f = na7.q1(i7).g4.f(-j2, j3)) != null && (message = f.topicStartMessage) != null) {
                                        k27Var = new k27(i7, message, false, false);
                                        k27Var.p = true;
                                    }
                                    k27 k27Var2 = k27Var;
                                    HashMap hashMap = new HashMap();
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = tL_messages_preparedInlineMessage;
                                    hashMap.put("query_id", String.valueOf(tL_messages_preparedInlineMessage2.query_id));
                                    hashMap.put("id", String.valueOf(tL_messages_preparedInlineMessage2.result.id));
                                    hashMap.put("bot", String.valueOf(j));
                                    z3a.R(i4, j2, 0L, 0L, j5.a(i7), null, k27Var2, k27Var2, null, hashMap, tL_messages_preparedInlineMessage2.result, null, S, z2);
                                    if (charSequence != null) {
                                        z3a.B(i7).q0(x3a.b(charSequence.toString(), j2, k27Var2, k27Var2, null, true, null, null, null, true, 0, 0, null, false));
                                    }
                                    arrayList3.add(Long.valueOf(j2));
                                }
                            }
                            ds0 ds0Var2 = ds0.this;
                            if (!ds0Var2.X1) {
                                ds0Var2.X1 = true;
                                pVar.a(arrayList3.size() <= 0 ? "USER_DECLINED" : null, arrayList3);
                            }
                            if (qvbVar == null) {
                                cj3Var.finishFragment();
                                return true;
                            }
                            qvbVar.finishFragment();
                            cj3Var.removeSelfFromStack();
                            return true;
                        }

                        @Override // wi3
                        public final boolean t(cj3 cj3Var) {
                            return false;
                        }
                    };
                    S.presentFragment(bs0Var);
                    ds0Var.dismiss();
                    st0Var2.run();
                    break;
                }
                break;
            default:
                ve6 ve6Var = (ve6) callback;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                u41 u41Var = ve6Var.b;
                if (!u41Var.R) {
                    u41Var.setLoading(true);
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = str;
                    tL_inputStorePaymentAuthCode.amount = this.b;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    tL_inputStorePaymentAuthCode.phone_code_hash = str2;
                    tL_inputStorePaymentAuthCode.phone_number = str3;
                    tL_inputStorePaymentAuthCode.premium_days = this.c;
                    TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
                    tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
                    JSONObject u = ow0.u(null, false);
                    if (u != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = u.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    ve6Var.w.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new k45(ve6Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, (byte) 10), 74);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qr0(ve6 ve6Var, String str, long j, String str2, String str3, int i) {
        this.d = ve6Var;
        this.e = str;
        this.b = j;
        this.f = str2;
        this.h = str3;
        this.c = i;
    }
}
