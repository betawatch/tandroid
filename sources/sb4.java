// default package

import android.os.AsyncTask;
import android.util.Pair;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class sb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sb4(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int O;
        wm5 wm5Var;
        jn5 jn5Var;
        TLRPC.Document document;
        oy9 oy9Var;
        jxc jxcVar;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        String str;
        String str2;
        TLRPC.PhotoSize photoSize;
        byte b = this.a;
        byte b2 = 5;
        byte b3 = 1;
        byte b4 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                xb4 xb4Var = (xb4) obj2;
                String str3 = (String) obj;
                hb4 hb4Var = (hb4) xb4Var.w.get(str3);
                if (hb4Var != null && hb4Var.W0 != (O = xb4Var.O(b4))) {
                    hb4Var.W0 = O;
                    zb4 zb4Var = hb4Var.e1;
                    ((ArrayList) zb4Var.d).remove(hb4Var);
                    zb4Var.a(hb4Var);
                    zb4Var.b(false);
                    StringBuilder p = ik8.p("update priority ", str3, " position in queue ");
                    p.append(((ArrayList) hb4Var.e1.d).indexOf(hb4Var));
                    p.append(" account=");
                    c00.q(xb4Var.currentAccount, p);
                    break;
                }
                break;
            case 1:
                ((mu8) ((ye3) obj2).c).f(b4, (Serializable) obj);
                break;
            case 2:
                mr3 mr3Var = (mr3) obj2;
                ((nr3) obj).n(mr3Var.a, mr3Var.b, b4);
                break;
            case 3:
                in5 in5Var = (in5) obj2;
                ImageReceiver imageReceiver = (ImageReceiver) obj;
                int i = 0;
                while (i < 3) {
                    int A = imageReceiver.A(i == 0 ? 1 : i == 1 ? 0 : 3);
                    if (A != 0 && (wm5Var = (wm5) in5Var.k.get(A)) != null && (jn5Var = wm5Var.i) != null) {
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = jn5Var.f;
                        if (tL_fileLocationToBeDeprecated2 != null) {
                            str = wm5Var.g;
                            document = null;
                            oy9Var = null;
                            jxcVar = null;
                            tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated2;
                        } else {
                            TLRPC.Document document2 = jn5Var.i;
                            if (document2 != null) {
                                oy9Var = null;
                                jxcVar = null;
                                tL_fileLocationToBeDeprecated = null;
                                str = 0;
                                document = document2;
                            } else {
                                oy9 oy9Var2 = jn5Var.h;
                                if (oy9Var2 != null) {
                                    document = null;
                                    jxcVar = null;
                                    tL_fileLocationToBeDeprecated = null;
                                    str = 0;
                                    oy9Var = oy9Var2;
                                } else {
                                    jxc jxcVar2 = jn5Var.v;
                                    if (jxcVar2 != null) {
                                        jxcVar = jxcVar2;
                                        document = null;
                                        oy9Var = null;
                                        tL_fileLocationToBeDeprecated = null;
                                    } else {
                                        document = null;
                                        oy9Var = null;
                                        jxcVar = null;
                                        tL_fileLocationToBeDeprecated = null;
                                    }
                                    str = tL_fileLocationToBeDeprecated;
                                }
                            }
                        }
                        xb4.G(wm5Var.o).h(this.b, document, oy9Var, jxcVar, tL_fileLocationToBeDeprecated, str);
                    }
                    i++;
                }
                break;
            case 4:
                in5 in5Var2 = (in5) obj2;
                zm5 zm5Var = (zm5) obj;
                LinkedList linkedList = in5Var2.B;
                HashMap hashMap = in5Var2.C;
                if (zm5Var != null) {
                    File file = zm5Var.b;
                    in5Var2.E--;
                    int i2 = zm5Var.h;
                    String str4 = zm5Var.a;
                    if (b4 == 1) {
                        if (zm5Var.f) {
                            zm5 zm5Var2 = new zm5(in5Var2, zm5Var.a, file, zm5Var.c, zm5Var.h);
                            in5Var2 = in5Var2;
                            tg5 tg5Var = new tg5(in5Var2, zm5Var2, b2);
                            in5Var2.D.put(str4, tg5Var);
                            hl.d3(tg5Var, 1000L);
                        } else {
                            hashMap.remove(str4);
                            jn7.f(i2).k(jn7.S1, str4, 0);
                        }
                    } else if (b4 == 2) {
                        hashMap.remove(str4);
                        File file2 = new File(xb4.z(4), Utilities.a(str4) + "." + zm5Var.c);
                        jn7.f(i2).k(jn7.R1, str4, file.renameTo(file2) ? file2.toString() : file.toString());
                    }
                }
                while (in5Var2.E < 2 && !linkedList.isEmpty()) {
                    ((zm5) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    in5Var2.E++;
                }
            case 5:
                id6 id6Var = (id6) obj2;
                hd6 hd6Var = (hd6) obj;
                try {
                    if (b4 == 2) {
                        id6Var.getMessagesStorage().b.executeFast("DELETE FROM sharing_locations WHERE 1").stepThis().dispose();
                    } else if (b4 == 1) {
                        if (hd6Var != null) {
                            id6Var.getMessagesStorage().b.executeFast("DELETE FROM sharing_locations WHERE uid = " + hd6Var.a).stepThis().dispose();
                        }
                    } else if (hd6Var != null) {
                        SQLitePreparedStatement executeFast = id6Var.getMessagesStorage().b.executeFast("REPLACE INTO sharing_locations VALUES(?, ?, ?, ?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(hd6Var.h.k.getObjectSize());
                        hd6Var.h.k.serializeToStream(nativeByteBuffer);
                        executeFast.bindLong(1, hd6Var.a);
                        executeFast.bindInteger(2, hd6Var.b);
                        executeFast.bindInteger(3, hd6Var.c);
                        executeFast.bindInteger(4, hd6Var.d);
                        executeFast.bindByteBuffer(5, nativeByteBuffer);
                        executeFast.bindInteger(6, hd6Var.f);
                        executeFast.step();
                        executeFast.dispose();
                        nativeByteBuffer.reuse();
                    }
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 6:
                ls6 ls6Var = (ls6) obj2;
                TLRPC.Document document3 = (TLRPC.Document) obj;
                if (b4 == 0) {
                    b2 = 3;
                } else if (b4 == 1) {
                    b2 = 4;
                } else if (b4 == 5) {
                    b2 = 7;
                }
                try {
                    ls6Var.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document3.id + "' AND type = " + ((int) b2)).stepThis().dispose();
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 7:
                ls6 ls6Var2 = (ls6) obj2;
                TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) obj;
                try {
                    ls6Var2.getMessagesStorage().b.executeFast("DELETE FROM emoji_statuses WHERE type = " + ((int) b4)).stepThis().dispose();
                    SQLitePreparedStatement executeFast2 = ls6Var2.getMessagesStorage().b.executeFast("INSERT INTO emoji_statuses VALUES(?, ?)");
                    executeFast2.requery();
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_emojiStatuses.getObjectSize());
                    tL_emojiStatuses.serializeToStream(nativeByteBuffer2);
                    executeFast2.bindByteBuffer(1, nativeByteBuffer2);
                    executeFast2.bindInteger(2, b4);
                    executeFast2.step();
                    nativeByteBuffer2.reuse();
                    executeFast2.dispose();
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
                ls6Var2.I0[b4] = false;
                break;
            case 8:
                ls6 ls6Var3 = (ls6) obj2;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) obj;
                ls6Var3.U.l(stickerSet.id);
                ls6Var3.c1(this.b, false, true, false, new jr6(ls6Var3, stickerSet, b3));
                break;
            case 9:
                Pair pair = (Pair) obj;
                ((f07) obj2).b.i.n(((Integer) pair.first).intValue(), (vz6) pair.second, b4);
                break;
            case 10:
                uc7 uc7Var = (uc7) obj2;
                oo2 oo2Var = (oo2) obj;
                if (oo2Var != null) {
                    oo2Var.a(Integer.valueOf(b4), null);
                }
                uc7Var.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 11:
                kf7 kf7Var = (kf7) obj2;
                kf7Var.f1((TLRPC.messages_Dialogs) obj, b4);
                try {
                    kf7Var.a.c(new hd7(kf7Var, (byte) 24));
                    break;
                } catch (Exception e4) {
                    kf7Var.p(e4, true);
                    return;
                }
            case 12:
                ArrayList arrayList = (ArrayList) obj;
                lq3 downloadController = ((kf7) obj2).getDownloadController();
                HashMap hashMap2 = downloadController.f;
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = b4 == 1 ? downloadController.b : b4 == 2 ? downloadController.c : b4 == 4 ? downloadController.e : downloadController.d;
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        mq3 mq3Var = (mq3) arrayList.get(i3);
                        TLObject tLObject = mq3Var.a;
                        if (tLObject instanceof TLRPC.Document) {
                            str2 = xb4.r(null, (TLRPC.Document) tLObject);
                            photoSize = null;
                        } else if (tLObject instanceof TLRPC.Photo) {
                            TLRPC.PhotoSize w = xb4.w(((TLRPC.Photo) tLObject).sizes, hl.Y0(false), false, null, false);
                            photoSize = w;
                            str2 = xb4.r(null, w);
                        } else {
                            str2 = null;
                            photoSize = null;
                        }
                        if (str2 != null && !hashMap2.containsKey(str2)) {
                            TLObject tLObject2 = mq3Var.a;
                            if (photoSize != null) {
                                downloadController.getFileLoader().V(jn5.i(photoSize, (TLRPC.Photo) tLObject2), mq3Var.f, null, 0, mq3Var.d ? 2 : mq3Var.e ? 1 : 0);
                            } else if (tLObject2 instanceof TLRPC.Document) {
                                downloadController.getFileLoader().X((TLRPC.Document) tLObject2, mq3Var.f, 0, mq3Var.d ? 2 : 0);
                            }
                            arrayList2.add(mq3Var);
                            hashMap2.put(str2, mq3Var);
                            downloadController.h.put(new Pair(Long.valueOf(mq3Var.c), Integer.valueOf(mq3Var.b)), mq3Var);
                        }
                    }
                    break;
                }
                break;
            case 13:
                ((b18) obj2).x1((oy9) obj, b4);
                break;
            default:
                mk0 mk0Var = (mk0) obj;
                km9 km9Var = ((fm9) obj2).a;
                if (km9Var.E != null) {
                    km9.c(mk0Var.b, "");
                    ((zh9) km9Var.E).c(mk0Var, b4);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sb4(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
