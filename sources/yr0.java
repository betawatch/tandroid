// default package

import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yr0 implements View.OnClickListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ yr0(ls0 ls0Var, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, p pVar, int i, long j, bu0 bu0Var) {
        this.d = ls0Var;
        this.e = tL_messages_preparedInlineMessage;
        this.f = pVar;
        this.c = i;
        this.b = j;
        this.h = bu0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bu0 bu0Var;
        byte b = this.a;
        int i = 0;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                final ls0 ls0Var = (ls0) callback;
                final TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage = (TLRPC.TL_messages_preparedInlineMessage) obj3;
                final p pVar = (p) obj2;
                bu0 bu0Var2 = (bu0) obj;
                final e S = LaunchActivity.S();
                if (S != null) {
                    ls0Var.W1 = true;
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
                                bu0Var = bu0Var2;
                            } else {
                                bu0Var = bu0Var2;
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
                            bu0Var2 = bu0Var;
                            i = i2;
                        }
                    }
                    js0 js0Var = new js0(ls0Var, bundle, pVar);
                    final int i3 = this.c;
                    final long j = this.b;
                    js0Var.E2 = new oj3() { // from class: zr0
                        @Override // oj3
                        public final boolean E() {
                            return false;
                        }

                        @Override // oj3
                        public final boolean q(uj3 uj3Var, ArrayList arrayList2, CharSequence charSequence, boolean z, boolean z2, int i4, int i5, tzb tzbVar) {
                            TLRPC.TL_forumTopic f;
                            TLRPC.Message message;
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i6 = 0;
                            while (true) {
                                r5 = null;
                                r5 = null;
                                r47 r47Var = null;
                                if (i6 >= size2) {
                                    break;
                                }
                                Object obj4 = arrayList2.get(i6);
                                i6++;
                                jf7 jf7Var = (jf7) obj4;
                                long j2 = jf7Var.a;
                                long j3 = jf7Var.b;
                                if (!wf3.B(j2)) {
                                    int i7 = i3;
                                    if (j3 != 0 && (f = uc7.s1(i7).h4.f(-j2, j3)) != null && (message = f.topicStartMessage) != null) {
                                        r47Var = new r47(i7, message, false, false);
                                        r47Var.p = true;
                                    }
                                    r47 r47Var2 = r47Var;
                                    HashMap hashMap = new HashMap();
                                    TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage2 = tL_messages_preparedInlineMessage;
                                    hashMap.put("query_id", String.valueOf(tL_messages_preparedInlineMessage2.query_id));
                                    hashMap.put("id", String.valueOf(tL_messages_preparedInlineMessage2.result.id));
                                    hashMap.put("bot", String.valueOf(j));
                                    r7a.R(i4, j2, 0L, 0L, k5.a(i7), null, r47Var2, r47Var2, null, hashMap, tL_messages_preparedInlineMessage2.result, null, S, z2);
                                    if (charSequence != null) {
                                        r7a.B(i7).q0(p7a.b(charSequence.toString(), j2, r47Var2, r47Var2, null, true, null, null, null, true, 0, 0, null, false));
                                    }
                                    arrayList3.add(Long.valueOf(j2));
                                }
                            }
                            ls0 ls0Var2 = ls0.this;
                            if (!ls0Var2.X1) {
                                ls0Var2.X1 = true;
                                pVar.a(arrayList3.size() <= 0 ? "USER_DECLINED" : null, arrayList3);
                            }
                            if (tzbVar == null) {
                                uj3Var.finishFragment();
                                return true;
                            }
                            tzbVar.finishFragment();
                            uj3Var.removeSelfFromStack();
                            return true;
                        }

                        @Override // oj3
                        public final boolean s(uj3 uj3Var) {
                            return false;
                        }
                    };
                    S.presentFragment(js0Var);
                    ls0Var.dismiss();
                    bu0Var2.run();
                    break;
                }
                break;
            default:
                zg6 zg6Var = (zg6) callback;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                c51 c51Var = zg6Var.b;
                if (!c51Var.R) {
                    c51Var.setLoading(true);
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
                    JSONObject u = xw0.u(null, false);
                    if (u != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = u.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    zg6Var.w.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new m65(zg6Var, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, (byte) 10), 74);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yr0(zg6 zg6Var, String str, long j, String str2, String str3, int i) {
        this.d = zg6Var;
        this.e = str;
        this.b = j;
        this.f = str2;
        this.h = str3;
        this.c = i;
    }
}
