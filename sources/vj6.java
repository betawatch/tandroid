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
import java.util.HashMap;
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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vj6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vj6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    private final void a() {
        int i;
        lx7 lx7Var = (lx7) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        vx7 vx7Var = lx7Var.e;
        if (!this.b) {
            vx7Var.P1(true, false);
            if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                vx7Var.C1(true);
                return;
            } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                vx7Var.O1(k96.M0(R.string.AppName, null), tL_error.text);
                return;
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                vx7Var.O1(k96.M0(R.string.AppName, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
                return;
            }
        }
        i = ((d) vx7Var).currentAccount;
        y6c.h(i).t();
        vx7Var.O0 = (byte) 0;
        vx7Var.U1();
        ViewGroup[] viewGroupArr = vx7Var.a0;
        if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
            return;
        }
        vx7Var.Z[0].requestFocus();
        gl.E3(vx7Var.Z[0]);
    }

    private final void b() {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        View view = (View) this.d;
        Drawable[] drawableArr = PhotoViewer.d9;
        if (!this.b) {
            view.setVisibility(8);
        }
        photoViewer.D2();
    }

    private final void c() {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        String str = (String) this.d;
        Drawable[] drawableArr = PhotoViewer.d9;
        if (str.equals(photoViewer.B4.R)) {
            photoViewer.v4 = this.b ? (byte) 1 : (byte) 0;
            photoViewer.w4 = str;
        }
    }

    private final void d() {
        yf8 yf8Var = (yf8) this.c;
        q5c q5cVar = yf8Var.c;
        ArrayList arrayList = (ArrayList) this.d;
        if (this.b) {
            arrayList = yf8Var.e;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (q5cVar.canScrollVertically(1)) {
            for (int i = 0; i < q5cVar.getChildCount(); i++) {
                if (!(q5cVar.getChildAt(i) instanceof pi4)) {
                }
            }
            return;
        }
        yf8Var.a(false);
    }

    private final void e() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean[] zArr = (boolean[]) this.d;
        RectF rectF = ProfileActivity.Z6;
        if (!this.b || profileActivity.P4 != -1) {
            profileActivity.e4();
            ko8 ko8Var = profileActivity.d;
            if (ko8Var != null) {
                ko8Var.f();
                return;
            }
            return;
        }
        pl8 pl8Var = profileActivity.a0;
        if (pl8Var != null) {
            ml8 i = pl8.i(7, pl8Var.a);
            if (i != null && i.s) {
                i.s = false;
                pl8Var.invalidate();
            }
            if (zArr[0]) {
                pl8 pl8Var2 = profileActivity.a0;
                pl8Var2.G = true;
                pl8Var2.o(7, false);
                profileActivity.a0.o(9, true);
                pl8 pl8Var3 = profileActivity.a0;
                if (pl8Var3.G) {
                    pl8Var3.G = false;
                    pl8Var3.d();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        if (r12 != null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122 A[Catch: Exception -> 0x012b, TryCatch #2 {Exception -> 0x012b, blocks: (B:3:0x000e, B:5:0x0015, B:8:0x001e, B:10:0x002b, B:11:0x002e, B:13:0x003b, B:15:0x0043, B:17:0x0054, B:19:0x005a, B:21:0x0062, B:23:0x006a, B:58:0x010b, B:60:0x0110, B:61:0x0113, B:66:0x0122, B:68:0x0127, B:69:0x012a), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127 A[Catch: Exception -> 0x012b, TryCatch #2 {Exception -> 0x012b, blocks: (B:3:0x000e, B:5:0x0015, B:8:0x001e, B:10:0x002b, B:11:0x002e, B:13:0x003b, B:15:0x0043, B:17:0x0054, B:19:0x005a, B:21:0x0062, B:23:0x006a, B:58:0x010b, B:60:0x0110, B:61:0x0113, B:66:0x0122, B:68:0x0127, B:69:0x012a), top: B:2:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void f() {
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream;
        hd hdVar = (hd) this.c;
        Activity activity = (Activity) this.d;
        RectF rectF = ProfileActivity.Z6;
        try {
            File O0 = gl.O0();
            byte b = 0;
            if (O0 == null) {
                gl.c3(new tc(hdVar, b));
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
            gl.c3(new jw6(hdVar, zArr, activity, file, (byte) 26));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private final void g() {
        ye9 ye9Var = (ye9) this.c;
        ii9 ii9Var = (ii9) this.d;
        boolean z = this.b;
        boolean z2 = !z;
        ki9 ki9Var = ii9Var.w;
        Iterator it = ii9Var.I.iterator();
        while (it.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
            li9 m = ki9Var.m(pagetablecell);
            if (m == null) {
                boolean z3 = true;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ffb.h(pagetablecell));
                if (spannableStringBuilder.length() <= 0 || (yi9.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) == 0) {
                    z3 = false;
                }
                ffb.l(pagetablecell, z2);
                if (z) {
                    if (z3) {
                        yi9.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                    }
                } else if (spannableStringBuilder.length() > 0) {
                    yi9.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                }
                ffb.d(pagetablecell, spannableStringBuilder);
            } else if (m.b != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m.a.getText());
                boolean z4 = spannableStringBuilder2.length() > 0 && (yi9.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                ffb.l(m.b, z2);
                if (z) {
                    if (z4) {
                        yi9.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                    }
                } else if (spannableStringBuilder2.length() > 0) {
                    yi9.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                }
                ffb.d(m.b, spannableStringBuilder2);
                m.b(m.b);
            }
        }
        ki9Var.invalidate();
        ge9 ge9Var = ii9Var.F;
        if (ge9Var != null && ii9Var.a != null) {
            ge9Var.a();
        }
        ye9Var.I2();
    }

    private final void h() {
        d dVar = (d) this.c;
        xe9 xe9Var = (xe9) this.d;
        xe9Var.f.k3(true);
        lf9.k(dVar, this.b, new if9(xe9Var, (byte) 2));
    }

    private final void i() {
        jk9 jk9Var = (jk9) this.c;
        boolean z = this.b;
        qj9 qj9Var = (qj9) this.d;
        if (jk9Var.f) {
            jk9Var.F = z;
            Size size = z ? jk9Var.c : jk9Var.b;
            jk9Var.a = size;
            int i = z ? jk9Var.l : jk9Var.k;
            jk9Var.j = i;
            jk9Var.m = z ? jk9Var.o : jk9Var.n;
            tk9 tk9Var = jk9Var.N;
            if (tk9Var != null) {
                tk9Var.c = size;
                tk9Var.d = i;
                tk9Var.v();
                tk9Var.B = false;
                tk9Var.A = 0L;
            }
            jk9Var.Q = -1L;
            jk9Var.v0 = qj9Var;
            jk9Var.i.b("GL dual input selected: input=" + (z ? 1 : 0));
        }
    }

    private final void j() {
        int i;
        long cameraFlipElapsedMs;
        g29 g29Var = (g29) this.c;
        xj9 xj9Var = (xj9) this.d;
        ul9 ul9Var = (ul9) g29Var.b;
        int i2 = ul9Var.a0;
        if (i2 == 7 || i2 == 8 || i2 == 9 || i2 == 10) {
            return;
        }
        nl9 nl9Var = xj9Var.a;
        pl9 pl9Var = xj9Var.c;
        ol9 ol9Var = xj9Var.b;
        ul9Var.s = nl9Var;
        ul9Var.t = ol9Var;
        ul9Var.u = pl9Var;
        ul9Var.v = xj9Var.e;
        if (nl9Var == nl9.a) {
            if (ul9Var.f != null) {
                i = 3;
            }
            i = 1;
        } else {
            if (xj9Var.f) {
                i = 2;
            }
            i = 1;
        }
        ul9Var.b0 = i;
        ul9Var.n();
        ek9 ek9Var = ul9Var.m;
        StringBuilder sb = new StringBuilder("camera configured: facing=");
        sb.append(nl9Var);
        sb.append(", mode=");
        sb.append(ol9Var);
        sb.append(", recording=");
        sb.append(xj9Var.d);
        sb.append(", fps=");
        sb.append((int) pl9Var.a);
        sb.append(", maxZoom=");
        sb.append(ul9Var.v);
        sb.append(", flash=");
        int i3 = ul9Var.b0;
        sb.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "SCREEN" : "TORCH" : "NONE");
        sb.append(", switch=");
        boolean z = this.b;
        sb.append(z);
        ek9Var.b(sb.toString());
        if (z || ul9Var.y) {
            ul9Var.y = false;
            q qVar = (q) ul9Var.d.a;
            qVar.r0 = true;
            StringBuilder sb2 = new StringBuilder("RoundVideo camera flip session ready: facing=");
            sb2.append(nl9Var);
            sb2.append(", elapsedMs=");
            cameraFlipElapsedMs = qVar.getCameraFlipElapsedMs();
            sb2.append(cameraFlipElapsedMs);
            fa4.b(sb2.toString());
            qVar.q();
            ul9Var.o();
        }
    }

    private final void k() {
        wb5 wb5Var = (wb5) this.c;
        tj9 tj9Var = (tj9) this.d;
        if (this.b) {
            na7.q1(wb5Var.a).l0(true);
            tj9Var.run();
        } else {
            d S = LaunchActivity.S();
            if (S == null) {
                return;
            } else {
                S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.o0(3)));
            }
        }
        wb5Var.dismiss();
    }

    private final void l() {
        Runnable runnable = (Runnable) this.c;
        cs5 cs5Var = (cs5) this.d;
        runnable.run();
        if (this.b) {
            cs5Var.u();
        }
    }

    private final void m() {
        ((ae2) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void n() {
        ((i8c) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void o() {
        ((et4) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void p() {
        ((TwoStepVerificationActivity) this.c).m0((byte[]) this.d, this.b);
    }

    private final void q() {
        ((VoIPService) this.c).lambda$startConferenceGroupCall$55((ArrayList) this.d, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04ca  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int writeFrame;
        ?? r7;
        SQLiteCursor sQLiteCursor;
        TLRPC.Message message;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor2;
        SQLitePreparedStatement sQLitePreparedStatement;
        boolean z;
        boolean z2;
        int i2;
        SQLiteCursor sQLiteCursor3;
        boolean z3;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int i3;
        int i4;
        SQLitePreparedStatement executeFast;
        int i5;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z4;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        byte b = this.a;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        char c = 2;
        boolean z5 = true;
        boolean z6 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                zj6 zj6Var = (zj6) obj2;
                zj6Var.getMessagesController().M1().r0(zj6Var.e, (ArrayList) obj, this.b, null);
                return;
            case 1:
                ez3 ez3Var = (ez3) obj2;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                MediaController mediaController = (MediaController) ez3Var.b;
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
                    if (byteBuffer2.position() == byteBuffer2.limit() || z6) {
                        writeFrame = mediaController.writeFrame(byteBuffer2, !z6 ? byteBuffer2.limit() : byteBuffer.position());
                        if (writeFrame != 0) {
                            byteBuffer2.rewind();
                            mediaController.l1 += (byteBuffer2.limit() / 2) / (mediaController.B1 / 1000);
                            mediaController.m1++;
                        } else {
                            fa4.d("writing frame failed");
                        }
                    }
                    if (i != -1) {
                        byteBuffer.limit(i);
                    }
                }
                mediaController.N1.c(new oh6((Object) ez3Var, (Object) byteBuffer, (byte) 5));
                return;
            case 2:
                hq6 hq6Var = (hq6) obj2;
                zc7 zc7Var = (zc7) obj;
                try {
                    if (zc7Var.b != 0) {
                        SQLiteDatabase sQLiteDatabase = hq6Var.getMessagesStorage().b;
                        Locale locale = Locale.US;
                        r7 = 0;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT info FROM bot_keyboard_topics WHERE uid = " + zc7Var.a + " AND tid = " + zc7Var.b, new Object[0]);
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = hq6Var.getMessagesStorage().b;
                        Locale locale2 = Locale.US;
                        r7 = 0;
                        sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT info FROM bot_keyboard WHERE uid = " + zc7Var.a, new Object[0]);
                    }
                    if (!sQLiteCursor.next() || sQLiteCursor.isNull(r7) || (byteBufferValue = sQLiteCursor.byteBufferValue(r7)) == 0) {
                        message = null;
                    } else {
                        message = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r7), r7);
                        byteBufferValue.reuse();
                    }
                    sQLiteCursor.dispose();
                    if (message != null || z6) {
                        gl.c3(new co6(hq6Var, message, zc7Var));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 3:
                ad7 ad7Var = (ad7) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                TLRPC.User user = userFull.user;
                long j = user != null ? user.id : userFull.id;
                if (z6) {
                    try {
                        queryFinalized = ad7Var.b.queryFinalized("SELECT uid FROM user_settings WHERE uid = " + j, new Object[0]);
                    } catch (Exception e2) {
                        e = e2;
                        z = true;
                        sQLitePreparedStatement = null;
                        sQLiteCursor2 = null;
                        try {
                            ad7Var.n(e, z);
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = null;
                        sQLiteCursor2 = null;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor2 != null) {
                        }
                        throw th;
                    }
                    try {
                        boolean next = queryFinalized.next();
                        queryFinalized.dispose();
                        if (!next) {
                            return;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        sQLiteCursor2 = queryFinalized;
                        z = true;
                        sQLitePreparedStatement = null;
                        ad7Var.n(e, z);
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor2 != null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteCursor2 = queryFinalized;
                        sQLitePreparedStatement = null;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor2 != null) {
                        }
                        throw th;
                    }
                }
                SQLitePreparedStatement executeFast2 = ad7Var.b.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(userFull.getObjectSize());
                    userFull.serializeToStream(nativeByteBuffer);
                    executeFast2.bindLong(1, j);
                    executeFast2.bindByteBuffer(2, nativeByteBuffer);
                    executeFast2.bindInteger(3, userFull.pinned_msg_id);
                    executeFast2.step();
                    executeFast2.dispose();
                    nativeByteBuffer.reuse();
                    if ((userFull.flags & 2048) != 0) {
                        SQLitePreparedStatement executeFast3 = ad7Var.b.executeFast("UPDATE dialogs SET folder_id = ? WHERE did = ?");
                        executeFast3.bindInteger(1, userFull.folder_id);
                        executeFast3.bindLong(2, j);
                        executeFast3.step();
                        executeFast3.dispose();
                        ad7Var.K.l(j);
                    }
                    if ((userFull.flags & TLObject.FLAG_14) != 0) {
                        executeFast2 = ad7Var.b.executeFast("UPDATE dialogs SET ttl_period = ? WHERE did = ?");
                        executeFast2.bindInteger(1, userFull.ttl_period);
                        executeFast2.bindLong(2, j);
                        executeFast2.step();
                        executeFast2.dispose();
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    e = e4;
                    sQLitePreparedStatement = executeFast2;
                    z = true;
                    sQLiteCursor2 = null;
                    ad7Var.n(e, z);
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor2 != null) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLitePreparedStatement = executeFast2;
                    sQLiteCursor2 = null;
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLiteCursor2 != null) {
                    }
                    throw th;
                }
            case 4:
                ad7 ad7Var2 = (ad7) obj2;
                ad7Var2.u1((t97) obj, z6);
                ad7Var2.i(false);
                gl.c3(new vb7(ad7Var2, (byte) 15));
                return;
            case 5:
                ad7 ad7Var3 = (ad7) obj2;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) obj;
                try {
                    try {
                        sQLitePreparedStatement3 = ad7Var3.b.executeFast("UPDATE enc_chats SET seq_in = ?, seq_out = ?, use_count = ?, in_seq_no = ?, mtproto_seq = ? WHERE uid = ?");
                        try {
                            sQLitePreparedStatement3.bindInteger(1, encryptedChat.seq_in);
                            sQLitePreparedStatement3.bindInteger(2, encryptedChat.seq_out);
                            sQLitePreparedStatement3.bindInteger(3, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                            sQLitePreparedStatement3.bindInteger(4, encryptedChat.in_seq_no);
                            sQLitePreparedStatement3.bindInteger(5, encryptedChat.mtproto_seq);
                            sQLitePreparedStatement3.bindInteger(6, encryptedChat.id);
                            sQLitePreparedStatement3.step();
                            if (z6 && (i2 = encryptedChat.in_seq_no) != 0) {
                                long j2 = (int) (encryptedChat.id & 4294967295L);
                                SQLiteDatabase sQLiteDatabase3 = ad7Var3.b;
                                Locale locale3 = Locale.US;
                                sQLiteDatabase3.executeFast("DELETE FROM messages_v2 WHERE mid IN (SELECT m.mid FROM messages_v2 as m LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE m.uid = " + j2 + " AND m.date = 0 AND m.mid < 0 AND s.seq_out <= " + i2 + ") AND uid = " + j2).stepThis().dispose();
                            }
                        } catch (Exception e5) {
                            e = e5;
                            z2 = true;
                            ad7Var3.n(e, z2);
                            if (sQLitePreparedStatement3 == null) {
                                return;
                            }
                            sQLitePreparedStatement3.dispose();
                            return;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (sQLitePreparedStatement3 != null) {
                            sQLitePreparedStatement3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e6) {
                    e = e6;
                    z2 = true;
                    sQLitePreparedStatement3 = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLitePreparedStatement3 = null;
                    if (sQLitePreparedStatement3 != null) {
                    }
                    throw th;
                }
                sQLitePreparedStatement3.dispose();
                return;
            case 6:
                ad7 ad7Var4 = (ad7) obj2;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) obj;
                try {
                    SQLiteCursor queryFinalized2 = ad7Var4.b.queryFinalized("SELECT online, inviter, links FROM chat_settings_v2 WHERE uid = " + chatFull.id, new Object[0]);
                    try {
                        if (queryFinalized2.next()) {
                            int intValue = queryFinalized2.intValue(0);
                            chatFull.inviterId = queryFinalized2.longValue(1);
                            i4 = queryFinalized2.intValue(2);
                            i3 = intValue;
                        } else {
                            i3 = -1;
                            i4 = 0;
                        }
                        queryFinalized2.dispose();
                        if (z6 && i3 == -1) {
                            return;
                        }
                        if (i3 >= 0 && (chatFull.flags & TLObject.FLAG_13) == 0) {
                            chatFull.online_count = i3;
                        }
                        if (i4 >= 0) {
                            chatFull.invitesCount = i4;
                        }
                        SQLitePreparedStatement executeFast4 = ad7Var4.b.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
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
                                SQLiteCursor queryFinalized3 = ad7Var4.b.queryFinalized("SELECT inbox_max, outbox_max FROM dialogs WHERE did = " + (-chatFull.id), new Object[0]);
                                try {
                                    if (!queryFinalized3.next() || queryFinalized3.intValue(0) >= chatFull.read_inbox_max_id) {
                                        executeFast4 = null;
                                    } else {
                                        int intValue2 = queryFinalized3.intValue(1);
                                        executeFast4 = ad7Var4.b.executeFast("UPDATE dialogs SET unread_count = ?, inbox_max = ?, outbox_max = ? WHERE did = ?");
                                        try {
                                            executeFast4.bindInteger(1, chatFull.unread_count);
                                            executeFast4.bindInteger(2, chatFull.read_inbox_max_id);
                                            executeFast4.bindInteger(3, Math.max(intValue2, chatFull.read_outbox_max_id));
                                            executeFast4.bindLong(4, -chatFull.id);
                                            executeFast4.step();
                                            executeFast4.dispose();
                                        } catch (Exception e7) {
                                            e = e7;
                                            sQLiteCursor3 = queryFinalized3;
                                            sQLitePreparedStatement2 = executeFast4;
                                            z3 = true;
                                            try {
                                                ad7Var4.n(e, z3);
                                                if (sQLiteCursor3 != null) {
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                if (sQLiteCursor3 != null) {
                                                    sQLiteCursor3.dispose();
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                    sQLitePreparedStatement2.dispose();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            sQLiteCursor3 = queryFinalized3;
                                            sQLitePreparedStatement2 = executeFast4;
                                            if (sQLiteCursor3 != null) {
                                            }
                                            if (sQLitePreparedStatement2 != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    queryFinalized3.dispose();
                                } catch (Exception e8) {
                                    e = e8;
                                    sQLiteCursor3 = queryFinalized3;
                                    z3 = true;
                                    sQLitePreparedStatement2 = null;
                                    ad7Var4.n(e, z3);
                                    if (sQLiteCursor3 != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    sQLiteCursor3 = queryFinalized3;
                                    sQLitePreparedStatement2 = null;
                                    if (sQLiteCursor3 != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                executeFast4 = null;
                            }
                            if ((chatFull.flags & 2048) != 0) {
                                executeFast = ad7Var4.b.executeFast("UPDATE dialogs SET folder_id = ? WHERE did = ?");
                                try {
                                    executeFast.bindInteger(1, chatFull.folder_id);
                                    executeFast.bindLong(2, -chatFull.id);
                                    executeFast.step();
                                    executeFast.dispose();
                                    ad7Var4.K.l(-chatFull.id);
                                    executeFast4 = null;
                                } catch (Exception e9) {
                                    e = e9;
                                    sQLitePreparedStatement2 = executeFast;
                                    z3 = true;
                                    sQLiteCursor3 = null;
                                    ad7Var4.n(e, z3);
                                    if (sQLiteCursor3 != null) {
                                        sQLiteCursor3.dispose();
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th10) {
                                    th = th10;
                                    sQLitePreparedStatement2 = executeFast;
                                    sQLiteCursor3 = null;
                                    if (sQLiteCursor3 != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    throw th;
                                }
                            }
                            executeFast = ad7Var4.b.executeFast("UPDATE dialogs SET ttl_period = ? WHERE did = ?");
                            executeFast.bindInteger(1, chatFull.ttl_period);
                            executeFast.bindLong(2, -chatFull.id);
                            executeFast.step();
                            executeFast.dispose();
                            return;
                        } catch (Exception e10) {
                            e = e10;
                            sQLitePreparedStatement2 = executeFast4;
                        } catch (Throwable th11) {
                            th = th11;
                            sQLitePreparedStatement2 = executeFast4;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        sQLiteCursor3 = queryFinalized2;
                    } catch (Throwable th12) {
                        th = th12;
                        sQLiteCursor3 = queryFinalized2;
                    }
                } catch (Exception e12) {
                    e = e12;
                    z3 = true;
                    sQLiteCursor3 = null;
                } catch (Throwable th13) {
                    th = th13;
                    sQLiteCursor3 = null;
                }
                break;
            case 7:
                yv7 yv7Var = (yv7) obj2;
                ye7 ye7Var = (ye7) obj;
                if (z6) {
                    ye7Var.v(true);
                } else {
                    ye7Var.w();
                }
                yv7Var.a(ye7Var);
                return;
            case 8:
                jf6 jf6Var = (jf6) obj2;
                ye7 ye7Var2 = (ye7) obj;
                if (z6) {
                    ye7Var2.v(true);
                } else {
                    ye7Var2.w();
                }
                ((yv7) jf6Var.b).a(ye7Var2);
                return;
            case 9:
                ((vx7) obj2).v1((String) obj, z6);
                return;
            case 10:
                a();
                return;
            case 11:
                h24 h24Var = (h24) obj2;
                by7 by7Var = (by7) obj;
                d S = LaunchActivity.S();
                if (h24Var.a) {
                    return;
                }
                if (S == null) {
                    h24Var.f();
                    return;
                } else {
                    if (!z6) {
                        S.presentFragment(by7Var);
                        return;
                    }
                    ag0 ag0Var = new ag0();
                    ag0Var.a = true;
                    S.showAsSheet(by7Var, ag0Var);
                    return;
                }
            case 12:
                ((u58) obj2).d0((TLObject) obj, z6);
                return;
            case 13:
                b();
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
            case 24:
                n();
                return;
            case 25:
                m();
                return;
            case 26:
                o();
                return;
            case 27:
                p();
                return;
            case 28:
                q();
                return;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = wallpapersListActivity.Y;
                HashMap hashMap = wallpapersListActivity.Z;
                boolean z7 = wallpapersListActivity.r;
                HashMap hashMap2 = wallpapersListActivity.e0;
                ArrayList arrayList2 = wallpapersListActivity.b0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.d0.clear();
                    hashMap2.clear();
                    if (z7 != 1 && z7 != 2) {
                        arrayList2.clear();
                        hashMap.clear();
                        arrayList.clear();
                        arrayList.addAll(tL_wallPapers.wallpapers);
                        arrayList2.addAll(wallpapersListActivity.c0);
                    }
                    int size = tL_wallPapers.wallpapers.size();
                    int i6 = 0;
                    while (i6 < size) {
                        TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i6);
                        if (!"fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                            if ((wallPaper instanceof TLRPC.TL_wallPaper) && !(wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                                hashMap.put(wallPaper.slug, wallPaper);
                                if (wallPaper.pattern && (document = wallPaper.document) != null && !hashMap2.containsKey(Long.valueOf(document.id))) {
                                    wallpapersListActivity.d0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                                if (z7 != z5 && ((!(z4 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((z7 != c || z4) && (bkb.I.o() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                    arrayList2.add(wallPaper);
                                }
                            } else if (wallPaper.settings.background_color != 0 && (bkb.I.o() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i7 = wallPaperSettings4.second_background_color;
                                krc krcVar = (i7 == 0 || (i5 = wallPaperSettings4.third_background_color) == 0) ? new krc(wallPaperSettings4.background_color, i7, wallPaperSettings4.rotation, null) : new krc(wallPaperSettings4.background_color, i7, i5, wallPaperSettings4.fourth_background_color, null);
                                krcVar.a = wallPaper.slug;
                                krcVar.h = wallPaperSettings4.intensity / 100.0f;
                                krcVar.f = gl.q1(wallPaperSettings4.rotation, false);
                                krcVar.k = wallPaper;
                                arrayList2.add(krcVar);
                            }
                        }
                        i6++;
                        c = 2;
                        z5 = true;
                    }
                    wallpapersListActivity.A0();
                    wallpapersListActivity.getMessagesStorage().m1(1, tL_wallPapers.wallpapers);
                }
                hd hdVar = wallpapersListActivity.M;
                if (hdVar != null) {
                    hdVar.dismiss();
                    if (z6) {
                        return;
                    }
                    wallpapersListActivity.G.z0(0);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ vj6(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
