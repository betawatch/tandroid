// default package

import android.content.ClipboardManager;
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
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class z3b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z3b(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x035e A[Catch: all -> 0x0388, TryCatch #2 {all -> 0x0388, blocks: (B:170:0x02a5, B:173:0x02b5, B:175:0x02d5, B:177:0x02df, B:179:0x02ef, B:181:0x02f5, B:184:0x0346, B:186:0x035e, B:187:0x0362, B:192:0x0319, B:194:0x031d), top: B:169:0x02a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        boolean z;
        Runnable runnable;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        long j;
        i74 i74Var;
        byte b = this.a;
        String str = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((StickersActivity) obj2).q0((p3b) obj);
                break;
            case 1:
                jn7 f = jn7.f(yac.t0);
                Boolean bool = Boolean.FALSE;
                f.m(jn7.u3, bool, (TLObject) obj2, (TLRPC.Document) obj, null, bool);
                break;
            case 2:
                wv1 wv1Var = (wv1) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (wv1Var != null) {
                    wv1Var.a(Boolean.valueOf(tL_error == null));
                    break;
                }
                break;
            case 3:
                p5b p5bVar = (p5b) obj2;
                TLObject tLObject = (TLObject) obj;
                r5b r5bVar = p5bVar.q;
                int i2 = p5bVar.c;
                ArrayList arrayList = p5bVar.i;
                p5bVar.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    uc7.s1(i2).j4(tL_foundStories.users, false);
                    uc7.s1(i2).c4(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList2 = tL_foundStories.stories;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList2.get(i3);
                        i3++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = wf3.n(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList.size();
                        r47 r47Var = new r47(i2, tL_foundStory2.storyItem);
                        r47Var.r0(false);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(Integer.valueOf(arrayList.size()));
                        p5bVar.F.add(arrayList3);
                        arrayList.add(r47Var);
                    }
                    p5bVar.J = Math.max(arrayList.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        p5bVar.J = arrayList.size();
                    }
                    if (arrayList.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    p5bVar.H = str;
                    p5bVar.G = false;
                    hl.r(r5bVar);
                    hl.c3(r5bVar);
                    break;
                }
                break;
            case 4:
                q5b q5bVar = (q5b) obj2;
                ArrayList arrayList4 = q5bVar.h;
                arrayList4.clear();
                arrayList4.addAll((List) obj);
                q5bVar.d = true;
                q5bVar.e = false;
                q5bVar.d();
                jn7.f(q5bVar.a).k(jn7.l3, Long.valueOf(q5bVar.b), q5bVar);
                break;
            case 5:
                q5b q5bVar2 = (q5b) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList5 = q5bVar2.g;
                ArrayList arrayList6 = q5bVar2.h;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                    ArrayList arrayList7 = new ArrayList(tL_albums.albums.size());
                    ArrayList<TL_stories.TL_storyAlbum> arrayList8 = tL_albums.albums;
                    int size2 = arrayList8.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList8.get(i4);
                        i4++;
                        arrayList7.add(v5b.a(tL_storyAlbum));
                    }
                    arrayList6.clear();
                    arrayList6.addAll(arrayList7);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList7);
                    q5bVar2.f = true;
                    q5bVar2.e = false;
                    q5bVar2.f(true);
                    break;
                } else if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList5);
                    q5bVar2.f = true;
                    q5bVar2.e = false;
                    jn7.f(q5bVar2.a).k(jn7.l3, Long.valueOf(q5bVar2.b), q5bVar2);
                    break;
                }
                break;
            case 6:
                ((pcc) obj).a((u5b) obj2);
                break;
            case 7:
                uc7.s1(((b6b) obj2).N.a).O1().b0((TL_stories.TL_updateStory) obj);
                break;
            case 8:
                b6b b6bVar = (b6b) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                c8b c8bVar = b6bVar.c;
                c8bVar.w = true;
                c6b c6bVar = b6bVar.N;
                if (c6bVar.m(tL_error2)) {
                    c8bVar.x = null;
                } else {
                    c8bVar.x = tL_error2;
                }
                b6bVar.d = true;
                b6bVar.J = true;
                b6bVar.I = true;
                c6bVar.w.d(c8bVar);
                break;
            case 9:
                b6b b6bVar2 = (b6b) obj2;
                b6bVar2.c.c((File) obj);
                hl.c3(new y5b(b6bVar2, r5));
                break;
            case 10:
                o6b o6bVar = (o6b) obj2;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj;
                jf7 jf7Var = o6bVar.b;
                SQLiteDatabase sQLiteDatabase = jf7Var.b;
                try {
                    long n = wf3.n(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem = tL_updateStory.story;
                    int i5 = storyItem.id;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + n + " AND story_id = " + i5, new Object[0]);
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                            if (byteBufferValue != null) {
                                w7b.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
                                byteBufferValue.reuse();
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        queryFinalized.dispose();
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + n + " AND story_id = " + i5).stepThis().dispose();
                        if (z) {
                            i = -1;
                            SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + n, new Object[0]);
                            r5 = queryFinalized2.next() ? queryFinalized2.intValue(1) : (byte) 0;
                            queryFinalized2.dispose();
                            Locale locale2 = Locale.US;
                            sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r5 + i) + " WHERE dialog_id = " + n).stepThis().dispose();
                            break;
                        }
                        i = 0;
                        SQLiteCursor queryFinalized22 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + n, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r5 + i) + " WHERE dialog_id = " + n).stepThis().dispose();
                    } else {
                        if (storyItem instanceof TL_stories.TL_storyItem) {
                            o6bVar.l(n, storyItem);
                            Locale locale3 = Locale.US;
                            SQLiteCursor queryFinalized3 = sQLiteDatabase.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + n + " AND story_id = " + i5, new Object[0]);
                            boolean next = queryFinalized3.next();
                            queryFinalized3.dispose();
                            if (!next) {
                                i = 1;
                                SQLiteCursor queryFinalized222 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + n, new Object[0]);
                                if (queryFinalized222.next()) {
                                }
                                queryFinalized222.dispose();
                                Locale locale222 = Locale.US;
                                sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r5 + i) + " WHERE dialog_id = " + n).stepThis().dispose();
                            }
                        }
                        i = 0;
                        SQLiteCursor queryFinalized2222 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + n, new Object[0]);
                        if (queryFinalized2222.next()) {
                        }
                        queryFinalized2222.dispose();
                        Locale locale2222 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r5 + i) + " WHERE dialog_id = " + n).stepThis().dispose();
                    }
                } catch (Throwable th) {
                    jf7Var.n(th, true);
                    return;
                }
            case 11:
                ((o6b) obj2).j((ArrayList) obj);
                break;
            case 12:
                h5b h5bVar = (h5b) obj;
                jf7 jf7Var2 = ((o6b) obj2).b;
                SQLiteDatabase sQLiteDatabase2 = jf7Var2.b;
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = sQLiteDatabase2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e) {
                    jf7Var2.n(e, true);
                }
                hl.c3(new z3b(h5bVar, longSparseIntArray, (byte) 13));
                break;
            case 13:
                ((h5b) obj2).a((LongSparseIntArray) obj);
                break;
            case 14:
                ((o6b) obj2).f((h5b) obj);
                break;
            case 15:
                ((h5b) obj2).a((TL_stories.TL_stories_allStories) obj);
                break;
            case 16:
                Runnable runnable2 = (Runnable) obj;
                if (!((pv0) obj2).b) {
                    runnable2.run();
                    break;
                }
                break;
            case 17:
                pv0 pv0Var = (pv0) obj;
                ((Runnable[]) obj2)[0] = null;
                ((z3b) pv0Var.d).run();
                p6b p6bVar = (p6b) pv0Var.e;
                if (p6bVar != null) {
                    p6bVar.K();
                    break;
                }
                break;
            case 18:
                q6b q6bVar = (q6b) obj2;
                View view = (View) obj;
                q6bVar.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                v41 v41Var = q6bVar.H;
                if (v41Var != null) {
                    v41Var.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                q6bVar.N = false;
                q6bVar.e();
                break;
            case 19:
                e7b e7bVar = (e7b) obj2;
                q66 q66Var = (q66) obj;
                q66 q66Var2 = e7bVar.a;
                if (q66Var == q66Var2 && q66Var2 != null) {
                    CharacterStyle characterStyle = q66Var2.i;
                    if (characterStyle instanceof URLSpan) {
                        f7b f7bVar = e7bVar.v;
                        m66 m66Var = e7bVar.c;
                        Objects.requireNonNull(m66Var);
                        f7bVar.K.H((URLSpan) characterStyle, f7bVar, new uoa((Object) m66Var, (byte) 27));
                        e7bVar.a = null;
                        break;
                    }
                }
                break;
            case 20:
                r7b r7bVar = (r7b) obj2;
                pm3 pm3Var = (pm3) obj;
                if (pm3Var != null) {
                    r7b.z = r7bVar.b;
                    r7b.A = pm3Var;
                }
                if (!r7bVar.h) {
                    r7bVar.f = pm3Var;
                    if (pm3Var != null && (runnable = r7bVar.e) != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 21:
                c8b c8bVar2 = (c8b) obj2;
                TLObject tLObject3 = (TLObject) obj;
                c8bVar2.e1 = 0;
                if (tLObject3 instanceof Vector) {
                    c8bVar2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject3;
                    for (int i6 = 0; i6 < vector.objects.size(); i6++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i6);
                        TLRPC.Document document = stickerSetCovered.cover;
                        if (document == null && !stickerSetCovered.covers.isEmpty()) {
                            document = stickerSetCovered.covers.get(0);
                        }
                        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = document.id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            c8bVar2.V0.add(tL_inputDocument);
                        }
                    }
                    break;
                }
                break;
            case 22:
                r8b r8bVar = (r8b) obj2;
                TLObject tLObject4 = (TLObject) obj;
                if (tLObject4 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject4;
                    uc7.s1(r8bVar.a).j4(webpagepreview.users, false);
                    uc7.s1(r8bVar.a).c4(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        if (tL_messageMediaWebPage == null) {
                            TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                            r8bVar.b2 = webPage;
                            if (r8b.c1(webPage)) {
                                TLRPC.WebPage webPage2 = r8bVar.b2;
                                j = webPage2 == null ? 0L : webPage2.id;
                                r8bVar.a2 = j;
                                r8bVar.b2 = null;
                                r8bVar.c2 = j != 0;
                                i74Var = r8bVar.S1;
                                if (i74Var != null) {
                                    i74Var.O(true);
                                    break;
                                }
                            } else {
                                r8bVar.a2 = 0L;
                            }
                        } else {
                            r8bVar.b2 = null;
                            r8bVar.a2 = 0L;
                        }
                        j = 0;
                        r8bVar.c2 = j != 0;
                        i74Var = r8bVar.S1;
                        if (i74Var != null) {
                        }
                    }
                }
                tL_messageMediaWebPage = null;
                if (tL_messageMediaWebPage == null) {
                }
                j = 0;
                r8bVar.c2 = j != 0;
                i74Var = r8bVar.S1;
                if (i74Var != null) {
                }
                break;
            case 23:
                r8b r8bVar2 = (r8b) obj2;
                TextView textView = (TextView) obj;
                ClipboardManager clipboardManager = (ClipboardManager) r8bVar2.getContext().getSystemService("clipboard");
                yt3 yt3Var = r8bVar2.T1.d;
                boolean z2 = (TextUtils.isEmpty(yt3Var.getText()) || TextUtils.equals(yt3Var.getText(), "https://") || TextUtils.isEmpty(yt3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                ik8.t(textView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.7f).scaleY(z2 ? 1.0f : 0.7f), k43.h, 300L);
                break;
            case 24:
                v8b v8bVar = (v8b) obj2;
                kg5 kg5Var = (kg5) obj;
                v8bVar.d.removeView(kg5Var);
                if (kg5Var == v8bVar.c) {
                    v8bVar.b = null;
                    v8bVar.invalidate();
                    v8bVar.b(false);
                    break;
                }
                break;
            case 25:
                w9b w9bVar = (w9b) obj2;
                HashMap f0 = ((jf7) obj).f0();
                if (!f0.isEmpty()) {
                    hl.c3(new z3b(w9bVar, f0, (byte) 26));
                    break;
                }
                break;
            case 26:
                w9b w9bVar2 = (w9b) obj2;
                HashMap hashMap = (HashMap) obj;
                HashMap hashMap2 = w9bVar2.J1;
                if (hashMap2 == null) {
                    hashMap2 = new HashMap();
                    w9bVar2.J1 = hashMap2;
                }
                hashMap2.putAll(hashMap);
                break;
            case 27:
                c51 c51Var = (c51) obj2;
                Runnable runnable3 = (Runnable) obj;
                if (c51Var != null) {
                    c51Var.setLoading(false);
                }
                runnable3.run();
                break;
            case 28:
                rbb rbbVar = (rbb) obj2;
                rbbVar.c(false);
                hl.r(rbbVar.h2);
                rbbVar.h2 = null;
                rbbVar.T1 = false;
                ((Runnable) obj).run();
                break;
            default:
                ((z3b) obj).run();
                ((rbb) obj2).o0();
                break;
        }
    }
}
