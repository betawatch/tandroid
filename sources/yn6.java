// default package

import android.app.Activity;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.q;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yn6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yn6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        if (r12 != null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121 A[Catch: Exception -> 0x012a, TryCatch #2 {Exception -> 0x012a, blocks: (B:3:0x000e, B:5:0x0015, B:8:0x001e, B:10:0x002b, B:11:0x002e, B:13:0x003b, B:15:0x0043, B:17:0x0054, B:19:0x005a, B:21:0x0062, B:23:0x006a, B:58:0x010b, B:60:0x0110, B:61:0x0113, B:66:0x0121, B:68:0x0126, B:69:0x0129), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126 A[Catch: Exception -> 0x012a, TryCatch #2 {Exception -> 0x012a, blocks: (B:3:0x000e, B:5:0x0015, B:8:0x001e, B:10:0x002b, B:11:0x002e, B:13:0x003b, B:15:0x0043, B:17:0x0054, B:19:0x005a, B:21:0x0062, B:23:0x006a, B:58:0x010b, B:60:0x0110, B:61:0x0113, B:66:0x0121, B:68:0x0126, B:69:0x0129), top: B:2:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream;
        id idVar = (id) this.c;
        Activity activity = (Activity) this.d;
        RectF rectF = ProfileActivity.Z6;
        try {
            File O0 = hl.O0();
            byte b = 0;
            if (O0 == null) {
                hl.c3(new uc(idVar, b));
                return;
            }
            File file = new File(O0, "logs.zip");
            if (file.exists()) {
                file.delete();
            }
            ArrayList arrayList = new ArrayList();
            for (File file2 : O0.listFiles()) {
                arrayList.add(file2);
            }
            File file3 = new File(a.h(), "malformed_database/");
            if (file3.exists() && file3.isDirectory()) {
                for (File file4 : file3.listFiles()) {
                    arrayList.add(file4);
                }
            }
            boolean z = true;
            boolean[] zArr = new boolean[1];
            long currentTimeMillis = System.currentTimeMillis();
            try {
                zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                try {
                    byte[] bArr = new byte[65536];
                    int i = 0;
                    while (i < arrayList.size()) {
                        File file5 = (File) arrayList.get(i);
                        boolean z2 = z;
                        if ((file5.getName().contains("cache4") || ((!this.b && !file5.getName().contains("_mtproto")) || currentTimeMillis - file5.lastModified() <= 86400000)) && file5.exists() && !file5.isDirectory()) {
                            bufferedInputStream = new BufferedInputStream(new FileInputStream(file5), 65536);
                            try {
                                try {
                                    zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                    while (true) {
                                        int read = bufferedInputStream.read(bArr, 0, 65536);
                                        if (read == -1) {
                                            break;
                                        } else {
                                            zipOutputStream.write(bArr, 0, read);
                                        }
                                    }
                                    bufferedInputStream.close();
                                } catch (Exception e) {
                                    e = e;
                                    e.printStackTrace();
                                    if (bufferedInputStream != null) {
                                        bufferedInputStream.close();
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                                if (zipOutputStream != null) {
                                    zipOutputStream.close();
                                }
                                throw th;
                            }
                        }
                        i++;
                        z = z2;
                    }
                    zArr[0] = z;
                } catch (Exception e2) {
                    e = e2;
                    bufferedInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = null;
                    if (bufferedInputStream != null) {
                    }
                    if (zipOutputStream != null) {
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                bufferedInputStream = null;
                zipOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
                zipOutputStream = null;
            }
            zipOutputStream.close();
            hl.c3(new vp8((Object) idVar, (Object) zArr, (Object) activity, (Object) file, (byte) 0));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private final void b() {
        pi9 pi9Var = (pi9) this.c;
        xl9 xl9Var = (xl9) this.d;
        boolean z = this.b;
        boolean z2 = !z;
        zl9 zl9Var = xl9Var.w;
        Iterator it = xl9Var.I.iterator();
        while (it.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
            am9 m = zl9Var.m(pagetablecell);
            if (m == null) {
                boolean z3 = true;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ajb.h(pagetablecell));
                if (spannableStringBuilder.length() <= 0 || (mm9.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) == 0) {
                    z3 = false;
                }
                ajb.l(pagetablecell, z2);
                if (z) {
                    if (z3) {
                        mm9.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                    }
                } else if (spannableStringBuilder.length() > 0) {
                    mm9.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                }
                ajb.d(pagetablecell, spannableStringBuilder);
            } else if (m.b != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m.a.getText());
                boolean z4 = spannableStringBuilder2.length() > 0 && (mm9.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                ajb.l(m.b, z2);
                if (z) {
                    if (z4) {
                        mm9.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                    }
                } else if (spannableStringBuilder2.length() > 0) {
                    mm9.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                }
                ajb.d(m.b, spannableStringBuilder2);
                m.b(m.b);
            }
        }
        zl9Var.invalidate();
        xh9 xh9Var = xl9Var.F;
        if (xh9Var != null && xl9Var.a != null) {
            xh9Var.a();
        }
        pi9Var.J2();
    }

    private final void c() {
        e eVar = (e) this.c;
        oi9 oi9Var = (oi9) this.d;
        oi9Var.f.l3(true);
        cj9.k(eVar, this.b, new zi9(oi9Var, (byte) 2));
    }

    private final void d() {
        xn9 xn9Var = (xn9) this.c;
        boolean z = this.b;
        fn9 fn9Var = (fn9) this.d;
        if (xn9Var.f) {
            xn9Var.F = z;
            Size size = z ? xn9Var.c : xn9Var.b;
            xn9Var.a = size;
            int i = z ? xn9Var.l : xn9Var.k;
            xn9Var.j = i;
            xn9Var.m = z ? xn9Var.o : xn9Var.n;
            ho9 ho9Var = xn9Var.N;
            if (ho9Var != null) {
                ho9Var.c = size;
                ho9Var.d = i;
                ho9Var.v();
                ho9Var.B = false;
                ho9Var.A = 0L;
            }
            xn9Var.Q = -1L;
            xn9Var.v0 = fn9Var;
            xn9Var.i.b("GL dual input selected: input=" + (z ? 1 : 0));
        }
    }

    private final void e() {
        int i;
        long cameraFlipElapsedMs;
        pq8 pq8Var = (pq8) this.c;
        ln9 ln9Var = (ln9) this.d;
        jp9 jp9Var = (jp9) pq8Var.b;
        int i2 = jp9Var.a0;
        if (i2 == 7 || i2 == 8 || i2 == 9 || i2 == 10) {
            return;
        }
        cp9 cp9Var = ln9Var.a;
        ep9 ep9Var = ln9Var.c;
        dp9 dp9Var = ln9Var.b;
        jp9Var.s = cp9Var;
        jp9Var.t = dp9Var;
        jp9Var.u = ep9Var;
        jp9Var.v = ln9Var.e;
        if (cp9Var == cp9.a) {
            if (jp9Var.f != null) {
                i = 3;
            }
            i = 1;
        } else {
            if (ln9Var.f) {
                i = 2;
            }
            i = 1;
        }
        jp9Var.b0 = i;
        jp9Var.n();
        sn9 sn9Var = jp9Var.m;
        StringBuilder sb = new StringBuilder("camera configured: facing=");
        sb.append(cp9Var);
        sb.append(", mode=");
        sb.append(dp9Var);
        sb.append(", recording=");
        sb.append(ln9Var.d);
        sb.append(", fps=");
        sb.append((int) ep9Var.a);
        sb.append(", maxZoom=");
        sb.append(jp9Var.v);
        sb.append(", flash=");
        int i3 = jp9Var.b0;
        sb.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
        sb.append(", switch=");
        boolean z = this.b;
        sb.append(z);
        sn9Var.b(sb.toString());
        if (z || jp9Var.y) {
            jp9Var.y = false;
            q qVar = (q) jp9Var.d.b;
            qVar.r0 = true;
            StringBuilder sb2 = new StringBuilder("RoundVideo camera flip session ready: facing=");
            sb2.append(cp9Var);
            sb2.append(", elapsedMs=");
            cameraFlipElapsedMs = qVar.getCameraFlipElapsedMs();
            sb2.append(cameraFlipElapsedMs);
            cc4.b(sb2.toString());
            qVar.q();
            jp9Var.o();
        }
    }

    private final void f() {
        xd5 xd5Var = (xd5) this.c;
        en9 en9Var = (en9) this.d;
        if (this.b) {
            uc7.s1(xd5Var.a).n0(true);
            en9Var.run();
        } else {
            e S = LaunchActivity.S();
            if (S == null) {
                return;
            } else {
                S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.o0(3)));
            }
        }
        xd5Var.dismiss();
    }

    private final void g() {
        Runnable runnable = (Runnable) this.c;
        fu5 fu5Var = (fu5) this.d;
        runnable.run();
        if (this.b) {
            fu5Var.u();
        }
    }

    private final void h() {
        ((icc) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void i() {
        ((iv4) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void j() {
        ((qe2) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void k() {
        ((TwoStepVerificationActivity) this.c).m0((byte[]) this.d, this.b);
    }

    private final void l() {
        ((VideoCapturerDevice) this.c).lambda$init$4(this.b, (String) this.d);
    }

    private final void m() {
        rjc rjcVar = (rjc) this.c;
        nn3 nn3Var = (nn3) this.d;
        njc njcVar = rjcVar.r;
        if (njcVar != null) {
            njcVar.detachCurrent();
            rjcVar.r.d(this.b);
        }
        if (nn3Var != null) {
            nn3Var.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04c0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int writeFrame;
        SQLiteCursor queryFinalized;
        TLRPC.Message message;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor queryFinalized2;
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor2;
        SQLitePreparedStatement sQLitePreparedStatement2;
        String str;
        int i2;
        int i3;
        SQLitePreparedStatement sQLitePreparedStatement3;
        SQLitePreparedStatement executeFast2;
        int i4;
        int i5;
        byte b = this.a;
        byte b2 = 2;
        SQLitePreparedStatement sQLitePreparedStatement4 = null;
        boolean z = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                zz3 zz3Var = (zz3) obj2;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                MediaController mediaController = (MediaController) zz3Var.b;
                while (byteBuffer.hasRemaining()) {
                    int remaining = byteBuffer.remaining();
                    ByteBuffer byteBuffer2 = mediaController.z1;
                    if (remaining > byteBuffer2.remaining()) {
                        i = byteBuffer.limit();
                        byteBuffer.limit(byteBuffer.position() + byteBuffer2.remaining());
                    } else {
                        i = -1;
                    }
                    byteBuffer2.put(byteBuffer);
                    if (byteBuffer2.position() == byteBuffer2.limit() || z) {
                        writeFrame = mediaController.writeFrame(byteBuffer2, !z ? byteBuffer2.limit() : byteBuffer.position());
                        if (writeFrame != 0) {
                            byteBuffer2.rewind();
                            mediaController.l1 += (byteBuffer2.limit() / 2) / (mediaController.B1 / 1000);
                            mediaController.m1++;
                        } else {
                            cc4.d("writing frame failed");
                        }
                    }
                    if (i != -1) {
                        byteBuffer.limit(i);
                    }
                }
                mediaController.N1.c(new mn6(zz3Var, byteBuffer, b2));
                return;
            case 1:
                ls6 ls6Var = (ls6) obj2;
                if7 if7Var = (if7) obj;
                try {
                    if (if7Var.b != 0) {
                        SQLiteDatabase sQLiteDatabase = ls6Var.getMessagesStorage().b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT info FROM bot_keyboard_topics WHERE uid = " + if7Var.a + " AND tid = " + if7Var.b, new Object[0]);
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = ls6Var.getMessagesStorage().b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT info FROM bot_keyboard WHERE uid = " + if7Var.a, new Object[0]);
                    }
                    if (!queryFinalized.next() || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        message = null;
                    } else {
                        message = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (message != null || z) {
                        hl.c3(new xp6(ls6Var, message, if7Var));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 2:
                jf7 jf7Var = (jf7) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                TLRPC.User user = userFull.user;
                long j = user != null ? user.id : userFull.id;
                if (z) {
                    try {
                        queryFinalized2 = jf7Var.b.queryFinalized("SELECT uid FROM user_settings WHERE uid = " + j, new Object[0]);
                    } catch (Exception e2) {
                        e = e2;
                        sQLitePreparedStatement = null;
                        sQLiteCursor = null;
                        try {
                            jf7Var.n(e, true);
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = null;
                        sQLiteCursor = null;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                    try {
                        boolean next = queryFinalized2.next();
                        queryFinalized2.dispose();
                        if (!next) {
                            return;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        sQLiteCursor = queryFinalized2;
                        sQLitePreparedStatement = null;
                        jf7Var.n(e, true);
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteCursor = queryFinalized2;
                        sQLitePreparedStatement = null;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                }
                SQLitePreparedStatement executeFast3 = jf7Var.b.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(userFull.getObjectSize());
                    userFull.serializeToStream(nativeByteBuffer);
                    executeFast3.bindLong(1, j);
                    executeFast3.bindByteBuffer(2, nativeByteBuffer);
                    executeFast3.bindInteger(3, userFull.pinned_msg_id);
                    executeFast3.step();
                    executeFast3.dispose();
                    nativeByteBuffer.reuse();
                    if ((userFull.flags & 2048) != 0) {
                        executeFast = jf7Var.b.executeFast("UPDATE dialogs SET folder_id = ? WHERE did = ?");
                        try {
                            executeFast.bindInteger(1, userFull.folder_id);
                            executeFast.bindLong(2, j);
                            executeFast.step();
                            executeFast.dispose();
                            jf7Var.K.l(j);
                        } catch (Exception e4) {
                            e = e4;
                            sQLitePreparedStatement = executeFast;
                            sQLiteCursor = null;
                            jf7Var.n(e, true);
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sQLitePreparedStatement = executeFast;
                            sQLiteCursor = null;
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    if ((userFull.flags & TLObject.FLAG_14) != 0) {
                        executeFast = jf7Var.b.executeFast("UPDATE dialogs SET ttl_period = ? WHERE did = ?");
                        executeFast.bindInteger(1, userFull.ttl_period);
                        executeFast.bindLong(2, j);
                        executeFast.step();
                        executeFast.dispose();
                        return;
                    }
                    return;
                } catch (Exception e5) {
                    e = e5;
                    sQLitePreparedStatement = executeFast3;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = executeFast3;
                }
            case 3:
                jf7 jf7Var2 = (jf7) obj2;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj;
                try {
                    SQLiteCursor queryFinalized3 = jf7Var2.b.queryFinalized("SELECT online, inviter, links FROM chat_settings_v2 WHERE uid = " + chatFull.id, new Object[0]);
                    try {
                        if (queryFinalized3.next()) {
                            i2 = queryFinalized3.intValue(0);
                            str = "UPDATE dialogs SET ttl_period = ? WHERE did = ?";
                            chatFull.inviterId = queryFinalized3.longValue(1);
                            i3 = queryFinalized3.intValue(2);
                        } else {
                            str = "UPDATE dialogs SET ttl_period = ? WHERE did = ?";
                            i2 = -1;
                            i3 = 0;
                        }
                        queryFinalized3.dispose();
                        if (z && i2 == -1) {
                            return;
                        }
                        if (i2 >= 0 && (chatFull.flags & TLObject.FLAG_13) == 0) {
                            chatFull.online_count = i2;
                        }
                        if (i3 >= 0) {
                            chatFull.invitesCount = i3;
                        }
                        SQLitePreparedStatement executeFast4 = jf7Var2.b.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                        try {
                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(chatFull.getObjectSize());
                            chatFull.serializeToStream(nativeByteBuffer2);
                            executeFast4.bindLong(1, chatFull.id);
                            executeFast4.bindByteBuffer(2, nativeByteBuffer2);
                            executeFast4.bindInteger(3, chatFull.pinned_msg_id);
                            executeFast4.bindInteger(4, chatFull.online_count);
                            executeFast4.bindLong(5, chatFull.inviterId);
                            executeFast4.bindInteger(6, chatFull.invitesCount);
                            executeFast4.bindInteger(7, chatFull.participants_count);
                            executeFast4.step();
                            executeFast4.dispose();
                            nativeByteBuffer2.reuse();
                            if (chatFull instanceof TLRPC.TL_channelFull) {
                                SQLiteCursor queryFinalized4 = jf7Var2.b.queryFinalized("SELECT inbox_max, outbox_max FROM dialogs WHERE did = " + (-chatFull.id), new Object[0]);
                                try {
                                    if (!queryFinalized4.next() || queryFinalized4.intValue(0) >= chatFull.read_inbox_max_id) {
                                        sQLitePreparedStatement3 = null;
                                    } else {
                                        int intValue = queryFinalized4.intValue(1);
                                        sQLitePreparedStatement3 = jf7Var2.b.executeFast("UPDATE dialogs SET unread_count = ?, inbox_max = ?, outbox_max = ? WHERE did = ?");
                                        try {
                                            sQLitePreparedStatement3.bindInteger(1, chatFull.unread_count);
                                            sQLitePreparedStatement3.bindInteger(2, chatFull.read_inbox_max_id);
                                            sQLitePreparedStatement3.bindInteger(3, Math.max(intValue, chatFull.read_outbox_max_id));
                                            sQLitePreparedStatement3.bindLong(4, -chatFull.id);
                                            sQLitePreparedStatement3.step();
                                            sQLitePreparedStatement3.dispose();
                                        } catch (Exception e6) {
                                            e = e6;
                                            sQLiteCursor2 = queryFinalized4;
                                            sQLitePreparedStatement2 = sQLitePreparedStatement3;
                                            try {
                                                jf7Var2.n(e, true);
                                                if (sQLiteCursor2 != null) {
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                if (sQLiteCursor2 != null) {
                                                    sQLiteCursor2.dispose();
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                    sQLitePreparedStatement2.dispose();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            sQLiteCursor2 = queryFinalized4;
                                            sQLitePreparedStatement2 = sQLitePreparedStatement3;
                                            if (sQLiteCursor2 != null) {
                                            }
                                            if (sQLitePreparedStatement2 != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    queryFinalized4.dispose();
                                } catch (Exception e7) {
                                    e = e7;
                                    sQLiteCursor2 = queryFinalized4;
                                    sQLitePreparedStatement2 = null;
                                    jf7Var2.n(e, true);
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th8) {
                                    th = th8;
                                    sQLiteCursor2 = queryFinalized4;
                                    sQLitePreparedStatement2 = null;
                                    if (sQLiteCursor2 != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                sQLitePreparedStatement3 = null;
                            }
                            try {
                                if ((chatFull.flags & 2048) != 0) {
                                    executeFast2 = jf7Var2.b.executeFast("UPDATE dialogs SET folder_id = ? WHERE did = ?");
                                    try {
                                        executeFast2.bindInteger(1, chatFull.folder_id);
                                        executeFast2.bindLong(2, -chatFull.id);
                                        executeFast2.step();
                                        executeFast2.dispose();
                                        jf7Var2.K.l(-chatFull.id);
                                        sQLitePreparedStatement3 = null;
                                    } catch (Exception e8) {
                                        e = e8;
                                        sQLitePreparedStatement2 = executeFast2;
                                        sQLiteCursor2 = null;
                                        jf7Var2.n(e, true);
                                        if (sQLiteCursor2 != null) {
                                        }
                                        if (sQLitePreparedStatement2 != null) {
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        sQLitePreparedStatement2 = executeFast2;
                                        sQLiteCursor2 = null;
                                        if (sQLiteCursor2 != null) {
                                        }
                                        if (sQLitePreparedStatement2 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                executeFast2 = jf7Var2.b.executeFast(str);
                                executeFast2.bindInteger(1, chatFull.ttl_period);
                                executeFast2.bindLong(2, -chatFull.id);
                                executeFast2.step();
                                executeFast2.dispose();
                                return;
                            } catch (Exception e9) {
                                e = e9;
                                sQLitePreparedStatement2 = sQLitePreparedStatement3;
                            } catch (Throwable th10) {
                                th = th10;
                                sQLitePreparedStatement2 = sQLitePreparedStatement3;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            sQLitePreparedStatement2 = executeFast4;
                        } catch (Throwable th11) {
                            th = th11;
                            sQLitePreparedStatement2 = executeFast4;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        sQLiteCursor2 = queryFinalized3;
                    } catch (Throwable th12) {
                        th = th12;
                        sQLiteCursor2 = queryFinalized3;
                    }
                } catch (Exception e12) {
                    e = e12;
                    sQLiteCursor2 = null;
                } catch (Throwable th13) {
                    th = th13;
                    sQLiteCursor2 = null;
                }
                break;
            case 4:
                jf7 jf7Var3 = (jf7) obj2;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) obj;
                try {
                    try {
                        sQLitePreparedStatement4 = jf7Var3.b.executeFast("UPDATE enc_chats SET seq_in = ?, seq_out = ?, use_count = ?, in_seq_no = ?, mtproto_seq = ? WHERE uid = ?");
                        sQLitePreparedStatement4.bindInteger(1, encryptedChat.seq_in);
                        sQLitePreparedStatement4.bindInteger(2, encryptedChat.seq_out);
                        sQLitePreparedStatement4.bindInteger(3, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                        sQLitePreparedStatement4.bindInteger(4, encryptedChat.in_seq_no);
                        sQLitePreparedStatement4.bindInteger(5, encryptedChat.mtproto_seq);
                        sQLitePreparedStatement4.bindInteger(6, encryptedChat.id);
                        sQLitePreparedStatement4.step();
                        if (z && (i4 = encryptedChat.in_seq_no) != 0) {
                            long j2 = (int) (encryptedChat.id & 4294967295L);
                            SQLiteDatabase sQLiteDatabase3 = jf7Var3.b;
                            Locale locale3 = Locale.US;
                            sQLiteDatabase3.executeFast("DELETE FROM messages_v2 WHERE mid IN (SELECT m.mid FROM messages_v2 as m LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE m.uid = " + j2 + " AND m.date = 0 AND m.mid < 0 AND s.seq_out <= " + i4 + ") AND uid = " + j2).stepThis().dispose();
                        }
                    } catch (Throwable th14) {
                        if (sQLitePreparedStatement4 != null) {
                            sQLitePreparedStatement4.dispose();
                        }
                        throw th14;
                    }
                } catch (Exception e13) {
                    jf7Var3.n(e13, true);
                    if (sQLitePreparedStatement4 == null) {
                        return;
                    }
                }
                sQLitePreparedStatement4.dispose();
                return;
            case 5:
                jf7 jf7Var4 = (jf7) obj2;
                jf7Var4.u1((ac7) obj, z);
                jf7Var4.i(false);
                hl.c3(new be7(jf7Var4, (byte) 17));
                return;
            case 6:
                fz7 fz7Var = (fz7) obj2;
                hh7 hh7Var = (hh7) obj;
                if (z) {
                    hh7Var.v(true);
                } else {
                    hh7Var.w();
                }
                fz7Var.a(hh7Var);
                return;
            case 7:
                nh6 nh6Var = (nh6) obj2;
                hh7 hh7Var2 = (hh7) obj;
                if (z) {
                    hh7Var2.v(true);
                } else {
                    hh7Var2.w();
                }
                ((fz7) nh6Var.b).a(hh7Var2);
                return;
            case 8:
                ((b18) obj2).w1((String) obj, z);
                return;
            case 9:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                b18 b18Var = ((r08) obj2).e;
                if (!z) {
                    b18Var.Q1(true, false);
                    if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                        b18Var.D1(true);
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        b18Var.P1(ob6.M0(R.string.AppName, null), tL_error.text);
                        return;
                    } else {
                        int intValue2 = Utilities.z(tL_error.text).intValue();
                        b18Var.P1(ob6.M0(R.string.AppName, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue2 < 60 ? ob6.G(intValue2, "Seconds", new Object[0]) : ob6.G(intValue2 / 60, "Minutes", new Object[0])));
                        return;
                    }
                }
                i5 = ((e) b18Var).currentAccount;
                yac.h(i5).t();
                b18Var.O0 = (byte) 0;
                b18Var.V1();
                ViewGroup[] viewGroupArr = b18Var.a0;
                if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                    return;
                }
                b18Var.Z[0].requestFocus();
                hl.E3(b18Var.Z[0]);
                return;
            case 10:
                c34 c34Var = (c34) obj2;
                h18 h18Var = (h18) obj;
                e S = LaunchActivity.S();
                if (c34Var.a) {
                    return;
                }
                if (S == null) {
                    c34Var.f();
                    return;
                } else {
                    if (!z) {
                        S.presentFragment(h18Var);
                        return;
                    }
                    bg0 bg0Var = new bg0();
                    bg0Var.a = true;
                    S.showAsSheet(h18Var, bg0Var);
                    return;
                }
            case 11:
                ((l98) obj2).d0((TLObject) obj, z);
                return;
            case 12:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                View view = (View) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (!z) {
                    view.setVisibility(8);
                }
                photoViewer.D2();
                return;
            case 13:
                PhotoViewer photoViewer2 = (PhotoViewer) obj2;
                String str2 = (String) obj;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                if (str2.equals(photoViewer2.B4.R)) {
                    photoViewer2.v4 = z ? (byte) 1 : (byte) 0;
                    photoViewer2.w4 = str2;
                    return;
                }
                return;
            case 14:
                mj8 mj8Var = (mj8) obj2;
                q9c q9cVar = mj8Var.c;
                ArrayList arrayList = (ArrayList) obj;
                if (z) {
                    arrayList = mj8Var.e;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                if (q9cVar.canScrollVertically(1)) {
                    for (int i6 = 0; i6 < q9cVar.getChildCount(); i6++) {
                        if (!(q9cVar.getChildAt(i6) instanceof tk4)) {
                        }
                    }
                    return;
                }
                mj8Var.a(false);
                return;
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                RectF rectF = ProfileActivity.Z6;
                if (!z || profileActivity.P4 != -1) {
                    profileActivity.f4();
                    wr8 wr8Var = profileActivity.d;
                    if (wr8Var != null) {
                        wr8Var.f();
                        return;
                    }
                    return;
                }
                ap8 ap8Var = profileActivity.a0;
                if (ap8Var != null) {
                    xo8 i7 = ap8.i(7, ap8Var.a);
                    if (i7 != null && i7.s) {
                        i7.s = false;
                        ap8Var.invalidate();
                    }
                    if (zArr[0]) {
                        ap8 ap8Var2 = profileActivity.a0;
                        ap8Var2.G = true;
                        ap8Var2.o(7, false);
                        profileActivity.a0.o(9, true);
                        ap8 ap8Var3 = profileActivity.a0;
                        if (ap8Var3.G) {
                            ap8Var3.G = false;
                            ap8Var3.d();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                a();
                return;
            case 17:
                b();
                return;
            case 18:
                c();
                return;
            case 19:
                d();
                return;
            case 20:
                e();
                return;
            case 21:
                f();
                return;
            case 22:
                g();
                return;
            case 23:
                h();
                return;
            case 24:
                i();
                return;
            case 25:
                j();
                return;
            case 26:
                k();
                return;
            case 27:
                l();
                return;
            case 28:
                m();
                return;
            default:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$55((ArrayList) obj, z);
                return;
        }
    }

    public /* synthetic */ yn6(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
