// default package

import android.app.Activity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ pf(int i, long j, ylb ylbVar, qac qacVar, Activity activity, ArrayList arrayList, HashMap hashMap) {
        this.a = (byte) 0;
        this.c = i;
        this.b = j;
        this.d = activity;
        this.e = arrayList;
        this.f = ylbVar;
        this.h = qacVar;
        this.n = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = null;
        long j = this.b;
        int i = this.c;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.n;
        Object obj5 = this.d;
        final byte b2 = 1;
        final byte b3 = 0;
        switch (b) {
            case 0:
                Activity activity = (Activity) obj5;
                ArrayList arrayList = (ArrayList) obj3;
                ylb ylbVar = (ylb) obj2;
                qac qacVar = (qac) obj;
                HashMap hashMap = (HashMap) obj4;
                long j2 = jva.v(i, false).m().amount;
                long j3 = this.b;
                if (j2 < j3) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList.get(0)).longValue();
                        new dxa(activity, ylbVar, j3, 13, pg3.r(i, longValue), new ug(qacVar, hashMap, (byte) 0), longValue).show();
                        break;
                    }
                } else {
                    qacVar.a(hashMap);
                    break;
                }
                break;
            case 1:
                final w45 w45Var = (w45) obj5;
                final s45 s45Var = (s45) obj3;
                final lf2 lf2Var = (lf2) obj2;
                String str = (String) obj;
                y25 y25Var = (y25) obj4;
                w45Var.h = false;
                if (s45Var == null) {
                    lf2Var.a(null, str);
                    break;
                } else {
                    String str2 = s45Var.e;
                    if (!w45Var.A(s45Var) || w45Var.i(s45Var)) {
                        lf2Var.a(null, "Request expired or wallet changed");
                        break;
                    } else {
                        w45Var.g = s45Var;
                        if (!"sendTransaction".equals(str2) || s45Var.f == null || !oc7.r1(w45Var.a).X3.contains(w45.k(j, i).concat(".transfer"))) {
                            if (s45Var.l >= 0 || "disconnect".equals(str2)) {
                                y25Var.close();
                                w45Var.e(s45Var, false, new qac() { // from class: o45
                                    @Override // qac
                                    public final void a(Object obj6) {
                                        byte b4 = b2;
                                        lf2 lf2Var2 = lf2Var;
                                        s45 s45Var2 = s45Var;
                                        w45 w45Var2 = w45Var;
                                        String str3 = (String) obj6;
                                        switch (b4) {
                                            case 0:
                                                w45Var2.getClass();
                                                s45Var2.m = false;
                                                w45Var2.u(s45Var2);
                                                lf2Var2.a(null, str3);
                                                break;
                                            default:
                                                w45Var2.u(s45Var2);
                                                lf2Var2.a(null, str3);
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                lf2Var.a(s45Var, null);
                                break;
                            }
                        } else {
                            s45Var.m = true;
                            w45Var.B(s45Var, y25Var, new qac() { // from class: o45
                                @Override // qac
                                public final void a(Object obj6) {
                                    byte b4 = b3;
                                    lf2 lf2Var2 = lf2Var;
                                    s45 s45Var2 = s45Var;
                                    w45 w45Var2 = w45Var;
                                    String str3 = (String) obj6;
                                    switch (b4) {
                                        case 0:
                                            w45Var2.getClass();
                                            s45Var2.m = false;
                                            w45Var2.u(s45Var2);
                                            lf2Var2.a(null, str3);
                                            break;
                                        default:
                                            w45Var2.u(s45Var2);
                                            lf2Var2.a(null, str3);
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    }
                }
                break;
            case 2:
                nm7.f(i).k(nm7.U1, (String) obj5, (TLRPC.InputFile) obj3, (TLRPC.InputEncryptedFile) obj2, (byte[]) obj, (byte[]) obj4, Long.valueOf(j));
                break;
            case 3:
                oc7 oc7Var = (oc7) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                Runnable[] runnableArr = (Runnable[]) obj;
                dc7 dc7Var = (dc7) obj4;
                if (!((boolean[]) obj3)[0]) {
                    if (chat != null) {
                        oc7Var.getMessagesController().V3(chat, true);
                        runnableArr[0] = oc7Var.p0(j, i, dc7Var);
                        break;
                    } else if (dc7Var != null) {
                        dc7Var.a();
                        break;
                    }
                }
                break;
            default:
                oc7 oc7Var2 = (oc7) obj5;
                TLObject tLObject = (TLObject) obj2;
                vh6 vh6Var = (vh6) obj;
                ArrayList arrayList2 = (ArrayList) ((HashMap) obj4).remove((String) obj3);
                if (arrayList2 != null) {
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    if (tLObject instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                        oc7Var2.d4(webpagepreview.users, false);
                        oc7Var2.X3(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        }
                    }
                    if (tL_messageMediaWebPage == null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((k47) arrayList2.get(i2)).k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((k47) arrayList2.get(i2)).k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if ((webPage instanceof TLRPC.TL_webPage) || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                ((k47) arrayList2.get(i3)).k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i3 == 0) {
                                    fn5.R(((k47) arrayList2.get(i3)).k);
                                }
                                tL_messages_messages.messages.add(((k47) arrayList2.get(i3)).k);
                            }
                        } else {
                            vh6Var.k(arrayList2, webPage.id);
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        cf7 messagesStorage = oc7Var2.getMessagesStorage();
                        int i4 = this.c;
                        long j4 = this.b;
                        messagesStorage.e1(-2, 0, i4, j4, 0L, tL_messages_messages, false);
                        oc7Var2.getNotificationCenter().k(50, Long.valueOf(j4), arrayList2);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ pf(int i, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j) {
        this.a = (byte) 2;
        this.c = i;
        this.d = str;
        this.e = inputFile;
        this.f = inputEncryptedFile;
        this.h = bArr;
        this.n = bArr2;
        this.b = j;
    }

    public /* synthetic */ pf(oc7 oc7Var, HashMap hashMap, String str, TLObject tLObject, vh6 vh6Var, long j, int i) {
        this.a = (byte) 4;
        this.d = oc7Var;
        this.n = hashMap;
        this.e = str;
        this.f = tLObject;
        this.h = vh6Var;
        this.b = j;
        this.c = i;
    }

    public /* synthetic */ pf(Object obj, Object obj2, Object obj3, Serializable serializable, long j, int i, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.h = serializable;
        this.b = j;
        this.c = i;
        this.n = obj4;
    }
}
