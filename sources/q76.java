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
import org.telegram.SQLite.SQLiteCursor;
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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class q76 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q76(int i, TLRPC.TL_error tL_error, d dVar, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = (byte) 19;
        this.b = i;
        this.e = tL_error;
        this.c = dVar;
        this.d = tL_payments_assignPlayMarketTransaction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Type inference failed for: r6v0, types: [p74] */
    /* JADX WARN: Type inference failed for: r6v8, types: [ny0] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        TLObject tLObject;
        NativeByteBuffer byteBufferValue;
        JSONObject jSONObject;
        TLRPC.WebPage webPage;
        byte b = 5;
        byte b2 = 2;
        byte b3 = 3;
        p74 p74Var = null;
        byte b4 = 1;
        switch (this.a) {
            case 0:
                t76 t76Var = (t76) this.c;
                int i = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (t76Var.w) {
                    return;
                }
                if (!t76Var.F && i == t76Var.E) {
                    if (tLObject2 instanceof Vector) {
                        if (((Vector) tLObject2).toIntArray().contains(Integer.valueOf(t76Var.E))) {
                            t76Var.v();
                        } else {
                            t76Var.x();
                        }
                    } else if (tLObject2 instanceof TL_phone.groupCall) {
                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                        na7.q1(t76Var.e).a4(groupcall.users, false);
                        na7.q1(t76Var.e).U3(groupcall.chats, false);
                        t76Var.s = groupcall.call;
                        kk7.f(t76Var.e).k(kk7.F2, Long.valueOf(t76Var.s.id));
                    } else if (tL_error != null) {
                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
                            fa4.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                            gl.d3(new r76(t76Var, b4));
                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                            gl.d3(new r76(t76Var, b2));
                        }
                    }
                }
                if (t76Var.I) {
                    Runnable runnable = t76Var.J;
                    if (runnable != null) {
                        gl.r(runnable);
                    }
                    r76 r76Var = new r76(t76Var, b3);
                    t76Var.J = r76Var;
                    gl.e3(r76Var, 4000L);
                    return;
                }
                return;
            case 1:
                ((k96) this.c).f((i96) this.d, null, true, this.b, (mn6) this.e);
                return;
            case 2:
                hq6 hq6Var = (hq6) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                String str = (String) this.e;
                int i2 = this.b;
                try {
                    if (tL_messages_stickerSet != null) {
                        SQLitePreparedStatement executeFast = hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO stickers_dice VALUES(?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                        tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                        executeFast.bindString(1, str);
                        executeFast.bindByteBuffer(2, nativeByteBuffer);
                        executeFast.bindInteger(3, i2);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    } else {
                        SQLitePreparedStatement executeFast2 = hq6Var.getMessagesStorage().b.executeFast("UPDATE stickers_dice SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i2);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 3:
                ox6 ox6Var = (ox6) this.c;
                IBinder iBinder = (IBinder) this.d;
                int i3 = this.b;
                o6a o6aVar = (o6a) this.e;
                mv6 mv6Var = ox6Var.b;
                mv6Var.x0();
                su6 L = mv6Var.L(iBinder);
                bs2 bs2Var = L != null ? (bs2) ((ps) mv6Var.c).get(L) : null;
                r6 = bs2Var != null ? bs2Var.b : 0;
                if (r6 != 0) {
                    synchronized (r6.c) {
                        r4a r4aVar = (r4a) ((ps) r6.d).remove(Integer.valueOf(i3));
                        if (r4aVar != null) {
                            if (r4aVar.r.getClass() == o6a.class) {
                                r4aVar.l(o6aVar);
                            } else {
                                lad.f("SequencedFutureManager", "Type mismatch, expected " + r4aVar.r.getClass() + ", but was " + o6a.class);
                            }
                        }
                    }
                    return;
                }
                return;
            case 4:
                ox6 ox6Var2 = (ox6) this.c;
                IBinder iBinder2 = (IBinder) this.d;
                kx6 kx6Var = (kx6) this.e;
                int i4 = this.b;
                su6 L2 = ox6Var2.b.L(iBinder2);
                if (L2 != null) {
                    kx6Var.a(L2, i4);
                    return;
                }
                return;
            case 5:
                na7 na7Var = (na7) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i5 = this.b;
                q97 q97Var = (q97) this.e;
                if (!(tLObject3 instanceof TL_chatlists.TL_chatlists_chatlistUpdates)) {
                    q97Var.a = false;
                    return;
                }
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (TL_chatlists.TL_chatlists_chatlistUpdates) tLObject3;
                na7Var.U3(tL_chatlists_chatlistUpdates.chats, false);
                na7Var.a4(tL_chatlists_chatlistUpdates.users, false);
                SparseArray sparseArray = na7Var.d0;
                q97 q97Var2 = new q97();
                q97Var2.a = false;
                q97Var2.b = System.currentTimeMillis();
                q97Var2.c = tL_chatlists_chatlistUpdates;
                sparseArray.put(i5, q97Var2);
                na7Var.getNotificationCenter().k(kk7.B5, Integer.valueOf(i5));
                return;
            case 6:
                ((na7) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getSavedHistory) this.d, (TLRPC.TL_error) this.e);
                return;
            case 7:
                ((na7) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getReplies) this.d, (TLRPC.TL_error) this.e);
                return;
            case 8:
                ((na7) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getHistory) this.d, (TLRPC.TL_error) this.e);
                return;
            case 9:
                ((na7) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getPeerDialogs) this.d, (TLRPC.TL_error) this.e);
                return;
            case 10:
                na7 na7Var2 = (na7) this.c;
                vf6 vf6Var = (vf6) this.d;
                vf6 vf6Var2 = (vf6) this.e;
                int i6 = this.b;
                na7Var2.M1 = false;
                if (vf6Var == null && vf6Var2 == null) {
                    na7Var2.N1 = 0;
                    na7Var2.O1 = null;
                    na7Var2.P1 = null;
                    return;
                }
                na7Var2.N1 = i6;
                na7Var2.O1 = vf6Var;
                na7Var2.P1 = vf6Var2;
                if (na7Var2.Q1 != null) {
                    Utilities.d.a(na7Var2.Q1);
                    na7Var2.Q1 = null;
                }
                if (na7Var2.E(false)) {
                    return;
                }
                na7Var2.Q1 = new c87(na7Var2, b);
                Utilities.d.d(na7Var2.Q1, Math.abs(na7Var2.getConnectionsManager().getCurrentTime() - na7Var2.N1) * 1000);
                return;
            case 11:
                ad7 ad7Var = (ad7) this.c;
                int i7 = this.b;
                String str2 = (String) this.d;
                RequestDelegate requestDelegate = (RequestDelegate) this.e;
                try {
                    ad7Var.b.executeFast("DELETE FROM botcache WHERE date < " + i7).stepThis().dispose();
                    sQLiteCursor = ad7Var.b.queryFinalized("SELECT data FROM botcache WHERE id = ?", str2);
                    try {
                        try {
                            if (sQLiteCursor.next()) {
                                try {
                                    byteBufferValue = sQLiteCursor.byteBufferValue(0);
                                } catch (Exception e2) {
                                    e = e2;
                                    tLObject = null;
                                }
                                if (byteBufferValue != null) {
                                    int readInt32 = byteBufferValue.readInt32(false);
                                    tLObject = readInt32 == 911761060 ? TLRPC.TL_messages_botCallbackAnswer.TLdeserialize(byteBufferValue, readInt32, false) : TLRPC.messages_BotResults.TLdeserialize(byteBufferValue, readInt32, false);
                                    try {
                                        try {
                                            byteBufferValue.reuse();
                                        } catch (Exception e3) {
                                            e = e3;
                                            try {
                                                ad7Var.n(e, true);
                                                sQLiteCursor.dispose();
                                                requestDelegate.run(tLObject, null);
                                                return;
                                            } catch (Exception e4) {
                                                e = e4;
                                                ad7Var.n(e, true);
                                                requestDelegate.run(tLObject, null);
                                                if (sQLiteCursor != null) {
                                                    sQLiteCursor.dispose();
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        sQLiteCursor.dispose();
                                        requestDelegate.run(tLObject, null);
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                        requestDelegate.run(tLObject, null);
                                        if (sQLiteCursor != null) {
                                        }
                                        throw th;
                                    }
                                }
                            }
                            tLObject = null;
                            sQLiteCursor.dispose();
                            requestDelegate.run(tLObject, null);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            tLObject = null;
                            requestDelegate.run(tLObject, null);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        tLObject = null;
                    }
                } catch (Exception e6) {
                    e = e6;
                    sQLiteCursor = null;
                    tLObject = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                    tLObject = null;
                }
            case 12:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.c;
                View view = (View) this.d;
                String str3 = (String) this.e;
                int i8 = this.b;
                ArrayList arrayList = notificationsCustomSettingsActivity.J;
                int[] iArr = notificationsCustomSettingsActivity.E;
                if (!(view instanceof uib)) {
                    notificationsCustomSettingsActivity.p0(true);
                    return;
                }
                String M0 = k96.M0(iArr[Utilities.j(notificationsCustomSettingsActivity.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)], null);
                if (i8 >= 0 && i8 < arrayList.size()) {
                    ((qm7) arrayList.get(i8)).f = M0;
                }
                ((uib) view).c(k96.M0(2131743375, "Vibrate"), M0, true, true);
                return;
            case 13:
                boolean[] zArr = (boolean[]) this.c;
                hv0 hv0Var = (hv0) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i9 = this.b;
                un7.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (hv0Var != null) {
                    boolean z = hv0.R0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    hv0Var.v("oauth_result_failed", jSONObject);
                }
                if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    return;
                }
                TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                ConnectionsManager.getInstance(i9).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 14:
                nna nnaVar = (nna) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                String str4 = (String) this.e;
                int i10 = this.b;
                nnaVar.run();
                cq7.s(tL_starGiftUnique, k96.a0(null, null, 2131749512, str4));
                String str5 = tL_starGiftUnique.slug;
                if (TextUtils.isEmpty(str5)) {
                    return;
                }
                gl.e3(new iv1(i10, 0, 0L, str5, false), cq7.a[0]);
                return;
            case 15:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.c;
                TL_account.Passkey passkey = (TL_account.Passkey) this.d;
                String str6 = (String) this.e;
                int i11 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.S = k96.M0(2131747452, null);
                alertDialog$Builder.a.U = k96.M0(2131747453, null);
                alertDialog$Builder.j(k96.M0(2131751586, null), new zm((Object) passkeysActivity, (Object) passkey, (Object) str6, i11, (byte) 6));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 16:
                Context context = (Context) this.c;
                int i12 = this.b;
                TL_account.registerPasskey registerpasskey = (TL_account.registerPasskey) this.d;
                i8c i8cVar = (i8c) this.e;
                hd hdVar = new hd(3, null, context);
                hdVar.q(500L);
                hdVar.setOnCancelListener(new fo2(i12, ConnectionsManager.getInstance(i12).sendRequestTyped(registerpasskey, new hc(r8 ? (byte) 1 : (byte) 0), new w77(hdVar, i8cVar, b)), i8cVar, b4));
                return;
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                jl5 jl5Var = (jl5) this.d;
                int i13 = this.b;
                String str7 = (String) this.e;
                Drawable[] drawableArr = PhotoViewer.f9;
                try {
                    try {
                        o74 o74Var = new o74(a.b);
                        o74Var.g(0);
                        o74Var.f(0);
                        o74Var.b = false;
                        p74Var = o74Var.a();
                        if (p74Var.c.k()) {
                            xl3 xl3Var = new xl3((byte) 4);
                            Bitmap bitmap = jl5Var.c;
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            xl3Var.d = bitmap;
                            pc0 pc0Var = (pc0) xl3Var.b;
                            pc0Var.a = width;
                            pc0Var.b = height;
                            pc0Var.c = i13;
                            gl.d3(new vj6((Object) photoViewer, (Object) str7, p74Var.h(xl3Var).size() != 0, (byte) 14));
                        } else {
                            if (w01.a) {
                                fa4.d("face detection is not operational");
                            }
                            gl.d3(new pc7((Object) photoViewer, (Object) jl5Var, (Object) str7, (byte) 21));
                        }
                    } catch (Throwable th4) {
                        if (0 != 0) {
                            r6.d();
                        }
                        throw th4;
                    }
                } catch (Exception e7) {
                    fa4.g(e7, true);
                    if (0 == 0) {
                        return;
                    }
                }
                p74Var.d();
                return;
            case 18:
                c88 c88Var = (c88) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                vf6 vf6Var3 = (vf6) this.e;
                u21.v(c88Var.W2.E, null, frameLayout, vf6Var3.m(), vf6Var3.m() == 1 ? ((TLRPC.Dialog) vf6Var3.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 19:
                ij.c0(this.b, (TLRPC.TL_error) this.e, (d) this.c, (TLRPC.TL_payments_assignPlayMarketTransaction) this.d, new Object[0]);
                return;
            case 20:
                ((vw8) this.c).d1(this.b, (String) this.d, (String) this.e);
                return;
            case 21:
                vw8 vw8Var = (vw8) this.c;
                Bitmap bitmap2 = (Bitmap) this.d;
                int[] iArr2 = (int[]) this.e;
                int i14 = this.b;
                vw8Var.V4 = false;
                if (vw8Var.W4 == null) {
                    vw8Var.W4 = bitmap2;
                    vw8Var.X4 = iArr2;
                    vw8Var.Y4 = i14;
                    return;
                }
                return;
            case 22:
                ox8 ox8Var = (ox8) this.c;
                ArrayList arrayList2 = ox8Var.b;
                TLRPC.Message message = (TLRPC.Message) this.d;
                String str8 = (String) this.e;
                int i15 = this.b;
                int i16 = ox8Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    nx8 c = ox8Var.c(message.quick_reply_shortcut_id);
                    if (c == null) {
                        nx8 nx8Var = new nx8();
                        nx8Var.a = message.quick_reply_shortcut_id;
                        nx8Var.d = message.id;
                        k27 k27Var = new k27(i16, message, false, true);
                        nx8Var.e = k27Var;
                        k27Var.r0(false);
                        if (str8 != null) {
                            nx8Var.b = str8;
                            ox8Var.a(str8);
                        }
                        nx8Var.e.l(i15, str8);
                        nx8Var.f = 1;
                        arrayList2.add(nx8Var);
                        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                            ((nx8) arrayList2.get(i17)).c = i17;
                        }
                        ad7 Y = ad7.Y(i16);
                        Y.a.c(new lw8(Y, nx8Var, b2));
                        kk7.f(i16).k(kk7.E1, new Object[0]);
                    } else {
                        int i18 = c.d;
                        int i19 = message.id;
                        if (i18 == i19) {
                            c.d = i19;
                            k27 k27Var2 = new k27(i16, message, false, true);
                            c.e = k27Var2;
                            k27Var2.r0(false);
                            ox8Var.l();
                            kk7.f(i16).k(kk7.E1, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c.f++;
                            ox8Var.l();
                            kk7.f(i16).k(kk7.E1, new Object[0]);
                        }
                    }
                }
                if (str8 == null && i15 == 0) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(message);
                    ad7.Y(i16).g1(arrayList3, true, true, false, up3.q(i16).l(), false, 5, message.quick_reply_shortcut_id);
                    long e8 = y6c.h(i16).e();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new k27(i16, message, true, true));
                    na7.q1(i16).q5(5, e8, arrayList4);
                    return;
                }
                return;
            case 23:
                vs9.c(((vs9) this.c).getContext(), this.b, ((ss9) this.d).a.g(), (wjb) this.e);
                return;
            case 24:
                bu9 bu9Var = (bu9) this.c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) this.e;
                int i20 = this.b;
                TLRPC.MessageAction messageAction = message2.action;
                if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                    TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                    if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) && !(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                        messages_sentencryptedmessage.date = 0;
                    }
                }
                bu9Var.getMessagesStorage().X1(message2.random_id, 0L, Integer.valueOf(message2.id), message2.id, messages_sentencryptedmessage.date, 0, 0);
                gl.d3(new t79(bu9Var, message2, i20, b3));
                return;
            case 25:
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                pt0 pt0Var = (pt0) this.d;
                int i21 = this.b;
                TLRPC.User user = (TLRPC.User) this.e;
                if (userFull == null) {
                    pt0Var.a(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    y8a.b(i21, user, userFull, pt0Var);
                    return;
                }
            case 26:
                h9a h9aVar = (h9a) this.c;
                d9a d9aVar = (d9a) this.d;
                int i22 = this.b;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = h9aVar.c;
                boolean z2 = d9aVar != null;
                h9aVar.d = z2;
                if (!z2 || i22 < 0 || i22 >= arrayList6.size()) {
                    h9aVar.i = arrayList5;
                } else {
                    h9aVar.a++;
                    ((g9a) arrayList6.get(i22)).c++;
                    h9aVar.g.edit().putInt(de9.k(i22, "score"), ((g9a) arrayList6.get(i22)).c).putInt("scoreall", h9aVar.a).apply();
                    h9aVar.i = null;
                }
                h9aVar.e.a(d9aVar);
                return;
            case 27:
                bba bbaVar = (bba) this.c;
                int i23 = this.b;
                TLObject tLObject4 = (TLObject) this.d;
                String str9 = (String) this.e;
                HashMap hashMap = bbaVar.w;
                if (i23 != bbaVar.E) {
                    return;
                }
                bbaVar.y = 0;
                if (tLObject4 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject4;
                    na7.q1(bbaVar.c).a4(webpagepreview.users, false);
                    na7.q1(bbaVar.c).U3(webpagepreview.chats, false);
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
                            hashMap.put(str9, webPage);
                            bbaVar.x = webPage;
                            bba.a(bbaVar.a[0], webPage, str9);
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPagePending) {
                            bbaVar.x = webPage;
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPageEmpty) {
                            bbaVar.x = null;
                            if (bbaVar.b != 0) {
                                bbaVar.b = (byte) 0;
                                aba abaVar = bbaVar.I;
                                if (abaVar != null) {
                                    ((ag3) abaVar).g(0);
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
            case 28:
                ((nfa) this.c).N0((k27) this.d, (View) this.e, this.b, false);
                return;
            default:
                ((nfa) this.c).B0(this.b, (TL_stories.StoryItem) this.d, (String) this.e);
                return;
        }
    }

    public /* synthetic */ q76(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ q76(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public /* synthetic */ q76(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
