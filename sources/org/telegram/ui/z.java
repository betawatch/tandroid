package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z(int i10, int i11, long j10, Object obj, Object obj2) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        long j10 = this.c;
        int i11 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                h4 h4Var = (h4) obj2;
                TLObject tLObject = (TLObject) obj;
                if (h4Var.H0 == 0) {
                    return;
                }
                h4Var.H0 = 0;
                h4Var.Z(false);
                if (tLObject != null) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    org.telegram.messenger.vp.r1(i11).V3(tL_contacts_resolvedPeer.users, false);
                    org.telegram.messenger.hs.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                    if (tL_contacts_resolvedPeer.users.isEmpty()) {
                        return;
                    }
                    h4Var.N(j10, tL_contacts_resolvedPeer.users.get(0));
                    return;
                }
                return;
            case 1:
                ((n6) obj2).a(Float.valueOf(((int[]) obj)[0] / i11), Boolean.valueOf(System.currentTimeMillis() - j10 > 250));
                return;
            case 2:
                RectF rectF = ProfileActivity.R6;
                ((ProfileActivity) obj2).getMessagesController().O1().b(i11, j10, (ArrayList) obj);
                return;
            case 3:
                lc.v vVar = (lc.v) obj;
                org.telegram.ui.Wallet.z0 z0Var = ((org.telegram.ui.Wallet.y0) obj2).c;
                if (!z0Var.c(vVar, i11)) {
                    z0Var.d("closing stale connected websocket; attempt=" + i11);
                    vVar.c();
                    return;
                }
                z0Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j10) + " ms");
                org.telegram.ui.Wallet.v0 v0Var = z0Var.o;
                try {
                    JSONArray put = new JSONArray().put(z0Var.b);
                    StringBuilder sb2 = new StringBuilder("wallet-");
                    int i12 = z0Var.g + 1;
                    z0Var.g = i12;
                    sb2.append(i12);
                    z0Var.f = sb2.toString();
                    JSONObject put2 = new JSONObject().put("operation", "subscribe").put("id", z0Var.f).put("types", new JSONArray().put("transactions").put("account_state_change")).put("include_address_book", true).put("addresses", put).put("min_finality", "pending");
                    org.telegram.messenger.i0.r(v0Var);
                    org.telegram.messenger.i0.h3(v0Var, 30000L);
                    z0Var.g(put2.toString());
                    return;
                } catch (JSONException unused) {
                    z0Var.f("could not encode subscription");
                    return;
                }
            case 4:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj2;
                e2Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j11 = this.c;
                tonconnectgetpending.session_id = Long.valueOf(j11);
                e2Var.f.sendRequestTyped(tonconnectgetpending, new a3.b(1), new org.telegram.ui.Wallet.o1(e2Var, (j70) obj, j11, this.b, 0));
                return;
            case 5:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj2, (org.telegram.ui.ActionBar.p6) obj);
                String L0 = org.telegram.messenger.cd.L0(2131743099, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.i0.V2(org.telegram.messenger.cd.V(null, null, 2131743097, org.telegram.ui.Wallet.k0.x(i11).m(j10, true)));
                i0.a.w(null, 2131743089, alertDialog$Builder, null);
                return;
            case 6:
                ArrayList arrayList = (ArrayList) obj;
                SQLiteDatabase sQLiteDatabase = ((org.telegram.messenger.hs) obj2).b;
                try {
                    try {
                        sQLiteDatabase.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
                        if (arrayList != null) {
                            sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO star_gifts2 VALUES(?, ?, ?, ?, ?)");
                            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i13);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, starGift.id);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(starGift.getObjectSize());
                                starGift.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                                sQLitePreparedStatement.bindLong(3, i11);
                                sQLitePreparedStatement.bindLong(4, j10);
                                sQLitePreparedStatement.bindInteger(5, i13);
                                sQLitePreparedStatement.step();
                                nativeByteBuffer.reuse();
                            }
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            default:
                ((vh.d) obj2).setLoading(false);
                org.telegram.ui.ActionBar.z2 z2Var = ((org.telegram.ui.ActionBar.z2[]) obj)[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                }
                rh.e6.y(i11, false).R();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                T.presentFragment(un.ha(j10));
                return;
        }
    }

    public /* synthetic */ z(ProfileActivity profileActivity, long j10, int i10, ArrayList arrayList) {
        this.a = 2;
        this.d = profileActivity;
        this.c = j10;
        this.b = i10;
        this.e = arrayList;
    }

    public /* synthetic */ z(org.telegram.ui.Wallet.e2 e2Var, long j10, j70 j70Var, int i10) {
        this.a = 4;
        this.d = e2Var;
        this.c = j10;
        this.e = j70Var;
        this.b = i10;
    }
}
