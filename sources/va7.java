// default package

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class va7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ va7(r7a r7aVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, r47 r47Var, e eVar, boolean z) {
        this.a = (byte) 20;
        this.c = r7aVar;
        this.d = tL_messages_editMessage;
        this.f = r47Var;
        this.e = eVar;
        this.b = z;
    }

    private final void a() {
        TLRPC.FileLocation fileLocation;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        fj3 fj3Var = (fj3) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.f;
        uj3 uj3Var = fj3Var.a;
        int i8 = 0;
        if (tL_error == null) {
            TLRPC.User X1 = uj3Var.getMessagesController().X1(Long.valueOf(uj3Var.getUserConfig().e()));
            if (X1 == null) {
                X1 = uj3Var.getUserConfig().f();
                if (X1 == null) {
                    return;
                } else {
                    uj3Var.getMessagesController().i4(X1, false, false);
                }
            } else {
                uj3Var.getUserConfig().v(X1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w = xb4.w(arrayList, jn7.f2, false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(arrayList, 800, false, null, false);
            TLRPC.VideoSize x = tL_photos_photo.photo.video_sizes.isEmpty() ? null : xb4.x(1000, tL_photos_photo.photo.video_sizes);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            X1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w != null) {
                tL_userProfilePhoto.photo_small = w.location;
            }
            if (w2 != null) {
                tL_userProfilePhoto.photo_big = w2.location;
            }
            if (w != null && uj3Var.i4 != null) {
                i5 = ((e) uj3Var).currentAccount;
                xb4.G(i5);
                File J = xb4.J(w, null, true, true);
                i6 = ((e) uj3Var).currentAccount;
                xb4.G(i6);
                xb4.J(uj3Var.i4, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(uj3Var.i4.volume_id);
                sb.append("_");
                String l = uh9.l(sb, uj3Var.i4.local_id, "@50_50");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                String l2 = uh9.l(sb2, w.location.local_id, "@50_50");
                in5 z = in5.z();
                i7 = ((e) uj3Var).currentAccount;
                z.O(l, l2, jn5.m(i7, 1, X1));
            }
            if (x != null && str != null) {
                i4 = ((e) uj3Var).currentAccount;
                xb4.G(i4);
                new File(str).renameTo(xb4.J(x, "mp4", true, true));
            } else if (w2 != null && uj3Var.j4 != null) {
                i2 = ((e) uj3Var).currentAccount;
                xb4.G(i2);
                File J2 = xb4.J(w2, null, true, true);
                i3 = ((e) uj3Var).currentAccount;
                xb4.G(i3);
                xb4.J(uj3Var.j4, null, true, true).renameTo(J2);
            }
            uj3Var.getMessagesController().U0(X1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(X1);
            i8 = 0;
            uj3Var.getMessagesStorage().n1(arrayList2, null, false, true);
            TLRPC.UserFull Y1 = uj3Var.getMessagesController().Y1(uj3Var.getUserConfig().e());
            if (Y1 != null) {
                Y1.profile_photo = tL_photos_photo.photo;
                uj3Var.getMessagesStorage().l2(Y1, false);
            }
            fileLocation = null;
        } else {
            fileLocation = null;
        }
        uj3Var.i4 = fileLocation;
        uj3Var.j4 = fileLocation;
        jn7 notificationCenter = uj3Var.getNotificationCenter();
        Object[] objArr = new Object[1];
        objArr[i8] = Integer.valueOf(uc7.s5);
        notificationCenter.k(2, objArr);
        uj3Var.getNotificationCenter().k(jn7.j0, new Object[i8]);
        uj3Var.getUserConfig().u(true);
        i = ((e) uj3Var).currentAccount;
        uc7.s1(i).v4(0L, "USERPIC_SETUP");
        uj3Var.q5();
        v21 v21Var = uj3Var.k4;
        if (v21Var != null) {
            m21 m21Var = (m21) v21Var.e;
            m21Var.d.c(ob6.M0(this.b ? 2131742424 : 2131742426, null), true, true);
            m21Var.setProgress(1.0f);
            p11 button = m21Var.getButton();
            button.setScaleX(0.6f);
            button.setScaleY(0.6f);
            button.setAlpha(0.0f);
            button.setVisibility(0);
            ik8.t(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), k43.h, 360L);
            v21 v21Var2 = uj3Var.k4;
            v21Var2.j = 5000;
            v21Var2.i(false);
            uj3Var.k4.i(true);
        }
    }

    private final void b() {
        w14 w14Var = (w14) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        TLObject tLObject = (TLObject) this.f;
        w14Var.a.remove(str2);
        o24 o24Var = w14Var.b;
        t14 t14Var = o24Var.k0;
        HashMap hashMap = o24Var.m0;
        boolean z = t14Var.w;
        boolean z2 = this.b;
        if (z && t14Var.x.equals(str)) {
            o24Var.k0.E(str, "", false, true, z2, str2, tLObject);
            return;
        }
        if (z2 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
            w14Var.a(str, false);
        } else {
            if (!(tLObject instanceof TLRPC.messages_BotResults) || hashMap.containsKey(str2)) {
                return;
            }
            hashMap.put(str2, (TLRPC.messages_BotResults) tLObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149 A[Catch: all -> 0x0232, Exception -> 0x0234, TRY_LEAVE, TryCatch #12 {Exception -> 0x0234, all -> 0x0232, blocks: (B:60:0x00df, B:62:0x00e5, B:64:0x00f6, B:71:0x0144, B:73:0x0149, B:114:0x01f7, B:86:0x0219, B:125:0x0227, B:127:0x022e), top: B:59:0x00df }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        boolean z;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLitePreparedStatement executeFast;
        boolean z2;
        TLRPC.MessageReplies messageReplies;
        int i;
        int i2;
        va7 va7Var = this;
        kf7 kf7Var = (kf7) va7Var.c;
        zh6 zh6Var = (zh6) va7Var.d;
        zh6 zh6Var2 = (zh6) va7Var.e;
        zh6 zh6Var3 = (zh6) va7Var.f;
        boolean z3 = true;
        try {
            kf7Var.b.beginTransaction();
            try {
                int i3 = 2;
                if (!kf7.s0(zh6Var)) {
                    try {
                        SQLitePreparedStatement executeFast2 = kf7Var.b.executeFast("UPDATE messages_v2 SET media = max((SELECT media FROM messages_v2 WHERE mid = ? AND uid = ?), ?) WHERE mid = ? AND uid = ?");
                        int i4 = 0;
                        while (i4 < zh6Var.m()) {
                            try {
                                long j = zh6Var.j(i4);
                                SparseIntArray sparseIntArray = (SparseIntArray) zh6Var.n(i4);
                                int size = sparseIntArray.size();
                                int i5 = 0;
                                while (i5 < size) {
                                    int valueAt = sparseIntArray.valueAt(i5);
                                    int keyAt = sparseIntArray.keyAt(i5);
                                    executeFast2.requery();
                                    executeFast2.bindInteger(1, keyAt);
                                    executeFast2.bindLong(i3, j);
                                    executeFast2.bindInteger(3, valueAt);
                                    executeFast2.bindInteger(4, keyAt);
                                    executeFast2.bindLong(5, j);
                                    executeFast2.step();
                                    i5++;
                                    i3 = 2;
                                }
                                i4++;
                                i3 = 2;
                            } catch (Exception e) {
                                e = e;
                                z = true;
                                sQLitePreparedStatement = executeFast2;
                                try {
                                    kf7Var.p(e, z3);
                                    if (z) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z3 = z;
                                    if (z3 && (sQLiteDatabase = kf7Var.b) != null) {
                                        sQLiteDatabase.commitTransaction();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLitePreparedStatement = executeFast2;
                                if (z3) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        }
                        executeFast2.dispose();
                    } catch (Exception e2) {
                        e = e2;
                        z = true;
                        sQLitePreparedStatement = null;
                        kf7Var.p(e, z3);
                        if (z && (sQLiteDatabase2 = kf7Var.b) != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        sQLitePreparedStatement = null;
                        if (z3) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        throw th;
                    }
                }
                if (!kf7.s0(zh6Var2)) {
                    executeFast = kf7Var.b.executeFast("UPDATE messages_v2 SET forwards = max((SELECT forwards FROM messages_v2 WHERE mid = ? AND uid = ?), ?) WHERE mid = ? AND uid = ?");
                    for (int i6 = 0; i6 < zh6Var2.m(); i6++) {
                        try {
                            long j2 = zh6Var2.j(i6);
                            SparseIntArray sparseIntArray2 = (SparseIntArray) zh6Var2.n(i6);
                            int size2 = sparseIntArray2.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                int valueAt2 = sparseIntArray2.valueAt(i7);
                                int keyAt2 = sparseIntArray2.keyAt(i7);
                                executeFast.requery();
                                executeFast.bindInteger(1, keyAt2);
                                executeFast.bindLong(2, j2);
                                executeFast.bindInteger(3, valueAt2);
                                executeFast.bindInteger(4, keyAt2);
                                executeFast.bindLong(5, j2);
                                executeFast.step();
                            }
                        } catch (Exception e3) {
                            e = e3;
                            sQLitePreparedStatement = executeFast;
                            z = z3;
                            kf7Var.p(e, z3);
                            if (z) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sQLitePreparedStatement = executeFast;
                            if (z3) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    executeFast.dispose();
                }
                if (!kf7.s0(zh6Var3)) {
                    executeFast = kf7Var.b.executeFast("UPDATE messages_v2 SET replies_data = ? WHERE mid = ? AND uid = ?");
                    int i8 = 0;
                    while (i8 < zh6Var3.m()) {
                        try {
                            long j3 = zh6Var3.j(i8);
                            SparseArray sparseArray = (SparseArray) zh6Var3.n(i8);
                            int size3 = sparseArray.size();
                            int i9 = 0;
                            while (i9 < size3) {
                                int keyAt3 = sparseArray.keyAt(i9);
                                SQLiteDatabase sQLiteDatabase3 = kf7Var.b;
                                Locale locale = Locale.US;
                                SQLiteCursor queryFinalized = sQLiteDatabase3.queryFinalized("SELECT replies_data FROM messages_v2 WHERE mid = " + keyAt3 + " AND uid = " + j3, new Object[0]);
                                boolean next = queryFinalized.next();
                                if (next) {
                                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                                    if (byteBufferValue != null) {
                                        z2 = z3;
                                        try {
                                            messageReplies = TLRPC.MessageReplies.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                            byteBufferValue.reuse();
                                            queryFinalized.dispose();
                                            if (!next) {
                                                TLRPC.MessageReplies messageReplies2 = (TLRPC.MessageReplies) sparseArray.get(sparseArray.keyAt(i9));
                                                boolean z4 = va7Var.b;
                                                if (z4 || messageReplies == null || (i2 = messageReplies.replies_pts) == 0 || messageReplies2.replies_pts > i2 || messageReplies2.read_max_id > messageReplies.read_max_id || messageReplies2.max_id > messageReplies.max_id) {
                                                    if (z4) {
                                                        if (messageReplies == null) {
                                                            messageReplies = new TLRPC.TL_messageReplies();
                                                            messageReplies.flags |= 2;
                                                        }
                                                        messageReplies.replies += messageReplies2.replies;
                                                        int size4 = messageReplies2.recent_repliers.size();
                                                        for (int i10 = 0; i10 < size4; i10++) {
                                                            long B1 = r47.B1(messageReplies2.recent_repliers.get(i10));
                                                            int size5 = messageReplies.recent_repliers.size();
                                                            int i11 = 0;
                                                            while (i11 < size5) {
                                                                int i12 = size5;
                                                                if (B1 == r47.B1(messageReplies.recent_repliers.get(i11))) {
                                                                    messageReplies.recent_repliers.remove(i11);
                                                                    i11--;
                                                                    size5 = i12 - 1;
                                                                } else {
                                                                    size5 = i12;
                                                                }
                                                                i11++;
                                                            }
                                                        }
                                                        messageReplies.recent_repliers.addAll(0, messageReplies2.recent_repliers);
                                                        while (messageReplies.recent_repliers.size() > 3) {
                                                            messageReplies.recent_repliers.remove(0);
                                                        }
                                                        messageReplies2 = messageReplies;
                                                    }
                                                    if (messageReplies != null && (i = messageReplies.read_max_id) > messageReplies2.read_max_id) {
                                                        messageReplies2.read_max_id = i;
                                                    }
                                                    executeFast.requery();
                                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageReplies2.getObjectSize());
                                                    messageReplies2.serializeToStream(nativeByteBuffer);
                                                    executeFast.bindByteBuffer(z2 ? 1 : 0, nativeByteBuffer);
                                                    executeFast.bindInteger(2, keyAt3);
                                                    executeFast.bindLong(3, j3);
                                                    executeFast.step();
                                                    nativeByteBuffer.reuse();
                                                }
                                            }
                                            i9++;
                                            va7Var = this;
                                            z3 = true;
                                        } catch (Exception e4) {
                                            e = e4;
                                            sQLitePreparedStatement = executeFast;
                                            z3 = z2;
                                            z = z3;
                                            kf7Var.p(e, z3);
                                            if (z) {
                                                sQLiteDatabase2.commitTransaction();
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            sQLitePreparedStatement = executeFast;
                                            z3 = z2;
                                            if (z3) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                z2 = z3;
                                messageReplies = null;
                                queryFinalized.dispose();
                                if (!next) {
                                }
                                i9++;
                                va7Var = this;
                                z3 = true;
                            }
                            i8++;
                            va7Var = this;
                            z3 = true;
                        } catch (Exception e5) {
                            e = e5;
                            sQLitePreparedStatement = executeFast;
                            z3 = true;
                            z = true;
                            kf7Var.p(e, z3);
                            if (z) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            sQLitePreparedStatement = executeFast;
                            z3 = true;
                        }
                    }
                    executeFast.dispose();
                }
                kf7Var.b.commitTransaction();
            } catch (Exception e6) {
                e = e6;
                z3 = true;
                sQLitePreparedStatement = null;
            } catch (Throwable th7) {
                th = th7;
                z3 = true;
            }
        } catch (Exception e7) {
            e = e7;
            z = false;
            z3 = true;
        } catch (Throwable th8) {
            th = th8;
            z3 = false;
        }
    }

    private final void d() {
        ((p) this.c).y0(this.b, (String) this.d, (String) this.e, (TL_account.updatePasswordSettings) this.f);
    }

    private final void e() {
        ((p) this.c).x0((TLRPC.TL_error) this.d, this.b, (TLObject) this.e, (String) this.f);
    }

    private final void f() {
        cj9.f((e) this.e, (Context) this.c, (vnb) this.d, (mi9) this.f, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0161  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, jp9] */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [fp9] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void g() {
        boolean z;
        long j;
        boolean z2;
        File file;
        byte b;
        ?? r1 = (jp9) this.c;
        ?? r2 = this.b;
        bo9 bo9Var = (bo9) this.d;
        ?? r4 = (fp9) this.e;
        File file2 = (File) this.f;
        r1.getClass();
        long nanoTime = System.nanoTime();
        File file3 = null;
        try {
            try {
                r1.g();
                long j2 = r1.I;
                if (r2 != 0) {
                    try {
                        try {
                            synchronized (bo9Var) {
                                try {
                                    bo9Var.w = true;
                                } catch (Throwable th) {
                                    th = th;
                                    r4 = 1;
                                    r2 = 0;
                                }
                                try {
                                    try {
                                        bo9Var.g();
                                        bo9Var.w = false;
                                        try {
                                        } catch (Exception e) {
                                            e = e;
                                            r2 = 0;
                                            r4 = 1;
                                            file3 = r2;
                                            r1.i.post(new wo9(r1, e, r4));
                                            if (file2 != null) {
                                            }
                                            if (file3 == null) {
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        bo9Var.w = false;
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        throw th;
                                    } catch (Exception e2) {
                                        e = e2;
                                        file3 = r2;
                                        r1.i.post(new wo9(r1, e, r4));
                                        if (file2 != null) {
                                        }
                                        if (file3 == null) {
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        file3 = r2;
                                        if (file2 != null) {
                                        }
                                        if (file3 != null) {
                                        }
                                        throw th;
                                    }
                                }
                            }
                            try {
                                r1.g();
                                r1.k(r4, 1);
                                File file4 = bo9Var.a;
                                try {
                                    try {
                                        r1.c(true);
                                        try {
                                            bo9 bo9Var2 = r1.U;
                                            try {
                                                j = r1.K;
                                                z = true;
                                            } catch (Exception e3) {
                                                e = e3;
                                                z = true;
                                            }
                                            try {
                                                long j3 = r1.L;
                                                int i = bo9Var.i();
                                                short s = r1.n.a;
                                                z2 = r2;
                                                int i2 = r1.o;
                                                if (i <= 0) {
                                                    i = r1.p.a;
                                                }
                                                ro9 ro9Var = new ro9(s, i2, i);
                                                file = null;
                                                so9 a = uxe.a(file2, bo9Var2, j, j3, true, ro9Var);
                                                j2 = a.b;
                                                r1.m.b("resume trim remux completed: requested=" + r1.K + ".." + r1.L + ", actualStartMs=" + a.a + ", mode=" + a.c + ", retainedDurationMs=" + j2 + ", outputSize=" + r1.U.a.length() + ", elapsedMs=" + jp9.f(nanoTime));
                                                file3 = file4;
                                                r4 = 1;
                                                b = 0;
                                            } catch (Exception e4) {
                                                e = e4;
                                                file3 = file4;
                                                r4 = z;
                                                r1.i.post(new wo9(r1, e, r4));
                                                if (file2 != null) {
                                                    uxe.c(file2);
                                                }
                                                if (file3 == null) {
                                                    uxe.c(file3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            z = true;
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        z = true;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    file3 = file4;
                                    if (file2 != null) {
                                        uxe.c(file2);
                                    }
                                    if (file3 != null) {
                                        uxe.c(file3);
                                    }
                                    throw th;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                z = true;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            r4 = 1;
                            r2 = 0;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r2 = 0;
                    }
                } else {
                    z2 = r2;
                    r4 = 1;
                    file = null;
                    b = 0;
                }
                try {
                    r1.g();
                    r1.V = file;
                    if (!z2) {
                        r1.m.b("resume prepared without remux: retainedDurationMs=" + j2 + ", elapsedMs=" + jp9.f(nanoTime));
                    }
                    r1.i.post(new xo9(r1, j2, b));
                    if (file2 != null) {
                        uxe.c(file2);
                    }
                    if (file3 != null) {
                        uxe.c(file3);
                    }
                } catch (Exception e9) {
                    e = e9;
                    r1.i.post(new wo9(r1, e, r4));
                    if (file2 != null) {
                    }
                    if (file3 == null) {
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e10) {
            e = e10;
            r4 = 1;
        }
    }

    private final void h() {
        r7a r7aVar = (r7a) this.c;
        TLRPC.Message message = (TLRPC.Message) this.d;
        TLObject tLObject = (TLObject) this.e;
        d7a d7aVar = (d7a) this.f;
        r7aVar.h0(message.id, this.b);
        if (tLObject instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.PollAnswer pollAnswer = ((TLRPC.TL_messages_addPollAnswer) tLObject).answer;
            TLRPC.InputMedia inputMedia = pollAnswer.input_media;
            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                pollAnswer.input_media = d7aVar.t;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                pollAnswer.input_media = d7aVar.t;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_messages_sendMedia.media = d7aVar.t;
            } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                tL_messages_sendMedia.media = d7aVar.t;
            }
        } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            TLObject tLObject2 = d7aVar.c;
            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                    tL_messages_sendMedia2.media = d7aVar.t;
                } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                    tL_messages_sendMedia2.media = d7aVar.t;
                }
            }
            TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
            TLRPC.InputMedia inputMedia4 = tL_sendMessage.media;
            if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_sendMessage.media = d7aVar.t;
            } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                tL_sendMessage.media = d7aVar.t;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject;
            TLRPC.InputMedia inputMedia5 = tL_messages_editMessage.media;
            if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_messages_editMessage.media = d7aVar.t;
            } else if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                tL_messages_editMessage.media = d7aVar.t;
            }
        }
        d7aVar.p = true;
        r7aVar.L(d7aVar, -1);
    }

    private final void i() {
        TLRPC.Message message;
        r7a r7aVar = (r7a) this.c;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.d;
        r47 r47Var = (r47) this.f;
        int sendRequest = r7aVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new gg2(r7aVar, this.b, r47Var, tL_messages_editMessage, (e) this.e, (byte) 4));
        if (r47Var == null || (message = r47Var.k) == null) {
            return;
        }
        message.reqId = sendRequest;
    }

    private final void j() {
        double d;
        double d2;
        e eVar = (e) this.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        zu1 zu1Var = (zu1) this.f;
        File w = c8b.w(eVar.getCurrentAccount(), "webp");
        int o = xea.o();
        float f = o != 0 ? o != 2 ? 2560 : 3840 : 1280;
        double d3 = (f * 512.0f) / 512.0f;
        if (((float) Math.floor(d3)) > f) {
            f = (float) Math.floor(d3);
        }
        float f2 = f;
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        try {
            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w));
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        createBitmap.recycle();
        ArrayList arrayList = new ArrayList();
        no6 no6Var = new no6(0, w.getAbsolutePath(), 0, false, 0, 0);
        arrayList.add(no6Var);
        mec mecVar = new mec();
        mecVar.a = (byte) 0;
        mecVar.C = tL_messages_stickerSet;
        xb4.G(yac.t0);
        mecVar.j = xb4.J(document, null, true, true).getAbsolutePath();
        mecVar.c = 0.0f;
        mecVar.d = 0.0f;
        mecVar.f = 1.0f;
        mecVar.g = 1.0f;
        int floor = (int) Math.floor(f2 * 0.5d);
        mecVar.q = floor;
        mecVar.r = floor;
        mecVar.v = 2.0f;
        mecVar.B = document;
        if (r47.K2(document, true) || r47.N4(document)) {
            mecVar.b = (byte) (mecVar.b | (r47.K2(document, true) ? (byte) 1 : (byte) 4));
        }
        ArrayList arrayList2 = new ArrayList();
        no6Var.p = arrayList2;
        arrayList2.add(mecVar);
        no6Var.t = 3000L;
        if (r47.K2(document, true)) {
            xb4.G(yac.t0);
            File J = xb4.J(document, null, true, true);
            if (J != null) {
                try {
                    RLottieNative a = RLottieNative.a(J.getAbsolutePath(), null, null, null, 0, null);
                    if (a != null) {
                        int[] iArr = a.a;
                        int i = iArr[0];
                        int i2 = iArr[1];
                        a.d();
                        d = 1000.0d;
                        d2 = i / i2;
                    } else {
                        d = 1000.0d;
                        d2 = 0.0d;
                    }
                    no6Var.t = (long) (d2 * d);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        } else if (r47.N4(document)) {
            no6Var.t = (long) (r47.H0(document) * 1000.0d);
        }
        PhotoViewer.q0().T1(eVar.getParentActivity(), null, eVar.getResourceProvider());
        PhotoViewer.q0().o1(arrayList, 0, 11, false, new j4b(), zu1Var);
        PhotoViewer q0 = PhotoViewer.q0();
        boolean z = this.b;
        q0.U(document, z ? document : null, true, null);
        rw2 e2 = rw2.e();
        if (!z) {
            tL_messages_stickerSet = null;
        }
        e2.T = tL_messages_stickerSet;
    }

    private final void k() {
        sbb sbbVar = (sbb) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        File file = (File) this.e;
        c8b c8bVar = (c8b) this.f;
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, this.b ? 95 : 99, new FileOutputStream(file));
        } catch (Exception e) {
            cc4.g(e, true);
        }
        hl.c3(new pwa(sbbVar, c8bVar, file, (byte) 15));
    }

    private final void l() {
        ((o7c) this.c).A0((TLObject) this.d, this.b, (String) this.e, (TL_account.passwordInputSettings) this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03a5 A[Catch: Exception -> 0x0410, all -> 0x0658, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0410, blocks: (B:158:0x036a, B:167:0x037b, B:171:0x03a5, B:183:0x03ec, B:358:0x0396), top: B:148:0x0337 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0480 A[Catch: Exception -> 0x04d5, all -> 0x0556, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x04d5, blocks: (B:284:0x03f8, B:287:0x0402, B:288:0x040a, B:191:0x0430, B:196:0x0454, B:203:0x046d, B:206:0x0480, B:212:0x04bf), top: B:283:0x03f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04bf A[Catch: Exception -> 0x04d5, all -> 0x0556, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x04d5, blocks: (B:284:0x03f8, B:287:0x0402, B:288:0x040a, B:191:0x0430, B:196:0x0454, B:203:0x046d, B:206:0x0480, B:212:0x04bf), top: B:283:0x03f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04e6 A[Catch: all -> 0x0556, Exception -> 0x0558, TryCatch #5 {Exception -> 0x0558, blocks: (B:188:0x0421, B:194:0x0438, B:199:0x045b, B:204:0x047c, B:207:0x049c, B:210:0x04a8, B:213:0x04e0, B:215:0x04e6, B:217:0x04ea, B:218:0x04ec, B:219:0x04f4, B:221:0x04fa, B:222:0x04ff, B:224:0x0506, B:226:0x050f, B:228:0x0516, B:230:0x051e, B:231:0x0524, B:233:0x0528, B:234:0x0532, B:241:0x052e, B:242:0x050a, B:244:0x04f0, B:246:0x04dc, B:252:0x0498, B:254:0x0475), top: B:187:0x0421 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04fa A[Catch: all -> 0x0556, Exception -> 0x0558, TryCatch #5 {Exception -> 0x0558, blocks: (B:188:0x0421, B:194:0x0438, B:199:0x045b, B:204:0x047c, B:207:0x049c, B:210:0x04a8, B:213:0x04e0, B:215:0x04e6, B:217:0x04ea, B:218:0x04ec, B:219:0x04f4, B:221:0x04fa, B:222:0x04ff, B:224:0x0506, B:226:0x050f, B:228:0x0516, B:230:0x051e, B:231:0x0524, B:233:0x0528, B:234:0x0532, B:241:0x052e, B:242:0x050a, B:244:0x04f0, B:246:0x04dc, B:252:0x0498, B:254:0x0475), top: B:187:0x0421 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0506 A[Catch: all -> 0x0556, Exception -> 0x0558, TryCatch #5 {Exception -> 0x0558, blocks: (B:188:0x0421, B:194:0x0438, B:199:0x045b, B:204:0x047c, B:207:0x049c, B:210:0x04a8, B:213:0x04e0, B:215:0x04e6, B:217:0x04ea, B:218:0x04ec, B:219:0x04f4, B:221:0x04fa, B:222:0x04ff, B:224:0x0506, B:226:0x050f, B:228:0x0516, B:230:0x051e, B:231:0x0524, B:233:0x0528, B:234:0x0532, B:241:0x052e, B:242:0x050a, B:244:0x04f0, B:246:0x04dc, B:252:0x0498, B:254:0x0475), top: B:187:0x0421 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x050f A[Catch: all -> 0x0556, Exception -> 0x0558, TryCatch #5 {Exception -> 0x0558, blocks: (B:188:0x0421, B:194:0x0438, B:199:0x045b, B:204:0x047c, B:207:0x049c, B:210:0x04a8, B:213:0x04e0, B:215:0x04e6, B:217:0x04ea, B:218:0x04ec, B:219:0x04f4, B:221:0x04fa, B:222:0x04ff, B:224:0x0506, B:226:0x050f, B:228:0x0516, B:230:0x051e, B:231:0x0524, B:233:0x0528, B:234:0x0532, B:241:0x052e, B:242:0x050a, B:244:0x04f0, B:246:0x04dc, B:252:0x0498, B:254:0x0475), top: B:187:0x0421 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0528 A[Catch: all -> 0x0556, Exception -> 0x0558, TryCatch #5 {Exception -> 0x0558, blocks: (B:188:0x0421, B:194:0x0438, B:199:0x045b, B:204:0x047c, B:207:0x049c, B:210:0x04a8, B:213:0x04e0, B:215:0x04e6, B:217:0x04ea, B:218:0x04ec, B:219:0x04f4, B:221:0x04fa, B:222:0x04ff, B:224:0x0506, B:226:0x050f, B:228:0x0516, B:230:0x051e, B:231:0x0524, B:233:0x0528, B:234:0x0532, B:241:0x052e, B:242:0x050a, B:244:0x04f0, B:246:0x04dc, B:252:0x0498, B:254:0x0475), top: B:187:0x0421 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x053a A[Catch: all -> 0x0658, Exception -> 0x065c, TRY_ENTER, TryCatch #10 {Exception -> 0x065c, blocks: (B:168:0x039a, B:172:0x03a8, B:176:0x03d0, B:182:0x0542, B:236:0x053a, B:238:0x053f, B:298:0x0417, B:301:0x055a, B:308:0x056c, B:315:0x0580, B:317:0x0584, B:330:0x058b, B:334:0x05d5, B:335:0x05d8, B:337:0x05e2, B:338:0x05ed, B:340:0x05f3, B:343:0x0606, B:345:0x060c, B:347:0x061e, B:349:0x063f, B:362:0x0654, B:363:0x0657), top: B:147:0x0337 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x053f A[Catch: all -> 0x0658, Exception -> 0x065c, TryCatch #10 {Exception -> 0x065c, blocks: (B:168:0x039a, B:172:0x03a8, B:176:0x03d0, B:182:0x0542, B:236:0x053a, B:238:0x053f, B:298:0x0417, B:301:0x055a, B:308:0x056c, B:315:0x0580, B:317:0x0584, B:330:0x058b, B:334:0x05d5, B:335:0x05d8, B:337:0x05e2, B:338:0x05ed, B:340:0x05f3, B:343:0x0606, B:345:0x060c, B:347:0x061e, B:349:0x063f, B:362:0x0654, B:363:0x0657), top: B:147:0x0337 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0542 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x052e A[Catch: all -> 0x0556, Exception -> 0x0558, TryCatch #5 {Exception -> 0x0558, blocks: (B:188:0x0421, B:194:0x0438, B:199:0x045b, B:204:0x047c, B:207:0x049c, B:210:0x04a8, B:213:0x04e0, B:215:0x04e6, B:217:0x04ea, B:218:0x04ec, B:219:0x04f4, B:221:0x04fa, B:222:0x04ff, B:224:0x0506, B:226:0x050f, B:228:0x0516, B:230:0x051e, B:231:0x0524, B:233:0x0528, B:234:0x0532, B:241:0x052e, B:242:0x050a, B:244:0x04f0, B:246:0x04dc, B:252:0x0498, B:254:0x0475), top: B:187:0x0421 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x050a A[Catch: all -> 0x0556, Exception -> 0x0558, TryCatch #5 {Exception -> 0x0558, blocks: (B:188:0x0421, B:194:0x0438, B:199:0x045b, B:204:0x047c, B:207:0x049c, B:210:0x04a8, B:213:0x04e0, B:215:0x04e6, B:217:0x04ea, B:218:0x04ec, B:219:0x04f4, B:221:0x04fa, B:222:0x04ff, B:224:0x0506, B:226:0x050f, B:228:0x0516, B:230:0x051e, B:231:0x0524, B:233:0x0528, B:234:0x0532, B:241:0x052e, B:242:0x050a, B:244:0x04f0, B:246:0x04dc, B:252:0x0498, B:254:0x0475), top: B:187:0x0421 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04f0 A[Catch: all -> 0x0556, Exception -> 0x0558, TryCatch #5 {Exception -> 0x0558, blocks: (B:188:0x0421, B:194:0x0438, B:199:0x045b, B:204:0x047c, B:207:0x049c, B:210:0x04a8, B:213:0x04e0, B:215:0x04e6, B:217:0x04ea, B:218:0x04ec, B:219:0x04f4, B:221:0x04fa, B:222:0x04ff, B:224:0x0506, B:226:0x050f, B:228:0x0516, B:230:0x051e, B:231:0x0524, B:233:0x0528, B:234:0x0532, B:241:0x052e, B:242:0x050a, B:244:0x04f0, B:246:0x04dc, B:252:0x0498, B:254:0x0475), top: B:187:0x0421 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05d5 A[Catch: all -> 0x0658, Exception -> 0x065c, TRY_ENTER, TryCatch #10 {Exception -> 0x065c, blocks: (B:168:0x039a, B:172:0x03a8, B:176:0x03d0, B:182:0x0542, B:236:0x053a, B:238:0x053f, B:298:0x0417, B:301:0x055a, B:308:0x056c, B:315:0x0580, B:317:0x0584, B:330:0x058b, B:334:0x05d5, B:335:0x05d8, B:337:0x05e2, B:338:0x05ed, B:340:0x05f3, B:343:0x0606, B:345:0x060c, B:347:0x061e, B:349:0x063f, B:362:0x0654, B:363:0x0657), top: B:147:0x0337 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05e2 A[Catch: all -> 0x0658, Exception -> 0x065c, TryCatch #10 {Exception -> 0x065c, blocks: (B:168:0x039a, B:172:0x03a8, B:176:0x03d0, B:182:0x0542, B:236:0x053a, B:238:0x053f, B:298:0x0417, B:301:0x055a, B:308:0x056c, B:315:0x0580, B:317:0x0584, B:330:0x058b, B:334:0x05d5, B:335:0x05d8, B:337:0x05e2, B:338:0x05ed, B:340:0x05f3, B:343:0x0606, B:345:0x060c, B:347:0x061e, B:349:0x063f, B:362:0x0654, B:363:0x0657), top: B:147:0x0337 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x063f A[Catch: all -> 0x0658, Exception -> 0x065c, TRY_LEAVE, TryCatch #10 {Exception -> 0x065c, blocks: (B:168:0x039a, B:172:0x03a8, B:176:0x03d0, B:182:0x0542, B:236:0x053a, B:238:0x053f, B:298:0x0417, B:301:0x055a, B:308:0x056c, B:315:0x0580, B:317:0x0584, B:330:0x058b, B:334:0x05d5, B:335:0x05d8, B:337:0x05e2, B:338:0x05ed, B:340:0x05f3, B:343:0x0606, B:345:0x060c, B:347:0x061e, B:349:0x063f, B:362:0x0654, B:363:0x0657), top: B:147:0x0337 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0396 A[Catch: Exception -> 0x0410, all -> 0x0658, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0410, blocks: (B:158:0x036a, B:167:0x037b, B:171:0x03a5, B:183:0x03ec, B:358:0x0396), top: B:148:0x0337 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        SQLiteDatabase sQLiteDatabase2;
        int i2;
        SQLiteCursor sQLiteCursor;
        long j;
        int i3;
        NativeByteBuffer nativeByteBuffer;
        int i4;
        boolean z2;
        ArrayList arrayList;
        SQLiteDatabase sQLiteDatabase3;
        int i5;
        SQLitePreparedStatement executeFast;
        ArrayList arrayList2;
        int i6;
        int i7;
        int i8;
        NativeByteBuffer nativeByteBuffer2;
        int i9;
        NativeByteBuffer nativeByteBuffer3;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageReplyHeader messageReplyHeader2;
        int i10;
        SQLiteDatabase sQLiteDatabase4;
        int i11;
        boolean isEmpty;
        int i12;
        int i13;
        byte b = 3;
        Object obj = null;
        int i14 = 0;
        switch (this.a) {
            case 0:
                jj.c0(((uc7) this.c).currentAccount, (TLRPC.TL_error) this.d, (e) this.e, (TLRPC.TL_channels_editBanned) this.f, Boolean.valueOf(this.b));
                return;
            case 1:
                kf7 kf7Var = (kf7) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z3 = this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.f;
                try {
                    try {
                        try {
                            try {
                                try {
                                    sQLiteDatabase4 = kf7Var.b;
                                    Locale locale = Locale.US;
                                    i11 = message.id;
                                    j = 0;
                                } catch (Exception e) {
                                    e = e;
                                    i = 1;
                                    sQLitePreparedStatement = null;
                                    i2 = i;
                                    sQLitePreparedStatement2 = null;
                                    z = i2;
                                    try {
                                        kf7Var.p(e, z);
                                        sQLiteDatabase2 = kf7Var.b;
                                        if (sQLiteDatabase2 != null) {
                                            sQLiteDatabase2.commitTransaction();
                                        }
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        if (sQLitePreparedStatement2 == null) {
                                            sQLitePreparedStatement2.dispose();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabase = kf7Var.b;
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.commitTransaction();
                                        }
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        if (sQLitePreparedStatement2 != null) {
                                            sQLitePreparedStatement2.dispose();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                j = 0;
                            }
                            try {
                                sQLiteCursor = sQLiteDatabase4.queryFinalized("SELECT uid, read_state, custom_params FROM messages_v2 WHERE mid = " + i11 + " AND uid = " + r47.B0(message) + " LIMIT 1", new Object[0]);
                                try {
                                    try {
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    i3 = 0;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                i3 = 0;
                                sQLiteCursor = null;
                                kf7Var.p(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                nativeByteBuffer = null;
                                kf7Var.b.beginTransaction();
                                if (message.dialog_id == j) {
                                }
                                kf7.K(message);
                                r47.p5(message);
                                NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(message.getObjectSize());
                                message.serializeToStream(nativeByteBuffer4);
                                long e5 = kf7Var.getUserConfig().e();
                                i4 = 0;
                                long j2 = j;
                                ArrayList arrayList5 = null;
                                for (int i15 = 2; i4 < i15; i15 = 2) {
                                }
                                z2 = z3;
                                if (ls6.t(message)) {
                                }
                                if (nativeByteBuffer != null) {
                                }
                                nativeByteBuffer4.reuse();
                                kf7Var.b.commitTransaction();
                                if (z2) {
                                }
                                if (arrayList != null) {
                                }
                                sQLiteDatabase3 = kf7Var.b;
                                if (sQLiteDatabase3 == null) {
                                }
                                sQLiteDatabase3.commitTransaction();
                                return;
                            }
                            if (!sQLiteCursor.next()) {
                                sQLiteCursor.dispose();
                                sQLiteCursor.dispose();
                                sQLiteDatabase3 = kf7Var.b;
                                if (sQLiteDatabase3 == null) {
                                    return;
                                }
                                sQLiteDatabase3.commitTransaction();
                                return;
                            }
                            i3 = sQLiteCursor.intValue(1);
                            try {
                                nativeByteBuffer = sQLiteCursor.byteBufferValue(2);
                                sQLiteCursor.dispose();
                            } catch (Exception e6) {
                                e = e6;
                                kf7Var.p(e, true);
                                if (sQLiteCursor != null) {
                                }
                                nativeByteBuffer = null;
                                kf7Var.b.beginTransaction();
                                if (message.dialog_id == j) {
                                }
                                kf7.K(message);
                                r47.p5(message);
                                NativeByteBuffer nativeByteBuffer42 = new NativeByteBuffer(message.getObjectSize());
                                message.serializeToStream(nativeByteBuffer42);
                                long e52 = kf7Var.getUserConfig().e();
                                i4 = 0;
                                long j22 = j;
                                ArrayList arrayList52 = null;
                                while (i4 < i15) {
                                }
                                z2 = z3;
                                if (ls6.t(message)) {
                                }
                                if (nativeByteBuffer != null) {
                                }
                                nativeByteBuffer42.reuse();
                                kf7Var.b.commitTransaction();
                                if (z2) {
                                }
                                if (arrayList != null) {
                                }
                                sQLiteDatabase3 = kf7Var.b;
                                if (sQLiteDatabase3 == null) {
                                }
                                sQLiteDatabase3.commitTransaction();
                                return;
                            }
                            kf7Var.b.beginTransaction();
                            if (message.dialog_id == j) {
                                r47.B0(message);
                            }
                            kf7.K(message);
                            r47.p5(message);
                            NativeByteBuffer nativeByteBuffer422 = new NativeByteBuffer(message.getObjectSize());
                            message.serializeToStream(nativeByteBuffer422);
                            long e522 = kf7Var.getUserConfig().e();
                            i4 = 0;
                            long j222 = j;
                            ArrayList arrayList522 = null;
                            while (i4 < i15) {
                                int i16 = i4 == r6 ? r6 : i14;
                                boolean z4 = z3;
                                long Z1 = r47.Z1(kf7Var.currentAccount, message, kf7Var.Z(message.dialog_id));
                                int i17 = i4;
                                long j3 = message.dialog_id;
                                try {
                                    if (i16 == 0) {
                                        executeFast = kf7Var.b.executeFast("REPLACE INTO messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?, ?)");
                                    } else if (Z1 == j222) {
                                        arrayList2 = arrayList522;
                                        i4 = i17 + 1;
                                        z3 = z4;
                                        arrayList522 = arrayList2;
                                        r6 = 1;
                                        i14 = 0;
                                    } else {
                                        executeFast = kf7Var.b.executeFast("REPLACE INTO messages_topics VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?)");
                                        if (j3 == e522) {
                                            try {
                                                try {
                                                    if (r47.Q1(e522, message) != j222) {
                                                        ArrayList arrayList6 = arrayList522 == null ? new ArrayList() : arrayList522;
                                                        arrayList6.add(message);
                                                        arrayList2 = arrayList6;
                                                        executeFast.requery();
                                                        executeFast.bindInteger(r6, message.id);
                                                        executeFast.bindLong(2, j3);
                                                        if (i16 == 0) {
                                                            executeFast.bindLong(3, Z1);
                                                            i6 = 4;
                                                        } else {
                                                            i6 = 3;
                                                        }
                                                        int i18 = i6 + 1;
                                                        executeFast.bindInteger(i6, i3);
                                                        executeFast.bindInteger(i18, message.send_state);
                                                        executeFast.bindInteger(i6 + 2, message.date);
                                                        int i19 = i6 + 4;
                                                        executeFast.bindByteBuffer(i6 + 3, nativeByteBuffer422);
                                                        int i20 = i6 + 5;
                                                        executeFast.bindInteger(i19, (!message.out || message.from_scheduled) ? r6 : 0);
                                                        int i21 = i6 + 6;
                                                        executeFast.bindInteger(i20, message.ttl);
                                                        if ((message.flags & 1024) == 0) {
                                                            i7 = i6 + 7;
                                                            executeFast.bindInteger(i21, message.views);
                                                        } else {
                                                            i7 = i6 + 7;
                                                            executeFast.bindInteger(i21, kf7.d0(message));
                                                        }
                                                        if (message.replyStory == null) {
                                                            nativeByteBuffer2 = new NativeByteBuffer(message.replyStory.getObjectSize());
                                                            message.replyStory.serializeToStream(nativeByteBuffer2);
                                                            i8 = i7 + 1;
                                                            executeFast.bindByteBuffer(i7, nativeByteBuffer2);
                                                        } else {
                                                            i8 = i7 + 1;
                                                            executeFast.bindNull(i7);
                                                            nativeByteBuffer2 = null;
                                                        }
                                                        int i22 = message.stickerVerified;
                                                        executeFast.bindInteger(i8, i22 != 0 ? r6 : i22 == 2 ? 2 : 0);
                                                        executeFast.bindInteger(i8 + 1, message.mentioned ? 1 : 0);
                                                        int i23 = i8 + 3;
                                                        executeFast.bindInteger(i8 + 2, message.forwards);
                                                        if (message.replies == null) {
                                                            nativeByteBuffer3 = new NativeByteBuffer(message.replies.getObjectSize());
                                                            message.replies.serializeToStream(nativeByteBuffer3);
                                                            i9 = i8 + 4;
                                                            executeFast.bindByteBuffer(i23, nativeByteBuffer3);
                                                        } else {
                                                            i9 = i8 + 4;
                                                            executeFast.bindNull(i23);
                                                            nativeByteBuffer3 = null;
                                                        }
                                                        messageReplyHeader = message.reply_to;
                                                        int i24 = i9 + 1;
                                                        if (messageReplyHeader == null) {
                                                            int i25 = messageReplyHeader.reply_to_top_id;
                                                            if (i25 == 0) {
                                                                i25 = messageReplyHeader.reply_to_msg_id;
                                                            }
                                                            executeFast.bindInteger(i9, i25);
                                                        } else {
                                                            executeFast.bindInteger(i9, 0);
                                                        }
                                                        int i26 = i24 + 1;
                                                        TLRPC.Peer peer = message.peer_id;
                                                        executeFast.bindLong(i24, peer == null ? peer.channel_id : j222);
                                                        int i27 = i24 + 2;
                                                        if (nativeByteBuffer == null) {
                                                            executeFast.bindByteBuffer(i26, nativeByteBuffer);
                                                        } else {
                                                            executeFast.bindNull(i26);
                                                        }
                                                        if (i16 == 0) {
                                                            if ((message.flags & 131072) != 0) {
                                                                i10 = i27 + 1;
                                                                executeFast.bindLong(i27, message.grouped_id);
                                                            } else {
                                                                i10 = i27 + 1;
                                                                executeFast.bindNull(i27);
                                                            }
                                                            i27 = i10;
                                                        }
                                                        messageReplyHeader2 = message.reply_to;
                                                        if (messageReplyHeader2 == null) {
                                                            executeFast.bindInteger(i27, messageReplyHeader2.story_id);
                                                        } else {
                                                            executeFast.bindInteger(i27, 0);
                                                        }
                                                        executeFast.step();
                                                        executeFast.dispose();
                                                        if (nativeByteBuffer3 != null) {
                                                            nativeByteBuffer3.reuse();
                                                        }
                                                        if (nativeByteBuffer2 == null) {
                                                            nativeByteBuffer2.reuse();
                                                        }
                                                        i4 = i17 + 1;
                                                        z3 = z4;
                                                        arrayList522 = arrayList2;
                                                        r6 = 1;
                                                        i14 = 0;
                                                    }
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    i2 = r6;
                                                    sQLitePreparedStatement = executeFast;
                                                    sQLitePreparedStatement2 = null;
                                                    z = i2;
                                                    kf7Var.p(e, z);
                                                    sQLiteDatabase2 = kf7Var.b;
                                                    if (sQLiteDatabase2 != null) {
                                                    }
                                                    if (sQLitePreparedStatement != null) {
                                                    }
                                                    if (sQLitePreparedStatement2 == null) {
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                sQLitePreparedStatement = executeFast;
                                                sQLitePreparedStatement2 = null;
                                                sQLiteDatabase = kf7Var.b;
                                                if (sQLiteDatabase != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    executeFast.requery();
                                    executeFast.bindInteger(r6, message.id);
                                    executeFast.bindLong(2, j3);
                                    if (i16 == 0) {
                                    }
                                    int i182 = i6 + 1;
                                    executeFast.bindInteger(i6, i3);
                                    executeFast.bindInteger(i182, message.send_state);
                                    executeFast.bindInteger(i6 + 2, message.date);
                                    int i192 = i6 + 4;
                                    executeFast.bindByteBuffer(i6 + 3, nativeByteBuffer422);
                                    int i202 = i6 + 5;
                                    executeFast.bindInteger(i192, (!message.out || message.from_scheduled) ? r6 : 0);
                                    int i212 = i6 + 6;
                                    executeFast.bindInteger(i202, message.ttl);
                                    if ((message.flags & 1024) == 0) {
                                    }
                                    if (message.replyStory == null) {
                                    }
                                    int i222 = message.stickerVerified;
                                    executeFast.bindInteger(i8, i222 != 0 ? r6 : i222 == 2 ? 2 : 0);
                                    executeFast.bindInteger(i8 + 1, message.mentioned ? 1 : 0);
                                    int i232 = i8 + 3;
                                    executeFast.bindInteger(i8 + 2, message.forwards);
                                    if (message.replies == null) {
                                    }
                                    messageReplyHeader = message.reply_to;
                                    int i242 = i9 + 1;
                                    if (messageReplyHeader == null) {
                                    }
                                    int i262 = i242 + 1;
                                    TLRPC.Peer peer2 = message.peer_id;
                                    executeFast.bindLong(i242, peer2 == null ? peer2.channel_id : j222);
                                    int i272 = i242 + 2;
                                    if (nativeByteBuffer == null) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    messageReplyHeader2 = message.reply_to;
                                    if (messageReplyHeader2 == null) {
                                    }
                                    executeFast.step();
                                    executeFast.dispose();
                                    if (nativeByteBuffer3 != null) {
                                    }
                                    if (nativeByteBuffer2 == null) {
                                    }
                                    i4 = i17 + 1;
                                    z3 = z4;
                                    arrayList522 = arrayList2;
                                    r6 = 1;
                                    i14 = 0;
                                } catch (Exception e8) {
                                    e = e8;
                                    sQLitePreparedStatement = executeFast;
                                    i2 = 1;
                                    sQLitePreparedStatement2 = null;
                                    z = i2;
                                    kf7Var.p(e, z);
                                    sQLiteDatabase2 = kf7Var.b;
                                    if (sQLiteDatabase2 != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLitePreparedStatement2 == null) {
                                    }
                                }
                                arrayList2 = arrayList522;
                            }
                            z2 = z3;
                            if (ls6.t(message)) {
                                int i28 = 0;
                                int i29 = 2;
                                while (i28 < i29) {
                                    boolean z5 = i28 == 1;
                                    long Z12 = r47.Z1(kf7Var.currentAccount, message, kf7Var.Z(message.dialog_id));
                                    if (z5 && Z12 == j222) {
                                        i29 = 2;
                                    } else {
                                        SQLiteDatabase sQLiteDatabase5 = kf7Var.b;
                                        SQLitePreparedStatement executeFast2 = i28 == 0 ? sQLiteDatabase5.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)") : sQLiteDatabase5.executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)");
                                        try {
                                            executeFast2.requery();
                                            executeFast2.bindInteger(1, message.id);
                                            i29 = 2;
                                            executeFast2.bindLong(2, message.dialog_id);
                                            if (i28 != 0) {
                                                executeFast2.bindLong(3, Z12);
                                                i5 = 4;
                                            } else {
                                                i5 = 3;
                                            }
                                            executeFast2.bindInteger(i5, message.date);
                                            executeFast2.bindInteger(i5 + 1, ls6.h0(message));
                                            executeFast2.bindByteBuffer(i5 + 2, nativeByteBuffer422);
                                            executeFast2.step();
                                            executeFast2.dispose();
                                        } catch (Exception e9) {
                                            e = e9;
                                            sQLitePreparedStatement2 = executeFast2;
                                            z = 1;
                                            sQLitePreparedStatement = null;
                                            kf7Var.p(e, z);
                                            sQLiteDatabase2 = kf7Var.b;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLitePreparedStatement2 == null) {
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            sQLitePreparedStatement2 = executeFast2;
                                            sQLitePreparedStatement = null;
                                            sQLiteDatabase = kf7Var.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLitePreparedStatement2 != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    i28++;
                                }
                            }
                            if (nativeByteBuffer != null) {
                                nativeByteBuffer.reuse();
                            }
                            nativeByteBuffer422.reuse();
                            kf7Var.b.commitTransaction();
                            if (z2) {
                                HashMap hashMap = new HashMap();
                                HashMap hashMap2 = new HashMap();
                                for (int i30 = 0; i30 < arrayList3.size(); i30++) {
                                    TLRPC.User user = (TLRPC.User) arrayList3.get(i30);
                                    hashMap.put(Long.valueOf(user.id), user);
                                }
                                for (int i31 = 0; i31 < arrayList4.size(); i31++) {
                                    TLRPC.Chat chat = (TLRPC.Chat) arrayList4.get(i31);
                                    hashMap2.put(Long.valueOf(chat.id), chat);
                                }
                                arrayList = arrayList522;
                                r47 r47Var = new r47(kf7Var.currentAccount, message, (AbstractMap) hashMap, (AbstractMap) hashMap2, true, true);
                                ArrayList arrayList7 = new ArrayList();
                                arrayList7.add(r47Var);
                                hl.c3(new gd7((Object) kf7Var, (Object) r47Var, arrayList7, (byte) 4));
                            } else {
                                arrayList = arrayList522;
                            }
                            if (arrayList != null) {
                                hl.c3(new q41(kf7Var, arrayList, (byte) 17));
                            }
                            sQLiteDatabase3 = kf7Var.b;
                            if (sQLiteDatabase3 == null) {
                                return;
                            }
                            sQLiteDatabase3.commitTransaction();
                            return;
                        } catch (Throwable th6) {
                            th = th6;
                            sQLiteCursor = null;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        sQLitePreparedStatement = null;
                        sQLitePreparedStatement2 = null;
                        sQLiteDatabase = kf7Var.b;
                        if (sQLiteDatabase != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLitePreparedStatement2 != null) {
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    i = 1;
                }
                break;
            case 2:
                fi0 fi0Var = (fi0) this.c;
                String str = (String) this.d;
                Bitmap bitmap = (Bitmap) this.e;
                boolean z6 = this.b;
                Bitmap bitmap2 = (Bitmap) this.f;
                if (TextUtils.equals((String) fi0Var.a, str)) {
                    fi0Var.f = null;
                    Bitmap bitmap3 = (Bitmap) fi0Var.c;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    fi0Var.c = bitmap;
                    ((Runnable) fi0Var.e).run();
                } else {
                    bitmap.recycle();
                }
                if (z6) {
                    bitmap2.recycle();
                    return;
                }
                return;
            case 3:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) this.c;
                boolean z7 = this.b;
                String str2 = (String) this.d;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) this.f;
                e eVar = (e) this.e;
                if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                    ym0.d(z7, str2, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, eVar.getParentActivity(), eVar.getResourceProvider());
                    return;
                } else {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ym0.e(z7, str2, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, eVar.getParentActivity(), eVar.getResourceProvider());
                        return;
                    }
                    return;
                }
            case 4:
                r41 r41Var = (r41) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                ArrayList arrayList10 = (ArrayList) this.f;
                boolean z8 = this.b;
                ArrayList arrayList11 = r41Var.b;
                arrayList11.clear();
                arrayList11.addAll(arrayList8);
                int i32 = r41Var.a;
                uc7.s1(i32).j4(arrayList9, true);
                uc7.s1(i32).c4(arrayList10, true);
                jn7.f(i32).k(jn7.F1, new Object[0]);
                r41Var.c = false;
                r41Var.e(false, z8);
                return;
            case 5:
                ((CameraController) this.c).lambda$recordVideo$12((CameraController.ICameraView) this.d, (File) this.e, this.b, (Runnable) this.f);
                return;
            case 6:
                ij1 ij1Var = (ij1) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z9 = this.b;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    ij1Var.G(z9, twoStepVerificationActivity.d0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 7:
                zu1 zu1Var = (zu1) this.c;
                cq1 cq1Var = (cq1) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                pm1 pm1Var = (pm1) this.f;
                boolean z10 = this.b;
                cq1Var.c(false);
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    zu1Var.getMessagesController().j4(tL_contacts_resolvedPeer.users, false);
                    zu1Var.getMessagesController().c4(tL_contacts_resolvedPeer.chats, false);
                    long n = wf3.n(tL_contacts_resolvedPeer.peer);
                    if (n >= 0) {
                        obj = zu1Var.getMessagesController().X1(Long.valueOf(n));
                    } else if (n < 0) {
                        obj = zu1Var.getMessagesController().M0(Long.valueOf(-n));
                    }
                }
                pm1Var.a(obj, Boolean.valueOf(z10));
                return;
            case 8:
                a();
                return;
            case 9:
                boolean[] zArr = (boolean[]) this.c;
                mm3 mm3Var = (mm3) this.d;
                String str3 = (String) this.e;
                int[] iArr = (int[]) this.f;
                boolean z11 = this.b;
                nm3[] nm3VarArr = DictationAsr.a;
                if (zArr[0]) {
                    return;
                }
                mm3Var.a(str3, iArr, z11);
                return;
            case 10:
                xt3 xt3Var = (xt3) this.c;
                boolean z12 = this.b;
                xs0 xs0Var = (xs0) this.d;
                String str4 = (String) this.e;
                TextView textView = (TextView) this.f;
                ClipboardManager clipboardManager = (ClipboardManager) xt3Var.getContext().getSystemService("clipboard");
                r6 = (z12 && (TextUtils.isEmpty(xs0Var.getText()) || TextUtils.equals(xs0Var.getText().toString(), str4)) && clipboardManager != null && clipboardManager.hasPrimaryClip()) ? 1 : 0;
                ik8.t(textView.animate().alpha(r6 != 0 ? 1.0f : 0.0f).scaleX(r6 != 0 ? 1.0f : 0.7f).scaleY(r6 == 0 ? 0.7f : 1.0f), k43.h, 300L);
                return;
            case 11:
                fw3 fw3Var = (fw3) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                boolean z13 = this.b;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) this.e;
                String str5 = (String) this.f;
                hw3 hw3Var = fw3Var.s;
                ArrayList arrayList12 = hw3Var.n;
                if (fw3Var.r) {
                    if (!(tLObject3 instanceof TLRPC.messages_BotResults)) {
                        zw3 zw3Var = hw3Var.r;
                        int i33 = zw3.C1;
                        fw3Var.d = ConnectionsManager.getInstance(zw3Var.a).sendRequest(tL_messages_getInlineBotResults, new vi1(fw3Var, str5, z13, b));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject3;
                    fw3Var.h = messages_botresults.next_offset;
                    if (z13) {
                        arrayList12.clear();
                    }
                    arrayList12.size();
                    arrayList12.addAll(messages_botresults.results);
                    fw3Var.f();
                    hw3Var.d.c(false);
                    fw3Var.r = false;
                    return;
                }
                return;
            case 12:
                b();
                return;
            case 13:
                q84 q84Var = (q84) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.e;
                boolean z14 = this.b;
                id idVar = (id) this.f;
                if (tLObject4 instanceof TLRPC.Updates) {
                    Utilities.d.c(new vx3(q84Var, tLObject4, (byte) 12));
                    e S = LaunchActivity.S();
                    if (S != null && ((isEmpty = TextUtils.isEmpty(tL_textWithEntities.text)) || !z14)) {
                        d31 b0 = d31.b0(S);
                        if (isEmpty) {
                            i12 = R.raw.ic_delete;
                            i13 = 2131750818;
                        } else {
                            i12 = R.raw.contact_check;
                            i13 = 2131750816;
                        }
                        bs2.v(null, i13, b0, i12, 36);
                    }
                }
                idVar.dismiss();
                return;
            case 14:
                c();
                return;
            case 15:
                d();
                return;
            case 16:
                e();
                return;
            case 17:
                f();
                return;
            case 18:
                g();
                return;
            case 19:
                h();
                return;
            case 20:
                i();
                return;
            case 21:
                j();
                return;
            case 22:
                k();
                return;
            case 23:
                l();
                return;
            default:
                u8c u8cVar = (u8c) this.c;
                boolean[] zArr2 = (boolean[]) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                boolean z15 = this.b;
                pcc pccVar = (pcc) this.f;
                ArrayList arrayList14 = u8cVar.b;
                HashSet hashSet = new HashSet();
                ArrayList arrayList15 = new ArrayList();
                for (int i34 = 0; i34 < zArr2.length; i34++) {
                    if (zArr2[i34]) {
                        t8c t8cVar = (t8c) arrayList13.get(i34);
                        arrayList15.add(t8cVar);
                        hashSet.add(Long.valueOf(t8cVar.b));
                    }
                }
                if (!z15) {
                    int i35 = 0;
                    while (i35 < arrayList14.size()) {
                        if (hashSet.contains(Long.valueOf(((t8c) arrayList14.get(i35)).b))) {
                            arrayList14.remove(i35);
                            i35--;
                        }
                        i35++;
                    }
                    if (!hashSet.isEmpty()) {
                        u8cVar.d();
                        jn7.f(u8cVar.a).k(jn7.f3, new Object[0]);
                        u8cVar.e();
                    }
                }
                pccVar.a(arrayList15);
                return;
        }
    }

    public /* synthetic */ va7(Object obj, Object obj2, Object obj3, Object obj4, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
    }

    public /* synthetic */ va7(Object obj, Object obj2, Object obj3, boolean z, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
        this.f = obj4;
    }

    public /* synthetic */ va7(Object obj, Object obj2, boolean z, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ va7(Object obj, boolean z, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ va7(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z, String str, long j, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, e eVar) {
        this.a = (byte) 3;
        this.c = payments_giveawayinfo;
        this.b = z;
        this.d = str;
        this.f = tL_messageMediaGiveaway;
        this.e = eVar;
    }

    public /* synthetic */ va7(e eVar, Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.e = eVar;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
        this.b = z;
    }
}
