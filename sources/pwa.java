// default package

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Cells.f;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pwa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pwa(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(3:434|435|(11:437|310|311|312|(6:366|367|(2:389|(2:401|(3:405|406|407))(3:395|396|397))(3:383|384|385)|(4:318|(1:320)(1:357)|321|(5:323|(1:325)(1:354)|326|327|(4:(2:330|(1:335))(1:353)|(1:348)(1:341)|342|(1:344)))(2:355|356))|359|360)|314|315|316|(0)|359|360))|311|312|(0)|314|315|316|(0)|359|360) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:303|(3:304|305|306)|307|(3:434|435|(11:437|310|311|312|(6:366|367|(2:389|(2:401|(3:405|406|407))(3:395|396|397))(3:383|384|385)|(4:318|(1:320)(1:357)|321|(5:323|(1:325)(1:354)|326|327|(4:(2:330|(1:335))(1:353)|(1:348)(1:341)|342|(1:344)))(2:355|356))|359|360)|314|315|316|(0)|359|360))|309|310|311|312|(0)|314|315|316|(0)|359|360) */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0830, code lost:
    
        if (r17.booleanValue() == r0) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0808, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0809, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x080e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x080f, code lost:
    
        r3 = r21 ? 1 : 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:318:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x078b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0816 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x08ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:433:? A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b;
        byte b2;
        byte b3;
        Throwable th;
        InputStream inputStream;
        InputStream inputStream2;
        boolean z;
        InputStream inputStream3;
        File file;
        String str;
        int i;
        byte[] bArr;
        r47 r47Var;
        int e1;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        boolean contains;
        TLRPC.Message message;
        int i2;
        char c = 7;
        byte b4 = 2;
        ou1 ou1Var = null;
        r11 = false;
        boolean z2 = false;
        byte b5 = 1;
        switch (this.a) {
            case 0:
                jxa jxaVar = (jxa) this.b;
                HashSet hashSet = (HashSet) this.c;
                Runnable runnable = (Runnable) this.d;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.getClass();
                    jxaVar.Q.remove(num);
                    jxaVar.R.remove(num);
                }
                runnable.run();
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                nx0[] nx0VarArr = (nx0[]) this.d;
                zArr[0] = false;
                hl.t1(editTextBoldCursor);
                nx0VarArr[0].dismiss();
                return;
            case 2:
                InputStream inputStream4 = null;
                s4b s4bVar = (s4b) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size = arrayList.size();
                Boolean bool = null;
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        Object obj = arrayList.get(i3);
                        char c2 = c;
                        if (obj instanceof Uri) {
                            Uri uri = (Uri) obj;
                            String[] strArr = MediaController.W1;
                            b2 = b4;
                            try {
                                inputStream2 = a.b.getContentResolver().openInputStream(uri);
                            } catch (Exception unused) {
                                inputStream2 = inputStream4;
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = inputStream4;
                                if (inputStream == null) {
                                }
                            }
                            b = 3;
                            try {
                                if (inputStream2 == null) {
                                    try {
                                        file = new File(uri.getPath());
                                    } catch (Exception e) {
                                        e = e;
                                        z = b5;
                                        inputStream3 = inputStream2;
                                        cc4.g(e, z);
                                        if (inputStream3 != null) {
                                        }
                                        str = null;
                                        if (str != null) {
                                        }
                                        b3 = 1;
                                        i3++;
                                        b5 = b3;
                                        c = c2;
                                        b4 = b2;
                                        inputStream4 = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStream = inputStream2;
                                        if (inputStream == null) {
                                        }
                                    }
                                    if (file.exists()) {
                                        inputStream3 = new FileInputStream(file);
                                        boolean z3 = b5;
                                        bArr = new byte[12];
                                        if (inputStream3.read(bArr, 0, 12) == 12) {
                                            try {
                                                byte b6 = bArr[0];
                                                if (b6 == -119 && bArr[z3 ? 1 : 0] == 80 && bArr[b2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[c2] == 10) {
                                                    str = "png";
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Exception e2) {
                                                        cc4.g(e2, z3);
                                                    }
                                                } else if (b6 == 31 && bArr[1] == -117) {
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Exception e3) {
                                                        cc4.g(e3, true);
                                                    }
                                                    str = "tgs";
                                                } else {
                                                    String lowerCase = new String(bArr).toLowerCase();
                                                    if (lowerCase.startsWith("riff") && lowerCase.endsWith("webp")) {
                                                        try {
                                                            inputStream3.close();
                                                        } catch (Exception e4) {
                                                            cc4.g(e4, true);
                                                        }
                                                        str = "webp";
                                                    }
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                z = 1;
                                                cc4.g(e, z);
                                                if (inputStream3 != null) {
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                        cc4.g(e, z);
                                                        str = null;
                                                        if (str != null) {
                                                        }
                                                        b3 = 1;
                                                        i3++;
                                                        b5 = b3;
                                                        c = c2;
                                                        b4 = b2;
                                                        inputStream4 = null;
                                                    }
                                                }
                                                str = null;
                                                if (str != null) {
                                                }
                                                b3 = 1;
                                                i3++;
                                                b5 = b3;
                                                c = c2;
                                                b4 = b2;
                                                inputStream4 = null;
                                            }
                                            if (str != null) {
                                                boolean equals = "tgs".equals(str);
                                                if (bool != null) {
                                                    break;
                                                } else {
                                                    bool = Boolean.valueOf(equals);
                                                }
                                                if (s4bVar.J) {
                                                    return;
                                                }
                                                k7a k7aVar = new k7a();
                                                k7aVar.e = equals;
                                                String q = MediaController.q((equals ? 64 : 512) << 10, uri, str);
                                                k7aVar.a = q;
                                                if (q != null) {
                                                    if (equals) {
                                                        k7aVar.d = "application/x-tgsticker";
                                                    } else {
                                                        BitmapFactory.decodeFile(q, options);
                                                        int i4 = options.outWidth;
                                                        if ((i4 == 512 && (i = options.outHeight) > 0 && i <= 512) || (options.outHeight == 512 && i4 > 0 && i4 <= 512)) {
                                                            k7aVar.d = "image/".concat(str);
                                                            k7aVar.c = true;
                                                        }
                                                    }
                                                    if (arrayList2 != null && arrayList2.size() == size && (arrayList2.get(i3) instanceof String)) {
                                                        k7aVar.b = (String) arrayList2.get(i3);
                                                    } else {
                                                        k7aVar.b = "#️⃣";
                                                    }
                                                    arrayList3.add(k7aVar);
                                                    if (arrayList3.size() >= 200) {
                                                    }
                                                }
                                            }
                                            b3 = 1;
                                        }
                                        inputStream3.close();
                                        str = null;
                                        if (str != null) {
                                        }
                                        b3 = 1;
                                    }
                                }
                                bArr = new byte[12];
                                if (inputStream3.read(bArr, 0, 12) == 12) {
                                }
                                inputStream3.close();
                                str = null;
                                if (str != null) {
                                }
                                b3 = 1;
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream = inputStream3;
                                if (inputStream == null) {
                                    throw th;
                                }
                                try {
                                    inputStream.close();
                                    throw th;
                                } catch (Exception e7) {
                                    cc4.g(e7, true);
                                    throw th;
                                }
                            }
                            inputStream3 = inputStream2;
                            boolean z32 = b5;
                        } else {
                            b2 = b4;
                            b3 = b5;
                        }
                        i3++;
                        b5 = b3;
                        c = c2;
                        b4 = b2;
                        inputStream4 = null;
                    } else {
                        b = 3;
                    }
                }
                hl.c3(new pwa(s4bVar, arrayList3, bool, b));
                return;
            case 3:
                s4b s4bVar2 = (s4b) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                Boolean bool2 = (Boolean) this.d;
                s4bVar2.S1 = arrayList4;
                if (arrayList4.isEmpty()) {
                    s4bVar2.dismiss();
                    return;
                }
                s4bVar2.n1.f();
                if (bool2.booleanValue()) {
                    s4bVar2.T1 = new HashMap();
                    int size2 = s4bVar2.S1.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        k7a k7aVar2 = (k7a) s4bVar2.S1.get(i5);
                        s4bVar2.T1.put(k7aVar2.a, k7aVar2);
                        xb4.G(s4bVar2.a).h0(false, 67108864, k7aVar2.a, true);
                    }
                }
                s4bVar2.U0();
                return;
            case 4:
                s4b s4bVar3 = (s4b) this.b;
                String str2 = (String) this.c;
                k7a k7aVar3 = (k7a) this.d;
                if (s4bVar3.J) {
                    return;
                }
                s4bVar3.T1.remove(str2);
                if ("application/x-tgsticker".equals(k7aVar3.d)) {
                    k7aVar3.c = true;
                    int indexOf = s4bVar3.S1.indexOf(k7aVar3);
                    if (indexOf >= 0) {
                        f89 L = s4bVar3.m1.L(indexOf);
                        if (L != null) {
                            ((x2b) L.a).setSticker(k7aVar3);
                        }
                    } else {
                        s4bVar3.n1.f();
                    }
                } else {
                    s4bVar3.N0(k7aVar3);
                }
                if (s4bVar3.T1.isEmpty()) {
                    s4bVar3.U0();
                    return;
                }
                return;
            case 5:
                s4b s4bVar4 = (s4b) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                e eVar = s4bVar4.F1;
                TLRPC.StickerSet stickerSet = s4bVar4.M1.set;
                int i6 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
                try {
                    if (tL_error == null) {
                        if (s4bVar4.d2) {
                            v21.g(eVar, new l3b(s4bVar4.v1.getContext(), s4bVar4.M1, 1, 2, null, s4bVar4.J0), 1500).j();
                        }
                        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                            ls6.d0(s4bVar4.a).C1(eVar, true, i6, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                        }
                    } else {
                        Toast.makeText(s4bVar4.getContext(), ob6.M0(2131751070, null), 0).show();
                    }
                } catch (Exception e8) {
                    cc4.g(e8, true);
                }
                ls6.d0(s4bVar4.a).b1(i6, false, true);
                return;
            case 6:
                s4b s4bVar5 = (s4b) this.b;
                String str3 = (String) this.c;
                TextView textView = (TextView) this.d;
                TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
                tL_stickers_checkShortName.short_name = str3;
                s4bVar5.j2 = ConnectionsManager.getInstance(s4bVar5.a).sendRequest(tL_stickers_checkShortName, new qn8((Object) s4bVar5, (Object) str3, (Object) textView, (byte) 21), 2);
                return;
            case 7:
                y4b y4bVar = (y4b) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str4 = tL_messages_searchStickerSets.q;
                z4b z4bVar = y4bVar.a;
                String str5 = z4bVar.S;
                q5c q5cVar = z4bVar.e;
                if (str4.equals(str5)) {
                    y4bVar.a();
                    q5cVar.b.h.getProgressDrawable().e = false;
                    z4bVar.O = 0;
                    q5cVar.b(true);
                    z4bVar.F.addAll(tL_messages_foundStickerSets.sets);
                    z4bVar.f();
                    return;
                }
                return;
            case 8:
                c6b c6bVar = (c6b) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                int i7 = c6bVar.a;
                c6bVar.R = true;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    c6bVar.S = null;
                    jn7.f(i7).k(jn7.d3, new Object[0]);
                    return;
                } else if (!(tLObject2 instanceof TL_stories.canSendStoryCount)) {
                    c6bVar.m(tL_error2);
                    return;
                } else {
                    c6bVar.S = new xx(1, ((TL_stories.canSendStoryCount) tLObject2).count_remains, -1L);
                    jn7.f(i7).k(jn7.d3, new Object[0]);
                    return;
                }
            case 9:
                o5b o5bVar = (o5b) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                Runnable runnable2 = (Runnable) this.d;
                r5b r5bVar = o5bVar.q;
                ArrayList arrayList5 = o5bVar.G;
                ArrayList arrayList6 = o5bVar.i;
                ArrayList arrayList7 = o5bVar.H;
                o5bVar.F = 0;
                o5bVar.C = false;
                o5bVar.D = true;
                o5bVar.r = true;
                ArrayList arrayList8 = new ArrayList();
                if (tLObject3 instanceof Vector) {
                    ArrayList<T> arrayList9 = ((Vector) tLObject3).objects;
                    int size3 = arrayList9.size();
                    int i8 = 0;
                    while (i8 < size3) {
                        Object obj2 = arrayList9.get(i8);
                        i8++;
                        arrayList8.add((TL_bots.botPreviewMedia) obj2);
                    }
                } else {
                    if (!(tLObject3 instanceof TL_bots.previewInfo)) {
                        return;
                    }
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject3;
                    arrayList5.clear();
                    arrayList5.addAll(previewinfo.lang_codes);
                    arrayList8.addAll(previewinfo.media);
                }
                ArrayList arrayList10 = new ArrayList(arrayList6);
                arrayList6.clear();
                arrayList7.clear();
                int size4 = arrayList8.size();
                int i9 = 0;
                while (i9 < size4) {
                    Object obj3 = arrayList8.get(i9);
                    i9++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj3;
                    r47 r47Var2 = new r47(o5bVar.c, new n5b(o5bVar, o5bVar.d, botpreviewmedia));
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList10.size()) {
                            r47Var = null;
                        } else if (uc7.s0(((r47) arrayList10.get(i10)).l.media, botpreviewmedia.media)) {
                            r47Var = (r47) arrayList10.get(i10);
                        } else {
                            i10++;
                        }
                    }
                    TL_stories.StoryItem storyItem2 = r47Var2.l;
                    TLRPC.Message message2 = r47Var2.k;
                    if (r47Var == null) {
                        e1 = o5bVar.I;
                        o5bVar.I = e1 + 1;
                    } else {
                        e1 = r47Var.e1();
                    }
                    message2.id = e1;
                    storyItem2.id = e1;
                    r47Var2.j = o5bVar;
                    r47Var2.r0(false);
                    if (arrayList7.isEmpty()) {
                        arrayList7.add(new ArrayList());
                    }
                    ((ArrayList) arrayList7.get(0)).add(Integer.valueOf(r47Var2.e1()));
                    arrayList6.add(r47Var2);
                }
                hl.r(r5bVar);
                hl.c3(r5bVar);
                if (runnable2 != null) {
                    hl.c3(runnable2);
                    return;
                }
                return;
            case 10:
                o5b o5bVar2 = (o5b) this.b;
                n5b n5bVar = (n5b) this.c;
                gt gtVar = (gt) this.d;
                ArrayList arrayList11 = o5bVar2.i;
                for (int i11 = 0; i11 < arrayList11.size(); i11++) {
                    r47 r47Var3 = (r47) arrayList11.get(i11);
                    if (r47Var3 != null && (storyItem = r47Var3.l) != null && (messageMedia = storyItem.media) != null) {
                        TLRPC.MessageMedia messageMedia2 = n5bVar.media;
                        TLRPC.Document document = messageMedia2.document;
                        if (document != null) {
                            TLRPC.Document document2 = messageMedia.document;
                            if (document2 == null) {
                                continue;
                            } else if (document2.id == document.id) {
                                gtVar.a((n5b) storyItem);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia2.photo;
                        if (photo2 != null && (photo = messageMedia.photo) != null && photo.id == photo2.id) {
                            gtVar.a((n5b) storyItem);
                            return;
                        }
                    }
                }
                gtVar.a(null);
                return;
            case 11:
                r7b r7bVar = (r7b) this.b;
                nm3 nm3Var = (nm3) this.c;
                long[] jArr = (long[]) this.d;
                if (r7bVar.t == null || r7bVar.x == null) {
                    return;
                }
                nm3[] nm3VarArr = DictationAsr.a;
                if (nm3Var != null && nm3Var.j) {
                    DictationAsr.L(jArr);
                    r7bVar.t.c(jArr[0], jArr[1], true);
                    return;
                } else {
                    if (DictationAsr.z(nm3Var)) {
                        r7bVar.j();
                        return;
                    }
                    return;
                }
            case 12:
                String[] strArr2 = (String[]) this.b;
                int[][] iArr = (int[][]) this.c;
                kta ktaVar = (kta) this.d;
                for (int i12 = 0; i12 < strArr2.length; i12++) {
                    String str6 = strArr2[i12];
                    if (str6 != null) {
                        AnimatedFileNative.d(str6, iArr[i12], 0L);
                    }
                }
                hl.c3(ktaVar);
                return;
            case 13:
                String str7 = (String) this.b;
                int[][] iArr2 = (int[][]) this.c;
                kta ktaVar2 = (kta) this.d;
                AnimatedFileNative.d(str7, iArr2[0], 0L);
                hl.c3(ktaVar2);
                return;
            case 14:
                r9b r9bVar = (r9b) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                uc7 uc7Var = (uc7) this.d;
                w9b w9bVar = r9bVar.a0;
                r9bVar.w.setLoading(false);
                if (tLObject4 != null) {
                    int i13 = w9b.X1;
                    ArrayList J0 = w9bVar.J0();
                    for (int i14 = 0; i14 < J0.size(); i14++) {
                        TLRPC.User user = (TLRPC.User) J0.get(i14);
                        if (user != null && (contains = r9bVar.c.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = contains;
                            int i15 = user.flags2;
                            user.flags2 = contains ? i15 | 4 : i15 & (-5);
                            uc7Var.i4(user, false, false);
                        }
                    }
                }
                w9bVar.G0();
                if (w9bVar.T1) {
                    w9bVar.H0(new u9b(1, w9bVar.a, (ArrayList) null), new b68(w9bVar, b5), false);
                    return;
                } else {
                    w9bVar.G0();
                    w9bVar.l1.F(0);
                    return;
                }
            case 15:
                rbb rbbVar = (rbb) this.b;
                ((c8b) this.c).O0 = (File) this.d;
                nab nabVar = rbbVar.e1;
                if (nabVar != null) {
                    nabVar.b.g3.O(false);
                    return;
                }
                return;
            case 16:
                rbb rbbVar2 = (rbb) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Runnable runnable3 = (Runnable) this.d;
                if (bitmap != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), rbbVar2.C0.getMatrix(), true);
                        bitmap.recycle();
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                        if (createScaledBitmap != null) {
                            if (createScaledBitmap != createBitmap) {
                                createBitmap.recycle();
                            }
                            Utilities.blurBitmap(createScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(a.h(), "cthumb.jpg"));
                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            createScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                hl.c3(runnable3);
                return;
            case 17:
                ccb ccbVar = (ccb) this.b;
                u5b u5bVar = (u5b) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                lcb lcbVar = ccbVar.d;
                lcbVar.o0.D(lcbVar.h, u5bVar.d, arrayList12);
                return;
            case 18:
                ((MediaBrowserService.Result) ((bm6) this.c).b).sendResult(((dkb) this.b).d((String) this.d));
                return;
            case 19:
                ((ckb) this.b).q((String) this.c, (Bundle) this.d);
                return;
            case 20:
                znb znbVar = (znb) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                znb znbVar2 = (znb) this.d;
                if (!(tLObject5 instanceof TLRPC.TL_wallPaper)) {
                    znbVar.r();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject5;
                znbVar.h0 = xb4.r(null, tL_wallPaper.document);
                jn7.f(znbVar.F).a(znbVar, jn7.Y1);
                jn7.f(znbVar.F).a(znbVar, jn7.Z1);
                xb4.G(znbVar2.F).X(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 21:
                ((xqb) this.b).b0((TLRPC.TL_error) this.c, (TL_account.updateTheme) this.d);
                return;
            case 22:
                xqb xqbVar = (xqb) this.b;
                String str8 = (String) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                xqbVar.y = 0;
                String str9 = xqbVar.E;
                if (str9 == null || !str9.equals(str8)) {
                    return;
                }
                if (tL_error3 == null || !("THEME_SLUG_INVALID".equals(tL_error3.text) || "THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                    xqbVar.e0(aob.w6, ob6.a0("SetUrlAvailable", null, 2131745236, str8));
                    return;
                } else {
                    xqbVar.e0(aob.p7, ob6.M0(2131745234, null));
                    return;
                }
            case 23:
                f fVar = (f) this.b;
                znb znbVar3 = (znb) this.c;
                znbVar3.f = !znbVar3.b((File) this.d, znbVar3.c);
                hl.c3(new bcb((Object) fVar, (Object) znbVar3, (byte) 9));
                return;
            case 24:
                wsb wsbVar = (wsb) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList13 = wsbVar.d;
                if (tLObject6 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList13.clear();
                    arrayList13.addAll(((TLRPC.TL_help_timezonesList) tLObject6).timezones);
                    SerializedData serializedData = new SerializedData(tLObject6.getObjectSize());
                    tLObject6.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    jn7.f(wsbVar.a).k(jn7.t3, new Object[0]);
                }
                wsbVar.c = true;
                wsbVar.b = false;
                return;
            case 25:
                ktb ktbVar = (ktb) this.b;
                zu1 zu1Var = (zu1) this.c;
                TLRPC.TodoItem todoItem = (TLRPC.TodoItem) this.d;
                r47 r47Var4 = ktbVar.H;
                int i16 = todoItem.id;
                if (r47Var4 != null && (message = r47Var4.k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    r47.B0(message);
                    ou1Var = new ou1();
                    ou1Var.a = r47Var4;
                    ou1Var.b = -1;
                    ou1Var.c = -1;
                    ou1Var.g = true;
                    ou1Var.d = i16;
                    ou1Var.f();
                }
                zu1Var.ec(r47Var4, ou1Var);
                ktbVar.b(false);
                return;
            case 26:
                axb axbVar = (axb) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) this.d;
                ArrayList arrayList15 = axbVar.h;
                arrayList15.clear();
                ArrayList arrayList16 = axbVar.f;
                arrayList16.clear();
                arrayList15.addAll(arrayList14);
                arrayList16.addAll(tL_messages_inactiveChats.chats);
                axbVar.d.f();
                if (axbVar.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    axbVar.E = ofFloat;
                    ofFloat.addUpdateListener(new ija(axbVar, (byte) 27));
                    axbVar.E.setDuration(100L);
                    axbVar.E.start();
                } else {
                    axbVar.F = 1.0f;
                }
                hl.r(axbVar.J);
                if (axbVar.G.getVisibility() == 0) {
                    axbVar.G.animate().alpha(0.0f).setListener(new wwb(axbVar, b4)).start();
                    return;
                }
                return;
            case 27:
                tzb tzbVar = (tzb) this.b;
                ArrayList arrayList17 = (ArrayList) this.c;
                Runnable runnable4 = (Runnable) this.d;
                tzbVar.s.d(arrayList17, tzbVar.a);
                runnable4.run();
                return;
            case 28:
                ozb ozbVar = (ozb) this.b;
                String str10 = (String) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                ArrayList arrayList18 = ozbVar.g0;
                if (str10.equals(ozbVar.e0)) {
                    int i17 = ozbVar.n0;
                    ozbVar.s0 = false;
                    ozbVar.o0 = false;
                    if (tLObject7 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject7;
                        for (int i18 = 0; i18 < messages_messages.messages.size(); i18++) {
                            TLRPC.Message message3 = messages_messages.messages.get(i18);
                            i2 = ((e) ozbVar.w0).currentAccount;
                            r47 r47Var5 = new r47(i2, message3, false, false);
                            r47Var5.J5(str10, true);
                            arrayList18.add(r47Var5);
                        }
                        ozbVar.O();
                        if (arrayList18.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z2 = true;
                        }
                        ozbVar.p0 = z2;
                    } else {
                        ozbVar.p0 = false;
                    }
                    if (ozbVar.n0 == 0) {
                        ozbVar.q0.e(ozbVar.o0, true);
                    }
                    ozbVar.r0.b(i17);
                    return;
                }
                return;
            default:
                a5c a5cVar = (a5c) this.b;
                TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) this.c;
                y4c y4cVar = (y4c) this.d;
                storyItem3.detectedLng = "und";
                a5cVar.getMessagesController().O1().k.h(storyItem3.dialogId, storyItem3);
                a5cVar.J.remove(y4cVar);
                return;
        }
    }
}
