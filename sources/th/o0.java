package th;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.ic;
import org.telegram.messenger.is;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.wp;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.q80;
import vh.h8;
import vh.j8;
import vh.n8;
import vh.o8;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0269 A[Catch: all -> 0x01f4, TryCatch #1 {all -> 0x01f4, blocks: (B:100:0x01aa, B:103:0x01ba, B:105:0x01da, B:107:0x01e5, B:109:0x01fa, B:111:0x0200, B:114:0x0251, B:116:0x0269, B:117:0x026e, B:122:0x0224, B:124:0x0228), top: B:99:0x01aa }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        n8 n8Var;
        n7 n7Var;
        int i10;
        boolean z10;
        g2 g2Var;
        k2.t0 t0Var;
        int i11;
        int i12 = 2;
        String str = null;
        switch (this.a) {
            case 0:
                s0 s0Var = (s0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    at.f(s0Var.e).k(at.H2, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                break;
            case 1:
                ((s0) this.b).F.remove((String) this.c);
                break;
            case 2:
                z2 z2Var = (z2) this.b;
                vh.p2 p2Var = (vh.p2) this.c;
                z2Var.removeView(p2Var);
                if (z2Var.M1 == p2Var) {
                    z2Var.M1 = null;
                    break;
                }
                break;
            case 3:
                z2 z2Var2 = (z2) this.b;
                o8 D = o8.D((Activity) this.c, z2Var2.l2);
                k2.t0 t0Var2 = z2Var2.v2;
                long j10 = (t0Var2 == null || (n7Var = (n7) t0Var2.c) == null) ? 0L : n7Var.currentPosition;
                File h = z2Var2.x1.h();
                TL_stories.StoryItem storyItem = z2Var2.x1.a;
                vh.n5 n5Var = new vh.n5();
                n5Var.n = true;
                n5Var.t = storyItem.media;
                int i14 = n5Var.a;
                n5Var.q = wp.r1(i14).y1(storyItem.dialogId);
                n5Var.r = storyItem.id;
                n5Var.s = storyItem.caption;
                n5Var.L = h;
                n5Var.M = false;
                n5Var.k0 = 720;
                n5Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    n5Var.K = false;
                    if (h != null) {
                        n5Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    n5Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i15 = 0;
                        while (true) {
                            if (i15 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i15);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    n5Var.k0 = documentAttribute.w;
                                    n5Var.l0 = documentAttribute.h;
                                    n5Var.i = documentAttribute.duration;
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            n5Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i16 = 0; i16 < storyItem.media.document.thumbs.size(); i16++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i16);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    n5Var.O = ic.F(null, photoSize.bytes);
                                } else {
                                    b8.G(i14);
                                    File K = b8.K(photoSize, null, true, true);
                                    if (K != null && K.exists()) {
                                        n5Var.N = K.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                n5Var.A();
                n5Var.e(storyItem);
                h8 d = j8.d(z2Var2.s0);
                RectF rectF = D.H;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f;
                int i17 = D.c;
                if (!D.d) {
                    if (wp.r1(i17).u2()) {
                        org.telegram.ui.b.b(i17);
                    } else {
                        D.u0 = false;
                        D.e = false;
                        D.B2 = false;
                        if (windowManager != null && (n8Var = D.n) != null && n8Var.getParent() == null) {
                            org.telegram.messenger.i0.x3(windowManager, D.n, layoutParams);
                            windowManager.addView(D.n, layoutParams);
                            D.f0();
                        }
                        D.K1 = n5Var;
                        vh.x6.a(i17, n5Var);
                        vh.n5 n5Var2 = D.K1;
                        D.O1 = (n5Var2 == null || !n5Var2.K) ? 0 : 1;
                        D.s0.g = false;
                        if (d != null) {
                            D.F = d;
                            D.J = d.a;
                            rectF.set(d.c);
                            D.G = d.b;
                            D.F.e();
                        } else {
                            D.J = 0;
                            float L = org.telegram.messenger.i0.L(100.0f);
                            Point point = org.telegram.messenger.i0.q;
                            rectF.set(0.0f, L, point.x, org.telegram.messenger.i0.L(100.0f) + point.y);
                            D.G = org.telegram.messenger.i0.L(8.0f);
                        }
                        D.r.c();
                        vh.b8 b8Var = D.h0;
                        int i18 = D.J;
                        b8Var.setBackgroundColor((i18 == 1 || i18 == 0) ? 0 : -14737633);
                        D.r.setTranslationX(0.0f);
                        D.r.setTranslationY(0.0f);
                        D.r.b(0.0f);
                        D.r.setScaleX(1.0f);
                        D.r.setScaleY(1.0f);
                        D.K = 0.0f;
                        org.telegram.messenger.i0.g2(D.b);
                        vh.n5 n5Var3 = D.K1;
                        if (n5Var3 != null) {
                            D.c1.setText(n5Var3.C0);
                        }
                        D.K(new vh.y6(D, 7), j10);
                        D.b1.b(true, false);
                        D.J(1, false);
                        D.k0(-1, false, false);
                        D.d();
                        D.v0 = 0L;
                        D.w0 = "";
                    }
                }
                D.Q = new i1(z2Var2, 12);
                D.R = new kt0(i12, z2Var2, D);
                break;
            case 4:
                u2 u2Var = (u2) this.b;
                o7 o7Var = (o7) this.c;
                u2Var.getClass();
                ((f7) u2Var.x.z1).h(new kg.i1(o7Var.f, 14, false));
                break;
            case 5:
                k3 k3Var = (k3) this.b;
                String str3 = (String) this.c;
                k3Var.f = null;
                y3 y3Var = k3Var.h;
                y3Var.Q = false;
                y3Var.O.c = str3.toLowerCase();
                y3.b(y3Var);
                break;
            case 6:
                r20 r20Var = (r20) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (r20Var != null) {
                    r20Var.a(Boolean.valueOf(tL_error == null));
                    break;
                }
                break;
            case 7:
                r4 r4Var = (r4) this.b;
                TLObject tLObject = (TLObject) this.c;
                u4 u4Var = r4Var.q;
                int i19 = r4Var.c;
                ArrayList arrayList2 = r4Var.i;
                r4Var.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    wp.r1(i19).V3(tL_foundStories.users, false);
                    wp.r1(i19).P3(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList3 = tL_foundStories.stories;
                    int size2 = arrayList3.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList3.get(i20);
                        i20++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = org.telegram.messenger.o5.o(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList2.size();
                        kj kjVar = new kj(i19, tL_foundStory2.storyItem);
                        kjVar.r0(false);
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(Integer.valueOf(arrayList2.size()));
                        r4Var.F.add(arrayList4);
                        arrayList2.add(kjVar);
                    }
                    r4Var.J = Math.max(arrayList2.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        r4Var.J = arrayList2.size();
                    }
                    if (arrayList2.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    r4Var.H = str;
                    r4Var.G = false;
                    org.telegram.messenger.i0.r(u4Var);
                    org.telegram.messenger.i0.g3(u4Var);
                    break;
                }
                break;
            case 8:
                t4 t4Var = (t4) this.b;
                List list = (List) this.c;
                ArrayList arrayList5 = t4Var.h;
                arrayList5.clear();
                arrayList5.addAll(list);
                t4Var.d = true;
                t4Var.e = false;
                t4Var.d();
                at.f(t4Var.a).k(at.j3, Long.valueOf(t4Var.b), t4Var);
                break;
            case 9:
                t4 t4Var2 = (t4) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList6 = t4Var2.g;
                ArrayList arrayList7 = t4Var2.h;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                    ArrayList arrayList8 = new ArrayList(tL_albums.albums.size());
                    ArrayList<TL_stories.TL_storyAlbum> arrayList9 = tL_albums.albums;
                    int size3 = arrayList9.size();
                    int i21 = 0;
                    while (i21 < size3) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList9.get(i21);
                        i21++;
                        arrayList8.add(y4.a(tL_storyAlbum));
                    }
                    arrayList7.clear();
                    arrayList7.addAll(arrayList8);
                    arrayList6.clear();
                    arrayList6.addAll(arrayList8);
                    t4Var2.f = true;
                    t4Var2.e = false;
                    t4Var2.f(true);
                    break;
                } else if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                    arrayList7.clear();
                    arrayList7.addAll(arrayList6);
                    t4Var2.f = true;
                    t4Var2.e = false;
                    at.f(t4Var2.a).k(at.j3, Long.valueOf(t4Var2.b), t4Var2);
                    break;
                }
                break;
            case 10:
                x4 x4Var = (x4) this.b;
                r20 r20Var2 = (r20) this.c;
                x4Var.getClass();
                r20Var2.a(x4Var);
                break;
            case 11:
                wp.r1(((d5) this.b).M.a).O1().c0((TL_stories.TL_updateStory) this.c);
                break;
            case 12:
                d5 d5Var = (d5) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                vh.n5 n5Var4 = d5Var.c;
                n5Var4.w = true;
                e5 e5Var = d5Var.M;
                if (e5Var.n(tL_error2)) {
                    n5Var4.x = null;
                } else {
                    n5Var4.x = tL_error2;
                }
                d5Var.d = true;
                d5Var.I = true;
                d5Var.H = true;
                e5Var.w.d(n5Var4);
                break;
            case 13:
                d5 d5Var2 = (d5) this.b;
                d5Var2.c.c((File) this.c);
                org.telegram.messenger.i0.g3(new b5(d5Var2, r7));
                break;
            case 14:
                r5.a((r5) this.b, (j4) this.c);
                break;
            case 15:
                r5 r5Var = (r5) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                is isVar = r5Var.b;
                SQLiteDatabase sQLiteDatabase = isVar.b;
                try {
                    long o10 = org.telegram.messenger.o5.o(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    int i22 = storyItem2.id;
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + o10 + " AND story_id = " + i22, new Object[0]);
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                            if (byteBufferValue != null) {
                                n6.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
                                byteBufferValue.reuse();
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        queryFinalized.dispose();
                        sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + o10 + " AND story_id = " + i22).stepThis().dispose();
                        if (z10) {
                            i10 = -1;
                            SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o10, new Object[0]);
                            r7 = queryFinalized2.next() ? queryFinalized2.intValue(1) : 0;
                            queryFinalized2.dispose();
                            Locale locale2 = Locale.US;
                            sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + o10).stepThis().dispose();
                            break;
                        }
                        i10 = 0;
                        SQLiteCursor queryFinalized22 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o10, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + o10).stepThis().dispose();
                    } else {
                        if (storyItem2 instanceof TL_stories.TL_storyItem) {
                            r5Var.l(o10, storyItem2);
                            Locale locale3 = Locale.US;
                            SQLiteCursor queryFinalized3 = sQLiteDatabase.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + o10 + " AND story_id = " + i22, new Object[0]);
                            boolean next = queryFinalized3.next();
                            queryFinalized3.dispose();
                            if (!next) {
                                i10 = 1;
                                SQLiteCursor queryFinalized222 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o10, new Object[0]);
                                if (queryFinalized222.next()) {
                                }
                                queryFinalized222.dispose();
                                Locale locale222 = Locale.US;
                                sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + o10).stepThis().dispose();
                            }
                        }
                        i10 = 0;
                        SQLiteCursor queryFinalized2222 = sQLiteDatabase.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + o10, new Object[0]);
                        if (queryFinalized2222.next()) {
                        }
                        queryFinalized2222.dispose();
                        Locale locale2222 = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE stories_counter SET count = " + (r7 + i10) + " WHERE dialog_id = " + o10).stepThis().dispose();
                    }
                } catch (Throwable th2) {
                    isVar.o(th2, true);
                    return;
                }
            case 16:
                ((r5) this.b).j((ArrayList) this.c);
                break;
            case 17:
                r5 r5Var2 = (r5) this.b;
                j4 j4Var = (j4) this.c;
                is isVar2 = r5Var2.b;
                SQLiteDatabase sQLiteDatabase2 = isVar2.b;
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = sQLiteDatabase2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e) {
                    isVar2.o(e, true);
                }
                org.telegram.messenger.i0.g3(new o0(19, j4Var, longSparseIntArray));
                break;
            case 18:
                ((j4) this.b).a((TL_stories.TL_stories_allStories) this.c);
                break;
            case 19:
                ((j4) this.b).b.f = (LongSparseIntArray) this.c;
                break;
            case 20:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!x0Var.b) {
                    runnable.run();
                    break;
                }
                break;
            case 21:
                Runnable[] runnableArr = (Runnable[]) this.b;
                org.telegram.ui.web.x0 x0Var2 = (org.telegram.ui.web.x0) this.c;
                runnableArr[0] = null;
                ((o0) x0Var2.d).run();
                s5 s5Var = (s5) x0Var2.e;
                if (s5Var != null) {
                    s5Var.R();
                    break;
                }
                break;
            case 22:
                t5 t5Var = (t5) this.b;
                View view = (View) this.c;
                t5Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                dc dcVar = t5Var.H;
                if (dcVar != null) {
                    dcVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                t5Var.N = false;
                t5Var.e();
                break;
            case 23:
                h6 h6Var = (h6) this.b;
                q80 q80Var = (q80) this.c;
                q80 q80Var2 = h6Var.a;
                if (q80Var == q80Var2 && q80Var2 != null) {
                    CharacterStyle characterStyle = q80Var2.i;
                    if (characterStyle instanceof URLSpan) {
                        i6 i6Var = h6Var.v;
                        ji.a aVar = h6Var.c;
                        Objects.requireNonNull(aVar);
                        i6Var.J.H((URLSpan) characterStyle, i6Var, new sg.v(aVar, 18));
                        h6Var.a = null;
                        break;
                    }
                }
                break;
            case 24:
                s6 s6Var = (s6) this.b;
                vh.p2 p2Var2 = (vh.p2) this.c;
                s6Var.d.removeView(p2Var2);
                if (p2Var2 == s6Var.c) {
                    s6Var.b = null;
                    s6Var.invalidate();
                    s6Var.b(false);
                    break;
                }
                break;
            case 25:
                f7 f7Var = (f7) this.b;
                n7 n7Var2 = (n7) this.c;
                o7 o7Var2 = f7Var.d;
                z2 currentPeerView = o7Var2.n0.getCurrentPeerView();
                if (currentPeerView != null && (g2Var = currentPeerView.L0) != null && (t0Var = o7Var2.G0) != null && ((n7) t0Var.c) == n7Var2) {
                    g2Var.invalidate();
                    break;
                }
                break;
            case 26:
                ((e2.j) this.b).accept(this.c);
                break;
            case 27:
                ((u2.w0) this.b).A((c3.b0) this.c);
                break;
            case 28:
                uh.m mVar = (uh.m) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList10 = mVar.f;
                while (true) {
                    if (r7 >= arrayList10.size()) {
                        i11 = -1;
                    } else if (TextUtils.equals(((q4) arrayList10.get(r7)).E, str4)) {
                        i11 = r7;
                    } else {
                        r7++;
                    }
                }
                if (i11 >= 0) {
                    mVar.r.d(str4.hashCode(), i11 + 1);
                    break;
                }
                break;
            default:
                vh.d dVar = (vh.d) this.b;
                org.telegram.ui.Cells.f fVar = (org.telegram.ui.Cells.f) this.c;
                int i23 = dVar.I - 1;
                dVar.I = i23;
                dVar.c(i23, true);
                if (dVar.I > 0) {
                    org.telegram.messenger.i0.h3(dVar.J, 1000L);
                    break;
                } else {
                    dVar.setClickable(true);
                    fVar.run();
                    break;
                }
        }
    }
}
