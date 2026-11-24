// default package

import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.View;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pv3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pv3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        long j;
        boolean z;
        int i2 = -1;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r9 = true;
        boolean z2 = true;
        final byte b = 0;
        switch (this.a) {
            case 0:
                ((EglRenderer) this.b).lambda$release$1((CountDownLatch) this.c);
                return;
            case 1:
                ((EglRenderer) this.b).lambda$release$2((Looper) this.c);
                return;
            case 2:
                kw3 kw3Var = (kw3) this.b;
                k47 k47Var = (k47) this.c;
                yv1 yv1Var = kw3Var.a;
                x2b x2bVar = new x2b(yv1Var.getParentActivity(), kw3Var.a, k47.j1(k47Var.k), null, yv1Var.a0, yv1Var.getResourceProvider());
                boolean Y7 = yv1Var.Y7();
                x2bVar.i0 = Y7;
                x2bVar.n = Y7;
                yv1Var.showDialog(x2bVar);
                return;
            case 3:
                ww3 ww3Var = (ww3) this.b;
                TLObject tLObject = (TLObject) this.c;
                yw3 yw3Var = ww3Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    px3 px3Var = yw3Var.r;
                    int i3 = px3.C1;
                    oc7.r1(px3Var.a).d4(tL_contacts_resolvedPeer.users, false);
                    oc7.r1(px3Var.a).X3(tL_contacts_resolvedPeer.chats, false);
                    cf7.Y(px3Var.a).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                ww3Var.n = true;
                ww3Var.F();
                return;
            case 4:
                oc7.r1(((ly3) this.b).a.a).p5((TLRPC.EmojiStatus) this.c, null);
                return;
            case 5:
                oc7.r1(((z04) this.b).a.d1).p5((TLRPC.EmojiStatus) this.c, null);
                return;
            case 6:
                z04 z04Var = (z04) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i4 = z04Var.a.d1;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    hs6.d0(i4).L1(tL_messages_stickerSet, true);
                    hs6.d0(i4).S1(tL_messages_stickerSet);
                    return;
                }
                return;
            case 7:
                w14 w14Var = (w14) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.c;
                w14Var.x.f = true;
                ArrayList arrayList = w14Var.H.q1;
                if (!arrayList.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    arrayList.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                w14Var.a(true);
                return;
            case 8:
                final d24 d24Var = (d24) this.b;
                final String str = (String) this.c;
                String[] F0 = gm.F0();
                e34 e34Var = d24Var.a.G;
                if (!Arrays.equals(e34Var.X0, F0)) {
                    hs6.d0(e34Var.d1).O(F0, false);
                }
                e34Var.X0 = F0;
                ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                qac qacVar = new qac() { // from class: c24
                    @Override // qac
                    public final void a(Object obj) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList5;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList6;
                        byte b2 = b;
                        ArrayList arrayList7 = arrayList4;
                        String str2 = str;
                        d24 d24Var2 = d24Var;
                        Runnable runnable = (Runnable) obj;
                        switch (b2) {
                            case 0:
                                hs6.d0(d24Var2.a.G.d1).a2(true, str2, new iu(d24Var2, arrayList7, runnable, (byte) 15));
                                break;
                            default:
                                e34 e34Var2 = d24Var2.a.G;
                                if (gda.E || z8c.h(e34Var2.d1).p()) {
                                    String I3 = gm.I3((str2 + "").toLowerCase());
                                    int i5 = e34Var2.d1;
                                    ArrayList t0 = hs6.d0(e34Var2.d1).t0(5);
                                    HashSet hashSet = new HashSet();
                                    if (t0 != null) {
                                        for (int i6 = 0; i6 < t0.size(); i6++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) t0.get(i6);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList6 = tL_messages_stickerSet3.documents) != null && !arrayList6.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String I32 = gm.I3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                                                    arrayList7.add(new x14(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList8 = hs6.d0(i5).t0[1];
                                    if (arrayList8 != null) {
                                        for (int i7 = 0; i7 < arrayList8.size(); i7++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList8.get(i7);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String I33 = gm.I3(stickerSetCovered.set.title.toLowerCase());
                                                if (I33.startsWith(I3) || I33.contains(" ".concat(I3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList5 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet m0 = hs6.d0(i5).m0(hs6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList5 = m0 != null ? m0.documents : null;
                                                    } else {
                                                        arrayList5 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList5 != null && !arrayList5.isEmpty()) {
                                                        arrayList7.add(new x14(stickerSetCovered, arrayList5));
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
                };
                qy1 qy1Var = new qy1((Object) d24Var, (Object) str, (byte) 18);
                final byte b2 = r9 ? (byte) 1 : (byte) 0;
                Utilities.u(0, qacVar, qy1Var, new qac() { // from class: c24
                    @Override // qac
                    public final void a(Object obj) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList5;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList6;
                        byte b22 = b2;
                        ArrayList arrayList7 = arrayList3;
                        String str2 = str;
                        d24 d24Var2 = d24Var;
                        Runnable runnable = (Runnable) obj;
                        switch (b22) {
                            case 0:
                                hs6.d0(d24Var2.a.G.d1).a2(true, str2, new iu(d24Var2, arrayList7, runnable, (byte) 15));
                                break;
                            default:
                                e34 e34Var2 = d24Var2.a.G;
                                if (gda.E || z8c.h(e34Var2.d1).p()) {
                                    String I3 = gm.I3((str2 + "").toLowerCase());
                                    int i5 = e34Var2.d1;
                                    ArrayList t0 = hs6.d0(e34Var2.d1).t0(5);
                                    HashSet hashSet = new HashSet();
                                    if (t0 != null) {
                                        for (int i6 = 0; i6 < t0.size(); i6++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) t0.get(i6);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList6 = tL_messages_stickerSet3.documents) != null && !arrayList6.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String I32 = gm.I3(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                                                    arrayList7.add(new x14(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList arrayList8 = hs6.d0(i5).t0[1];
                                    if (arrayList8 != null) {
                                        for (int i7 = 0; i7 < arrayList8.size(); i7++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList8.get(i7);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String I33 = gm.I3(stickerSetCovered.set.title.toLowerCase());
                                                if (I33.startsWith(I3) || I33.contains(" ".concat(I3))) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList5 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet m0 = hs6.d0(i5).m0(hs6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                                        arrayList5 = m0 != null ? m0.documents : null;
                                                    } else {
                                                        arrayList5 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList5 != null && !arrayList5.isEmpty()) {
                                                        arrayList7.add(new x14(stickerSetCovered, arrayList5));
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
                }, new qy1((Object) d24Var, (Object) arrayList2, (byte) 19), new hv0(d24Var, str, arrayList2, arrayList3, arrayList4));
                return;
            case 9:
                d24 d24Var2 = (d24) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                e24 e24Var = d24Var2.a;
                e24Var.G.W.d(false);
                ArrayList arrayList6 = e24Var.r;
                e24Var.F = arrayList6.size() >= arrayList5.size();
                arrayList6.clear();
                arrayList6.addAll(arrayList5);
                e24Var.f();
                return;
            case 10:
                ((j24) this.b).F((String) this.c, "", true, false, false);
                return;
            case 11:
                j24 j24Var = (j24) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                int i5 = j24Var.M.d1;
                oc7.r1(i5).d4(tL_contacts_resolvedPeer2.users, false);
                oc7.r1(i5).X3(tL_contacts_resolvedPeer2.chats, false);
                cf7.Y(i5).j1(tL_contacts_resolvedPeer2.users, tL_contacts_resolvedPeer2.chats, true, true);
                String str2 = j24Var.x;
                j24Var.x = null;
                j24Var.F(str2, "", false, false, false);
                return;
            case 12:
                ((h44) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                return;
            case 13:
                h74 h74Var = (h74) this.b;
                o74 o74Var = (o74) this.c;
                int i6 = h74Var.J - o74Var.c;
                h74Var.J = i6;
                if (o74Var.d) {
                    h74Var.K = o74Var.e;
                    h74Var.L = true;
                }
                if (i6 == 0) {
                    bqb bqbVar = o74Var.b.a;
                    if (!h74Var.p0.a.p() && bqbVar.p()) {
                        h74Var.q0 = -1;
                        h74Var.r0 = 0L;
                    }
                    if (!bqbVar.p()) {
                        List asList = Arrays.asList(((ff8) bqbVar).k);
                        jte.p(asList.size() == h74Var.p.size());
                        for (int i7 = 0; i7 < asList.size(); i7++) {
                            ((e74) h74Var.p.get(i7)).c = (bqb) asList.get(i7);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (h74Var.L) {
                        boolean z3 = o74Var.b.a.p() && h74Var.p0.a.p();
                        boolean b3 = o74Var.b.b.b(h74Var.p0.b);
                        boolean z4 = o74Var.b.d == h74Var.p0.s;
                        if (z3 || (b3 && z4)) {
                            z2 = false;
                        }
                        if (z2) {
                            i2 = h74Var.l0();
                            if (bqbVar.p() || o74Var.b.b.c()) {
                                j2 = o74Var.b.d;
                            } else {
                                be8 be8Var = o74Var.b;
                                rz6 rz6Var = be8Var.b;
                                long j3 = be8Var.d;
                                Object obj = rz6Var.a;
                                ypb ypbVar = h74Var.o;
                                bqbVar.g(obj, ypbVar);
                                j2 = j3 + ypbVar.e;
                            }
                        }
                        i = i2;
                        j = j2;
                        z = z2;
                    } else {
                        i = -1;
                        j = -9223372036854775807L;
                        z = false;
                    }
                    h74Var.L = false;
                    h74Var.w1(o74Var.b, 1, z, h74Var.K, j, i, false);
                    return;
                }
                return;
            case 14:
                c74 c74Var = (c74) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList7 = c74Var.a.t0;
                int size = arrayList7.size();
                while (b < size) {
                    ((ndc) ((fdc) arrayList7.get(b))).K.onSurfaceTextureUpdated(surfaceTexture);
                    b++;
                }
                return;
            case 15:
                ((s2c) this.b).a((ArrayList) this.c);
                return;
            case 16:
                oc7.r1(((e94) this.b).a).T3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 17:
                cf7 cf7Var = (cf7) this.b;
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) this.c;
                try {
                    try {
                        sQLitePreparedStatement = cf7Var.b.executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindLong(1, tL_factCheck.hash);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_factCheck.getObjectSize());
                        tL_factCheck.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                        sQLitePreparedStatement.bindLong(3, System.currentTimeMillis() + 889032704);
                        sQLitePreparedStatement.step();
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 18:
                ((n94) this.b).a((Intent) this.c);
                return;
            case 19:
                lb4 lb4Var = (lb4) this.b;
                boolean z5 = lb4Var.y && ((boolean[]) this.c)[0];
                int i8 = lb4Var.J;
                boolean z6 = i8 > 0 && lb4Var.a0 >= ((long) i8) && lb4Var.j && lb4Var.W0 < 3;
                long j4 = lb4Var.b0;
                if (j4 == 0 || !(z5 || lb4Var.a0 == j4 || z6)) {
                    lb4Var.q(-1);
                    return;
                }
                try {
                    lb4Var.i(1, false, true);
                    return;
                } catch (Exception unused) {
                    lb4Var.h(0, true);
                    return;
                }
            case 20:
                lb4 lb4Var2 = (lb4) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                System.currentTimeMillis();
                try {
                } catch (Exception e2) {
                    fc4.g(e2, false);
                    if (gm.D1(e2)) {
                        LaunchActivity.F(1);
                    } else if (gm.E1(e2)) {
                        gda.h(lb4Var2.L0);
                    }
                }
                if (lb4Var2.S0 != null) {
                    int size2 = arrayList8.size();
                    int i9 = (size2 << 4) + 4;
                    do5 do5Var = lb4.l1;
                    if (do5Var == null) {
                        lb4.l1 = new do5(i9);
                    } else {
                        do5Var.b();
                    }
                    lb4.l1.c(size2);
                    for (int i10 = 0; i10 < size2; i10++) {
                        jb4 jb4Var = (jb4) arrayList8.get(i10);
                        lb4.l1.d(jb4Var.a);
                        lb4.l1.d(jb4Var.b);
                    }
                    synchronized (lb4Var2) {
                        RandomAccessFile randomAccessFile = lb4Var2.S0;
                        if (randomAccessFile == null) {
                            return;
                        }
                        randomAccessFile.seek(0L);
                        lb4Var2.S0.write(lb4.l1.a, 0, i9);
                        lb4Var2.Y0 = false;
                        if (lb4Var2.Z0) {
                            try {
                                lb4Var2.S0.getChannel().close();
                            } catch (Exception e3) {
                                fc4.g(e3, true);
                            }
                            lb4Var2.S0.close();
                            lb4Var2.S0 = null;
                        }
                        System.currentTimeMillis();
                        return;
                    }
                }
                return;
            case 21:
                bc4 bc4Var = (bc4) this.b;
                jm7[] jm7VarArr = (jm7[]) this.c;
                bc4Var.getNotificationCenter().n(jm7VarArr[0], nm7.U1);
                bc4Var.getNotificationCenter().n(jm7VarArr[0], nm7.V1);
                return;
            case 22:
                bc4 bc4Var2 = (bc4) this.b;
                bc4Var2.getDownloadController().I.removeAll((ArrayList) this.c);
                bc4Var2.getNotificationCenter().k(nm7.f5, new Object[0]);
                return;
            case 23:
                lb4 lb4Var3 = (lb4) ((bc4) this.b).w.get(bc4.r("mp4", (TLRPC.TL_fileLocationToBeDeprecated) this.c));
                if (lb4Var3 != null) {
                    if (lb4Var3.y) {
                        lb4Var3.o(false);
                    }
                    lb4Var3.V0 = true;
                    lb4Var3.W0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    ((ArrayList) lb4Var3.e1.d).remove(lb4Var3);
                    lb4Var3.e1.a(lb4Var3);
                    lb4Var3.e1.b(false);
                    return;
                }
                return;
            case 24:
                lb4 lb4Var4 = (lb4) this.b;
                u30 u30Var = (u30) this.c;
                lb4Var4.a = true;
                u30Var.b(false);
                return;
            case 25:
                String str3 = (String) this.b;
                Throwable th2 = (Throwable) this.c;
                try {
                    fc4.j().a.write(fc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + str3 + "\n");
                    fc4.j().a.write(th2.toString());
                    for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                        fc4.j().a.write(fc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTraceElement + "\n");
                    }
                    fc4.j().a.flush();
                    return;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
            case 26:
                lc4 lc4Var = (lc4) this.b;
                List list = (List) this.c;
                lc4Var.getClass();
                try {
                    lc4Var.c();
                    lc4Var.c.beginTransaction();
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        lc4Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + ((b81) list.get(i11)).a.getPath().replace("'", "").replace("\"", "") + "'").stepThis().dispose();
                    }
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            case 27:
                ((ad4) this.b).getMessagesController().c4((TLRPC.User) this.c, false, false);
                return;
            case 28:
                ((ad4) this.b).getMediaDataController().S1((TLRPC.TL_messages_stickerSet) this.c);
                return;
            default:
                ke4 ke4Var = (ke4) this.b;
                ((he) this.c).dismiss();
                me4 me4Var = ke4Var.F.c;
                qac qacVar2 = me4Var.x;
                if (qacVar2 != null) {
                    qacVar2.a(me4Var.d);
                }
                me4Var.finishFragment();
                return;
        }
    }
}
