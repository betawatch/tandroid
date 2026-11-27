// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y36 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y36(int i, TLRPC.TL_error tL_error, e eVar, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = (byte) 21;
        this.b = i;
        this.c = tL_error;
        this.d = eVar;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Type inference failed for: r0v81, types: [org.telegram.SQLite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r2v53, types: [int] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r2v58, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r2v60, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r3v103 */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r3v42, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r4v25, types: [org.telegram.tgnet.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [k84] */
    /* JADX WARN: Type inference failed for: r8v1, types: [vy0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [vy0] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        NativeByteBuffer byteBufferValue;
        JSONObject jSONObject;
        TLRPC.WebPage webPage;
        byte b = 7;
        byte b2 = 4;
        byte b3 = 5;
        k84 k84Var = null;
        byte b4 = 1;
        switch (this.a) {
            case 0:
                l46 l46Var = (l46) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                int i2 = this.b;
                TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) this.e;
                d79 d79Var = l46Var.n1;
                ArrayList arrayList2 = l46Var.v2;
                arrayList2.clear();
                ArrayList arrayList3 = l46Var.u2;
                arrayList3.clear();
                arrayList2.addAll(arrayList);
                for (int i3 = 0; i3 < i2; i3++) {
                    arrayList3.add(tL_messages_inactiveChats.chats.get(i3));
                }
                l46Var.D2 = false;
                l46Var.E2.b(l46Var.i2 + 4);
                int i4 = 0;
                while (true) {
                    if (i4 >= d79Var.getChildCount()) {
                        i = 0;
                    } else if (d79Var.getChildAt(i4) instanceof j46) {
                        i = d79Var.getChildAt(i4).getTop();
                    } else {
                        i4++;
                    }
                }
                l46Var.y1();
                if (l46Var.g2 >= 0 && i != 0) {
                    ((x46) d79Var.getLayoutManager()).g1(l46Var.g2 + 1, i);
                }
                if (l46Var.H2 == null) {
                    l46Var.H2 = l46.g1(l46Var.c2, l46Var.a);
                }
                int max = Math.max(arrayList3.size(), l46Var.H2.e);
                i46 i46Var = l46Var.s2;
                if (i46Var != null) {
                    i46Var.j(max, false);
                    l46Var.s2.setBagePosition(max / l46Var.H2.f);
                    i46 i46Var2 = l46Var.s2;
                    i46Var2.I = true;
                    i46Var2.requestLayout();
                    return;
                }
                return;
            case 1:
                w96 w96Var = (w96) this.c;
                int i5 = this.b;
                TLObject tLObject = (TLObject) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (w96Var.w) {
                    return;
                }
                if (!w96Var.F && i5 == w96Var.E) {
                    if (tLObject instanceof Vector) {
                        if (((Vector) tLObject).toIntArray().contains(Integer.valueOf(w96Var.E))) {
                            w96Var.v();
                        } else {
                            w96Var.x();
                        }
                    } else if (tLObject instanceof TL_phone.groupCall) {
                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                        uc7.s1(w96Var.e).j4(groupcall.users, false);
                        uc7.s1(w96Var.e).c4(groupcall.chats, false);
                        w96Var.s = groupcall.call;
                        jn7.f(w96Var.e).k(jn7.G2, Long.valueOf(w96Var.s.id));
                    } else if (tL_error != null) {
                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
                            cc4.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                            hl.c3(new u96(w96Var, (byte) 6));
                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                            hl.c3(new u96(w96Var, b));
                        }
                    }
                }
                if (w96Var.I) {
                    Runnable runnable = w96Var.J;
                    if (runnable != null) {
                        hl.r(runnable);
                    }
                    u96 u96Var = new u96(w96Var, (byte) 8);
                    w96Var.J = u96Var;
                    hl.d3(u96Var, 4000L);
                    return;
                }
                return;
            case 2:
                ((ob6) this.c).f((mb6) this.d, null, true, this.b, (ds6) this.e);
                return;
            case 3:
                ls6 ls6Var = (ls6) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                String str = (String) this.e;
                int i6 = this.b;
                try {
                    if (tL_messages_stickerSet != null) {
                        SQLitePreparedStatement executeFast = ls6Var.getMessagesStorage().b.executeFast("REPLACE INTO stickers_dice VALUES(?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                        tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                        executeFast.bindString(1, str);
                        executeFast.bindByteBuffer(2, nativeByteBuffer);
                        executeFast.bindInteger(3, i6);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    } else {
                        SQLitePreparedStatement executeFast2 = ls6Var.getMessagesStorage().b.executeFast("UPDATE stickers_dice SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i6);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 4:
                sz6 sz6Var = (sz6) this.c;
                IBinder iBinder = (IBinder) this.d;
                int i7 = this.b;
                gaa gaaVar = (gaa) this.e;
                rx6 rx6Var = sz6Var.b;
                rx6Var.D0();
                xw6 M = rx6Var.M(iBinder);
                us2 us2Var = M != null ? (us2) ((qs) rx6Var.c).get(M) : null;
                r8 = us2Var != null ? us2Var.b : 0;
                if (r8 != 0) {
                    synchronized (r8.c) {
                        j8a j8aVar = (j8a) ((qs) r8.d).remove(Integer.valueOf(i7));
                        if (j8aVar != null) {
                            if (j8aVar.r.getClass() == gaa.class) {
                                j8aVar.l(gaaVar);
                            } else {
                                efd.f("SequencedFutureManager", "Type mismatch, expected " + j8aVar.r.getClass() + ", but was " + gaa.class);
                            }
                        }
                    }
                    return;
                }
                return;
            case 5:
                sz6 sz6Var2 = (sz6) this.c;
                IBinder iBinder2 = (IBinder) this.d;
                oz6 oz6Var = (oz6) this.e;
                int i8 = this.b;
                xw6 M2 = sz6Var2.b.M(iBinder2);
                if (M2 != null) {
                    oz6Var.a(M2, i8);
                    return;
                }
                return;
            case 6:
                ((uc7) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getReplies) this.d, (TLRPC.TL_error) this.e);
                return;
            case 7:
                ((uc7) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getSavedHistory) this.d, (TLRPC.TL_error) this.e);
                return;
            case 8:
                ((uc7) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getPeerDialogs) this.d, (TLRPC.TL_error) this.e);
                return;
            case 9:
                ((uc7) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getHistory) this.d, (TLRPC.TL_error) this.e);
                return;
            case 10:
                uc7 uc7Var = (uc7) this.c;
                zh6 zh6Var = (zh6) this.d;
                zh6 zh6Var2 = (zh6) this.e;
                int i9 = this.b;
                uc7Var.M1 = false;
                if (zh6Var == null && zh6Var2 == null) {
                    uc7Var.N1 = 0;
                    uc7Var.O1 = null;
                    uc7Var.P1 = null;
                    return;
                }
                uc7Var.N1 = i9;
                uc7Var.O1 = zh6Var;
                uc7Var.P1 = zh6Var2;
                if (uc7Var.Q1 != null) {
                    Utilities.d.a(uc7Var.Q1);
                    uc7Var.Q1 = null;
                }
                if (uc7Var.G(false)) {
                    return;
                }
                uc7Var.Q1 = new pa7(uc7Var, b);
                Utilities.d.d(uc7Var.Q1, Math.abs(uc7Var.getConnectionsManager().getCurrentTime() - uc7Var.N1) * 1000);
                return;
            case 11:
                uc7 uc7Var2 = (uc7) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                int i10 = this.b;
                xb7 xb7Var = (xb7) this.e;
                if (!(tLObject2 instanceof TL_chatlists.TL_chatlists_chatlistUpdates)) {
                    xb7Var.a = false;
                    return;
                }
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (TL_chatlists.TL_chatlists_chatlistUpdates) tLObject2;
                uc7Var2.c4(tL_chatlists_chatlistUpdates.chats, false);
                uc7Var2.j4(tL_chatlists_chatlistUpdates.users, false);
                SparseArray sparseArray = uc7Var2.d0;
                xb7 xb7Var2 = new xb7();
                xb7Var2.a = false;
                xb7Var2.b = System.currentTimeMillis();
                xb7Var2.c = tL_chatlists_chatlistUpdates;
                sparseArray.put(i10, xb7Var2);
                uc7Var2.getNotificationCenter().k(jn7.C5, Integer.valueOf(i10));
                return;
            case 12:
                kf7 kf7Var = (kf7) this.c;
                ?? r2 = this.b;
                ?? r3 = (String) this.d;
                ?? r4 = (RequestDelegate) this.e;
                try {
                    try {
                        kf7Var.b.executeFast("DELETE FROM botcache WHERE date < " + r2).stepThis().dispose();
                        r2 = kf7Var.b.queryFinalized("SELECT data FROM botcache WHERE id = ?", new Object[]{r3});
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        try {
                            if (r2.next()) {
                                try {
                                    byteBufferValue = r2.byteBufferValue(0);
                                } catch (Exception e2) {
                                    e = e2;
                                    r3 = 0;
                                }
                                if (byteBufferValue != null) {
                                    int readInt32 = byteBufferValue.readInt32(false);
                                    r3 = readInt32 == 911761060 ? TLRPC.TL_messages_botCallbackAnswer.TLdeserialize(byteBufferValue, readInt32, false) : TLRPC.messages_BotResults.TLdeserialize(byteBufferValue, readInt32, false);
                                    try {
                                        byteBufferValue.reuse();
                                        r3 = r3;
                                    } catch (Exception e3) {
                                        e = e3;
                                        try {
                                            kf7Var.p(e, true);
                                            r3 = r3;
                                            r2.dispose();
                                            r4.run(r3, null);
                                            return;
                                        } catch (Exception e4) {
                                            e = e4;
                                            kf7Var.p(e, true);
                                            r4.run(r3, null);
                                            if (r2 != 0) {
                                                r2.dispose();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    r2.dispose();
                                    r4.run(r3, null);
                                    return;
                                }
                            }
                            r3 = 0;
                            r2.dispose();
                            r4.run(r3, null);
                            return;
                        } catch (Exception e5) {
                            e = e5;
                            r3 = 0;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r3 = 0;
                        r4.run(r3, null);
                        if (r2 != 0) {
                            r2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e6) {
                    e = e6;
                    r2 = 0;
                    r3 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    r2 = 0;
                    r3 = 0;
                }
            case 13:
                ((lm7) this.c).n0(this.b, (r47) this.e, (ArrayList) this.d);
                return;
            case 14:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.c;
                View view = (View) this.d;
                String str2 = (String) this.e;
                int i11 = this.b;
                ArrayList arrayList4 = notificationsCustomSettingsActivity.J;
                int[] iArr = notificationsCustomSettingsActivity.E;
                if (!(view instanceof qmb)) {
                    notificationsCustomSettingsActivity.p0(true);
                    return;
                }
                String M0 = ob6.M0(iArr[Utilities.j(notificationsCustomSettingsActivity.getNotificationsSettings().getInt(str2, 0), iArr.length - 1, 0)], null);
                if (i11 >= 0 && i11 < arrayList4.size()) {
                    ((qp7) arrayList4.get(i11)).f = M0;
                }
                ((qmb) view).c(ob6.M0(2131743269, "Vibrate"), M0, true, true);
                return;
            case 15:
                boolean[] zArr = (boolean[]) this.c;
                rv0 rv0Var = (rv0) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i12 = this.b;
                uq7.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (rv0Var != null) {
                    boolean z = rv0.R0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    rv0Var.v("oauth_result_failed", jSONObject);
                }
                if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    return;
                }
                TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 16:
                jra jraVar = (jra) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                String str3 = (String) this.e;
                int i13 = this.b;
                jraVar.run();
                it7.v(tL_starGiftUnique, ob6.a0(null, null, 2131749473, str3));
                String str4 = tL_starGiftUnique.slug;
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                hl.d3(new tv1(i13, 0, 0L, str4, false), it7.b[0]);
                return;
            case 17:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.c;
                TL_account.Passkey passkey = (TL_account.Passkey) this.d;
                String str5 = (String) this.e;
                int i14 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.S = ob6.M0(2131747372, null);
                alertDialog$Builder.a.U = ob6.M0(2131747373, null);
                alertDialog$Builder.j(ob6.M0(2131751563, null), new an((Object) passkeysActivity, (Object) passkey, (Object) str5, i14, (byte) 6));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 18:
                Context context = (Context) this.c;
                int i15 = this.b;
                TL_account.registerPasskey registerpasskey = (TL_account.registerPasskey) this.d;
                icc iccVar = (icc) this.e;
                id idVar = new id(3, null, context);
                idVar.q(500L);
                idVar.setOnCancelListener(new yo2(i15, ConnectionsManager.getInstance(i15).sendRequestTyped(registerpasskey, new ic(r10 ? (byte) 1 : (byte) 0), new ia7(idVar, iccVar, b3)), iccVar, b4));
                return;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                mn5 mn5Var = (mn5) this.d;
                int i16 = this.b;
                String str6 = (String) this.e;
                Drawable[] drawableArr = PhotoViewer.d9;
                try {
                    try {
                        j84 j84Var = new j84(a.b);
                        j84Var.g(0);
                        j84Var.f(0);
                        j84Var.b = false;
                        k84Var = j84Var.a();
                        if (k84Var.c.k()) {
                            pm3 pm3Var = new pm3((byte) 4);
                            Bitmap bitmap = mn5Var.c;
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            pm3Var.d = bitmap;
                            rc0 rc0Var = (rc0) pm3Var.b;
                            rc0Var.a = width;
                            rc0Var.b = height;
                            rc0Var.c = i16;
                            hl.c3(new yn6((Object) photoViewer, (Object) str6, k84Var.h(pm3Var).size() != 0, (byte) 13));
                        } else {
                            if (f11.a) {
                                cc4.d("face detection is not operational");
                            }
                            hl.c3(new gd7((Object) photoViewer, (Object) mn5Var, (Object) str6, (byte) 29));
                        }
                    } catch (Throwable th4) {
                        if (0 != 0) {
                            r8.d();
                        }
                        throw th4;
                    }
                } catch (Exception e7) {
                    cc4.g(e7, true);
                    if (0 == 0) {
                        return;
                    }
                }
                k84Var.d();
                return;
            case 20:
                tb8 tb8Var = (tb8) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                zh6 zh6Var3 = (zh6) this.e;
                d31.v(tb8Var.W2.E, null, frameLayout, zh6Var3.m(), zh6Var3.m() == 1 ? ((TLRPC.Dialog) zh6Var3.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 21:
                jj.c0(this.b, (TLRPC.TL_error) this.c, (e) this.d, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 22:
                ((g09) this.c).d1(this.b, (String) this.d, (String) this.e);
                return;
            case 23:
                g09 g09Var = (g09) this.c;
                Bitmap bitmap2 = (Bitmap) this.d;
                int[] iArr2 = (int[]) this.e;
                int i17 = this.b;
                g09Var.V4 = false;
                if (g09Var.W4 == null) {
                    g09Var.W4 = bitmap2;
                    g09Var.X4 = iArr2;
                    g09Var.Y4 = i17;
                    return;
                }
                return;
            case 24:
                b19 b19Var = (b19) this.c;
                ArrayList arrayList5 = b19Var.b;
                TLRPC.Message message = (TLRPC.Message) this.d;
                String str7 = (String) this.e;
                int i18 = this.b;
                int i19 = b19Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    a19 c = b19Var.c(message.quick_reply_shortcut_id);
                    if (c == null) {
                        a19 a19Var = new a19();
                        a19Var.a = message.quick_reply_shortcut_id;
                        a19Var.d = message.id;
                        r47 r47Var = new r47(i19, message, false, true);
                        a19Var.e = r47Var;
                        r47Var.r0(false);
                        if (str7 != null) {
                            a19Var.b = str7;
                            b19Var.a(str7);
                        }
                        a19Var.e.l(i18, str7);
                        a19Var.f = 1;
                        arrayList5.add(a19Var);
                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                            ((a19) arrayList5.get(i20)).c = i20;
                        }
                        kf7 a0 = kf7.a0(i19);
                        a0.a.c(new yz8(a0, a19Var, b4));
                        jn7.f(i19).k(jn7.F1, new Object[0]);
                    } else {
                        int i21 = c.d;
                        int i22 = message.id;
                        if (i21 == i22) {
                            c.d = i22;
                            r47 r47Var2 = new r47(i19, message, false, true);
                            c.e = r47Var2;
                            r47Var2.r0(false);
                            b19Var.l();
                            jn7.f(i19).k(jn7.F1, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c.f++;
                            b19Var.l();
                            jn7.f(i19).k(jn7.F1, new Object[0]);
                        }
                    }
                }
                if (str7 == null && i18 == 0) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(message);
                    kf7.a0(i19).k1(arrayList6, true, true, false, lq3.q(i19).l(), false, 5, message.quick_reply_shortcut_id);
                    long e8 = yac.h(i19).e();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(new r47(i19, message, true, true));
                    uc7.s1(i19).z5(5, e8, arrayList7);
                    return;
                }
                return;
            case 25:
                ow9.c(((ow9) this.c).getContext(), this.b, ((lw9) this.d).a.g(), (vnb) this.e);
                return;
            case 26:
                wx9 wx9Var = (wx9) this.c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) this.e;
                int i23 = this.b;
                TLRPC.MessageAction messageAction = message2.action;
                if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                    TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                    if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) && !(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                        messages_sentencryptedmessage.date = 0;
                    }
                }
                wx9Var.getMessagesStorage().c2(message2.random_id, 0L, Integer.valueOf(message2.id), message2.id, messages_sentencryptedmessage.date, 0, 0);
                hl.c3(new a39(wx9Var, message2, i23, b2));
                return;
            case 27:
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                yt0 yt0Var = (yt0) this.d;
                int i24 = this.b;
                TLRPC.User user = (TLRPC.User) this.e;
                if (userFull == null) {
                    yt0Var.a(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    pca.b(i24, user, userFull, yt0Var);
                    return;
                }
            case 28:
                yca ycaVar = (yca) this.c;
                uca ucaVar = (uca) this.e;
                int i25 = this.b;
                ArrayList arrayList8 = (ArrayList) this.d;
                ArrayList arrayList9 = ycaVar.c;
                boolean z2 = ucaVar != null;
                ycaVar.d = z2;
                if (!z2 || i25 < 0 || i25 >= arrayList9.size()) {
                    ycaVar.i = arrayList8;
                } else {
                    ycaVar.a++;
                    ((xca) arrayList9.get(i25)).c++;
                    ycaVar.g.edit().putInt(uh9.k(i25, "score"), ((xca) arrayList9.get(i25)).c).putInt("scoreall", ycaVar.a).apply();
                    ycaVar.i = null;
                }
                ycaVar.e.a(ucaVar);
                return;
            default:
                sea seaVar = (sea) this.c;
                int i26 = this.b;
                TLObject tLObject3 = (TLObject) this.d;
                String str8 = (String) this.e;
                HashMap hashMap = seaVar.w;
                if (i26 != seaVar.E) {
                    return;
                }
                seaVar.y = 0;
                if (tLObject3 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject3;
                    uc7.s1(seaVar.c).j4(webpagepreview.users, false);
                    uc7.s1(seaVar.c).c4(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                        if (!(webPage instanceof TLRPC.TL_webPage)) {
                            if (hashMap.size() > 5) {
                                Iterator it = hashMap.keySet().iterator();
                                while (it.hasNext() && hashMap.size() > 5) {
                                    it.next();
                                    it.remove();
                                }
                            }
                            hashMap.put(str8, webPage);
                            seaVar.x = webPage;
                            sea.a(seaVar.a[0], webPage, str8);
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPagePending) {
                            seaVar.x = webPage;
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPageEmpty) {
                            seaVar.x = null;
                            if (seaVar.b != 0) {
                                seaVar.b = (byte) 0;
                                rea reaVar = seaVar.I;
                                if (reaVar != null) {
                                    ((xg3) reaVar).g(0);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                webPage = null;
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                }
        }
    }

    public /* synthetic */ y36(lm7 lm7Var, int i, r47 r47Var, ArrayList arrayList) {
        this.a = (byte) 13;
        this.c = lm7Var;
        this.b = i;
        this.e = r47Var;
        this.d = arrayList;
    }

    public /* synthetic */ y36(yca ycaVar, uca ucaVar, int i, ArrayList arrayList) {
        this.a = (byte) 28;
        this.c = ycaVar;
        this.e = ucaVar;
        this.b = i;
        this.d = arrayList;
    }

    public /* synthetic */ y36(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ y36(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public /* synthetic */ y36(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
