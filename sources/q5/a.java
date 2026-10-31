package q5;

import ag.a3;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseIntArray;
import b2.p1;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import e2.j;
import e9.n0;
import e9.x1;
import j$.util.DesugarCollections;
import j2.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kg.d0;
import l5.h;
import l5.i;
import org.telegram.messenger.f8;
import org.telegram.messenger.fs;
import org.telegram.messenger.g4;
import org.telegram.messenger.gs;
import org.telegram.messenger.i0;
import org.telegram.messenger.i6;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.qi;
import org.telegram.messenger.ri;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.zj0;
import org.telegram.ui.ay;
import org.telegram.ui.pb1;
import org.telegram.ui.rm0;
import org.telegram.ui.un;
import org.telegram.ui.ux;
import org.telegram.ui.web.o;
import rh.e4;
import s5.e;
import s5.g;
import th.j7;
import th.u2;
import th.z2;
import u2.c0;
import u2.g0;
import u2.k0;
import vh.b1;
import vh.k1;
import vh.l1;
import vh.u6;
import vh.w3;
import vh.w6;
import w7.n6;
import x2.k;
import x2.l;
import xa.n;
import xh.h2;
import zf.x0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements t5.b, ux, e, fs, j7, j, ri, u1, l, SuccessContinuation, rm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean N(ay ayVar) {
        return false;
    }

    @Override // org.telegram.messenger.fs
    public void a(String str) {
        u2 u2Var = (u2) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
        p6 p6Var = (p6) this.d;
        z2 z2Var = u2Var.x;
        z2Var.getStoriesController().r(z2Var.k1, str, new d0(u2Var, storyItem, p6Var, 11));
    }

    @Override // e2.j
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.b;
        ((k0) obj).n(aVar.b, (g0) this.c, (c0) this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[SYNTHETIC] */
    @Override // s5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        o5.c cVar;
        int i10 = this.a;
        int i11 = 5;
        int i12 = 4;
        int i13 = 3;
        o5.c cVar2 = o5.c.d;
        int i14 = 2;
        int i15 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i16 = 0;
        g gVar = (g) this.b;
        switch (i10) {
            case 2:
                h hVar = (h) obj2;
                l5.l lVar = hVar.c;
                String str = hVar.a;
                i iVar = (i) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = gVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                s5.a aVar = gVar.d;
                if (simpleQueryForLong >= aVar.a) {
                    gVar.e(1L, cVar2, str);
                    return -1L;
                }
                Long b10 = g.b(sQLiteDatabase, iVar);
                if (b10 != null) {
                    insert = b10.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.a);
                    contentValues.put("priority", Integer.valueOf(v5.a.a(iVar.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i17 = aVar.e;
                byte[] bArr2 = lVar.b;
                boolean z10 = bArr2.length <= i17;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar.d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar.e));
                contentValues2.put("payload_encoding", lVar.a.a);
                contentValues2.put("code", hVar.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr2 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int ceil = (int) Math.ceil(bArr2.length / i17);
                    for (int i18 = 1; i18 <= ceil; i18++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i18 - 1) * i17, Math.min(i18 * i17, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i18));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(hVar.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 3:
                ArrayList arrayList = (ArrayList) obj2;
                i iVar2 = (i) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j10 = cursor2.getLong(0);
                    int i19 = cursor2.getInt(7) != 0 ? i15 : 0;
                    f fVar = new f();
                    fVar.f = new HashMap();
                    String string = cursor2.getString(i15);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    fVar.a = string;
                    fVar.d = Long.valueOf(cursor2.getLong(i14));
                    fVar.e = Long.valueOf(cursor2.getLong(3));
                    if (i19 != 0) {
                        String string2 = cursor2.getString(4);
                        fVar.c = new l5.l(string2 == null ? g.f : new i5.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        i5.c cVar3 = string3 == null ? g.f : new i5.c(string3);
                        Cursor query = gVar.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i20 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i20 += blob.length;
                            }
                            byte[] bArr3 = new byte[i20];
                            int i21 = 0;
                            int i22 = 0;
                            while (i21 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i21);
                                cursor = query;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, i22, bArr4.length);
                                    i22 += bArr4.length;
                                    i21++;
                                    query = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query.close();
                            fVar.c = new l5.l(cVar3, bArr3);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        fVar.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new s5.b(j10, iVar2, fVar.f()));
                    i14 = 2;
                    i15 = 1;
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                n nVar = (n) obj2;
                ArrayList arrayList4 = (ArrayList) nVar.c;
                Cursor cursor3 = (Cursor) obj;
                gVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i16);
                    int i23 = cursor3.getInt(1);
                    o5.c cVar4 = o5.c.b;
                    if (i23 != 0) {
                        if (i23 == 1) {
                            cVar4 = o5.c.c;
                        } else if (i23 == 2) {
                            cVar = cVar2;
                            long j11 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new o5.d(j11, cVar));
                            i16 = 0;
                            i11 = 5;
                            i12 = 4;
                            i13 = 3;
                        } else if (i23 == i13) {
                            cVar4 = o5.c.e;
                        } else if (i23 == i12) {
                            cVar4 = o5.c.f;
                        } else if (i23 == i11) {
                            cVar4 = o5.c.h;
                        } else if (i23 == 6) {
                            cVar4 = o5.c.n;
                        } else {
                            n6.a(Integer.valueOf(i23), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    cVar = cVar4;
                    long j112 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new o5.d(j112, cVar));
                    i16 = 0;
                    i11 = 5;
                    i12 = 4;
                    i13 = 3;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i24 = o5.e.c;
                    new ArrayList();
                    arrayList4.add(new o5.e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long g10 = gVar.b.g();
                SQLiteDatabase a2 = gVar.a();
                a2.beginTransaction();
                try {
                    Cursor rawQuery = a2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        o5.g gVar2 = new o5.g(rawQuery.getLong(0), g10);
                        rawQuery.close();
                        a2.setTransactionSuccessful();
                        a2.endTransaction();
                        nVar.b = gVar2;
                        nVar.d = new o5.b(new o5.f(gVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), s5.a.f.a));
                        nVar.a = (String) gVar.e.get();
                        return new o5.a((o5.g) nVar.b, DesugarCollections.unmodifiableList(arrayList4), (o5.b) nVar.d, (String) nVar.a);
                    } catch (Throwable th4) {
                        rawQuery.close();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    a2.endTransaction();
                    throw th5;
                }
        }
    }

    @Override // x2.l
    public x1 b(int i10, p1 p1Var, int[] iArr) {
        x2.j jVar = (x2.j) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        e9.k0 t10 = n0.t();
        for (int i11 = 0; i11 < p1Var.a; i11++) {
            t10.c(new k(i10, p1Var, i11, jVar, iArr[i11], str, str2));
        }
        return t10.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.ri
    public void c(String str, ArrayList arrayList) {
        int i10;
        int i11;
        ArrayList<TLRPC.Document> arrayList2;
        int i12;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        k1 k1Var = (k1) this.b;
        String str2 = (String) this.c;
        ui uiVar = (ui) this.d;
        ArrayList arrayList6 = k1Var.h;
        SparseIntArray sparseIntArray = k1Var.D;
        ArrayList arrayList7 = k1Var.n;
        l1 l1Var = k1Var.N;
        ArrayList arrayList8 = k1Var.w;
        HashSet hashSet = k1Var.L;
        ArrayList arrayList9 = k1Var.s;
        if (TextUtils.equals(str2, k1Var.H)) {
            ArrayList j10 = k6.j(k1Var.H, null);
            int i13 = 0;
            for (int i14 = 0; i14 < j10.size(); i14++) {
                try {
                    qi qiVar = new qi();
                    qiVar.a = ((i6) j10.get(i14)).c.toString();
                    arrayList5.add(qiVar);
                } catch (Exception unused) {
                }
            }
            k1Var.y = 0;
            arrayList9.clear();
            arrayList8.clear();
            sparseIntArray.clear();
            arrayList7.clear();
            int i15 = 1;
            k1Var.y++;
            arrayList9.add(null);
            arrayList8.add(0L);
            if (l1Var.a == 0) {
                hashSet.clear();
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    qi qiVar2 = (qi) arrayList5.get(i16);
                    String str3 = qiVar2.a;
                    if (str3 != null && !str3.startsWith("animated_") && (arrayList4 = (ArrayList) k1Var.d.get(qiVar2.a)) != null) {
                        hashSet.addAll(arrayList4);
                    }
                }
                arrayList8.addAll(hashSet);
                for (int i17 = 0; i17 < hashSet.size(); i17++) {
                    arrayList9.add(null);
                }
                k1Var.y = hashSet.size() + k1Var.y;
                i10 = 1;
                i11 = 0;
            } else {
                HashMap hashMap = uiVar.d0;
                int i18 = 0;
                while (i18 < arrayList5.size()) {
                    qi qiVar3 = (qi) arrayList5.get(i18);
                    int i19 = i13;
                    String str4 = qiVar3.a;
                    if (str4 == null || str4.startsWith("animated_") || (arrayList3 = (ArrayList) hashMap.get(qiVar3.a)) == null || arrayList3.isEmpty()) {
                        i12 = i15;
                    } else {
                        i12 = i15;
                        for (int i20 = i19; i20 < arrayList3.size(); i20++) {
                            TLRPC.Document document = (TLRPC.Document) arrayList3.get(i20);
                            if (document != null && !arrayList9.contains(document)) {
                                arrayList9.add(document);
                                k1Var.y++;
                            }
                        }
                    }
                    i18++;
                    i13 = i19;
                    i15 = i12;
                }
                i10 = i15;
                i11 = i13;
                ArrayList arrayList10 = uiVar.s0[i11];
                int i21 = i11;
                while (i21 < arrayList5.size()) {
                    qi qiVar4 = (qi) arrayList5.get(i21);
                    String str5 = qiVar4.a;
                    if (str5 != null && !str5.startsWith("animated_")) {
                        for (int i22 = i11; i22 < arrayList10.size(); i22++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList10.get(i22);
                            if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            } else if (!stickerSetCovered.covers.isEmpty()) {
                                arrayList2 = stickerSetCovered.covers;
                            } else if (stickerSetCovered.cover != null) {
                                ArrayList<TLRPC.Document> arrayList11 = new ArrayList<>();
                                arrayList11.add(stickerSetCovered.cover);
                                arrayList2 = arrayList11;
                            }
                            for (int i23 = i11; i23 < arrayList2.size(); i23++) {
                                String V = jj.V(arrayList2.get(i23), null, null);
                                if (V != null && V.contains(qiVar4.a)) {
                                    arrayList9.add(arrayList2.get(i23));
                                    k1Var.y++;
                                }
                            }
                        }
                    }
                    i21++;
                    arrayList5 = arrayList;
                }
            }
            String N3 = i0.N3((k1Var.H + "").toLowerCase());
            for (int i24 = i11; i24 < arrayList6.size(); i24++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i24);
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    String N32 = i0.N3((tL_messages_stickerSet.set.title + "").toLowerCase());
                    if (N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                        int size = arrayList7.size();
                        arrayList7.add(tL_messages_stickerSet);
                        sparseIntArray.put(k1Var.y, size);
                        arrayList9.add(null);
                        k1Var.y++;
                        arrayList9.addAll(tL_messages_stickerSet.documents);
                        k1Var.y = tL_messages_stickerSet.documents.size() + k1Var.y;
                    }
                }
            }
            int i25 = i10;
            boolean z10 = (arrayList8.size() > i25 || arrayList9.size() > i25) ? i11 : i25;
            k1Var.x = z10;
            if (z10 != 0) {
                k1Var.y += i25;
            }
            if (z10 == 0) {
                k1Var.K += i25;
            }
            k1Var.I = k1Var.H;
            k1Var.f();
            boolean z11 = i11;
            b1.z1(l1Var.b, z11 ? 1 : 0, z11 ? 1 : 0);
            l1Var.f.c(z11);
            l1Var.e.n(z11);
        }
    }

    @Override // org.telegram.ui.rm0
    public void e(int i10) {
        h2 h2Var = (h2) this.b;
        fc0 fc0Var = (fc0) this.c;
        String str = (String) this.d;
        if (i10 != 3) {
            fc0Var.dismiss();
        }
        h2Var.d.D.F(str, f1.A(i10).toLowerCase(Locale.ROOT), false);
    }

    @Override // t5.b
    public Object g() {
        b bVar = (b) this.b;
        i iVar = (i) this.c;
        h hVar = (h) this.d;
        g gVar = (g) bVar.d;
        gVar.getClass();
        i5.d dVar = iVar.c;
        String str = hVar.a;
        String str2 = iVar.a;
        String c10 = n6.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.c(new a(gVar, (Object) hVar, iVar, 2))).getClass();
        bVar.a.x(iVar, 1, false);
        return null;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 9:
                ((w6) this.b).N0((u6) this.c, (Runnable) this.d, true);
                break;
            case 12:
                Activity activity = (Activity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                o oVar = (o) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + w0.b.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    f8.g(e, true);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                oVar.a(bool, bool);
                break;
            default:
                x0 x0Var = (x0) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                x0Var.getClass();
                zArr2[0] = true;
                if (user != null) {
                    vp.r1(x0Var.f).e7.edit().putBoolean("inlinegeo_" + user.id, true).commit();
                    x0Var.G();
                    break;
                }
                break;
        }
    }

    @Override // th.j7
    public void n(Canvas canvas, RectF rectF, float f7) {
        s7 s7Var = (s7) this.b;
        zj0 zj0Var = (zj0) this.c;
        int[] iArr = (int[]) this.d;
        s7Var.c(canvas, rectF, f7);
        s7Var.f(canvas, rectF, f7);
        if (s7Var.h) {
            s7Var.b(canvas, rectF, f7);
        } else {
            s7Var.e(canvas, rectF, f7);
        }
        if (zj0Var != null && zj0Var.a0 && zj0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f7 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            zj0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        xa.o oVar = (xa.o) this.d;
        String str2 = (String) obj;
        w3 c10 = FirebaseMessaging.c(firebaseMessaging.b);
        l9.h hVar = firebaseMessaging.a;
        hVar.a();
        String d = "[DEFAULT]".equals(hVar.b) ? "" : hVar.d();
        String a2 = firebaseMessaging.i.a();
        synchronized (c10) {
            String a10 = xa.o.a(System.currentTimeMillis(), str2, a2);
            if (a10 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.a).edit();
                edit.putString(d + "|T|" + str + "|*", a10);
                edit.commit();
            }
        }
        if (oVar == null || !str2.equals(oVar.a)) {
            l9.h hVar2 = firebaseMessaging.a;
            hVar2.a();
            if ("[DEFAULT]".equals(hVar2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    hVar2.a();
                    sb2.append(hVar2.b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new xa.g(firebaseMessaging.b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override // org.telegram.ui.ux
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        e4 e4Var = (e4) this.b;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
        ay ayVar2 = (ay) this.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((gs) arrayList.get(0)).a;
        Long l4 = (Long) g4.f(e4Var.a).r.get(tL_starGiftUnique.slug);
        long longValue = l4 != null ? l4.longValue() : 0L;
        if (longValue != 0 && longValue != j10) {
            s4.m0(e4Var.getContext(), e4Var.I0, e4Var.a, tL_starGiftUnique, longValue, new a3(e4Var, j10, tL_starGiftUnique, ayVar2, 16));
            return true;
        }
        g4.f(e4Var.a).s(j10, new yf.b(null, tL_starGiftUnique.slug), null, true);
        ayVar2.presentFragment(un.ha(j10), true);
        return true;
    }

    public /* synthetic */ a(g gVar, Object obj, i iVar, int i10) {
        this.a = i10;
        this.b = gVar;
        this.d = obj;
        this.c = iVar;
    }
}
