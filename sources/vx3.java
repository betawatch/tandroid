// default package

import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.view.View;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vx3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vx3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x013b, code lost:
    
        if (r8 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014c, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r11v2, types: [s64] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v100, types: [nf4, org.telegram.ui.ActionBar.e] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        long j;
        ?? r14;
        int i2 = -1;
        byte b = 2;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        int i3 = 0;
        final byte b2 = 1;
        switch (this.a) {
            case 0:
                uc7.s1(((wx3) this.c).a.a).v5((TLRPC.EmojiStatus) this.b, null);
                return;
            case 1:
                uc7.s1(((k04) this.c).a.d1).v5((TLRPC.EmojiStatus) this.b, null);
                return;
            case 2:
                k04 k04Var = (k04) this.c;
                TLObject tLObject = (TLObject) this.b;
                int i4 = k04Var.a.d1;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    ls6.d0(i4).L1(tL_messages_stickerSet, true);
                    ls6.d0(i4).S1(tL_messages_stickerSet);
                    return;
                }
                return;
            case 3:
                g14 g14Var = (g14) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.b;
                g14Var.x.f = true;
                ArrayList arrayList = g14Var.H.q1;
                if (!arrayList.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    arrayList.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                g14Var.a(true);
                return;
            case 4:
                n14 n14Var = (n14) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                o14 o14Var = n14Var.a;
                o14Var.G.W.d(false);
                ArrayList arrayList3 = o14Var.r;
                o14Var.F = arrayList3.size() >= arrayList2.size();
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                o14Var.f();
                return;
            case 5:
                final n14 n14Var2 = (n14) this.c;
                final String str = (String) this.b;
                String[] F0 = hl.F0();
                o24 o24Var = n14Var2.a.G;
                if (!Arrays.equals(o24Var.X0, F0)) {
                    ls6.d0(o24Var.d1).O(F0, false);
                }
                o24Var.X0 = F0;
                ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                final ArrayList arrayList6 = new ArrayList();
                final byte b3 = r9 ? (byte) 1 : (byte) 0;
                Utilities.u(0, new pcc() { // from class: m14
                    @Override // pcc
                    public final void a(Object obj) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList7;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList8;
                        byte b4 = b3;
                        ArrayList arrayList9 = arrayList6;
                        String str2 = str;
                        n14 n14Var3 = n14Var2;
                        Runnable runnable = (Runnable) obj;
                        switch (b4) {
                            case 0:
                                ls6.d0(n14Var3.a.G.d1).a2(true, str2, new gt(n14Var3, arrayList9, runnable, (byte) 15));
                                break;
                            default:
                                o24 o24Var2 = n14Var3.a.G;
                                if (xea.E || yac.h(o24Var2.d1).p()) {
                                    String I3 = hl.I3((str2 + "").toLowerCase());
                                    int i5 = o24Var2.d1;
                                    ArrayList t0 = ls6.d0(o24Var2.d1).t0(5);
                                    HashSet hashSet = new HashSet();
                                    if (t0 != null) {
                                        for (int i6 = 0; i6 < t0.size(); i6++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) t0.get(i6);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList8 = tL_messages_stickerSet3.documents) != null && !arrayList8.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String I32 = hl.I3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                                                    arrayList9.add(new h14(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList10 = ls6.d0(i5).t0[1];
                                    if (arrayList10 != null) {
                                        for (int i7 = 0; i7 < arrayList10.size(); i7++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList10.get(i7);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String I33 = hl.I3(stickerSetCovered.set.title.toLowerCase());
                                                if (I33.startsWith(I3) || I33.contains(" ".concat(I3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList7 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet m0 = ls6.d0(i5).m0(ls6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList7 = m0 != null ? m0.documents : null;
                                                    } else {
                                                        arrayList7 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                                                        arrayList9.add(new h14(stickerSetCovered, arrayList7));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                break;
                        }
                    }
                }, new rx1((Object) n14Var2, (Object) str, (byte) 18), new pcc() { // from class: m14
                    @Override // pcc
                    public final void a(Object obj) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList7;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList8;
                        byte b4 = b2;
                        ArrayList arrayList9 = arrayList5;
                        String str2 = str;
                        n14 n14Var3 = n14Var2;
                        Runnable runnable = (Runnable) obj;
                        switch (b4) {
                            case 0:
                                ls6.d0(n14Var3.a.G.d1).a2(true, str2, new gt(n14Var3, arrayList9, runnable, (byte) 15));
                                break;
                            default:
                                o24 o24Var2 = n14Var3.a.G;
                                if (xea.E || yac.h(o24Var2.d1).p()) {
                                    String I3 = hl.I3((str2 + "").toLowerCase());
                                    int i5 = o24Var2.d1;
                                    ArrayList t0 = ls6.d0(o24Var2.d1).t0(5);
                                    HashSet hashSet = new HashSet();
                                    if (t0 != null) {
                                        for (int i6 = 0; i6 < t0.size(); i6++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) t0.get(i6);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList8 = tL_messages_stickerSet3.documents) != null && !arrayList8.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String I32 = hl.I3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                                                    arrayList9.add(new h14(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList10 = ls6.d0(i5).t0[1];
                                    if (arrayList10 != null) {
                                        for (int i7 = 0; i7 < arrayList10.size(); i7++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList10.get(i7);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String I33 = hl.I3(stickerSetCovered.set.title.toLowerCase());
                                                if (I33.startsWith(I3) || I33.contains(" ".concat(I3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList7 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet m0 = ls6.d0(i5).m0(ls6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList7 = m0 != null ? m0.documents : null;
                                                    } else {
                                                        arrayList7 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                                                        arrayList9.add(new h14(stickerSetCovered, arrayList7));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                break;
                        }
                    }
                }, new rx1((Object) n14Var2, (Object) arrayList4, (byte) 19), new hu0(n14Var2, str, arrayList4, arrayList5, arrayList6));
                return;
            case 6:
                t14 t14Var = (t14) this.c;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.b);
                int i5 = t14Var.M.d1;
                uc7.s1(i5).j4(tL_contacts_resolvedPeer.users, false);
                uc7.s1(i5).c4(tL_contacts_resolvedPeer.chats, false);
                kf7.a0(i5).n1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = t14Var.x;
                t14Var.x = null;
                t14Var.F(str2, "", false, false, false);
                return;
            case 7:
                ((t14) this.c).F((String) this.b, "", true, false, false);
                return;
            case 8:
                ((r34) this.c).a.setOnClickListener((View.OnClickListener) this.b);
                return;
            case 9:
                ?? r11 = (s64) this.c;
                z64 z64Var = (z64) this.b;
                int i6 = r11.J - z64Var.c;
                r11.J = i6;
                if (z64Var.d) {
                    r11.K = z64Var.e;
                    r11.L = true;
                }
                if (i6 == 0) {
                    asb asbVar = z64Var.b.a;
                    if (!r11.p0.a.p() && asbVar.p()) {
                        r11.q0 = -1;
                        r11.r0 = 0L;
                    }
                    if (!asbVar.p()) {
                        List asList = Arrays.asList(((rg8) asbVar).k);
                        yve.p(asList.size() == r11.p.size());
                        for (int i7 = 0; i7 < asList.size(); i7++) {
                            ((p64) r11.p.get(i7)).c = (asb) asList.get(i7);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (r11.L) {
                        ?? r2 = z64Var.b.a.p() && r11.p0.a.p();
                        boolean b4 = z64Var.b.b.b(r11.p0.b);
                        ?? r7 = z64Var.b.d == r11.p0.s;
                        if (r2 != false || (b4 && r7 != false)) {
                            b2 = 0;
                        }
                        if (b2 != 0) {
                            i2 = r11.l0();
                            if (asbVar.p() || z64Var.b.b.c()) {
                                j2 = z64Var.b.d;
                            } else {
                                nf8 nf8Var = z64Var.b;
                                vz6 vz6Var = nf8Var.b;
                                long j3 = nf8Var.d;
                                Object obj = vz6Var.a;
                                xrb xrbVar = r11.o;
                                asbVar.g(obj, xrbVar);
                                j2 = j3 + xrbVar.e;
                            }
                        }
                        i = i2;
                        j = j2;
                        r14 = b2;
                    } else {
                        i = -1;
                        j = -9223372036854775807L;
                        r14 = 0;
                    }
                    r11.L = false;
                    r11.w1(z64Var.b, 1, r14, r11.K, j, i, false);
                    return;
                }
                return;
            case 10:
                n64 n64Var = (n64) this.c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.b;
                ArrayList arrayList7 = n64Var.a.t0;
                int size = arrayList7.size();
                while (i3 < size) {
                    Object obj2 = arrayList7.get(i3);
                    i3++;
                    ((kfc) ((cfc) obj2)).K.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 11:
                ((r4c) this.c).a((ArrayList) this.b);
                return;
            case 12:
                uc7.s1(((q84) this.c).a).Y3((TLRPC.Updates) ((TLObject) this.b), false);
                return;
            case 13:
                kf7 kf7Var = (kf7) this.c;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) this.b;
                try {
                    try {
                        sQLitePreparedStatement = kf7Var.b.executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindLong(1, tL_factCheck.hash);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_factCheck.getObjectSize());
                        tL_factCheck.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                        sQLitePreparedStatement.bindLong(3, System.currentTimeMillis() + 889032704);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                    } catch (Exception e) {
                        cc4.g(e, true);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 14:
                ((z84) this.c).a((Intent) this.b);
                return;
            case 15:
                hb4 hb4Var = (hb4) this.c;
                ArrayList arrayList8 = (ArrayList) this.b;
                System.currentTimeMillis();
                try {
                } catch (Exception e2) {
                    cc4.g(e2, false);
                    if (hl.D1(e2)) {
                        LaunchActivity.F(1);
                    } else if (hl.E1(e2)) {
                        xea.h(hb4Var.L0);
                    }
                }
                if (hb4Var.S0 != null) {
                    int size2 = arrayList8.size();
                    int i8 = (size2 << 4) + 4;
                    go5 go5Var = hb4.l1;
                    if (go5Var == null) {
                        hb4.l1 = new go5(i8);
                    } else {
                        go5Var.b();
                    }
                    hb4.l1.c(size2);
                    for (int i9 = 0; i9 < size2; i9++) {
                        fb4 fb4Var = (fb4) arrayList8.get(i9);
                        hb4.l1.d(fb4Var.a);
                        hb4.l1.d(fb4Var.b);
                    }
                    synchronized (hb4Var) {
                        RandomAccessFile randomAccessFile = hb4Var.S0;
                        if (randomAccessFile == null) {
                            return;
                        }
                        randomAccessFile.seek(0L);
                        hb4Var.S0.write(hb4.l1.a, 0, i8);
                        hb4Var.Y0 = false;
                        if (hb4Var.Z0) {
                            try {
                                hb4Var.S0.getChannel().close();
                            } catch (Exception e3) {
                                cc4.g(e3, true);
                            }
                            hb4Var.S0.close();
                            hb4Var.S0 = null;
                        }
                        System.currentTimeMillis();
                        return;
                    }
                }
                return;
            case 16:
                hb4 hb4Var2 = (hb4) this.c;
                ?? r0 = hb4Var2.y && ((boolean[]) this.b)[0];
                int i10 = hb4Var2.J;
                ?? r22 = i10 > 0 && hb4Var2.a0 >= ((long) i10) && hb4Var2.j && hb4Var2.W0 < 3;
                long j4 = hb4Var2.b0;
                if (j4 == 0 || !(r0 == true || hb4Var2.a0 == j4 || r22 == true)) {
                    hb4Var2.q(-1);
                    return;
                }
                try {
                    hb4Var2.i(1, false, true);
                    return;
                } catch (Exception unused) {
                    hb4Var2.h(0, true);
                    return;
                }
            case 17:
                xb4 xb4Var = (xb4) this.c;
                fn7[] fn7VarArr = (fn7[]) this.b;
                xb4Var.getNotificationCenter().n(fn7VarArr[0], jn7.U1);
                xb4Var.getNotificationCenter().n(fn7VarArr[0], jn7.V1);
                return;
            case 18:
                hb4 hb4Var3 = (hb4) ((xb4) this.c).w.get(xb4.r("mp4", (TLRPC.TL_fileLocationToBeDeprecated) this.b));
                if (hb4Var3 != null) {
                    if (hb4Var3.y) {
                        hb4Var3.o(false);
                    }
                    hb4Var3.V0 = true;
                    hb4Var3.W0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    ((ArrayList) hb4Var3.e1.d).remove(hb4Var3);
                    hb4Var3.e1.a(hb4Var3);
                    hb4Var3.e1.b(false);
                    return;
                }
                return;
            case 19:
                xb4 xb4Var2 = (xb4) this.c;
                xb4Var2.getDownloadController().I.removeAll((ArrayList) this.b);
                xb4Var2.getNotificationCenter().k(jn7.e5, new Object[0]);
                return;
            case 20:
                hb4 hb4Var4 = (hb4) this.c;
                zb4 zb4Var = (zb4) this.b;
                hb4Var4.a = true;
                zb4Var.b(false);
                return;
            case 21:
                String str3 = (String) this.c;
                Throwable th2 = (Throwable) this.b;
                try {
                    cc4.j().a.write(cc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + str3 + "\n");
                    cc4.j().a.write(th2.toString());
                    for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                        cc4.j().a.write(cc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTraceElement + "\n");
                    }
                    cc4.j().a.flush();
                    return;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
            case 22:
                ic4 ic4Var = (ic4) this.c;
                List list = (List) this.b;
                ic4Var.getClass();
                try {
                    ic4Var.c();
                    ic4Var.c.beginTransaction();
                    sQLitePreparedStatement = ic4Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE path = ?");
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindString(1, ((c71) list.get(i11)).a.getPath().replace("'", "").replace("\"", ""));
                        sQLitePreparedStatement.step();
                    }
                    break;
                } catch (Throwable th3) {
                    try {
                        cc4.g(th3, true);
                        break;
                    } finally {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        ic4Var.c.commitTransaction();
                    }
                }
            case 23:
                ((xc4) this.c).getMessagesController().i4((TLRPC.User) this.b, false, false);
                return;
            case 24:
                ((xc4) this.c).getMediaDataController().S1((TLRPC.TL_messages_stickerSet) this.b);
                return;
            case 25:
                he4 he4Var = (he4) this.c;
                ((id) this.b).dismiss();
                je4 je4Var = he4Var.F.c;
                pcc pccVar = je4Var.x;
                if (pccVar != null) {
                    pccVar.a(je4Var.d);
                }
                je4Var.finishFragment();
                return;
            case 26:
                ?? r1 = (nf4) this.c;
                je4 je4Var2 = new je4(r1.r, ((ef4) this.b).m);
                je4Var2.y = new ne4(r1, b2);
                je4Var2.x = new ne4(r1, b);
                r1.presentFragment(je4Var2);
                return;
            case 27:
                nf4 nf4Var = (nf4) this.c;
                Runnable runnable = (Runnable) this.b;
                nf4Var.h = false;
                nf4Var.s = false;
                nf4Var.r.g = nf4Var.E;
                nf4Var.k0(true);
                nf4Var.getNotificationCenter().k(jn7.O2, new Object[0]);
                runnable.run();
                return;
            case 28:
                nf4 nf4Var2 = (nf4) this.c;
                TLObject tLObject2 = (TLObject) this.b;
                ArrayList arrayList9 = nf4Var2.M;
                nf4Var2.O = false;
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject2;
                    nf4Var2.getMessagesController().c4(tL_chatlists_exportedInvites.chats, false);
                    nf4Var2.getMessagesController().j4(tL_chatlists_exportedInvites.users, false);
                    arrayList9.clear();
                    arrayList9.addAll(tL_chatlists_exportedInvites.invites);
                    nf4Var2.C0();
                }
                nf4Var2.N = 0;
                return;
            default:
                nf4 nf4Var3 = (nf4) this.c;
                id idVar = (id) this.b;
                ac7 ac7Var = nf4Var3.r;
                if (idVar != null) {
                    try {
                        idVar.dismiss();
                    } catch (Exception e5) {
                        cc4.g(e5, true);
                    }
                }
                nf4Var3.getMessagesController().s4(ac7Var);
                kf7 messagesStorage = nf4Var3.getMessagesStorage();
                messagesStorage.a.c(new t87(messagesStorage, ac7Var, (byte) 20));
                nf4Var3.finishFragment();
                return;
        }
    }
}
