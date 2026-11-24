// default package

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ox1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ ox1(int i, File file, String str, hd hdVar, boolean[] zArr, String str2, p8c p8cVar, boolean[] zArr2) {
        this.a = (byte) 3;
        this.b = i;
        this.c = file;
        this.d = str;
        this.e = hdVar;
        this.f = zArr;
        this.h = str2;
        this.n = p8cVar;
        this.r = zArr2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:50|(22:(1:52)(1:(1:167)(3:(1:169)(1:185)|170|(4:172|173|(5:176|(1:178)(1:183)|179|(1:181)(29:182|54|(1:56)|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(5:(1:73)|(1:76)|78|79|81)|83|(6:88|89|90|(2:97|98)(2:94|95)|96|84)|112|(1:114)|115|116|117|118|(1:120)|(2:122|(3:124|125|126)(1:129))(1:130)|127)|174)|184)))|63|64|65|66|67|68|69|70|(0)|83|(9:86|88|89|90|(1:92)|97|98|96|84)|131|112|(0)|115|116|117|118|(0)|(0)(0)|127)|53|54|(0)|57|58|59|60|61|62) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:50|(1:52)(1:(1:167)(3:(1:169)(1:185)|170|(4:172|173|(5:176|(1:178)(1:183)|179|(1:181)(29:182|54|(1:56)|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(5:(1:73)|(1:76)|78|79|81)|83|(6:88|89|90|(2:97|98)(2:94|95)|96|84)|112|(1:114)|115|116|117|118|(1:120)|(2:122|(3:124|125|126)(1:129))(1:130)|127)|174)|184)))|53|54|(0)|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(0)|83|(9:86|88|89|90|(1:92)|97|98|96|84)|131|112|(0)|115|116|117|118|(0)|(0)(0)|127) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x023f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0241, code lost:
    
        fa4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02dc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02dd, code lost:
    
        r29 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e0, code lost:
    
        fa4.g(r0, true);
        r0 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02d9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0297 A[Catch: all -> 0x02b3, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x02b3, blocks: (B:109:0x02b2, B:108:0x02af, B:114:0x0297, B:104:0x02aa), top: B:66:0x0207, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e9 A[Catch: Exception -> 0x033f, TryCatch #11 {Exception -> 0x033f, blocks: (B:34:0x010d, B:54:0x01e3, B:56:0x01e9, B:57:0x01ec, B:118:0x02e5, B:120:0x02e9, B:124:0x02f3, B:164:0x02e0, B:170:0x0174, B:172:0x0187, B:178:0x0198, B:179:0x01d2, B:181:0x01dd, B:183:0x01bb, B:185:0x016e), top: B:33:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x032f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e9 A[Catch: Exception -> 0x033f, TryCatch #11 {Exception -> 0x033f, blocks: (B:34:0x010d, B:54:0x01e3, B:56:0x01e9, B:57:0x01ec, B:118:0x02e5, B:120:0x02e9, B:124:0x02f3, B:164:0x02e0, B:170:0x0174, B:172:0x0187, B:178:0x0198, B:179:0x01d2, B:181:0x01dd, B:183:0x01bb, B:185:0x016e), top: B:33:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0227  */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View, java.lang.Object, vt4] */
    /* JADX WARN: Type inference failed for: r1v22, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [boolean[]] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r42v0, types: [ox1] */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r42v10 */
    /* JADX WARN: Type inference failed for: r42v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v5 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r42v7 */
    /* JADX WARN: Type inference failed for: r42v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        djc djcVar;
        k7 k7Var;
        JSONObject jSONObject;
        String str;
        byte[] bArr;
        boolean z;
        File file;
        String str2;
        File file2;
        byte b;
        byte b2;
        boolean[] zArr;
        byte b3;
        Uri fromFile;
        FileInputStream fileInputStream;
        Throwable th;
        FileChannel channel;
        FileChannel channel2;
        long size;
        long j;
        long j2;
        iu4 l;
        int i2 = -1;
        djc djcVar2 = null;
        byte b4 = 0;
        switch (this.a) {
            case 0:
                c cVar = (c) this.c;
                View view = (View) this.d;
                ?? r3 = (FrameLayout) this.e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f;
                ArrayList arrayList = (ArrayList) this.h;
                ArrayList arrayList2 = (ArrayList) this.n;
                int i3 = this.b;
                zic zicVar = (zic) this.r;
                cVar.getClass();
                ChatActivityEnterView chatActivityEnterView = cVar.a;
                ?? vt4Var = new vt4(chatActivityEnterView.getContext(), view, chatActivityEnterView.L4, new lx1(cVar, r3, (byte) 1));
                vt4Var.T = true;
                vt4Var.M = gl.L(220.0f);
                vt4Var.L = 0;
                int F0 = chatActivityEnterView.F0(bkb.F6);
                int L = layoutParams.topMargin - gl.L(28.0f);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    float f = 54.0f;
                    if (i4 >= arrayList.size()) {
                        int min = Math.min(Math.min(i5, gl.L(286.0f)), Math.max(gl.L(44.0f) * 3, L));
                        ScrollView scrollView = new ScrollView(chatActivityEnterView.getContext());
                        scrollView.setVerticalScrollBarEnabled(false);
                        scrollView.setOverScrollMode(2);
                        scrollView.setOnTouchListener(new p8((byte) 29));
                        LinearLayout linearLayout = new LinearLayout(chatActivityEnterView.getContext());
                        linearLayout.setOrientation(1);
                        int i6 = 0;
                        while (i6 < arrayList.size()) {
                            djc djcVar3 = i6 < arrayList2.size() ? (djc) arrayList2.get(i6) : djcVar2;
                            Context context = chatActivityEnterView.getContext();
                            CharSequence charSequence = (CharSequence) arrayList.get(i6);
                            ?? r26 = djcVar3 != null ? djcVar3.a : djcVar2;
                            boolean z2 = i6 == i3;
                            s33 s33Var = jm3.I0;
                            k7 k7Var2 = new k7(context, charSequence, r26, F0, z2);
                            ArrayList arrayList3 = arrayList;
                            ArrayList arrayList4 = arrayList2;
                            k7Var2.setBackground(bkb.f0(bkb.p1(0.08f, F0), 2, -1));
                            if (djcVar3 == null) {
                                k7Var2.setOnClickListener(new wg((Object) vt4Var, (Object) zicVar, i6, (byte) 4));
                                k7Var = k7Var2;
                                i = i6;
                                djcVar = djcVar3;
                            } else {
                                i = i6;
                                djcVar = djcVar3;
                                k7Var = k7Var2;
                                k7Var.setOnClickListener(new pg((Object) cVar, (Object) djcVar, F0, (Object) vt4Var, (byte) 2));
                            }
                            linearLayout.addView(k7Var, new LinearLayout.LayoutParams(-1, gl.L(djcVar != null ? 54.0f : 44.0f)));
                            i6 = i + 1;
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                            djcVar2 = null;
                        }
                        scrollView.addView(linearLayout);
                        FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                        frameLayout.addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
                        vt4Var.a(frameLayout, Math.round(min / gl.p), null);
                        frameLayout.setBackground(null);
                        if (i3 > 0) {
                            scrollView.post(new bt((Object) scrollView, i3, min, (byte) 2));
                        }
                        vt4Var.R = new jx1(r3, (byte) 0);
                        r3.addView(vt4Var, new FrameLayout.LayoutParams(-1, -1));
                        vt4Var.f();
                        return;
                    }
                    if (i4 >= arrayList2.size() || arrayList2.get(i4) == null) {
                        f = 44.0f;
                    }
                    i5 += gl.L(f);
                    i4++;
                }
                break;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.c;
                hd hdVar = (hd) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i7 = this.b;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) this.f;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) this.h;
                String str3 = (String) this.n;
                String str4 = (String) this.r;
                ArrayList arrayList5 = ExternalActionActivity.y;
                try {
                    hdVar.dismiss();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                if (tLObject != null) {
                    na7.q1(i7).b4(authorizationform.users, false);
                    vx7 vx7Var = new vx7(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str3, str4, (String) null, authorizationform, (TL_account.Password) tLObject);
                    vx7Var.D1 = true;
                    if (gl.O1()) {
                        externalActionActivity.d.b(-1, vx7Var);
                    } else {
                        externalActionActivity.c.b(-1, vx7Var);
                    }
                    if (!gl.O1()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.c.e0();
                    if (gl.O1()) {
                        externalActionActivity.d.e0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                y05 y05Var = (y05) this.c;
                String str5 = (String) this.d;
                byte[] bArr2 = (byte[]) this.e;
                JSONObject jSONObject2 = (JSONObject) this.f;
                String str6 = (String) this.h;
                int i8 = this.b;
                j35 j35Var = (j35) this.n;
                org.telegram.ui.Wallet.c cVar2 = (org.telegram.ui.Wallet.c) this.r;
                try {
                    try {
                    } catch (Exception e2) {
                        e = e2;
                    }
                    try {
                        jSONObject = WalletEngine2.signData(y05Var, k35.e(), str5, bArr2, jSONObject2, str6, i8);
                        bArr2 = bArr2;
                    } catch (Exception e3) {
                        e = e3;
                        bArr2 = bArr2;
                        jSONObject = null;
                        String h = w25.h("widget sign data", e);
                        y05Var.close();
                        str = h;
                        bArr = null;
                        gl.c3(new i87((Object) jSONObject, (Object) str, (Object) j35Var, (Object) cVar2, (Object) str5, (Object) bArr2, (Object) bArr, (byte) 11));
                        return;
                    }
                    try {
                        byte[] f2 = k35.f(y05Var, str5, bArr2);
                        y05Var.close();
                        bArr = f2;
                        str = null;
                    } catch (Exception e4) {
                        e = e4;
                        String h2 = w25.h("widget sign data", e);
                        y05Var.close();
                        str = h2;
                        bArr = null;
                        gl.c3(new i87((Object) jSONObject, (Object) str, (Object) j35Var, (Object) cVar2, (Object) str5, (Object) bArr2, (Object) bArr, (byte) 11));
                        return;
                    }
                    gl.c3(new i87((Object) jSONObject, (Object) str, (Object) j35Var, (Object) cVar2, (Object) str5, (Object) bArr2, (Object) bArr, (byte) 11));
                    return;
                } catch (Throwable th2) {
                    y05Var.close();
                    throw th2;
                }
            case 3:
                ?? r1 = this.b;
                File file3 = (File) this.c;
                String str7 = (String) this.d;
                hd hdVar2 = (hd) this.e;
                boolean[] zArr2 = (boolean[]) this.f;
                String str8 = (String) this.h;
                p8c p8cVar = (p8c) this.n;
                boolean[] zArr3 = (boolean[]) this.r;
                String[] strArr = MediaController.W1;
                try {
                } catch (Exception e5) {
                    e = e5;
                    r1 = zArr3;
                }
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            fromFile = MediaController.e0(r1, file3, null);
                            b3 = fromFile != null ? (byte) 1 : (byte) 0;
                            b = 0;
                            r1 = zArr3;
                        } else {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (r1 == 0) {
                                                    File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                                                    file4.mkdirs();
                                                    file = new File(file4, gl.p0(0, ba4.D(file3)));
                                                } else if (r1 == 1) {
                                                    File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), "Telegram");
                                                    file5.mkdirs();
                                                    file = new File(file5, gl.p0(1, ba4.D(file3)));
                                                } else {
                                                    File file6 = new File(r1 == 2 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC), "Telegram");
                                                    file6.mkdirs();
                                                    file = new File(file6, str7);
                                                    if (file.exists()) {
                                                        int lastIndexOf = str7.lastIndexOf(46);
                                                        int i9 = 0;
                                                        while (i9 < 10) {
                                                            if (lastIndexOf != i2) {
                                                                str2 = str7.substring(0, lastIndexOf) + "(" + (i9 + 1) + ")" + str7.substring(lastIndexOf);
                                                            } else {
                                                                str2 = str7 + "(" + (i9 + 1) + ")";
                                                            }
                                                            file2 = new File(file6, str2);
                                                            if (file2.exists()) {
                                                                i9++;
                                                                file = file2;
                                                                i2 = -1;
                                                            } else {
                                                                if (!file2.exists()) {
                                                                    file2.createNewFile();
                                                                }
                                                                long currentTimeMillis = System.currentTimeMillis() - 500;
                                                                fileInputStream = new FileInputStream(file3);
                                                                channel = fileInputStream.getChannel();
                                                                channel2 = new FileOutputStream(file2).getChannel();
                                                                size = channel.size();
                                                                if (gl.G1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                                                    if (hdVar2 != null) {
                                                                        gl.c3(new tc(hdVar2, (byte) 5));
                                                                    }
                                                                    if (channel2 != null) {
                                                                        channel2.close();
                                                                    }
                                                                    channel.close();
                                                                    fileInputStream.close();
                                                                    return;
                                                                }
                                                                j = 0;
                                                                while (j < size && !zArr2[b4]) {
                                                                    b = b4;
                                                                    this = fileInputStream;
                                                                    try {
                                                                        channel2.transferFrom(channel, j, Math.min(4096L, size - j));
                                                                        long j3 = j;
                                                                        if (hdVar2 != null || currentTimeMillis > System.currentTimeMillis() - 500) {
                                                                            j2 = 4096;
                                                                        } else {
                                                                            currentTimeMillis = System.currentTimeMillis();
                                                                            j2 = 4096;
                                                                            gl.c3(new sm3((Object) hdVar2, (int) ((j3 / size) * 100.0f), (byte) 19));
                                                                        }
                                                                        j = j3 + j2;
                                                                        fileInputStream = this;
                                                                        b4 = b;
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        Throwable th4 = th;
                                                                        if (channel2 == null) {
                                                                            throw th4;
                                                                        }
                                                                        try {
                                                                            channel2.close();
                                                                            throw th4;
                                                                        } catch (Throwable th5) {
                                                                            th4.addSuppressed(th5);
                                                                            throw th4;
                                                                        }
                                                                    }
                                                                }
                                                                FileInputStream fileInputStream2 = fileInputStream;
                                                                b = b4;
                                                                if (channel2 != null) {
                                                                    channel2.close();
                                                                }
                                                                channel.close();
                                                                fileInputStream2.close();
                                                                b2 = 1;
                                                                if (zArr2[b]) {
                                                                    file2.delete();
                                                                    b2 = b;
                                                                }
                                                                if (b2 != 0) {
                                                                    zArr = zArr3;
                                                                } else if (r1 == 2) {
                                                                    zArr = zArr3;
                                                                    ((DownloadManager) a.b.getSystemService("download")).addCompletedDownload(file2.getName(), file2.getName(), false, str8, file2.getAbsolutePath(), file2.length(), true);
                                                                } else {
                                                                    zArr = zArr3;
                                                                    gl.d(file2.getAbsoluteFile());
                                                                }
                                                                b3 = b2;
                                                                fromFile = Uri.fromFile(file2);
                                                                r1 = zArr;
                                                            }
                                                        }
                                                    }
                                                }
                                                size = channel.size();
                                                if (gl.G1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                                }
                                                j = 0;
                                                while (j < size) {
                                                    b = b4;
                                                    this = fileInputStream;
                                                    channel2.transferFrom(channel, j, Math.min(4096L, size - j));
                                                    long j32 = j;
                                                    if (hdVar2 != null) {
                                                    }
                                                    j2 = 4096;
                                                    j = j32 + j2;
                                                    fileInputStream = this;
                                                    b4 = b;
                                                }
                                                FileInputStream fileInputStream22 = fileInputStream;
                                                b = b4;
                                                if (channel2 != null) {
                                                }
                                                channel.close();
                                                fileInputStream22.close();
                                                b2 = 1;
                                                if (zArr2[b]) {
                                                }
                                                if (b2 != 0) {
                                                }
                                                b3 = b2;
                                                fromFile = Uri.fromFile(file2);
                                                r1 = zArr;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                this = fileInputStream;
                                                b = 0;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            Throwable th8 = th;
                                            if (channel == null) {
                                                throw th8;
                                            }
                                            try {
                                                channel.close();
                                                throw th8;
                                            } catch (Throwable th9) {
                                                th8.addSuppressed(th9);
                                                throw th8;
                                            }
                                        }
                                        channel2 = new FileOutputStream(file2).getChannel();
                                    } catch (Throwable th10) {
                                        th = th10;
                                        this = fileInputStream;
                                        b = 0;
                                    }
                                    channel = fileInputStream.getChannel();
                                } catch (Throwable th11) {
                                    th = th11;
                                    th = th;
                                    try {
                                        this.close();
                                        throw th;
                                    } catch (Throwable th12) {
                                        th.addSuppressed(th12);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                this = fileInputStream;
                                b = 0;
                                th = th;
                                this.close();
                                throw th;
                            }
                            file2 = file;
                            if (!file2.exists()) {
                            }
                            long currentTimeMillis2 = System.currentTimeMillis() - 500;
                            fileInputStream = new FileInputStream(file3);
                        }
                        if (b3 != 0 && p8cVar != null) {
                            gl.c3(new hl6(p8cVar, fromFile, b));
                        }
                    } catch (Exception e6) {
                        e = e6;
                        z = true;
                        r1 = zArr3;
                        fa4.g(e, z);
                        if (hdVar2 != null) {
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                    z = true;
                    r1 = r1;
                    fa4.g(e, z);
                    if (hdVar2 != null) {
                    }
                }
                if (hdVar2 != null) {
                    gl.c3(new dl6(hdVar2, (boolean[]) r1, (byte) 2));
                    return;
                }
                return;
            case 4:
                TLObject tLObject2 = (TLObject) this.c;
                d dVar = (d) this.d;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) this.e;
                gi8 gi8Var = (gi8) this.f;
                nfd nfdVar = (nfd) this.h;
                int i10 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.n;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.r;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    ij.c0(i10, tL_error, dVar, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                }
                Activity parentActivity = dVar != null ? dVar.getParentActivity() : gl.u0();
                ci0 h3 = ci0.h();
                j5 accountInstance = dVar.getAccountInstance();
                lv6 lv6Var = new lv6((byte) 7, false);
                lv6Var.L(ci0.l);
                gi8Var.a();
                String str9 = gi8Var.g.a;
                if (TextUtils.isEmpty(str9)) {
                    w26.j("offerToken can not be empty");
                    return;
                } else {
                    lv6Var.c = str9;
                    h3.l(parentActivity, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(lv6Var.d()), nfdVar, false);
                    return;
                }
            default:
                Runnable[] runnableArr = (Runnable[]) this.c;
                TextView[] textViewArr = (TextView[]) this.d;
                int i11 = this.b;
                wjb wjbVar = (wjb) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f;
                String[] strArr2 = (String[]) this.h;
                boolean[] zArr4 = (boolean[]) this.n;
                byte[] bArr3 = (byte[]) this.r;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                e eVar = new e((Object) runnableArr, (Object) textViewArr, i11, (Object) wjbVar, (byte) 10);
                org.telegram.ui.Wallet.c C = org.telegram.ui.Wallet.c.C(i11);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (nftitem != null) {
                    q05 q05Var = new q05(C, walletTransactionPeer.address, nftitem, strArr2[0], eVar);
                    C.x0(q05Var);
                    l = new iu4(q05Var, (byte) 8);
                } else {
                    l = C.l(walletTransactionPeer.address, wallettransaction.amount, strArr2[0], zArr4[0] ? bArr3 : null, eVar);
                }
                runnableArr[0] = l;
                return;
        }
    }

    public /* synthetic */ ox1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.b = i;
        this.n = obj6;
        this.r = obj7;
    }

    public /* synthetic */ ox1(c cVar, View view, FrameLayout frameLayout, FrameLayout.LayoutParams layoutParams, ArrayList arrayList, ArrayList arrayList2, int i, zic zicVar) {
        this.a = (byte) 0;
        this.c = cVar;
        this.d = view;
        this.e = frameLayout;
        this.f = layoutParams;
        this.h = arrayList;
        this.n = arrayList2;
        this.b = i;
        this.r = zicVar;
    }

    public /* synthetic */ ox1(ExternalActionActivity externalActionActivity, hd hdVar, TLObject tLObject, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.a = (byte) 1;
        this.c = externalActionActivity;
        this.d = hdVar;
        this.e = tLObject;
        this.b = i;
        this.f = authorizationform;
        this.h = getauthorizationform;
        this.n = str;
        this.r = str2;
    }

    public /* synthetic */ ox1(Runnable[] runnableArr, TextView[] textViewArr, int i, wjb wjbVar, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.a = (byte) 5;
        this.c = runnableArr;
        this.d = textViewArr;
        this.b = i;
        this.e = wjbVar;
        this.f = wallettransaction;
        this.h = strArr;
        this.n = zArr;
        this.r = bArr;
    }
}
