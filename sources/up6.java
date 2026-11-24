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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class up6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ up6(int i, ArrayList arrayList, HashMap hashMap, qac qacVar) {
        this.a = (byte) 7;
        this.b = i;
        this.c = arrayList;
        this.d = hashMap;
        this.e = qacVar;
    }

    private final void a() {
        ln4 ln4Var;
        d dVar = (d) this.c;
        TLObject tLObject = (TLObject) this.e;
        qac qacVar = (qac) this.d;
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
                    arrayList.add(Long.valueOf(pg3.n((TLRPC.Peer) vector.objects.get(i2))));
                } catch (Exception unused) {
                }
            }
            ln4Var = new ln4(dVar, i, arrayList);
        } else {
            ln4Var = new ln4(dVar, i, null);
        }
        ln4Var.w2 = qacVar;
        dVar.showDialog(ln4Var);
    }

    private final void b() {
        p35 p35Var = (p35) this.c;
        cwc cwcVar = (cwc) this.d;
        String str = (String) this.e;
        int i = this.b;
        if (p35Var.c(cwcVar, i)) {
            p35Var.f(str);
            return;
        }
        p35Var.d("ignoring stale socket callback; attempt=" + i + ", " + str);
    }

    private final void c() {
        JSONArray optJSONArray;
        o35 o35Var = (o35) this.c;
        cwc cwcVar = (cwc) this.d;
        JSONObject jSONObject = (JSONObject) this.e;
        p35 p35Var = o35Var.c;
        if (p35Var.c(cwcVar, this.b)) {
            c cVar = p35Var.c;
            String str = p35Var.b;
            o04 o04Var = p35Var.p;
            String optString = jSONObject.optString("status");
            if ((jSONObject.has("error") && !jSONObject.isNull("error")) || "error".equals(optString)) {
                StringBuilder sb = new StringBuilder("subscription error; id=");
                sb.append(jSONObject.optString("id"));
                sb.append(", code=");
                sb.append(jSONObject.optString("code"));
                wi8.z(", status=", optString, ", error=", sb);
                sb.append(jSONObject.opt("error"));
                sb.append(", message=");
                sb.append(jSONObject.optString("message"));
                p35Var.d(sb.toString());
                p35Var.f("subscription rejected");
                return;
            }
            if ("subscribed".equals(optString)) {
                p35Var.d("subscription acknowledgement: " + jSONObject);
                if (TextUtils.equals(p35Var.f, jSONObject.optString("id"))) {
                    p35Var.e = true;
                    p35Var.j = 0;
                    p35Var.l = SystemClock.elapsedRealtime();
                    gm.r(p35Var.o);
                    gm.r(o04Var);
                    gm.d3(o04Var, 15000L);
                    p35Var.d("subscription acknowledged; requested transactions and account state");
                    return;
                }
                return;
            }
            if ("pong".equals(optString) && "heartbeat".equals(jSONObject.optString("id"))) {
                p35Var.d("received pong");
                p35Var.l = SystemClock.elapsedRealtime();
                return;
            }
            if (!p35Var.e) {
                p35Var.d("ignoring message before subscription; type=" + jSONObject.optString(TeXSymbolParser.TYPE_ATTR) + ", status=" + optString);
                return;
            }
            String optString2 = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
            if (!"account_state_change".equals(optString2) || c.b(str, jSONObject.optString("account"))) {
                if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                    p35Var.d("ignoring message; type=" + optString2 + ", status=" + optString);
                    return;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("transactions");
                JSONObject optJSONObject = jSONObject.optJSONObject("state");
                StringBuilder p = wi8.p("event type=", optString2, ", finality=");
                p.append(jSONObject.optString("finality"));
                p.append(", trace=");
                p.append(jSONObject.optString("trace_external_hash_norm"));
                p.append(optJSONArray2 == null ? "" : ", transactions=" + optJSONArray2.length());
                p.append(optJSONObject != null ? ", balance=" + optJSONObject.optString("balance") : "");
                p35Var.d(p.toString());
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
                        p35Var.d("could not filter streaming transactions");
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d() {
        long B1;
        od5 od5Var = (od5) this.c;
        String str = (String) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        od5Var.getClass();
        String lowerCase = str.trim().toLowerCase();
        int length = lowerCase.length();
        int i = this.b;
        byte b = 1;
        if (length == 0) {
            gm.c3(new h65(od5Var, i, new ArrayList(), b));
            return;
        }
        boolean z = 0;
        String S0 = jb6.D0().S0(lowerCase, true, false);
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
                B1 = k47.B1(((TLRPC.ChannelParticipant) tLObject).peer);
            } else {
                i3++;
                z = 0;
            }
            TLRPC.User W1 = oc7.r1(od5Var.x.a).W1(Long.valueOf(B1));
            if (!m9c.D(W1)) {
                String lowerCase2 = m9c.r(W1).toLowerCase();
                String S02 = jb6.D0().S0(lowerCase2, true, z);
                if (lowerCase2.equals(S02)) {
                    S02 = null;
                }
                int i4 = z;
                int i5 = i4;
                while (true) {
                    if (i4 < i2) {
                        String str2 = strArr[i4];
                        if (lowerCase2.startsWith(str2) || hg9.s(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || hg9.s(" ", str2, S02)))) {
                            i5 = 1;
                        } else {
                            String p = m9c.p(W1);
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
        gm.c3(new h65(od5Var, i, arrayList2, b));
    }

    private final void e() {
        bf5 bf5Var = (bf5) this.c;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.d;
        int i = bf5Var.Q;
        ArrayList arrayList = bf5Var.R;
        if (this.b == bf5Var.W) {
            boolean isEmpty = arrayList.isEmpty();
            bf5Var.V = false;
            if (tLObject instanceof TLRPC.messages_Messages) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                    bf5Var.Z = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    bf5Var.Z = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                }
                bf5Var.c0 = messages_messages.next_rate;
                oc7.r1(i).d4(messages_messages.users, false);
                oc7.r1(i).X3(messages_messages.chats, false);
                for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                    k47 k47Var = new k47(i, messages_messages.messages.get(i2), false, true);
                    k47Var.J5(str, true);
                    arrayList.add(k47Var);
                }
                bf5Var.Y = arrayList.size() >= bf5Var.Z;
                bf5Var.X();
            } else {
                bf5Var.Y = true;
                bf5Var.Z = arrayList.size();
            }
            bf5Var.O(true);
            if (isEmpty) {
                ((mv9) bf5Var).f0.w0.g1(0, 0);
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:440:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:467:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x09ef  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r13v23, types: [int, short] */
    /* JADX WARN: Type inference failed for: r13v26, types: [int, short] */
    /* JADX WARN: Type inference failed for: r13v29, types: [int, short] */
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
        ms1 ms1Var;
        TLRPC.Document document;
        byte b = 5;
        int i4 = 2;
        TLRPC.UserFull userFull = null;
        r10 = null;
        TLRPC.EncryptedChat encryptedChat = null;
        byte b2 = 1;
        ?? r12 = 0;
        switch (this.a) {
            case 0:
                hs6 hs6Var = (hs6) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i5 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers = (TLRPC.TL_messages_archivedStickers) tLObject;
                    hs6Var.c0[i5] = tL_messages_archivedStickers.count;
                    oc7.r1(hs6Var.currentAccount).W3.edit().putInt(hg9.j(i5, "archivedStickersCount"), tL_messages_archivedStickers.count).commit();
                    hs6Var.getNotificationCenter().k(89, Integer.valueOf(i5));
                    return;
                }
                return;
            case 1:
                oc7 oc7Var = (oc7) this.c;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                int i6 = this.b;
                LongSparseIntArray longSparseIntArray = oc7Var.x0;
                oc7Var.z4(userFull2.user.id, userFull2.settings);
                long j = user.id;
                TLRPC.PeerNotifySettings peerNotifySettings = userFull2.notify_settings;
                ap7 ap7Var = oc7Var.getNotificationsController().h0;
                ap7Var.getClass();
                if (peerNotifySettings != null) {
                    Utilities.e.c(new n40((Object) ap7Var, j, 0L, (Object) peerNotifySettings, (byte) 12));
                }
                TL_bots.BotInfo botInfo2 = userFull2.bot_info;
                if (botInfo2 instanceof TL_bots.TL_botInfo) {
                    botInfo2.user_id = user.id;
                    oc7Var.getMediaDataController().G1(user.id, userFull2.bot_info);
                }
                int indexOfKey = longSparseIntArray.indexOfKey(user.id);
                if (userFull2.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(user.id, 1);
                        oc7Var.getNotificationCenter().k(44, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    oc7Var.getNotificationCenter().k(44, new Object[0]);
                }
                oc7Var.b1.k(userFull2, user.id);
                long j2 = user.id;
                vh6 vh6Var = oc7Var.T4;
                TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) vh6Var.f(j2);
                if (requirementToContact != null) {
                    TL_account.RequirementToContact q = m9c.q(userFull2);
                    if (!m9c.d(requirementToContact, q)) {
                        if (q == null) {
                            vh6Var.l(j2);
                        } else {
                            vh6Var.k(q, j2);
                        }
                        z = true;
                        oc7Var.i4.M(user.id);
                        jva.v(oc7Var.currentAccount, false).N(userFull2);
                        oc7Var.h1.remove(Long.valueOf(user.id));
                        oc7Var.i1.put(user.id, System.currentTimeMillis());
                        str = user.first_name + user.last_name + m9c.p(user);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(userFull2.user);
                        oc7Var.d4(arrayList, false);
                        oc7Var.getMessagesStorage().j1(arrayList, null, false, true);
                        if (str.equals(userFull2.user.first_name + userFull2.user.last_name + m9c.p(userFull2.user))) {
                            i = 2;
                            oc7Var.getNotificationCenter().k(2, 1);
                        } else {
                            i = 2;
                        }
                        userProfilePhoto = userFull2.user.photo;
                        if (userProfilePhoto != null && userProfilePhoto.has_video) {
                            oc7Var.getNotificationCenter().k(i, Integer.valueOf(i));
                        }
                        botInfo = userFull2.bot_info;
                        if (botInfo instanceof TL_bots.TL_botInfo) {
                            i2 = 2;
                            i3 = 0;
                        } else {
                            botInfo.user_id = userFull2.id;
                            i3 = 0;
                            i2 = 2;
                            oc7Var.getNotificationCenter().k(67, userFull2.bot_info, Integer.valueOf(i6), Long.valueOf(user.id));
                        }
                        nm7 notificationCenter = oc7Var.getNotificationCenter();
                        Object[] objArr = new Object[i2];
                        objArr[i3] = Long.valueOf(user.id);
                        objArr[1] = userFull2;
                        notificationCenter.k(68, objArr);
                        if (z) {
                            oc7Var.getNotificationCenter().k(nm7.k3, new Object[i3]);
                        }
                        dialog = (TLRPC.Dialog) oc7Var.R.f(user.id);
                        if (dialog == null) {
                            if ((userFull2.flags & 2048) != 0) {
                                int i7 = dialog.folder_id;
                                int i8 = userFull2.folder_id;
                                if (i7 != i8) {
                                    dialog.folder_id = i8;
                                    oc7Var.b5(null);
                                    oc7Var.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                            if ((userFull2.flags & TLObject.FLAG_14) != 0) {
                                int i9 = dialog.ttl_period;
                                int i10 = userFull2.ttl_period;
                                if (i9 != i10) {
                                    dialog.ttl_period = i10;
                                    oc7Var.getNotificationCenter().k(3, new Object[0]);
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
                oc7Var.i4.M(user.id);
                jva.v(oc7Var.currentAccount, false).N(userFull2);
                oc7Var.h1.remove(Long.valueOf(user.id));
                oc7Var.i1.put(user.id, System.currentTimeMillis());
                str = user.first_name + user.last_name + m9c.p(user);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(userFull2.user);
                oc7Var.d4(arrayList2, false);
                oc7Var.getMessagesStorage().j1(arrayList2, null, false, true);
                if (str.equals(userFull2.user.first_name + userFull2.user.last_name + m9c.p(userFull2.user))) {
                }
                userProfilePhoto = userFull2.user.photo;
                if (userProfilePhoto != null) {
                    oc7Var.getNotificationCenter().k(i, Integer.valueOf(i));
                }
                botInfo = userFull2.bot_info;
                if (botInfo instanceof TL_bots.TL_botInfo) {
                }
                nm7 notificationCenter2 = oc7Var.getNotificationCenter();
                Object[] objArr2 = new Object[i2];
                objArr2[i3] = Long.valueOf(user.id);
                objArr2[1] = userFull2;
                notificationCenter2.k(68, objArr2);
                if (z) {
                }
                dialog = (TLRPC.Dialog) oc7Var.R.f(user.id);
                if (dialog == null) {
                }
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.c;
                int i11 = this.b;
                sk5 sk5Var = (sk5) this.d;
                Runnable runnable = (Runnable) this.e;
                Drawable drawable = ActionBarLayout.w1;
                rk5 rk5Var = actionBarLayout.e0;
                boolean z2 = false;
                int i12 = 0;
                while (i12 < i11) {
                    if (i12 == 0) {
                        dVar = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.b0) && actionBarLayout.V0.size() > 1) {
                            dVar = (d) aq1.m(i4, actionBarLayout.V0);
                        }
                        i12++;
                        i4 = 2;
                        r12 = 0;
                        z2 = z2;
                    }
                    if (dVar != null) {
                        if (sk5Var.m != null) {
                            if (actionBarLayout.f0 == null) {
                                m37 m37Var = new m37(r12, true, r12, rk5Var);
                                actionBarLayout.f0 = m37Var;
                                m37Var.L = true;
                                m37 m37Var2 = new m37(1, true, r12, rk5Var);
                                actionBarLayout.g0 = m37Var2;
                                m37Var2.L = true;
                            }
                            wv1 wv1Var = sk5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) rk5Var.b;
                            sparseIntArray.clear();
                            int[] iArr2 = (int[]) rk5Var.c;
                            int length = iArr2.length;
                            for (int i13 = r12; i13 < length; i13++) {
                                int i14 = iArr2[i13];
                                sparseIntArray.put(i14, wv1Var.k(i14, r12));
                            }
                        }
                        ArrayList<cnb> themeDescriptions = dVar.getThemeDescriptions();
                        actionBarLayout.c(themeDescriptions);
                        Dialog dialog2 = dVar.visibleDialog;
                        if (dialog2 instanceof my0) {
                            actionBarLayout.c(((my0) dialog2).R());
                        }
                        if (i12 == 0) {
                            if (sk5Var.h != null) {
                                wv1 wv1Var2 = sk5Var.m;
                                if (wv1Var2 != null) {
                                    actionBarLayout.f0(wv1Var2);
                                }
                                sk5Var.h.run();
                            }
                            wv1 wv1Var3 = sk5Var.m;
                            actionBarLayout.p0 = r12;
                            actionBarLayout.q0 = wv1Var3;
                            int[] iArr3 = actionBarLayout.l0;
                            if (iArr3 != null) {
                                try {
                                    try {
                                        int min = Math.min(cmb.e5, iArr3.length);
                                        int[] iArr4 = actionBarLayout.m0;
                                        if (iArr4 == null || iArr4.length < min) {
                                            actionBarLayout.m0 = new int[min];
                                            actionBarLayout.n0 = new int[min];
                                            actionBarLayout.o0 = new int[min];
                                        }
                                        for (int i15 = r12; i15 < min; i15++) {
                                            int h = wv1Var3 != null ? wv1Var3.h(i15) : cmb.w0(null, i15, true);
                                            int i16 = actionBarLayout.l0[i15];
                                            if (h != i16 && ActionBarLayout.x(i15, i16, h)) {
                                                int[] iArr5 = actionBarLayout.m0;
                                                int i17 = actionBarLayout.p0;
                                                iArr5[i17] = i15;
                                                actionBarLayout.n0[i17] = actionBarLayout.l0[i15];
                                                actionBarLayout.o0[i17] = h;
                                                actionBarLayout.p0 = i17 + 1;
                                            }
                                        }
                                        iArr = null;
                                    } catch (Exception e) {
                                        fc4.g(e, true);
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
                        if (dialog3 instanceof my0) {
                            actionBarLayout.a(((my0) dialog3).R());
                        }
                        z2 = true;
                    }
                    i12++;
                    i4 = 2;
                    r12 = 0;
                    z2 = z2;
                }
                if (z2) {
                    if (!sk5Var.e) {
                        int size = actionBarLayout.V0.size() - ((actionBarLayout.h || actionBarLayout.b0) ? 2 : 1);
                        for (int i18 = 0; i18 < size; i18++) {
                            d dVar2 = (d) actionBarLayout.V0.get(i18);
                            dVar2.clearViews();
                            dVar2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (sk5Var.d) {
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
                        qv1 qv1Var = sk5Var.j;
                        if (qv1Var != null) {
                            qv1Var.run();
                        }
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    int i19 = cmb.a;
                    cmb.lm = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    qv1 qv1Var2 = sk5Var.i;
                    if (qv1Var2 != null) {
                        qv1Var2.run();
                    }
                    tv1 tv1Var = sk5Var.k;
                    actionBarLayout.h0 = tv1Var;
                    if (tv1Var != null) {
                        wv1 wv1Var4 = tv1Var.a;
                        wv1Var4.G.A0.invalidate();
                        wv1Var4.t.K = 0.0f;
                        wv1Var4.u.K = 0.0f;
                        wv1Var4.t(0.0f);
                    }
                    actionBarLayout.s0.d();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.r0 = animatorSet;
                    animatorSet.addListener(new u5(actionBarLayout, sk5Var, b2));
                    actionBarLayout.r0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.r0.setDuration(sk5Var.l);
                    actionBarLayout.r0.start();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                ev evVar = (ev) this.c;
                int i20 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.e;
                evVar.a(0, false);
                ik.c0(i20, tL_error2, null, tL_channels_joinChannel, Boolean.TRUE);
                return;
            case 4:
                o oVar = (o) this.c;
                int i21 = this.b;
                ArrayList arrayList3 = (ArrayList) this.d;
                String str2 = (String) this.e;
                if (i21 == oVar.Y0) {
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
                rc6 rc6Var = (rc6) this.c;
                int i22 = this.b;
                String str3 = (String) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList arrayList5 = rc6Var.f;
                if (i22 == rc6Var.s) {
                    rc6Var.w = false;
                    rc6Var.h = str3;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    nh0 nh0Var = rc6Var.n;
                    if (nh0Var != null) {
                        nh0Var.b();
                    }
                    rc6Var.f();
                    return;
                }
                return;
            case 6:
                gm.c3(new op6(this.c, this.e, (Object) cf7.Y(this.b).i0((ArrayList) this.d), (byte) 19));
                return;
            case 7:
                gm.c3(new op6((Object) cf7.Y(this.b).i0((ArrayList) this.c), this.d, this.e, (byte) 24));
                return;
            case 8:
                qw0 qw0Var = (qw0) this.c;
                int i23 = this.b;
                mw0 mw0Var = (mw0) this.d;
                ow0 ow0Var = (ow0) this.e;
                a6a.B(qw0Var.N).q0(y5a.g(z8c.h(qw0Var.N).f(), qw0Var.V.id, null, null, null, null, true, 0, 0));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", "sent");
                    qw0.t(i23, mw0Var, ow0Var, "phone_requested", jSONObject);
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 9:
                ca1 ca1Var = (ca1) this.c;
                TLObject tLObject2 = (TLObject) this.e;
                int i24 = this.b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    oc7.r1(i24).d4(tL_users_userFull.users, false);
                    oc7.r1(i24).X3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull3 = userFull;
                sic.m(user2, false, userFull3 != null && userFull3.video_calls_available, ca1Var.getParentActivity(), userFull3, j5.a(i24));
                return;
            case 10:
                ((CameraView) this.c).lambda$createCamera$9(this.b, (CameraSession) this.d, (CameraView.CameraGLThread) this.e);
                return;
            case 11:
                yv1 yv1Var = (yv1) this.c;
                cf7 cf7Var = (cf7) this.d;
                int i25 = this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.e;
                long j3 = i25;
                try {
                    ArrayList arrayList6 = new ArrayList();
                    cf7Var.T(String.valueOf(j3), arrayList6, null);
                    if (!arrayList6.isEmpty()) {
                        encryptedChat = (TLRPC.EncryptedChat) arrayList6.get(0);
                    }
                } catch (Exception e3) {
                    cf7Var.n(e3, true);
                }
                yv1Var.h = encryptedChat;
                countDownLatch.countDown();
                return;
            case 12:
                yv1 yv1Var2 = (yv1) this.c;
                yv1Var2.getNotificationCenter().k(57, Long.valueOf(yv1Var2.l6), (ArrayList) this.d, Boolean.TRUE, (ArrayList) this.e, null, 0, Integer.valueOf(this.b), Boolean.valueOf(yv1Var2.g5));
                yv1Var2.P3 = null;
                return;
            case 13:
                yv1 yv1Var3 = (yv1) this.c;
                boolean[] zArr = (boolean[]) this.d;
                int i26 = this.b;
                yv1 yv1Var4 = (yv1) this.e;
                yv1Var3.getClass();
                if (zArr[0] || i26 != yv1Var3.ad || !yv1Var3.U3 || yv1Var3.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                gm.d3(new ho1(yv1Var3, (byte) 28), 200L);
                yv1Var3.presentFragment(yv1Var4);
                if (!yv1Var3.Y7() || yv1Var4.hideKeyboardOnShow() || (ms1Var = yv1Var4.a0) == null || ms1Var.getEditField() == null) {
                    return;
                }
                yv1Var4.a0.getEditField().requestFocus();
                return;
            case 14:
                s32 s32Var = (s32) this.c;
                int i27 = this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                w32 w32Var = s32Var.n;
                fv fvVar = w32Var.s;
                if (i27 == s32Var.h) {
                    if (i27 != -1) {
                        y59 adapter = fvVar.getAdapter();
                        s32 s32Var2 = w32Var.G;
                        if (adapter != s32Var2) {
                            fvVar.setAdapter(s32Var2);
                        }
                    }
                    s32Var.d = arrayList7;
                    s32Var.e = arrayList8;
                    s32Var.f();
                    return;
                }
                return;
            case 15:
                w62 w62Var = (w62) this.c;
                v62 v62Var = (v62) this.d;
                jo6 jo6Var = (jo6) this.e;
                int i28 = this.b;
                x62 x62Var = w62Var.Q;
                ValueAnimator valueAnimator = x62Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                x62Var.K = null;
                w62Var.H = 0.0f;
                w62Var.f(v62Var, jo6Var, i28);
                w62Var.j();
                w62Var.i(x62Var.Q, false);
                return;
            case 16:
                ik.D(((bu5) this.c).e, (ylb) this.d, new ji(this.b, (cd2) this.e, b));
                return;
            case 17:
                bw2 bw2Var = (bw2) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                int i29 = this.b;
                int[] iArr6 = bw2Var.J;
                if (tL_error3 == null) {
                    TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject3;
                    bw2Var.getMessagesController().d4(privacyrules.users, false);
                    bw2Var.getMessagesController().X3(privacyrules.chats, false);
                    switch (i29) {
                        case 0:
                            bw2Var.K = privacyrules.rules;
                            break;
                        case 1:
                            bw2Var.L = privacyrules.rules;
                            break;
                        case 2:
                            bw2Var.M = privacyrules.rules;
                            break;
                        case 3:
                            bw2Var.N = privacyrules.rules;
                            break;
                        case 4:
                            bw2Var.O = privacyrules.rules;
                            break;
                        case 5:
                            bw2Var.R = privacyrules.rules;
                            break;
                        case 6:
                            bw2Var.S = privacyrules.rules;
                            break;
                        case 7:
                        case 10:
                        default:
                            bw2Var.T = privacyrules.rules;
                            break;
                        case 8:
                            bw2Var.U = privacyrules.rules;
                            break;
                        case 9:
                            bw2Var.P = privacyrules.rules;
                            break;
                        case 11:
                            bw2Var.V = privacyrules.rules;
                            break;
                        case 12:
                            bw2Var.W = privacyrules.rules;
                            break;
                        case 13:
                            bw2Var.X = privacyrules.rules;
                            break;
                        case 14:
                            bw2Var.Q = privacyrules.rules;
                            break;
                    }
                    iArr6[i29] = 2;
                } else {
                    iArr6[i29] = 0;
                }
                bw2Var.getNotificationCenter().k(48, new Object[0]);
                return;
            case 18:
                hx2 hx2Var = (hx2) this.c;
                r59 r59Var = (r59) this.d;
                int i30 = this.b;
                ylb ylbVar = (ylb) this.e;
                if (hx2Var.j != null) {
                    r59Var.setOnItemClickListener((f59) null);
                    r59Var.requestDisallowInterceptTouchEvent(true);
                    hx2Var.j = null;
                    hx2Var.l(gm.W(r59Var.getContext()));
                    hx2Var.i = false;
                    View view = hx2Var.h;
                    if (view instanceof y0b) {
                        y0b y0bVar = (y0b) view;
                        TLRPC.Document sticker = y0bVar.getSticker();
                        t5a stickerPath = y0bVar.getStickerPath();
                        String V = k47.V(y0bVar.getSticker(), null, Integer.valueOf(hx2Var.r));
                        fx2 fx2Var = hx2Var.l;
                        hx2Var.i(sticker, stickerPath, V, fx2Var != null ? fx2Var.E(false) : null, null, i30, y0bVar.E, y0bVar.getParentObject(), hx2Var.c0, 0);
                        y0bVar.setScaled(true);
                    } else if (view instanceof v0b) {
                        v0b v0bVar = (v0b) view;
                        TLRPC.Document sticker2 = v0bVar.getSticker();
                        fx2 fx2Var2 = hx2Var.l;
                        hx2Var.i(sticker2, null, null, fx2Var2 != null ? fx2Var2.E(false) : null, null, i30, false, v0bVar.getParentObject(), ylbVar, 0);
                        v0bVar.setScaled(true);
                        hx2Var.i = v0bVar.h;
                    } else if (view instanceof lx2) {
                        lx2 lx2Var = (lx2) view;
                        TLRPC.Document document2 = lx2Var.getDocument();
                        fx2 fx2Var3 = hx2Var.l;
                        hx2Var.i(document2, null, null, fx2Var3 != null ? fx2Var3.E(true) : null, lx2Var.getBotInlineResult(), i30, false, lx2Var.getBotInlineResult() != null ? lx2Var.getInlineBot() : lx2Var.getParentObject(), ylbVar, 0);
                        if (i30 != 1 || hx2Var.m) {
                            lx2Var.setScaled(true);
                        }
                    } else if (view instanceof ty3) {
                        TLRPC.Document document3 = ((ty3) view).getDocument();
                        if (document3 == null) {
                            return;
                        } else {
                            hx2Var.i(document3, null, k47.V(document3, null, Integer.valueOf(hx2Var.r)), null, null, i30, false, null, ylbVar, 0);
                        }
                    } else if (view instanceof n24) {
                        gn span = ((n24) view).getSpan();
                        if (span != null) {
                            TLRPC.Document document4 = span.document;
                            if (document4 == null) {
                                document4 = vm.e(hx2Var.r, span.getDocumentId());
                            }
                            document = document4;
                        } else {
                            document = null;
                        }
                        if (document == null) {
                            return;
                        } else {
                            hx2Var.i(document, null, k47.V(document, null, Integer.valueOf(hx2Var.r)), null, null, i30, false, null, ylbVar, 0);
                        }
                    } else {
                        if (!(view instanceof edb)) {
                            return;
                        }
                        Drawable drawable2 = ((edb) view).b;
                        TLRPC.Document document5 = drawable2 instanceof vm ? ((vm) drawable2).e : null;
                        if (document5 == null) {
                            return;
                        } else {
                            hx2Var.i(document5, null, k47.V(document5, null, Integer.valueOf(hx2Var.r)), null, null, i30, false, null, ylbVar, 0);
                        }
                    }
                    try {
                        hx2Var.h.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    fx2 fx2Var4 = hx2Var.l;
                    if (fx2Var4 != null) {
                        fx2Var4.q();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                int[] iArr7 = (int[]) this.c;
                Runnable[] runnableArr = (Runnable[]) this.d;
                int[] iArr8 = (int[]) this.e;
                int i31 = this.b;
                iArr7[0] = iArr7[0] + 1;
                Runnable runnable2 = runnableArr[0];
                if (runnable2 != null) {
                    gm.r(runnable2);
                    runnableArr[0] = null;
                }
                if (iArr8[0] >= 0) {
                    ConnectionsManager.getInstance(i31).cancelRequest(iArr8[0], true);
                    iArr8[0] = -1;
                    return;
                }
                return;
            case 20:
                mm3 mm3Var = (mm3) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                int i32 = this.b;
                l55 l55Var = (l55) this.e;
                ArrayList arrayList10 = mm3Var.L;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - mm3Var.o0 >= 300) {
                    mm3Var.o0 = elapsedRealtime;
                    int size2 = arrayList10.size();
                    int size3 = arrayList9.size();
                    int i33 = (arrayList9.isEmpty() && arrayList10.isEmpty()) ? 0 : size3 + size2;
                    int min2 = Math.min(3, size3) + size2;
                    int b3 = mm3Var.b();
                    boolean z3 = mm3Var.H0;
                    boolean z4 = b3 > ((z3 ? min2 : i33) + i32) + 1;
                    sc3 sc3Var = mm3Var.j0;
                    if (sc3Var != null) {
                        sc3Var.c = (int) (z4 ? 45L : 200L);
                        sc3Var.d = (int) (z4 ? 80L : 200L);
                        sc3Var.l = (int) (z4 ? 270L : 0L);
                    }
                    mm3Var.H0 = !z3;
                    l55Var.setRightTextMargin(16);
                    String M0 = jb6.M0(mm3Var.H0 ? 2131745073 : 2131745074, null);
                    boolean z5 = mm3Var.H0;
                    rj rjVar = l55Var.b;
                    rjVar.c(M0, true, z5);
                    rjVar.setVisibility(0);
                    mm3Var.p0 = null;
                    View view2 = (View) l55Var.getParent();
                    if (view2 instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) view2;
                        int i34 = (!mm3Var.H0 ? i32 + min2 : i33 + i32) + 1;
                        int i35 = 0;
                        while (true) {
                            if (i35 < recyclerView.getChildCount()) {
                                View childAt = recyclerView.getChildAt(i35);
                                if (RecyclerView.R(childAt) == i34) {
                                    mm3Var.p0 = childAt;
                                } else {
                                    i35++;
                                }
                            }
                        }
                    }
                    int i36 = i32 + min2;
                    int i37 = i36 + 1;
                    int max = Math.max(0, size3 - 3);
                    if (mm3Var.H0) {
                        mm3Var.q(i37, max);
                        if (z4) {
                            gm.d3(new bm3(mm3Var, i36, 0 == true ? (byte) 1 : (byte) 0), 350L);
                        } else {
                            mm3Var.g(i36);
                        }
                    } else {
                        mm3Var.g(i36);
                        mm3Var.p(i37, max);
                    }
                    rd3 rd3Var = mm3Var.q0;
                    if (rd3Var != null) {
                        gm.r(rd3Var);
                    }
                    if (!z4) {
                        mm3Var.n0 = false;
                        return;
                    }
                    mm3Var.n0 = true;
                    rd3 rd3Var2 = new rd3(mm3Var, view2, (byte) 11);
                    mm3Var.q0 = rd3Var2;
                    gm.d3(rd3Var2, 400L);
                    return;
                }
                return;
            case 21:
                ov9 ov9Var = (ov9) this.c;
                int i38 = this.b;
                TLObject tLObject4 = (TLObject) this.e;
                String str4 = (String) this.d;
                int i39 = ov9Var.t0;
                if (i38 == ov9Var.e0 && (tLObject4 instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject4;
                    ov9Var.w = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    ov9Var.x = messages_messages.next_rate;
                    ov9Var.E = str4;
                    oc7.r1(i39).d4(messages_messages.users, false);
                    oc7.r1(i39).X3(messages_messages.chats, false);
                    for (int i40 = 0; i40 < messages_messages.messages.size(); i40++) {
                        ov9Var.y.add(new k47(i39, messages_messages.messages.get(i40), false, true));
                    }
                    uj3 uj3Var = ov9Var.V;
                    if (uj3Var != null) {
                        uj3Var.d(ov9Var.E0 > 0, true);
                    }
                    ov9Var.f();
                    return;
                }
                return;
            case 22:
                DictationLid.c(this.b, (eo3) this.d, (String) this.e, (byte[]) this.c);
                return;
            case 23:
                na4 na4Var = (na4) this.c;
                int i41 = this.b;
                da4 da4Var = (da4) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                if (i41 == na4Var.k && na4Var.f && da4Var != null) {
                    da4Var.run();
                }
                na4Var.a(i41, -5, arrayList11);
                return;
            case 24:
                a();
                return;
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                d();
                return;
            case 28:
                e();
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                int i42 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                nk3 nk3Var = (nk3) this.e;
                String str5 = LaunchActivity.C1;
                nm7.f(i42).k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (oc7.r1(launchActivity.P).A(bundle, nk3Var, null, null)) {
                    launchActivity.u0(new yv1(bundle), true, false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ up6(q59 q59Var, int i, TLObject tLObject, String str, byte b) {
        this.a = b;
        this.c = q59Var;
        this.b = i;
        this.e = tLObject;
        this.d = str;
    }

    public /* synthetic */ up6(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ up6(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public /* synthetic */ up6(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    public /* synthetic */ up6(d dVar, TLObject tLObject, int i, Object obj, byte b) {
        this.a = b;
        this.c = dVar;
        this.e = tLObject;
        this.b = i;
        this.d = obj;
    }
}
