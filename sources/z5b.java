// default package

import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class z5b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z5b(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = obj2;
    }

    private final void a() {
        a5c a5cVar = (a5c) this.d;
        long j = this.b;
        v4c v4cVar = (v4c) this.c;
        synchronized (a5cVar) {
            ArrayList arrayList = (ArrayList) a5cVar.I.get(Long.valueOf(j));
            if (arrayList != null) {
                arrayList.remove(v4cVar);
                if (arrayList.isEmpty()) {
                    a5cVar.I.remove(Long.valueOf(j));
                }
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = a5cVar.getMessagesController().j1(j);
        tL_messages_translateRichMessage.id = v4cVar.b;
        tL_messages_translateRichMessage.to_lang = a5c.D(v4cVar.d);
        int sendRequest = a5cVar.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new p87((Object) a5cVar, (Object) v4cVar, j, (byte) 21));
        synchronized (a5cVar) {
            v4cVar.f = sendRequest;
        }
    }

    private final void b() {
        a5c a5cVar = (a5c) this.d;
        long j = this.b;
        u4c u4cVar = (u4c) this.c;
        synchronized (a5cVar) {
            ArrayList arrayList = (ArrayList) a5cVar.E.get(Long.valueOf(j));
            if (arrayList != null) {
                arrayList.remove(u4cVar);
                if (arrayList.isEmpty()) {
                    a5cVar.E.remove(Long.valueOf(j));
                }
            }
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.flags |= 2;
        ArrayList arrayList2 = u4cVar.c;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Pair pair = (Pair) obj;
            x4c x4cVar = (x4c) pair.first;
            x4c x4cVar2 = (x4c) pair.second;
            TLRPC.TL_textWithEntities tL_textWithEntities = x4cVar.a;
            if (tL_textWithEntities != null && (x4cVar2 == null || x4cVar2.a == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities);
            }
            if (x4cVar.b.size() != (x4cVar2 == null ? 0 : x4cVar2.b.size())) {
                ArrayList arrayList3 = x4cVar.b;
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    tL_messages_translateText.text.add(((TLRPC.PollAnswer) obj2).text);
                }
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = x4cVar.c;
            if (tL_textWithEntities2 != null && (x4cVar2 == null || x4cVar2.c == null)) {
                tL_messages_translateText.text.add(tL_textWithEntities2);
            }
        }
        tL_messages_translateText.to_lang = a5c.D(u4cVar.e);
        int sendRequest = a5cVar.getConnectionsManager().sendRequest(tL_messages_translateText, new p87((Object) a5cVar, (Object) u4cVar, j, (byte) 20));
        synchronized (a5cVar) {
            u4cVar.h = sendRequest;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b6b b6bVar = (b6b) this.d;
                long j = this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                c6b c6bVar = b6bVar.N;
                ar3 ar3Var = c6bVar.w;
                b6bVar.d = true;
                c8b c8bVar = b6bVar.c;
                if (c8bVar.w) {
                    ar3Var.b(c8bVar);
                }
                c8bVar.w = false;
                c8bVar.x = null;
                if (!c8bVar.b0) {
                    ArrayList arrayList = ar3Var.b;
                    if (!c8bVar.u && storyItem.media != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            c8b c8bVar2 = (c8b) obj;
                            if (c8bVar2.g && c8bVar2.f == storyItem.id) {
                                arrayList2.add(c8bVar2);
                            }
                        }
                        ar3Var.c(arrayList2);
                        ar3Var.e(c8bVar);
                        c8bVar.b = Utilities.b.nextLong();
                        zq3 zq3Var = new zq3(c8bVar);
                        c8bVar.g = true;
                        zq3Var.G = true;
                        c8bVar.e = j;
                        zq3Var.I = j;
                        int i2 = storyItem.id;
                        c8bVar.f = i2;
                        zq3Var.H = i2;
                        long j2 = storyItem.expire_date * 1000;
                        c8bVar.J = j2;
                        zq3Var.L = j2;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j3 = document.id;
                            c8bVar.H = j3;
                            zq3Var.J = j3;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j4 = photo.id;
                                c8bVar.I = j4;
                                zq3Var.K = j4;
                            }
                        }
                        arrayList.remove(c8bVar);
                        arrayList.add(0, c8bVar);
                        ar3Var.a(zq3Var);
                    }
                }
                if (b6bVar.b) {
                    return;
                }
                c6bVar.R = false;
                c6bVar.S = null;
                return;
            case 1:
                ((o6b) this.d).l(this.b, (TL_stories.StoryItem) this.c);
                return;
            case 2:
                o6b o6bVar = (o6b) this.d;
                ArrayList arrayList3 = (ArrayList) this.c;
                long j5 = this.b;
                jf7 jf7Var = o6bVar.b;
                SQLiteDatabase sQLiteDatabase = jf7Var.b;
                try {
                    String join = TextUtils.join(", ", arrayList3);
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j5 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    jf7Var.n(th, true);
                    return;
                }
            case 3:
                s6b s6bVar = (s6b) this.d;
                View view = (View) this.c;
                long j6 = this.b;
                view.invalidate();
                uc7.s1(s6bVar.a).O1().g0(j6, false);
                return;
            case 4:
                ((r9b) this.d).e(this.b, ((TLRPC.ChatFull) this.c).participants);
                return;
            case 5:
                qyb qybVar = (qyb) this.d;
                long j7 = this.b;
                TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified = (TLRPC.TL_messages_savedDialogsNotModified) this.c;
                qybVar.c.put(j7, 0);
                if ((qybVar.l(j7) != null ? r4.size() : 0L) >= tL_messages_savedDialogsNotModified.count) {
                    qybVar.d.put(j7, 1);
                    qybVar.getUserConfig().j().edit().putBoolean("topics_end_reached_" + j7, true).apply();
                }
                qybVar.getNotificationCenter().k(jn7.t5, Long.valueOf(j7), Boolean.FALSE);
                return;
            case 6:
                qyb qybVar2 = (qyb) this.d;
                long j8 = this.b;
                TLObject tLObject = (TLObject) this.c;
                qybVar2.n.delete(j8);
                if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
                    ArrayList<Long> arrayList4 = ((TLRPC.TL_messages_forumTopics) tLObject).top_icons;
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    qybVar2.f.k(j8, arrayList4);
                    qybVar2.h.put(j8, System.currentTimeMillis());
                    qybVar2.getNotificationCenter().k(jn7.t5, Long.valueOf(j8), Boolean.FALSE);
                    return;
                }
                return;
            case 7:
                qyb qybVar3 = (qyb) this.d;
                ArrayList arrayList5 = (ArrayList) this.c;
                long j9 = this.b;
                zh6 zh6Var = qybVar3.e;
                ArrayList arrayList6 = null;
                boolean z = false;
                for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList5.get(i3);
                    zh6 zh6Var2 = (zh6) qybVar3.b.f(j9);
                    if (zh6Var2 != null) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) zh6Var2.f(tL_forumTopic.id);
                        if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                            zh6Var.l(qyb.p(tL_forumTopic2.top_message, j9));
                            TLRPC.Message message = tL_forumTopic.topMessage;
                            int i4 = message.id;
                            tL_forumTopic2.top_message = i4;
                            tL_forumTopic2.topMessage = message;
                            tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                            zh6Var.k(qyb.p(i4, j9), tL_forumTopic2);
                            z = true;
                        } else if (tL_forumTopic.top_message == -1 || tL_forumTopic.topMessage == null) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(tL_forumTopic);
                        }
                    }
                }
                if (z) {
                    qybVar3.y(j9, true);
                }
                if (arrayList6 != null) {
                    qybVar3.v(j9, arrayList6, null);
                    return;
                }
                return;
            case 8:
                a();
                return;
            case 9:
                b();
                return;
            case 10:
                ((VideoCapturerDevice) this.d).lambda$init$5(this.b, (String) this.c);
                return;
            case 11:
                ((VideoCapturerDevice) this.d).lambda$init$2(this.b, (Point) this.c);
                return;
            case 12:
                ((VideoFramesRewinder) this.d).lambda$new$1((ArrayList) this.c, this.b);
                return;
            case 13:
                k7b k7bVar = (k7b) this.d;
                Object obj2 = this.c;
                long j10 = this.b;
                vfc vfcVar = (vfc) k7bVar.c;
                String str = gcc.a;
                s64 s64Var = ((n64) vfcVar).a;
                ea3 ea3Var = s64Var.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 26, new q72(U, obj2, j10));
                if (s64Var.T == obj2) {
                    s64Var.m.e(26, new su3((byte) 17));
                    return;
                }
                return;
            default:
                lyc lycVar = (lyc) this.d;
                kyc kycVar = (kyc) this.c;
                long j11 = this.b;
                if (((kyc) lycVar.c) == kycVar) {
                    iyc iycVar = (iyc) lycVar.e;
                    if (iycVar != null) {
                        hl.r(iycVar);
                        lycVar.e = null;
                    }
                    synchronized (pyc.y) {
                        pyc pycVar = pyc.A;
                        if (pycVar != null) {
                            pycVar.q();
                            pyc.A = null;
                        }
                    }
                    lycVar.c = null;
                    kycVar.c.run(j11);
                    lycVar.L();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ z5b(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.b = j;
    }
}
