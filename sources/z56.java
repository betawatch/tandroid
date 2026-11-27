// default package

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.CancellationTokenSource;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z56 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z56(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x07e3 A[Catch: all -> 0x0887, InterruptedException -> 0x08cb, TryCatch #4 {InterruptedException -> 0x08cb, all -> 0x0887, blocks: (B:161:0x06ce, B:163:0x06d2, B:165:0x06dc, B:166:0x06e6, B:168:0x06ee, B:170:0x0704, B:172:0x070b, B:175:0x0711, B:178:0x0717, B:180:0x071f, B:182:0x0734, B:184:0x0738, B:185:0x0747, B:186:0x074f, B:193:0x0785, B:194:0x0787, B:199:0x0792, B:201:0x0796, B:203:0x079f, B:205:0x07aa, B:207:0x07b2, B:209:0x07d1, B:210:0x07d9, B:211:0x07df, B:213:0x07e3, B:218:0x07ef, B:220:0x07fa, B:221:0x0801, B:229:0x075b, B:231:0x0772, B:239:0x080c, B:241:0x0816, B:244:0x081c, B:246:0x0822, B:250:0x0836, B:255:0x084b, B:257:0x084f, B:259:0x0857, B:252:0x085e, B:266:0x0861), top: B:160:0x06ce }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        ByteBuffer byteBuffer;
        float sqrt;
        long j;
        String nativeSessionPush;
        String nativeSessionPush2;
        VoIPService sharedInstance;
        w96 w96Var;
        int i2;
        int i3;
        svc svcVar;
        byte b = 5;
        byte b2 = 10;
        float f = 0.0f;
        byte b3 = 2;
        byte b4 = 0;
        switch (this.a) {
            case 0:
                e66 e66Var = (e66) this.b;
                TLObject tLObject = (TLObject) this.c;
                e66Var.c();
                if (tLObject != null) {
                    e66Var.a.k0((TL_account.Password) tLObject);
                    return;
                }
                return;
            case 1:
                ((FiltersSetupActivity) this.c).b0(((e66) this.b).a.N());
                return;
            case 2:
                k66 k66Var = (k66) this.b;
                if (k66Var.P0 == ((q66) this.c)) {
                    k66Var.performLongClick();
                    k66Var.P0 = null;
                    k66Var.N0.e(true);
                    return;
                }
                return;
            case 3:
                ((m66) this.b).m((va6) this.c, false);
                return;
            case 4:
                u86 u86Var = (u86) this.b;
                pm3 pm3Var = (pm3) this.c;
                u86Var.getClass();
                DictationAsr.Q();
                SparseArray sparseArray = new SparseArray();
                int i4 = 0;
                while (u86Var.d) {
                    try {
                        byte[] readIncomingAudio = NativeInstance.readIncomingAudio();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (readIncomingAudio != null) {
                            ByteBuffer order = ByteBuffer.wrap(readIncomingAudio).order(ByteOrder.LITTLE_ENDIAN);
                            while (order.remaining() >= 8) {
                                int i5 = order.getInt();
                                int i6 = order.getInt() << 1;
                                int position = order.position();
                                if (i6 <= order.remaining()) {
                                    order.position(position + i6);
                                    if (i5 != 0 || ((sharedInstance = VoIPService.getSharedInstance()) != null && !sharedInstance.isMicMute())) {
                                        t86 t86Var = (t86) sparseArray.get(i5);
                                        if (t86Var == null) {
                                            t86Var = new t86(u86Var, i5);
                                            long j2 = u86Var.f;
                                            i = i6;
                                            u86Var.f = j2 + 1;
                                            t86Var.f = j2;
                                            if (i5 == 0 && u86Var.c) {
                                                ExecutorService executorService = DictationLid.a;
                                                t86Var.k = uc7.e1().getString("tinylid_lang", null);
                                            }
                                            sparseArray.put(i5, t86Var);
                                        } else {
                                            i = i6;
                                        }
                                        int i7 = i / 2;
                                        if (i7 == 0) {
                                            byteBuffer = order;
                                            sqrt = f;
                                        } else {
                                            double d = 0.0d;
                                            int i8 = 0;
                                            while (i8 < i7) {
                                                int i9 = (i8 << 1) + position;
                                                short s = (short) ((readIncomingAudio[i9] & 255) | (readIncomingAudio[i9 + 1] << 8));
                                                ByteBuffer byteBuffer2 = order;
                                                double d2 = s;
                                                d += d2 * d2;
                                                i8++;
                                                order = byteBuffer2;
                                            }
                                            byteBuffer = order;
                                            sqrt = (float) Math.sqrt(d / i7);
                                        }
                                        boolean z = sqrt >= 400.0f;
                                        if (z) {
                                            t86Var.e = currentTimeMillis;
                                        }
                                        if (t86Var.d == null) {
                                            if (z && i4 < 4) {
                                                String str = t86Var.k;
                                                pm3 Z = str != null ? DictationAsr.Z(str, pm3Var, false) : null;
                                                if (Z == null || !DictationAsr.B((nm3) Z.b)) {
                                                    Z = pm3Var;
                                                }
                                                rm3 c = rm3.c(Z, t86Var);
                                                t86Var.d = c;
                                                if (c != null) {
                                                    i4++;
                                                    t86Var.h = 0;
                                                    t86Var.g = 0;
                                                    t86Var.e();
                                                    t86Var.c(0, t86Var.c, t86Var.b);
                                                    rm3 rm3Var = t86Var.d;
                                                    byte[] bArr = t86Var.b;
                                                    int i10 = t86Var.c;
                                                    j = currentTimeMillis;
                                                    long j3 = rm3Var.c;
                                                    if (j3 != 0) {
                                                        nativeSessionPush2 = DictationAsr.nativeSessionPush(j3, bArr, 0, i10);
                                                        rm3Var.b(nativeSessionPush2);
                                                    }
                                                    t86Var.c = 0;
                                                    if (t86Var.d == null) {
                                                        t86Var.d(position, i, readIncomingAudio);
                                                        order = byteBuffer;
                                                        currentTimeMillis = j;
                                                        f = 0.0f;
                                                    }
                                                }
                                            }
                                            j = currentTimeMillis;
                                            if (t86Var.d == null) {
                                            }
                                        } else {
                                            j = currentTimeMillis;
                                        }
                                        int i11 = i;
                                        t86Var.c(position, i11, readIncomingAudio);
                                        rm3 rm3Var2 = t86Var.d;
                                        long j4 = rm3Var2.c;
                                        if (j4 != 0) {
                                            nativeSessionPush = DictationAsr.nativeSessionPush(j4, readIncomingAudio, position, i11);
                                            rm3Var2.b(nativeSessionPush);
                                        }
                                        t86Var.a();
                                        order = byteBuffer;
                                        currentTimeMillis = j;
                                        f = 0.0f;
                                    }
                                }
                            }
                        }
                        long j5 = currentTimeMillis;
                        while (true) {
                            Runnable runnable = (Runnable) u86Var.b.poll();
                            if (runnable != null) {
                                runnable.run();
                            } else {
                                int i12 = i4;
                                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                                    t86 t86Var2 = (t86) sparseArray.valueAt(i13);
                                    long j6 = j5 - t86Var2.e;
                                    rm3 rm3Var3 = t86Var2.d;
                                    if (rm3Var3 != null) {
                                        if (j6 > 6000) {
                                            rm3Var3.a();
                                            t86Var2.d = null;
                                            i12--;
                                            t86Var2.b();
                                            t86Var2.e();
                                        } else if (j6 > 1600 && t86Var2.i && !t86Var2.j.isEmpty()) {
                                            t86Var2.b();
                                            t86Var2.g = t86Var2.h;
                                        }
                                    }
                                }
                                Thread.sleep(60L);
                                i4 = i12;
                                f = 0.0f;
                            }
                        }
                    } catch (InterruptedException unused) {
                        for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                            t86 t86Var3 = (t86) sparseArray.valueAt(i14);
                            rm3 rm3Var4 = t86Var3.d;
                            if (rm3Var4 != null) {
                                rm3Var4.a();
                                t86Var3.d = null;
                            }
                            t86Var3.b();
                        }
                        return;
                    } catch (Throwable th) {
                        try {
                            Log.e("Dictation", "live captions", th);
                            for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                                t86 t86Var4 = (t86) sparseArray.valueAt(i15);
                                rm3 rm3Var5 = t86Var4.d;
                                if (rm3Var5 != null) {
                                    rm3Var5.a();
                                    t86Var4.d = null;
                                }
                                t86Var4.b();
                            }
                            return;
                        } catch (Throwable th2) {
                            for (int i16 = 0; i16 < sparseArray.size(); i16++) {
                                t86 t86Var5 = (t86) sparseArray.valueAt(i16);
                                rm3 rm3Var6 = t86Var5.d;
                                if (rm3Var6 != null) {
                                    rm3Var6.a();
                                    t86Var5.d = null;
                                }
                                t86Var5.b();
                            }
                            throw th2;
                        }
                    }
                }
                for (int i17 = 0; i17 < sparseArray.size(); i17++) {
                    t86 t86Var6 = (t86) sparseArray.valueAt(i17);
                    rm3 rm3Var7 = t86Var6.d;
                    if (rm3Var7 != null) {
                        rm3Var7.a();
                        t86Var6.d = null;
                    }
                    t86Var6.b();
                }
                return;
            case 5:
                ((lcb) this.b).L(ProfileActivity.Q2(((m96) this.c).c));
                return;
            case 6:
                b58 b58Var = (b58) this.b;
                hl.g(((h96) this.c).w);
                if (hl.C3()) {
                    Toast.makeText(b58Var.getContext(), ob6.M0(2131743847, null), 0).show();
                    return;
                }
                return;
            case 7:
                b58 b58Var2 = (b58) this.b;
                m96 m96Var = (m96) this.c;
                long j7 = m96Var.c;
                o68 o68Var = b58Var2.j0;
                if (j7 != yac.h(o68Var.m2).e() && ((w96Var = b58Var2.i0.B0) == null || j7 != wf3.n(w96Var.l()))) {
                    if (o68Var.x3 != null) {
                        for (int i18 = 0; i18 < o68Var.x3.peers.size(); i18++) {
                            if (j7 != wf3.n(o68Var.x3.peers.get(i18).peer)) {
                            }
                        }
                    }
                    Context context = b58Var2.getContext();
                    long j8 = m96Var.c;
                    qo0 qo0Var = new qo0(b58Var2, m96Var, b);
                    w53 w53Var = new w53(b3);
                    nx0 nx0Var = new nx0(1, (vnb) w53Var, context, false);
                    nx0Var.J();
                    LinearLayout j9 = uh9.j(context, 1);
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 20.0f);
                    yob.X(textView, aob.j5, w53Var);
                    textView.setTypeface(hl.o());
                    textView.setText(ob6.M0(2131751461, null));
                    j9.addView(textView, tre.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    mf5 mf5Var = new mf5(context, w53Var);
                    mf5Var.setText(ob6.M0(2131751558, null));
                    j9.addView(mf5Var, tre.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    sg2 sg2Var = new sg2(context, 4, 21, true, w53Var);
                    og2 checkBoxRound = sg2Var.getCheckBoxRound();
                    int i19 = aob.V6;
                    int i20 = aob.g7;
                    int i21 = aob.k7;
                    checkBoxRound.b(i19, i20, i21);
                    sg2Var.e(ob6.M0(2131751467, null), null, false, true, false);
                    sg2Var.setOnClickListener(new qd(sg2Var, b3));
                    int i22 = aob.i6;
                    hf0 f0 = aob.f0(aob.v0(i22, w53Var), 2, -1);
                    uob M = yob.M(i22);
                    sg2Var.setBackground(f0);
                    yob.j(sg2Var, f0, null, M, w53Var);
                    j9.addView(sg2Var, tre.o(-1, -2));
                    sg2 sg2Var2 = new sg2(context, 4, 21, true, w53Var);
                    sg2Var2.getCheckBoxRound().b(i19, i20, i21);
                    sg2Var2.e(ob6.a0(null, null, 2131751552, wf3.k(yac.t0, j8)), null, false, true, false);
                    sg2Var2.setOnClickListener(new qd(sg2Var2, (byte) 3));
                    hf0 f02 = aob.f0(aob.v0(i22, w53Var), 2, -1);
                    uob M2 = yob.M(i22);
                    sg2Var2.setBackground(f02);
                    yob.j(sg2Var2, f02, null, M2, w53Var);
                    j9.addView(sg2Var2, tre.o(-1, -2));
                    sg2 sg2Var3 = new sg2(context, 4, 21, true, w53Var);
                    sg2Var3.getCheckBoxRound().b(i19, i20, i21);
                    sg2Var3.e(ob6.a0(null, null, 2131751533, wf3.k(yac.t0, j8)), null, false, false, false);
                    sg2Var3.setOnClickListener(new qd(sg2Var3, (byte) 4));
                    hf0 f03 = aob.f0(aob.v0(i22, w53Var), 2, -1);
                    uob M3 = yob.M(i22);
                    sg2Var3.setBackground(f03);
                    yob.j(sg2Var3, f03, null, M3, w53Var);
                    j9.addView(sg2Var3, tre.o(-1, -2));
                    ilb ilbVar = new ilb(context, w53Var);
                    ilbVar.setBackgroundColor(-16777216);
                    ilbVar.setFixedSize(12);
                    j9.addView(ilbVar, tre.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    c51 c51Var = new c51(w53Var, context, true);
                    c51Var.i(ob6.M0(2131751478, null), false, true);
                    c51Var.setOnClickListener(new nh(sg2Var, sg2Var2, sg2Var3, qo0Var, nx0Var, (byte) 8));
                    frameLayout.addView(c51Var, tre.d(-1, 48.0f, jn7.D1, 16.0f, 16.0f, 16.0f, 16.0f));
                    j9.addView(frameLayout, tre.o(-1, -2));
                    nx0Var.O = j9;
                    nx0Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = b58Var2.P;
                deletegroupcallmessages.messages.add(Integer.valueOf(m96Var.a));
                ConnectionsManager.getInstance(b58Var2.O).sendRequest(deletegroupcallmessages, null);
                b58Var2.b(m96Var.a);
                return;
            case 8:
                w96 w96Var2 = (w96) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i23 = 0;
                while (i23 < size) {
                    Object obj = arrayList.get(i23);
                    i23++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    jn7.f(w96Var2.e).k(jn7.H2, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 9:
                uc6 uc6Var = (uc6) this.b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.c;
                if (gLSurfaceView.getWidth() == 0 || gLSurfaceView.getHeight() == 0) {
                    return;
                }
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect((gLSurfaceView.getHeight() * gLSurfaceView.getWidth()) << 2);
                GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(allocateDirect);
                Matrix matrix = new Matrix();
                matrix.preScale(1.0f, -1.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                createBitmap.recycle();
                hl.c3(new ls5((Object) uc6Var, (Object) createBitmap2, (Object) gLSurfaceView, (byte) 17));
                return;
            case 10:
                uc6 uc6Var2 = (uc6) this.b;
                hd6 hd6Var = (hd6) this.c;
                uc6Var2.c.setImageResource(R.drawable.msg_location_alert2);
                uc6Var2.g0(hd6Var.f);
                uc6Var2.y = false;
                return;
            case 11:
                ((EditText) this.b).removeTextChangedListener((ry) this.c);
                return;
            case 12:
                df6 df6Var = (df6) this.b;
                Runnable runnable2 = (Runnable) this.c;
                bf6 bf6Var = df6Var.a;
                int i24 = 0;
                while (true) {
                    ok2[] ok2VarArr = bf6Var.f;
                    if (i24 >= ok2VarArr.length) {
                        runnable2.run();
                        bf6Var.e = false;
                        return;
                    } else {
                        ok2VarArr[i24].D(0.0f);
                        i24++;
                    }
                }
            case 13:
                lf6 lf6Var = (lf6) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                qh6 qh6Var = lf6Var.E;
                qh6Var.y1(false, false);
                hl.t1(lf6Var.a);
                qh6Var.C1((TLRPC.TL_auth_authorization) tLObject2, false);
                return;
            case 14:
                lf6 lf6Var2 = (lf6) this.b;
                String str2 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = lf6Var2.n.current_algo;
                boolean z2 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] c2 = z2 ? es9.c(hl.g1(str2), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                jf6 jf6Var = new jf6(lf6Var2, b3);
                if (z2) {
                    TL_account.Password password = lf6Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP d3 = es9.d(c2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d3 == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        jf6Var.run(null, tL_error);
                        return;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = d3;
                        i2 = ((e) lf6Var2.E).currentAccount;
                        ConnectionsManager.getInstance(i2).sendRequest(tL_auth_checkPassword, jf6Var, 10);
                        return;
                    }
                }
                return;
            case 15:
                cg6 cg6Var = (cg6) this.b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) this.c;
                cg6Var.Q.y1(false, false);
                hl.t1(cg6Var.Q.fragmentView.findFocus());
                cg6Var.Q.C1((TLRPC.TL_auth_authorization) auth_authorization, true);
                TLRPC.FileLocation fileLocation = cg6Var.P;
                if (fileLocation != null) {
                    Utilities.f.c(new z56(cg6Var, fileLocation, (byte) 16));
                    return;
                }
                return;
            case 16:
                cg6 cg6Var2 = (cg6) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i3 = ((e) cg6Var2.Q).currentAccount;
                uc7 s1 = uc7.s1(i3);
                if (fileLocation2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(xb4.z(4));
                    sb.append("/");
                    sb.append(fileLocation2.volume_id);
                    sb.append("_");
                    s1.G2 = uh9.l(sb, fileLocation2.local_id, ".jpg");
                    s1.getFileLoader().h0(false, 16777216, s1.G2, true);
                    return;
                }
                return;
            case 17:
                dg6 dg6Var = (dg6) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                qh6 qh6Var2 = dg6Var.H;
                qh6Var2.y1(false, true);
                if (tL_error2 != null) {
                    if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                        qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131745842, "ResetAccountCancelledAlert"));
                        return;
                    } else {
                        qh6Var2.z1(ob6.M0(2131745798, null), tL_error2.text);
                        return;
                    }
                }
                if (dg6Var.r == null || dg6Var.s == null || dg6Var.w == null) {
                    qh6Var2.J1(0, true, null, true);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", dg6Var.r);
                bundle.putString("phoneHash", dg6Var.s);
                bundle.putString("code", dg6Var.w);
                qh6Var2.J1(5, true, bundle, false);
                return;
            case 18:
                tg6 tg6Var = (tg6) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.S = ob6.M0(2131752560, null);
                alertDialog$Builder.a.U = ob6.a0("CancelLinkSuccess", null, 2131752561, xnb.k(new StringBuilder("+"), tg6Var.b, f78.f()));
                alertDialog$Builder.j(ob6.M0(2131752006, null), null);
                alertDialog$Builder.a.setOnDismissListener(new og6(tg6Var, b4));
                alertDialog$Builder.o();
                return;
            case 19:
                ((tg6) this.b).h0 = ((TLRPC.TL_error) this.c).text;
                return;
            case 20:
                ((tg6) this.b).v0.C1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                return;
            case 21:
                tg6 tg6Var2 = (tg6) this.b;
                Runnable runnable3 = (Runnable) this.c;
                bk2 bk2Var = tg6Var2.f;
                int i25 = 0;
                while (true) {
                    ok2[] ok2VarArr2 = bk2Var.f;
                    if (i25 >= ok2VarArr2.length) {
                        runnable3.run();
                        bk2Var.e = false;
                        return;
                    } else {
                        ok2VarArr2[i25].D(0.0f);
                        i25++;
                    }
                }
            case 22:
                ((zj3) this.b).a((String) this.c);
                return;
            case 23:
                ph6 ph6Var = (ph6) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                qh6 qh6Var3 = ph6Var.h0;
                SharedPreferences e1 = uc7.e1();
                if (!e1.getBoolean("firstloginshow", true) && !qh6Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    qh6Var3.getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                    return;
                }
                e1.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(qh6Var3.getParentActivity());
                int i26 = aob.L5;
                alertDialog$Builder2.l(R.raw.incoming_calls, 46, aob.w0(null, i26, false), null);
                alertDialog$Builder2.m(i26, null);
                alertDialog$Builder2.j(ob6.M0(2131751736, "Continue"), null);
                String M0 = ob6.M0(2131754271, "AllowFillNumber");
                id idVar = alertDialog$Builder2.a;
                idVar.U = M0;
                qh6Var3.n = qh6Var3.showDialog(idVar, true, null);
                qh6Var3.d0 = true;
                return;
            case 24:
                ph6 ph6Var2 = (ph6) this.b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.c;
                if (ph6Var2.o()) {
                    id idVar2 = new id(3, null, ph6Var2.getContext());
                    idVar2.setOnCancelListener(new cs0(cancellationTokenSource, (byte) 11));
                    idVar2.show();
                    ph6Var2.c0 = idVar2;
                    return;
                }
                return;
            case 25:
                ((th6) this.b).Z((id) this.c);
                return;
            case 26:
                ck6 ck6Var = (ck6) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                ck6Var.d0 = false;
                if (tL_error3 == null) {
                    uj6 k0 = ck6Var.k0();
                    ck6Var.k0.clear();
                    ck6Var.m0(k0);
                    return;
                }
                return;
            case 27:
                tj6 tj6Var = (tj6) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ck6 ck6Var2 = tj6Var.a;
                uj6 k02 = ck6Var2.k0();
                ck6Var2.j0.add(0, (TLRPC.TL_chatInviteExported) tLObject3);
                TLRPC.ChatFull chatFull = ck6Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    ck6Var2.getMessagesStorage().t1(ck6Var2.d.invitesCount, ck6Var2.n);
                }
                ck6Var2.m0(k02);
                return;
            case 28:
                em6 em6Var = (em6) this.b;
                if (!((boolean[]) this.c)[0] && (svcVar = em6Var.R) != null) {
                    svcVar.run();
                }
                em6Var.R = null;
                return;
            default:
                MediaController mediaController = (MediaController) this.b;
                File file = (File) this.c;
                String[] strArr = MediaController.W1;
                try {
                    int i27 = mediaController.l0 + 1;
                    mediaController.l0 = i27;
                    kfc kfcVar = mediaController.k0;
                    if (kfcVar != null) {
                        kfcVar.l0();
                    }
                    kfc kfcVar2 = new kfc(false, false);
                    mediaController.k0 = kfcVar2;
                    kfcVar2.K = new ed(mediaController, i27, b2);
                    kfcVar2.i0(Uri.fromFile(file), "other");
                    mediaController.k0.w0(3);
                    mediaController.k0.g0();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    kfc kfcVar3 = mediaController.k0;
                    if (kfcVar3 != null) {
                        kfcVar3.l0();
                        mediaController.k0 = null;
                        return;
                    }
                    return;
                }
        }
    }
}
