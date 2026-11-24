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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class x6c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x6c(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        akb D0;
        r3 = null;
        r3 = null;
        oy6 oy6Var = null;
        byte b = 0;
        switch (this.a) {
            case 0:
                y6c y6cVar = (y6c) this.c;
                boolean z = this.b;
                if (y6cVar.b) {
                    synchronized (y6cVar.a) {
                        try {
                            SharedPreferences.Editor edit = y6cVar.j().edit();
                            if (y6cVar.currentAccount == 0) {
                                edit.putInt("selectedAccount", y6c.t0);
                            }
                            edit.putBoolean("registeredForPush", y6cVar.d);
                            edit.putInt("lastSendMessageId", y6cVar.e);
                            edit.putInt("contactsSavedCount", y6cVar.h);
                            edit.putInt("lastBroadcastId", y6cVar.f);
                            edit.putInt("lastContactsSyncTime", y6cVar.r);
                            edit.putInt("lastHintsSyncTime", y6cVar.s);
                            edit.putBoolean("draftsLoaded", y6cVar.w);
                            edit.putBoolean("unreadDialogsLoaded", y6cVar.x);
                            edit.putInt("ratingLoadTime", y6cVar.E);
                            edit.putInt("botRatingLoadTime", y6cVar.F);
                            edit.putInt("botGuestRatingLoadTime", y6cVar.G);
                            edit.putInt("webappRatingLoadTime", y6cVar.H);
                            edit.putBoolean("contactsReimported", y6cVar.I);
                            edit.putInt("loginTime", y6cVar.Z);
                            edit.putBoolean("syncContacts", y6cVar.V);
                            edit.putBoolean("showCallsTab", y6cVar.X);
                            edit.putBoolean("suggestContacts", y6cVar.W);
                            edit.putBoolean("hasSecureData", y6cVar.Y);
                            edit.putBoolean("notificationsSettingsLoaded4", y6cVar.T);
                            edit.putBoolean("notificationsSignUpSettingsLoaded", y6cVar.U);
                            edit.putLong("autoDownloadConfigLoadTime", y6cVar.b0);
                            edit.putBoolean("hasValidDialogLoadIds", y6cVar.J);
                            edit.putInt("sharingMyLocationUntil", y6cVar.R);
                            edit.putInt("lastMyLocationShareTime", y6cVar.S);
                            edit.putBoolean("filtersLoaded", y6cVar.Q);
                            edit.putString("premiumGiftsStickerPack", y6cVar.c0);
                            edit.putLong("lastUpdatedPremiumGiftsStickerPack", y6cVar.g0);
                            edit.putString("genericAnimationsStickerPack", y6cVar.e0);
                            edit.putLong("lastUpdatedGenericAnimations", y6cVar.i0);
                            edit.putInt("6migrateOffsetId", y6cVar.K);
                            if (y6cVar.K != -1) {
                                edit.putInt("6migrateOffsetDate", y6cVar.L);
                                edit.putLong("6migrateOffsetUserId", y6cVar.M);
                                edit.putLong("6migrateOffsetChatId", y6cVar.N);
                                edit.putLong("6migrateOffsetChannelId", y6cVar.O);
                                edit.putLong("6migrateOffsetAccess", y6cVar.P);
                            }
                            TLRPC.TL_help_termsOfService tL_help_termsOfService = y6cVar.a0;
                            if (tL_help_termsOfService != null) {
                                try {
                                    SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                    y6cVar.a0.serializeToStream(serializedData);
                                    edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                    serializedData.cleanup();
                                } catch (Exception unused) {
                                }
                            } else {
                                edit.remove("terms");
                            }
                            gba.x();
                            if (y6cVar.y != null) {
                                SerializedData serializedData2 = new SerializedData();
                                y6cVar.y.serializeToStream(serializedData2);
                                edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                                serializedData2.cleanup();
                            } else {
                                edit.remove("tmpPassword");
                            }
                            if (y6cVar.c == null) {
                                edit.remove("user");
                            } else if (z) {
                                SerializedData serializedData3 = new SerializedData();
                                y6cVar.c.serializeToStream(serializedData3);
                                edit.putString("user", Base64.encodeToString(serializedData3.toByteArray(), 0));
                                serializedData3.cleanup();
                            }
                            edit.apply();
                        } catch (Exception e) {
                            fa4.g(e, true);
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
                tg2 tg2Var = (tg2) this.c;
                boolean z4 = this.b;
                o30 o30Var = (o30) tg2Var.c;
                String str = g8c.a;
                y54 y54Var = ((t54) o30Var).a;
                if (y54Var.d0 != z4) {
                    y54Var.d0 = z4;
                    y54Var.m.e(23, new p54(r5 ? (byte) 1 : (byte) 0, z4));
                    return;
                }
                return;
            case 4:
                gr0 gr0Var = (gr0) this.c;
                boolean z5 = this.b;
                kca kcaVar = gr0Var.a0;
                if (z5) {
                    new jr0(kcaVar.a, k96.M0(2131746500, null), new be2(kcaVar, r4)).show();
                    return;
                } else {
                    kcaVar.b(gr0Var.a.E);
                    return;
                }
            case 5:
                ow0 ow0Var = (ow0) this.c;
                boolean z6 = this.b;
                mw0 mw0Var = ow0Var.F;
                gw0 gw0Var = ow0Var.E;
                if (gw0Var.getWebView() != null) {
                    gw0Var.getWebView().animate().cancel();
                    gw0Var.getWebView().animate().alpha(0.0f).start();
                }
                mw0Var.setLoadProgress(0.0f);
                mw0Var.setAlpha(1.0f);
                mw0Var.setVisibility(0);
                gw0Var.setBotUser(z6 ? null : na7.q1(ow0Var.I).V1(Long.valueOf(ow0Var.J)));
                if (!z6) {
                    gw0Var.p(ow0Var.I, ow0Var.J);
                }
                kk7.f(gw0Var.N).d(new st0(gw0Var, r5 ? (byte) 1 : (byte) 0));
                return;
            case 6:
                yz0 yz0Var = (yz0) this.c;
                boolean z7 = this.b;
                pz0 pz0Var = yz0Var.d;
                boolean z8 = !z7;
                pz0Var.getClass();
                pz0Var.y = z8;
                return;
            case 7:
                ((CameraController) this.c).lambda$recordVideo$11(this.b);
                return;
            case 8:
                d01.t((Context) this.c, k96.M0(this.b ? 2131753026 : 2131748200, null));
                return;
            case 9:
                xs1 xs1Var = (xs1) this.c;
                boolean z9 = this.b;
                dbb dbbVar = xs1Var.b.s1;
                if (dbbVar == null || !z9) {
                    return;
                }
                dbbVar.setVisibility(8);
                return;
            case 10:
                y72 y72Var = (y72) this.c;
                if (this.b) {
                    ((c82) y72Var.x.c).w.setVisibility(4);
                    return;
                }
                return;
            case 11:
                p82 p82Var = (p82) this.c;
                p82Var.x0.autotranslation = this.b;
                p82Var.getMessagesController().T3(p82Var.x0, false);
                return;
            case 12:
                xd2 xd2Var = (xd2) this.c;
                boolean z10 = this.b;
                vd2 vd2Var = xd2Var.q1;
                if (vd2Var == null || vd2Var.d == null || xd2Var.J) {
                    return;
                }
                xd2Var.O0(z10, true);
                if (xd2Var.F1 != null) {
                    xd2Var.I1 = true;
                    TLRPC.WallPaper wallPaper = xd2Var.J0() ? null : xd2Var.r1.g;
                    jy3 jy3Var = xd2Var.F1.a;
                    boolean z11 = jy3Var.a;
                    ku1 ku1Var = xd2Var.r1;
                    if (z11) {
                        ku1Var.q(null, wallPaper, false, Boolean.valueOf(z10), false);
                    } else {
                        ku1Var.q(jy3Var, wallPaper, false, Boolean.valueOf(z10), false);
                    }
                }
                if (gl.O1() && (D0 = xd2.D0(z10)) != null && D0 != bkb.I) {
                    xd2Var.c2 = z10 != xd2Var.t1;
                    xd2Var.S0(D0);
                }
                if (vd2Var.d != null) {
                    while (b < vd2Var.d.size()) {
                        ((wd2) vd2Var.d.get(b)).c = z10 ? 1 : 0;
                        b++;
                    }
                    vd2Var.f();
                    return;
                }
                return;
            case 13:
                ((mo2) this.c).f(this.b, false);
                return;
            case 14:
                ((ConnectionsManager) this.c).lambda$setIsUpdating$22(this.b);
                return;
            case 15:
                cj3 cj3Var = (cj3) this.c;
                ij.J(cj3Var.getParentActivity(), this.b ? cj3Var.getUserConfig().e() : -1L, new di3(cj3Var), cj3Var.getResourceProvider());
                return;
            case 16:
                cy3 cy3Var = (cy3) this.c;
                if (this.b) {
                    return;
                }
                cy3Var.E.setVisibility(8);
                return;
            case 17:
                ba4 ba4Var = (ba4) this.c;
                boolean z12 = this.b;
                Iterator it = ba4Var.h.entrySet().iterator();
                while (true) {
                    byte b2 = 2;
                    byte b3 = 18;
                    if (!it.hasNext()) {
                        Iterator it2 = ba4Var.n.entrySet().iterator();
                        while (it2.hasNext()) {
                            qb4 qb4Var = (qb4) ((Map.Entry) it2.next()).getValue();
                            if (qb4Var.m == 1) {
                                Utilities.d.c(new x6c(b3, qb4Var, z12));
                                gl.c3(new mb4(qb4Var, b2));
                            }
                        }
                        return;
                    }
                    qb4 qb4Var2 = (qb4) ((Map.Entry) it.next()).getValue();
                    if (qb4Var2.m == 1) {
                        Utilities.d.c(new x6c(b3, qb4Var2, z12));
                        gl.c3(new mb4(qb4Var2, b2));
                    }
                }
            case 18:
                qb4 qb4Var3 = (qb4) this.c;
                boolean z13 = this.b;
                SparseIntArray sparseIntArray = qb4Var3.p;
                if (qb4Var3.i != z13) {
                    qb4Var3.i = z13;
                    if (w01.a) {
                        fa4.b("network changed to slow = " + qb4Var3.i);
                    }
                    for (int i = 0; i < sparseIntArray.size(); i++) {
                        ConnectionsManager.getInstance(qb4Var3.a).cancelRequest(sparseIntArray.valueAt(i), true);
                    }
                    sparseIntArray.clear();
                    qb4Var3.b();
                    qb4Var3.b = false;
                    qb4Var3.c = false;
                    qb4Var3.k = 0;
                    qb4Var3.r = 0;
                    qb4Var3.v = 0L;
                    qb4Var3.w = 0L;
                    qb4Var3.x = 0;
                    qb4Var3.y = null;
                    qb4Var3.z = null;
                    qb4Var3.A = null;
                    qb4Var3.K = 0;
                    Arrays.fill(qb4Var3.g, 0);
                    qb4Var3.N = 0;
                    qb4Var3.P = false;
                    qb4Var3.Q.clear();
                    qb4Var3.d++;
                    r4 = qb4Var3.i ? (byte) 1 : (byte) 8;
                    for (int i2 = 0; i2 < r4; i2++) {
                        qb4Var3.d();
                    }
                    return;
                }
                return;
            case 19:
                mc4 mc4Var = (mc4) this.c;
                mc4Var.b0(mc4Var.P, this.b);
                return;
            case 20:
                ll4 ll4Var = (ll4) this.c;
                ll4Var.Z0(ll4Var.t2, this.b);
                return;
            case 21:
                or4 or4Var = (or4) this.c;
                if (this.b) {
                    return;
                }
                or4Var.J.setVisibility(8);
                return;
            case 22:
                tc5 tc5Var = (tc5) this.c;
                if (this.b) {
                    return;
                }
                tc5Var.r.setVisibility(8);
                return;
            case 23:
                ((u76) this.c).b.setVisibility(this.b ? (byte) 0 : (byte) 8);
                return;
            case 24:
                qa6 qa6Var = (qa6) this.c;
                if (this.b) {
                    return;
                }
                qa6Var.b.setVisibility(8);
                return;
            case 25:
                eb6 eb6Var = (eb6) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    eb6Var.L = Boolean.FALSE;
                }
                if (eb6Var.b.isEmpty()) {
                    return;
                }
                if (!z14) {
                    eb6Var.p();
                    return;
                }
                try {
                    ((xl3) a.i()).getLastLocation(new ya6(eb6Var, b));
                    ((xl3) a.i()).requestLocationUpdates(eb6Var.O, eb6Var.r);
                    return;
                } catch (Throwable th) {
                    fa4.g(th, true);
                    return;
                }
            case 26:
                mf6 mf6Var = (mf6) this.c;
                if (this.b) {
                    return;
                }
                mf6Var.X.setVisibility(8);
                return;
            case 27:
                xy6 xy6Var = (xy6) this.c;
                boolean z15 = this.b;
                ArrayList arrayList = xy6Var.c;
                boolean isEmpty = TextUtils.isEmpty(xy6Var.t);
                String str2 = xy6Var.t;
                xy6Var.w = true;
                xy6Var.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) b00.f(1, arrayList);
                boolean z16 = tL_chatInviteImporter == null;
                if (isEmpty && z16 && z15) {
                    oy6Var = new oy6(xy6Var, r5 ? (byte) 1 : (byte) 0);
                }
                oy6 oy6Var2 = oy6Var;
                if (isEmpty) {
                    gl.d3(oy6Var2, 300L);
                }
                ny6 ny6Var = xy6Var.i;
                long j = xy6Var.j;
                LongSparseArray longSparseArray = xy6Var.d;
                py6 py6Var = new py6(xy6Var, isEmpty, oy6Var2, str2, z16);
                ny6Var.getClass();
                boolean isEmpty2 = TextUtils.isEmpty(str2);
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                tL_messages_getChatInviteImporters.peer = na7.q1(ny6Var.currentAccount).h1(-j);
                tL_messages_getChatInviteImporters.requested = true;
                tL_messages_getChatInviteImporters.limit = 30;
                if (!isEmpty2) {
                    tL_messages_getChatInviteImporters.q = str2;
                    tL_messages_getChatInviteImporters.flags |= 4;
                }
                if (tL_chatInviteImporter == null) {
                    tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                } else {
                    tL_messages_getChatInviteImporters.offset_user = ny6Var.getMessagesController().o1((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id));
                    tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
                }
                xy6Var.v = ny6Var.getConnectionsManager().sendRequest(tL_messages_getChatInviteImporters, new js0((pf0) ny6Var, (Object) tL_chatInviteImporter, isEmpty2, j, (Object) py6Var, (byte) 2));
                return;
            case 28:
                na7 na7Var = (na7) this.c;
                boolean z17 = this.b;
                na7Var.H0 = null;
                na7Var.I0.clear();
                na7Var.getNotificationCenter().k(kk7.N2, new Object[0]);
                if (z17) {
                    na7Var.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            default:
                wt7 wt7Var = (wt7) this.c;
                if (this.b) {
                    return;
                }
                wt7Var.N0.setVisibility(8);
                return;
        }
    }
}
