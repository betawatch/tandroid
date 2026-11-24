// default package

import android.content.ClipboardManager;
import android.net.Uri;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uva implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uva(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0300 A[Catch: all -> 0x032a, TryCatch #2 {all -> 0x032a, blocks: (B:148:0x0247, B:151:0x0257, B:153:0x0277, B:155:0x0281, B:157:0x0291, B:159:0x0297, B:162:0x02e8, B:164:0x0300, B:165:0x0304, B:170:0x02bb, B:172:0x02bf), top: B:147:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Uri build;
        int i;
        Object[] objArr;
        Runnable runnable;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        long j;
        x74 x74Var;
        byte b = this.a;
        int i2 = 4;
        byte b2 = 2;
        String str = null;
        byte b3 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                new c41(((my0[]) obj2)[0].F, (ylb) obj).Q(R.raw.copy, 36, jb6.M0(2131744636, null)).k(false);
                break;
            case 1:
                eya eyaVar = (eya) obj2;
                eyaVar.N1 = true;
                eyaVar.E0(new fva((hva) obj, b2));
                gm.d3(new oxa(eyaVar, (byte) 1), 240L);
                break;
            case 2:
                k0b k0bVar = (k0b) obj;
                k44 k44Var = (k44) ((dx8) ((oo8) obj2).b).f;
                k44Var.getClass();
                rg5 rg5Var = (rg5) k44Var.b;
                jte.p(rg5Var.k);
                mo5 mo5Var = k0bVar.e;
                HashSet hashSet = rg5Var.h;
                ko5 listIterator = mo5Var.listIterator(0);
                while (listIterator.hasNext()) {
                    i0b i0bVar = (i0b) listIterator.next();
                    Object obj3 = i0bVar.a;
                    j0b j0bVar = i0bVar.c;
                    String str2 = i0bVar.b;
                    if (hashSet.contains(obj3) && !hashSet.contains(str2)) {
                        jo5 jo5Var = new jo5(i2);
                        jo5 jo5Var2 = new jo5(i2);
                        mo5 mo5Var2 = rg5Var.d;
                        qo5 qo5Var = j0bVar.c;
                        int size = mo5Var2.size();
                        int i3 = b3;
                        while (i3 < size) {
                            Object obj4 = mo5Var2.get(i3);
                            i3++;
                            byte b4 = b3;
                            nh5 nh5Var = (nh5) obj4;
                            Uri uri = (Uri) nh5Var.b.get(obj3);
                            String str3 = nh5Var.a.b;
                            uri.getClass();
                            if (qo5Var.containsKey(str3)) {
                                build = (Uri) qo5Var.get(str3);
                                build.getClass();
                            } else {
                                build = rg5.b(uri, j0bVar).build();
                            }
                            if (build != null) {
                                jo5Var.c(build);
                                jo5Var2.c(uri);
                            }
                            b3 = b4;
                        }
                        byte b5 = b3;
                        rg5.d(i0bVar, rg5Var.e, jo5Var, jo5Var2);
                        rg5.d(i0bVar, rg5Var.f, jo5Var, jo5Var2);
                        rg5.d(i0bVar, rg5Var.g, jo5Var, jo5Var2);
                        hashSet.add(str2);
                        nl9 nl9Var = rg5Var.b;
                        y79 f = jo5Var.f();
                        y79 f2 = jo5Var2.f();
                        HashMap hashMap = ((fc3) nl9Var.b).d;
                        jte.p(f.d == f2.d ? 1 : b5);
                        for (int i4 = b5; i4 < f.d; i4++) {
                            ec3 ec3Var = (ec3) hashMap.get(f2.get(i4));
                            ec3Var.getClass();
                            Uri uri2 = (Uri) f.get(i4);
                            ec3Var.a.b.put(str2, uri2);
                            HashMap hashMap2 = ec3Var.b;
                            dc3 dc3Var = (dc3) hashMap2.get(uri2);
                            if (dc3Var == null) {
                                hashMap2.put(uri2, new dc3(ec3Var.d, uri2, str2));
                            } else {
                                dc3Var.b.add(str2);
                            }
                            hashMap.put(uri2, ec3Var);
                        }
                        b3 = b5;
                        i2 = 4;
                    }
                }
                rg5Var.m = k0bVar.d;
                rg5Var.e(-9223372036854775807L);
                break;
            case 3:
                n1b n1bVar = (n1b) obj2;
                n1bVar.H = false;
                k1b[] k1bVarArr = (k1b[]) ((ArrayList) obj).toArray(new k1b[0]);
                n1bVar.I = k1bVarArr;
                if (k1bVarArr.length > 0) {
                    n1bVar.c0.setScaleX(0.3f);
                    n1bVar.c0.setScaleY(0.3f);
                    n1bVar.c0.setAlpha(0.0f);
                    n1bVar.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(d53.f).start();
                    break;
                }
                break;
            case 4:
                s1b s1bVar = (s1b) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                if (s1bVar.r.documents.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = s1bVar.r;
                    if (tL_messages_stickerSet.set.thumb_document_id == document.id) {
                        tL_messages_stickerSet.documents.add(document);
                        s1bVar.d(s1bVar.r, s1bVar.f, s1bVar.s);
                        break;
                    }
                }
                break;
            case 5:
                ((StickersActivity) obj2).r0((s1b) obj);
                break;
            case 6:
                nm7 f3 = nm7.f(z8c.t0);
                Boolean bool = Boolean.FALSE;
                f3.m(nm7.u3, bool, (TLObject) obj2, (TLRPC.Document) obj, null, bool);
                break;
            case 7:
                sw1 sw1Var = (sw1) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (sw1Var != null) {
                    sw1Var.a(Boolean.valueOf(tL_error == null));
                    break;
                }
                break;
            case 8:
                u3b u3bVar = (u3b) obj2;
                TLObject tLObject = (TLObject) obj;
                w3b w3bVar = u3bVar.q;
                int i5 = u3bVar.c;
                ArrayList arrayList = u3bVar.i;
                u3bVar.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    oc7.r1(i5).d4(tL_foundStories.users, false);
                    oc7.r1(i5).X3(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList2 = tL_foundStories.stories;
                    int size2 = arrayList2.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList2.get(i6);
                        i6++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = pg3.n(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList.size();
                        k47 k47Var = new k47(i5, tL_foundStory2.storyItem);
                        k47Var.r0(false);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(Integer.valueOf(arrayList.size()));
                        u3bVar.F.add(arrayList3);
                        arrayList.add(k47Var);
                    }
                    u3bVar.J = Math.max(arrayList.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        u3bVar.J = arrayList.size();
                    }
                    if (arrayList.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    u3bVar.H = str;
                    u3bVar.G = false;
                    gm.r(w3bVar);
                    gm.c3(w3bVar);
                    break;
                }
                break;
            case 9:
                v3b v3bVar = (v3b) obj2;
                ArrayList arrayList4 = v3bVar.h;
                arrayList4.clear();
                arrayList4.addAll((List) obj);
                v3bVar.d = true;
                v3bVar.e = false;
                v3bVar.d();
                nm7.f(v3bVar.a).k(nm7.l3, Long.valueOf(v3bVar.b), v3bVar);
                break;
            case 10:
                v3b v3bVar2 = (v3b) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList5 = v3bVar2.g;
                ArrayList arrayList6 = v3bVar2.h;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                    ArrayList arrayList7 = new ArrayList(tL_albums.albums.size());
                    ArrayList<TL_stories.TL_storyAlbum> arrayList8 = tL_albums.albums;
                    int size3 = arrayList8.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList8.get(i7);
                        i7++;
                        arrayList7.add(a4b.a(tL_storyAlbum));
                    }
                    arrayList6.clear();
                    arrayList6.addAll(arrayList7);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList7);
                    v3bVar2.f = true;
                    v3bVar2.e = false;
                    v3bVar2.f(true);
                    break;
                } else if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    v3bVar2.f = true;
                    v3bVar2.e = false;
                    nm7.f(v3bVar2.a).k(nm7.l3, Long.valueOf(v3bVar2.b), v3bVar2);
                    break;
                }
                break;
            case 11:
                ((qac) obj).a((z3b) obj2);
                break;
            case 12:
                oc7.r1(((g4b) obj2).N.a).N1().b0((TL_stories.TL_updateStory) obj);
                break;
            case 13:
                g4b g4bVar = (g4b) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                g6b g6bVar = g4bVar.c;
                g6bVar.w = true;
                h4b h4bVar = g4bVar.N;
                if (h4bVar.m(tL_error2)) {
                    g6bVar.x = null;
                } else {
                    g6bVar.x = tL_error2;
                }
                g4bVar.d = true;
                g4bVar.J = true;
                g4bVar.I = true;
                h4bVar.w.d(g6bVar);
                break;
            case 14:
                g4b g4bVar2 = (g4b) obj2;
                g4bVar2.c.c((File) obj);
                gm.c3(new d4b(g4bVar2, b3));
                break;
            case 15:
                ((t4b) obj2).f((n3b) obj);
                break;
            case 16:
                t4b t4bVar = (t4b) obj2;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj;
                cf7 cf7Var = t4bVar.b;
                SQLiteDatabase sQLiteDatabase = cf7Var.b;
                try {
                    long n = pg3.n(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem = tL_updateStory.story;
                    int i8 = storyItem.id;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + n + " AND story_id = " + i8, new Object[0]);
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                            if (byteBufferValue != null) {
                                a6b.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
                                byteBufferValue.reuse();
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            objArr = true;
                        } else {
                            objArr = false;
                        }
                        queryFinalized.dispose();
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + n + " AND story_id = " + i8).stepThis().dispose();
                        if (objArr != false) {
                            i = -1;
                            SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + n, new Object[0]);
                            int intValue = queryFinalized2.next() ? queryFinalized2.intValue(1) : 0;
                            queryFinalized2.dispose();
                            Locale locale2 = Locale.US;
                            sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (intValue + i) + " WHERE dialog_id = " + n).stepThis().dispose();
                            break;
                        }
                        i = 0;
                        SQLiteCursor queryFinalized22 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + n, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (intValue + i) + " WHERE dialog_id = " + n).stepThis().dispose();
                    } else {
                        if (storyItem instanceof TL_stories.TL_storyItem) {
                            t4bVar.l(n, storyItem);
                            Locale locale3 = Locale.US;
                            SQLiteCursor queryFinalized3 = sQLiteDatabase.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + n + " AND story_id = " + i8, new Object[0]);
                            boolean next = queryFinalized3.next();
                            queryFinalized3.dispose();
                            if (!next) {
                                i = 1;
                                SQLiteCursor queryFinalized222 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + n, new Object[0]);
                                if (queryFinalized222.next()) {
                                }
                                queryFinalized222.dispose();
                                Locale locale222 = Locale.US;
                                sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (intValue + i) + " WHERE dialog_id = " + n).stepThis().dispose();
                            }
                        }
                        i = 0;
                        SQLiteCursor queryFinalized2222 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + n, new Object[0]);
                        if (queryFinalized2222.next()) {
                        }
                        queryFinalized2222.dispose();
                        Locale locale2222 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (intValue + i) + " WHERE dialog_id = " + n).stepThis().dispose();
                    }
                } catch (Throwable th) {
                    cf7Var.n(th, true);
                    return;
                }
            case 17:
                ((t4b) obj2).j((ArrayList) obj);
                break;
            case 18:
                n3b n3bVar = (n3b) obj;
                cf7 cf7Var2 = ((t4b) obj2).b;
                SQLiteDatabase sQLiteDatabase2 = cf7Var2.b;
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = sQLiteDatabase2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e) {
                    cf7Var2.n(e, true);
                }
                gm.c3(new uva(n3bVar, longSparseIntArray, (byte) 20));
                break;
            case 19:
                ((n3b) obj2).a((TL_stories.TL_stories_allStories) obj);
                break;
            case 20:
                ((n3b) obj2).a((LongSparseIntArray) obj);
                break;
            case 21:
                Runnable runnable2 = (Runnable) obj;
                if (!((ow0) obj2).b) {
                    runnable2.run();
                    break;
                }
                break;
            case 22:
                ow0 ow0Var = (ow0) obj;
                ((Runnable[]) obj2)[0] = null;
                ((uva) ow0Var.d).run();
                u4b u4bVar = (u4b) ow0Var.e;
                if (u4bVar != null) {
                    u4bVar.K();
                    break;
                }
                break;
            case 23:
                v4b v4bVar = (v4b) obj2;
                View view = (View) obj;
                v4bVar.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                u51 u51Var = v4bVar.H;
                if (u51Var != null) {
                    u51Var.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                v4bVar.N = false;
                v4bVar.e();
                break;
            case 24:
                j5b j5bVar = (j5b) obj2;
                m66 m66Var = (m66) obj;
                m66 m66Var2 = j5bVar.a;
                if (m66Var == m66Var2 && m66Var2 != null) {
                    CharacterStyle characterStyle = m66Var2.i;
                    if (characterStyle instanceof URLSpan) {
                        k5b k5bVar = j5bVar.v;
                        i66 i66Var = j5bVar.c;
                        Objects.requireNonNull(i66Var);
                        k5bVar.K.H((URLSpan) characterStyle, k5bVar, new nsa((Object) i66Var, (byte) 18));
                        j5bVar.a = null;
                        break;
                    }
                }
                break;
            case 25:
                v5b v5bVar = (v5b) obj2;
                in3 in3Var = (in3) obj;
                if (in3Var != null) {
                    v5b.z = v5bVar.b;
                    v5b.A = in3Var;
                }
                if (!v5bVar.h) {
                    v5bVar.f = in3Var;
                    if (in3Var != null && (runnable = v5bVar.e) != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 26:
                g6b g6bVar2 = (g6b) obj2;
                TLObject tLObject3 = (TLObject) obj;
                g6bVar2.e1 = 0;
                if (tLObject3 instanceof Vector) {
                    g6bVar2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject3;
                    for (int i9 = 0; i9 < vector.objects.size(); i9++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i9);
                        TLRPC.Document document2 = stickerSetCovered.cover;
                        if (document2 == null && !stickerSetCovered.covers.isEmpty()) {
                            document2 = stickerSetCovered.covers.get(0);
                        }
                        if (document2 == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document2 = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document2 != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            g6bVar2.V0.add(tL_inputDocument);
                        }
                    }
                    break;
                }
                break;
            case 27:
                u6b u6bVar = (u6b) obj2;
                TLObject tLObject4 = (TLObject) obj;
                if (tLObject4 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject4;
                    oc7.r1(u6bVar.a).d4(webpagepreview.users, false);
                    oc7.r1(u6bVar.a).X3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        if (tL_messageMediaWebPage == null) {
                            TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                            u6bVar.b2 = webPage;
                            if (u6b.b1(webPage)) {
                                TLRPC.WebPage webPage2 = u6bVar.b2;
                                j = webPage2 == null ? 0L : webPage2.id;
                                u6bVar.a2 = j;
                                u6bVar.b2 = null;
                                u6bVar.c2 = j != 0;
                                x74Var = u6bVar.S1;
                                if (x74Var != null) {
                                    x74Var.O(true);
                                    break;
                                }
                            } else {
                                u6bVar.a2 = 0L;
                            }
                        } else {
                            u6bVar.b2 = null;
                            u6bVar.a2 = 0L;
                        }
                        j = 0;
                        u6bVar.c2 = j != 0;
                        x74Var = u6bVar.S1;
                        if (x74Var != null) {
                        }
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage == null) {
                }
                j = 0;
                u6bVar.c2 = j != 0;
                x74Var = u6bVar.S1;
                if (x74Var != null) {
                }
                break;
            case 28:
                u6b u6bVar2 = (u6b) obj2;
                TextView textView = (TextView) obj;
                ClipboardManager clipboardManager = (ClipboardManager) u6bVar2.getContext().getSystemService("clipboard");
                ru3 ru3Var = u6bVar2.T1.d;
                boolean z = (TextUtils.isEmpty(ru3Var.getText()) || TextUtils.equals(ru3Var.getText(), "https://") || TextUtils.isEmpty(ru3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                wi8.t(textView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f), d53.h, 300L);
                break;
            default:
                x6b x6bVar = (x6b) obj2;
                hg5 hg5Var = (hg5) obj;
                x6bVar.d.removeView(hg5Var);
                if (hg5Var == x6bVar.c) {
                    x6bVar.b = null;
                    x6bVar.invalidate();
                    x6bVar.b(false);
                    break;
                }
                break;
        }
    }
}
