// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.c;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ z87(k17 k17Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, uc7 uc7Var, jf7 jf7Var) {
        this.a = (byte) 17;
        this.c = k17Var;
        this.h = str;
        this.d = tL_error;
        this.e = tLObject;
        this.b = uc7Var;
        this.f = jf7Var;
    }

    private final void a() {
        nt9 nt9Var = (nt9) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.e;
        ArrayList arrayList4 = (ArrayList) this.f;
        lt9 lt9Var = (lt9) this.h;
        nt9Var.k = false;
        nt9Var.l = true;
        int i = nt9Var.a;
        uc7.s1(i).j4(arrayList, true);
        uc7.s1(i).c4(arrayList2, true);
        wl.g(i).d(arrayList3);
        ArrayList arrayList5 = nt9Var.c;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        nt9Var.l();
        if (nt9Var.m) {
            return;
        }
        lt9Var.run();
    }

    private final void b() {
        nt9 nt9Var = (nt9) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.e;
        ArrayList arrayList4 = (ArrayList) this.f;
        zh6 zh6Var = (zh6) this.h;
        ArrayList arrayList5 = nt9Var.c;
        ArrayList arrayList6 = nt9Var.i;
        int i = nt9Var.a;
        uc7.s1(i).j4(arrayList, true);
        uc7.s1(i).c4(arrayList2, true);
        wl.g(i).d(arrayList3);
        for (int i2 = 0; i2 < arrayList4.size(); i2++) {
            nt9Var.i(((Long) arrayList4.get(i2)).longValue());
        }
        for (int i3 = 0; i3 < zh6Var.m(); i3++) {
            long j = zh6Var.j(i3);
            r47 r47Var = new r47(nt9Var.a, (TLRPC.Message) zh6Var.n(i3), null, null, null, null, null, false, false, 0L, false, false, true, 0);
            for (int i4 = 0; i4 < arrayList6.size(); i4++) {
                mt9 mt9Var = (mt9) arrayList6.get(i4);
                if (mt9Var.a == j) {
                    mt9Var.c = r47Var.e1();
                    mt9Var.d = r47Var;
                }
            }
            for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                mt9 mt9Var2 = (mt9) arrayList5.get(i5);
                if (mt9Var2.a == j) {
                    mt9Var2.c = r47Var.e1();
                    mt9Var2.d = r47Var;
                }
            }
        }
        nt9Var.k();
    }

    private final void c() {
        wx9 wx9Var = (wx9) this.b;
        Activity activity = (Activity) this.c;
        id idVar = (id) this.d;
        TLObject tLObject = (TLObject) this.e;
        byte[] bArr = (byte[]) this.f;
        TLRPC.User user = (TLRPC.User) this.h;
        byte b = 0;
        wx9Var.n = false;
        if (!activity.isFinishing()) {
            try {
                idVar.dismiss();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) tLObject;
        encryptedChat.user_id = encryptedChat.participant_id;
        encryptedChat.seq_in = -2;
        encryptedChat.seq_out = 1;
        encryptedChat.a_or_b = bArr;
        wx9Var.getMessagesController().f4(encryptedChat, false);
        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
        tL_dialog.id = wf3.E(encryptedChat.id);
        tL_dialog.unread_count = 0;
        tL_dialog.top_message = 0;
        tL_dialog.last_message_date = wx9Var.getConnectionsManager().getCurrentTime();
        wx9Var.getMessagesController().R.k(tL_dialog.id, tL_dialog);
        wx9Var.getMessagesController().y.add(tL_dialog);
        wx9Var.getMessagesController().h5(null);
        jf7 messagesStorage = wx9Var.getMessagesStorage();
        messagesStorage.a.c(new oy6(messagesStorage, encryptedChat, user, tL_dialog, (byte) 10));
        wx9Var.getNotificationCenter().k(jn7.r, new Object[0]);
        wx9Var.getNotificationCenter().k(jn7.a0, encryptedChat);
        Utilities.d.c(new ux9(wx9Var, b));
    }

    private final void d() {
        int i;
        final b2a b2aVar = (b2a) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
        TLRPC.TL_channels_editCreator tL_channels_editCreator = (TLRPC.TL_channels_editCreator) this.h;
        if (tL_error == null) {
            if (tL_inputCheckPasswordSRP != null) {
                zd zdVar = b2aVar.U1;
                if (zdVar != null) {
                    zdVar.run();
                }
                b2aVar.dismiss();
                twoStepVerificationActivity.s0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (b2aVar.e2 != null) {
            byte b = 3;
            final byte b2 = 0;
            if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                if (tL_inputCheckPasswordSRP == null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b2aVar.e2);
                    String M0 = ob6.M0(xc2.V(b2aVar.S1) ? 2131751287 : 2131751280, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = hl.S2(ob6.a0(null, null, 2131751257, b2aVar.S1.title, lbc.k(user, true)));
                    alertDialog$Builder.j(ob6.M0(2131751261, null), new yw9(b2aVar, user, b));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), new fd() { // from class: s1a
                        @Override // fd
                        public final void w(id idVar2, int i2) {
                            byte b3 = b2;
                            b2a b2aVar2 = b2aVar;
                            switch (b3) {
                                case 0:
                                    b2aVar2.c2.setLoading(false);
                                    break;
                                case 1:
                                    e S = LaunchActivity.S();
                                    if (S != null) {
                                        b2aVar2.dismiss();
                                        S.presentFragment(new o7c(6, null));
                                        break;
                                    }
                                    break;
                                case 2:
                                    b2aVar2.c2.setLoading(false);
                                    break;
                                default:
                                    b2aVar2.c2.setLoading(false);
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                    ConnectionsManager.getInstance(b2aVar.a).sendRequest(new TL_account.getPassword(), new qn8((Object) b2aVar, (Object) twoStepVerificationActivity, (Object) user, (byte) 6), 8);
                    return;
                }
                if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.s0();
                        twoStepVerificationActivity.finishFragment();
                    }
                    e S = LaunchActivity.S();
                    if (S != null) {
                        jj.e0(tL_error, S, xc2.V(b2aVar.S1), xc2.Y(b2aVar.S1), tL_channels_editCreator);
                        return;
                    }
                    return;
                }
                if (b2aVar.e2 != null && !yac.h(k5.a(b2aVar.a).a).p()) {
                    e S2 = LaunchActivity.S();
                    if (S2 != null) {
                        new l46(5, b2aVar.a, null, b2aVar.e2, S2);
                        return;
                    }
                    return;
                }
                e S3 = LaunchActivity.S();
                if (S3 != null) {
                    b2aVar.dismiss();
                    S3.presentFragment(new axb(1));
                    return;
                }
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(b2aVar.e2);
            alertDialog$Builder2.a.S = ob6.M0(2131751262, null);
            LinearLayout linearLayout = new LinearLayout(b2aVar.e2);
            linearLayout.setPadding(hl.L(24.0f), hl.L(2.0f), hl.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder2.n(linearLayout);
            TextView textView = new TextView(b2aVar.e2);
            int i2 = aob.j5;
            yob.X(textView, i2, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((ob6.a0 ? 5 : 3) | 48);
            if (xc2.V(b2aVar.S1)) {
                uh9.r(null, null, 2131751248, new Object[]{lbc.k(user, true)}, textView);
            } else {
                uh9.r(null, null, 2131751266, new Object[]{lbc.k(user, true)}, textView);
            }
            linearLayout.addView(textView, tre.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(b2aVar.e2);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(b2aVar.e2);
            imageView.setImageResource(R.drawable.list_circle);
            imageView.setPadding(ob6.a0 ? hl.L(11.0f) : 0, hl.L(9.0f), ob6.a0 ? 0 : hl.L(11.0f), 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.s(imageView, i2, null, mode);
            TextView textView2 = new TextView(b2aVar.e2);
            yob.X(textView2, i2, null);
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((ob6.a0 ? 5 : 3) | 48);
            textView2.setText(hl.S2(ob6.M0(2131751265, null)));
            if (ob6.a0) {
                linearLayout2.addView(textView2, tre.o(-1, -2));
                linearLayout2.addView(imageView, tre.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, tre.o(-2, -2));
                linearLayout2.addView(textView2, tre.o(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(b2aVar.e2);
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(b2aVar.e2);
            imageView2.setImageResource(R.drawable.list_circle);
            imageView2.setPadding(ob6.a0 ? hl.L(11.0f) : 0, hl.L(9.0f), ob6.a0 ? 0 : hl.L(11.0f), 0);
            yob.s(imageView2, i2, null, mode);
            TextView textView3 = new TextView(b2aVar.e2);
            yob.X(textView3, i2, null);
            textView3.setTextSize(1, 16.0f);
            textView3.setGravity((ob6.a0 ? 5 : 3) | 48);
            textView3.setText(hl.S2(ob6.M0(2131751264, null)));
            if (ob6.a0) {
                linearLayout3.addView(textView3, tre.o(-1, -2));
                i = 5;
                linearLayout3.addView(imageView2, tre.r(-2, -2, 5));
            } else {
                i = 5;
                linearLayout3.addView(imageView2, tre.o(-2, -2));
                linearLayout3.addView(textView3, tre.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                final byte b3 = 1;
                alertDialog$Builder2.j(ob6.M0(2131751256, null), new fd() { // from class: s1a
                    @Override // fd
                    public final void w(id idVar2, int i22) {
                        byte b32 = b3;
                        b2a b2aVar2 = b2aVar;
                        switch (b32) {
                            case 0:
                                b2aVar2.c2.setLoading(false);
                                break;
                            case 1:
                                e S4 = LaunchActivity.S();
                                if (S4 != null) {
                                    b2aVar2.dismiss();
                                    S4.presentFragment(new o7c(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                b2aVar2.c2.setLoading(false);
                                break;
                            default:
                                b2aVar2.c2.setLoading(false);
                                break;
                        }
                    }
                });
                final byte b4 = 2;
                alertDialog$Builder2.g(ob6.M0(2131752570, null), new fd() { // from class: s1a
                    @Override // fd
                    public final void w(id idVar2, int i22) {
                        byte b32 = b4;
                        b2a b2aVar2 = b2aVar;
                        switch (b32) {
                            case 0:
                                b2aVar2.c2.setLoading(false);
                                break;
                            case 1:
                                e S4 = LaunchActivity.S();
                                if (S4 != null) {
                                    b2aVar2.dismiss();
                                    S4.presentFragment(new o7c(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                b2aVar2.c2.setLoading(false);
                                break;
                            default:
                                b2aVar2.c2.setLoading(false);
                                break;
                        }
                    }
                });
            } else {
                TextView textView4 = new TextView(b2aVar.e2);
                yob.X(textView4, i2, null);
                textView4.setTextSize(1, 16.0f);
                uh9.q(textView4, (ob6.a0 ? i : 3) | 48, null, 2131751263);
                linearLayout.addView(textView4, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                final byte b5 = 3;
                alertDialog$Builder2.g(ob6.M0(2131747558, null), new fd() { // from class: s1a
                    @Override // fd
                    public final void w(id idVar2, int i22) {
                        byte b32 = b5;
                        b2a b2aVar2 = b2aVar;
                        switch (b32) {
                            case 0:
                                b2aVar2.c2.setLoading(false);
                                break;
                            case 1:
                                e S4 = LaunchActivity.S();
                                if (S4 != null) {
                                    b2aVar2.dismiss();
                                    S4.presentFragment(new o7c(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                b2aVar2.c2.setLoading(false);
                                break;
                            default:
                                b2aVar2.c2.setLoading(false);
                                break;
                        }
                    }
                });
            }
            alertDialog$Builder2.o();
        }
    }

    private final void e() {
        r7a r7aVar = (r7a) this.b;
        String str = (String) this.h;
        String str2 = (String) this.c;
        String str3 = (String) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        e4b e4bVar = (e4b) this.f;
        m7a m7aVar = new m7a(r7aVar);
        m7aVar.f = str;
        m7aVar.e = str2;
        m7aVar.g = str3;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k7a k7aVar = (k7a) arrayList.get(i);
            File file = new File(k7aVar.a);
            if (file.exists()) {
                long length = file.length();
                if (length != 0) {
                    m7aVar.h += length;
                    m7aVar.d.add(k7aVar);
                    m7aVar.a.put(k7aVar.a, k7aVar);
                    hashMap.put(k7aVar.a, m7aVar);
                }
            }
            if (i == 0) {
                hl.c3(new ux9(e4bVar, (byte) 14));
                return;
            }
        }
        hl.c3(new cp7((Object) r7aVar, (Object) m7aVar, (Object) hashMap, (Object) str2, (Object) e4bVar, (byte) 22));
    }

    private final void f() {
        r7a r7aVar = (r7a) this.b;
        TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) this.c;
        r47 r47Var = (r47) this.d;
        File file = (File) this.f;
        d7a d7aVar = (d7a) this.e;
        String str = (String) this.h;
        if (tL_photo == null) {
            if (f11.a) {
                StringBuilder p = ik8.p("can't load image ", str, " to file ");
                p.append(file.toString());
                cc4.d(p.toString());
            }
            d7aVar.c();
            return;
        }
        TLRPC.Message message = r47Var.k;
        message.media.photo = tL_photo;
        message.attachPath = file.toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add(r47Var.k);
        r7aVar.getMessagesStorage().g1(arrayList, false, true, false, 0, false, r47Var.r1 ? 1 : 0, 0L);
        r7aVar.getNotificationCenter().k(jn7.l0, r47Var.k);
        d7aVar.g = (TLRPC.PhotoSize) c00.g(1, tL_photo.sizes);
        d7aVar.h = tL_photo;
        d7aVar.l = null;
        if (d7aVar.e != 4) {
            r7aVar.L(d7aVar, -1);
        } else {
            d7aVar.p = true;
            r7aVar.L(d7aVar, d7aVar.x.indexOf(r47Var));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:328:0x0848, code lost:
    
        if (r8.creator == false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0844, code lost:
    
        if ((r12 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L301;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0479 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ynb ynbVar;
        HashMap<String, String> hashMap;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.ChatParticipants chatParticipants;
        boolean z;
        boolean z2;
        boolean z3;
        jb9 jb9Var;
        jb9 jb9Var2;
        c51 c51Var;
        byte b = 6;
        int i2 = 33;
        Uri uri = null;
        r9 = null;
        TLRPC.PhotoSize photoSize = null;
        r9 = null;
        TLRPC.User user = null;
        uri = null;
        uri = null;
        uri = null;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                uc7 uc7Var = (uc7) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.c;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) this.d;
                unb unbVar = (unb) this.e;
                File file = (File) this.f;
                String str = (String) this.h;
                if (uc7Var.J2 == null || uc7Var.K2.s == null || wallPaper == null) {
                    return;
                }
                wallPaper.settings = tL_wallPaperSettings;
                wallPaper.flags |= 4;
                unbVar.c = wallPaper.slug;
                znb znbVar = unbVar.p;
                if (znbVar != null && ((ynbVar = unbVar.q) != null ? ynbVar.y == unbVar : znbVar.j0 == unbVar)) {
                    unbVar.c();
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(wallPaper);
                uc7Var.getMessagesStorage().m1(2, arrayList3);
                TLRPC.PhotoSize w = xb4.w(wallPaper.document.thumbs, jn7.q5, false, null, false);
                if (w != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(w.location.volume_id);
                    sb.append("_");
                    in5.z().O(Utilities.a(file.getAbsolutePath()) + "@100_100", uh9.l(sb, w.location.local_id, "@100_100"), jn5.c(w, wallPaper.document));
                }
                jn7.e().k(jn7.i4, wallPaper.slug);
                ArrayList arrayList4 = uc7Var.K2.s;
                if (arrayList4 == null || unbVar.n == 0) {
                    return;
                }
                arrayList4.add(Integer.valueOf(af2.e(uc7Var.currentAccount).s(unbVar.n, str, unbVar, null, null)));
                return;
            case 1:
                r7a r7aVar = (r7a) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                ArrayList arrayList7 = (ArrayList) this.e;
                ArrayList arrayList8 = (ArrayList) this.f;
                ArrayList arrayList9 = (ArrayList) this.h;
                boolean z4 = true;
                r7aVar.getMessagesController().j4(arrayList5, true);
                r7aVar.getMessagesController().c4(arrayList6, true);
                r7aVar.getMessagesController().g4(arrayList7);
                int size = arrayList8.size();
                int i3 = 0;
                while (i3 < size) {
                    r47 r47Var = new r47(r7aVar.currentAccount, (TLRPC.Message) arrayList8.get(i3), false, z4);
                    long c1 = r47Var.c1();
                    if (c1 != 0 && (hashMap = r47Var.k.params) != null && !hashMap.containsKey("final") && (i3 == size - 1 || ((TLRPC.Message) arrayList8.get(i3 + 1)).grouped_id != c1)) {
                        r47Var.k.params.put("final", "1");
                    }
                    r7aVar.j0(0L, r47Var, true);
                    i3++;
                    z4 = true;
                }
                if (arrayList9 != null) {
                    for (int i4 = 0; i4 < arrayList9.size(); i4++) {
                        r47 r47Var2 = new r47(r7aVar.currentAccount, (TLRPC.Message) arrayList9.get(i4), false, true);
                        r47Var2.r1 = true;
                        r7aVar.j0(0L, r47Var2, true);
                    }
                    return;
                }
                return;
            case 2:
                ((di0) this.b).l((Activity) this.c, (k5) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f, (ekd) this.h, true);
                return;
            case 3:
                rv0 rv0Var = (rv0) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
                String str2 = (String) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                String str3 = (String) this.f;
                vnb vnbVar = rv0Var.e;
                if (tLObject == null) {
                    if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            new d31(rv0Var, vnbVar).I(R.raw.error, ob6.M0(2131753121, null), hl.L2(aob.v0(aob.xj, vnbVar), ob6.a0(null, null, 2131753123, str3))).j();
                            return;
                        } else {
                            new d31(rv0Var, vnbVar).g0(tL_error, false);
                            return;
                        }
                    }
                    return;
                }
                if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                    uq7.b(false, rv0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, rv0Var);
                    return;
                } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                    uq7.b(false, rv0Var.N, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, rv0Var);
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                        jj.m0(rv0Var.getContext(), str2, false, true, true, false, 0L, null, null, null);
                        return;
                    }
                    return;
                }
            case 4:
                rv0 rv0Var2 = (rv0) this.b;
                File file2 = (File) this.f;
                id idVar = (id) this.c;
                String str4 = (String) this.h;
                String str5 = (String) this.d;
                String str6 = (String) this.e;
                if (file2 == null) {
                    idVar.b(500L);
                    return;
                } else {
                    int[] iArr = new int[11];
                    Utilities.e.c(new es6(file2, iArr, new ra7((Object) rv0Var2, (Object) iArr, (Object) file2, (Object) idVar, (Object) str4, (Object) str5, (Object) str6, (byte) 4), (byte) 28));
                    return;
                }
            case 5:
                TLObject tLObject2 = (TLObject) this.b;
                String[] strArr = (String[]) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                p66 p66Var = (p66) this.e;
                nx0 nx0Var = (nx0) this.f;
                vnb vnbVar2 = (vnb) this.h;
                if (tLObject2 instanceof TL_phone.exportedGroupCallInvite) {
                    String str7 = ((TL_phone.exportedGroupCallInvite) tLObject2).link;
                    strArr[0] = str7;
                    if (str7.startsWith("https://")) {
                        str7 = str7.substring(8);
                    }
                    String str8 = str7;
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    AtomicBoolean atomicBoolean = new AtomicBoolean();
                    duration.addUpdateListener(new p81(frameLayout, atomicBoolean, p66Var, str8, (byte) 0));
                    duration.addListener(new a91(atomicBoolean, p66Var, str8));
                    duration.start();
                    new d31(nx0Var.F, vnbVar2).I(R.raw.linkbroken, ob6.M0(2131749229, null), ob6.M0(2131749230, null)).j();
                    return;
                }
                return;
            case 6:
                wf1 wf1Var = (wf1) this.b;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                ArrayList arrayList12 = (ArrayList) this.f;
                df1 df1Var = (df1) this.h;
                TLRPC.Chat chat = wf1Var.f;
                wf1Var.a0 = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (!xc2.T(chat)) {
                            TLRPC.ChatFull N0 = wf1Var.getMessagesController().N0(chat.id);
                            if (N0 != null && (chatParticipants = N0.participants) != null) {
                                int size2 = chatParticipants.participants.size();
                                while (b2 < size2) {
                                    TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(b2);
                                    i = i2;
                                    arrayList = arrayList11;
                                    if (chatParticipant.user_id == channelParticipant.peer.user_id) {
                                        if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                            break;
                                        }
                                    } else {
                                        i2 = i;
                                        arrayList11 = arrayList;
                                        b2++;
                                    }
                                }
                            }
                        } else {
                            uc7 messagesController = wf1Var.getMessagesController();
                            long j = channelParticipant.peer.user_id;
                            zh6 zh6Var = (zh6) messagesController.q1.f(chat.id);
                            TLRPC.ChannelParticipant channelParticipant2 = zh6Var == null ? null : (TLRPC.ChannelParticipant) zh6Var.f(j);
                            if (channelParticipant2 != null && ((channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) || channelParticipant2.admin_rights.manage_call)) {
                                i = 33;
                                arrayList = arrayList11;
                                break;
                            }
                        }
                    }
                    i = i2;
                    arrayList = arrayList11;
                    if (xc2.x(chat, channelParticipant, 6) || xc2.x(chat, channelParticipant, 7)) {
                        arrayList2 = arrayList;
                        c00.s(null, 2131745790, arrayList10, R.drawable.msg_block2, arrayList2);
                        arrayList12.add(Integer.valueOf(i));
                    } else {
                        arrayList2 = arrayList;
                    }
                    c00.s(null, 2131753722, arrayList10, R.drawable.msg_block, arrayList2);
                    arrayList12.add(35);
                }
                df1Var.run();
                return;
            case 7:
                zu1 zu1Var = (zu1) this.b;
                cq1 cq1Var = (cq1) this.c;
                wb2 wb2Var = (wb2) this.d;
                String str9 = (String) this.h;
                TLObject tLObject3 = (TLObject) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                cq1Var.c(false);
                fu5 J = fu5.J(zu1Var, wb2Var);
                mu9 mu9Var = new mu9(zu1Var.getParentActivity(), zu1Var.Ba);
                J.p = new dm1(mu9Var, b2);
                J.b(R.drawable.msg_copy, ob6.M0(2131751731, null), new mm1(zu1Var, mu9Var, str9, (byte) 2), false);
                if (tLObject3 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject3;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList13 = tL_payments_bankCardData.open_urls;
                    int size3 = arrayList13.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList13.get(i5);
                        i5++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        J.b(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new jj1(zu1Var, tL_bankCardOpenUrl2, (byte) 9), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        J.j();
                        J.o(13, hl.L(200.0f), tL_payments_bankCardData.title);
                    }
                }
                mu9Var.e(J);
                mu9Var.f(wb2Var, characterStyle, null, false);
                zu1Var.showDialog(mu9Var);
                return;
            case 8:
                c cVar = (c) this.b;
                knc kncVar = (knc) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                ey1 ey1Var = (ey1) this.e;
                RectF rectF = (RectF) this.f;
                sh9 sh9Var = (sh9) this.h;
                cVar.getClass();
                kncVar.getLocationInWindow(new int[2]);
                frameLayout2.getLocationInWindow(new int[2]);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ey1Var.getLayoutParams();
                layoutParams.leftMargin = Math.round((rectF.left + r0[0]) - r2[0]);
                layoutParams.topMargin = Math.round((rectF.top + r0[1]) - r2[1]);
                ey1Var.setLayoutParams(layoutParams);
                ey1Var.post(new la7((Object) cVar, (Object) frameLayout2, (Object) ey1Var, (Object) sh9Var, (Object) kncVar, (byte) 20));
                return;
            case 9:
                final yx4 yx4Var = (yx4) this.b;
                id idVar2 = (id) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                l77 l77Var = (l77) this.e;
                final pcc pccVar = (pcc) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                idVar2.dismiss();
                if (tLObject4 instanceof TL_stars.checkCanSendGiftResultOk) {
                    l77Var.run();
                    return;
                }
                if (!(tLObject4 instanceof TL_stars.checkCanSendGiftResultFail)) {
                    if (tL_error2 != null) {
                        new d31(yx4Var.c, yx4Var.J0).g0(tL_error2, false);
                        return;
                    }
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yx4Var.J0, yx4Var.getContext());
                alertDialog$Builder.a.S = ob6.M0(2131749697, null);
                alertDialog$Builder.a.U = r47.h0(((TL_stars.checkCanSendGiftResultFail) tLObject4).reason, false);
                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                final id o = alertDialog$Builder.o();
                final uu3 uu3Var = o.n;
                if (uu3Var != null) {
                    uu3Var.setOnLinkPressListener(new o66() { // from class: hx4
                        @Override // o66
                        public final void a(ClickableSpan clickableSpan) {
                            o.dismiss();
                            pcc pccVar2 = pccVar;
                            if (pccVar2 != null) {
                                pccVar2.a(Boolean.FALSE);
                            }
                            yx4.this.dismiss();
                            clickableSpan.onClick(uu3Var);
                        }
                    });
                    return;
                }
                return;
            case 10:
                a55 a55Var = (a55) this.b;
                String str10 = (String) this.h;
                byte[] bArr = (byte[]) this.c;
                v35 v35Var = (v35) this.d;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.e;
                x45 x45Var = (x45) this.f;
                org.telegram.ui.Wallet.c cVar2 = a55Var.b;
                if (!TextUtils.equals(str10, cVar2.x()) || !Arrays.equals(bArr, cVar2.D())) {
                    v35Var.a("Wallet or TON Connect session changed. Open the request again.");
                    return;
                }
                TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                tonconnectclosesession.session_id = tonconnectsession.id;
                tonconnectclosesession.body = x45Var.c;
                a55Var.f.sendRequestTyped(tonconnectclosesession, new ic((byte) 0), new yt4(v35Var, b));
                return;
            case 11:
                a55 a55Var2 = (a55) this.b;
                String str11 = (String) this.h;
                pcc pccVar2 = (pcc) this.c;
                w45 w45Var = (w45) this.d;
                c35 c35Var = (c35) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f;
                if (str11 != null) {
                    pccVar2.a(str11);
                    return;
                } else if (!a55Var2.A(w45Var) || a55Var2.i(w45Var)) {
                    pccVar2.a("Request expired or wallet changed");
                    return;
                } else {
                    a55Var2.f.sendRequestTyped(sendtransfer, new ic((byte) 0), new pm1(a55Var2, pccVar2, w45Var, c35Var, sendtransfer, (byte) 6));
                    return;
                }
            case 12:
                a55 a55Var3 = (a55) this.b;
                String str12 = (String) this.h;
                byte[] bArr2 = (byte[]) this.c;
                x45 x45Var2 = (x45) this.d;
                byte[] bArr3 = x45Var2.b;
                qe2 qe2Var = (qe2) this.e;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f;
                org.telegram.ui.Wallet.c cVar3 = a55Var3.b;
                if (!TextUtils.equals(str12, cVar3.x()) || !Arrays.equals(bArr2, cVar3.D())) {
                    Arrays.fill(bArr3, (byte) 0);
                    qe2Var.a(null, "Wallet changed. Open the request again.");
                    return;
                }
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
                inputtonconnectoauthsession.session_id = tonconnectsession2.id;
                inputtonconnectoauthsession.challenge_answer = bArr3;
                inputtonconnectoauthsession.body = x45Var2.c;
                inputtonconnectoauthsession.proof = x45Var2.d;
                qe2Var.a(inputtonconnectoauthsession, null);
                return;
            case 13:
                a55 a55Var4 = (a55) this.b;
                w45 w45Var2 = (w45) this.c;
                c35 c35Var2 = (c35) this.d;
                v35 v35Var2 = (v35) this.e;
                JSONObject jSONObject = (JSONObject) this.f;
                String str13 = (String) this.h;
                if (!a55Var4.A(w45Var2) || a55Var4.i(w45Var2)) {
                    a55Var4.y(w45Var2, c35Var2, null, 0, "Request expired or wallet changed", v35Var2);
                    return;
                } else {
                    a55Var4.y(w45Var2, c35Var2, jSONObject, jSONObject != null ? -1 : 0, str13, v35Var2);
                    return;
                }
            case 14:
                n55 n55Var = (n55) this.b;
                int[] iArr2 = (int[]) this.c;
                TextView textView = (TextView) this.d;
                ao1 ao1Var = (ao1) this.e;
                org.telegram.ui.Wallet.c cVar4 = (org.telegram.ui.Wallet.c) this.f;
                z45 z45Var = (z45) this.h;
                if (n55Var.e || n55Var.d) {
                    return;
                }
                iArr2[0] = 0;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                spannableStringBuilder.setSpan(new ya6(hl.L(80.0f), textView), 0, spannableStringBuilder.length(), 33);
                textView.setText(ob6.V(null, null, 2131742770, spannableStringBuilder));
                ao1Var.run();
                WalletEngine2 walletEngine2 = cVar4.b;
                if (walletEngine2 != null) {
                    walletEngine2.previewTonConnect(z45Var, new a45((Object) n55Var, (Object) iArr2, (Object) cVar4, (Object) textView, (Object) z45Var, (Object) ao1Var, (byte) 4));
                    return;
                }
                iArr2[0] = 3;
                textView.setText(ob6.M0(2131742617, null));
                ao1Var.run();
                return;
            case 15:
                vc6 vc6Var = (vc6) this.b;
                String str14 = (String) this.h;
                String str15 = (String) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = (TLRPC.TL_messageMediaVenue) this.e;
                Location location = (Location) this.f;
                id6.R.remove(vc6Var);
                vc6Var.K(str14, str15, tL_messageMediaVenue, tL_messageMediaVenue2, location);
                return;
            case 16:
                File file3 = (File) this.f;
                File file4 = (File) this.b;
                boolean[] zArr = (boolean[]) this.c;
                pcc pccVar3 = (pcc) this.d;
                id idVar3 = (id) this.e;
                boolean[] zArr2 = (boolean[]) this.h;
                String[] strArr2 = MediaController.W1;
                try {
                } catch (Exception e) {
                    e = e;
                    z = true;
                }
                try {
                } catch (Exception e2) {
                    e = e2;
                    z2 = false;
                    cc4.g(e, z);
                    z3 = z2;
                    if (z3) {
                    }
                    if (idVar3 != null) {
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    String p0 = hl.p0(0, "jpg");
                    ContentValues contentValues = new ContentValues();
                    Uri contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                    z = true;
                    contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                    contentValues.put("_display_name", p0);
                    contentValues.put("mime_type", "image/jpeg");
                    contentValues.put("mime_type", "image/jpeg");
                    Uri insert = a.b.getContentResolver().insert(contentUri, contentValues);
                    if (insert != null) {
                        OutputStream openOutputStream = a.b.getContentResolver().openOutputStream(insert);
                        if (openOutputStream != null) {
                            try {
                                MediaController.M0(file3, file4, openOutputStream, zArr);
                                z2 = !zArr[0];
                            } finally {
                            }
                        } else {
                            z2 = false;
                        }
                        if (openOutputStream != null) {
                            try {
                                openOutputStream.close();
                            } catch (Exception e3) {
                                e = e3;
                                cc4.g(e, z);
                                z3 = z2;
                                if (z3) {
                                }
                                if (idVar3 != null) {
                                }
                            }
                        }
                        if (z2) {
                            uri = insert;
                        } else {
                            try {
                                a.b.getContentResolver().delete(insert, null, null);
                            } catch (Exception unused) {
                            }
                        }
                        z3 = z2;
                        if (z3 && pccVar3 != null) {
                            hl.c3(new kn6(pccVar3, uri, b2));
                        }
                        if (idVar3 != null) {
                            hl.c3(new in6(idVar3, zArr2, (byte) 2));
                            return;
                        }
                        return;
                    }
                } else {
                    z = true;
                    File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                    file5.mkdirs();
                    File file6 = new File(file5, hl.p0(0, "jpg"));
                    if (!file6.exists()) {
                        file6.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file6);
                    try {
                        MediaController.M0(file3, file4, fileOutputStream, zArr);
                        fileOutputStream.close();
                        if (zArr[0]) {
                            file6.delete();
                        } else {
                            hl.d(file6.getAbsoluteFile());
                            uri = Uri.fromFile(file6);
                            z3 = true;
                            if (z3) {
                                hl.c3(new kn6(pccVar3, uri, b2));
                            }
                            if (idVar3 != null) {
                            }
                        }
                    } finally {
                    }
                }
                z3 = false;
                if (z3) {
                }
                if (idVar3 != null) {
                }
            case 17:
                k17 k17Var = (k17) this.c;
                String str16 = (String) this.h;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                uc7 uc7Var2 = (uc7) this.b;
                jf7 jf7Var = (jf7) this.f;
                r17 r17Var = k17Var.e;
                String str17 = r17Var.r0;
                if (str17 == null || !str17.equals(str16)) {
                    return;
                }
                if (tL_error3 == null) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                        TLRPC.User user2 = tL_contacts_resolvedPeer.users.get(0);
                        uc7Var2.i4(user2, false, false);
                        jf7Var.j1(tL_contacts_resolvedPeer.users, null, true, true);
                        user = user2;
                    }
                }
                r17Var.R(user);
                r17Var.u0 = 0;
                return;
            case 18:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                Context context = (Context) this.c;
                vnb vnbVar3 = (vnb) this.d;
                c51 c51Var2 = (c51) this.e;
                q61 q61Var = (q61) this.f;
                Runnable runnable = (Runnable) this.h;
                if (tL_error4 != null) {
                    new d31(o11.a(context), vnbVar3).g0(tL_error4, false);
                    return;
                }
                c51Var2.setLoading(false);
                q61Var.dismiss();
                bs2.v(null, 2131746682, new d31(o11.a(context), vnbVar3), R.raw.chats_infotip, 36);
                runnable.run();
                return;
            case 19:
                uc7 uc7Var3 = (uc7) this.b;
                id idVar4 = (id) this.c;
                dq1 dq1Var = (dq1) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                e eVar = (e) this.f;
                Bundle bundle = (Bundle) this.h;
                if (idVar4 != null) {
                    try {
                        idVar4.dismiss();
                    } catch (Exception e4) {
                        cc4.g(e4, true);
                    }
                }
                if (dq1Var != null) {
                    dq1Var.c(false);
                }
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject6;
                uc7Var3.j4(messages_messages.users, false);
                uc7Var3.c4(messages_messages.chats, false);
                uc7Var3.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                eVar.presentFragment(new zu1(bundle), true);
                return;
            case 20:
                ((b18) this.b).y1((TLRPC.TL_error) this.c, (String) this.h, (j08) this.d, (TLObject) this.e, (TL_account.sendVerifyPhoneCode) this.f);
                return;
            case 21:
                nb9 nb9Var = (nb9) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                byte[] bArr4 = (byte[]) this.f;
                String str18 = (String) this.h;
                ir1 ir1Var = nb9Var.l1;
                if ((ir1Var.getCurrentView() instanceof mb9) && (c51Var = ((mb9) ir1Var.getCurrentView()).s) != null) {
                    c51Var.setLoading(false);
                }
                if (tLObject7 == null) {
                    if (tL_error5 != null) {
                        if (!nb9Var.o1 && "MESSAGE_ID_REQUIRED".equals(tL_error5.text)) {
                            long j2 = nb9Var.t1;
                            String charSequence2 = charSequence.toString();
                            int i6 = zu1.Ad;
                            e S = LaunchActivity.S();
                            if (S != null) {
                                Bundle bundle2 = new Bundle();
                                if (wf3.D(j2)) {
                                    bundle2.putLong("user_id", j2);
                                } else {
                                    bundle2.putLong("chat_id", -j2);
                                }
                                bundle2.putString("reportTitle", charSequence2);
                                bundle2.putByteArray("reportOption", bArr4);
                                bundle2.putString("reportMessage", str18);
                                S.presentFragment(new zu1(bundle2));
                            }
                        } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error5.text)) {
                            jb9 jb9Var3 = nb9Var.u1;
                            if (jb9Var3 != null) {
                                jb9Var3.i();
                            }
                        } else if ("AD_EXPIRED".equals(tL_error5.text) && (jb9Var = nb9Var.u1) != null) {
                            jb9Var.d();
                        }
                        nb9Var.dismiss();
                        return;
                    }
                    return;
                }
                boolean z5 = tLObject7 instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
                if (!z5 && !(tLObject7 instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject7 instanceof TLRPC.TL_reportResultAddComment)) {
                    if (tLObject7 instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        uc7.s1(nb9Var.a).n0(false);
                        jb9 jb9Var4 = nb9Var.u1;
                        if (jb9Var4 != null) {
                            jb9Var4.f();
                            nb9Var.dismiss();
                            return;
                        }
                        return;
                    }
                    if (((tLObject7 instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject7 instanceof TLRPC.TL_reportResultReported)) && (jb9Var2 = nb9Var.u1) != null) {
                        jb9Var2.d();
                        nb9Var.dismiss();
                        return;
                    }
                    return;
                }
                ir1Var.F(ir1Var.b + 1);
                mb9 mb9Var = (mb9) ir1Var.getViewPages()[1];
                if (mb9Var != null) {
                    q9c q9cVar = mb9Var.f;
                    if (tLObject7 instanceof TLRPC.TL_reportResultChooseOption) {
                        mb9Var.b = null;
                        mb9Var.c = (TLRPC.TL_reportResultChooseOption) tLObject7;
                        mb9Var.d = null;
                        q9cVar.g3.O(false);
                    } else if (tLObject7 instanceof TLRPC.TL_reportResultAddComment) {
                        mb9Var.b((TLRPC.TL_reportResultAddComment) tLObject7);
                    } else if (z5) {
                        mb9Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject7;
                        mb9Var.c = null;
                        mb9Var.d = null;
                        q9cVar.g3.O(false);
                    }
                    if (charSequence != null) {
                        jo0 jo0Var = mb9Var.h;
                        ((TextView) jo0Var.b).setText(charSequence);
                        ((TextView) jo0Var.b).getText();
                        jo0Var.measure(View.MeasureSpec.makeMeasureSpec(hl.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(120.0f), TLObject.FLAG_31));
                        if (q9cVar != null) {
                            q9cVar.g3.O(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.b;
                Context context2 = (Context) this.c;
                vnb vnbVar4 = (vnb) this.d;
                byte[] bArr5 = (byte[]) this.e;
                e eVar2 = (e) this.f;
                en9 en9Var = (en9) this.h;
                nb9 nb9Var2 = new nb9(context2, vnbVar4, 0L, bArr5);
                nb9Var2.J0(tL_channels_sponsoredMessageReportResultChooseOption);
                nb9Var2.u1 = new u8a(eVar2, context2, vnbVar4, en9Var);
                nb9Var2.show();
                return;
            case 23:
                a();
                return;
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case 26:
                d();
                return;
            case 27:
                e();
                return;
            case 28:
                f();
                return;
            default:
                r7a r7aVar2 = (r7a) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.InputMedia inputMedia = (TLRPC.InputMedia) this.d;
                d7a d7aVar = (d7a) this.e;
                String str19 = (String) this.h;
                r47 r47Var3 = (r47) this.f;
                if (!(tLObject8 instanceof TLRPC.TL_messageMediaPhoto)) {
                    d7aVar.c();
                    return;
                }
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject8).photo;
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                if (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) {
                    inputMedia.flags |= 64;
                    inputMedia.video_cover = tL_inputPhoto;
                } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                    inputMedia.flags |= 8;
                    inputMedia.video_cover = tL_inputPhoto;
                }
                d7aVar.j = null;
                d7aVar.i = null;
                HashMap hashMap2 = d7aVar.E;
                if (hashMap2 != null) {
                    hashMap2.remove(str19 + "_ct");
                }
                int indexOf = d7aVar.x.indexOf(r47Var3);
                ArrayList arrayList14 = d7aVar.A;
                if (arrayList14 != null && indexOf >= 0 && indexOf < arrayList14.size()) {
                    TLRPC.InputMedia inputMedia2 = (TLRPC.InputMedia) d7aVar.A.get(indexOf);
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                        inputMedia2.flags |= 64;
                        inputMedia2.video_cover = tL_inputPhoto;
                    }
                }
                HashMap hashMap3 = d7aVar.E;
                if (hashMap3 != null) {
                    if (hashMap3.containsKey(str19 + "_t")) {
                        photoSize = (TLRPC.PhotoSize) d7aVar.E.get(str19 + "_t");
                    }
                }
                d7aVar.g = photoSize;
                if (inputMedia.thumb != null || photoSize == null || photoSize.location == null) {
                    r7aVar2.s0(d7aVar, false);
                    return;
                } else {
                    d7aVar.p = true;
                    r7aVar2.L(d7aVar, indexOf);
                    return;
                }
        }
    }

    public /* synthetic */ z87(rv0 rv0Var, File file, id idVar, String str, String str2, String str3) {
        this.a = (byte) 4;
        this.b = rv0Var;
        this.f = file;
        this.c = idVar;
        this.h = str;
        this.d = str2;
        this.e = str3;
    }

    public /* synthetic */ z87(fn7 fn7Var, Object obj, Object obj2, String str, TLObject tLObject, Object obj3, byte b) {
        this.a = b;
        this.b = fn7Var;
        this.c = obj;
        this.d = obj2;
        this.h = str;
        this.e = tLObject;
        this.f = obj3;
    }

    public /* synthetic */ z87(b18 b18Var, TLRPC.TL_error tL_error, String str, j08 j08Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = (byte) 20;
        this.b = b18Var;
        this.c = tL_error;
        this.h = str;
        this.d = j08Var;
        this.e = tLObject;
        this.f = sendverifyphonecode;
    }

    public /* synthetic */ z87(r7a r7aVar, TLObject tLObject, TLRPC.InputMedia inputMedia, d7a d7aVar, String str, r47 r47Var) {
        this.a = (byte) 29;
        this.b = r7aVar;
        this.c = tLObject;
        this.d = inputMedia;
        this.e = d7aVar;
        this.h = str;
        this.f = r47Var;
    }

    public /* synthetic */ z87(r7a r7aVar, TLRPC.TL_photo tL_photo, r47 r47Var, File file, d7a d7aVar, String str) {
        this.a = (byte) 28;
        this.b = r7aVar;
        this.c = tL_photo;
        this.d = r47Var;
        this.f = file;
        this.e = d7aVar;
        this.h = str;
    }

    public /* synthetic */ z87(File file, File file2, boolean[] zArr, pcc pccVar, id idVar, boolean[] zArr2) {
        this.a = (byte) 16;
        this.f = file;
        this.b = file2;
        this.c = zArr;
        this.d = pccVar;
        this.e = idVar;
        this.h = zArr2;
    }

    public /* synthetic */ z87(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public /* synthetic */ z87(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.h = str;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
