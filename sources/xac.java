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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class xac implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xac(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        znb E0;
        r4 = null;
        r4 = null;
        v07 v07Var = null;
        byte b = 0;
        switch (this.a) {
            case 0:
                yac yacVar = (yac) this.c;
                boolean z = this.b;
                if (yacVar.b) {
                    synchronized (yacVar.a) {
                        try {
                            SharedPreferences.Editor edit = yacVar.j().edit();
                            if (yacVar.currentAccount == 0) {
                                edit.putInt("selectedAccount", yac.t0);
                            }
                            edit.putBoolean("registeredForPush", yacVar.d);
                            edit.putInt("lastSendMessageId", yacVar.e);
                            edit.putInt("contactsSavedCount", yacVar.h);
                            edit.putInt("lastBroadcastId", yacVar.f);
                            edit.putInt("lastContactsSyncTime", yacVar.r);
                            edit.putInt("lastHintsSyncTime", yacVar.s);
                            edit.putBoolean("draftsLoaded", yacVar.w);
                            edit.putBoolean("unreadDialogsLoaded", yacVar.x);
                            edit.putInt("ratingLoadTime", yacVar.E);
                            edit.putInt("botRatingLoadTime", yacVar.F);
                            edit.putInt("botGuestRatingLoadTime", yacVar.G);
                            edit.putInt("webappRatingLoadTime", yacVar.H);
                            edit.putBoolean("contactsReimported", yacVar.I);
                            edit.putInt("loginTime", yacVar.Z);
                            edit.putBoolean("syncContacts", yacVar.V);
                            edit.putBoolean("showCallsTab", yacVar.X);
                            edit.putBoolean("suggestContacts", yacVar.W);
                            edit.putBoolean("hasSecureData", yacVar.Y);
                            edit.putBoolean("notificationsSettingsLoaded4", yacVar.T);
                            edit.putBoolean("notificationsSignUpSettingsLoaded", yacVar.U);
                            edit.putLong("autoDownloadConfigLoadTime", yacVar.b0);
                            edit.putBoolean("hasValidDialogLoadIds", yacVar.J);
                            edit.putInt("sharingMyLocationUntil", yacVar.R);
                            edit.putInt("lastMyLocationShareTime", yacVar.S);
                            edit.putBoolean("filtersLoaded", yacVar.Q);
                            edit.putString("premiumGiftsStickerPack", yacVar.c0);
                            edit.putLong("lastUpdatedPremiumGiftsStickerPack", yacVar.g0);
                            edit.putString("genericAnimationsStickerPack", yacVar.e0);
                            edit.putLong("lastUpdatedGenericAnimations", yacVar.i0);
                            edit.putInt("6migrateOffsetId", yacVar.K);
                            if (yacVar.K != -1) {
                                edit.putInt("6migrateOffsetDate", yacVar.L);
                                edit.putLong("6migrateOffsetUserId", yacVar.M);
                                edit.putLong("6migrateOffsetChatId", yacVar.N);
                                edit.putLong("6migrateOffsetChannelId", yacVar.O);
                                edit.putLong("6migrateOffsetAccess", yacVar.P);
                            }
                            TLRPC.TL_help_termsOfService tL_help_termsOfService = yacVar.a0;
                            if (tL_help_termsOfService != null) {
                                try {
                                    SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                    yacVar.a0.serializeToStream(serializedData);
                                    edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                    serializedData.cleanup();
                                } catch (Exception unused) {
                                }
                            } else {
                                edit.remove("terms");
                            }
                            xea.x();
                            if (yacVar.y != null) {
                                SerializedData serializedData2 = new SerializedData();
                                yacVar.y.serializeToStream(serializedData2);
                                edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                serializedData2.cleanup();
                            } else {
                                edit.remove("tmpPassword");
                            }
                            if (yacVar.c == null) {
                                edit.remove("user");
                            } else if (z) {
                                SerializedData serializedData3 = new SerializedData();
                                yacVar.c.serializeToStream(serializedData3);
                                edit.putString("user", Base64.encodeToString(serializedData3.toByteArray(), 0));
                                serializedData3.cleanup();
                            }
                            edit.apply();
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                    return;
                }
                return;
            case 1:
                b1 b1Var = (b1) this.c;
                boolean z2 = this.b;
                b1Var.L2 = null;
                b1Var.J2 = z2;
                if (z2) {
                    b1Var.K2 = SystemClock.uptimeMillis();
                }
                b1Var.B2.setLoading(z2);
                return;
            case 2:
                s7 s7Var = (s7) this.c;
                boolean z3 = this.b;
                s7Var.M = null;
                if (s7Var.getParent() != null) {
                    s7Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (z3) {
                    s7Var.performHapticFeedback(0);
                }
                s7Var.U(null, null);
                s7Var.r0 = true;
                return;
            case 3:
                lh2 lh2Var = (lh2) this.c;
                boolean z4 = this.b;
                p30 p30Var = (p30) lh2Var.c;
                String str = gcc.a;
                s64 s64Var = ((n64) p30Var).a;
                if (s64Var.d0 != z4) {
                    s64Var.d0 = z4;
                    s64Var.m.e(23, new k64(r5 ? (byte) 1 : (byte) 0, z4));
                    return;
                }
                return;
            case 4:
                gr0 gr0Var = (gr0) this.c;
                boolean z5 = this.b;
                bga bgaVar = gr0Var.a0;
                if (z5) {
                    new jr0(bgaVar.a, ob6.M0(2131746420, null), new te2(bgaVar, r3)).show();
                    return;
                } else {
                    bgaVar.b(gr0Var.a.E);
                    return;
                }
            case 5:
                xw0 xw0Var = (xw0) this.c;
                boolean z6 = this.b;
                vw0 vw0Var = xw0Var.F;
                pw0 pw0Var = xw0Var.E;
                if (pw0Var.getWebView() != null) {
                    pw0Var.getWebView().animate().cancel();
                    pw0Var.getWebView().animate().alpha(0.0f).start();
                }
                vw0Var.setLoadProgress(0.0f);
                vw0Var.setAlpha(1.0f);
                vw0Var.setVisibility(0);
                pw0Var.setBotUser(z6 ? null : uc7.s1(xw0Var.I).X1(Long.valueOf(xw0Var.J)));
                if (!z6) {
                    pw0Var.p(xw0Var.I, xw0Var.J);
                }
                jn7.f(pw0Var.N).d(new bu0(pw0Var, r5 ? (byte) 1 : (byte) 0));
                return;
            case 6:
                g01 g01Var = (g01) this.c;
                boolean z7 = this.b;
                xz0 xz0Var = g01Var.d;
                boolean z8 = !z7;
                xz0Var.getClass();
                xz0Var.y = z8;
                return;
            case 7:
                ((CameraController) this.c).lambda$recordVideo$11(this.b);
                return;
            case 8:
                m01.u((Context) this.c, ob6.M0(this.b ? 2131753022 : 2131748146, null));
                return;
            case 9:
                kt1 kt1Var = (kt1) this.c;
                boolean z9 = this.b;
                zeb zebVar = kt1Var.b.s1;
                if (zebVar == null || !z9) {
                    return;
                }
                zebVar.setVisibility(8);
                return;
            case 10:
                p82 p82Var = (p82) this.c;
                if (this.b) {
                    ((t82) p82Var.x.c).w.setVisibility(4);
                    return;
                }
                return;
            case 11:
                g92 g92Var = (g92) this.c;
                g92Var.x0.autotranslation = this.b;
                g92Var.getMessagesController().a4(g92Var.x0, false);
                return;
            case 12:
                oe2 oe2Var = (oe2) this.c;
                boolean z10 = this.b;
                me2 me2Var = oe2Var.q1;
                if (me2Var == null || me2Var.d == null || oe2Var.J) {
                    return;
                }
                oe2Var.P0(z10, true);
                if (oe2Var.F1 != null) {
                    oe2Var.I1 = true;
                    TLRPC.WallPaper wallPaper = oe2Var.K0() ? null : oe2Var.r1.g;
                    ez3 ez3Var = oe2Var.F1.a;
                    boolean z11 = ez3Var.a;
                    xu1 xu1Var = oe2Var.r1;
                    if (z11) {
                        xu1Var.q(null, wallPaper, false, Boolean.valueOf(z10), false);
                    } else {
                        xu1Var.q(ez3Var, wallPaper, false, Boolean.valueOf(z10), false);
                    }
                }
                if (hl.O1() && (E0 = oe2.E0(z10)) != null && E0 != aob.I) {
                    oe2Var.c2 = z10 != oe2Var.t1;
                    oe2Var.T0(E0);
                }
                if (me2Var.d != null) {
                    while (b < me2Var.d.size()) {
                        ((ne2) me2Var.d.get(b)).c = z10 ? 1 : 0;
                        b++;
                    }
                    me2Var.f();
                    return;
                }
                return;
            case 13:
                ((fp2) this.c).f(this.b, false);
                return;
            case 14:
                ((ConnectionsManager) this.c).lambda$setIsUpdating$22(this.b);
                return;
            case 15:
                uj3 uj3Var = (uj3) this.c;
                jj.J(uj3Var.getParentActivity(), this.b ? uj3Var.getUserConfig().e() : -1L, new xi3(uj3Var), uj3Var.getResourceProvider());
                return;
            case 16:
                xy3 xy3Var = (xy3) this.c;
                if (this.b) {
                    return;
                }
                xy3Var.E.setVisibility(8);
                return;
            case 17:
                xb4 xb4Var = (xb4) this.c;
                boolean z12 = this.b;
                Iterator it = xb4Var.h.entrySet().iterator();
                while (true) {
                    byte b2 = 2;
                    byte b3 = 18;
                    if (!it.hasNext()) {
                        Iterator it2 = xb4Var.n.entrySet().iterator();
                        while (it2.hasNext()) {
                            nd4 nd4Var = (nd4) ((Map.Entry) it2.next()).getValue();
                            if (nd4Var.m == 1) {
                                Utilities.d.c(new xac(b3, nd4Var, z12));
                                hl.c3(new jd4(nd4Var, b2));
                            }
                        }
                        return;
                    }
                    nd4 nd4Var2 = (nd4) ((Map.Entry) it.next()).getValue();
                    if (nd4Var2.m == 1) {
                        Utilities.d.c(new xac(b3, nd4Var2, z12));
                        hl.c3(new jd4(nd4Var2, b2));
                    }
                }
            case 18:
                nd4 nd4Var3 = (nd4) this.c;
                boolean z13 = this.b;
                SparseIntArray sparseIntArray = nd4Var3.p;
                if (nd4Var3.i != z13) {
                    nd4Var3.i = z13;
                    if (f11.a) {
                        cc4.b("network changed to slow = " + nd4Var3.i);
                    }
                    for (int i = 0; i < sparseIntArray.size(); i++) {
                        ConnectionsManager.getInstance(nd4Var3.a).cancelRequest(sparseIntArray.valueAt(i), true);
                    }
                    sparseIntArray.clear();
                    nd4Var3.b();
                    nd4Var3.b = false;
                    nd4Var3.c = false;
                    nd4Var3.k = 0;
                    nd4Var3.r = 0;
                    nd4Var3.v = 0L;
                    nd4Var3.w = 0L;
                    nd4Var3.x = 0;
                    nd4Var3.y = null;
                    nd4Var3.z = null;
                    nd4Var3.A = null;
                    nd4Var3.K = 0;
                    Arrays.fill(nd4Var3.g, 0);
                    nd4Var3.N = 0;
                    nd4Var3.P = false;
                    nd4Var3.Q.clear();
                    nd4Var3.d++;
                    r3 = nd4Var3.i ? (byte) 1 : (byte) 8;
                    for (int i2 = 0; i2 < r3; i2++) {
                        nd4Var3.d();
                    }
                    return;
                }
                return;
            case 19:
                je4 je4Var = (je4) this.c;
                je4Var.b0(je4Var.P, this.b);
                return;
            case 20:
                qn4 qn4Var = (qn4) this.c;
                qn4Var.a1(qn4Var.t2, this.b);
                return;
            case 21:
                st4 st4Var = (st4) this.c;
                if (this.b) {
                    return;
                }
                st4Var.J.setVisibility(8);
                return;
            case 22:
                ue5 ue5Var = (ue5) this.c;
                if (this.b) {
                    return;
                }
                ue5Var.r.setVisibility(8);
                return;
            case 23:
                ((x96) this.c).b.setVisibility(this.b ? (byte) 0 : (byte) 8);
                return;
            case 24:
                uc6 uc6Var = (uc6) this.c;
                if (this.b) {
                    return;
                }
                uc6Var.b.setVisibility(8);
                return;
            case 25:
                id6 id6Var = (id6) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    id6Var.L = Boolean.FALSE;
                }
                if (id6Var.b.isEmpty()) {
                    return;
                }
                if (!z14) {
                    id6Var.p();
                    return;
                }
                try {
                    ((pm3) a.i()).getLastLocation(new bd6(id6Var, b));
                    ((pm3) a.i()).requestLocationUpdates(id6Var.O, id6Var.r);
                    return;
                } catch (Throwable th) {
                    cc4.g(th, true);
                    return;
                }
            case 26:
                qh6 qh6Var = (qh6) this.c;
                if (this.b) {
                    return;
                }
                qh6Var.X.setVisibility(8);
                return;
            case 27:
                e17 e17Var = (e17) this.c;
                boolean z15 = this.b;
                ArrayList arrayList = e17Var.c;
                boolean isEmpty = TextUtils.isEmpty(e17Var.t);
                String str2 = e17Var.t;
                e17Var.w = true;
                e17Var.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) c00.g(1, arrayList);
                boolean z16 = tL_chatInviteImporter == null;
                if (isEmpty && z16 && z15) {
                    v07Var = new v07(e17Var, r5 ? (byte) 1 : (byte) 0);
                }
                v07 v07Var2 = v07Var;
                if (isEmpty) {
                    hl.d3(v07Var2, 300L);
                }
                u07 u07Var = e17Var.i;
                long j = e17Var.j;
                LongSparseArray longSparseArray = e17Var.d;
                w07 w07Var = new w07(e17Var, isEmpty, v07Var2, str2, z16);
                u07Var.getClass();
                boolean isEmpty2 = TextUtils.isEmpty(str2);
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                tL_messages_getChatInviteImporters.peer = uc7.s1(u07Var.currentAccount).j1(-j);
                tL_messages_getChatInviteImporters.requested = true;
                tL_messages_getChatInviteImporters.limit = 30;
                if (!isEmpty2) {
                    tL_messages_getChatInviteImporters.q = str2;
                    tL_messages_getChatInviteImporters.flags |= 4;
                }
                if (tL_chatInviteImporter == null) {
                    tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                } else {
                    tL_messages_getChatInviteImporters.offset_user = u07Var.getMessagesController().q1((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id));
                    tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
                }
                e17Var.v = u07Var.getConnectionsManager().sendRequest(tL_messages_getChatInviteImporters, new rs0((rf0) u07Var, (Object) tL_chatInviteImporter, isEmpty2, j, (Object) w07Var, (byte) 2));
                return;
            default:
                uc7 uc7Var = (uc7) this.c;
                boolean z17 = this.b;
                uc7Var.H0 = null;
                uc7Var.I0.clear();
                uc7Var.getNotificationCenter().k(jn7.O2, new Object[0]);
                if (z17) {
                    uc7Var.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
        }
    }
}
