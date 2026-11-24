// default package

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.util.Base64;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class q3a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q3a(vqa vqaVar, Runnable runnable, c01 c01Var, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.a = (byte) 15;
        this.d = runnable;
        this.b = c01Var;
        this.c = twoStepVerificationActivity;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:5|(3:6|7|8)|9|(6:120|121|122|123|124|(1:126))(1:11)|12|(6:66|67|(2:90|(2:102|(2:106|107))(3:96|97|98))(3:83|84|85)|(4:18|(1:20)(1:57)|21|(5:23|(1:25)(1:54)|26|27|(4:(2:30|(1:35))(1:53)|(1:48)(1:41)|42|(1:44)))(2:55|56))|59|60)|14|15|16|(0)|59|60) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:
    
        if (r11.booleanValue() == r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ee, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ef, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0105  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        Throwable th;
        InputStream inputStream;
        InputStream inputStream2;
        int i;
        ?? r16;
        boolean z;
        u0b u0bVar = (u0b) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = new ArrayList();
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z2 = true;
        options.inJustDecodeBounds = true;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        Boolean bool = null;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            if (obj instanceof Uri) {
                Uri uri = (Uri) obj;
                String[] strArr = MediaController.W1;
                String str = "webp";
                try {
                    inputStream2 = a.b.getContentResolver().openInputStream(uri);
                } catch (Exception unused) {
                    inputStream2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                    if (inputStream != null) {
                    }
                }
                if (inputStream2 == null) {
                    try {
                        try {
                            boolean z3 = z2;
                            try {
                                File file = new File(uri.getPath());
                                r16 = z3;
                                if (file.exists()) {
                                    inputStream2 = new FileInputStream(file);
                                    r16 = z3;
                                }
                            } catch (Exception e) {
                                e = e;
                                z2 = z3 ? 1 : 0;
                                fa4.g(e, z2);
                                if (inputStream2 != null) {
                                }
                                str = null;
                                if (str != null) {
                                }
                                z2 = true;
                                i3++;
                                i2 = 0;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = inputStream2;
                            if (inputStream != null) {
                                throw th;
                            }
                            try {
                                inputStream.close();
                                throw th;
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                                throw th;
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } else {
                    r16 = z2;
                }
                byte[] bArr = new byte[12];
                if (inputStream2.read(bArr, i2, 12) == 12) {
                    try {
                        byte b = bArr[i2];
                        if (b == -119 && bArr[r16] == 80 && bArr[2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10) {
                            str = "png";
                            try {
                                inputStream2.close();
                            } catch (Exception e4) {
                                e = e4;
                                z = r16;
                                fa4.g(e, z);
                                if (str != null) {
                                }
                                z2 = true;
                                i3++;
                                i2 = 0;
                            }
                        } else if (b == 31 && bArr[1] == -117) {
                            try {
                                inputStream2.close();
                            } catch (Exception e5) {
                                fa4.g(e5, true);
                            }
                            str = "tgs";
                        } else {
                            String lowerCase = new String(bArr).toLowerCase();
                            if (lowerCase.startsWith("riff") && lowerCase.endsWith("webp")) {
                                try {
                                    inputStream2.close();
                                } catch (Exception e6) {
                                    e = e6;
                                    z = true;
                                    fa4.g(e, z);
                                    if (str != null) {
                                    }
                                    z2 = true;
                                    i3++;
                                    i2 = 0;
                                }
                            }
                        }
                    } catch (Exception e7) {
                        e = e7;
                        z2 = true;
                        fa4.g(e, z2);
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Exception e8) {
                                e = e8;
                                fa4.g(e, z2);
                                str = null;
                                if (str != null) {
                                }
                                z2 = true;
                                i3++;
                                i2 = 0;
                            }
                        }
                        str = null;
                        if (str != null) {
                        }
                        z2 = true;
                        i3++;
                        i2 = 0;
                    }
                    if (str != null) {
                        boolean equals = "tgs".equals(str);
                        if (bool == null) {
                            bool = Boolean.valueOf(equals);
                        }
                        if (!u0bVar.J) {
                            s3a s3aVar = new s3a();
                            s3aVar.e = equals;
                            String o = MediaController.o((equals ? 64 : 512) << 10, uri, str);
                            s3aVar.a = o;
                            if (o != null) {
                                if (equals) {
                                    s3aVar.d = "application/x-tgsticker";
                                } else {
                                    BitmapFactory.decodeFile(o, options);
                                    int i4 = options.outWidth;
                                    if ((i4 == 512 && (i = options.outHeight) > 0 && i <= 512) || (options.outHeight == 512 && i4 > 0 && i4 <= 512)) {
                                        s3aVar.d = "image/".concat(str);
                                        s3aVar.c = true;
                                    }
                                }
                                if (arrayList2 != null && arrayList2.size() == size && (arrayList2.get(i3) instanceof String)) {
                                    s3aVar.b = (String) arrayList2.get(i3);
                                } else {
                                    s3aVar.b = "#️⃣";
                                }
                                arrayList3.add(s3aVar);
                                if (arrayList3.size() >= 200) {
                                    break;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    z2 = true;
                }
                inputStream2.close();
                str = null;
                if (str != null) {
                }
                z2 = true;
            }
            i3++;
            i2 = 0;
        }
        gl.d3(new q3a((Object) u0bVar, (Object) arrayList3, (Object) bool, (byte) 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        sca scaVar;
        long B1;
        ArrayList arrayList;
        d dVar;
        byte b;
        boolean z;
        String str;
        TLRPC.Message message;
        boolean z2;
        boolean z3;
        long j;
        byte b2 = 8;
        byte b3 = 7;
        boolean z4 = 0;
        switch (this.a) {
            case 0:
                r3a r3aVar = (r3a) this.b;
                TLObject tLObject = (TLObject) this.c;
                Runnable runnable = (Runnable) this.d;
                boolean z5 = tLObject instanceof TLRPC.TL_messageMediaDocument;
                s3a s3aVar = r3aVar.b;
                if (z5) {
                    TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
                    s3aVar.f = tL_inputStickerSetItem;
                    tL_inputStickerSetItem.document = new TLRPC.TL_inputDocument();
                    TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem2 = s3aVar.f;
                    TLRPC.InputDocument inputDocument = tL_inputStickerSetItem2.document;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
                    inputDocument.id = document.id;
                    inputDocument.access_hash = document.access_hash;
                    inputDocument.file_reference = document.file_reference;
                    String str2 = s3aVar.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    tL_inputStickerSetItem2.emoji = str2;
                    s3aVar.d = document.mime_type;
                } else if (s3aVar.e) {
                    s3aVar.d = "application/x-bad-tgsticker";
                }
                runnable.run();
                break;
            case 1:
                c7a c7aVar = (c7a) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                SessionsActivity sessionsActivity = c7aVar.k0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.q0();
                    g7a g7aVar = sessionsActivity.a;
                    if (g7aVar != null) {
                        g7aVar.f();
                    }
                    sessionsActivity.o0(true);
                    break;
                }
                break;
            case 2:
                d7a d7aVar = (d7a) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.d;
                SessionsActivity sessionsActivity2 = d7aVar.a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.q0();
                    g7a g7aVar2 = sessionsActivity2.a;
                    if (g7aVar2 != null) {
                        g7aVar2.f();
                        break;
                    }
                }
                break;
            case 3:
                f7a f7aVar = (f7a) this.b;
                String str3 = (String) this.c;
                u91 u91Var = (u91) this.d;
                try {
                    byte[] decode = Base64.decode(str3.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    f7aVar.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new hj7(f7aVar, u91Var, (byte) 23));
                    break;
                } catch (Exception e) {
                    fa4.e("Failed to pass qr code auth", e);
                    gl.d3(new e7a(f7aVar, (byte) 1));
                    u91Var.run();
                    return;
                }
            case 4:
                nfa nfaVar = (nfa) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                cs5 cs5Var = (cs5) this.d;
                ij.P(nfaVar.getContext(), null, nfaVar.I1, new aca(nfaVar, storyItem));
                cs5Var.u();
                break;
            case 5:
                nfa nfaVar2 = (nfa) this.b;
                String str4 = (String) this.c;
                d dVar2 = (d) this.d;
                dVar2.showDialog(new tda(nfaVar2.getContext(), str4, str4, nfaVar2.I1, dVar2));
                break;
            case 6:
                bea beaVar = (bea) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.c;
                nfa nfaVar3 = beaVar.r;
                beaVar.n = 0;
                int b4 = beaVar.b();
                if (tL_error3 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    nfaVar3.y1.getMessagesController().U3(messages_chats.chats, false);
                    beaVar.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    beaVar.d.addAll(messages_chats.chats);
                } else {
                    beaVar.h = true;
                }
                int i = 0;
                while (true) {
                    iea[] ieaVarArr = nfaVar3.n0;
                    if (i >= ieaVarArr.length) {
                        beaVar.e = false;
                        beaVar.f = true;
                        beaVar.f();
                        break;
                    } else {
                        iea ieaVar = ieaVarArr[i];
                        if (ieaVar.F == 6 && (scaVar = ieaVar.h) != null && (beaVar.f || b4 == 0)) {
                            nfaVar3.i(scaVar, 0, null);
                        }
                        i++;
                    }
                }
                break;
            case 7:
                gea geaVar = (gea) this.b;
                String str5 = (String) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                d dVar3 = geaVar.s.y1;
                String lowerCase = str5.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    gl.d3(new q3a(geaVar, new ArrayList(), new ArrayList(), b2));
                    break;
                } else {
                    String S0 = k96.D0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i2 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i2];
                    strArr[0] = lowerCase;
                    if (S0 != null) {
                        strArr[1] = S0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TLObject tLObject3 = (TLObject) arrayList2.get(i3);
                        if (tLObject3 instanceof TLRPC.ChatParticipant) {
                            B1 = ((TLRPC.ChatParticipant) tLObject3).user_id;
                        } else {
                            if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                                B1 = k27.B1(((TLRPC.ChannelParticipant) tLObject3).peer);
                            }
                            arrayList = arrayList2;
                            dVar = dVar3;
                            i3++;
                            dVar3 = dVar;
                            z4 = 0;
                            arrayList2 = arrayList;
                        }
                        TLRPC.User V1 = dVar3.getMessagesController().V1(Long.valueOf(B1));
                        if (V1.id != dVar3.getUserConfig().e()) {
                            String lowerCase2 = l7c.q(V1).toLowerCase();
                            String S02 = k96.D0().S0(lowerCase2, true, z4);
                            if (lowerCase2.equals(S02)) {
                                S02 = null;
                            }
                            char c = z4;
                            for (int i4 = z4; i4 < i2; i4++) {
                                String str6 = strArr[i4];
                                arrayList = arrayList2;
                                if (lowerCase2.startsWith(str6) || de9.t(" ", str6, lowerCase2) || (S02 != null && (S02.startsWith(str6) || de9.t(" ", str6, S02)))) {
                                    c = 1;
                                } else {
                                    String o = l7c.o(V1);
                                    if (o != null && o.startsWith(str6)) {
                                        c = 2;
                                    }
                                }
                                if (c != 0) {
                                    dVar = dVar3;
                                    if (c == 1) {
                                        arrayList3.add(gl.r0(V1.first_name, V1.last_name, str6));
                                    } else {
                                        arrayList3.add(gl.r0("@" + l7c.o(V1), null, "@" + str6));
                                    }
                                    arrayList4.add(tLObject3);
                                    i3++;
                                    dVar3 = dVar;
                                    z4 = 0;
                                    arrayList2 = arrayList;
                                } else {
                                    arrayList2 = arrayList;
                                }
                            }
                        }
                        arrayList = arrayList2;
                        dVar = dVar3;
                        i3++;
                        dVar3 = dVar;
                        z4 = 0;
                        arrayList2 = arrayList;
                    }
                    gl.d3(new q3a((Object) geaVar, (Object) arrayList3, (Object) arrayList4, (byte) 8));
                    break;
                }
                break;
            case 8:
                gea geaVar2 = (gea) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                nfa nfaVar4 = geaVar2.s;
                if (nfaVar4.Y0) {
                    geaVar2.d = arrayList5;
                    geaVar2.r--;
                    if (!hc2.T(geaVar2.n)) {
                        ArrayList arrayList7 = geaVar2.e.g;
                        arrayList7.clear();
                        arrayList7.addAll(arrayList6);
                    }
                    if (geaVar2.r == 0) {
                        int i5 = 0;
                        while (true) {
                            iea[] ieaVarArr2 = nfaVar4.n0;
                            if (i5 < ieaVarArr2.length) {
                                iea ieaVar2 = ieaVarArr2[i5];
                                if (ieaVar2.F == 7) {
                                    if (geaVar2.h == 0) {
                                        ieaVar2.w.e(false, true);
                                    } else {
                                        nfaVar4.i(ieaVar2.h, 0, null);
                                    }
                                }
                                i5++;
                            }
                        }
                    }
                    geaVar2.f();
                    break;
                }
                break;
            case 9:
                byte b5 = 4;
                kea keaVar = (kea) this.b;
                String str7 = (String) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                keaVar.getClass();
                String lowerCase3 = str7.trim().toLowerCase();
                if (lowerCase3.length() == 0) {
                    gl.d3(new t7a(keaVar, new ArrayList(), b3));
                    break;
                } else {
                    String S03 = k96.D0().S0(lowerCase3, true, false);
                    String str8 = (lowerCase3.equals(S03) || S03.length() == 0) ? null : S03;
                    int i6 = (str8 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i6];
                    strArr2[0] = lowerCase3;
                    if (str8 != null) {
                        strArr2[1] = str8;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    int i7 = 0;
                    while (i7 < arrayList8.size()) {
                        k27 k27Var = (k27) arrayList8.get(i7);
                        int i8 = 0;
                        while (true) {
                            if (i8 < i6) {
                                String str9 = strArr2[i8];
                                String I0 = k27Var.I0();
                                if (I0 == null || I0.length() == 0) {
                                    b = b5;
                                } else if (I0.toLowerCase().contains(str9)) {
                                    arrayList9.add(k27Var);
                                } else {
                                    b = b5;
                                    if (keaVar.r == b) {
                                        int i9 = k27Var.D;
                                        TLRPC.Message message2 = k27Var.k;
                                        TLRPC.Document document2 = i9 == 0 ? k27.n1(message2).webpage.document : k27.n1(message2).document;
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 < document2.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document2.attributes.get(i10);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str10 = documentAttribute.performer;
                                                    z = str10 != null ? str10.toLowerCase().contains(str9) : false;
                                                    if (!z && (str = documentAttribute.title) != null) {
                                                        z = str.toLowerCase().contains(str9);
                                                    }
                                                } else {
                                                    i10++;
                                                }
                                            } else {
                                                z = false;
                                            }
                                        }
                                        if (z) {
                                            arrayList9.add(k27Var);
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i8++;
                                b5 = b;
                            }
                        }
                        b = b5;
                        i7++;
                        b5 = b;
                    }
                    gl.d3(new t7a(keaVar, arrayList9, b3));
                    break;
                }
                break;
            case 10:
                wla wlaVar = (wla) this.b;
                m46 m46Var = (m46) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                k46 k46Var = wlaVar.H;
                if (k46Var != null && wlaVar.I == m46Var) {
                    k46Var.a(clickableSpan);
                    wlaVar.I = null;
                    wlaVar.y.e(true);
                    break;
                }
                break;
            case 11:
                vqa vqaVar = (vqa) this.b;
                Long l = (Long) this.c;
                vqaVar.c2(l.longValue(), new f28(vqaVar, l, (xu4[]) this.d, b3));
                break;
            case 12:
                vqa vqaVar2 = (vqa) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                k27 k27Var2 = (k27) this.d;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject4;
                na7.q1(vqaVar2.a).a4(messages_messages.users, false);
                na7.q1(vqaVar2.a).U3(messages_messages.chats, false);
                vqaVar2.H2 = true;
                vqaVar2.G2 = false;
                if (vqaVar2.k3 != null && (message = k27Var2.k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction).saved = !r3.booleanValue();
                    } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = !r3.booleanValue();
                    }
                }
                vqaVar2.l2(k27Var2, null);
                break;
            case 13:
                vqa vqaVar3 = (vqa) this.b;
                c01 c01Var = (c01) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                c01Var.c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                vqaVar3.a2.setResellPrice(nj.j(0L, oj.a));
                eq8 eq8Var = vqaVar3.i3;
                if (eq8Var != null) {
                    eq8Var.run();
                }
                vqaVar3.j().Q(R.raw.contact_check, 36, k96.a0(null, null, 2131750013, vqaVar3.s1())).j();
                break;
            case 14:
                vqa vqaVar4 = (vqa) this.b;
                c01 c01Var2 = (c01) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                c01Var2.c(false);
                vqaVar4.j().g0(tL_error4, false);
                break;
            case 15:
                Runnable runnable2 = (Runnable) this.d;
                c01 c01Var3 = (c01) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.c;
                runnable2.run();
                c01Var3.c(false);
                vqa.g2(twoStepVerificationActivity);
                break;
            case 16:
                Runnable runnable3 = (Runnable) this.d;
                TLRPC.Document document3 = (TLRPC.Document) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                d S = LaunchActivity.S();
                u21 b0 = S != null ? u21.b0(S) : u21.Y();
                m21 q = runnable3 == null ? document3 != null ? b0.q(document3, charSequence) : b0.Q(R.raw.contact_check, 36, charSequence) : document3 != null ? b0.r(document3, charSequence, k96.M0(2131749872, null), runnable3) : b0.K(R.raw.contact_check, charSequence, k96.M0(2131749872, null), runnable3);
                q.t = true;
                q.j();
                break;
            case 17:
                ((vqa) this.b).K1((hd) this.c, (k27) this.d);
                break;
            case 18:
                vqa vqaVar5 = (vqa) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.c;
                String str11 = (String) this.d;
                long j2 = tL_starGiftUnique2.gift_id;
                String str12 = tL_starGiftUnique2.title;
                String s1 = vqaVar5.s1();
                TLRPC.Document document4 = tL_starGiftUnique2.getDocument();
                String str13 = tL_starGiftUnique2.slug;
                hd hdVar = new hd(3, null, a.b);
                hdVar.q(500L);
                TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
                getuniquestargiftvalueinfo.slug = str13;
                ConnectionsManager.getInstance(vqaVar5.a).sendRequest(getuniquestargiftvalueinfo, new p77(vqaVar5, hdVar, document4, str11, str12, s1, j2));
                break;
            case 19:
                TLObject tLObject5 = (TLObject) this.c;
                e eVar = (e) this.b;
                String str14 = (String) this.d;
                if (tLObject5 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.StarGift starGift = ((TL_stars.TL_payments_uniqueStarGift) tLObject5).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique3 = (TL_stars.TL_starGiftUnique) starGift;
                        Long valueOf = Long.valueOf(tL_starGiftUnique3.gift_id);
                        String str15 = tL_starGiftUnique3.title;
                        if (str15 != null) {
                            str14 = str15;
                        }
                        eVar.a(valueOf, str14);
                        break;
                    }
                }
                eVar.a(0L, str14);
                break;
            case 20:
                gta gtaVar = (gta) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                Runnable runnable4 = (Runnable) this.d;
                ArrayList arrayList10 = gtaVar.v;
                boolean[] zArr = gtaVar.r;
                boolean[] zArr2 = gtaVar.t;
                ArrayList[] arrayListArr = gtaVar.q;
                int i11 = gtaVar.a;
                boolean z6 = !gtaVar.e;
                gtaVar.c = System.currentTimeMillis();
                if (tLObject6 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject6;
                    na7.q1(i11).a4(starsStatus.users, false);
                    na7.q1(i11).U3(starsStatus.chats, false);
                    if (!arrayListArr[0].isEmpty() || zArr2[0]) {
                        j = 0;
                        z3 = false;
                    } else {
                        ArrayList<TL_stars.StarsTransaction> arrayList11 = starsStatus.history;
                        int size2 = arrayList11.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            TL_stars.StarsTransaction starsTransaction = arrayList11.get(i12);
                            i12++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            arrayListArr[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                        }
                        j = 0;
                        for (int i13 = 0; i13 < 3; i13++) {
                            zArr[i13] = !arrayListArr[i13].isEmpty() || zArr[i13];
                            boolean[] zArr3 = gtaVar.u;
                            boolean z7 = (starsStatus.flags & 1) == 0;
                            zArr3[i13] = z7;
                            if (z7) {
                                zArr2[i13] = false;
                            }
                            gtaVar.s[i13] = zArr3[i13] ? null : starsStatus.next_offset;
                        }
                        z3 = true;
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList10.addAll(starsStatus.subscriptions);
                        gtaVar.x = false;
                        gtaVar.w = starsStatus.subscriptions_next_offset;
                        gtaVar.y = (starsStatus.flags & 4) == 0;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j3 = gtaVar.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j3 != starsAmount.amount) {
                        z6 = true;
                    }
                    gtaVar.f = starsAmount;
                    gtaVar.g = j;
                } else {
                    z2 = false;
                    z3 = false;
                }
                gtaVar.d = false;
                gtaVar.e = true;
                if (z6) {
                    kk7.f(i11).k(kk7.z3, new Object[0]);
                }
                if (z3) {
                    kk7.f(i11).k(kk7.A3, new Object[0]);
                }
                if (z2) {
                    kk7.f(i11).k(kk7.B3, new Object[0]);
                }
                if (runnable4 != null) {
                    runnable4.run();
                    break;
                }
                break;
            case 21:
                gta gtaVar2 = (gta) this.b;
                HashSet hashSet = (HashSet) this.c;
                Runnable runnable5 = (Runnable) this.d;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.getClass();
                    gtaVar2.Q.remove(num);
                    gtaVar2.R.remove(num);
                }
                runnable5.run();
                break;
            case 22:
                boolean[] zArr4 = (boolean[]) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                fx0[] fx0VarArr = (fx0[]) this.d;
                zArr4[0] = false;
                gl.t1(editTextBoldCursor);
                fx0VarArr[0].dismiss();
                break;
            case 23:
                u0b u0bVar = (u0b) this.b;
                String str16 = (String) this.c;
                s3a s3aVar2 = (s3a) this.d;
                if (!u0bVar.J) {
                    u0bVar.T1.remove(str16);
                    if ("application/x-tgsticker".equals(s3aVar2.d)) {
                        s3aVar2.c = true;
                        int indexOf = u0bVar.S1.indexOf(s3aVar2);
                        if (indexOf >= 0) {
                            s49 K = u0bVar.m1.K(indexOf);
                            if (K != null) {
                                ((xya) K.a).setSticker(s3aVar2);
                            }
                        } else {
                            u0bVar.n1.f();
                        }
                    } else {
                        u0bVar.M0(s3aVar2);
                    }
                    if (u0bVar.T1.isEmpty()) {
                        u0bVar.T0();
                        break;
                    }
                }
                break;
            case 24:
                u0b u0bVar2 = (u0b) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                Boolean bool = (Boolean) this.d;
                u0bVar2.S1 = arrayList12;
                if (arrayList12.isEmpty()) {
                    u0bVar2.dismiss();
                    break;
                } else {
                    u0bVar2.n1.f();
                    if (bool.booleanValue()) {
                        u0bVar2.T1 = new HashMap();
                        int size3 = u0bVar2.S1.size();
                        for (int i14 = 0; i14 < size3; i14++) {
                            s3a s3aVar3 = (s3a) u0bVar2.S1.get(i14);
                            u0bVar2.T1.put(s3aVar3.a, s3aVar3);
                            ba4.G(u0bVar2.a).h0(false, 67108864, s3aVar3.a, true);
                        }
                    }
                    u0bVar2.T0();
                    break;
                }
            case 25:
                u0b u0bVar3 = (u0b) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.c;
                d dVar4 = u0bVar3.F1;
                TLRPC.StickerSet stickerSet = u0bVar3.M1.set;
                int i15 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
                try {
                    if (tL_error5 == null) {
                        if (u0bVar3.d2) {
                            m21.g(dVar4, new nza(u0bVar3.v1.getContext(), u0bVar3.M1, 1, 2, null, u0bVar3.J0), 1500).j();
                        }
                        if (tLObject7 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                            hq6.d0(u0bVar3.a).C1(dVar4, true, i15, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject7);
                        }
                    } else {
                        Toast.makeText(u0bVar3.getContext(), k96.M0(2131751093, null), 0).show();
                    }
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                hq6.d0(u0bVar3.a).b1(i15, false, true);
                break;
            case 26:
                u0b u0bVar4 = (u0b) this.b;
                String str17 = (String) this.c;
                TextView textView = (TextView) this.d;
                TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
                tL_stickers_checkShortName.short_name = str17;
                u0bVar4.j2 = ConnectionsManager.getInstance(u0bVar4.a).sendRequest(tL_stickers_checkShortName, new ck8((Object) u0bVar4, (Object) str17, (Object) textView, (byte) 21), 2);
                break;
            case 27:
                a();
                break;
            case 28:
                b1b b1bVar = (b1b) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str18 = tL_messages_searchStickerSets.q;
                c1b c1bVar = b1bVar.a;
                String str19 = c1bVar.S;
                r1c r1cVar = c1bVar.e;
                if (str18.equals(str19)) {
                    b1bVar.a();
                    r1cVar.b.h.getProgressDrawable().e = false;
                    c1bVar.O = 0;
                    r1cVar.b(true);
                    c1bVar.F.addAll(tL_messages_foundStickerSets.sets);
                    c1bVar.f();
                    break;
                }
                break;
            default:
                g2b g2bVar = (g2b) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                int i16 = g2bVar.a;
                g2bVar.R = true;
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    g2bVar.S = null;
                    kk7.f(i16).k(kk7.c3, new Object[0]);
                    break;
                } else if (tLObject8 instanceof TL_stories.canSendStoryCount) {
                    g2bVar.S = new wx(1, ((TL_stories.canSendStoryCount) tLObject8).count_remains, -1L);
                    kk7.f(i16).k(kk7.c3, new Object[0]);
                    break;
                } else {
                    g2bVar.m(tL_error6);
                    break;
                }
        }
    }

    public /* synthetic */ q3a(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ q3a(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = obj;
        this.d = tL_error;
        this.c = tLObject;
    }

    public /* synthetic */ q3a(Runnable runnable, TLRPC.Document document, CharSequence charSequence) {
        this.a = (byte) 16;
        this.d = runnable;
        this.b = document;
        this.c = charSequence;
    }

    public /* synthetic */ q3a(TLObject tLObject, e eVar, String str) {
        this.a = (byte) 19;
        this.c = tLObject;
        this.b = eVar;
        this.d = str;
    }
}
