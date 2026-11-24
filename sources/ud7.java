// default package

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.SurfaceView;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.widget.ImageView;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ud7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ud7(i58 i58Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        this.a = (byte) 22;
        this.b = i58Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    private final void a() {
        int i;
        cf7 cf7Var = (cf7) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        i77 i77Var = (i77) this.d;
        cf7Var.getClass();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
            if (ephemeralMessage.top_msg_id == 0) {
                TL_ephemeral.EphemeralMessage U = cf7Var.U(ephemeralMessage.id, pg3.n(ephemeralMessage.peer_id));
                if (U != null && (i = U.top_msg_id) != 0) {
                    ephemeralMessage.top_msg_id = i;
                    TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
                    if (messageReplyHeader != null) {
                        messageReplyHeader.forum_topic = true;
                    }
                    ephemeralMessage.flags |= 2;
                }
            }
        }
        cf7Var.d1(arrayList, true);
        i77Var.run();
    }

    private final void b() {
        gm.c3(new bl7((u35) this.d, cf7.Y(((ml7) this.b).a).g0(((TLRPC.TL_contact) this.c).user_id), (byte) 4));
    }

    private final void c() {
        TLRPC.User user;
        ml7 ml7Var = (ml7) this.b;
        TLObject tLObject = (TLObject) this.c;
        u35 u35Var = (u35) this.d;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            oc7.r1(ml7Var.a).d4(tL_contacts_resolvedPeer.users, false);
            oc7.r1(ml7Var.a).X3(tL_contacts_resolvedPeer.chats, false);
            long n = pg3.n(tL_contacts_resolvedPeer.peer);
            if (n >= 0) {
                user = oc7.r1(ml7Var.a).W1(Long.valueOf(n));
                u35Var.a(user);
            }
        }
        user = null;
        u35Var.a(user);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013d  */
    /* JADX WARN: Type inference failed for: r12v10, types: [jb6] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void d() {
        String[] strArr;
        int i;
        TLRPC.Chat chat;
        Object obj;
        ArrayList arrayList;
        ?? r19;
        String S0;
        String str;
        int i2;
        int i3;
        wo7 wo7Var = (wo7) this.b;
        String str2 = (String) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = wo7Var.n;
        String lowerCase = str2.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            gm.c3(new jy6(wo7Var, new ArrayList(), new ArrayList(), new ArrayList()));
            return;
        }
        ?? r5 = 1;
        boolean z = false;
        String S02 = jb6.D0().S0(lowerCase, true, false);
        if (lowerCase.equals(S02) || S02.length() == 0) {
            S02 = null;
        }
        int i4 = (S02 != null ? 1 : 0) + 1;
        String[] strArr2 = new String[i4];
        strArr2[0] = lowerCase;
        if (S02 != null) {
            strArr2[1] = S02;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        String[] strArr3 = new String[2];
        int i5 = 0;
        while (i5 < arrayList2.size()) {
            zo7 zo7Var = (zo7) arrayList2.get(i5);
            String[] strArr4 = strArr3;
            if (pg3.B(zo7Var.d)) {
                strArr = strArr2;
                TLRPC.EncryptedChat Z0 = notificationsCustomSettingsActivity.getMessagesController().Z0(Integer.valueOf((int) (zo7Var.d & 4294967295L)));
                if (Z0 != null) {
                    i = i5;
                    TLRPC.User W1 = notificationsCustomSettingsActivity.getMessagesController().W1(Long.valueOf(Z0.user_id));
                    if (W1 != null) {
                        strArr4[z ? 1 : 0] = bw2.m(z ? 1 : 0, W1.first_name, W1.last_name);
                        strArr4[r5 == true ? 1 : 0] = m9c.p(W1);
                    }
                } else {
                    i = i5;
                }
            } else {
                strArr = strArr2;
                i = i5;
                if (pg3.D(zo7Var.d)) {
                    TLRPC.User W12 = notificationsCustomSettingsActivity.getMessagesController().W1(Long.valueOf(zo7Var.d));
                    if (W12 != null && !W12.deleted) {
                        strArr4[z ? 1 : 0] = bw2.m(z ? 1 : 0, W12.first_name, W12.last_name);
                        strArr4[r5 == true ? 1 : 0] = m9c.p(W12);
                        chat = W12;
                        obj = chat;
                        String str3 = strArr4[z ? 1 : 0];
                        strArr4[z ? 1 : 0] = str3.toLowerCase();
                        S0 = jb6.D0().S0(strArr4[z ? 1 : 0], r5, z);
                        str = strArr4[z ? 1 : 0];
                        if (str != null && str.equals(S0)) {
                            S0 = null;
                        }
                        i2 = z ? 1 : 0;
                        int i6 = i2;
                        r5 = r5;
                        while (i2 < i4) {
                            r19 = z ? 1 : 0;
                            String str4 = strArr[i2];
                            int i7 = r5 == true ? 1 : 0;
                            String str5 = strArr4[r19];
                            arrayList = arrayList2;
                            if ((str5 == null || !(str5.startsWith(str4) || hg9.s(" ", str4, strArr4[r19]))) && (S0 == null || !(S0.startsWith(str4) || hg9.s(" ", str4, S0)))) {
                                String str6 = strArr4[i7];
                                i3 = (str6 == null || !str6.startsWith(str4)) ? i6 : 2;
                            } else {
                                i3 = i7;
                            }
                            r5 = i7;
                            if (i3 != 0) {
                                if (i3 == r5) {
                                    arrayList5.add(gm.r0(str3, null, str4));
                                } else {
                                    arrayList5.add(gm.r0("@" + strArr4[r5 == true ? 1 : 0], null, "@" + str4));
                                }
                                arrayList4.add(zo7Var);
                                if (obj != null) {
                                    arrayList3.add(obj);
                                }
                                i5 = i + 1;
                                strArr3 = strArr4;
                                strArr2 = strArr;
                                z = r19;
                                arrayList2 = arrayList;
                                r5 = r5;
                            } else {
                                i2++;
                                i6 = i3;
                                z = r19;
                                arrayList2 = arrayList;
                                r5 = r5;
                            }
                        }
                    }
                } else {
                    TLRPC.Chat L0 = notificationsCustomSettingsActivity.getMessagesController().L0(Long.valueOf(-zo7Var.d));
                    if (L0 != null) {
                        if (!L0.left && !L0.kicked && L0.migrated_to == null) {
                            strArr4[z ? 1 : 0] = L0.title;
                            strArr4[r5 == true ? 1 : 0] = sd2.K(L0, z);
                            chat = L0;
                            obj = chat;
                            String str32 = strArr4[z ? 1 : 0];
                            strArr4[z ? 1 : 0] = str32.toLowerCase();
                            S0 = jb6.D0().S0(strArr4[z ? 1 : 0], r5, z);
                            str = strArr4[z ? 1 : 0];
                            if (str != null) {
                                S0 = null;
                            }
                            i2 = z ? 1 : 0;
                            int i62 = i2;
                            r5 = r5;
                            while (i2 < i4) {
                            }
                        }
                    }
                }
                arrayList = arrayList2;
                r19 = z;
                i5 = i + 1;
                strArr3 = strArr4;
                strArr2 = strArr;
                z = r19;
                arrayList2 = arrayList;
                r5 = r5;
            }
            obj = null;
            String str322 = strArr4[z ? 1 : 0];
            strArr4[z ? 1 : 0] = str322.toLowerCase();
            S0 = jb6.D0().S0(strArr4[z ? 1 : 0], r5, z);
            str = strArr4[z ? 1 : 0];
            if (str != null) {
            }
            i2 = z ? 1 : 0;
            int i622 = i2;
            r5 = r5;
            while (i2 < i4) {
            }
            arrayList = arrayList2;
            r19 = z;
            i5 = i + 1;
            strArr3 = strArr4;
            strArr2 = strArr;
            z = r19;
            arrayList2 = arrayList;
            r5 = r5;
        }
        gm.c3(new jy6(wo7Var, arrayList4, arrayList5, arrayList3));
    }

    private final void e() {
        boolean[] zArr = (boolean[]) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        tp7 tp7Var = (tp7) this.d;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
        }
        tp7Var.a(0L);
    }

    private final void f() {
        boolean[] zArr = (boolean[]) this.b;
        k11 k11Var = (k11) this.c;
        he heVar = (he) this.d;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        k11Var.c(false);
        heVar.dismiss();
    }

    private final void g() {
        ((ss7) this.b).h0((TLObject) this.d, (TLRPC.TL_error) this.c);
    }

    private final void h() {
        xz7 xz7Var = (xz7) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        xz7Var.A1();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                xz7Var.P1(jb6.M0(R.string.AppName, null), tL_error.text);
                return;
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                xz7Var.P1(jb6.M0(R.string.AppName, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue < 60 ? jb6.G(intValue, "Seconds", new Object[0]) : jb6.G(intValue / 60, "Minutes", new Object[0])));
                return;
            }
        }
        TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xz7Var.getParentActivity());
        String a0 = jb6.a0("RestoreEmailSent", null, 2131745813, tL_auth_passwordRecovery.email_pattern);
        he heVar = alertDialog$Builder.a;
        heVar.U = a0;
        heVar.S = jb6.M0(2131745811, null);
        alertDialog$Builder.j(jb6.M0(2131747564, null), new cz6((Object) xz7Var, (Object) tL_auth_passwordRecovery, (byte) 11));
        Dialog showDialog = xz7Var.showDialog(heVar);
        if (showDialog != null) {
            showDialog.setCanceledOnTouchOutside(false);
            showDialog.setCancelable(false);
        }
    }

    private final void i() {
        wm4 wm4Var = (wm4) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        wm4Var.b0(tL_error.text, (String) this.c);
    }

    private final void j() {
        int i;
        nz7 nz7Var = (nz7) this.b;
        byte[] bArr = (byte[]) this.d;
        String str = (String) this.c;
        SecureRandom secureRandom = Utilities.b;
        xz7 xz7Var = nz7Var.e;
        secureRandom.setSeed(xz7Var.K.secure_random);
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        TL_account.Password password = xz7Var.K;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = nq9.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        byte[] j1 = xz7.j1();
        xz7Var.d1 = j1;
        xz7Var.c1 = Utilities.g(Utilities.o(32L, j1));
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = xz7Var.K.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] m = Utilities.m(gm.g1(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
            xz7Var.f1 = m;
            byte[] bArr2 = new byte[32];
            System.arraycopy(m, 0, bArr2, 0, 32);
            byte[] bArr3 = new byte[16];
            System.arraycopy(xz7Var.f1, 32, bArr3, 0, 16);
            byte[] bArr4 = xz7Var.d1;
            Utilities.b(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
            updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
            TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
            tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
            tL_secureSecretSettings.secure_secret = xz7Var.d1;
            tL_secureSecretSettings.secure_secret_id = xz7Var.c1;
            passwordinputsettings.flags |= 4;
        }
        i = ((d) xz7Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(updatepasswordsettings, new lz7(nz7Var, (byte) 2));
    }

    private final void k() {
        int i;
        int i2;
        int i3;
        tz7 tz7Var = (tz7) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.d;
        int i4 = tz7Var.M;
        xz7 xz7Var = tz7Var.R;
        xz7Var.A1();
        tz7Var.K = false;
        if (tL_error == null) {
            tz7Var.r();
            tz7Var.q();
            xz7Var.C1.c(xz7Var.F, (String) xz7Var.t1.get("phone"), null, null, null, null, null, null, null, null, new ny7(xz7Var, (byte) 6), null);
            return;
        }
        tz7Var.L = tL_error.text;
        if ((i4 == 3 && ((i3 = tz7Var.N) == 4 || i3 == 2)) || ((i4 == 2 && ((i = tz7Var.N) == 4 || i == 3)) || (i4 == 4 && tz7Var.N == 2))) {
            tz7Var.p();
        }
        if (i4 == 2) {
            gm.y3(true);
            nm7.e().a(tz7Var, nm7.k4);
        } else if (i4 == 3) {
            gm.x3(true);
            nm7.e().a(tz7Var, nm7.l4);
        }
        tz7Var.J = true;
        if (i4 != 3) {
            i2 = ((d) xz7Var).currentAccount;
            ik.c0(i2, tL_error, xz7Var, verifyphone, new Object[0]);
        }
        xz7Var.Q1(true, false);
        if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                tz7Var.d(true);
                xz7Var.N1(null, 0, true);
                return;
            }
            return;
        }
        int i5 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = tz7Var.d;
            if (i5 >= editTextBoldCursorArr.length) {
                editTextBoldCursorArr[0].requestFocus();
                return;
            } else {
                editTextBoldCursorArr[i5].setText("");
                i5++;
            }
        }
    }

    private final void l() {
        ((p) this.b).m0((TL_account.Password) this.c, (byte[]) this.d);
    }

    private final void m() {
        ((p) this.b).u0((TLRPC.TL_error) this.c, (TLRPC.TL_payments_sendPaymentForm) this.d);
    }

    private final void n() {
        p pVar = (p) this.b;
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
        bl7 bl7Var = (bl7) this.d;
        pVar.getClass();
        pVar.F0 = tL_payments_validatedRequestedInfo;
        bl7Var.run();
        pVar.J0(false);
        pVar.N0(true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void o() {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Reaction reaction;
        ImageReceiver imageReceiver;
        TLRPC.TL_availableReaction tL_availableReaction2;
        vm vmVar;
        f48 f48Var = (f48) this.b;
        k39 k39Var = (k39) this.c;
        View view = (View) this.d;
        a58 a58Var = f48Var.a;
        a58Var.k3 = true;
        z48 z48Var = a58Var.E1;
        ImageReceiver imageReceiver2 = a58Var.b3;
        boolean[] zArr = {false};
        m4b m4bVar = a58Var.u0;
        m4bVar.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new ul(m4bVar, (byte) 2)).setDuration(150L).start();
        int L = gm.L(8.0f);
        m4b m4bVar2 = new m4b(a58Var.getContext(), a58Var.n1);
        a58Var.u0 = m4bVar2;
        m4bVar2.setPadding(L, L, L, L);
        a58Var.t0.addView(a58Var.u0, qoe.e(40, 40, 3));
        vm vmVar2 = a58Var.e3;
        if (vmVar2 != null) {
            vmVar2.o(a58Var);
            a58Var.e3 = null;
        }
        xm xmVar = a58Var.c3;
        if (xmVar != null) {
            xmVar.d(a58Var);
            a58Var.c3 = null;
        }
        a58Var.f3 = false;
        if (k39Var.g != 0) {
            a58Var.f3 = true;
            vm vmVar3 = new vm(2, a58Var.s2, k39Var.g);
            a58Var.e3 = vmVar3;
            vmVar3.b(a58Var);
        } else if (k39Var.f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(a58Var.s2).r.get(k39Var.f)) != null) {
            a58Var.d3.Y(null, null, gn5.b(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
            reaction = null;
            imageReceiver2.d0(gn5.b(tL_availableReaction.around_animation), g39.a(), null, null, null, 0);
            if (imageReceiver2.y() != null) {
                imageReceiver2.y().I(0, false, true);
            }
            a58Var.u0.setReaction(k39Var);
            if (a58Var.t1) {
                TL_stories.StoryItem storyItem = z48Var.a;
                if (storyItem.sent_reaction == null) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryItem storyItem2 = z48Var.a;
                    TL_stories.StoryViews storyViews = storyItem2.views;
                    storyViews.reactions_count++;
                    n39.b(reaction, storyItem2.sent_reaction, storyViews);
                    a58Var.i1(true);
                }
            }
            if (k39Var.g != 0 && (vmVar = a58Var.u0.f) != null) {
                xm a = xm.a(vmVar, false, true);
                a58Var.c3 = a;
                a.f(a58Var);
            }
            a58Var.I1.i0(a58Var.r1, z48Var.a, k39Var);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            a58Var.getLocationInWindow(iArr2);
            a58Var.m3 = iArr[0] - iArr2[0];
            a58Var.n3 = iArr[1] - iArr2[1];
            a58Var.o3 = view.getMeasuredHeight();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            a58Var.l3 = 0.0f;
            a58Var.invalidate();
            m4b m4bVar3 = a58Var.u0;
            m4bVar3.setAllowDrawReaction(false);
            imageReceiver = m4bVar3.e;
            if (k39Var.g == 0 && (tL_availableReaction2 = (TLRPC.TL_availableReaction) hs6.d0(z8c.t0).r.get(k39Var.f)) != null) {
                imageReceiver.d0(gn5.b(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                imageReceiver.M(0);
            }
            ofFloat.addUpdateListener(new nl(f48Var, ofFloat, zArr, (byte) 4));
            ofFloat.addListener(new i8(f48Var, zArr, m4bVar3, (byte) 10));
            ofFloat.setDuration(220L);
            ofFloat.start();
            a58Var.W0(false);
        }
        reaction = null;
        a58Var.u0.setReaction(k39Var);
        if (a58Var.t1) {
        }
        if (k39Var.g != 0) {
            xm a2 = xm.a(vmVar, false, true);
            a58Var.c3 = a2;
            a2.f(a58Var);
        }
        a58Var.I1.i0(a58Var.r1, z48Var.a, k39Var);
        int[] iArr3 = new int[2];
        view.getLocationInWindow(iArr3);
        int[] iArr22 = new int[2];
        a58Var.getLocationInWindow(iArr22);
        a58Var.m3 = iArr3[0] - iArr22[0];
        a58Var.n3 = iArr3[1] - iArr22[1];
        a58Var.o3 = view.getMeasuredHeight();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        a58Var.l3 = 0.0f;
        a58Var.invalidate();
        m4b m4bVar32 = a58Var.u0;
        m4bVar32.setAllowDrawReaction(false);
        imageReceiver = m4bVar32.e;
        if (k39Var.g == 0) {
            imageReceiver.d0(gn5.b(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
            imageReceiver.M(0);
        }
        ofFloat2.addUpdateListener(new nl(f48Var, ofFloat2, zArr, (byte) 4));
        ofFloat2.addListener(new i8(f48Var, zArr, m4bVar32, (byte) 10));
        ofFloat2.setDuration(220L);
        ofFloat2.start();
        a58Var.W0(false);
    }

    private final void p() {
        v48 v48Var = (v48) this.b;
        r63 r63Var = (r63) this.c;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
        a58 a58Var = v48Var.x;
        ik.P(a58Var.getContext(), null, r63Var, new wu2((Object) v48Var, (Object) storyItem, (Object) r63Var, (byte) 22));
        v48 v48Var2 = a58Var.j1;
        if (v48Var2 != null) {
            v48Var2.a();
        }
    }

    private final void q() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        t3b t3bVar = (t3b) this.b;
        TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.c;
        qac qacVar = (qac) this.d;
        for (int i = 0; i < t3bVar.i.size(); i++) {
            k47 k47Var = (k47) t3bVar.i.get(i);
            if (k47Var != null && (storyItem = k47Var.l) != null && (messageMedia = storyItem.media) != null && (document = storyItem2.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                qacVar.a(document2);
                return;
            }
        }
        qacVar.a(null);
    }

    private final void r() {
        i58 i58Var = (i58) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (tL_error == null) {
            i58Var.r1 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull M0 = oc7.r1(i58Var.a).M0(i58Var.p1);
            if (M0 != null) {
                M0.exported_invite = i58Var.r1;
            }
            i58Var.o1.setLink(i58Var.r1.link);
        }
        i58Var.q1 = false;
    }

    private final void s() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        boolean[] zArr = (boolean[]) this.c;
        j88 j88Var = (j88) this.d;
        Drawable[] drawableArr = PhotoViewer.d9;
        if (zArr[0]) {
            return;
        }
        ImageView imageView = photoViewer.x3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        SurfaceView surfaceView = photoViewer.D2;
        if (surfaceView != null) {
            surfaceView.setVisibility(4);
        }
        zArr[0] = true;
        j88Var.run();
    }

    private final void t() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        n88 n88Var = (n88) this.d;
        Drawable[] drawableArr = PhotoViewer.d9;
        photoViewer.B4.f0(bitmap);
        photoViewer.s5.setUndoCutState(true);
        photoViewer.k2(true, true);
        gm.r(n88Var);
        gm.d3(n88Var, 800L);
    }

    private final void u() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        jn5 jn5Var = (jn5) this.d;
        String str = (String) this.c;
        Drawable[] drawableArr = PhotoViewer.d9;
        jn5Var.a();
        if (str.equals(photoViewer.B4.R)) {
            photoViewer.v4 = (byte) 2;
            photoViewer.w4 = str;
        }
    }

    private final void v() {
        ab8 ab8Var = (ab8) this.b;
        ab8 ab8Var2 = (ab8) this.c;
        int[] iArr = (int[]) this.d;
        PhotoViewer photoViewer = ab8Var.d;
        if (photoViewer.E == null || ab8Var2 != photoViewer.C8) {
            return;
        }
        photoViewer.C8 = null;
        photoViewer.v8 = iArr[5];
        photoViewer.n8 = iArr[4];
        photoViewer.o8 = iArr[7];
        float f = photoViewer.l8 / 8;
        PhotoViewer photoViewer2 = ab8Var.d;
        photoViewer.w8 = (long) ((f * photoViewer2.n8) / 1000.0f);
        boolean z = photoViewer2.p8;
        PhotoViewer photoViewer3 = ab8Var.d;
        if (z) {
            photoViewer3.g8 = iArr[8];
            photoViewer3.S2();
            if (ab8Var.d.d8 > ab8Var.d.e8 - 1) {
                PhotoViewer photoViewer4 = ab8Var.d;
                photoViewer4.d8 = photoViewer4.e8 - 1;
            }
            PhotoViewer photoViewer5 = ab8Var.d;
            if (!photoViewer5.I4) {
                kcc kccVar = photoViewer5.k1;
                boolean z2 = photoViewer5.e8 > 1;
                PhotoViewer photoViewer6 = ab8Var.d;
                kccVar.a(Math.min(photoViewer6.j8, ab8Var.d.k8), z2, photoViewer6.r);
            }
            if (e21.a) {
                StringBuilder sb = new StringBuilder("compressionsCount = ");
                sb.append(ab8Var.d.e8);
                sb.append(" w = ");
                sb.append(ab8Var.d.h8);
                sb.append(" h = ");
                sb.append(ab8Var.d.i8);
                sb.append(" r = ");
                b10.p(ab8Var.d.g8, sb);
            }
            ab8Var.d.T7.invalidate();
        } else {
            if (!photoViewer3.I4) {
                photoViewer3.k1.a(Math.min(photoViewer3.j8, ab8Var.d.k8), false, photoViewer3.r);
            }
            ab8Var.d.e8 = 0;
        }
        ab8Var.d.P2();
        ab8Var.d.J2();
    }

    private final void w() {
        JSONObject optJSONObject;
        String optString;
        sv svVar = (sv) this.b;
        String str = (String) this.c;
        WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
        ya8 ya8Var = (ya8) svVar.b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + ya8Var.x).put("platform", "DESKTOP"))).put("videoId", ya8Var.x).toString().getBytes("UTF-8"));
            outputStream.close();
            InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            byte[] bArr = new byte[10240];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
            byteArrayOutputStream.close();
            inputStream.close();
            JSONObject optJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) == null || (optString = optJSONObject.optString("spec")) == null) {
                return;
            }
            if (ya8Var.I == 0) {
                ya8Var.s = optString;
            } else {
                ya8Var.g(optString);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    private final void x() {
        nv1 nv1Var;
        TLRPC.Message message;
        xg8 xg8Var = (xg8) this.b;
        yv1 yv1Var = (yv1) this.c;
        TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
        k47 k47Var = xg8Var.I;
        byte[] bArr = pollAnswer.option;
        if (k47Var == null || (message = k47Var.k) == null || !(message.media instanceof TLRPC.TL_messageMediaPoll)) {
            nv1Var = null;
        } else {
            k47.B0(message);
            nv1Var = new nv1();
            nv1Var.a = k47Var;
            nv1Var.b = -1;
            nv1Var.c = -1;
            nv1Var.h = true;
            nv1Var.e = bArr;
            nv1Var.f();
        }
        yv1Var.ec(k47Var, nv1Var);
        xg8Var.b(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x029d A[Catch: Exception -> 0x063e, TryCatch #0 {Exception -> 0x063e, blocks: (B:135:0x022f, B:139:0x023d, B:146:0x024b, B:148:0x0266, B:152:0x0282, B:153:0x0279, B:156:0x0292, B:157:0x0299, B:159:0x029d, B:161:0x02a7, B:163:0x02b5, B:166:0x02b8, B:168:0x02c4, B:170:0x02d5, B:171:0x02e7, B:173:0x02f1, B:175:0x02fd, B:177:0x0315, B:179:0x032d, B:181:0x0333, B:184:0x033b, B:186:0x02da, B:188:0x02e0, B:189:0x02e2, B:193:0x034f, B:194:0x0357, B:196:0x035d, B:202:0x037f, B:203:0x0384, B:205:0x038a, B:207:0x0391, B:208:0x0398, B:210:0x039e, B:212:0x03a8, B:213:0x03ac, B:219:0x03c2, B:221:0x03ce, B:227:0x03d5, B:231:0x03d8, B:230:0x03de, B:234:0x038d, B:235:0x0382, B:237:0x03e1, B:239:0x03e7, B:241:0x03f4, B:243:0x03fe, B:246:0x0541, B:254:0x0411, B:256:0x043c, B:257:0x0440, B:261:0x044b, B:263:0x0454, B:265:0x0462, B:266:0x0474, B:268:0x047c, B:269:0x0481, B:271:0x049e, B:273:0x04a4, B:275:0x0467, B:277:0x046d, B:278:0x046f, B:282:0x04b0, B:284:0x04b7, B:285:0x04bc, B:287:0x04c3, B:289:0x04cf, B:291:0x04d9, B:292:0x04dc, B:294:0x04e2, B:297:0x0525, B:299:0x04f4, B:301:0x04fc, B:302:0x04fe, B:304:0x050f, B:305:0x0512, B:307:0x051a, B:312:0x0530, B:313:0x04ba, B:314:0x04b3, B:316:0x0536, B:322:0x0555, B:325:0x056b), top: B:134:0x022f }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b8 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        NativeByteBuffer byteBufferValue;
        boolean z;
        cf7 cf7Var;
        cf7 cf7Var2;
        TLRPC.TL_messages_dialogs tL_messages_dialogs;
        int i2;
        int i3;
        ArrayList arrayList;
        SparseArray sparseArray;
        HashSet hashSet;
        ArrayList arrayList2;
        HashMap hashMap;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList<TLRPC.InputPeer> arrayList5;
        HashMap hashMap2;
        ArrayList arrayList6;
        Long valueOf;
        boolean z2;
        boolean z3;
        ArrayList arrayList7;
        HashMap hashMap3;
        LinkedHashMap linkedHashMap;
        int size;
        int i4;
        Long valueOf2;
        ArrayList arrayList8;
        switch (this.a) {
            case 0:
                cf7 cf7Var3 = (cf7) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                try {
                    if (str.length() != 0) {
                        SQLiteDatabase sQLiteDatabase = cf7Var3.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(" + str + ")").stepThis().dispose();
                    }
                    if (str2.length() != 0) {
                        SQLiteDatabase sQLiteDatabase2 = cf7Var3.b;
                        Locale locale2 = Locale.US;
                        sQLiteDatabase2.executeFast("UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(" + str2 + ")").stepThis().dispose();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    cf7Var3.n(e, true);
                    return;
                }
            case 1:
                ((cf7) this.b).getNotificationCenter().k(50, Long.valueOf(k47.B0(((k47) this.c).k)), (ArrayList) this.d);
                return;
            case 2:
                cf7 cf7Var4 = (cf7) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                lp1 lp1Var = (lp1) this.d;
                long e2 = cf7Var4.getUserConfig().e();
                int size2 = arrayList9.size();
                while (i < size2) {
                    int i5 = i + 1;
                    k47 k47Var = (k47) arrayList9.get(i);
                    if (!k47Var.r1 && !k47.a4(k47Var.k)) {
                        try {
                            sQLiteCursor2 = cf7Var4.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", Long.valueOf(k47.B0(k47Var.k)), Integer.valueOf(k47Var.e1()));
                            try {
                                try {
                                    if (sQLiteCursor2.next() && (byteBufferValue = sQLiteCursor2.byteBufferValue(0)) != null) {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                        TLdeserialize.readAttachPath(byteBufferValue, e2);
                                        byteBufferValue.reuse();
                                        k47Var.k.attachPath = TLdeserialize.attachPath;
                                        k47Var.K(true);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    sQLiteCursor = sQLiteCursor2;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                fc4.g(e, true);
                                i = sQLiteCursor2 == null ? i5 : 0;
                                sQLiteCursor2.dispose();
                            }
                        } catch (Exception e4) {
                            e = e4;
                            sQLiteCursor2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = null;
                        }
                        sQLiteCursor2.dispose();
                    }
                }
                gm.c3(lp1Var);
                return;
            case 3:
                cf7 cf7Var5 = (cf7) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                final Runnable runnable = (Runnable) this.d;
                try {
                    SparseArray sparseArray2 = new SparseArray();
                    int size3 = cf7Var5.I.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        try {
                            ub7 ub7Var = (ub7) cf7Var5.I.get(i6);
                            sparseArray2.put(ub7Var.a, ub7Var);
                        } catch (Exception e5) {
                            e = e5;
                            z = true;
                            cf7Var5.n(e, z);
                            return;
                        }
                    }
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    final HashMap hashMap4 = new HashMap();
                    ArrayList arrayList13 = new ArrayList();
                    HashMap hashMap5 = new HashMap();
                    ArrayList arrayList14 = new ArrayList();
                    final HashMap hashMap6 = new HashMap();
                    final ArrayList arrayList15 = new ArrayList();
                    final HashMap hashMap7 = new HashMap();
                    HashSet hashSet2 = new HashSet();
                    int size4 = arrayList10.size();
                    int i7 = 0;
                    while (i7 < size4) {
                        TLRPC.DialogFilter dialogFilter = (TLRPC.DialogFilter) arrayList10.get(i7);
                        ArrayList arrayList16 = arrayList10;
                        arrayList11.add(Integer.valueOf(dialogFilter.id));
                        if (dialogFilter.contacts) {
                            int i8 = oc7.s5;
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        if (dialogFilter.non_contacts) {
                            int i9 = oc7.s5;
                            i2 |= 2;
                        }
                        if (dialogFilter.groups) {
                            int i10 = oc7.s5;
                            i2 |= 4;
                        }
                        if (dialogFilter.broadcasts) {
                            int i11 = oc7.s5;
                            i2 |= 8;
                        }
                        if (dialogFilter.bots) {
                            int i12 = oc7.s5;
                            i2 |= 16;
                        }
                        if (dialogFilter.exclude_muted) {
                            int i13 = oc7.s5;
                            i2 |= 32;
                        }
                        if (dialogFilter.exclude_read) {
                            int i14 = oc7.s5;
                            i3 = i2 | 64;
                        } else {
                            i3 = i2;
                        }
                        int i15 = i7;
                        if (dialogFilter.exclude_archived) {
                            int i16 = oc7.s5;
                            i3 |= 128;
                        }
                        if (dialogFilter instanceof TLRPC.TL_dialogFilterChatlist) {
                            int i17 = oc7.s5;
                            i3 = dialogFilter.has_my_invites ? i3 | 1536 : i3 | 512;
                        }
                        int i18 = size4;
                        ub7 ub7Var2 = (ub7) cf7Var5.J.get(dialogFilter.id);
                        if (ub7Var2 != null) {
                            sparseArray2.remove(dialogFilter.id);
                            arrayList = arrayList11;
                            if (TextUtils.equals(ub7Var2.b, dialogFilter.title.text) && hs6.M(ub7Var2.c, dialogFilter.title.entities)) {
                                z2 = false;
                            } else {
                                TLRPC.TL_textWithEntities tL_textWithEntities = dialogFilter.title;
                                ub7Var2.b = tL_textWithEntities.text;
                                ub7Var2.c = tL_textWithEntities.entities;
                                z2 = true;
                            }
                            boolean z4 = ub7Var2.n;
                            boolean z5 = z2;
                            boolean z6 = dialogFilter.title_noanimate;
                            if (z4 != z6) {
                                ub7Var2.n = z6;
                                z5 = true;
                            }
                            int i19 = (dialogFilter.flags & TLObject.FLAG_27) != 0 ? dialogFilter.color : -1;
                            if (ub7Var2.m != i19) {
                                ub7Var2.m = i19;
                                z5 = true;
                            }
                            if (ub7Var2.g != i3) {
                                ub7Var2.g = i3;
                                z3 = true;
                                z5 = true;
                            } else {
                                z3 = false;
                            }
                            HashSet hashSet3 = new HashSet(ub7Var2.h);
                            hashSet3.addAll(ub7Var2.i);
                            HashSet hashSet4 = new HashSet();
                            boolean z7 = z3;
                            if (ub7Var2.j.size() != 0) {
                                ArrayList arrayList17 = new ArrayList();
                                sparseArray = sparseArray2;
                                int size5 = ub7Var2.j.size();
                                cf7Var = cf7Var5;
                                int i20 = 0;
                                boolean z8 = false;
                                while (i20 < size5) {
                                    int i21 = size5;
                                    try {
                                        long keyAt = ub7Var2.j.keyAt(i20);
                                        if (pg3.B(keyAt)) {
                                            z8 = true;
                                        }
                                        arrayList17.add(Long.valueOf(keyAt));
                                        i20++;
                                        size5 = i21;
                                    } catch (Exception e6) {
                                        e = e6;
                                        cf7Var5 = cf7Var;
                                        z = true;
                                        cf7Var5.n(e, z);
                                        return;
                                    }
                                }
                                if (z8) {
                                    linkedHashMap = new LinkedHashMap();
                                    arrayList7 = arrayList13;
                                    hashMap3 = hashMap5;
                                    Collections.sort(arrayList17, new ne4(ub7Var2.j, (byte) 1));
                                    int size6 = arrayList17.size();
                                    int i22 = 0;
                                    while (i22 < size6) {
                                        Long l = (Long) arrayList17.get(i22);
                                        if (pg3.B(l.longValue())) {
                                            arrayList8 = arrayList17;
                                            linkedHashMap.put(Integer.valueOf(i22), l);
                                        } else {
                                            arrayList8 = arrayList17;
                                        }
                                        i22++;
                                        arrayList17 = arrayList8;
                                    }
                                    size = ub7Var2.j.size();
                                    i4 = 0;
                                    while (true) {
                                        LongSparseIntArray longSparseIntArray = ub7Var2.j;
                                        if (i4 >= size) {
                                            long keyAt2 = longSparseIntArray.keyAt(i4);
                                            if (!pg3.B(keyAt2)) {
                                                hashSet4.add(Long.valueOf(keyAt2));
                                                hashSet3.remove(Long.valueOf(keyAt2));
                                            }
                                            i4++;
                                        } else {
                                            longSparseIntArray.clear();
                                            int size7 = dialogFilter.pinned_peers.size();
                                            int i23 = 0;
                                            while (i23 < size7) {
                                                TLRPC.InputPeer inputPeer = dialogFilter.pinned_peers.get(i23);
                                                ArrayList arrayList18 = arrayList12;
                                                int i24 = size7;
                                                long j = inputPeer.user_id;
                                                if (j != 0) {
                                                    valueOf2 = Long.valueOf(j);
                                                } else {
                                                    long j2 = inputPeer.chat_id;
                                                    if (j2 == 0) {
                                                        j2 = inputPeer.channel_id;
                                                    }
                                                    valueOf2 = Long.valueOf(-j2);
                                                }
                                                int size8 = ub7Var2.j.size();
                                                int i25 = i23;
                                                if (linkedHashMap != null) {
                                                    while (true) {
                                                        Long l2 = (Long) linkedHashMap.remove(Integer.valueOf(size8));
                                                        if (l2 != null) {
                                                            ub7Var2.j.put(l2.longValue(), size8);
                                                            size8++;
                                                            linkedHashMap = linkedHashMap;
                                                            arrayList15 = arrayList15;
                                                            arrayList18 = arrayList18;
                                                        }
                                                    }
                                                }
                                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                                ArrayList arrayList19 = arrayList15;
                                                ArrayList arrayList20 = arrayList18;
                                                ub7Var2.j.put(valueOf2.longValue(), size8);
                                                hashSet3.remove(valueOf2);
                                                if (!hashSet4.remove(valueOf2)) {
                                                    if (!hashMap6.containsKey(valueOf2)) {
                                                        arrayList14.add(valueOf2);
                                                        hashMap6.put(valueOf2, inputPeer);
                                                    }
                                                    z5 = true;
                                                }
                                                i23 = i25 + 1;
                                                size7 = i24;
                                                linkedHashMap = linkedHashMap2;
                                                arrayList15 = arrayList19;
                                                arrayList12 = arrayList20;
                                            }
                                            ArrayList arrayList21 = arrayList12;
                                            LinkedHashMap linkedHashMap3 = linkedHashMap;
                                            ArrayList arrayList22 = arrayList15;
                                            if (linkedHashMap3 != null) {
                                                Iterator it = linkedHashMap3.entrySet().iterator();
                                                while (it.hasNext()) {
                                                    ub7Var2.j.put(((Long) ((Map.Entry) it.next()).getValue()).longValue(), ub7Var2.j.size());
                                                }
                                            }
                                            int i26 = 0;
                                            while (i26 < 2) {
                                                ArrayList I1 = cf7.I1(i26 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers);
                                                ArrayList arrayList23 = i26 == 0 ? ub7Var2.h : ub7Var2.i;
                                                if (i26 == 0) {
                                                    ArrayList I12 = cf7.I1(dialogFilter.pinned_peers);
                                                    for (int i27 = 0; i27 < I12.size(); i27++) {
                                                        I1.remove(I12.get(i27));
                                                    }
                                                    I1.addAll(0, I12);
                                                }
                                                int size9 = I1.size();
                                                boolean z9 = I1.size() != arrayList23.size();
                                                if (!z9) {
                                                    int i28 = 0;
                                                    while (true) {
                                                        if (i28 < size9) {
                                                            if (arrayList23.contains(I1.get(i28))) {
                                                                i28++;
                                                            } else {
                                                                z9 = true;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (z9) {
                                                    if (i26 == 0) {
                                                        ub7Var2.h = I1;
                                                    } else {
                                                        ub7Var2.i = I1;
                                                    }
                                                    z7 = true;
                                                    z5 = true;
                                                }
                                                i26++;
                                            }
                                            if (!hashSet4.isEmpty()) {
                                                hashMap7.put(Integer.valueOf(ub7Var2.a), hashSet4);
                                                z5 = true;
                                            }
                                            if (z5) {
                                                arrayList15 = arrayList22;
                                                arrayList15.add(ub7Var2);
                                            } else {
                                                arrayList15 = arrayList22;
                                            }
                                            if (z7) {
                                                hashSet2.add(Integer.valueOf(ub7Var2.a));
                                            }
                                            hashSet = hashSet2;
                                            arrayList2 = arrayList7;
                                            hashMap = hashMap3;
                                            arrayList3 = arrayList21;
                                        }
                                    }
                                }
                            } else {
                                cf7Var = cf7Var5;
                                sparseArray = sparseArray2;
                            }
                            arrayList7 = arrayList13;
                            hashMap3 = hashMap5;
                            linkedHashMap = null;
                            size = ub7Var2.j.size();
                            i4 = 0;
                            while (true) {
                                LongSparseIntArray longSparseIntArray2 = ub7Var2.j;
                                if (i4 >= size) {
                                }
                                i4++;
                            }
                        } else {
                            ArrayList arrayList24 = arrayList12;
                            cf7Var = cf7Var5;
                            ArrayList arrayList25 = arrayList13;
                            HashMap hashMap8 = hashMap5;
                            arrayList = arrayList11;
                            sparseArray = sparseArray2;
                            ub7 ub7Var3 = new ub7();
                            ub7Var3.a = dialogFilter.id;
                            ub7Var3.g = i3;
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = dialogFilter.title;
                            ub7Var3.b = tL_textWithEntities2.text;
                            ub7Var3.c = tL_textWithEntities2.entities;
                            ub7Var3.n = dialogFilter.title_noanimate;
                            ub7Var3.m = (dialogFilter.flags & TLObject.FLAG_27) != 0 ? dialogFilter.color : -1;
                            ub7Var3.e = -1;
                            int i29 = 0;
                            while (i29 < 2) {
                                if (i29 == 0) {
                                    int size10 = dialogFilter.pinned_peers.size();
                                    int i30 = 0;
                                    while (i30 < size10) {
                                        TLRPC.InputPeer inputPeer2 = dialogFilter.pinned_peers.get(i30);
                                        long j3 = inputPeer2.user_id;
                                        if (j3 != 0) {
                                            valueOf = Long.valueOf(j3);
                                        } else {
                                            long j4 = inputPeer2.chat_id;
                                            if (j4 == 0) {
                                                j4 = inputPeer2.channel_id;
                                            }
                                            valueOf = Long.valueOf(-j4);
                                        }
                                        if (!ub7Var3.h.contains(valueOf)) {
                                            ub7Var3.h.add(valueOf);
                                        }
                                        int i31 = i29;
                                        int i32 = size10;
                                        HashSet hashSet5 = hashSet2;
                                        ub7Var3.j.put(valueOf.longValue(), ub7Var3.j.size() + 1);
                                        if (!hashMap6.containsKey(valueOf)) {
                                            arrayList14.add(valueOf);
                                            hashMap6.put(valueOf, inputPeer2);
                                        }
                                        i30++;
                                        i29 = i31;
                                        size10 = i32;
                                        hashSet2 = hashSet5;
                                    }
                                }
                                int i33 = i29;
                                HashSet hashSet6 = hashSet2;
                                ArrayList<TLRPC.InputPeer> arrayList26 = i33 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers;
                                ArrayList arrayList27 = i33 == 0 ? ub7Var3.h : ub7Var3.i;
                                int size11 = arrayList26.size();
                                int i34 = 0;
                                while (i34 < size11) {
                                    TLRPC.InputPeer inputPeer3 = arrayList26.get(i34);
                                    long j5 = inputPeer3.user_id;
                                    if (j5 != 0) {
                                        Long valueOf3 = Long.valueOf(j5);
                                        if (!arrayList27.contains(valueOf3)) {
                                            arrayList27.add(valueOf3);
                                        }
                                        if (hashMap4.containsKey(valueOf3)) {
                                            arrayList4 = arrayList24;
                                        } else {
                                            arrayList4 = arrayList24;
                                            arrayList4.add(valueOf3);
                                            hashMap4.put(valueOf3, inputPeer3);
                                        }
                                        arrayList5 = arrayList26;
                                        arrayList6 = arrayList25;
                                        hashMap2 = hashMap8;
                                    } else {
                                        arrayList4 = arrayList24;
                                        long j6 = inputPeer3.chat_id;
                                        if (j6 == 0) {
                                            j6 = inputPeer3.channel_id;
                                        }
                                        arrayList5 = arrayList26;
                                        Long valueOf4 = Long.valueOf(j6);
                                        Long valueOf5 = Long.valueOf(-j6);
                                        if (!arrayList27.contains(valueOf5)) {
                                            arrayList27.add(valueOf5);
                                        }
                                        hashMap2 = hashMap8;
                                        if (hashMap2.containsKey(valueOf4)) {
                                            arrayList6 = arrayList25;
                                        } else {
                                            arrayList6 = arrayList25;
                                            arrayList6.add(valueOf4);
                                            hashMap2.put(valueOf4, inputPeer3);
                                        }
                                    }
                                    i34++;
                                    hashMap8 = hashMap2;
                                    arrayList25 = arrayList6;
                                    arrayList24 = arrayList4;
                                    arrayList26 = arrayList5;
                                }
                                i29 = i33 + 1;
                                hashSet2 = hashSet6;
                            }
                            hashSet = hashSet2;
                            arrayList2 = arrayList25;
                            hashMap = hashMap8;
                            arrayList3 = arrayList24;
                            arrayList15.add(ub7Var3);
                        }
                        i7 = i15 + 1;
                        ArrayList arrayList28 = arrayList2;
                        hashMap5 = hashMap;
                        arrayList13 = arrayList28;
                        size4 = i18;
                        arrayList12 = arrayList3;
                        arrayList10 = arrayList16;
                        hashSet2 = hashSet;
                        arrayList11 = arrayList;
                        sparseArray2 = sparseArray;
                        cf7Var5 = cf7Var;
                    }
                    final HashMap hashMap9 = hashMap5;
                    ArrayList arrayList29 = arrayList13;
                    final HashSet hashSet7 = hashSet2;
                    cf7Var = cf7Var5;
                    final ArrayList arrayList30 = arrayList11;
                    final SparseArray sparseArray3 = sparseArray2;
                    ArrayList arrayList31 = arrayList12;
                    if (arrayList14.isEmpty()) {
                        cf7Var2 = cf7Var;
                        tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                    } else {
                        cf7Var2 = cf7Var;
                        tL_messages_dialogs = cf7Var2.E0(arrayList31, arrayList29, new ArrayList(), TextUtils.join(",", arrayList14));
                        int size12 = tL_messages_dialogs.dialogs.size();
                        for (int i35 = 0; i35 < size12; i35++) {
                            hashMap6.remove(Long.valueOf(tL_messages_dialogs.dialogs.get(i35).id));
                        }
                    }
                    final TLRPC.TL_messages_dialogs tL_messages_dialogs2 = tL_messages_dialogs;
                    final ArrayList arrayList32 = new ArrayList();
                    if (!arrayList31.isEmpty()) {
                        cf7Var2.k0(arrayList31, arrayList32, false);
                        int size13 = arrayList32.size();
                        for (int i36 = 0; i36 < size13; i36++) {
                            hashMap4.remove(Long.valueOf(((TLRPC.User) arrayList32.get(i36)).id));
                        }
                    }
                    final ArrayList arrayList33 = new ArrayList();
                    if (!arrayList29.isEmpty()) {
                        cf7Var2.P(TextUtils.join(",", arrayList29), arrayList33);
                        int size14 = arrayList33.size();
                        for (int i37 = 0; i37 < size14; i37++) {
                            hashMap9.remove(Long.valueOf(((TLRPC.Chat) arrayList33.get(i37)).id));
                        }
                    }
                    if (hashMap4.isEmpty() && hashMap9.isEmpty() && hashMap6.isEmpty()) {
                        cf7Var2.V0(tL_messages_dialogs2, null, arrayList32, arrayList33, arrayList15, sparseArray3, arrayList30, hashMap7, hashSet7, runnable);
                        return;
                    }
                    final oc7 messagesController = cf7Var2.getMessagesController();
                    final TLRPC.TL_messages_dialogs tL_messages_dialogs3 = new TLRPC.TL_messages_dialogs();
                    messagesController.getClass();
                    Utilities.d.c(new Runnable() { // from class: oa7
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            TLRPC.TL_users_getUsers tL_users_getUsers;
                            oc7 oc7Var;
                            TLRPC.TL_messages_dialogs tL_messages_dialogs4;
                            TLRPC.TL_messages_dialogs tL_messages_dialogs5;
                            ArrayList arrayList34;
                            ArrayList arrayList35;
                            ArrayList arrayList36;
                            SparseArray sparseArray4;
                            ArrayList arrayList37;
                            HashMap hashMap10;
                            HashSet hashSet8;
                            Runnable runnable2;
                            TLRPC.TL_channels_getChannels tL_channels_getChannels;
                            TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs;
                            oc7 oc7Var2;
                            TLRPC.TL_messages_dialogs tL_messages_dialogs6;
                            TLRPC.TL_messages_dialogs tL_messages_dialogs7;
                            TLRPC.TL_channels_getChannels tL_channels_getChannels2;
                            ArrayList arrayList38;
                            ArrayList arrayList39;
                            ArrayList arrayList40;
                            TLRPC.TL_inputChannel tL_inputChannel;
                            ArrayList arrayList41;
                            ArrayList arrayList42 = new ArrayList();
                            Iterator it2 = hashMap4.entrySet().iterator();
                            loop0: while (true) {
                                tL_users_getUsers = null;
                                while (true) {
                                    boolean hasNext = it2.hasNext();
                                    oc7Var = oc7.this;
                                    tL_messages_dialogs4 = tL_messages_dialogs2;
                                    tL_messages_dialogs5 = tL_messages_dialogs3;
                                    arrayList34 = arrayList32;
                                    arrayList35 = arrayList33;
                                    arrayList36 = arrayList15;
                                    sparseArray4 = sparseArray3;
                                    arrayList37 = arrayList30;
                                    hashMap10 = hashMap7;
                                    hashSet8 = hashSet7;
                                    runnable2 = runnable;
                                    if (!hasNext) {
                                        break loop0;
                                    }
                                    Map.Entry entry = (Map.Entry) it2.next();
                                    if (tL_users_getUsers == null) {
                                        tL_users_getUsers = new TLRPC.TL_users_getUsers();
                                        arrayList42.add(tL_users_getUsers);
                                    }
                                    arrayList41 = arrayList42;
                                    tL_users_getUsers.id.add(oc7Var.o1((TLRPC.InputPeer) entry.getValue()));
                                    if (tL_users_getUsers.id.size() == 100) {
                                        break;
                                    } else {
                                        arrayList42 = arrayList41;
                                    }
                                }
                                arrayList42 = arrayList41;
                                oc7Var.H4(tL_users_getUsers, arrayList42, tL_messages_dialogs4, tL_messages_dialogs5, arrayList34, arrayList35, arrayList36, sparseArray4, arrayList37, hashMap10, hashSet8, runnable2);
                            }
                            if (tL_users_getUsers != null) {
                                oc7Var.H4(tL_users_getUsers, arrayList42, tL_messages_dialogs4, tL_messages_dialogs5, arrayList34, arrayList35, arrayList36, sparseArray4, arrayList37, hashMap10, hashSet8, runnable2);
                            }
                            TLRPC.TL_messages_getChats tL_messages_getChats = null;
                            loop2: while (true) {
                                tL_channels_getChannels = null;
                                for (Map.Entry entry2 : hashMap9.entrySet()) {
                                    oc7Var2 = oc7Var;
                                    TLRPC.InputPeer inputPeer4 = (TLRPC.InputPeer) entry2.getValue();
                                    tL_messages_dialogs6 = tL_messages_dialogs4;
                                    tL_messages_dialogs7 = tL_messages_dialogs5;
                                    if (inputPeer4.chat_id != 0) {
                                        if (tL_messages_getChats == null) {
                                            tL_messages_getChats = new TLRPC.TL_messages_getChats();
                                            arrayList42.add(tL_messages_getChats);
                                        }
                                        tL_messages_getChats.id.add((Long) entry2.getKey());
                                        if (tL_messages_getChats.id.size() == 100) {
                                            tL_messages_dialogs4 = tL_messages_dialogs6;
                                            oc7Var = oc7Var2;
                                            tL_messages_dialogs5 = tL_messages_dialogs7;
                                            oc7Var.H4(tL_messages_getChats, arrayList42, tL_messages_dialogs4, tL_messages_dialogs5, arrayList34, arrayList35, arrayList36, sparseArray4, arrayList37, hashMap10, hashSet8, runnable2);
                                            tL_messages_getChats = null;
                                        } else {
                                            tL_messages_dialogs4 = tL_messages_dialogs6;
                                            oc7Var = oc7Var2;
                                            tL_messages_dialogs5 = tL_messages_dialogs7;
                                        }
                                    } else if (inputPeer4.channel_id != 0) {
                                        if (tL_channels_getChannels == null) {
                                            tL_channels_getChannels2 = new TLRPC.TL_channels_getChannels();
                                            arrayList42.add(tL_channels_getChannels2);
                                        } else {
                                            tL_channels_getChannels2 = tL_channels_getChannels;
                                        }
                                        ArrayList<TLRPC.InputChannel> arrayList43 = tL_channels_getChannels2.id;
                                        arrayList38 = arrayList34;
                                        if (inputPeer4.access_hash == 0) {
                                            arrayList39 = arrayList35;
                                            TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(inputPeer4.channel_id));
                                            if (L0 != null && L0.access_hash == 0 && L0.fromMessageId != 0 && L0.fromMessageDialogId != 0) {
                                                TLRPC.TL_inputChannelFromMessage tL_inputChannelFromMessage = new TLRPC.TL_inputChannelFromMessage();
                                                arrayList40 = arrayList36;
                                                tL_inputChannelFromMessage.channel_id = inputPeer4.channel_id;
                                                tL_inputChannelFromMessage.peer = oc7.r1(z8c.t0).i1(L0.fromMessageDialogId);
                                                tL_inputChannelFromMessage.msg_id = L0.fromMessageId;
                                                tL_inputChannel = tL_inputChannelFromMessage;
                                                arrayList43.add(tL_inputChannel);
                                                if (tL_channels_getChannels2.id.size() != 100) {
                                                    break;
                                                }
                                                tL_messages_dialogs4 = tL_messages_dialogs6;
                                                oc7Var = oc7Var2;
                                                tL_messages_dialogs5 = tL_messages_dialogs7;
                                                arrayList36 = arrayList40;
                                                arrayList34 = arrayList38;
                                                arrayList35 = arrayList39;
                                                tL_channels_getChannels = tL_channels_getChannels2;
                                            }
                                        } else {
                                            arrayList39 = arrayList35;
                                        }
                                        arrayList40 = arrayList36;
                                        TLRPC.TL_inputChannel tL_inputChannel2 = new TLRPC.TL_inputChannel();
                                        tL_inputChannel2.channel_id = inputPeer4.channel_id;
                                        tL_inputChannel2.access_hash = inputPeer4.access_hash;
                                        tL_inputChannel = tL_inputChannel2;
                                        arrayList43.add(tL_inputChannel);
                                        if (tL_channels_getChannels2.id.size() != 100) {
                                        }
                                    } else {
                                        tL_messages_dialogs4 = tL_messages_dialogs6;
                                        oc7Var = oc7Var2;
                                        tL_messages_dialogs5 = tL_messages_dialogs7;
                                    }
                                }
                                tL_messages_dialogs4 = tL_messages_dialogs6;
                                oc7Var = oc7Var2;
                                tL_messages_dialogs5 = tL_messages_dialogs7;
                                arrayList36 = arrayList40;
                                arrayList34 = arrayList38;
                                arrayList35 = arrayList39;
                                oc7Var.H4(tL_channels_getChannels2, arrayList42, tL_messages_dialogs4, tL_messages_dialogs5, arrayList34, arrayList35, arrayList36, sparseArray4, arrayList37, hashMap10, hashSet8, runnable2);
                            }
                            if (tL_messages_getChats != null) {
                                oc7Var.H4(tL_messages_getChats, arrayList42, tL_messages_dialogs4, tL_messages_dialogs5, arrayList34, arrayList35, arrayList36, sparseArray4, arrayList37, hashMap10, hashSet8, runnable2);
                            }
                            if (tL_channels_getChannels != null) {
                                oc7Var.H4(tL_channels_getChannels, arrayList42, tL_messages_dialogs4, tL_messages_dialogs5, arrayList34, arrayList35, arrayList36, sparseArray4, arrayList37, hashMap10, hashSet8, runnable2);
                            }
                            oc7 oc7Var3 = oc7Var;
                            loop4: while (true) {
                                tL_messages_getPeerDialogs = null;
                                for (Map.Entry entry3 : hashMap6.entrySet()) {
                                    if (tL_messages_getPeerDialogs == null) {
                                        tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                                        arrayList42.add(tL_messages_getPeerDialogs);
                                    }
                                    TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                                    tL_inputDialogPeer.peer = (TLRPC.InputPeer) entry3.getValue();
                                    tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                                    if (tL_messages_getPeerDialogs.peers.size() == 100) {
                                        break;
                                    }
                                }
                                ArrayList arrayList44 = arrayList42;
                                TLRPC.TL_messages_dialogs tL_messages_dialogs8 = tL_messages_dialogs4;
                                TLRPC.TL_messages_dialogs tL_messages_dialogs9 = tL_messages_dialogs5;
                                ArrayList arrayList45 = arrayList34;
                                ArrayList arrayList46 = arrayList35;
                                ArrayList arrayList47 = arrayList36;
                                SparseArray sparseArray5 = sparseArray4;
                                ArrayList arrayList48 = arrayList37;
                                HashMap hashMap11 = hashMap10;
                                HashSet hashSet9 = hashSet8;
                                oc7Var3.H4(tL_messages_getPeerDialogs, arrayList44, tL_messages_dialogs8, tL_messages_dialogs9, arrayList45, arrayList46, arrayList47, sparseArray5, arrayList48, hashMap11, hashSet9, runnable2);
                                hashSet8 = hashSet9;
                                hashMap10 = hashMap11;
                                arrayList37 = arrayList48;
                                sparseArray4 = sparseArray5;
                                arrayList36 = arrayList47;
                                arrayList35 = arrayList46;
                                arrayList34 = arrayList45;
                                tL_messages_dialogs5 = tL_messages_dialogs9;
                                tL_messages_dialogs4 = tL_messages_dialogs8;
                                arrayList42 = arrayList44;
                            }
                            if (tL_messages_getPeerDialogs != null) {
                                oc7Var3.H4(tL_messages_getPeerDialogs, arrayList42, tL_messages_dialogs4, tL_messages_dialogs5, arrayList34, arrayList35, arrayList36, sparseArray4, arrayList37, hashMap10, hashSet8, runnable2);
                            }
                        }
                    });
                    return;
                } catch (Exception e7) {
                    e = e7;
                }
                break;
            case 4:
                a();
                return;
            case 5:
                b();
                return;
            case 6:
                c();
                return;
            case 7:
                d();
                return;
            case 8:
                ((NotificationsSettingsActivity) this.b).E0((ArrayList) this.c, (sv2) this.d);
                return;
            case 9:
                e();
                return;
            case 10:
                f();
                return;
            case 11:
                g();
                return;
            case 12:
                h();
                return;
            case 13:
                i();
                return;
            case 14:
                j();
                return;
            case 15:
                k();
                return;
            case 16:
                l();
                return;
            case 17:
                m();
                return;
            case 18:
                n();
                return;
            case 19:
                o();
                return;
            case 20:
                p();
                return;
            case 21:
                q();
                return;
            case 22:
                r();
                return;
            case 23:
                s();
                return;
            case 24:
                t();
                return;
            case 25:
                u();
                return;
            case 26:
                v();
                return;
            case 27:
                w();
                return;
            case 28:
                x();
                return;
            default:
                ih8 ih8Var = (ih8) this.b;
                hh8 hh8Var = (hh8) this.c;
                TLObject tLObject = (TLObject) this.d;
                if (ih8Var.isShowing()) {
                    ih8Var.u1.remove(hh8Var);
                    if (tLObject != null) {
                        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                        oc7.r1(ih8Var.a).d4(tL_messages_votesList.users, false);
                        hh8Var.b.addAll(tL_messages_votesList.votes);
                        hh8Var.c = tL_messages_votesList.next_offset;
                        ih8Var.D0(null);
                        ih8Var.m1.X(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ud7(byte b, Object obj, Object obj2, String str) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = str;
    }

    public /* synthetic */ ud7(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
