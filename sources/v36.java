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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v36 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v36(int i, TLRPC.TL_error tL_error, d dVar, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = (byte) 20;
        this.b = i;
        this.c = tL_error;
        this.d = dVar;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Type inference failed for: r0v81, types: [org.telegram.SQLite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r2v53, types: [int] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r2v58, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r2v60, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r3v45, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v96 */
    /* JADX WARN: Type inference failed for: r3v97 */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r3v99 */
    /* JADX WARN: Type inference failed for: r4v19, types: [org.telegram.tgnet.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [y84] */
    /* JADX WARN: Type inference failed for: r7v5, types: [uz0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [uz0] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        NativeByteBuffer byteBufferValue;
        JSONObject jSONObject;
        TLRPC.WebPage webPage;
        byte b = 4;
        byte b2 = 5;
        byte b3 = 2;
        byte b4 = 3;
        y84 y84Var = null;
        byte b5 = 1;
        switch (this.a) {
            case 0:
                i46 i46Var = (i46) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                int i2 = this.b;
                TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) this.e;
                r59 r59Var = i46Var.n1;
                ArrayList arrayList2 = i46Var.v2;
                arrayList2.clear();
                ArrayList arrayList3 = i46Var.u2;
                arrayList3.clear();
                arrayList2.addAll(arrayList);
                for (int i3 = 0; i3 < i2; i3++) {
                    arrayList3.add(tL_messages_inactiveChats.chats.get(i3));
                }
                i46Var.D2 = false;
                i46Var.E2.b(i46Var.i2 + 4);
                int i4 = 0;
                while (true) {
                    if (i4 >= r59Var.getChildCount()) {
                        i = 0;
                    } else if (r59Var.getChildAt(i4) instanceof g46) {
                        i = r59Var.getChildAt(i4).getTop();
                    } else {
                        i4++;
                    }
                }
                i46Var.x1();
                if (i46Var.g2 >= 0 && i != 0) {
                    ((u46) r59Var.getLayoutManager()).g1(i46Var.g2 + 1, i);
                }
                if (i46Var.H2 == null) {
                    i46Var.H2 = i46.f1(i46Var.c2, i46Var.a);
                }
                int max = Math.max(arrayList3.size(), i46Var.H2.e);
                f46 f46Var = i46Var.s2;
                if (f46Var != null) {
                    f46Var.j(max, false);
                    i46Var.s2.setBagePosition(max / i46Var.H2.f);
                    f46 f46Var2 = i46Var.s2;
                    f46Var2.I = true;
                    f46Var2.requestLayout();
                    return;
                }
                return;
            case 1:
                s96 s96Var = (s96) this.c;
                int i5 = this.b;
                TLObject tLObject = (TLObject) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (s96Var.w) {
                    return;
                }
                if (!s96Var.F && i5 == s96Var.E) {
                    if (tLObject instanceof Vector) {
                        if (((Vector) tLObject).toIntArray().contains(Integer.valueOf(s96Var.E))) {
                            s96Var.v();
                        } else {
                            s96Var.x();
                        }
                    } else if (tLObject instanceof TL_phone.groupCall) {
                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                        oc7.r1(s96Var.e).d4(groupcall.users, false);
                        oc7.r1(s96Var.e).X3(groupcall.chats, false);
                        s96Var.s = groupcall.call;
                        nm7.f(s96Var.e).k(nm7.G2, Long.valueOf(s96Var.s.id));
                    } else if (tL_error != null) {
                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
                            fc4.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                            gm.c3(new q96(s96Var, b5));
                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                            gm.c3(new q96(s96Var, b3));
                        }
                    }
                }
                if (s96Var.I) {
                    Runnable runnable = s96Var.J;
                    if (runnable != null) {
                        gm.r(runnable);
                    }
                    q96 q96Var = new q96(s96Var, b4);
                    s96Var.J = q96Var;
                    gm.d3(q96Var, 4000L);
                    return;
                }
                return;
            case 2:
                ((jb6) this.c).f((hb6) this.d, null, true, this.b, (np6) this.e);
                return;
            case 3:
                hs6 hs6Var = (hs6) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                String str = (String) this.e;
                int i6 = this.b;
                try {
                    if (tL_messages_stickerSet != null) {
                        SQLitePreparedStatement executeFast = hs6Var.getMessagesStorage().b.executeFast("REPLACE INTO stickers_dice VALUES(?, ?, ?)");
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
                        SQLitePreparedStatement executeFast2 = hs6Var.getMessagesStorage().b.executeFast("UPDATE stickers_dice SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i6);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 4:
                oz6 oz6Var = (oz6) this.c;
                IBinder iBinder = (IBinder) this.d;
                int i7 = this.b;
                q8a q8aVar = (q8a) this.e;
                mx6 mx6Var = oz6Var.b;
                mx6Var.C0();
                sw6 N = mx6Var.N(iBinder);
                mt2 mt2Var = N != null ? (mt2) ((qt) mx6Var.c).get(N) : null;
                r7 = mt2Var != null ? mt2Var.b : 0;
                if (r7 != 0) {
                    synchronized (r7.c) {
                        t6a t6aVar = (t6a) ((qt) r7.d).remove(Integer.valueOf(i7));
                        if (t6aVar != null) {
                            if (t6aVar.r.getClass() == q8a.class) {
                                t6aVar.l(q8aVar);
                            } else {
                                ncd.f("SequencedFutureManager", "Type mismatch, expected " + t6aVar.r.getClass() + ", but was " + q8a.class);
                            }
                        }
                    }
                    return;
                }
                return;
            case 5:
                oz6 oz6Var2 = (oz6) this.c;
                IBinder iBinder2 = (IBinder) this.d;
                kz6 kz6Var = (kz6) this.e;
                int i8 = this.b;
                sw6 N2 = oz6Var2.b.N(iBinder2);
                if (N2 != null) {
                    kz6Var.a(N2, i8);
                    return;
                }
                return;
            case 6:
                ((oc7) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getSavedHistory) this.d, (TLRPC.TL_error) this.e);
                return;
            case 7:
                ((oc7) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getReplies) this.d, (TLRPC.TL_error) this.e);
                return;
            case 8:
                ((oc7) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getHistory) this.d, (TLRPC.TL_error) this.e);
                return;
            case 9:
                ((oc7) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getPeerDialogs) this.d, (TLRPC.TL_error) this.e);
                return;
            case 10:
                oc7 oc7Var = (oc7) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                int i9 = this.b;
                rb7 rb7Var = (rb7) this.e;
                if (!(tLObject2 instanceof TL_chatlists.TL_chatlists_chatlistUpdates)) {
                    rb7Var.a = false;
                    return;
                }
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (TL_chatlists.TL_chatlists_chatlistUpdates) tLObject2;
                oc7Var.X3(tL_chatlists_chatlistUpdates.chats, false);
                oc7Var.d4(tL_chatlists_chatlistUpdates.users, false);
                SparseArray sparseArray = oc7Var.d0;
                rb7 rb7Var2 = new rb7();
                rb7Var2.a = false;
                rb7Var2.b = System.currentTimeMillis();
                rb7Var2.c = tL_chatlists_chatlistUpdates;
                sparseArray.put(i9, rb7Var2);
                oc7Var.getNotificationCenter().k(nm7.D5, Integer.valueOf(i9));
                return;
            case 11:
                oc7 oc7Var2 = (oc7) this.c;
                vh6 vh6Var = (vh6) this.d;
                vh6 vh6Var2 = (vh6) this.e;
                int i10 = this.b;
                oc7Var2.M1 = false;
                if (vh6Var == null && vh6Var2 == null) {
                    oc7Var2.N1 = 0;
                    oc7Var2.O1 = null;
                    oc7Var2.P1 = null;
                    return;
                }
                oc7Var2.N1 = i10;
                oc7Var2.O1 = vh6Var;
                oc7Var2.P1 = vh6Var2;
                if (oc7Var2.Q1 != null) {
                    Utilities.d.a(oc7Var2.Q1);
                    oc7Var2.Q1 = null;
                }
                if (oc7Var2.E(false)) {
                    return;
                }
                oc7Var2.Q1 = new ba7(oc7Var2, b2);
                Utilities.d.d(oc7Var2.Q1, Math.abs(oc7Var2.getConnectionsManager().getCurrentTime() - oc7Var2.N1) * 1000);
                return;
            case 12:
                cf7 cf7Var = (cf7) this.c;
                ?? r2 = this.b;
                ?? r3 = (String) this.d;
                ?? r4 = (RequestDelegate) this.e;
                try {
                    try {
                        cf7Var.b.executeFast("DELETE FROM botcache WHERE date < " + r2).stepThis().dispose();
                        r2 = cf7Var.b.queryFinalized("SELECT data FROM botcache WHERE id = ?", new Object[]{r3});
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
                                            cf7Var.n(e, true);
                                            r3 = r3;
                                            r2.dispose();
                                            r4.run(r3, null);
                                            return;
                                        } catch (Exception e4) {
                                            e = e4;
                                            cf7Var.n(e, true);
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
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.c;
                View view = (View) this.d;
                String str2 = (String) this.e;
                int i11 = this.b;
                ArrayList arrayList4 = notificationsCustomSettingsActivity.J;
                int[] iArr = notificationsCustomSettingsActivity.E;
                if (!(view instanceof vkb)) {
                    notificationsCustomSettingsActivity.q0(true);
                    return;
                }
                String M0 = jb6.M0(iArr[Utilities.j(notificationsCustomSettingsActivity.getNotificationsSettings().getInt(str2, 0), iArr.length - 1, 0)], null);
                if (i11 >= 0 && i11 < arrayList4.size()) {
                    ((uo7) arrayList4.get(i11)).f = M0;
                }
                ((vkb) view).c(jb6.M0(2131743301, "Vibrate"), M0, true, true);
                return;
            case 14:
                boolean[] zArr = (boolean[]) this.c;
                qw0 qw0Var = (qw0) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i12 = this.b;
                xp7.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (qw0Var != null) {
                    boolean z = qw0.R0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    qw0Var.v("oauth_result_failed", jSONObject);
                }
                if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    return;
                }
                TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 15:
                npa npaVar = (npa) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                String str3 = (String) this.e;
                int i13 = this.b;
                npaVar.run();
                fs7.s(tL_starGiftUnique, jb6.a0(null, null, 2131749461, str3));
                String str4 = tL_starGiftUnique.slug;
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                gm.d3(new tw1(i13, 0, 0L, str4, false), fs7.a[0]);
                return;
            case 16:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.c;
                TL_account.Passkey passkey = (TL_account.Passkey) this.d;
                String str5 = (String) this.e;
                int i14 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.S = jb6.M0(2131747378, null);
                alertDialog$Builder.a.U = jb6.M0(2131747379, null);
                alertDialog$Builder.j(jb6.M0(2131751535, null), new zn((Object) passkeysActivity, (Object) passkey, (Object) str5, i14, (byte) 6));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 17:
                Context context = (Context) this.c;
                int i15 = this.b;
                TL_account.registerPasskey registerpasskey = (TL_account.registerPasskey) this.d;
                jac jacVar = (jac) this.e;
                he heVar = new he(3, null, context);
                heVar.q(500L);
                heVar.setOnCancelListener(new qp2(i15, ConnectionsManager.getInstance(i15).sendRequestTyped(registerpasskey, new kc(r9 ? (byte) 1 : (byte) 0), new s87(heVar, jacVar, (byte) 7)), jacVar, b5));
                return;
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                jn5 jn5Var = (jn5) this.d;
                int i16 = this.b;
                String str6 = (String) this.e;
                Drawable[] drawableArr = PhotoViewer.d9;
                try {
                    try {
                        x84 x84Var = new x84(a.b);
                        x84Var.g(0);
                        x84Var.f(0);
                        x84Var.b = false;
                        y84Var = x84Var.a();
                        if (y84Var.c.k()) {
                            in3 in3Var = new in3((byte) 4);
                            Bitmap bitmap = jn5Var.c;
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            in3Var.d = bitmap;
                            pd0 pd0Var = (pd0) in3Var.b;
                            pd0Var.a = width;
                            pd0Var.b = height;
                            pd0Var.c = i16;
                            gm.c3(new yl6((Object) photoViewer, (Object) str6, y84Var.h(in3Var).size() != 0, (byte) 14));
                        } else {
                            if (e21.a) {
                                fc4.d("face detection is not operational");
                            }
                            gm.c3(new ud7((byte) 25, (Object) photoViewer, (Object) jn5Var, str6));
                        }
                    } catch (Exception e7) {
                        fc4.g(e7, true);
                        if (0 == 0) {
                            return;
                        }
                    }
                    y84Var.d();
                    return;
                } catch (Throwable th4) {
                    if (0 != 0) {
                        r7.d();
                    }
                    throw th4;
                }
            case 19:
                ea8 ea8Var = (ea8) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                vh6 vh6Var3 = (vh6) this.e;
                c41.v(ea8Var.W2.E, null, frameLayout, vh6Var3.m(), vh6Var3.m() == 1 ? ((TLRPC.Dialog) vh6Var3.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 20:
                ik.c0(this.b, (TLRPC.TL_error) this.c, (d) this.d, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 21:
                ((wy8) this.c).d1(this.b, (String) this.d, (String) this.e);
                return;
            case 22:
                wy8 wy8Var = (wy8) this.c;
                Bitmap bitmap2 = (Bitmap) this.d;
                int[] iArr2 = (int[]) this.e;
                int i17 = this.b;
                wy8Var.V4 = false;
                if (wy8Var.W4 == null) {
                    wy8Var.W4 = bitmap2;
                    wy8Var.X4 = iArr2;
                    wy8Var.Y4 = i17;
                    return;
                }
                return;
            case 23:
                pz8 pz8Var = (pz8) this.c;
                ArrayList arrayList5 = pz8Var.b;
                TLRPC.Message message = (TLRPC.Message) this.d;
                String str7 = (String) this.e;
                int i18 = this.b;
                int i19 = pz8Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    oz8 c = pz8Var.c(message.quick_reply_shortcut_id);
                    if (c == null) {
                        oz8 oz8Var = new oz8();
                        oz8Var.a = message.quick_reply_shortcut_id;
                        oz8Var.d = message.id;
                        k47 k47Var = new k47(i19, message, false, true);
                        oz8Var.e = k47Var;
                        k47Var.r0(false);
                        if (str7 != null) {
                            oz8Var.b = str7;
                            pz8Var.a(str7);
                        }
                        oz8Var.e.l(i18, str7);
                        oz8Var.f = 1;
                        arrayList5.add(oz8Var);
                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                            ((oz8) arrayList5.get(i20)).c = i20;
                        }
                        cf7 Y = cf7.Y(i19);
                        Y.a.c(new ey8(Y, oz8Var, b));
                        nm7.f(i19).k(nm7.F1, new Object[0]);
                    } else {
                        int i21 = c.d;
                        int i22 = message.id;
                        if (i21 == i22) {
                            c.d = i22;
                            k47 k47Var2 = new k47(i19, message, false, true);
                            c.e = k47Var2;
                            k47Var2.r0(false);
                            pz8Var.l();
                            nm7.f(i19).k(nm7.F1, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c.f++;
                            pz8Var.l();
                            nm7.f(i19).k(nm7.F1, new Object[0]);
                        }
                    }
                }
                if (str7 == null && i18 == 0) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(message);
                    cf7.Y(i19).g1(arrayList6, true, true, false, er3.q(i19).l(), false, 5, message.quick_reply_shortcut_id);
                    long e8 = z8c.h(i19).e();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(new k47(i19, message, true, true));
                    oc7.r1(i19).t5(5, e8, arrayList7);
                    return;
                }
                return;
            case 24:
                xu9.c(((xu9) this.c).getContext(), this.b, ((uu9) this.d).a.g(), (ylb) this.e);
                return;
            case 25:
                dw9 dw9Var = (dw9) this.c;
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
                dw9Var.getMessagesStorage().X1(message2.random_id, 0L, Integer.valueOf(message2.id), message2.id, messages_sentencryptedmessage.date, 0, 0);
                gm.c3(new v99(dw9Var, message2, i23, b4));
                return;
            case 26:
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                yu0 yu0Var = (yu0) this.d;
                int i24 = this.b;
                TLRPC.User user = (TLRPC.User) this.e;
                if (userFull == null) {
                    yu0Var.a(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    yaa.b(i24, user, userFull, yu0Var);
                    return;
                }
            case 27:
                hba hbaVar = (hba) this.c;
                dba dbaVar = (dba) this.e;
                int i25 = this.b;
                ArrayList arrayList8 = (ArrayList) this.d;
                ArrayList arrayList9 = hbaVar.c;
                boolean z2 = dbaVar != null;
                hbaVar.d = z2;
                if (!z2 || i25 < 0 || i25 >= arrayList9.size()) {
                    hbaVar.i = arrayList8;
                } else {
                    hbaVar.a++;
                    ((gba) arrayList9.get(i25)).c++;
                    hbaVar.g.edit().putInt(hg9.j(i25, "score"), ((gba) arrayList9.get(i25)).c).putInt("scoreall", hbaVar.a).apply();
                    hbaVar.i = null;
                }
                hbaVar.e.a(dbaVar);
                return;
            case 28:
                bda bdaVar = (bda) this.c;
                int i26 = this.b;
                TLObject tLObject3 = (TLObject) this.d;
                String str8 = (String) this.e;
                HashMap hashMap = bdaVar.w;
                if (i26 != bdaVar.E) {
                    return;
                }
                bdaVar.y = 0;
                if (tLObject3 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject3;
                    oc7.r1(bdaVar.c).d4(webpagepreview.users, false);
                    oc7.r1(bdaVar.c).X3(webpagepreview.chats, false);
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
                            bdaVar.x = webPage;
                            bda.a(bdaVar.a[0], webPage, str8);
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPagePending) {
                            bdaVar.x = webPage;
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPageEmpty) {
                            bdaVar.x = null;
                            if (bdaVar.b != 0) {
                                bdaVar.b = (byte) 0;
                                ada adaVar = bdaVar.I;
                                if (adaVar != null) {
                                    ((nh3) adaVar).f(0);
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
            default:
                ((nha) this.c).N0((k47) this.d, (View) this.e, this.b, false);
                return;
        }
    }

    public /* synthetic */ v36(hba hbaVar, dba dbaVar, int i, ArrayList arrayList) {
        this.a = (byte) 27;
        this.c = hbaVar;
        this.e = dbaVar;
        this.b = i;
        this.d = arrayList;
    }

    public /* synthetic */ v36(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ v36(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public /* synthetic */ v36(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
