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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class z2a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ z2a(t14 t14Var, um4 um4Var, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z) {
        this.a = (byte) 8;
        this.c = t14Var;
        this.e = um4Var;
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
        vf6 vf6Var;
        vf6 vf6Var2;
        SparseIntArray sparseIntArray;
        vf6 vf6Var3;
        boolean z;
        int i;
        vf6 vf6Var4;
        ArrayList arrayList2;
        int i2;
        vf6 vf6Var5;
        long j;
        vf6 vf6Var6;
        z2a z2aVar = this;
        na7 na7Var = (na7) z2aVar.c;
        TLRPC.TL_messages_dialogs tL_messages_dialogs = (TLRPC.TL_messages_dialogs) z2aVar.d;
        vf6 vf6Var7 = (vf6) z2aVar.e;
        vf6 vf6Var8 = (vf6) z2aVar.f;
        LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) z2aVar.h;
        ArrayList arrayList3 = na7Var.y;
        SparseIntArray sparseIntArray2 = na7Var.S1;
        vf6 vf6Var9 = na7Var.S;
        vf6 vf6Var10 = na7Var.T;
        SparseArray sparseArray = na7Var.V;
        b1c b1cVar = na7Var.i4;
        vf6 vf6Var11 = na7Var.R;
        Long l = 0L;
        long j2 = 0;
        na7Var.b4(tL_messages_dialogs.users, true);
        na7Var.V3(tL_messages_dialogs.chats, true);
        int i3 = 0;
        while (i3 < vf6Var7.m()) {
            Long l2 = l;
            long j3 = vf6Var7.j(i3);
            if (w01.a) {
                longSparseIntArray = longSparseIntArray2;
                fa4.b("processDialogsUpdate " + j3);
            } else {
                longSparseIntArray = longSparseIntArray2;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) vf6Var7.n(i3);
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) vf6Var11.f(j3);
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = (ArrayList) vf6Var8.f(dialog.id);
            boolean z2 = z2aVar.b;
            if (dialog2 == null) {
                if (w01.a) {
                    fa4.b("processDialogsUpdate dialog null");
                }
                vf6Var = vf6Var7;
                sparseIntArray2.put(dialog.folder_id, sparseIntArray2.get(dialog.folder_id, 0) + 1);
                vf6Var11.k(dialog, j3);
                vf6Var9.k(arrayList5, j3);
                if (arrayList5 == null || arrayList5.size() <= 0) {
                    vf6Var2 = vf6Var8;
                    if (z2) {
                        na7Var.H(dialog, null, j2);
                    }
                    if (w01.a) {
                        fa4.b("processDialogsUpdate new message is null");
                    }
                } else {
                    int i4 = 0;
                    while (i4 < arrayList5.size()) {
                        k27 k27Var = (k27) arrayList5.get(i4);
                        if (k27Var != null) {
                            vf6Var6 = vf6Var8;
                            if (k27Var.k.peer_id.channel_id == j2) {
                                sparseArray.put(k27Var.e1(), k27Var);
                                na7Var.O = Math.min(na7Var.O, k27Var.k.date);
                                long j4 = k27Var.k.random_id;
                                if (j4 != j2) {
                                    vf6Var10.k(k27Var, j4);
                                }
                            }
                        } else {
                            vf6Var6 = vf6Var8;
                        }
                        i4++;
                        vf6Var8 = vf6Var6;
                    }
                    vf6Var2 = vf6Var8;
                    if (w01.a) {
                        fa4.b("processDialogsUpdate new message not null");
                    }
                }
                if (b1cVar.u(j3)) {
                    b1cVar.d(j3);
                }
                sparseIntArray = sparseIntArray2;
                vf6Var4 = vf6Var9;
                i = i3;
            } else {
                vf6Var = vf6Var7;
                vf6Var2 = vf6Var8;
                if (w01.a) {
                    fa4.b("processDialogsUpdate dialog not null");
                }
                dialog2.unread_count = dialog.unread_count;
                int i5 = dialog2.unread_mentions_count;
                int i6 = dialog.unread_mentions_count;
                sparseIntArray = sparseIntArray2;
                if (i5 != i6) {
                    dialog2.unread_mentions_count = i6;
                    vf6 vf6Var12 = vf6Var9;
                    if (na7Var.n0.contains(Long.valueOf(dialog2.id))) {
                        vf6Var3 = vf6Var12;
                        na7Var.getNotificationCenter().k(kk7.d1, Long.valueOf(dialog2.id), l2, Integer.valueOf(dialog2.unread_mentions_count));
                    } else {
                        vf6Var3 = vf6Var12;
                    }
                } else {
                    vf6Var3 = vf6Var9;
                }
                int i7 = dialog2.unread_reactions_count;
                int i8 = dialog.unread_reactions_count;
                if (i7 != i8) {
                    dialog2.unread_reactions_count = i8;
                    na7Var.getNotificationCenter().k(kk7.a5, Long.valueOf(dialog2.id), l2, Integer.valueOf(dialog2.unread_reactions_count), null);
                }
                int i9 = dialog2.unread_poll_votes_count;
                int i10 = dialog.unread_poll_votes_count;
                if (i9 != i10) {
                    dialog2.unread_poll_votes_count = i10;
                    na7Var.getNotificationCenter().k(kk7.b5, Long.valueOf(dialog2.id), l2, Integer.valueOf(dialog2.unread_poll_votes_count), null);
                }
                vf6 vf6Var13 = vf6Var3;
                ArrayList arrayList6 = (ArrayList) vf6Var13.f(j3);
                for (int i11 = 0; arrayList6 != null && i11 < arrayList6.size(); i11++) {
                    if (arrayList6.get(i11) != null && ((k27) arrayList6.get(i11)).Z) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (w01.a) {
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
                    fa4.b(sb.toString());
                    fa4.b("processDialogsUpdate oldMsgDeleted " + z);
                } else {
                    i = i3;
                }
                if (arrayList6 == null || dialog2.top_message > 0) {
                    if (!z && dialog.top_message <= dialog2.top_message) {
                        if ((arrayList6 == null) == (arrayList5 == null) && (arrayList6 == null || arrayList5 == null || arrayList6.size() == arrayList5.size())) {
                            vf6Var4 = vf6Var13;
                            if (z2 && arrayList5 == null) {
                                j = 0;
                                na7Var.H(dialog, null, 0L);
                                if (!w01.a) {
                                    fa4.b("processDialogsUpdate new messages are null");
                                }
                                i3 = i + 1;
                                z2aVar = this;
                                j2 = j;
                                l = l2;
                                longSparseIntArray2 = longSparseIntArray;
                                arrayList3 = arrayList4;
                                vf6Var7 = vf6Var;
                                vf6Var8 = vf6Var2;
                                sparseIntArray2 = sparseIntArray;
                                vf6Var9 = vf6Var4;
                            }
                        }
                    }
                    vf6Var11.k(dialog, j3);
                    vf6Var13.k(arrayList5, j3);
                    int i12 = 0;
                    while (arrayList6 != null && i12 < arrayList6.size()) {
                        k27 k27Var2 = (k27) arrayList6.get(i12);
                        if (k27Var2 != null) {
                            i2 = i12;
                            vf6Var5 = vf6Var13;
                            if (k27Var2.k.peer_id.channel_id == 0) {
                                sparseArray.remove(k27Var2.e1());
                                long j5 = k27Var2.k.random_id;
                                if (j5 != 0) {
                                    vf6Var10.l(j5);
                                }
                            }
                        } else {
                            i2 = i12;
                            vf6Var5 = vf6Var13;
                        }
                        i12 = i2 + 1;
                        vf6Var13 = vf6Var5;
                    }
                    vf6Var4 = vf6Var13;
                    if (arrayList5 != null) {
                        int i13 = 0;
                        while (i13 < arrayList5.size()) {
                            k27 k27Var3 = (k27) arrayList5.get(i13);
                            int i14 = 0;
                            while (arrayList6 != null && i14 < arrayList6.size()) {
                                k27 k27Var4 = (k27) arrayList6.get(i14);
                                if (k27Var4 != null) {
                                    arrayList2 = arrayList6;
                                    if (k27Var4.e1() == k27Var3.e1()) {
                                        k27Var3.Z = k27Var4.Z;
                                        break;
                                    }
                                } else {
                                    arrayList2 = arrayList6;
                                }
                                i14++;
                                arrayList6 = arrayList2;
                            }
                            arrayList2 = arrayList6;
                            if (k27Var3 != null && k27Var3.k.peer_id.channel_id == 0) {
                                sparseArray.put(k27Var3.e1(), k27Var3);
                                na7Var.O = Math.min(na7Var.O, k27Var3.k.date);
                                long j6 = k27Var3.k.random_id;
                                if (j6 != 0) {
                                    vf6Var10.k(k27Var3, j6);
                                }
                            }
                            i13++;
                            arrayList6 = arrayList2;
                        }
                    }
                    if (b1cVar.u(j3)) {
                        b1cVar.d(j3);
                    }
                    if (z2) {
                        j = 0;
                        na7Var.H(dialog, null, 0L);
                        if (!w01.a) {
                        }
                        i3 = i + 1;
                        z2aVar = this;
                        j2 = j;
                        l = l2;
                        longSparseIntArray2 = longSparseIntArray;
                        arrayList3 = arrayList4;
                        vf6Var7 = vf6Var;
                        vf6Var8 = vf6Var2;
                        sparseIntArray2 = sparseIntArray;
                        vf6Var9 = vf6Var4;
                    }
                } else {
                    if (z || na7.x3(arrayList5) > na7.x3(arrayList6)) {
                        vf6Var11.k(dialog, j3);
                        vf6Var13.k(arrayList5, j3);
                        for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                            k27 k27Var5 = (k27) arrayList6.get(i15);
                            if (k27Var5 != null && k27Var5.k.peer_id.channel_id == 0) {
                                sparseArray.remove(k27Var5.e1());
                            }
                        }
                        if (arrayList5 != null) {
                            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                                k27 k27Var6 = (k27) arrayList5.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList6.size()) {
                                        break;
                                    }
                                    k27 k27Var7 = (k27) arrayList6.get(i17);
                                    if (k27Var7 != null && k27Var7.e1() == k27Var6.e1()) {
                                        k27Var6.Z = k27Var7.Z;
                                        break;
                                    }
                                    i17++;
                                }
                                if (k27Var6 != null && k27Var6.k.peer_id.channel_id == 0) {
                                    sparseArray.put(k27Var6.e1(), k27Var6);
                                    na7Var.O = Math.min(na7Var.O, k27Var6.k.date);
                                    long j7 = k27Var6.k.random_id;
                                    if (j7 != 0) {
                                        vf6Var10.k(k27Var6, j7);
                                    }
                                }
                            }
                        }
                        for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                            long j8 = ((k27) arrayList6.get(i18)).k.random_id;
                            if (j8 != 0) {
                                vf6Var10.l(j8);
                            }
                        }
                        if (b1cVar.u(j3)) {
                            b1cVar.d(j3);
                        }
                    }
                    vf6Var4 = vf6Var13;
                }
            }
            j = 0;
            i3 = i + 1;
            z2aVar = this;
            j2 = j;
            l = l2;
            longSparseIntArray2 = longSparseIntArray;
            arrayList3 = arrayList4;
            vf6Var7 = vf6Var;
            vf6Var8 = vf6Var2;
            sparseIntArray2 = sparseIntArray;
            vf6Var9 = vf6Var4;
        }
        LongSparseIntArray longSparseIntArray3 = longSparseIntArray2;
        ArrayList arrayList7 = arrayList3;
        arrayList7.clear();
        int m = vf6Var11.m();
        int i19 = 0;
        while (i19 < m) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) vf6Var11.n(i19);
            if (na7Var.u0.h(dialog3.id) >= 0) {
                arrayList = arrayList7;
            } else {
                arrayList = arrayList7;
                arrayList.add(dialog3);
            }
            i19++;
            arrayList7 = arrayList;
        }
        na7Var.Z4(null);
        na7Var.getNotificationCenter().k(kk7.r, new Object[0]);
        na7Var.getNotificationsController().J(longSparseIntArray3);
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03cb A[Catch: all -> 0x03d1, TRY_LEAVE, TryCatch #1 {all -> 0x03d1, blocks: (B:158:0x03c3, B:160:0x03cb), top: B:157:0x03c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x045e  */
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
        char c2 = '\b';
        byte b = 3;
        boolean z3 = true;
        int i2 = 0;
        switch (this.a) {
            case 0:
                z3a z3aVar = (z3a) this.c;
                TLObject tLObject = (TLObject) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                mu1 mu1Var = (mu1) this.f;
                String str3 = (String) this.h;
                boolean z4 = this.b;
                if (tLObject == null) {
                    ij.n0(mu1Var, str3, false, z4);
                    return;
                }
                if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                    un7.b(false, z3aVar.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, null);
                    return;
                } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                    un7.b(false, z3aVar.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, null);
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                        ij.n0(mu1Var, str3, false, z4);
                        return;
                    }
                    return;
                }
            case 1:
                ((CameraController) this.c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f, this.b, (Runnable) this.h);
                return;
            case 2:
                zi1 zi1Var = (zi1) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                Activity activity = (Activity) this.h;
                boolean z5 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error == null) {
                    twoStepVerificationActivity.s0();
                    twoStepVerificationActivity.finishFragment();
                    if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                        d01.t(zi1Var.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject2).url);
                        if (z5) {
                            zi1Var.I(true);
                        }
                    }
                    zi1Var.K();
                    return;
                }
                if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(zi1Var.o0).sendRequest(new TL_account.getPassword(), new mi1((Object) zi1Var, (Object) twoStepVerificationActivity, z5, (byte) 0), 8);
                        return;
                    }
                    twoStepVerificationActivity.s0();
                    twoStepVerificationActivity.finishFragment();
                    u21.e0(tL_error);
                    return;
                }
                twoStepVerificationActivity.s0();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                alertDialog$Builder.a.S = k96.M0(2131751285, null);
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setPadding(gl.L(24.0f), gl.L(2.0f), gl.L(24.0f), 0);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                TextView textView = new TextView(activity);
                int i3 = bkb.i5;
                zkb.X(textView, i3, null);
                textView.setTextSize(1, 16.0f);
                textView.setGravity((k96.a0 ? 5 : 3) | 48);
                textView.setText(gl.S2(k96.M0(2131742601, null)));
                linearLayout.addView(textView, nme.o(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(activity);
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView = new ImageView(activity);
                imageView.setImageResource(R.drawable.list_circle);
                imageView.setPadding(k96.a0 ? gl.L(11.0f) : 0, gl.L(9.0f), k96.a0 ? 0 : gl.L(11.0f), 0);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                zkb.s(imageView, i3, null, mode);
                TextView textView2 = new TextView(activity);
                zkb.X(textView2, i3, null);
                textView2.setTextSize(1, 16.0f);
                textView2.setGravity((k96.a0 ? 5 : 3) | 48);
                textView2.setText(gl.S2(k96.M0(2131751288, null)));
                if (k96.a0) {
                    linearLayout2.addView(textView2, nme.o(-1, -2));
                    linearLayout2.addView(imageView, nme.r(-2, -2, 5));
                } else {
                    linearLayout2.addView(imageView, nme.o(-2, -2));
                    linearLayout2.addView(textView2, nme.o(-1, -2));
                }
                LinearLayout m = ir2.m(activity, 0);
                linearLayout.addView(m, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView2 = new ImageView(activity);
                imageView2.setImageResource(R.drawable.list_circle);
                imageView2.setPadding(k96.a0 ? gl.L(11.0f) : 0, gl.L(9.0f), k96.a0 ? 0 : gl.L(11.0f), 0);
                zkb.s(imageView2, i3, null, mode);
                TextView textView3 = new TextView(activity);
                zkb.X(textView3, i3, null);
                textView3.setTextSize(1, 16.0f);
                textView3.setGravity((k96.a0 ? 5 : 3) | 48);
                textView3.setText(gl.S2(k96.M0(2131751287, null)));
                if (k96.a0) {
                    m.addView(textView3, nme.o(-1, -2));
                    i = 5;
                    m.addView(imageView2, nme.r(-2, -2, 5));
                } else {
                    i = 5;
                    m.addView(imageView2, nme.o(-2, -2));
                    m.addView(textView3, nme.o(-1, -2));
                }
                if ("PASSWORD_MISSING".equals(tL_error.text)) {
                    alertDialog$Builder.j(k96.M0(2131751279, null), new di1(zi1Var));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                } else {
                    TextView textView4 = new TextView(activity);
                    zkb.X(textView4, i3, null);
                    textView4.setTextSize(1, 16.0f);
                    de9.q(textView4, (k96.a0 ? i : 3) | 48, null, 2131751286);
                    linearLayout.addView(textView4, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    alertDialog$Builder.g(k96.M0(2131747638, null), null);
                }
                twoStepVerificationActivity.showDialog(alertDialog$Builder.a);
                return;
            case 3:
                ((mu1) this.f).O8((gb2) this.c, this.b, (String) this.h, (TLRPC.User[]) this.d, (CharacterStyle) this.e);
                return;
            case 4:
                mu1 mu1Var2 = (mu1) this.f;
                hd hdVar = (hd) this.c;
                boolean[] zArr = (boolean[]) this.d;
                boolean z6 = this.b;
                k27 k27Var = (k27) this.e;
                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) this.h;
                try {
                    hdVar.dismiss();
                } catch (Throwable unused) {
                }
                if (zArr[0]) {
                    return;
                }
                if (z6) {
                    mu1Var2.createArticleViewer(false).L(k27Var, tL_webPage, null, null);
                    return;
                }
                try {
                    gl.r2(k27Var, mu1Var2.getParentActivity(), mu1Var2.Ba, false);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    mu1Var2.A4(k27Var);
                    return;
                }
            case 5:
                c92 c92Var = (c92) this.c;
                TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = (TLRPC.TL_channels_toggleUsername) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f;
                boolean z7 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                e92 e92Var = c92Var.a;
                f92 f92Var = e92Var.i3;
                f92Var.Q.remove(tL_channels_toggleUsername.username);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    e92Var.z1(tL_username, !z7, false);
                } else if (tL_error2 == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    e92Var.z1(tL_username, z7, true);
                    f92Var.a0();
                } else {
                    gl.c3(new mn6((Object) c92Var, (Object) tL_username, z7, (byte) 14));
                }
                f92Var.getMessagesController().z5(f92Var.Y, tL_username.username, tL_username.active);
                return;
            case 6:
                qu2 qu2Var = (qu2) this.c;
                boolean z8 = this.b;
                ArrayList arrayList = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                HashMap hashMap2 = (HashMap) this.f;
                ArrayList arrayList2 = (ArrayList) this.h;
                if (z8) {
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        TLRPC.User V1 = qu2Var.getMessagesController().V1(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i4)).user_id));
                        if (V1 != null && !TextUtils.isEmpty(V1.phone)) {
                            String str4 = V1.phone;
                            nu2 nu2Var = (nu2) hashMap.get(str4.substring(Math.max(0, str4.length() - 7)));
                            if (nu2Var == null) {
                                String a = nu2.a(V1.first_name, V1.last_name);
                                ArrayList arrayList3 = (ArrayList) hashMap2.get(a);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    hashMap2.put(a, arrayList3);
                                    arrayList2.add(a);
                                }
                                arrayList3.add(V1);
                            } else if (nu2Var.m == null) {
                                nu2Var.m = V1;
                            }
                        }
                    }
                }
                Collator u = qu2.u();
                Iterator it = hashMap2.values().iterator();
                while (it.hasNext()) {
                    Collections.sort((ArrayList) it.next(), new in0(u, b));
                }
                Collections.sort(arrayList2, new in0(u, (byte) 4));
                gl.c3(new du2(qu2Var, arrayList2, hashMap, hashMap2));
                return;
            case 7:
                q03 q03Var = (q03) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                u41 u41Var = (u41) this.e;
                boolean z9 = this.b;
                HashSet hashSet = (HashSet) this.f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                if (!(tLObject4 instanceof TLRPC.Updates)) {
                    if (!(tLObject4 instanceof TL_phone.groupCall)) {
                        if (tL_error3 != null) {
                            ug8.u(q03Var.F, q03Var.J0, tL_error3, false);
                            return;
                        }
                        return;
                    }
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    na7.q1(q03Var.a).b4(groupcall.users, false);
                    na7.q1(q03Var.a).V3(groupcall.chats, false);
                    if (LaunchActivity.H1 == null) {
                        q03Var.X1 = false;
                        u41Var.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall = groupcall.call;
                    tL_inputGroupCall.id = groupCall.id;
                    tL_inputGroupCall.access_hash = groupCall.access_hash;
                    q03Var.dismiss();
                    rgc.g(LaunchActivity.H1, q03Var.a, tL_inputGroupCall, z9, groupcall.call, hashSet);
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                na7.q1(q03Var.a).b4(updates.users, false);
                na7.q1(q03Var.a).V3(updates.chats, false);
                ArrayList w0 = na7.w0(updates, TL_update.TL_updateGroupCall.class);
                int size2 = w0.size();
                int i5 = 0;
                TLRPC.GroupCall groupCall2 = null;
                while (i5 < size2) {
                    Object obj = w0.get(i5);
                    i5++;
                    groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
                }
                Utilities.d.c(new gu2((Object) q03Var, (Object) updates, (byte) 11));
                if (groupCall2 == null || LaunchActivity.H1 == null) {
                    q03Var.X1 = false;
                    u41Var.setLoading(false);
                    return;
                }
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall2.id = groupCall2.id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                q03Var.dismiss();
                rgc.g(LaunchActivity.H1, q03Var.a, tL_inputGroupCall2, z9, groupCall2, hashSet);
                return;
            case 8:
                ((t14) this.c).J((um4) this.e, (TLObject) this.d, (TLRPC.StickerSet) this.f, (TLRPC.Document) this.h, this.b, true);
                return;
            case 9:
                l94 l94Var = (l94) this.c;
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
                    if (l94Var.a1) {
                        try {
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file5));
                            ba4.o(gZIPInputStream, l94Var.K0);
                            gZIPInputStream.close();
                            file5.delete();
                            file = l94Var.K0;
                            z = false;
                            try {
                                l94Var.a1 = false;
                            } catch (ZipException unused2) {
                                file5 = file;
                                l94Var.a1 = z;
                                if (l94Var.a1) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                Typeface typeface = gl.a;
                                fa4.g(th, !((th instanceof FileNotFoundException) || (th instanceof EOFException)));
                                if (w01.a) {
                                    fa4.d("unable to ungzip temp = " + file5 + " to final = " + l94Var.L0);
                                }
                                file5 = file;
                                if (l94Var.a1) {
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
                    if (l94Var.a1) {
                        Utilities.d.c(new b94(l94Var, (byte) 6));
                        return;
                    }
                    if (l94Var.p0 instanceof TLRPC.TL_theme) {
                        try {
                            renameTo = gl.E(file5, l94Var.L0);
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                            z2 = false;
                            if (!z2) {
                                try {
                                    z2 = gl.E(file5, l94Var.L0);
                                    if (z2) {
                                    }
                                } catch (Throwable th3) {
                                    fa4.g(th3, true);
                                }
                            }
                            if (z2) {
                            }
                            Utilities.d.c(new g94(l94Var, z10, (byte) 2));
                            return;
                        }
                    } else {
                        try {
                            if (l94Var.c1 != null) {
                                synchronized (l94.m1) {
                                    try {
                                        l94Var.L0 = new File(l94Var.T0, l94Var.s);
                                        int i6 = 1;
                                        while (l94Var.L0.exists()) {
                                            int lastIndexOf = l94Var.s.lastIndexOf(46);
                                            l94Var.L0 = new File(l94Var.T0, lastIndexOf > 0 ? l94Var.s.substring(0, lastIndexOf) + " (" + i6 + ")" + l94Var.s.substring(lastIndexOf) : l94Var.s + " (" + i6 + ")");
                                            i6++;
                                        }
                                    } finally {
                                    }
                                }
                            }
                            renameTo = file5.renameTo(l94Var.L0);
                        } catch (Exception e3) {
                            fa4.g(e3, true);
                            z2 = false;
                            if (!z2) {
                            }
                            if (z2) {
                            }
                            Utilities.d.c(new g94(l94Var, z10, (byte) 2));
                            return;
                        }
                    }
                    z2 = renameTo;
                    if (!z2 && l94Var.m0 == 3) {
                        z2 = gl.E(file5, l94Var.L0);
                        if (z2) {
                            l94Var.L0.delete();
                        }
                    }
                    if (z2) {
                        l94Var.O0 = true;
                        if (l94Var.c1 != null && l94Var.L0.exists()) {
                            z94 z94Var = l94Var.g0;
                            wx wxVar = l94Var.c1;
                            File file6 = l94Var.L0;
                            la4 la4Var = z94Var.e.d;
                            long j = wxVar.b;
                            int i7 = wxVar.c;
                            byte b2 = wxVar.d;
                            String file7 = file6 != null ? file6.toString() : null;
                            la4Var.getClass();
                            la4Var.h(new ja4(la4Var, j, i7, b2, file7, 0));
                        }
                    } else {
                        if (w01.a) {
                            fa4.d("unable to rename temp = " + file5 + " to final = " + l94Var.L0 + " retry = " + l94Var.m0);
                        }
                        int i8 = l94Var.m0 + 1;
                        l94Var.m0 = i8;
                        if (i8 < 3) {
                            l94Var.Y = (byte) 1;
                            Utilities.d.d(new g94(l94Var, z10, (byte) 0), 200L);
                            return;
                        } else {
                            l94Var.L0 = file5;
                            l94Var.O0 = false;
                        }
                    }
                }
                Utilities.d.c(new g94(l94Var, z10, (byte) 2));
                return;
            case 10:
                by6 by6Var = (by6) this.c;
                Pair pair = (Pair) this.d;
                by6Var.b.i.w(((Integer) pair.first).intValue(), (rx6) pair.second, (f86) this.e, (fr6) this.f, (IOException) this.h, this.b);
                return;
            case 11:
                a();
                return;
            case 12:
                vqa vqaVar = (vqa) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                m25 m25Var = (m25) this.f;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) this.h;
                boolean z11 = this.b;
                TLObject tLObject5 = (TLObject) this.d;
                long j2 = vqaVar.S1;
                if (vqaVar.getContext() != null) {
                    if (tL_error4 != null && m25Var != null && tL_error4.text.startsWith("TMP_PASSWORD")) {
                        m25Var.a(Boolean.TRUE);
                        return;
                    }
                    if (m25Var != null) {
                        m25Var.a(Boolean.FALSE);
                    }
                    if (tL_error4 != null) {
                        vqaVar.P1(tL_error4, twoStepVerificationActivity2, z11);
                        return;
                    }
                    if (twoStepVerificationActivity2 != null) {
                        twoStepVerificationActivity2.s0();
                        twoStepVerificationActivity2.finishFragment();
                    }
                    if (tLObject5 instanceof TL_stars.starGiftWithdrawalUrl) {
                        d01.v(vqaVar.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject5).url, false);
                        return;
                    }
                    if (!(tLObject5 instanceof TLRPC.TL_boolTrue)) {
                        if (tLObject5 instanceof TLRPC.TL_boolFalse) {
                            u21.c0("NULL_ERROR");
                            return;
                        }
                        return;
                    }
                    TL_stars.TL_starGiftUnique A1 = vqaVar.A1();
                    c C = c.C(vqaVar.a);
                    if (A1 != null) {
                        str = A1.gift_address;
                        str2 = A1.slug;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    wz4 wz4Var = C.B;
                    gl.r(wz4Var);
                    C.y = str;
                    C.z = str2;
                    C.A = 0;
                    C.A().d();
                    C.G().g();
                    C.J();
                    int i9 = C.A;
                    long[] jArr = c.S;
                    if (i9 < 7) {
                        C.A = i9 + 1;
                        gl.d3(wz4Var, jArr[i9]);
                    }
                    long e4 = y6c.h(vqaVar.a).e();
                    gta.v(vqaVar.a, false).M(e4);
                    if (j2 != 0 && j2 != e4) {
                        gta.v(vqaVar.a, false).M(j2);
                    }
                    if (A1 != null && !TextUtils.isEmpty(A1.slug)) {
                        int i10 = vqaVar.a;
                        String str5 = A1.slug;
                        if (!TextUtils.isEmpty(str5)) {
                            gl.d3(new rn1(i10, 0, str5, z3), cq7.b[0]);
                        }
                        gl.c3(new q3a(new am6((byte) 26), A1.getDocument(), k96.M0(2131750085, null)));
                    }
                    vqaVar.dismiss();
                    return;
                }
                return;
            default:
                joc jocVar = (joc) this.c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.e;
                int[] iArr3 = (int[]) this.f;
                int[] iArr4 = (int[]) this.h;
                boolean z12 = this.b;
                do3 do3Var = dqc.a;
                int i11 = 0;
                while (true) {
                    int i12 = kk7.J4;
                    if (i11 >= 288) {
                        int i13 = 0;
                        while (i13 < 288) {
                            for (int i14 = i2; i14 < 288; i14++) {
                                iArr4[i14] = iArr3[(i14 * kk7.K4) + i13];
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
                                iArr3[(i15 * kk7.K4) + i13] = dqc.b[i16];
                                i15++;
                                i2 = 0;
                                i12 = kk7.J4;
                            }
                            i13++;
                            i2 = 0;
                            i12 = kk7.J4;
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
                                    int i23 = ((255 - i22) * max2) / kk7.d4;
                                    int i24 = i22 + i23;
                                    int i25 = ((i21 >> 16) & kk7.d4) * i22;
                                    int i26 = i23 * kk7.d4;
                                    c = c2;
                                    i21 = ((((i21 & kk7.d4) * i22) + i26) / i24) | (i24 << 24) | (((i25 + i26) / i24) << 16) | ((((((i21 >> 8) & kk7.d4) * i22) + i26) / i24) << 8);
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
                                Bitmap createBitmap = Bitmap.createBitmap(iArr2, kk7.K4, kk7.K4, Bitmap.Config.ARGB_8888);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 128, 128, true);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                bitmap = Bitmap.createBitmap(kk7.F2, kk7.F2, Bitmap.Config.ALPHA_8);
                                Paint paint = new Paint(1);
                                paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                                new Canvas(bitmap).drawBitmap(extractAlpha, 24.0f, 24.0f, paint);
                                createBitmap.recycle();
                                createScaledBitmap.recycle();
                                extractAlpha.recycle();
                                gl.c3(new wbc(jocVar, iArr2, bitmap, (byte) 17));
                                return;
                            }
                        }
                        bitmap = null;
                        gl.c3(new wbc(jocVar, iArr2, bitmap, (byte) 17));
                        return;
                    }
                    int i29 = i11 * kk7.K4;
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

    public /* synthetic */ z2a(mu1 mu1Var, gb2 gb2Var, boolean z, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.a = (byte) 3;
        this.f = mu1Var;
        this.c = gb2Var;
        this.b = z;
        this.h = str;
        this.d = userArr;
        this.e = characterStyle;
    }

    public /* synthetic */ z2a(c92 c92Var, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z, TLRPC.TL_error tL_error) {
        this.a = (byte) 5;
        this.c = c92Var;
        this.e = tL_channels_toggleUsername;
        this.d = tLObject;
        this.f = tL_username;
        this.b = z;
        this.h = tL_error;
    }

    public /* synthetic */ z2a(qu2 qu2Var, boolean z, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = (byte) 6;
        this.c = qu2Var;
        this.b = z;
        this.d = arrayList;
        this.e = hashMap;
        this.f = hashMap2;
        this.h = arrayList2;
    }

    public /* synthetic */ z2a(q03 q03Var, TLObject tLObject, u41 u41Var, boolean z, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.a = (byte) 7;
        this.c = q03Var;
        this.d = tLObject;
        this.e = u41Var;
        this.b = z;
        this.f = hashSet;
        this.h = tL_error;
    }

    public /* synthetic */ z2a(mu1 mu1Var, hd hdVar, boolean[] zArr, boolean z, k27 k27Var, TLRPC.TL_webPage tL_webPage) {
        this.a = (byte) 4;
        this.f = mu1Var;
        this.c = hdVar;
        this.d = zArr;
        this.b = z;
        this.e = k27Var;
        this.h = tL_webPage;
    }

    public /* synthetic */ z2a(KeyEvent.Callback callback, TLRPC.TL_error tL_error, Object obj, Object obj2, boolean z, TLObject tLObject, byte b) {
        this.a = b;
        this.c = callback;
        this.e = tL_error;
        this.f = obj;
        this.h = obj2;
        this.b = z;
        this.d = tLObject;
    }

    public /* synthetic */ z2a(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = serializable;
        this.b = z;
    }

    public /* synthetic */ z2a(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
        this.h = obj5;
    }
}
