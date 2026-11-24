// default package

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.RectF;
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
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
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
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pc7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pc7(g38 g38Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        this.a = (byte) 19;
        this.b = g38Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013d  */
    /* JADX WARN: Type inference failed for: r12v10, types: [k96] */
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
    private final void a() {
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
        sm7 sm7Var = (sm7) this.b;
        String str2 = (String) this.d;
        ArrayList arrayList2 = (ArrayList) this.c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = sm7Var.n;
        String lowerCase = str2.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            gl.d3(new jw6(sm7Var, new ArrayList(), new ArrayList(), new ArrayList()));
            return;
        }
        ?? r5 = 1;
        boolean z = false;
        String S02 = k96.D0().S0(lowerCase, true, false);
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
            vm7 vm7Var = (vm7) arrayList2.get(i5);
            String[] strArr4 = strArr3;
            if (cf3.B(vm7Var.d)) {
                strArr = strArr2;
                TLRPC.EncryptedChat Y0 = notificationsCustomSettingsActivity.getMessagesController().Y0(Integer.valueOf((int) (vm7Var.d & 4294967295L)));
                if (Y0 != null) {
                    i = i5;
                    TLRPC.User V1 = notificationsCustomSettingsActivity.getMessagesController().V1(Long.valueOf(Y0.user_id));
                    if (V1 != null) {
                        strArr4[z ? 1 : 0] = qu2.m(z ? 1 : 0, V1.first_name, V1.last_name);
                        strArr4[r5 == true ? 1 : 0] = l7c.o(V1);
                    }
                } else {
                    i = i5;
                }
            } else {
                strArr = strArr2;
                i = i5;
                if (cf3.D(vm7Var.d)) {
                    TLRPC.User V12 = notificationsCustomSettingsActivity.getMessagesController().V1(Long.valueOf(vm7Var.d));
                    if (V12 != null && !V12.deleted) {
                        strArr4[z ? 1 : 0] = qu2.m(z ? 1 : 0, V12.first_name, V12.last_name);
                        strArr4[r5 == true ? 1 : 0] = l7c.o(V12);
                        chat = V12;
                        obj = chat;
                        String str3 = strArr4[z ? 1 : 0];
                        strArr4[z ? 1 : 0] = str3.toLowerCase();
                        S0 = k96.D0().S0(strArr4[z ? 1 : 0], r5, z);
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
                            if ((str5 == null || !(str5.startsWith(str4) || de9.t(" ", str4, strArr4[r19]))) && (S0 == null || !(S0.startsWith(str4) || de9.t(" ", str4, S0)))) {
                                String str6 = strArr4[i7];
                                i3 = (str6 == null || !str6.startsWith(str4)) ? i6 : 2;
                            } else {
                                i3 = i7;
                            }
                            r5 = i7;
                            if (i3 != 0) {
                                if (i3 == r5) {
                                    arrayList5.add(gl.r0(str3, null, str4));
                                } else {
                                    arrayList5.add(gl.r0("@" + strArr4[r5 == true ? 1 : 0], null, "@" + str4));
                                }
                                arrayList4.add(vm7Var);
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
                    TLRPC.Chat K0 = notificationsCustomSettingsActivity.getMessagesController().K0(Long.valueOf(-vm7Var.d));
                    if (K0 != null) {
                        if (!K0.left && !K0.kicked && K0.migrated_to == null) {
                            strArr4[z ? 1 : 0] = K0.title;
                            strArr4[r5 == true ? 1 : 0] = hc2.K(K0, z);
                            chat = K0;
                            obj = chat;
                            String str32 = strArr4[z ? 1 : 0];
                            strArr4[z ? 1 : 0] = str32.toLowerCase();
                            S0 = k96.D0().S0(strArr4[z ? 1 : 0], r5, z);
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
            S0 = k96.D0().S0(strArr4[z ? 1 : 0], r5, z);
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
        gl.d3(new jw6(sm7Var, arrayList4, arrayList5, arrayList3));
    }

    private final void b() {
        wk4 wk4Var = (wk4) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        wk4Var.a0(tL_error.text, (String) this.d);
    }

    private final void c() {
        int i;
        lx7 lx7Var = (lx7) this.b;
        byte[] bArr = (byte[]) this.c;
        String str = (String) this.d;
        SecureRandom secureRandom = Utilities.b;
        vx7 vx7Var = lx7Var.e;
        secureRandom.setSeed(vx7Var.K.secure_random);
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        TL_account.Password password = vx7Var.K;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = mo9.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        byte[] i1 = vx7.i1();
        vx7Var.d1 = i1;
        vx7Var.c1 = Utilities.g(Utilities.o(32L, i1));
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = vx7Var.K.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] m = Utilities.m(gl.g1(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
            vx7Var.f1 = m;
            byte[] bArr2 = new byte[32];
            System.arraycopy(m, 0, bArr2, 0, 32);
            byte[] bArr3 = new byte[16];
            System.arraycopy(vx7Var.f1, 32, bArr3, 0, 16);
            byte[] bArr4 = vx7Var.d1;
            Utilities.b(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
            updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
            TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
            tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
            tL_secureSecretSettings.secure_secret = vx7Var.d1;
            tL_secureSecretSettings.secure_secret_id = vx7Var.c1;
            passwordinputsettings.flags |= 4;
        }
        i = ((d) vx7Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(updatepasswordsettings, new jx7(lx7Var, (byte) 2));
    }

    private final void d() {
        int i;
        int i2;
        int i3;
        rx7 rx7Var = (rx7) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.d;
        int i4 = rx7Var.M;
        vx7 vx7Var = rx7Var.R;
        vx7Var.z1();
        rx7Var.K = false;
        if (tL_error == null) {
            rx7Var.r();
            rx7Var.q();
            vx7Var.C1.c(vx7Var.F, (String) vx7Var.t1.get("phone"), null, null, null, null, null, null, null, null, new kw7(vx7Var, (byte) 6), null);
            return;
        }
        rx7Var.L = tL_error.text;
        if ((i4 == 3 && ((i3 = rx7Var.N) == 4 || i3 == 2)) || ((i4 == 2 && ((i = rx7Var.N) == 4 || i == 3)) || (i4 == 4 && rx7Var.N == 2))) {
            rx7Var.p();
        }
        if (i4 == 2) {
            gl.z3(true);
            kk7.e().a(rx7Var, kk7.i4);
        } else if (i4 == 3) {
            gl.y3(true);
            kk7.e().a(rx7Var, kk7.j4);
        }
        rx7Var.J = true;
        if (i4 != 3) {
            i2 = ((d) vx7Var).currentAccount;
            ij.c0(i2, tL_error, vx7Var, verifyphone, new Object[0]);
        }
        vx7Var.P1(true, false);
        if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                rx7Var.d(true);
                vx7Var.M1(null, 0, true);
                return;
            }
            return;
        }
        int i5 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = rx7Var.d;
            if (i5 >= editTextBoldCursorArr.length) {
                editTextBoldCursorArr[0].requestFocus();
                return;
            } else {
                editTextBoldCursorArr[i5].setText("");
                i5++;
            }
        }
    }

    private final void e() {
        ((p) this.b).t0((TLRPC.TL_error) this.c, (TLRPC.TL_payments_sendPaymentForm) this.d);
    }

    private final void f() {
        p pVar = (p) this.b;
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
        bj7 bj7Var = (bj7) this.d;
        pVar.getClass();
        pVar.F0 = tL_payments_validatedRequestedInfo;
        bj7Var.run();
        pVar.I0(false);
        pVar.M0(true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void g() {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Reaction reaction;
        ImageReceiver imageReceiver;
        TLRPC.TL_availableReaction tL_availableReaction2;
        vl vlVar;
        c28 c28Var = (c28) this.b;
        h19 h19Var = (h19) this.c;
        View view = (View) this.d;
        y28 y28Var = c28Var.a;
        y28Var.k3 = true;
        x28 x28Var = y28Var.E1;
        ImageReceiver imageReceiver2 = y28Var.b3;
        boolean[] zArr = {false};
        l2b l2bVar = y28Var.u0;
        l2bVar.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new uk(l2bVar, (byte) 2)).setDuration(150L).start();
        int L = gl.L(8.0f);
        l2b l2bVar2 = new l2b(y28Var.getContext(), y28Var.n1);
        y28Var.u0 = l2bVar2;
        l2bVar2.setPadding(L, L, L, L);
        y28Var.t0.addView(y28Var.u0, nme.e(40, 40, 3));
        vl vlVar2 = y28Var.e3;
        if (vlVar2 != null) {
            vlVar2.o(y28Var);
            y28Var.e3 = null;
        }
        xl xlVar = y28Var.c3;
        if (xlVar != null) {
            xlVar.d(y28Var);
            y28Var.c3 = null;
        }
        y28Var.f3 = false;
        if (h19Var.g != 0) {
            y28Var.f3 = true;
            vl vlVar3 = new vl(2, y28Var.s2, h19Var.g);
            y28Var.e3 = vlVar3;
            vlVar3.b(y28Var);
        } else if (h19Var.f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(y28Var.s2).r.get(h19Var.f)) != null) {
            y28Var.d3.Y(null, null, gl5.b(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
            reaction = null;
            imageReceiver2.d0(gl5.b(tL_availableReaction.around_animation), d19.a(), null, null, null, 0);
            if (imageReceiver2.y() != null) {
                imageReceiver2.y().I(0, false, true);
            }
            y28Var.u0.setReaction(h19Var);
            if (y28Var.t1) {
                TL_stories.StoryItem storyItem = x28Var.a;
                if (storyItem.sent_reaction == null) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryItem storyItem2 = x28Var.a;
                    TL_stories.StoryViews storyViews = storyItem2.views;
                    storyViews.reactions_count++;
                    k19.b(reaction, storyItem2.sent_reaction, storyViews);
                    y28Var.i1(true);
                }
            }
            if (h19Var.g != 0 && (vlVar = y28Var.u0.f) != null) {
                xl a = xl.a(vlVar, false, true);
                y28Var.c3 = a;
                a.f(y28Var);
            }
            y28Var.I1.i0(y28Var.r1, x28Var.a, h19Var);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            y28Var.getLocationInWindow(iArr2);
            y28Var.m3 = iArr[0] - iArr2[0];
            y28Var.n3 = iArr[1] - iArr2[1];
            y28Var.o3 = view.getMeasuredHeight();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            y28Var.l3 = 0.0f;
            y28Var.invalidate();
            l2b l2bVar3 = y28Var.u0;
            l2bVar3.setAllowDrawReaction(false);
            imageReceiver = l2bVar3.e;
            if (h19Var.g == 0 && (tL_availableReaction2 = (TLRPC.TL_availableReaction) hq6.d0(y6c.t0).r.get(h19Var.f)) != null) {
                imageReceiver.d0(gl5.b(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                imageReceiver.M(0);
            }
            ofFloat.addUpdateListener(new nk(c28Var, ofFloat, zArr, (byte) 4));
            ofFloat.addListener(new i8(c28Var, zArr, l2bVar3, (byte) 9));
            ofFloat.setDuration(220L);
            ofFloat.start();
            y28Var.W0(false);
        }
        reaction = null;
        y28Var.u0.setReaction(h19Var);
        if (y28Var.t1) {
        }
        if (h19Var.g != 0) {
            xl a2 = xl.a(vlVar, false, true);
            y28Var.c3 = a2;
            a2.f(y28Var);
        }
        y28Var.I1.i0(y28Var.r1, x28Var.a, h19Var);
        int[] iArr3 = new int[2];
        view.getLocationInWindow(iArr3);
        int[] iArr22 = new int[2];
        y28Var.getLocationInWindow(iArr22);
        y28Var.m3 = iArr3[0] - iArr22[0];
        y28Var.n3 = iArr3[1] - iArr22[1];
        y28Var.o3 = view.getMeasuredHeight();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        y28Var.l3 = 0.0f;
        y28Var.invalidate();
        l2b l2bVar32 = y28Var.u0;
        l2bVar32.setAllowDrawReaction(false);
        imageReceiver = l2bVar32.e;
        if (h19Var.g == 0) {
            imageReceiver.d0(gl5.b(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
            imageReceiver.M(0);
        }
        ofFloat2.addUpdateListener(new nk(c28Var, ofFloat2, zArr, (byte) 4));
        ofFloat2.addListener(new i8(c28Var, zArr, l2bVar32, (byte) 9));
        ofFloat2.setDuration(220L);
        ofFloat2.start();
        y28Var.W0(false);
    }

    private final void h() {
        s28 s28Var = (s28) this.b;
        f53 f53Var = (f53) this.c;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
        y28 y28Var = s28Var.x;
        ij.P(y28Var.getContext(), null, f53Var, new lt2((Object) s28Var, (Object) storyItem, (Object) f53Var, (byte) 22));
        s28 s28Var2 = y28Var.j1;
        if (s28Var2 != null) {
            s28Var2.a();
        }
    }

    private final void i() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        s1b s1bVar = (s1b) this.b;
        TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.c;
        p8c p8cVar = (p8c) this.d;
        for (int i = 0; i < s1bVar.i.size(); i++) {
            k27 k27Var = (k27) s1bVar.i.get(i);
            if (k27Var != null && (storyItem = k27Var.l) != null && (messageMedia = storyItem.media) != null && (document = storyItem2.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                p8cVar.a(document2);
                return;
            }
        }
        p8cVar.a(null);
    }

    private final void j() {
        g38 g38Var = (g38) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (tL_error == null) {
            g38Var.r1 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull L0 = na7.q1(g38Var.a).L0(g38Var.p1);
            if (L0 != null) {
                L0.exported_invite = g38Var.r1;
            }
            g38Var.o1.setLink(g38Var.r1.link);
        }
        g38Var.q1 = false;
    }

    private final void k() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        boolean[] zArr = (boolean[]) this.c;
        h68 h68Var = (h68) this.d;
        Drawable[] drawableArr = PhotoViewer.f9;
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
        h68Var.run();
    }

    private final void l() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        jl5 jl5Var = (jl5) this.c;
        String str = (String) this.d;
        Drawable[] drawableArr = PhotoViewer.f9;
        jl5Var.a();
        if (str.equals(photoViewer.C4.R)) {
            photoViewer.w4 = (byte) 2;
            photoViewer.x4 = str;
        }
    }

    private final void m() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        l68 l68Var = (l68) this.d;
        Drawable[] drawableArr = PhotoViewer.f9;
        photoViewer.C4.f0(bitmap);
        photoViewer.t5.setUndoCutState(true);
        photoViewer.j2(true, true);
        gl.r(l68Var);
        gl.e3(l68Var, 800L);
    }

    private final void n() {
        y88 y88Var = (y88) this.b;
        y88 y88Var2 = (y88) this.c;
        int[] iArr = (int[]) this.d;
        PhotoViewer photoViewer = y88Var.d;
        if (photoViewer.E == null || y88Var2 != photoViewer.D8) {
            return;
        }
        photoViewer.D8 = null;
        photoViewer.w8 = iArr[5];
        photoViewer.o8 = iArr[4];
        photoViewer.p8 = iArr[7];
        float f = photoViewer.m8 / 8;
        PhotoViewer photoViewer2 = y88Var.d;
        photoViewer.x8 = (long) ((f * photoViewer2.o8) / 1000.0f);
        boolean z = photoViewer2.q8;
        PhotoViewer photoViewer3 = y88Var.d;
        if (z) {
            photoViewer3.h8 = iArr[8];
            photoViewer3.R2();
            if (y88Var.d.e8 > y88Var.d.f8 - 1) {
                PhotoViewer photoViewer4 = y88Var.d;
                photoViewer4.e8 = photoViewer4.f8 - 1;
            }
            PhotoViewer photoViewer5 = y88Var.d;
            if (!photoViewer5.J4) {
                iac iacVar = photoViewer5.k1;
                boolean z2 = photoViewer5.f8 > 1;
                PhotoViewer photoViewer6 = y88Var.d;
                iacVar.a(Math.min(photoViewer6.k8, y88Var.d.l8), z2, photoViewer6.r);
            }
            if (w01.a) {
                StringBuilder sb = new StringBuilder("compressionsCount = ");
                sb.append(y88Var.d.f8);
                sb.append(" w = ");
                sb.append(y88Var.d.i8);
                sb.append(" h = ");
                sb.append(y88Var.d.j8);
                sb.append(" r = ");
                b00.p(y88Var.d.h8, sb);
            }
            y88Var.d.U7.invalidate();
        } else {
            if (!photoViewer3.J4) {
                photoViewer3.k1.a(Math.min(photoViewer3.k8, y88Var.d.l8), false, photoViewer3.r);
            }
            y88Var.d.f8 = 0;
        }
        y88Var.d.O2();
        y88Var.d.I2();
    }

    private final void o() {
        JSONObject optJSONObject;
        String optString;
        su suVar = (su) this.b;
        String str = (String) this.c;
        WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
        x88 x88Var = (x88) suVar.b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + x88Var.x).put("platform", "DESKTOP"))).put("videoId", x88Var.x).toString().getBytes("UTF-8"));
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
            if (x88Var.I == 0) {
                x88Var.s = optString;
            } else {
                x88Var.g(optString);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    private final void p() {
        bu1 bu1Var;
        TLRPC.Message message;
        ve8 ve8Var = (ve8) this.b;
        mu1 mu1Var = (mu1) this.c;
        TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.d;
        k27 k27Var = ve8Var.I;
        byte[] bArr = pollAnswer.option;
        if (k27Var == null || (message = k27Var.k) == null || !(message.media instanceof TLRPC.TL_messageMediaPoll)) {
            bu1Var = null;
        } else {
            k27.B0(message);
            bu1Var = new bu1();
            bu1Var.a = k27Var;
            bu1Var.b = -1;
            bu1Var.c = -1;
            bu1Var.h = true;
            bu1Var.e = bArr;
            bu1Var.f();
        }
        mu1Var.Qb(k27Var, bu1Var);
        ve8Var.b(false);
    }

    private final void q() {
        gf8 gf8Var = (gf8) this.b;
        ff8 ff8Var = (ff8) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (gf8Var.isShowing()) {
            gf8Var.u1.remove(ff8Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                na7.q1(gf8Var.a).a4(tL_messages_votesList.users, false);
                ff8Var.b.addAll(tL_messages_votesList.votes);
                ff8Var.c = tL_messages_votesList.next_offset;
                gf8Var.D0(null);
                gf8Var.m1.X(true);
            }
        }
    }

    private final void r() {
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        premiumPreviewFragment.getClass();
        if (tL_error != null) {
            u21.e0(tL_error);
        } else {
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                return;
            }
            yjb.x(null, 2131743640, u21.b0(premiumPreviewFragment), null);
        }
    }

    private final void s() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        RectF rectF = ProfileActivity.Z6;
        if (gl.g(str)) {
            u21.b0(profileActivity).i(str2).j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04b1 A[Catch: Exception -> 0x0867, TryCatch #2 {Exception -> 0x0867, blocks: (B:215:0x0443, B:219:0x0451, B:226:0x045f, B:228:0x047a, B:232:0x0496, B:233:0x048d, B:236:0x04a6, B:237:0x04ad, B:239:0x04b1, B:241:0x04bb, B:243:0x04c9, B:246:0x04cc, B:248:0x04d8, B:250:0x04e9, B:251:0x04fb, B:253:0x0505, B:255:0x0511, B:257:0x0529, B:259:0x0541, B:261:0x0547, B:264:0x054f, B:266:0x04ee, B:268:0x04f4, B:269:0x04f6, B:273:0x0565, B:274:0x056d, B:276:0x0573, B:282:0x0595, B:283:0x059a, B:285:0x05a0, B:287:0x05a7, B:288:0x05ae, B:290:0x05b4, B:292:0x05be, B:293:0x05c2, B:299:0x05d8, B:301:0x05e4, B:307:0x05eb, B:311:0x05ee, B:310:0x05f4, B:314:0x05a3, B:315:0x0598, B:317:0x05f7, B:319:0x05fd, B:321:0x060f, B:323:0x0619, B:326:0x0758, B:335:0x062c, B:337:0x0658, B:338:0x065c, B:342:0x0667, B:344:0x0670, B:346:0x067f, B:347:0x0691, B:349:0x0699, B:350:0x069e, B:352:0x06bc, B:354:0x06c2, B:356:0x0684, B:358:0x068a, B:359:0x068c, B:363:0x06d2, B:365:0x06d9, B:366:0x06de, B:368:0x06e5, B:370:0x06f1, B:372:0x06fb, B:373:0x06fe, B:375:0x0704, B:378:0x073c, B:379:0x070f, B:381:0x0715, B:382:0x0717, B:384:0x0726, B:385:0x0729, B:387:0x0731, B:392:0x0743, B:393:0x06dc, B:394:0x06d5, B:396:0x074c, B:405:0x0775, B:409:0x078a), top: B:214:0x0443 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04cc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ad7 ad7Var;
        boolean z;
        ad7 ad7Var2;
        final HashMap hashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        final HashMap hashMap2;
        final HashMap hashMap3;
        final HashSet hashSet;
        ad7 ad7Var3;
        final HashMap hashMap4;
        final SparseArray sparseArray;
        final ArrayList arrayList3;
        ArrayList arrayList4;
        final ArrayList arrayList5;
        TLRPC.TL_messages_dialogs tL_messages_dialogs;
        int i;
        int i2;
        int i3;
        SparseArray sparseArray2;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ad7 ad7Var4;
        HashSet hashSet2;
        HashMap hashMap5;
        HashMap hashMap6;
        ArrayList arrayList9;
        Long valueOf;
        boolean z2;
        boolean z3;
        ArrayList arrayList10;
        HashMap hashMap7;
        LinkedHashMap linkedHashMap;
        int size;
        int i4;
        ?? r3;
        Long valueOf2;
        ArrayList arrayList11;
        TL_ephemeral.EphemeralMessage U;
        int i5;
        TLRPC.User user = null;
        int i6 = 0;
        switch (this.a) {
            case 0:
                ad7 ad7Var5 = (ad7) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                final Runnable runnable = (Runnable) this.d;
                try {
                    SparseArray sparseArray3 = new SparseArray();
                    int size2 = ad7Var5.I.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        try {
                            t97 t97Var = (t97) ad7Var5.I.get(i7);
                            sparseArray3.put(t97Var.a, t97Var);
                        } catch (Exception e) {
                            e = e;
                            z = true;
                            ad7Var2 = ad7Var5;
                            ad7Var2.n(e, z);
                            return;
                        }
                    }
                    ArrayList arrayList13 = new ArrayList();
                    ArrayList arrayList14 = new ArrayList();
                    hashMap = new HashMap();
                    arrayList = new ArrayList();
                    HashMap hashMap8 = new HashMap();
                    arrayList2 = new ArrayList();
                    hashMap2 = new HashMap();
                    ArrayList arrayList15 = new ArrayList();
                    ?? hashMap9 = new HashMap();
                    HashSet hashSet3 = new HashSet();
                    int size3 = arrayList12.size();
                    int i8 = 0;
                    ad7Var = hashMap9;
                    while (i8 < size3) {
                        try {
                            TLRPC.DialogFilter dialogFilter = (TLRPC.DialogFilter) arrayList12.get(i8);
                            ArrayList arrayList16 = arrayList12;
                            arrayList13.add(Integer.valueOf(dialogFilter.id));
                            if (dialogFilter.contacts) {
                                int i9 = na7.q5;
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            if (dialogFilter.non_contacts) {
                                int i10 = na7.q5;
                                i2 |= 2;
                            }
                            if (dialogFilter.groups) {
                                int i11 = na7.q5;
                                i2 |= 4;
                            }
                            if (dialogFilter.broadcasts) {
                                int i12 = na7.q5;
                                i2 |= 8;
                            }
                            if (dialogFilter.bots) {
                                int i13 = na7.q5;
                                i2 |= 16;
                            }
                            if (dialogFilter.exclude_muted) {
                                int i14 = na7.q5;
                                i2 |= 32;
                            }
                            if (dialogFilter.exclude_read) {
                                int i15 = na7.q5;
                                i3 = i2 | 64;
                            } else {
                                i3 = i2;
                            }
                            int i16 = i8;
                            if (dialogFilter.exclude_archived) {
                                int i17 = na7.q5;
                                i3 |= 128;
                            }
                            if (dialogFilter instanceof TLRPC.TL_dialogFilterChatlist) {
                                int i18 = na7.q5;
                                i3 = dialogFilter.has_my_invites ? i3 | 1536 : i3 | 512;
                            }
                            int i19 = size3;
                            t97 t97Var2 = (t97) ad7Var5.J.get(dialogFilter.id);
                            if (t97Var2 != null) {
                                sparseArray3.remove(dialogFilter.id);
                                sparseArray2 = sparseArray3;
                                if (TextUtils.equals(t97Var2.b, dialogFilter.title.text) && hq6.M(t97Var2.c, dialogFilter.title.entities)) {
                                    z2 = false;
                                } else {
                                    TLRPC.TL_textWithEntities tL_textWithEntities = dialogFilter.title;
                                    t97Var2.b = tL_textWithEntities.text;
                                    t97Var2.c = tL_textWithEntities.entities;
                                    z2 = true;
                                }
                                boolean z4 = t97Var2.n;
                                boolean z5 = z2;
                                boolean z6 = dialogFilter.title_noanimate;
                                if (z4 != z6) {
                                    t97Var2.n = z6;
                                    z5 = true;
                                }
                                int i20 = (dialogFilter.flags & TLObject.FLAG_27) != 0 ? dialogFilter.color : -1;
                                if (t97Var2.m != i20) {
                                    t97Var2.m = i20;
                                    z5 = true;
                                }
                                if (t97Var2.g != i3) {
                                    t97Var2.g = i3;
                                    z3 = true;
                                    z5 = true;
                                } else {
                                    z3 = false;
                                }
                                HashSet hashSet4 = new HashSet(t97Var2.h);
                                hashSet4.addAll(t97Var2.i);
                                HashSet hashSet5 = new HashSet();
                                boolean z7 = z3;
                                if (t97Var2.j.size() != 0) {
                                    ArrayList arrayList17 = new ArrayList();
                                    arrayList6 = arrayList13;
                                    int size4 = t97Var2.j.size();
                                    ad7Var3 = ad7Var5;
                                    int i21 = 0;
                                    boolean z8 = false;
                                    while (i21 < size4) {
                                        int i22 = size4;
                                        try {
                                            long keyAt = t97Var2.j.keyAt(i21);
                                            if (cf3.B(keyAt)) {
                                                z8 = true;
                                            }
                                            arrayList17.add(Long.valueOf(keyAt));
                                            i21++;
                                            size4 = i22;
                                        } catch (Exception e2) {
                                            e = e2;
                                            ad7Var = ad7Var3;
                                            z = true;
                                            ad7Var2 = ad7Var;
                                            ad7Var2.n(e, z);
                                            return;
                                        }
                                    }
                                    if (z8) {
                                        linkedHashMap = new LinkedHashMap();
                                        arrayList10 = arrayList;
                                        hashMap7 = hashMap8;
                                        Collections.sort(arrayList17, new nc4(t97Var2.j, (byte) 1));
                                        int size5 = arrayList17.size();
                                        int i23 = 0;
                                        while (i23 < size5) {
                                            Long l = (Long) arrayList17.get(i23);
                                            if (cf3.B(l.longValue())) {
                                                arrayList11 = arrayList17;
                                                linkedHashMap.put(Integer.valueOf(i23), l);
                                            } else {
                                                arrayList11 = arrayList17;
                                            }
                                            i23++;
                                            arrayList17 = arrayList11;
                                        }
                                        size = t97Var2.j.size();
                                        i4 = 0;
                                        while (true) {
                                            LongSparseIntArray longSparseIntArray = t97Var2.j;
                                            if (i4 >= size) {
                                                long keyAt2 = longSparseIntArray.keyAt(i4);
                                                if (!cf3.B(keyAt2)) {
                                                    hashSet5.add(Long.valueOf(keyAt2));
                                                    hashSet4.remove(Long.valueOf(keyAt2));
                                                }
                                                i4++;
                                            } else {
                                                longSparseIntArray.clear();
                                                int size6 = dialogFilter.pinned_peers.size();
                                                int i24 = 0;
                                                ad7 ad7Var6 = ad7Var;
                                                while (i24 < size6) {
                                                    TLRPC.InputPeer inputPeer = dialogFilter.pinned_peers.get(i24);
                                                    ArrayList arrayList18 = arrayList14;
                                                    int i25 = size6;
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
                                                    int size7 = t97Var2.j.size();
                                                    int i26 = i24;
                                                    ad7Var6 = ad7Var6;
                                                    if (linkedHashMap != null) {
                                                        while (true) {
                                                            Long l2 = (Long) linkedHashMap.remove(Integer.valueOf(size7));
                                                            if (l2 != null) {
                                                                t97Var2.j.put(l2.longValue(), size7);
                                                                size7++;
                                                                linkedHashMap = linkedHashMap;
                                                                arrayList15 = arrayList15;
                                                                ad7Var6 = ad7Var6;
                                                            }
                                                        }
                                                    }
                                                    ArrayList arrayList19 = arrayList15;
                                                    ad7 ad7Var7 = ad7Var6;
                                                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                                                    t97Var2.j.put(valueOf2.longValue(), size7);
                                                    hashSet4.remove(valueOf2);
                                                    if (!hashSet5.remove(valueOf2)) {
                                                        if (!hashMap2.containsKey(valueOf2)) {
                                                            arrayList2.add(valueOf2);
                                                            hashMap2.put(valueOf2, inputPeer);
                                                        }
                                                        z5 = true;
                                                    }
                                                    i24 = i26 + 1;
                                                    arrayList14 = arrayList18;
                                                    size6 = i25;
                                                    linkedHashMap = linkedHashMap2;
                                                    arrayList15 = arrayList19;
                                                    ad7Var6 = ad7Var7;
                                                }
                                                arrayList7 = arrayList14;
                                                ArrayList arrayList20 = arrayList15;
                                                ad7 ad7Var8 = ad7Var6;
                                                LinkedHashMap linkedHashMap3 = linkedHashMap;
                                                if (linkedHashMap3 != null) {
                                                    Iterator it = linkedHashMap3.entrySet().iterator();
                                                    while (it.hasNext()) {
                                                        t97Var2.j.put(((Long) ((Map.Entry) it.next()).getValue()).longValue(), t97Var2.j.size());
                                                    }
                                                }
                                                int i27 = 0;
                                                while (i27 < 2) {
                                                    ArrayList I1 = ad7.I1(i27 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers);
                                                    ArrayList arrayList21 = i27 == 0 ? t97Var2.h : t97Var2.i;
                                                    if (i27 == 0) {
                                                        ArrayList I12 = ad7.I1(dialogFilter.pinned_peers);
                                                        for (int i28 = 0; i28 < I12.size(); i28++) {
                                                            I1.remove(I12.get(i28));
                                                        }
                                                        I1.addAll(0, I12);
                                                    }
                                                    int size8 = I1.size();
                                                    boolean z9 = I1.size() != arrayList21.size();
                                                    if (!z9) {
                                                        int i29 = 0;
                                                        while (true) {
                                                            if (i29 < size8) {
                                                                if (arrayList21.contains(I1.get(i29))) {
                                                                    i29++;
                                                                } else {
                                                                    z9 = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (z9) {
                                                        if (i27 == 0) {
                                                            t97Var2.h = I1;
                                                        } else {
                                                            t97Var2.i = I1;
                                                        }
                                                        z7 = true;
                                                        z5 = true;
                                                    }
                                                    i27++;
                                                }
                                                if (hashSet5.isEmpty()) {
                                                    r3 = ad7Var8;
                                                } else {
                                                    r3 = ad7Var8;
                                                    r3.put(Integer.valueOf(t97Var2.a), hashSet5);
                                                    z5 = true;
                                                }
                                                if (z5) {
                                                    arrayList8 = arrayList20;
                                                    arrayList8.add(t97Var2);
                                                } else {
                                                    arrayList8 = arrayList20;
                                                }
                                                if (z7) {
                                                    hashSet3.add(Integer.valueOf(t97Var2.a));
                                                }
                                                ad7Var4 = r3;
                                                hashSet2 = hashSet3;
                                                arrayList = arrayList10;
                                                hashMap5 = hashMap7;
                                            }
                                        }
                                    }
                                } else {
                                    ad7Var3 = ad7Var5;
                                    arrayList6 = arrayList13;
                                }
                                arrayList10 = arrayList;
                                hashMap7 = hashMap8;
                                linkedHashMap = null;
                                size = t97Var2.j.size();
                                i4 = 0;
                                while (true) {
                                    LongSparseIntArray longSparseIntArray2 = t97Var2.j;
                                    if (i4 >= size) {
                                    }
                                    i4++;
                                }
                            } else {
                                ad7Var3 = ad7Var5;
                                ArrayList arrayList22 = arrayList;
                                HashMap hashMap10 = hashMap8;
                                sparseArray2 = sparseArray3;
                                arrayList6 = arrayList13;
                                arrayList7 = arrayList14;
                                arrayList8 = arrayList15;
                                ad7 ad7Var9 = ad7Var;
                                t97 t97Var3 = new t97();
                                t97Var3.a = dialogFilter.id;
                                t97Var3.g = i3;
                                TLRPC.TL_textWithEntities tL_textWithEntities2 = dialogFilter.title;
                                t97Var3.b = tL_textWithEntities2.text;
                                t97Var3.c = tL_textWithEntities2.entities;
                                t97Var3.n = dialogFilter.title_noanimate;
                                t97Var3.m = (dialogFilter.flags & TLObject.FLAG_27) != 0 ? dialogFilter.color : -1;
                                t97Var3.e = -1;
                                int i30 = 0;
                                while (i30 < 2) {
                                    if (i30 == 0) {
                                        int size9 = dialogFilter.pinned_peers.size();
                                        int i31 = 0;
                                        while (i31 < size9) {
                                            TLRPC.InputPeer inputPeer2 = dialogFilter.pinned_peers.get(i31);
                                            t97 t97Var4 = t97Var3;
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
                                            if (!t97Var4.h.contains(valueOf)) {
                                                t97Var4.h.add(valueOf);
                                            }
                                            ad7 ad7Var10 = ad7Var9;
                                            int i32 = size9;
                                            HashSet hashSet6 = hashSet3;
                                            t97Var4.j.put(valueOf.longValue(), t97Var4.j.size() + 1);
                                            if (!hashMap2.containsKey(valueOf)) {
                                                arrayList2.add(valueOf);
                                                hashMap2.put(valueOf, inputPeer2);
                                            }
                                            i31++;
                                            t97Var3 = t97Var4;
                                            size9 = i32;
                                            hashSet3 = hashSet6;
                                            ad7Var9 = ad7Var10;
                                        }
                                    }
                                    t97 t97Var5 = t97Var3;
                                    ad7 ad7Var11 = ad7Var9;
                                    HashSet hashSet7 = hashSet3;
                                    ArrayList<TLRPC.InputPeer> arrayList23 = i30 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers;
                                    ArrayList arrayList24 = i30 == 0 ? t97Var5.h : t97Var5.i;
                                    int size10 = arrayList23.size();
                                    int i33 = 0;
                                    while (i33 < size10) {
                                        TLRPC.InputPeer inputPeer3 = arrayList23.get(i33);
                                        long j5 = inputPeer3.user_id;
                                        if (j5 != 0) {
                                            Long valueOf3 = Long.valueOf(j5);
                                            if (!arrayList24.contains(valueOf3)) {
                                                arrayList24.add(valueOf3);
                                            }
                                            if (!hashMap.containsKey(valueOf3)) {
                                                arrayList7.add(valueOf3);
                                                hashMap.put(valueOf3, inputPeer3);
                                            }
                                            arrayList9 = arrayList22;
                                            hashMap6 = hashMap10;
                                        } else {
                                            long j6 = inputPeer3.chat_id;
                                            if (j6 == 0) {
                                                j6 = inputPeer3.channel_id;
                                            }
                                            Long valueOf4 = Long.valueOf(j6);
                                            Long valueOf5 = Long.valueOf(-j6);
                                            if (!arrayList24.contains(valueOf5)) {
                                                arrayList24.add(valueOf5);
                                            }
                                            hashMap6 = hashMap10;
                                            if (hashMap6.containsKey(valueOf4)) {
                                                arrayList9 = arrayList22;
                                            } else {
                                                arrayList9 = arrayList22;
                                                arrayList9.add(valueOf4);
                                                hashMap6.put(valueOf4, inputPeer3);
                                            }
                                        }
                                        i33++;
                                        hashMap10 = hashMap6;
                                        arrayList22 = arrayList9;
                                    }
                                    i30++;
                                    t97Var3 = t97Var5;
                                    hashSet3 = hashSet7;
                                    ad7Var9 = ad7Var11;
                                }
                                ad7Var4 = ad7Var9;
                                hashSet2 = hashSet3;
                                arrayList = arrayList22;
                                hashMap5 = hashMap10;
                                arrayList8.add(t97Var3);
                            }
                            i8 = i16 + 1;
                            size3 = i19;
                            arrayList15 = arrayList8;
                            hashMap8 = hashMap5;
                            arrayList14 = arrayList7;
                            arrayList12 = arrayList16;
                            hashSet3 = hashSet2;
                            sparseArray3 = sparseArray2;
                            arrayList13 = arrayList6;
                            ad7Var5 = ad7Var3;
                            ad7Var = ad7Var4;
                        } catch (Exception e3) {
                            e = e3;
                            ad7Var3 = ad7Var5;
                            ad7Var = ad7Var3;
                            z = true;
                            ad7Var2 = ad7Var;
                            ad7Var2.n(e, z);
                            return;
                        }
                    }
                    hashMap3 = ad7Var;
                    hashSet = hashSet3;
                    ad7Var3 = ad7Var5;
                    hashMap4 = hashMap8;
                    sparseArray = sparseArray3;
                    arrayList3 = arrayList13;
                    arrayList4 = arrayList14;
                    arrayList5 = arrayList15;
                } catch (Exception e4) {
                    e = e4;
                    ad7Var = ad7Var5;
                }
                try {
                    if (arrayList2.isEmpty()) {
                        ad7Var = ad7Var3;
                        tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                    } else {
                        ad7Var = ad7Var3;
                        tL_messages_dialogs = ad7Var.E0(arrayList4, arrayList, new ArrayList(), TextUtils.join(",", arrayList2));
                        int size11 = tL_messages_dialogs.dialogs.size();
                        for (int i34 = 0; i34 < size11; i34++) {
                            hashMap2.remove(Long.valueOf(tL_messages_dialogs.dialogs.get(i34).id));
                        }
                    }
                    final TLRPC.TL_messages_dialogs tL_messages_dialogs2 = tL_messages_dialogs;
                    final ArrayList arrayList25 = new ArrayList();
                    if (arrayList4.isEmpty()) {
                        i = 0;
                    } else {
                        i = 0;
                        ad7Var.k0(arrayList4, arrayList25, false);
                        int size12 = arrayList25.size();
                        for (int i35 = 0; i35 < size12; i35++) {
                            hashMap.remove(Long.valueOf(((TLRPC.User) arrayList25.get(i35)).id));
                        }
                    }
                    final ArrayList arrayList26 = new ArrayList();
                    if (!arrayList.isEmpty()) {
                        ad7Var.P(TextUtils.join(",", arrayList), arrayList26);
                        int size13 = arrayList26.size();
                        while (i < size13) {
                            hashMap4.remove(Long.valueOf(((TLRPC.Chat) arrayList26.get(i)).id));
                            i++;
                        }
                    }
                    if (!hashMap.isEmpty() || !hashMap4.isEmpty() || !hashMap2.isEmpty()) {
                        final na7 messagesController = ad7Var.getMessagesController();
                        final TLRPC.TL_messages_dialogs tL_messages_dialogs3 = new TLRPC.TL_messages_dialogs();
                        messagesController.getClass();
                        Utilities.d.c(new Runnable() { // from class: n87
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                TLRPC.TL_users_getUsers tL_users_getUsers;
                                na7 na7Var;
                                TLRPC.TL_messages_dialogs tL_messages_dialogs4;
                                TLRPC.TL_messages_dialogs tL_messages_dialogs5;
                                ArrayList arrayList27;
                                ArrayList arrayList28;
                                ArrayList arrayList29;
                                SparseArray sparseArray4;
                                ArrayList arrayList30;
                                HashMap hashMap11;
                                HashSet hashSet8;
                                Runnable runnable2;
                                TLRPC.TL_channels_getChannels tL_channels_getChannels;
                                TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs;
                                na7 na7Var2;
                                TLRPC.TL_messages_dialogs tL_messages_dialogs6;
                                TLRPC.TL_messages_dialogs tL_messages_dialogs7;
                                TLRPC.TL_channels_getChannels tL_channels_getChannels2;
                                ArrayList arrayList31;
                                ArrayList arrayList32;
                                ArrayList arrayList33;
                                TLRPC.TL_inputChannel tL_inputChannel;
                                ArrayList arrayList34;
                                ArrayList arrayList35 = new ArrayList();
                                Iterator it2 = hashMap.entrySet().iterator();
                                loop0: while (true) {
                                    tL_users_getUsers = null;
                                    while (true) {
                                        boolean hasNext = it2.hasNext();
                                        na7Var = na7.this;
                                        tL_messages_dialogs4 = tL_messages_dialogs2;
                                        tL_messages_dialogs5 = tL_messages_dialogs3;
                                        arrayList27 = arrayList25;
                                        arrayList28 = arrayList26;
                                        arrayList29 = arrayList5;
                                        sparseArray4 = sparseArray;
                                        arrayList30 = arrayList3;
                                        hashMap11 = hashMap3;
                                        hashSet8 = hashSet;
                                        runnable2 = runnable;
                                        if (!hasNext) {
                                            break loop0;
                                        }
                                        Map.Entry entry = (Map.Entry) it2.next();
                                        if (tL_users_getUsers == null) {
                                            tL_users_getUsers = new TLRPC.TL_users_getUsers();
                                            arrayList35.add(tL_users_getUsers);
                                        }
                                        arrayList34 = arrayList35;
                                        tL_users_getUsers.id.add(na7Var.n1((TLRPC.InputPeer) entry.getValue()));
                                        if (tL_users_getUsers.id.size() == 100) {
                                            break;
                                        } else {
                                            arrayList35 = arrayList34;
                                        }
                                    }
                                    arrayList35 = arrayList34;
                                    na7Var.E4(tL_users_getUsers, arrayList35, tL_messages_dialogs4, tL_messages_dialogs5, arrayList27, arrayList28, arrayList29, sparseArray4, arrayList30, hashMap11, hashSet8, runnable2);
                                }
                                if (tL_users_getUsers != null) {
                                    na7Var.E4(tL_users_getUsers, arrayList35, tL_messages_dialogs4, tL_messages_dialogs5, arrayList27, arrayList28, arrayList29, sparseArray4, arrayList30, hashMap11, hashSet8, runnable2);
                                }
                                TLRPC.TL_messages_getChats tL_messages_getChats = null;
                                loop2: while (true) {
                                    tL_channels_getChannels = null;
                                    for (Map.Entry entry2 : hashMap4.entrySet()) {
                                        na7Var2 = na7Var;
                                        TLRPC.InputPeer inputPeer4 = (TLRPC.InputPeer) entry2.getValue();
                                        tL_messages_dialogs6 = tL_messages_dialogs4;
                                        tL_messages_dialogs7 = tL_messages_dialogs5;
                                        if (inputPeer4.chat_id != 0) {
                                            if (tL_messages_getChats == null) {
                                                tL_messages_getChats = new TLRPC.TL_messages_getChats();
                                                arrayList35.add(tL_messages_getChats);
                                            }
                                            tL_messages_getChats.id.add((Long) entry2.getKey());
                                            if (tL_messages_getChats.id.size() == 100) {
                                                tL_messages_dialogs4 = tL_messages_dialogs6;
                                                na7Var = na7Var2;
                                                tL_messages_dialogs5 = tL_messages_dialogs7;
                                                na7Var.E4(tL_messages_getChats, arrayList35, tL_messages_dialogs4, tL_messages_dialogs5, arrayList27, arrayList28, arrayList29, sparseArray4, arrayList30, hashMap11, hashSet8, runnable2);
                                                tL_messages_getChats = null;
                                            } else {
                                                tL_messages_dialogs4 = tL_messages_dialogs6;
                                                na7Var = na7Var2;
                                                tL_messages_dialogs5 = tL_messages_dialogs7;
                                            }
                                        } else if (inputPeer4.channel_id != 0) {
                                            if (tL_channels_getChannels == null) {
                                                tL_channels_getChannels2 = new TLRPC.TL_channels_getChannels();
                                                arrayList35.add(tL_channels_getChannels2);
                                            } else {
                                                tL_channels_getChannels2 = tL_channels_getChannels;
                                            }
                                            ArrayList<TLRPC.InputChannel> arrayList36 = tL_channels_getChannels2.id;
                                            arrayList31 = arrayList27;
                                            if (inputPeer4.access_hash == 0) {
                                                arrayList32 = arrayList28;
                                                TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(inputPeer4.channel_id));
                                                if (K0 != null && K0.access_hash == 0 && K0.fromMessageId != 0 && K0.fromMessageDialogId != 0) {
                                                    TLRPC.TL_inputChannelFromMessage tL_inputChannelFromMessage = new TLRPC.TL_inputChannelFromMessage();
                                                    arrayList33 = arrayList29;
                                                    tL_inputChannelFromMessage.channel_id = inputPeer4.channel_id;
                                                    tL_inputChannelFromMessage.peer = na7.q1(y6c.t0).h1(K0.fromMessageDialogId);
                                                    tL_inputChannelFromMessage.msg_id = K0.fromMessageId;
                                                    tL_inputChannel = tL_inputChannelFromMessage;
                                                    arrayList36.add(tL_inputChannel);
                                                    if (tL_channels_getChannels2.id.size() != 100) {
                                                        break;
                                                    }
                                                    tL_messages_dialogs4 = tL_messages_dialogs6;
                                                    na7Var = na7Var2;
                                                    tL_messages_dialogs5 = tL_messages_dialogs7;
                                                    arrayList29 = arrayList33;
                                                    arrayList27 = arrayList31;
                                                    arrayList28 = arrayList32;
                                                    tL_channels_getChannels = tL_channels_getChannels2;
                                                }
                                            } else {
                                                arrayList32 = arrayList28;
                                            }
                                            arrayList33 = arrayList29;
                                            TLRPC.TL_inputChannel tL_inputChannel2 = new TLRPC.TL_inputChannel();
                                            tL_inputChannel2.channel_id = inputPeer4.channel_id;
                                            tL_inputChannel2.access_hash = inputPeer4.access_hash;
                                            tL_inputChannel = tL_inputChannel2;
                                            arrayList36.add(tL_inputChannel);
                                            if (tL_channels_getChannels2.id.size() != 100) {
                                            }
                                        } else {
                                            tL_messages_dialogs4 = tL_messages_dialogs6;
                                            na7Var = na7Var2;
                                            tL_messages_dialogs5 = tL_messages_dialogs7;
                                        }
                                    }
                                    tL_messages_dialogs4 = tL_messages_dialogs6;
                                    na7Var = na7Var2;
                                    tL_messages_dialogs5 = tL_messages_dialogs7;
                                    arrayList29 = arrayList33;
                                    arrayList27 = arrayList31;
                                    arrayList28 = arrayList32;
                                    na7Var.E4(tL_channels_getChannels2, arrayList35, tL_messages_dialogs4, tL_messages_dialogs5, arrayList27, arrayList28, arrayList29, sparseArray4, arrayList30, hashMap11, hashSet8, runnable2);
                                }
                                if (tL_messages_getChats != null) {
                                    na7Var.E4(tL_messages_getChats, arrayList35, tL_messages_dialogs4, tL_messages_dialogs5, arrayList27, arrayList28, arrayList29, sparseArray4, arrayList30, hashMap11, hashSet8, runnable2);
                                }
                                if (tL_channels_getChannels != null) {
                                    na7Var.E4(tL_channels_getChannels, arrayList35, tL_messages_dialogs4, tL_messages_dialogs5, arrayList27, arrayList28, arrayList29, sparseArray4, arrayList30, hashMap11, hashSet8, runnable2);
                                }
                                na7 na7Var3 = na7Var;
                                loop4: while (true) {
                                    tL_messages_getPeerDialogs = null;
                                    for (Map.Entry entry3 : hashMap2.entrySet()) {
                                        if (tL_messages_getPeerDialogs == null) {
                                            tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                                            arrayList35.add(tL_messages_getPeerDialogs);
                                        }
                                        TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                                        tL_inputDialogPeer.peer = (TLRPC.InputPeer) entry3.getValue();
                                        tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                                        if (tL_messages_getPeerDialogs.peers.size() == 100) {
                                            break;
                                        }
                                    }
                                    ArrayList arrayList37 = arrayList35;
                                    TLRPC.TL_messages_dialogs tL_messages_dialogs8 = tL_messages_dialogs4;
                                    TLRPC.TL_messages_dialogs tL_messages_dialogs9 = tL_messages_dialogs5;
                                    ArrayList arrayList38 = arrayList27;
                                    ArrayList arrayList39 = arrayList28;
                                    ArrayList arrayList40 = arrayList29;
                                    SparseArray sparseArray5 = sparseArray4;
                                    ArrayList arrayList41 = arrayList30;
                                    HashMap hashMap12 = hashMap11;
                                    HashSet hashSet9 = hashSet8;
                                    na7Var3.E4(tL_messages_getPeerDialogs, arrayList37, tL_messages_dialogs8, tL_messages_dialogs9, arrayList38, arrayList39, arrayList40, sparseArray5, arrayList41, hashMap12, hashSet9, runnable2);
                                    hashSet8 = hashSet9;
                                    hashMap11 = hashMap12;
                                    arrayList30 = arrayList41;
                                    sparseArray4 = sparseArray5;
                                    arrayList29 = arrayList40;
                                    arrayList28 = arrayList39;
                                    arrayList27 = arrayList38;
                                    tL_messages_dialogs5 = tL_messages_dialogs9;
                                    tL_messages_dialogs4 = tL_messages_dialogs8;
                                    arrayList35 = arrayList37;
                                }
                                if (tL_messages_getPeerDialogs != null) {
                                    na7Var3.E4(tL_messages_getPeerDialogs, arrayList35, tL_messages_dialogs4, tL_messages_dialogs5, arrayList27, arrayList28, arrayList29, sparseArray4, arrayList30, hashMap11, hashSet8, runnable2);
                                }
                            }
                        });
                        break;
                    } else {
                        ad7Var5 = ad7Var;
                        ad7Var5.V0(tL_messages_dialogs2, null, arrayList25, arrayList26, arrayList5, sparseArray, arrayList3, hashMap3, hashSet, runnable);
                        break;
                    }
                } catch (Exception e5) {
                    e = e5;
                    z = true;
                    ad7Var2 = ad7Var;
                    ad7Var2.n(e, z);
                    return;
                }
                break;
            case 1:
                ad7 ad7Var12 = (ad7) this.b;
                ArrayList arrayList27 = (ArrayList) this.c;
                i57 i57Var = (i57) this.d;
                ad7Var12.getClass();
                int size14 = arrayList27.size();
                while (i6 < size14) {
                    Object obj = arrayList27.get(i6);
                    i6++;
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
                    if (ephemeralMessage.top_msg_id == 0 && (U = ad7Var12.U(ephemeralMessage.id, cf3.n(ephemeralMessage.peer_id))) != null && (i5 = U.top_msg_id) != 0) {
                        ephemeralMessage.top_msg_id = i5;
                        TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
                        if (messageReplyHeader != null) {
                            messageReplyHeader.forum_topic = true;
                        }
                        ephemeralMessage.flags |= 2;
                    }
                }
                ad7Var12.d1(arrayList27, true);
                i57Var.run();
                break;
            case 2:
                gl.d3(new bj7((x15) this.d, ad7.Y(((jj7) this.b).a).g0(((TLRPC.TL_contact) this.c).user_id), (byte) 3));
                break;
            case 3:
                jj7 jj7Var = (jj7) this.b;
                TLObject tLObject = (TLObject) this.c;
                x15 x15Var = (x15) this.d;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    na7.q1(jj7Var.a).a4(tL_contacts_resolvedPeer.users, false);
                    na7.q1(jj7Var.a).U3(tL_contacts_resolvedPeer.chats, false);
                    long n = cf3.n(tL_contacts_resolvedPeer.peer);
                    if (n >= 0) {
                        user = na7.q1(jj7Var.a).V1(Long.valueOf(n));
                    }
                }
                x15Var.a(user);
                break;
            case 4:
                a();
                break;
            case 5:
                ((NotificationsSettingsActivity) this.b).D0((ArrayList) this.c, (hu2) this.d);
                break;
            case 6:
                boolean[] zArr = (boolean[]) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                qn7 qn7Var = (qn7) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    Runnable runnable2 = runnableArr[0];
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    qn7Var.a(0L);
                    break;
                }
                break;
            case 7:
                boolean[] zArr2 = (boolean[]) this.b;
                c01 c01Var = (c01) this.c;
                hd hdVar = (hd) this.d;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    c01Var.c(false);
                    hdVar.dismiss();
                    break;
                }
                break;
            case 8:
                ((qq7) this.b).g0((TLObject) this.d, (TLRPC.TL_error) this.c);
                break;
            case 9:
                vx7 vx7Var = (vx7) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                vx7Var.z1();
                if (tL_error == null) {
                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vx7Var.getParentActivity());
                    alertDialog$Builder.a.U = k96.a0("RestoreEmailSent", null, 2131745887, tL_auth_passwordRecovery.email_pattern);
                    alertDialog$Builder.a.S = k96.M0(2131745885, null);
                    alertDialog$Builder.j(k96.M0(2131747638, null), new dx6((Object) vx7Var, (Object) tL_auth_passwordRecovery, (byte) 10));
                    Dialog showDialog = vx7Var.showDialog(alertDialog$Builder.a);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        break;
                    }
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    vx7Var.O1(k96.M0(R.string.AppName, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
                    break;
                } else {
                    vx7Var.O1(k96.M0(R.string.AppName, null), tL_error.text);
                    break;
                }
                break;
            case 10:
                b();
                break;
            case 11:
                c();
                break;
            case 12:
                d();
                break;
            case 13:
                ((p) this.b).l0((TL_account.Password) this.c, (byte[]) this.d);
                break;
            case 14:
                e();
                break;
            case 15:
                f();
                break;
            case 16:
                g();
                break;
            case 17:
                h();
                break;
            case 18:
                i();
                break;
            case 19:
                j();
                break;
            case 20:
                k();
                break;
            case 21:
                l();
                break;
            case 22:
                m();
                break;
            case 23:
                n();
                break;
            case 24:
                o();
                break;
            case 25:
                p();
                break;
            case 26:
                q();
                break;
            case 27:
                r();
                break;
            case 28:
                s();
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ArrayList arrayList28 = (ArrayList) this.c;
                HashSet hashSet8 = (HashSet) this.d;
                RectF rectF = ProfileActivity.Z6;
                int size15 = arrayList28.size();
                for (int i36 = 0; i36 < size15; i36++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList28.get(i36);
                    if (!hashSet8.contains(Long.valueOf(user2.id))) {
                        TLRPC.ChatFull chatFull = profileActivity.v2;
                        if (chatFull.participants == null) {
                            chatFull.participants = new TLRPC.TL_chatParticipants();
                        }
                        if (hc2.T(profileActivity.F2)) {
                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                            TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                            tL_channelParticipant.inviter_id = profileActivity.getUserConfig().e();
                            tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant.peer.user_id = user2.id;
                            channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                            tL_chatChannelParticipant.user_id = user2.id;
                            profileActivity.v2.participants.participants.add(tL_chatChannelParticipant);
                        } else {
                            TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                            tL_chatParticipant.user_id = user2.id;
                            tL_chatParticipant.inviter_id = y6c.h(profileActivity.getAccountInstance().a).n;
                            profileActivity.v2.participants.participants.add(tL_chatParticipant);
                        }
                        profileActivity.v2.participants_count++;
                        profileActivity.getMessagesController().Z3(user2, false, false);
                    }
                }
                profileActivity.Y3(true, false);
                break;
        }
    }

    public /* synthetic */ pc7(sm7 sm7Var, String str, ArrayList arrayList) {
        this.a = (byte) 4;
        this.b = sm7Var;
        this.d = str;
        this.c = arrayList;
    }

    public /* synthetic */ pc7(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
