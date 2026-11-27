// default package

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y6a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ y6a(o24 o24Var, zo4 zo4Var, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z) {
        this.a = (byte) 8;
        this.c = o24Var;
        this.e = zo4Var;
        this.d = tLObject;
        this.f = stickerSet;
        this.h = document;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x040a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        ArrayList arrayList;
        LongSparseIntArray longSparseIntArray;
        zh6 zh6Var;
        zh6 zh6Var2;
        SparseIntArray sparseIntArray;
        zh6 zh6Var3;
        boolean z;
        int i;
        zh6 zh6Var4;
        ArrayList arrayList2;
        int i2;
        zh6 zh6Var5;
        long j;
        zh6 zh6Var6;
        y6a y6aVar = this;
        uc7 uc7Var = (uc7) y6aVar.c;
        TLRPC.TL_messages_dialogs tL_messages_dialogs = (TLRPC.TL_messages_dialogs) y6aVar.d;
        zh6 zh6Var7 = (zh6) y6aVar.e;
        zh6 zh6Var8 = (zh6) y6aVar.f;
        LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) y6aVar.h;
        ArrayList arrayList3 = uc7Var.y;
        SparseIntArray sparseIntArray2 = uc7Var.S1;
        zh6 zh6Var9 = uc7Var.S;
        zh6 zh6Var10 = uc7Var.T;
        SparseArray sparseArray = uc7Var.V;
        a5c a5cVar = uc7Var.i4;
        zh6 zh6Var11 = uc7Var.R;
        Long l = 0L;
        long j2 = 0;
        uc7Var.j4(tL_messages_dialogs.users, true);
        uc7Var.c4(tL_messages_dialogs.chats, true);
        int i3 = 0;
        while (i3 < zh6Var7.m()) {
            Long l2 = l;
            long j3 = zh6Var7.j(i3);
            if (f11.a) {
                longSparseIntArray = longSparseIntArray2;
                cc4.b("processDialogsUpdate " + j3);
            } else {
                longSparseIntArray = longSparseIntArray2;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) zh6Var7.n(i3);
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) zh6Var11.f(j3);
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = (ArrayList) zh6Var8.f(dialog.id);
            boolean z2 = y6aVar.b;
            if (dialog2 == null) {
                if (f11.a) {
                    cc4.b("processDialogsUpdate dialog null");
                }
                zh6Var = zh6Var7;
                sparseIntArray2.put(dialog.folder_id, sparseIntArray2.get(dialog.folder_id, 0) + 1);
                zh6Var11.k(j3, dialog);
                zh6Var9.k(j3, arrayList5);
                if (arrayList5 == null || arrayList5.size() <= 0) {
                    zh6Var2 = zh6Var8;
                    if (z2) {
                        uc7Var.J(dialog, null, j2);
                    }
                    if (f11.a) {
                        cc4.b("processDialogsUpdate new message is null");
                    }
                } else {
                    int i4 = 0;
                    while (i4 < arrayList5.size()) {
                        r47 r47Var = (r47) arrayList5.get(i4);
                        if (r47Var != null) {
                            zh6Var6 = zh6Var8;
                            if (r47Var.k.peer_id.channel_id == j2) {
                                sparseArray.put(r47Var.e1(), r47Var);
                                uc7Var.O = Math.min(uc7Var.O, r47Var.k.date);
                                long j4 = r47Var.k.random_id;
                                if (j4 != j2) {
                                    zh6Var10.k(j4, r47Var);
                                }
                            }
                        } else {
                            zh6Var6 = zh6Var8;
                        }
                        i4++;
                        zh6Var8 = zh6Var6;
                    }
                    zh6Var2 = zh6Var8;
                    if (f11.a) {
                        cc4.b("processDialogsUpdate new message not null");
                    }
                }
                if (a5cVar.u(j3)) {
                    a5cVar.d(j3);
                }
                sparseIntArray = sparseIntArray2;
                zh6Var4 = zh6Var9;
                i = i3;
            } else {
                zh6Var = zh6Var7;
                zh6Var2 = zh6Var8;
                if (f11.a) {
                    cc4.b("processDialogsUpdate dialog not null");
                }
                dialog2.unread_count = dialog.unread_count;
                int i5 = dialog2.unread_mentions_count;
                int i6 = dialog.unread_mentions_count;
                sparseIntArray = sparseIntArray2;
                if (i5 != i6) {
                    dialog2.unread_mentions_count = i6;
                    zh6 zh6Var12 = zh6Var9;
                    if (uc7Var.n0.contains(Long.valueOf(dialog2.id))) {
                        zh6Var3 = zh6Var12;
                        uc7Var.getNotificationCenter().k(jn7.e1, Long.valueOf(dialog2.id), l2, Integer.valueOf(dialog2.unread_mentions_count));
                    } else {
                        zh6Var3 = zh6Var12;
                    }
                } else {
                    zh6Var3 = zh6Var9;
                }
                int i7 = dialog2.unread_reactions_count;
                int i8 = dialog.unread_reactions_count;
                if (i7 != i8) {
                    dialog2.unread_reactions_count = i8;
                    uc7Var.getNotificationCenter().k(jn7.b5, Long.valueOf(dialog2.id), l2, Integer.valueOf(dialog2.unread_reactions_count), null);
                }
                int i9 = dialog2.unread_poll_votes_count;
                int i10 = dialog.unread_poll_votes_count;
                if (i9 != i10) {
                    dialog2.unread_poll_votes_count = i10;
                    uc7Var.getNotificationCenter().k(jn7.c5, Long.valueOf(dialog2.id), l2, Integer.valueOf(dialog2.unread_poll_votes_count), null);
                }
                zh6 zh6Var13 = zh6Var3;
                ArrayList arrayList6 = (ArrayList) zh6Var13.f(j3);
                for (int i11 = 0; arrayList6 != null && i11 < arrayList6.size(); i11++) {
                    if (arrayList6.get(i11) != null && ((r47) arrayList6.get(i11)).Z) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (f11.a) {
                    i = i3;
                    StringBuilder sb = new StringBuilder("processDialogsUpdate oldMsgs (count = ");
                    sb.append(arrayList6 == null ? "null" : Integer.valueOf(arrayList6.size()));
                    sb.append(") old top_message = ");
                    sb.append(dialog2.top_message);
                    sb.append(" new top_message = ");
                    sb.append(dialog.top_message);
                    sb.append("  unread_count =");
                    sb.append(dialog2.unread_count);
                    sb.append(" fromCache=");
                    sb.append(z2);
                    cc4.b(sb.toString());
                    cc4.b("processDialogsUpdate oldMsgDeleted " + z);
                } else {
                    i = i3;
                }
                if (arrayList6 == null || dialog2.top_message > 0) {
                    if (!z && dialog.top_message <= dialog2.top_message) {
                        if ((arrayList6 == null) == (arrayList5 == null) && (arrayList6 == null || arrayList5 == null || arrayList6.size() == arrayList5.size())) {
                            zh6Var4 = zh6Var13;
                            if (z2 && arrayList5 == null) {
                                j = 0;
                                uc7Var.J(dialog, null, 0L);
                                if (!f11.a) {
                                    cc4.b("processDialogsUpdate new messages are null");
                                }
                                i3 = i + 1;
                                y6aVar = this;
                                j2 = j;
                                l = l2;
                                longSparseIntArray2 = longSparseIntArray;
                                arrayList3 = arrayList4;
                                zh6Var7 = zh6Var;
                                zh6Var8 = zh6Var2;
                                sparseIntArray2 = sparseIntArray;
                                zh6Var9 = zh6Var4;
                            }
                        }
                    }
                    zh6Var11.k(j3, dialog);
                    zh6Var13.k(j3, arrayList5);
                    int i12 = 0;
                    while (arrayList6 != null && i12 < arrayList6.size()) {
                        r47 r47Var2 = (r47) arrayList6.get(i12);
                        if (r47Var2 != null) {
                            i2 = i12;
                            zh6Var5 = zh6Var13;
                            if (r47Var2.k.peer_id.channel_id == 0) {
                                sparseArray.remove(r47Var2.e1());
                                long j5 = r47Var2.k.random_id;
                                if (j5 != 0) {
                                    zh6Var10.l(j5);
                                }
                            }
                        } else {
                            i2 = i12;
                            zh6Var5 = zh6Var13;
                        }
                        i12 = i2 + 1;
                        zh6Var13 = zh6Var5;
                    }
                    zh6Var4 = zh6Var13;
                    if (arrayList5 != null) {
                        int i13 = 0;
                        while (i13 < arrayList5.size()) {
                            r47 r47Var3 = (r47) arrayList5.get(i13);
                            int i14 = 0;
                            while (arrayList6 != null && i14 < arrayList6.size()) {
                                r47 r47Var4 = (r47) arrayList6.get(i14);
                                if (r47Var4 != null) {
                                    arrayList2 = arrayList6;
                                    if (r47Var4.e1() == r47Var3.e1()) {
                                        r47Var3.Z = r47Var4.Z;
                                        break;
                                    }
                                } else {
                                    arrayList2 = arrayList6;
                                }
                                i14++;
                                arrayList6 = arrayList2;
                            }
                            arrayList2 = arrayList6;
                            if (r47Var3 != null && r47Var3.k.peer_id.channel_id == 0) {
                                sparseArray.put(r47Var3.e1(), r47Var3);
                                uc7Var.O = Math.min(uc7Var.O, r47Var3.k.date);
                                long j6 = r47Var3.k.random_id;
                                if (j6 != 0) {
                                    zh6Var10.k(j6, r47Var3);
                                }
                            }
                            i13++;
                            arrayList6 = arrayList2;
                        }
                    }
                    if (a5cVar.u(j3)) {
                        a5cVar.d(j3);
                    }
                    if (z2) {
                        j = 0;
                        uc7Var.J(dialog, null, 0L);
                        if (!f11.a) {
                        }
                        i3 = i + 1;
                        y6aVar = this;
                        j2 = j;
                        l = l2;
                        longSparseIntArray2 = longSparseIntArray;
                        arrayList3 = arrayList4;
                        zh6Var7 = zh6Var;
                        zh6Var8 = zh6Var2;
                        sparseIntArray2 = sparseIntArray;
                        zh6Var9 = zh6Var4;
                    }
                } else {
                    if (z || uc7.D3(arrayList5) > uc7.D3(arrayList6)) {
                        zh6Var11.k(j3, dialog);
                        zh6Var13.k(j3, arrayList5);
                        for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                            r47 r47Var5 = (r47) arrayList6.get(i15);
                            if (r47Var5 != null && r47Var5.k.peer_id.channel_id == 0) {
                                sparseArray.remove(r47Var5.e1());
                            }
                        }
                        if (arrayList5 != null) {
                            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                                r47 r47Var6 = (r47) arrayList5.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList6.size()) {
                                        break;
                                    }
                                    r47 r47Var7 = (r47) arrayList6.get(i17);
                                    if (r47Var7 != null && r47Var7.e1() == r47Var6.e1()) {
                                        r47Var6.Z = r47Var7.Z;
                                        break;
                                    }
                                    i17++;
                                }
                                if (r47Var6 != null && r47Var6.k.peer_id.channel_id == 0) {
                                    sparseArray.put(r47Var6.e1(), r47Var6);
                                    uc7Var.O = Math.min(uc7Var.O, r47Var6.k.date);
                                    long j7 = r47Var6.k.random_id;
                                    if (j7 != 0) {
                                        zh6Var10.k(j7, r47Var6);
                                    }
                                }
                            }
                        }
                        for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                            long j8 = ((r47) arrayList6.get(i18)).k.random_id;
                            if (j8 != 0) {
                                zh6Var10.l(j8);
                            }
                        }
                        if (a5cVar.u(j3)) {
                            a5cVar.d(j3);
                        }
                    }
                    zh6Var4 = zh6Var13;
                }
            }
            j = 0;
            i3 = i + 1;
            y6aVar = this;
            j2 = j;
            l = l2;
            longSparseIntArray2 = longSparseIntArray;
            arrayList3 = arrayList4;
            zh6Var7 = zh6Var;
            zh6Var8 = zh6Var2;
            sparseIntArray2 = sparseIntArray;
            zh6Var9 = zh6Var4;
        }
        LongSparseIntArray longSparseIntArray3 = longSparseIntArray2;
        ArrayList arrayList7 = arrayList3;
        arrayList7.clear();
        int m = zh6Var11.m();
        int i19 = 0;
        while (i19 < m) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) zh6Var11.n(i19);
            if (uc7Var.u0.h(dialog3.id) >= 0) {
                arrayList = arrayList7;
            } else {
                arrayList = arrayList7;
                arrayList.add(dialog3);
            }
            i19++;
            arrayList7 = arrayList;
        }
        uc7Var.h5(null);
        uc7Var.getNotificationCenter().k(jn7.r, new Object[0]);
        uc7Var.getNotificationsController().J(longSparseIntArray3);
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03cf A[Catch: all -> 0x03d5, TRY_LEAVE, TryCatch #7 {all -> 0x03d5, blocks: (B:158:0x03c7, B:160:0x03cf), top: B:157:0x03c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0462  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        File file;
        boolean z;
        boolean renameTo;
        boolean z2;
        String str;
        String str2;
        Bitmap bitmap;
        char c;
        byte b = 5;
        char c2 = '\b';
        byte b2 = 3;
        boolean z3 = true;
        char c3 = 1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                r7a r7aVar = (r7a) this.c;
                TLObject tLObject = (TLObject) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                zu1 zu1Var = (zu1) this.f;
                String str3 = (String) this.h;
                boolean z4 = this.b;
                if (tLObject == null) {
                    jj.n0(zu1Var, str3, false, z4);
                    return;
                }
                if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                    uq7.b(false, r7aVar.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, null);
                    return;
                } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                    uq7.b(false, r7aVar.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, null);
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                        jj.n0(zu1Var, str3, false, z4);
                        return;
                    }
                    return;
                }
            case 1:
                ((CameraController) this.c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f, this.b, (Runnable) this.h);
                return;
            case 2:
                ij1 ij1Var = (ij1) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                Activity activity = (Activity) this.h;
                boolean z5 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error == null) {
                    twoStepVerificationActivity.s0();
                    twoStepVerificationActivity.finishFragment();
                    if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        m01.u(ij1Var.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject2).url);
                        if (z5) {
                            ij1Var.I(true);
                        }
                    }
                    ij1Var.K();
                    return;
                }
                if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(ij1Var.o0).sendRequest(new TL_account.getPassword(), new vi1((Object) ij1Var, (Object) twoStepVerificationActivity, z5, (byte) 0), 8);
                        return;
                    }
                    twoStepVerificationActivity.s0();
                    twoStepVerificationActivity.finishFragment();
                    d31.e0(tL_error);
                    return;
                }
                twoStepVerificationActivity.s0();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                alertDialog$Builder.a.S = ob6.M0(2131751262, null);
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setPadding(hl.L(24.0f), hl.L(2.0f), hl.L(24.0f), 0);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                TextView textView = new TextView(activity);
                int i3 = aob.j5;
                yob.X(textView, i3, null);
                textView.setTextSize(1, 16.0f);
                textView.setGravity((ob6.a0 ? 5 : 3) | 48);
                textView.setText(hl.S2(ob6.M0(2131742495, null)));
                linearLayout.addView(textView, tre.o(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(activity);
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView = new ImageView(activity);
                imageView.setImageResource(R.drawable.list_circle);
                imageView.setPadding(ob6.a0 ? hl.L(11.0f) : 0, hl.L(9.0f), ob6.a0 ? 0 : hl.L(11.0f), 0);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                yob.s(imageView, i3, null, mode);
                TextView textView2 = new TextView(activity);
                yob.X(textView2, i3, null);
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
                LinearLayout m = bs2.m(activity, 0);
                linearLayout.addView(m, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView2 = new ImageView(activity);
                imageView2.setImageResource(R.drawable.list_circle);
                imageView2.setPadding(ob6.a0 ? hl.L(11.0f) : 0, hl.L(9.0f), ob6.a0 ? 0 : hl.L(11.0f), 0);
                yob.s(imageView2, i3, null, mode);
                TextView textView3 = new TextView(activity);
                yob.X(textView3, i3, null);
                textView3.setTextSize(1, 16.0f);
                textView3.setGravity((ob6.a0 ? 5 : 3) | 48);
                textView3.setText(hl.S2(ob6.M0(2131751264, null)));
                if (ob6.a0) {
                    m.addView(textView3, tre.o(-1, -2));
                    i = 5;
                    m.addView(imageView2, tre.r(-2, -2, 5));
                } else {
                    i = 5;
                    m.addView(imageView2, tre.o(-2, -2));
                    m.addView(textView3, tre.o(-1, -2));
                }
                if ("PASSWORD_MISSING".equals(tL_error.text)) {
                    alertDialog$Builder.j(ob6.M0(2131751256, null), new mi1(ij1Var));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                } else {
                    TextView textView4 = new TextView(activity);
                    yob.X(textView4, i3, null);
                    textView4.setTextSize(1, 16.0f);
                    uh9.q(textView4, (ob6.a0 ? i : 3) | 48, null, 2131751263);
                    linearLayout.addView(textView4, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    alertDialog$Builder.g(ob6.M0(2131747558, null), null);
                }
                twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
                return;
            case 3:
                ((zu1) this.f).Z8((wb2) this.c, this.b, (String) this.h, (TLRPC.User[]) this.d, (CharacterStyle) this.e);
                return;
            case 4:
                zu1 zu1Var2 = (zu1) this.f;
                id idVar = (id) this.c;
                boolean[] zArr = (boolean[]) this.d;
                boolean z6 = this.b;
                r47 r47Var = (r47) this.e;
                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) this.h;
                try {
                    idVar.dismiss();
                } catch (Throwable unused) {
                }
                if (zArr[0]) {
                    return;
                }
                if (z6) {
                    zu1Var2.createArticleViewer(false).L(r47Var, tL_webPage, null, null);
                    return;
                }
                try {
                    hl.r2(r47Var, zu1Var2.getParentActivity(), zu1Var2.Ba, false);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    zu1Var2.F4(r47Var);
                    return;
                }
            case 5:
                s92 s92Var = (s92) this.c;
                TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = (TLRPC.TL_channels_toggleUsername) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f;
                boolean z7 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                u92 u92Var = s92Var.a;
                v92 v92Var = u92Var.i3;
                v92Var.Q.remove(tL_channels_toggleUsername.username);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    u92Var.A1(tL_username, !z7, false);
                } else if (tL_error2 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    u92Var.A1(tL_username, z7, true);
                    v92Var.a0();
                } else {
                    hl.c3(new ds6((Object) s92Var, (Object) tL_username, z7, (byte) 14));
                }
                v92Var.getMessagesController().H5(v92Var.Y, tL_username.username, tL_username.active);
                return;
            case 6:
                lv2 lv2Var = (lv2) this.c;
                boolean z8 = this.b;
                ArrayList arrayList = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                HashMap hashMap2 = (HashMap) this.f;
                ArrayList arrayList2 = (ArrayList) this.h;
                if (z8) {
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        TLRPC.User X1 = lv2Var.getMessagesController().X1(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i4)).user_id));
                        if (X1 != null && !TextUtils.isEmpty(X1.phone)) {
                            String str4 = X1.phone;
                            iv2 iv2Var = (iv2) hashMap.get(str4.substring(Math.max(0, str4.length() - 7)));
                            if (iv2Var == null) {
                                String a = iv2.a(X1.first_name, X1.last_name);
                                ArrayList arrayList3 = (ArrayList) hashMap2.get(a);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    hashMap2.put(a, arrayList3);
                                    arrayList2.add(a);
                                }
                                arrayList3.add(X1);
                            } else if (iv2Var.m == null) {
                                iv2Var.m = X1;
                            }
                        }
                    }
                }
                Collator u = lv2.u();
                Iterator it = hashMap2.values().iterator();
                while (it.hasNext()) {
                    Collections.sort((ArrayList) it.next(), new kn0(u, b2));
                }
                Collections.sort(arrayList2, new kn0(u, (byte) 4));
                hl.c3(new xu2(lv2Var, arrayList2, hashMap, hashMap2));
                return;
            case 7:
                j13 j13Var = (j13) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                c51 c51Var = (c51) this.e;
                boolean z9 = this.b;
                HashSet hashSet = (HashSet) this.f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                if (!(tLObject4 instanceof TLRPC.Updates)) {
                    if (!(tLObject4 instanceof TL_phone.groupCall)) {
                        if (tL_error3 != null) {
                            ik8.u(j13Var.F, j13Var.J0, tL_error3, false);
                            return;
                        }
                        return;
                    }
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    uc7.s1(j13Var.a).j4(groupcall.users, false);
                    uc7.s1(j13Var.a).c4(groupcall.chats, false);
                    if (LaunchActivity.H1 == null) {
                        j13Var.X1 = false;
                        c51Var.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall = groupcall.call;
                    tL_inputGroupCall.id = groupCall.id;
                    tL_inputGroupCall.access_hash = groupCall.access_hash;
                    j13Var.dismiss();
                    xkc.g(LaunchActivity.H1, j13Var.a, tL_inputGroupCall, z9, groupcall.call, hashSet);
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                uc7.s1(j13Var.a).j4(updates.users, false);
                uc7.s1(j13Var.a).c4(updates.chats, false);
                ArrayList y0 = uc7.y0(updates, TL_update.TL_updateGroupCall.class);
                int size2 = y0.size();
                int i5 = 0;
                TLRPC.GroupCall groupCall2 = null;
                while (i5 < size2) {
                    Object obj = y0.get(i5);
                    i5++;
                    groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
                }
                Utilities.d.c(new bv2((Object) j13Var, (Object) updates, (byte) 10));
                if (groupCall2 == null || LaunchActivity.H1 == null) {
                    j13Var.X1 = false;
                    c51Var.setLoading(false);
                    return;
                }
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall2.id = groupCall2.id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                j13Var.dismiss();
                xkc.g(LaunchActivity.H1, j13Var.a, tL_inputGroupCall2, z9, groupCall2, hashSet);
                return;
            case 8:
                ((o24) this.c).I((zo4) this.e, (TLObject) this.d, (TLRPC.StickerSet) this.f, (TLRPC.Document) this.h, this.b, true);
                return;
            case 9:
                hb4 hb4Var = (hb4) this.c;
                File file2 = (File) this.d;
                File file3 = (File) this.e;
                File file4 = (File) this.f;
                File file5 = (File) this.h;
                boolean z10 = this.b;
                if (file2 != null) {
                    file2.delete();
                }
                if (file3 != null) {
                    file3.delete();
                }
                if (file4 != null) {
                    file4.delete();
                }
                if (file5 != null) {
                    if (hb4Var.a1) {
                        try {
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file5));
                            xb4.o(gZIPInputStream, hb4Var.K0);
                            gZIPInputStream.close();
                            file5.delete();
                            file = hb4Var.K0;
                            try {
                                hb4Var.a1 = false;
                            } catch (ZipException unused2) {
                                file5 = file;
                                z = false;
                                hb4Var.a1 = z;
                                if (hb4Var.a1) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                Typeface typeface = hl.a;
                                cc4.g(th, !((th instanceof FileNotFoundException) || (th instanceof EOFException)));
                                if (f11.a) {
                                    cc4.d("unable to ungzip temp = " + file5 + " to final = " + hb4Var.L0);
                                }
                                file5 = file;
                                if (hb4Var.a1) {
                                }
                            }
                        } catch (ZipException unused3) {
                            z = false;
                        } catch (Throwable th2) {
                            th = th2;
                            file = file5;
                        }
                        file5 = file;
                    }
                    if (hb4Var.a1) {
                        Utilities.d.c(new xa4(hb4Var, b));
                        return;
                    }
                    if (hb4Var.p0 instanceof TLRPC.TL_theme) {
                        try {
                            renameTo = hl.E(file5, hb4Var.L0);
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                            z2 = false;
                            if (!z2) {
                                try {
                                    z2 = hl.E(file5, hb4Var.L0);
                                    if (z2) {
                                    }
                                } catch (Throwable th3) {
                                    cc4.g(th3, true);
                                }
                            }
                            if (z2) {
                            }
                            Utilities.d.c(new cb4(hb4Var, z10, c3 == true ? 1 : 0));
                            return;
                        }
                    } else {
                        try {
                            if (hb4Var.c1 != null) {
                                synchronized (hb4.m1) {
                                    try {
                                        hb4Var.L0 = new File(hb4Var.T0, hb4Var.s);
                                        int i6 = 1;
                                        while (hb4Var.L0.exists()) {
                                            int lastIndexOf = hb4Var.s.lastIndexOf(46);
                                            hb4Var.L0 = new File(hb4Var.T0, lastIndexOf > 0 ? hb4Var.s.substring(0, lastIndexOf) + " (" + i6 + ")" + hb4Var.s.substring(lastIndexOf) : hb4Var.s + " (" + i6 + ")");
                                            i6++;
                                        }
                                    } finally {
                                    }
                                }
                            }
                            renameTo = file5.renameTo(hb4Var.L0);
                        } catch (Exception e3) {
                            cc4.g(e3, true);
                            z2 = false;
                            if (!z2) {
                            }
                            if (z2) {
                            }
                            Utilities.d.c(new cb4(hb4Var, z10, c3 == true ? 1 : 0));
                            return;
                        }
                    }
                    z2 = renameTo;
                    if (!z2 && hb4Var.m0 == 3) {
                        z2 = hl.E(file5, hb4Var.L0);
                        if (z2) {
                            hb4Var.L0.delete();
                        }
                    }
                    if (z2) {
                        hb4Var.O0 = true;
                        if (hb4Var.c1 != null && hb4Var.L0.exists()) {
                            vb4 vb4Var = hb4Var.g0;
                            xx xxVar = hb4Var.c1;
                            File file6 = hb4Var.L0;
                            ic4 ic4Var = vb4Var.e.d;
                            long j = xxVar.b;
                            int i7 = xxVar.c;
                            byte b3 = xxVar.d;
                            String file7 = file6 != null ? file6.toString() : null;
                            ic4Var.getClass();
                            ic4Var.h(new gc4(ic4Var, j, i7, b3, file7, 0));
                        }
                    } else {
                        if (f11.a) {
                            cc4.d("unable to rename temp = " + file5 + " to final = " + hb4Var.L0 + " retry = " + hb4Var.m0);
                        }
                        int i8 = hb4Var.m0 + 1;
                        hb4Var.m0 = i8;
                        if (i8 < 3) {
                            hb4Var.Y = (byte) 1;
                            Utilities.d.d(new cb4(hb4Var, z10, (byte) 0), 200L);
                            return;
                        } else {
                            hb4Var.L0 = file5;
                            hb4Var.O0 = false;
                        }
                    }
                }
                Utilities.d.c(new cb4(hb4Var, z10, c3 == true ? 1 : 0));
                return;
            case 10:
                f07 f07Var = (f07) this.c;
                Pair pair = (Pair) this.d;
                f07Var.b.i.w(((Integer) pair.first).intValue(), (vz6) pair.second, (ja6) this.e, (jt6) this.f, (IOException) this.h, this.b);
                return;
            case 11:
                a();
                return;
            case 12:
                wua wuaVar = (wua) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                s45 s45Var = (s45) this.f;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) this.h;
                boolean z11 = this.b;
                TLObject tLObject5 = (TLObject) this.d;
                long j2 = wuaVar.S1;
                if (wuaVar.getContext() != null) {
                    if (tL_error4 != null && s45Var != null && tL_error4.text.startsWith("TMP_PASSWORD")) {
                        s45Var.a(Boolean.TRUE);
                        return;
                    }
                    if (s45Var != null) {
                        s45Var.a(Boolean.FALSE);
                    }
                    if (tL_error4 != null) {
                        wuaVar.Q1(tL_error4, twoStepVerificationActivity2, z11);
                        return;
                    }
                    if (twoStepVerificationActivity2 != null) {
                        twoStepVerificationActivity2.s0();
                        twoStepVerificationActivity2.finishFragment();
                    }
                    if (tLObject5 instanceof TL_stars.starGiftWithdrawalUrl) {
                        m01.w(wuaVar.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject5).url, false);
                        return;
                    }
                    if (!(tLObject5 instanceof TLRPC.TL_boolTrue)) {
                        if (tLObject5 instanceof TLRPC.TL_boolFalse) {
                            d31.c0("NULL_ERROR");
                            return;
                        }
                        return;
                    }
                    TL_stars.TL_starGiftUnique B1 = wuaVar.B1();
                    c C = c.C(wuaVar.a);
                    if (B1 != null) {
                        str = B1.gift_address;
                        str2 = B1.slug;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    a25 a25Var = C.B;
                    hl.r(a25Var);
                    C.y = str;
                    C.z = str2;
                    C.A = 0;
                    C.A().d();
                    C.G().g();
                    C.J();
                    int i9 = C.A;
                    long[] jArr = c.U;
                    if (i9 < 7) {
                        C.A = i9 + 1;
                        hl.d3(a25Var, jArr[i9]);
                    }
                    long e4 = yac.h(wuaVar.a).e();
                    jxa.v(wuaVar.a, false).M(e4);
                    if (j2 != 0 && j2 != e4) {
                        jxa.v(wuaVar.a, false).M(j2);
                    }
                    if (B1 != null && !TextUtils.isEmpty(B1.slug)) {
                        int i10 = wuaVar.a;
                        String str5 = B1.slug;
                        HashMap hashMap3 = it7.a;
                        if (!TextUtils.isEmpty(str5)) {
                            hl.d3(new no1(i10, 0, str5, z3), it7.c[0]);
                        }
                        hl.c3(new jr9(new pg6((byte) 29), B1.getDocument(), ob6.M0(2131750060, null)));
                    }
                    wuaVar.dismiss();
                    return;
                }
                return;
            default:
                vsc vscVar = (vsc) this.c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.e;
                int[] iArr3 = (int[]) this.f;
                int[] iArr4 = (int[]) this.h;
                boolean z12 = this.b;
                uo3 uo3Var = ruc.a;
                int i11 = 0;
                while (true) {
                    int i12 = jn7.J4;
                    if (i11 >= 288) {
                        int i13 = 0;
                        while (i13 < 288) {
                            for (int i14 = i2; i14 < 288; i14++) {
                                iArr4[i14] = iArr3[(i14 * jn7.K4) + i13];
                            }
                            int i15 = i2;
                            while (i15 < 288) {
                                int min = Math.min(i12, i15 + 8);
                                int i16 = 128;
                                for (int max = Math.max(i2, i15 - 8); max <= min; max++) {
                                    int i17 = iArr4[max];
                                    if (i17 < 8) {
                                        int i18 = max - i15;
                                        int i19 = (i18 * i18) + (i17 * i17);
                                        if (i19 < i16) {
                                            i16 = i19;
                                        }
                                    }
                                }
                                iArr3[(i15 * jn7.K4) + i13] = ruc.b[i16];
                                i15++;
                                i2 = 0;
                                i12 = jn7.J4;
                            }
                            i13++;
                            i2 = 0;
                            i12 = jn7.J4;
                        }
                        int i20 = 0;
                        while (i20 < 82944) {
                            int i21 = iArr[i20];
                            int i22 = i21 >>> 24;
                            int max2 = Math.max(iArr3[i20], i22);
                            if (i22 != 255) {
                                if (i22 == 0) {
                                    i21 = 16777215 | (max2 << 24);
                                } else {
                                    int i23 = ((255 - i22) * max2) / jn7.d4;
                                    int i24 = i22 + i23;
                                    int i25 = ((i21 >> 16) & jn7.d4) * i22;
                                    int i26 = i23 * jn7.d4;
                                    c = c2;
                                    i21 = ((((i21 & jn7.d4) * i22) + i26) / i24) | (i24 << 24) | (((i25 + i26) / i24) << 16) | ((((((i21 >> 8) & jn7.d4) * i22) + i26) / i24) << 8);
                                    iArr2[i20] = i21;
                                    i20++;
                                    c2 = c;
                                }
                            }
                            c = c2;
                            iArr2[i20] = i21;
                            i20++;
                            c2 = c;
                        }
                        if (z12) {
                            int i27 = 0;
                            for (int i28 = 0; i28 < 82944; i28 += 7) {
                                if ((iArr2[i28] >>> 24) > 0) {
                                    i27++;
                                }
                            }
                            if (i27 > 592) {
                                Bitmap createBitmap = Bitmap.createBitmap(iArr2, jn7.K4, jn7.K4, Bitmap.Config.ARGB_8888);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 128, 128, true);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                bitmap = Bitmap.createBitmap(jn7.F2, jn7.F2, Bitmap.Config.ALPHA_8);
                                Paint paint = new Paint(1);
                                paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                                new Canvas(bitmap).drawBitmap(extractAlpha, 24.0f, 24.0f, paint);
                                createBitmap.recycle();
                                createScaledBitmap.recycle();
                                extractAlpha.recycle();
                                hl.c3(new b6c(vscVar, iArr2, bitmap, (byte) 27));
                                return;
                            }
                        }
                        bitmap = null;
                        hl.c3(new b6c(vscVar, iArr2, bitmap, (byte) 27));
                        return;
                    }
                    int i29 = i11 * jn7.K4;
                    int i30 = 8;
                    for (int i31 = 0; i31 < 288; i31++) {
                        int i32 = i29 + i31;
                        i30 = (iArr[i32] >>> 24) >= 128 ? 0 : Math.min(i30 + 1, 8);
                        iArr3[i32] = i30;
                    }
                    int i33 = 8;
                    while (i12 >= 0) {
                        int i34 = i29 + i12;
                        i33 = iArr3[i34] == 0 ? 0 : Math.min(i33 + 1, 8);
                        if (i33 < iArr3[i34]) {
                            iArr3[i34] = i33;
                        }
                        i12--;
                    }
                    i11++;
                }
        }
    }

    public /* synthetic */ y6a(zu1 zu1Var, wb2 wb2Var, boolean z, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.a = (byte) 3;
        this.f = zu1Var;
        this.c = wb2Var;
        this.b = z;
        this.h = str;
        this.d = userArr;
        this.e = characterStyle;
    }

    public /* synthetic */ y6a(s92 s92Var, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z, TLRPC.TL_error tL_error) {
        this.a = (byte) 5;
        this.c = s92Var;
        this.e = tL_channels_toggleUsername;
        this.d = tLObject;
        this.f = tL_username;
        this.b = z;
        this.h = tL_error;
    }

    public /* synthetic */ y6a(lv2 lv2Var, boolean z, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = (byte) 6;
        this.c = lv2Var;
        this.b = z;
        this.d = arrayList;
        this.e = hashMap;
        this.f = hashMap2;
        this.h = arrayList2;
    }

    public /* synthetic */ y6a(j13 j13Var, TLObject tLObject, c51 c51Var, boolean z, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.a = (byte) 7;
        this.c = j13Var;
        this.d = tLObject;
        this.e = c51Var;
        this.b = z;
        this.f = hashSet;
        this.h = tL_error;
    }

    public /* synthetic */ y6a(zu1 zu1Var, id idVar, boolean[] zArr, boolean z, r47 r47Var, TLRPC.TL_webPage tL_webPage) {
        this.a = (byte) 4;
        this.f = zu1Var;
        this.c = idVar;
        this.d = zArr;
        this.b = z;
        this.e = r47Var;
        this.h = tL_webPage;
    }

    public /* synthetic */ y6a(KeyEvent.Callback callback, TLRPC.TL_error tL_error, Object obj, Object obj2, boolean z, TLObject tLObject, byte b) {
        this.a = b;
        this.c = callback;
        this.e = tL_error;
        this.f = obj;
        this.h = obj2;
        this.b = z;
        this.d = tLObject;
    }

    public /* synthetic */ y6a(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = serializable;
        this.b = z;
    }

    public /* synthetic */ y6a(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
        this.h = obj5;
    }
}
