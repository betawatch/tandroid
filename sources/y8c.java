// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class y8c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y8c(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        bmb D0;
        r3 = null;
        r3 = null;
        o07 o07Var = null;
        byte b = 0;
        switch (this.a) {
            case 0:
                z8c z8cVar = (z8c) this.c;
                boolean z = this.b;
                if (z8cVar.b) {
                    synchronized (z8cVar.a) {
                        try {
                            SharedPreferences.Editor edit = z8cVar.j().edit();
                            if (z8cVar.currentAccount == 0) {
                                edit.putInt("selectedAccount", z8c.t0);
                            }
                            edit.putBoolean("registeredForPush", z8cVar.d);
                            edit.putInt("lastSendMessageId", z8cVar.e);
                            edit.putInt("contactsSavedCount", z8cVar.h);
                            edit.putInt("lastBroadcastId", z8cVar.f);
                            edit.putInt("lastContactsSyncTime", z8cVar.r);
                            edit.putInt("lastHintsSyncTime", z8cVar.s);
                            edit.putBoolean("draftsLoaded", z8cVar.w);
                            edit.putBoolean("unreadDialogsLoaded", z8cVar.x);
                            edit.putInt("ratingLoadTime", z8cVar.E);
                            edit.putInt("botRatingLoadTime", z8cVar.F);
                            edit.putInt("botGuestRatingLoadTime", z8cVar.G);
                            edit.putInt("webappRatingLoadTime", z8cVar.H);
                            edit.putBoolean("contactsReimported", z8cVar.I);
                            edit.putInt("loginTime", z8cVar.Z);
                            edit.putBoolean("syncContacts", z8cVar.V);
                            edit.putBoolean("showCallsTab", z8cVar.X);
                            edit.putBoolean("suggestContacts", z8cVar.W);
                            edit.putBoolean("hasSecureData", z8cVar.Y);
                            edit.putBoolean("notificationsSettingsLoaded4", z8cVar.T);
                            edit.putBoolean("notificationsSignUpSettingsLoaded", z8cVar.U);
                            edit.putLong("autoDownloadConfigLoadTime", z8cVar.b0);
                            edit.putBoolean("hasValidDialogLoadIds", z8cVar.J);
                            edit.putInt("sharingMyLocationUntil", z8cVar.R);
                            edit.putInt("lastMyLocationShareTime", z8cVar.S);
                            edit.putBoolean("filtersLoaded", z8cVar.Q);
                            edit.putString("premiumGiftsStickerPack", z8cVar.c0);
                            edit.putLong("lastUpdatedPremiumGiftsStickerPack", z8cVar.g0);
                            edit.putString("genericAnimationsStickerPack", z8cVar.e0);
                            edit.putLong("lastUpdatedGenericAnimations", z8cVar.i0);
                            edit.putInt("6migrateOffsetId", z8cVar.K);
                            if (z8cVar.K != -1) {
                                edit.putInt("6migrateOffsetDate", z8cVar.L);
                                edit.putLong("6migrateOffsetUserId", z8cVar.M);
                                edit.putLong("6migrateOffsetChatId", z8cVar.N);
                                edit.putLong("6migrateOffsetChannelId", z8cVar.O);
                                edit.putLong("6migrateOffsetAccess", z8cVar.P);
                            }
                            TLRPC.TL_help_termsOfService tL_help_termsOfService = z8cVar.a0;
                            if (tL_help_termsOfService != null) {
                                try {
                                    SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                    z8cVar.a0.serializeToStream(serializedData);
                                    edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                    serializedData.cleanup();
                                } catch (Exception unused) {
                                }
                            } else {
                                edit.remove("terms");
                            }
                            gda.x();
                            if (z8cVar.y != null) {
                                SerializedData serializedData2 = new SerializedData();
                                z8cVar.y.serializeToStream(serializedData2);
                                edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                serializedData2.cleanup();
                            } else {
                                edit.remove("tmpPassword");
                            }
                            if (z8cVar.c == null) {
                                edit.remove("user");
                            } else if (z) {
                                SerializedData serializedData3 = new SerializedData();
                                z8cVar.c.serializeToStream(serializedData3);
                                edit.putString("user", Base64.encodeToString(serializedData3.toByteArray(), 0));
                                serializedData3.cleanup();
                            }
                            edit.apply();
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                    }
                    return;
                }
                return;
            case 1:
                a1 a1Var = (a1) this.c;
                boolean z2 = this.b;
                a1Var.L2 = null;
                a1Var.J2 = z2;
                if (z2) {
                    a1Var.K2 = SystemClock.uptimeMillis();
                }
                a1Var.B2.setLoading(z2);
                return;
            case 2:
                r7 r7Var = (r7) this.c;
                boolean z3 = this.b;
                r7Var.M = null;
                if (r7Var.getParent() != null) {
                    r7Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (z3) {
                    r7Var.performHapticFeedback(0);
                }
                r7Var.U(null, null);
                r7Var.r0 = true;
                return;
            case 3:
                lx6 lx6Var = (lx6) this.c;
                boolean z4 = this.b;
                o40 o40Var = (o40) lx6Var.c;
                String str = hac.a;
                h74 h74Var = ((c74) o40Var).a;
                if (h74Var.d0 != z4) {
                    h74Var.d0 = z4;
                    h74Var.m.e(23, new z64(r5 ? (byte) 1 : (byte) 0, z4));
                    return;
                }
                return;
            case 4:
                gs0 gs0Var = (gs0) this.c;
                boolean z5 = this.b;
                kea keaVar = gs0Var.a0;
                if (z5) {
                    new js0(keaVar.a, jb6.M0(2131746426, null), new mf2(keaVar, r4)).show();
                    return;
                } else {
                    keaVar.b(gs0Var.a.E);
                    return;
                }
            case 5:
                wx0 wx0Var = (wx0) this.c;
                boolean z6 = this.b;
                ux0 ux0Var = wx0Var.F;
                ox0 ox0Var = wx0Var.E;
                if (ox0Var.getWebView() != null) {
                    ox0Var.getWebView().animate().cancel();
                    ox0Var.getWebView().animate().alpha(0.0f).start();
                }
                ux0Var.setLoadProgress(0.0f);
                ux0Var.setAlpha(1.0f);
                ux0Var.setVisibility(0);
                ox0Var.setBotUser(z6 ? null : oc7.r1(wx0Var.I).W1(Long.valueOf(wx0Var.J)));
                if (!z6) {
                    ox0Var.p(wx0Var.I, wx0Var.J);
                }
                nm7.f(ox0Var.N).d(new bv0(ox0Var, r5 ? (byte) 1 : (byte) 0));
                return;
            case 6:
                f11 f11Var = (f11) this.c;
                boolean z7 = this.b;
                w01 w01Var = f11Var.d;
                boolean z8 = !z7;
                w01Var.getClass();
                w01Var.y = z8;
                return;
            case 7:
                ((CameraController) this.c).lambda$recordVideo$11(this.b);
                return;
            case 8:
                l11.u((Context) this.c, jb6.M0(this.b ? 2131752994 : 2131748149, null));
                return;
            case 9:
                ju1 ju1Var = (ju1) this.c;
                boolean z9 = this.b;
                fdb fdbVar = ju1Var.b.s1;
                if (fdbVar == null || !z9) {
                    return;
                }
                fdbVar.setVisibility(8);
                return;
            case 10:
                j92 j92Var = (j92) this.c;
                if (this.b) {
                    ((n92) j92Var.x.c).w.setVisibility(4);
                    return;
                }
                return;
            case 11:
                ba2 ba2Var = (ba2) this.c;
                ba2Var.x0.autotranslation = this.b;
                ba2Var.getMessagesController().V3(ba2Var.x0, false);
                return;
            case 12:
                if2 if2Var = (if2) this.c;
                boolean z10 = this.b;
                gf2 gf2Var = if2Var.q1;
                if (gf2Var == null || gf2Var.d == null || if2Var.J) {
                    return;
                }
                if2Var.O0(z10, true);
                if (if2Var.F1 != null) {
                    if2Var.I1 = true;
                    TLRPC.WallPaper wallPaper = if2Var.J0() ? null : if2Var.r1.g;
                    tz3 tz3Var = if2Var.F1.a;
                    boolean z11 = tz3Var.a;
                    wv1 wv1Var = if2Var.r1;
                    if (z11) {
                        wv1Var.q(null, wallPaper, false, Boolean.valueOf(z10), false);
                    } else {
                        wv1Var.q(tz3Var, wallPaper, false, Boolean.valueOf(z10), false);
                    }
                }
                if (gm.O1() && (D0 = if2.D0(z10)) != null && D0 != cmb.I) {
                    if2Var.c2 = z10 != if2Var.t1;
                    if2Var.S0(D0);
                }
                if (gf2Var.d != null) {
                    while (b < gf2Var.d.size()) {
                        ((hf2) gf2Var.d.get(b)).c = z10 ? 1 : 0;
                        b++;
                    }
                    gf2Var.f();
                    return;
                }
                return;
            case 13:
                ((xp2) this.c).f(this.b, false);
                return;
            case 14:
                ((ConnectionsManager) this.c).lambda$setIsUpdating$22(this.b);
                return;
            case 15:
                nk3 nk3Var = (nk3) this.c;
                ik.J(nk3Var.getParentActivity(), this.b ? nk3Var.getUserConfig().e() : -1L, new pj3(nk3Var), nk3Var.getResourceProvider());
                return;
            case 16:
                mz3 mz3Var = (mz3) this.c;
                if (this.b) {
                    return;
                }
                mz3Var.E.setVisibility(8);
                return;
            case 17:
                bc4 bc4Var = (bc4) this.c;
                boolean z12 = this.b;
                Iterator it = bc4Var.h.entrySet().iterator();
                while (true) {
                    byte b2 = 2;
                    byte b3 = 18;
                    if (!it.hasNext()) {
                        Iterator it2 = bc4Var.n.entrySet().iterator();
                        while (it2.hasNext()) {
                            qd4 qd4Var = (qd4) ((Map.Entry) it2.next()).getValue();
                            if (qd4Var.m == 1) {
                                Utilities.d.c(new y8c(b3, qd4Var, z12));
                                gm.c3(new md4(qd4Var, b2));
                            }
                        }
                        return;
                    }
                    qd4 qd4Var2 = (qd4) ((Map.Entry) it.next()).getValue();
                    if (qd4Var2.m == 1) {
                        Utilities.d.c(new y8c(b3, qd4Var2, z12));
                        gm.c3(new md4(qd4Var2, b2));
                    }
                }
            case 18:
                qd4 qd4Var3 = (qd4) this.c;
                boolean z13 = this.b;
                SparseIntArray sparseIntArray = qd4Var3.p;
                if (qd4Var3.i != z13) {
                    qd4Var3.i = z13;
                    if (e21.a) {
                        fc4.b("network changed to slow = " + qd4Var3.i);
                    }
                    for (int i = 0; i < sparseIntArray.size(); i++) {
                        ConnectionsManager.getInstance(qd4Var3.a).cancelRequest(sparseIntArray.valueAt(i), true);
                    }
                    sparseIntArray.clear();
                    qd4Var3.b();
                    qd4Var3.b = false;
                    qd4Var3.c = false;
                    qd4Var3.k = 0;
                    qd4Var3.r = 0;
                    qd4Var3.v = 0L;
                    qd4Var3.w = 0L;
                    qd4Var3.x = 0;
                    qd4Var3.y = null;
                    qd4Var3.z = null;
                    qd4Var3.A = null;
                    qd4Var3.K = 0;
                    Arrays.fill(qd4Var3.g, 0);
                    qd4Var3.N = 0;
                    qd4Var3.P = false;
                    qd4Var3.Q.clear();
                    qd4Var3.d++;
                    r4 = qd4Var3.i ? (byte) 1 : (byte) 8;
                    for (int i2 = 0; i2 < r4; i2++) {
                        qd4Var3.d();
                    }
                    return;
                }
                return;
            case 19:
                me4 me4Var = (me4) this.c;
                me4Var.c0(me4Var.P, this.b);
                return;
            case 20:
                ln4 ln4Var = (ln4) this.c;
                ln4Var.Z0(ln4Var.t2, this.b);
                return;
            case 21:
                pt4 pt4Var = (pt4) this.c;
                if (this.b) {
                    return;
                }
                pt4Var.J.setVisibility(8);
                return;
            case 22:
                re5 re5Var = (re5) this.c;
                if (this.b) {
                    return;
                }
                re5Var.r.setVisibility(8);
                return;
            case 23:
                ((t96) this.c).b.setVisibility(this.b ? (byte) 0 : (byte) 8);
                return;
            case 24:
                pc6 pc6Var = (pc6) this.c;
                if (this.b) {
                    return;
                }
                pc6Var.b.setVisibility(8);
                return;
            case 25:
                dd6 dd6Var = (dd6) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    dd6Var.L = Boolean.FALSE;
                }
                if (dd6Var.b.isEmpty()) {
                    return;
                }
                if (!z14) {
                    dd6Var.p();
                    return;
                }
                try {
                    ((in3) a.i()).getLastLocation(new xc6(dd6Var, b));
                    ((in3) a.i()).requestLocationUpdates(dd6Var.O, dd6Var.r);
                    return;
                } catch (Throwable th) {
                    fc4.g(th, true);
                    return;
                }
            case 26:
                mh6 mh6Var = (mh6) this.c;
                if (this.b) {
                    return;
                }
                mh6Var.X.setVisibility(8);
                return;
            case 27:
                x07 x07Var = (x07) this.c;
                boolean z15 = this.b;
                ArrayList arrayList = x07Var.c;
                boolean isEmpty = TextUtils.isEmpty(x07Var.t);
                String str2 = x07Var.t;
                x07Var.w = true;
                x07Var.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) b10.f(1, arrayList);
                boolean z16 = tL_chatInviteImporter == null;
                if (isEmpty && z16 && z15) {
                    o07Var = new o07(x07Var, r5 ? (byte) 1 : (byte) 0);
                }
                o07 o07Var2 = o07Var;
                if (isEmpty) {
                    gm.d3(o07Var2, 300L);
                }
                n07 n07Var = x07Var.i;
                long j = x07Var.j;
                LongSparseArray longSparseArray = x07Var.d;
                p07 p07Var = new p07(x07Var, isEmpty, o07Var2, str2, z16);
                n07Var.getClass();
                boolean isEmpty2 = TextUtils.isEmpty(str2);
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                tL_messages_getChatInviteImporters.peer = oc7.r1(n07Var.currentAccount).i1(-j);
                tL_messages_getChatInviteImporters.requested = true;
                tL_messages_getChatInviteImporters.limit = 30;
                if (!isEmpty2) {
                    tL_messages_getChatInviteImporters.q = str2;
                    tL_messages_getChatInviteImporters.flags |= 4;
                }
                if (tL_chatInviteImporter == null) {
                    tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                } else {
                    tL_messages_getChatInviteImporters.offset_user = n07Var.getMessagesController().p1((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id));
                    tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
                }
                x07Var.v = n07Var.getConnectionsManager().sendRequest(tL_messages_getChatInviteImporters, new rt0((pg0) n07Var, (Object) tL_chatInviteImporter, isEmpty2, j, (Object) p07Var, (byte) 2));
                return;
            case 28:
                oc7 oc7Var = (oc7) this.c;
                boolean z17 = this.b;
                oc7Var.H0 = null;
                oc7Var.I0.clear();
                oc7Var.getNotificationCenter().k(nm7.O2, new Object[0]);
                if (z17) {
                    oc7Var.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                xv7 xv7Var = (xv7) this.c;
                if (this.b) {
                    return;
                }
                xv7Var.N0.setVisibility(8);
                return;
        }
    }
}
