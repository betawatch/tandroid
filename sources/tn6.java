// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tn6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tn6(int i, ArrayList arrayList, HashMap hashMap, p8c p8cVar) {
        this.a = (byte) 7;
        this.b = i;
        this.c = arrayList;
        this.d = hashMap;
        this.e = p8cVar;
    }

    private final void a() {
        mt9 mt9Var = (mt9) this.c;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.d;
        int i = mt9Var.t0;
        if (this.b == mt9Var.e0 && (tLObject instanceof TLRPC.messages_Messages)) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            mt9Var.w = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
            mt9Var.x = messages_messages.next_rate;
            mt9Var.E = str;
            na7.q1(i).b4(messages_messages.users, false);
            na7.q1(i).V3(messages_messages.chats, false);
            for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                mt9Var.y.add(new k27(i, messages_messages.messages.get(i2), false, true));
            }
            ji3 ji3Var = mt9Var.V;
            if (ji3Var != null) {
                ji3Var.d(mt9Var.E0 > 0, true);
            }
            mt9Var.f();
        }
    }

    private final void b() {
        ll4 ll4Var;
        d dVar = (d) this.c;
        TLObject tLObject = (TLObject) this.e;
        p8c p8cVar = (p8c) this.d;
        if (dVar.getParentActivity() == null) {
            return;
        }
        boolean z = tLObject instanceof Vector;
        int i = this.b;
        if (z) {
            Vector vector = (Vector) tLObject;
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < vector.objects.size(); i2++) {
                try {
                    arrayList.add(Long.valueOf(cf3.n((TLRPC.Peer) vector.objects.get(i2))));
                } catch (Exception unused) {
                }
            }
            ll4Var = new ll4(dVar, i, arrayList);
        } else {
            ll4Var = new ll4(dVar, i, null);
        }
        ll4Var.w2 = p8cVar;
        dVar.showDialog(ll4Var);
    }

    private final void c() {
        JSONArray optJSONArray;
        o15 o15Var = (o15) this.c;
        buc bucVar = (buc) this.d;
        JSONObject jSONObject = (JSONObject) this.e;
        p15 p15Var = o15Var.c;
        if (p15Var.c(bucVar, this.b)) {
            c cVar = p15Var.c;
            String str = p15Var.b;
            ez3 ez3Var = p15Var.p;
            String optString = jSONObject.optString("status");
            if ((jSONObject.has("error") && !jSONObject.isNull("error")) || "error".equals(optString)) {
                StringBuilder sb = new StringBuilder("subscription error; id=");
                sb.append(jSONObject.optString("id"));
                sb.append(", code=");
                sb.append(jSONObject.optString("code"));
                ug8.z(", status=", optString, ", error=", sb);
                sb.append(jSONObject.opt("error"));
                sb.append(", message=");
                sb.append(jSONObject.optString("message"));
                p15Var.d(sb.toString());
                p15Var.f("subscription rejected");
                return;
            }
            if ("subscribed".equals(optString)) {
                p15Var.d("subscription acknowledgement: " + jSONObject);
                if (TextUtils.equals(p15Var.f, jSONObject.optString("id"))) {
                    p15Var.e = true;
                    p15Var.j = 0;
                    p15Var.l = SystemClock.elapsedRealtime();
                    gl.r(p15Var.o);
                    gl.r(ez3Var);
                    gl.d3(ez3Var, 15000L);
                    p15Var.d("subscription acknowledged; requested transactions and account state");
                    return;
                }
                return;
            }
            if ("pong".equals(optString) && "heartbeat".equals(jSONObject.optString("id"))) {
                p15Var.d("received pong");
                p15Var.l = SystemClock.elapsedRealtime();
                return;
            }
            if (!p15Var.e) {
                p15Var.d("ignoring message before subscription; type=" + jSONObject.optString(TeXSymbolParser.TYPE_ATTR) + ", status=" + optString);
                return;
            }
            String optString2 = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
            if (!"account_state_change".equals(optString2) || c.b(str, jSONObject.optString("account"))) {
                if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                    p15Var.d("ignoring message; type=" + optString2 + ", status=" + optString);
                    return;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("transactions");
                JSONObject optJSONObject = jSONObject.optJSONObject("state");
                StringBuilder p = ug8.p("event type=", optString2, ", finality=");
                p.append(jSONObject.optString("finality"));
                p.append(", trace=");
                p.append(jSONObject.optString("trace_external_hash_norm"));
                p.append(optJSONArray2 == null ? "" : ", transactions=" + optJSONArray2.length());
                p.append(optJSONObject != null ? ", balance=" + optJSONObject.optString("balance") : "");
                p15Var.d(p.toString());
                if (!"transactions".equals(optString2)) {
                    cVar.T(jSONObject);
                    return;
                }
                if (str == null || (optJSONArray = jSONObject.optJSONArray("transactions")) == null) {
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null && c.b(str, optJSONObject2.optString("account"))) {
                        jSONArray.put(optJSONObject2);
                    }
                }
                if (jSONArray.length() != 0) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                        jSONObject2.put("transactions", jSONArray);
                        cVar.T(jSONObject2);
                    } catch (JSONException unused) {
                        p15Var.d("could not filter streaming transactions");
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d() {
        long B1;
        qb5 qb5Var = (qb5) this.c;
        String str = (String) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        qb5Var.getClass();
        String lowerCase = str.trim().toLowerCase();
        int length = lowerCase.length();
        int i = this.b;
        byte b = 1;
        if (length == 0) {
            gl.c3(new j45(qb5Var, i, new ArrayList(), b));
            return;
        }
        boolean z = 0;
        String S0 = k96.D0().S0(lowerCase, true, false);
        if (lowerCase.equals(S0) || S0.length() == 0) {
            S0 = null;
        }
        int i2 = (S0 != null ? 1 : 0) + 1;
        String[] strArr = new String[i2];
        strArr[0] = lowerCase;
        if (S0 != null) {
            strArr[1] = S0;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLObject tLObject = (TLObject) arrayList.get(i3);
            if (tLObject instanceof TLRPC.ChatParticipant) {
                B1 = ((TLRPC.ChatParticipant) tLObject).user_id;
            } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                B1 = k27.B1(((TLRPC.ChannelParticipant) tLObject).peer);
            } else {
                i3++;
                z = 0;
            }
            TLRPC.User V1 = na7.q1(qb5Var.x.a).V1(Long.valueOf(B1));
            if (!l7c.D(V1)) {
                String lowerCase2 = l7c.r(V1).toLowerCase();
                String S02 = k96.D0().S0(lowerCase2, true, z);
                if (lowerCase2.equals(S02)) {
                    S02 = null;
                }
                int i4 = z;
                int i5 = i4;
                while (true) {
                    if (i4 < i2) {
                        String str2 = strArr[i4];
                        if (lowerCase2.startsWith(str2) || de9.t(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || de9.t(" ", str2, S02)))) {
                            i5 = 1;
                        } else {
                            String p = l7c.p(V1);
                            if (p != null && p.startsWith(str2)) {
                                i5 = 2;
                            }
                        }
                        if (i5 != 0) {
                            arrayList2.add(tLObject);
                            break;
                        }
                        i4++;
                    }
                }
            }
            i3++;
            z = 0;
        }
        gl.c3(new j45(qb5Var, i, arrayList2, b));
    }

    private final void e() {
        dd5 dd5Var = (dd5) this.c;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.d;
        int i = dd5Var.Q;
        ArrayList arrayList = dd5Var.R;
        if (this.b == dd5Var.W) {
            boolean isEmpty = arrayList.isEmpty();
            dd5Var.V = false;
            if (tLObject instanceof TLRPC.messages_Messages) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                    dd5Var.Z = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    dd5Var.Z = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                }
                dd5Var.c0 = messages_messages.next_rate;
                na7.q1(i).b4(messages_messages.users, false);
                na7.q1(i).V3(messages_messages.chats, false);
                for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                    k27 k27Var = new k27(i, messages_messages.messages.get(i2), false, true);
                    k27Var.J5(str, true);
                    arrayList.add(k27Var);
                }
                dd5Var.Y = arrayList.size() >= dd5Var.Z;
                dd5Var.X();
            } else {
                dd5Var.Y = true;
                dd5Var.Z = arrayList.size();
            }
            dd5Var.O(true);
            if (isEmpty) {
                ((kt9) dd5Var).f0.w0.g1(0, 0);
            }
        }
    }

    private final void f() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        cj3 cj3Var = (cj3) this.e;
        String str = LaunchActivity.C1;
        kk7.f(this.b).k(kk7.s, new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putLong("chat_id", chat.id);
        if (na7.q1(launchActivity.P).A(bundle, cj3Var, null, null)) {
            launchActivity.u0(new mu1(bundle), true, false);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:435:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:462:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0a33  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x09ed  */
    /* JADX WARN: Type inference failed for: r10v23, types: [int, short] */
    /* JADX WARN: Type inference failed for: r10v24, types: [int, short] */
    /* JADX WARN: Type inference failed for: r10v25, types: [int, short] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        String str;
        int i;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TL_bots.BotInfo botInfo;
        int i2;
        int i3;
        TLRPC.Dialog dialog;
        d dVar;
        int[] iArr;
        ar1 ar1Var;
        TLRPC.Document document;
        int i4;
        byte b = 24;
        byte b2 = 5;
        int i5 = 2;
        TLRPC.UserFull userFull = null;
        r11 = null;
        TLRPC.EncryptedChat encryptedChat = null;
        byte b3 = 1;
        ?? r13 = 0;
        switch (this.a) {
            case 0:
                hq6 hq6Var = (hq6) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i6 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers = (TLRPC.TL_messages_archivedStickers) tLObject;
                    hq6Var.c0[i6] = tL_messages_archivedStickers.count;
                    na7.q1(hq6Var.currentAccount).W3.edit().putInt(de9.k(i6, "archivedStickersCount"), tL_messages_archivedStickers.count).commit();
                    hq6Var.getNotificationCenter().k(88, Integer.valueOf(i6));
                    return;
                }
                return;
            case 1:
                na7 na7Var = (na7) this.c;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                int i7 = this.b;
                LongSparseIntArray longSparseIntArray = na7Var.x0;
                na7Var.x4(userFull2.user.id, userFull2.settings);
                long j = user.id;
                TLRPC.PeerNotifySettings peerNotifySettings = userFull2.notify_settings;
                wm7 wm7Var = na7Var.getNotificationsController().h0;
                wm7Var.getClass();
                if (peerNotifySettings != null) {
                    Utilities.e.c(new n30((Object) wm7Var, j, 0L, (Object) peerNotifySettings, (byte) 12));
                }
                TL_bots.BotInfo botInfo2 = userFull2.bot_info;
                if (botInfo2 instanceof TL_bots.TL_botInfo) {
                    botInfo2.user_id = user.id;
                    na7Var.getMediaDataController().G1(user.id, userFull2.bot_info);
                }
                int indexOfKey = longSparseIntArray.indexOfKey(user.id);
                if (userFull2.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(user.id, 1);
                        na7Var.getNotificationCenter().k(43, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    na7Var.getNotificationCenter().k(43, new Object[0]);
                }
                na7Var.b1.k(userFull2, user.id);
                long j2 = user.id;
                vf6 vf6Var = na7Var.R4;
                TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) vf6Var.f(j2);
                if (requirementToContact != null) {
                    TL_account.RequirementToContact q = l7c.q(userFull2);
                    if (!l7c.d(requirementToContact, q)) {
                        if (q == null) {
                            vf6Var.l(j2);
                        } else {
                            vf6Var.k(q, j2);
                        }
                        z = true;
                        na7Var.i4.M(user.id);
                        gta.v(na7Var.currentAccount, false).N(userFull2);
                        na7Var.h1.remove(Long.valueOf(user.id));
                        na7Var.i1.put(user.id, System.currentTimeMillis());
                        str = user.first_name + user.last_name + l7c.p(user);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(userFull2.user);
                        na7Var.b4(arrayList, false);
                        na7Var.getMessagesStorage().j1(arrayList, null, false, true);
                        if (str.equals(userFull2.user.first_name + userFull2.user.last_name + l7c.p(userFull2.user))) {
                            i = 2;
                            na7Var.getNotificationCenter().k(2, 1);
                        } else {
                            i = 2;
                        }
                        userProfilePhoto = userFull2.user.photo;
                        if (userProfilePhoto != null && userProfilePhoto.has_video) {
                            na7Var.getNotificationCenter().k(i, Integer.valueOf(i));
                        }
                        botInfo = userFull2.bot_info;
                        if (botInfo instanceof TL_bots.TL_botInfo) {
                            i2 = 2;
                            i3 = 0;
                        } else {
                            botInfo.user_id = userFull2.id;
                            i3 = 0;
                            i2 = 2;
                            na7Var.getNotificationCenter().k(66, userFull2.bot_info, Integer.valueOf(i7), Long.valueOf(user.id));
                        }
                        kk7 notificationCenter = na7Var.getNotificationCenter();
                        Object[] objArr = new Object[i2];
                        objArr[i3] = Long.valueOf(user.id);
                        objArr[1] = userFull2;
                        notificationCenter.k(67, objArr);
                        if (z) {
                            na7Var.getNotificationCenter().k(kk7.j3, new Object[i3]);
                        }
                        dialog = (TLRPC.Dialog) na7Var.R.f(user.id);
                        if (dialog == null) {
                            if ((userFull2.flags & 2048) != 0) {
                                int i8 = dialog.folder_id;
                                int i9 = userFull2.folder_id;
                                if (i8 != i9) {
                                    dialog.folder_id = i9;
                                    na7Var.Z4(null);
                                    na7Var.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                            if ((userFull2.flags & TLObject.FLAG_14) != 0) {
                                int i10 = dialog.ttl_period;
                                int i11 = userFull2.ttl_period;
                                if (i10 != i11) {
                                    dialog.ttl_period = i11;
                                    na7Var.getNotificationCenter().k(3, new Object[0]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z = false;
                na7Var.i4.M(user.id);
                gta.v(na7Var.currentAccount, false).N(userFull2);
                na7Var.h1.remove(Long.valueOf(user.id));
                na7Var.i1.put(user.id, System.currentTimeMillis());
                str = user.first_name + user.last_name + l7c.p(user);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(userFull2.user);
                na7Var.b4(arrayList2, false);
                na7Var.getMessagesStorage().j1(arrayList2, null, false, true);
                if (str.equals(userFull2.user.first_name + userFull2.user.last_name + l7c.p(userFull2.user))) {
                }
                userProfilePhoto = userFull2.user.photo;
                if (userProfilePhoto != null) {
                    na7Var.getNotificationCenter().k(i, Integer.valueOf(i));
                }
                botInfo = userFull2.bot_info;
                if (botInfo instanceof TL_bots.TL_botInfo) {
                }
                kk7 notificationCenter2 = na7Var.getNotificationCenter();
                Object[] objArr2 = new Object[i2];
                objArr2[i3] = Long.valueOf(user.id);
                objArr2[1] = userFull2;
                notificationCenter2.k(67, objArr2);
                if (z) {
                }
                dialog = (TLRPC.Dialog) na7Var.R.f(user.id);
                if (dialog == null) {
                }
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.c;
                int i12 = this.b;
                ti5 ti5Var = (ti5) this.d;
                Runnable runnable = (Runnable) this.e;
                Drawable drawable = ActionBarLayout.w1;
                si5 si5Var = actionBarLayout.e0;
                boolean z2 = false;
                int i13 = 0;
                while (i13 < i12) {
                    if (i13 == 0) {
                        dVar = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.b0) && actionBarLayout.V0.size() > 1) {
                            dVar = (d) oo1.m(i5, actionBarLayout.V0);
                        }
                        i13++;
                        i5 = 2;
                        r13 = 0;
                        z2 = z2;
                    }
                    if (dVar != null) {
                        if (ti5Var.m != null) {
                            if (actionBarLayout.f0 == null) {
                                m17 m17Var = new m17(r13, true, r13, si5Var);
                                actionBarLayout.f0 = m17Var;
                                m17Var.L = true;
                                m17 m17Var2 = new m17(1, true, r13, si5Var);
                                actionBarLayout.g0 = m17Var2;
                                m17Var2.L = true;
                            }
                            ku1 ku1Var = ti5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) si5Var.b;
                            sparseIntArray.clear();
                            int[] iArr2 = (int[]) si5Var.c;
                            int length = iArr2.length;
                            for (int i14 = r13; i14 < length; i14++) {
                                int i15 = iArr2[i14];
                                sparseIntArray.put(i15, ku1Var.k(i15, r13));
                            }
                        }
                        ArrayList<blb> themeDescriptions = dVar.getThemeDescriptions();
                        actionBarLayout.c(themeDescriptions);
                        Dialog dialog2 = dVar.visibleDialog;
                        if (dialog2 instanceof fx0) {
                            actionBarLayout.c(((fx0) dialog2).S());
                        }
                        if (i13 == 0) {
                            if (ti5Var.h != null) {
                                ku1 ku1Var2 = ti5Var.m;
                                if (ku1Var2 != null) {
                                    actionBarLayout.f0(ku1Var2);
                                }
                                ti5Var.h.run();
                            }
                            ku1 ku1Var3 = ti5Var.m;
                            actionBarLayout.p0 = r13;
                            actionBarLayout.q0 = ku1Var3;
                            int[] iArr3 = actionBarLayout.l0;
                            if (iArr3 != null) {
                                try {
                                    try {
                                        int min = Math.min(bkb.e5, iArr3.length);
                                        int[] iArr4 = actionBarLayout.m0;
                                        if (iArr4 == null || iArr4.length < min) {
                                            actionBarLayout.m0 = new int[min];
                                            actionBarLayout.n0 = new int[min];
                                            actionBarLayout.o0 = new int[min];
                                        }
                                        for (int i16 = r13; i16 < min; i16++) {
                                            int h = ku1Var3 != null ? ku1Var3.h(i16) : bkb.w0(null, i16, true);
                                            int i17 = actionBarLayout.l0[i16];
                                            if (h != i17 && ActionBarLayout.x(i16, i17, h)) {
                                                int[] iArr5 = actionBarLayout.m0;
                                                int i18 = actionBarLayout.p0;
                                                iArr5[i18] = i16;
                                                actionBarLayout.n0[i18] = actionBarLayout.l0[i16];
                                                actionBarLayout.o0[i18] = h;
                                                actionBarLayout.p0 = i18 + 1;
                                            }
                                        }
                                        iArr = null;
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                        actionBarLayout.p0 = 0;
                                        iArr = null;
                                    }
                                    actionBarLayout.l0 = iArr;
                                } catch (Throwable th) {
                                    actionBarLayout.l0 = null;
                                    throw th;
                                }
                            }
                        }
                        actionBarLayout.a(themeDescriptions);
                        Dialog dialog3 = dVar.visibleDialog;
                        if (dialog3 instanceof fx0) {
                            actionBarLayout.a(((fx0) dialog3).S());
                        }
                        z2 = true;
                    }
                    i13++;
                    i5 = 2;
                    r13 = 0;
                    z2 = z2;
                }
                if (z2) {
                    if (!ti5Var.e) {
                        int size = actionBarLayout.V0.size() - ((actionBarLayout.h || actionBarLayout.b0) ? 2 : 1);
                        for (int i19 = 0; i19 < size; i19++) {
                            d dVar2 = (d) actionBarLayout.V0.get(i19);
                            dVar2.clearViews();
                            dVar2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (ti5Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.i0.clear();
                        actionBarLayout.c0.clear();
                        actionBarLayout.d0.clear();
                        actionBarLayout.k0.clear();
                        actionBarLayout.p0 = 0;
                        actionBarLayout.q0 = null;
                        actionBarLayout.l0 = null;
                        actionBarLayout.j0 = null;
                        actionBarLayout.h0 = null;
                        eu1 eu1Var = ti5Var.j;
                        if (eu1Var != null) {
                            eu1Var.run();
                        }
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    int i20 = bkb.a;
                    bkb.lm = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    eu1 eu1Var2 = ti5Var.i;
                    if (eu1Var2 != null) {
                        eu1Var2.run();
                    }
                    hu1 hu1Var = ti5Var.k;
                    actionBarLayout.h0 = hu1Var;
                    if (hu1Var != null) {
                        ku1 ku1Var4 = hu1Var.a;
                        ku1Var4.G.A0.invalidate();
                        ku1Var4.t.K = 0.0f;
                        ku1Var4.u.K = 0.0f;
                        ku1Var4.t(0.0f);
                    }
                    actionBarLayout.s0.d();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.r0 = animatorSet;
                    animatorSet.addListener(new u5(actionBarLayout, ti5Var, b3));
                    actionBarLayout.r0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.r0.setDuration(ti5Var.l);
                    actionBarLayout.r0.start();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                eu euVar = (eu) this.c;
                int i21 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.e;
                euVar.a(0, false);
                ij.c0(i21, tL_error2, null, tL_channels_joinChannel, Boolean.TRUE);
                return;
            case 4:
                o oVar = (o) this.c;
                int i22 = this.b;
                ArrayList arrayList3 = (ArrayList) this.d;
                String str2 = (String) this.e;
                if (i22 == oVar.Y0) {
                    oVar.b0(true);
                    oVar.F = arrayList3;
                    oVar.G = str2;
                    oVar.v0[0].c.E.clear();
                    oVar.v0[0].b.h1();
                    oVar.U(0);
                    return;
                }
                return;
            case 5:
                sa6 sa6Var = (sa6) this.c;
                int i23 = this.b;
                String str3 = (String) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList arrayList5 = sa6Var.f;
                if (i23 == sa6Var.s) {
                    sa6Var.w = false;
                    sa6Var.h = str3;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    mg0 mg0Var = sa6Var.n;
                    if (mg0Var != null) {
                        mg0Var.b();
                    }
                    sa6Var.f();
                    return;
                }
                return;
            case 6:
                gl.c3(new nn6(this.c, this.e, (Object) ad7.Y(this.b).i0((ArrayList) this.d), (byte) 19));
                return;
            case 7:
                gl.c3(new nn6(ad7.Y(this.b).i0((ArrayList) this.c), (HashMap) this.d, (p8c) this.e, b));
                return;
            case 8:
                hv0 hv0Var = (hv0) this.c;
                int i24 = this.b;
                cv0 cv0Var = (cv0) this.d;
                ev0 ev0Var = (ev0) this.e;
                z3a.B(hv0Var.N).q0(x3a.g(y6c.h(hv0Var.N).f(), hv0Var.V.id, null, null, null, null, true, 0, 0));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", "sent");
                    hv0.t(i24, cv0Var, ev0Var, "phone_requested", jSONObject);
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 9:
                t81 t81Var = (t81) this.c;
                TLObject tLObject2 = (TLObject) this.e;
                int i25 = this.b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    na7.q1(i25).b4(tL_users_userFull.users, false);
                    na7.q1(i25).V3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull3 = userFull;
                rgc.m(user2, false, userFull3 != null && userFull3.video_calls_available, t81Var.getParentActivity(), userFull3, j5.a(i25));
                return;
            case 10:
                ((CameraView) this.c).lambda$createCamera$9(this.b, (CameraSession) this.d, (CameraView.CameraGLThread) this.e);
                return;
            case 11:
                mu1 mu1Var = (mu1) this.c;
                ad7 ad7Var = (ad7) this.d;
                int i26 = this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.e;
                long j3 = i26;
                try {
                    ArrayList arrayList6 = new ArrayList();
                    ad7Var.T(String.valueOf(j3), arrayList6, null);
                    if (!arrayList6.isEmpty()) {
                        encryptedChat = (TLRPC.EncryptedChat) arrayList6.get(0);
                    }
                } catch (Exception e3) {
                    ad7Var.n(e3, true);
                }
                mu1Var.h = encryptedChat;
                countDownLatch.countDown();
                return;
            case 12:
                mu1 mu1Var2 = (mu1) this.c;
                mu1Var2.getNotificationCenter().k(56, Long.valueOf(mu1Var2.l6), (ArrayList) this.d, Boolean.TRUE, (ArrayList) this.e, null, 0, Integer.valueOf(this.b), Boolean.valueOf(mu1Var2.g5));
                mu1Var2.P3 = null;
                return;
            case 13:
                mu1 mu1Var3 = (mu1) this.c;
                boolean[] zArr = (boolean[]) this.d;
                int i27 = this.b;
                mu1 mu1Var4 = (mu1) this.e;
                mu1Var3.getClass();
                if (zArr[0] || i27 != mu1Var3.Qc || !mu1Var3.U3 || mu1Var3.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                gl.d3(new vm1(mu1Var3, b), 200L);
                mu1Var3.presentFragment(mu1Var4);
                if (!mu1Var3.Q7() || mu1Var4.hideKeyboardOnShow() || (ar1Var = mu1Var4.a0) == null || ar1Var.getEditField() == null) {
                    return;
                }
                mu1Var4.a0.getEditField().requestFocus();
                return;
            case 14:
                g22 g22Var = (g22) this.c;
                int i28 = this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                k22 k22Var = g22Var.n;
                fu fuVar = k22Var.s;
                if (i28 == g22Var.h) {
                    if (i28 != -1) {
                        w39 adapter = fuVar.getAdapter();
                        g22 g22Var2 = k22Var.G;
                        if (adapter != g22Var2) {
                            fuVar.setAdapter(g22Var2);
                        }
                    }
                    g22Var.d = arrayList7;
                    g22Var.e = arrayList8;
                    g22Var.f();
                    return;
                }
                return;
            case 15:
                l52 l52Var = (l52) this.c;
                k52 k52Var = (k52) this.d;
                jm6 jm6Var = (jm6) this.e;
                int i29 = this.b;
                m52 m52Var = l52Var.Q;
                ValueAnimator valueAnimator = m52Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                m52Var.K = null;
                l52Var.H = 0.0f;
                l52Var.f(k52Var, jm6Var, i29);
                l52Var.j();
                l52Var.i(m52Var.Q, false);
                return;
            case 16:
                ij.D(((cs5) this.c).e, (wjb) this.d, new jh(this.b, (rb2) this.e, b2));
                return;
            case 17:
                qu2 qu2Var = (qu2) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                int i30 = this.b;
                int[] iArr6 = qu2Var.J;
                if (tL_error3 == null) {
                    TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject3;
                    qu2Var.getMessagesController().b4(privacyrules.users, false);
                    qu2Var.getMessagesController().V3(privacyrules.chats, false);
                    switch (i30) {
                        case 0:
                            qu2Var.K = privacyrules.rules;
                            break;
                        case 1:
                            qu2Var.L = privacyrules.rules;
                            break;
                        case 2:
                            qu2Var.M = privacyrules.rules;
                            break;
                        case 3:
                            qu2Var.N = privacyrules.rules;
                            break;
                        case 4:
                            qu2Var.O = privacyrules.rules;
                            break;
                        case 5:
                            qu2Var.R = privacyrules.rules;
                            break;
                        case 6:
                            qu2Var.S = privacyrules.rules;
                            break;
                        case 7:
                        case 10:
                        default:
                            qu2Var.T = privacyrules.rules;
                            break;
                        case 8:
                            qu2Var.U = privacyrules.rules;
                            break;
                        case 9:
                            qu2Var.P = privacyrules.rules;
                            break;
                        case 11:
                            qu2Var.V = privacyrules.rules;
                            break;
                        case 12:
                            qu2Var.W = privacyrules.rules;
                            break;
                        case 13:
                            qu2Var.X = privacyrules.rules;
                            break;
                        case 14:
                            qu2Var.Q = privacyrules.rules;
                            break;
                    }
                    iArr6[i30] = 2;
                } else {
                    iArr6[i30] = 0;
                }
                qu2Var.getNotificationCenter().k(47, new Object[0]);
                return;
            case 18:
                xv2 xv2Var = (xv2) this.c;
                o39 o39Var = (o39) this.d;
                int i31 = this.b;
                wjb wjbVar = (wjb) this.e;
                if (xv2Var.j != null) {
                    o39Var.setOnItemClickListener((c39) null);
                    o39Var.requestDisallowInterceptTouchEvent(true);
                    xv2Var.j = null;
                    xv2Var.l(gl.W(o39Var.getContext()));
                    xv2Var.i = false;
                    View view = xv2Var.h;
                    if (view instanceof xya) {
                        xya xyaVar = (xya) view;
                        TLRPC.Document sticker = xyaVar.getSticker();
                        s3a stickerPath = xyaVar.getStickerPath();
                        String V = k27.V(xyaVar.getSticker(), null, Integer.valueOf(xv2Var.r));
                        vv2 vv2Var = xv2Var.l;
                        xv2Var.i(sticker, stickerPath, V, vv2Var != null ? vv2Var.C(false) : null, null, i31, xyaVar.E, xyaVar.getParentObject(), xv2Var.c0, 0);
                        xyaVar.setScaled(true);
                    } else if (view instanceof uya) {
                        uya uyaVar = (uya) view;
                        TLRPC.Document sticker2 = uyaVar.getSticker();
                        vv2 vv2Var2 = xv2Var.l;
                        xv2Var.i(sticker2, null, null, vv2Var2 != null ? vv2Var2.C(false) : null, null, i31, false, uyaVar.getParentObject(), wjbVar, 0);
                        uyaVar.setScaled(true);
                        xv2Var.i = uyaVar.h;
                    } else if (view instanceof bw2) {
                        bw2 bw2Var = (bw2) view;
                        TLRPC.Document document2 = bw2Var.getDocument();
                        vv2 vv2Var3 = xv2Var.l;
                        xv2Var.i(document2, null, null, vv2Var3 != null ? vv2Var3.C(true) : null, bw2Var.getBotInlineResult(), i31, false, bw2Var.getBotInlineResult() != null ? bw2Var.getInlineBot() : bw2Var.getParentObject(), wjbVar, 0);
                        if (i31 != 1 || xv2Var.m) {
                            bw2Var.setScaled(true);
                        }
                    } else if (view instanceof ix3) {
                        TLRPC.Document document3 = ((ix3) view).getDocument();
                        if (document3 == null) {
                            return;
                        } else {
                            xv2Var.i(document3, null, k27.V(document3, null, Integer.valueOf(xv2Var.r)), null, null, i31, false, null, wjbVar, 0);
                        }
                    } else if (view instanceof c14) {
                        gm span = ((c14) view).getSpan();
                        if (span != null) {
                            TLRPC.Document document4 = span.document;
                            if (document4 == null) {
                                document4 = vl.e(xv2Var.r, span.getDocumentId());
                            }
                            document = document4;
                        } else {
                            document = null;
                        }
                        if (document == null) {
                            return;
                        } else {
                            xv2Var.i(document, null, k27.V(document, null, Integer.valueOf(xv2Var.r)), null, null, i31, false, null, wjbVar, 0);
                        }
                    } else {
                        if (!(view instanceof cbb)) {
                            return;
                        }
                        Drawable drawable2 = ((cbb) view).b;
                        TLRPC.Document document5 = drawable2 instanceof vl ? ((vl) drawable2).e : null;
                        if (document5 == null) {
                            return;
                        } else {
                            xv2Var.i(document5, null, k27.V(document5, null, Integer.valueOf(xv2Var.r)), null, null, i31, false, null, wjbVar, 0);
                        }
                    }
                    try {
                        xv2Var.h.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    vv2 vv2Var4 = xv2Var.l;
                    if (vv2Var4 != null) {
                        vv2Var4.q();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                int[] iArr7 = (int[]) this.c;
                Runnable[] runnableArr = (Runnable[]) this.d;
                int[] iArr8 = (int[]) this.e;
                int i32 = this.b;
                iArr7[0] = iArr7[0] + 1;
                Runnable runnable2 = runnableArr[0];
                if (runnable2 != null) {
                    gl.r(runnable2);
                    runnableArr[0] = null;
                }
                if (iArr8[0] >= 0) {
                    ConnectionsManager.getInstance(i32).cancelRequest(iArr8[0], true);
                    iArr8[0] = -1;
                    return;
                }
                return;
            case 20:
                bl3 bl3Var = (bl3) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                int i33 = this.b;
                l35 l35Var = (l35) this.e;
                ArrayList arrayList10 = bl3Var.L;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - bl3Var.o0 >= 300) {
                    bl3Var.o0 = elapsedRealtime;
                    int size2 = arrayList10.size();
                    int size3 = arrayList9.size();
                    int i34 = (arrayList9.isEmpty() && arrayList10.isEmpty()) ? 0 : size3 + size2;
                    int min2 = Math.min(3, size3) + size2;
                    int b4 = bl3Var.b();
                    boolean z3 = bl3Var.H0;
                    boolean z4 = b4 > ((z3 ? min2 : i34) + i33) + 1;
                    gb3 gb3Var = bl3Var.j0;
                    if (gb3Var != null) {
                        gb3Var.c = (int) (z4 ? 45L : 200L);
                        gb3Var.d = (int) (z4 ? 80L : 200L);
                        gb3Var.l = (int) (z4 ? 270L : 0L);
                    }
                    bl3Var.H0 = !z3;
                    l35Var.setRightTextMargin(16);
                    String M0 = k96.M0(bl3Var.H0 ? 2131745147 : 2131745148, null);
                    boolean z5 = bl3Var.H0;
                    ri riVar = l35Var.b;
                    riVar.c(M0, true, z5);
                    riVar.setVisibility(0);
                    bl3Var.p0 = null;
                    View view2 = (View) l35Var.getParent();
                    if (view2 instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) view2;
                        int i35 = (!bl3Var.H0 ? i33 + min2 : i34 + i33) + 1;
                        int i36 = 0;
                        while (true) {
                            if (i36 < recyclerView.getChildCount()) {
                                View childAt = recyclerView.getChildAt(i36);
                                if (RecyclerView.R(childAt) == i35) {
                                    bl3Var.p0 = childAt;
                                } else {
                                    i36++;
                                }
                            }
                        }
                    }
                    int i37 = i33 + min2;
                    int i38 = i37 + 1;
                    int max = Math.max(0, size3 - 3);
                    if (bl3Var.H0) {
                        bl3Var.q(i38, max);
                        if (z4) {
                            gl.d3(new awc(bl3Var, i37, b3), 350L);
                        } else {
                            bl3Var.g(i37);
                        }
                    } else {
                        bl3Var.g(i37);
                        bl3Var.p(i38, max);
                    }
                    wc3 wc3Var = bl3Var.q0;
                    if (wc3Var != null) {
                        gl.r(wc3Var);
                    }
                    if (!z4) {
                        bl3Var.n0 = false;
                        return;
                    }
                    bl3Var.n0 = true;
                    wc3 wc3Var2 = new wc3(bl3Var, view2, (byte) 10);
                    bl3Var.q0 = wc3Var2;
                    gl.d3(wc3Var2, 400L);
                    return;
                }
                return;
            case 21:
                a();
                return;
            case 22:
                DictationLid.c(this.b, (um3) this.d, (String) this.e, (byte[]) this.c);
                return;
            case 23:
                b();
                return;
            case 24:
                p15 p15Var = (p15) this.c;
                buc bucVar = (buc) this.d;
                int i39 = this.b;
                String str4 = (String) this.e;
                if (p15Var.c(bucVar, i39)) {
                    p15Var.f(str4);
                    return;
                }
                p15Var.d("ignoring stale socket callback; attempt=" + i39 + ", " + str4);
                return;
            case 25:
                c();
                return;
            case 26:
                d();
                return;
            case 27:
                e();
                return;
            case 28:
                f();
                return;
            default:
                h26 h26Var = (h26) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                int i40 = this.b;
                TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) this.e;
                o39 o39Var2 = h26Var.n1;
                ArrayList arrayList12 = h26Var.v2;
                arrayList12.clear();
                ArrayList arrayList13 = h26Var.u2;
                arrayList13.clear();
                arrayList12.addAll(arrayList11);
                for (int i41 = 0; i41 < i40; i41++) {
                    arrayList13.add(tL_messages_inactiveChats.chats.get(i41));
                }
                h26Var.D2 = false;
                h26Var.E2.b(h26Var.i2 + 4);
                int i42 = 0;
                while (true) {
                    if (i42 >= o39Var2.getChildCount()) {
                        i4 = 0;
                    } else if (o39Var2.getChildAt(i42) instanceof f26) {
                        i4 = o39Var2.getChildAt(i42).getTop();
                    } else {
                        i42++;
                    }
                }
                h26Var.x1();
                if (h26Var.g2 >= 0 && i4 != 0) {
                    ((t26) o39Var2.getLayoutManager()).g1(h26Var.g2 + 1, i4);
                }
                if (h26Var.H2 == null) {
                    h26Var.H2 = h26.f1(h26Var.c2, h26Var.a);
                }
                int max2 = Math.max(arrayList13.size(), h26Var.H2.e);
                e26 e26Var = h26Var.s2;
                if (e26Var != null) {
                    e26Var.j(max2, false);
                    h26Var.s2.setBagePosition(max2 / h26Var.H2.f);
                    e26 e26Var2 = h26Var.s2;
                    e26Var2.I = true;
                    e26Var2.requestLayout();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ tn6(n39 n39Var, int i, TLObject tLObject, String str, byte b) {
        this.a = b;
        this.c = n39Var;
        this.b = i;
        this.e = tLObject;
        this.d = str;
    }

    public /* synthetic */ tn6(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ tn6(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public /* synthetic */ tn6(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    public /* synthetic */ tn6(d dVar, TLObject tLObject, int i, Object obj, byte b) {
        this.a = b;
        this.c = dVar;
        this.e = tLObject;
        this.b = i;
        this.d = obj;
    }
}
