// default package

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ImportingService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class r97 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r97(hva hvaVar, TLObject tLObject, oc7 oc7Var, TLRPC.TL_error tL_error, long j) {
        this.a = (byte) 19;
        this.e = hvaVar;
        this.c = tLObject;
        this.d = oc7Var;
        this.f = tL_error;
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196 A[LOOP:4: B:85:0x0190->B:87:0x0196, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i;
        int i2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i3;
        int i4;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        int i5;
        TLRPC.TL_textWithEntities tL_textWithEntities4;
        TLRPC.TL_textWithEntities tL_textWithEntities5;
        b3c b3cVar = (b3c) this.d;
        v2c v2cVar = (v2c) this.e;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        long j = this.b;
        synchronized (b3cVar) {
            arrayList = v2cVar.b;
            arrayList2 = v2cVar.d;
            arrayList3 = v2cVar.c;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            ArrayList<TLRPC.TL_textWithEntities> arrayList4 = ((TLRPC.TL_messages_translateResult) tLObject).result;
            ArrayList arrayList5 = new ArrayList();
            int size = arrayList3.size();
            int i6 = 0;
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList3.get(i7);
                int i8 = i7 + 1;
                Pair pair = (Pair) obj;
                y2c y2cVar = (y2c) pair.first;
                y2c y2cVar2 = (y2c) pair.second;
                y2c y2cVar3 = new y2c();
                if (y2cVar2 != null && (tL_textWithEntities5 = y2cVar2.a) != null) {
                    y2cVar3.a = tL_textWithEntities5;
                } else if (y2cVar.a != null) {
                    if (i6 >= arrayList4.size()) {
                        tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    } else {
                        tL_textWithEntities = arrayList4.get(i6);
                        i6++;
                    }
                    y2cVar3.a = s1c.L0(y2cVar.a, tL_textWithEntities);
                }
                if (y2cVar.b.size() != (y2cVar2 == null ? 0 : y2cVar2.b.size())) {
                    ArrayList arrayList6 = y2cVar.b;
                    int size2 = arrayList6.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        Object obj2 = arrayList6.get(i9);
                        i9++;
                        int i10 = size;
                        TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) obj2;
                        int i11 = i8;
                        if (i6 >= arrayList4.size()) {
                            tL_textWithEntities4 = new TLRPC.TL_textWithEntities();
                            i5 = i6;
                        } else {
                            i5 = i6 + 1;
                            tL_textWithEntities4 = arrayList4.get(i6);
                        }
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        tL_pollAnswer.text = tL_textWithEntities4;
                        tL_pollAnswer.option = pollAnswer.option;
                        y2cVar3.b.add(tL_pollAnswer);
                        i8 = i11;
                        size = i10;
                        i6 = i5;
                    }
                    i3 = size;
                    i4 = i8;
                } else {
                    i3 = size;
                    i4 = i8;
                    if (y2cVar2 != null) {
                        y2cVar3.b = y2cVar2.b;
                    }
                }
                if (y2cVar2 != null && (tL_textWithEntities3 = y2cVar2.c) != null) {
                    y2cVar3.c = tL_textWithEntities3;
                } else if (y2cVar.c != null) {
                    if (i6 >= arrayList4.size()) {
                        tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    } else {
                        int i12 = i6 + 1;
                        TLRPC.TL_textWithEntities tL_textWithEntities6 = arrayList4.get(i6);
                        i6 = i12;
                        tL_textWithEntities2 = tL_textWithEntities6;
                    }
                    y2cVar3.c = s1c.L0(y2cVar.c, tL_textWithEntities2);
                }
                arrayList5.add(y2cVar3);
                i7 = i4;
                size = i3;
            }
            int min = Math.min(arrayList2.size(), arrayList5.size());
            for (int i13 = 0; i13 < min; i13++) {
                ((lac) arrayList2.get(i13)).a((Integer) arrayList.get(i13), (y2c) arrayList5.get(i13), v2cVar.e);
            }
        } else {
            if (tL_error != null) {
                if ("TO_LANG_INVALID".equals(tL_error.text)) {
                    b3cVar.K(j, false);
                    nm7.e().k(nm7.T4, 1, jb6.M0(2131743633, null));
                } else if ("QUOTA_EXCEEDED".equals(tL_error.text)) {
                    i = 0;
                    nm7.e().k(nm7.T4, 1, jb6.M0(2131743634, null));
                    for (i2 = i; i2 < arrayList2.size(); i2++) {
                        ((lac) arrayList2.get(i2)).a((Integer) arrayList.get(i2), null, v2cVar.e);
                    }
                    synchronized (b3cVar) {
                        for (int i14 = i; i14 < arrayList.size(); i14++) {
                            b3cVar.x.remove(arrayList.get(i14));
                        }
                    }
                    return;
                }
            }
            i = 0;
            while (i2 < arrayList2.size()) {
            }
            synchronized (b3cVar) {
            }
        }
        i = 0;
        synchronized (b3cVar) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x03a6, code lost:
    
        if (r2.collection_id.contains(java.lang.Integer.valueOf(r10.collection_id)) != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x097b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLitePreparedStatement sQLitePreparedStatement;
        byte b;
        ava avaVar;
        a31 a31Var;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        ArrayList arrayList;
        String str;
        String str2;
        boolean z;
        String str3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i = 3;
        String str4 = null;
        byte b2 = 2;
        byte b3 = 0;
        byte b4 = 1;
        switch (this.a) {
            case 0:
                oc7 oc7Var = (oc7) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) this.e;
                qac qacVar = (qac) this.c;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) this.f;
                long j = this.b;
                oc7Var.d4(updates.users, false);
                oc7Var.X3(updates.chats, false);
                if (qacVar != null) {
                    qacVar.a(tL_messages_invitedUsers);
                    return;
                } else {
                    ik.f(oc7Var.currentAccount, oc7Var.L0(Long.valueOf(j)), tL_messages_invitedUsers);
                    return;
                }
            case 1:
                ku0 ku0Var = (ku0) this.d;
                he heVar = (he) this.e;
                TLObject tLObject = (TLObject) this.f;
                long j2 = this.b;
                qac qacVar2 = (qac) this.c;
                heVar.dismiss();
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    oc7.r1(ku0Var.a).d4(connectedstarrefbots.users, false);
                    for (int i2 = 0; i2 < connectedstarrefbots.connected_bots.size(); i2++) {
                        if (connectedstarrefbots.connected_bots.get(i2).bot_id == j2 && !connectedstarrefbots.connected_bots.get(i2).revoked) {
                            qacVar2.a(connectedstarrefbots.connected_bots.get(i2));
                            return;
                        }
                    }
                }
                qacVar2.a(null);
                return;
            case 2:
                wg2 wg2Var = (wg2) this.d;
                long j3 = this.b;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.e;
                String str5 = (String) this.c;
                TLObject tLObject2 = (TLObject) this.f;
                ke2 ke2Var = new ke2(j3, wg2Var.N, null, wg2Var.E, tL_chatBannedRights, str5, 1, true, false, null);
                ke2Var.Y0 = new hg2(wg2Var, tLObject2);
                wg2Var.presentFragment(ke2Var);
                return;
            case 3:
                wg2 wg2Var2 = (wg2) this.d;
                long j4 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str6 = (String) this.c;
                TLObject tLObject3 = (TLObject) this.f;
                ke2 ke2Var2 = new ke2(j4, wg2Var2.N, tL_chatAdminRights, null, null, str6, 0, true, false, null);
                ke2Var2.Y0 = new ig2(wg2Var2, tLObject3);
                wg2Var2.presentFragment(ke2Var2);
                return;
            case 4:
                ((ConferenceCall) this.d).lambda$requestLastBlock$2(this.b, (TLObject) this.e, (TLRPC.TL_error) this.c, (Runnable) this.f);
                return;
            case 5:
                fl3 fl3Var = (fl3) this.d;
                cf7 cf7Var = (cf7) this.e;
                ArrayList arrayList4 = (ArrayList) this.c;
                long j5 = this.b;
                String str7 = (String) this.f;
                SQLiteDatabase sQLiteDatabase = cf7Var.b;
                try {
                    sQLiteDatabase.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                    SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        try {
                            executeFast.requery();
                            executeFast.bindLong(1, ((Long) arrayList4.get(i3)).longValue());
                            executeFast.bindLong(2, j5);
                            executeFast.bindString(3, str7);
                            executeFast.bindInteger(4, i3);
                            executeFast.step();
                        } catch (Exception e) {
                            e = e;
                            sQLitePreparedStatement = executeFast;
                            b = 1;
                            try {
                                fc4.g(e, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                gm.c3(new el3(fl3Var, b));
                                return;
                            } catch (Throwable th) {
                                th = th;
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLitePreparedStatement = executeFast;
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    if (executeFast != null) {
                        executeFast.dispose();
                    }
                    b = 1;
                } catch (Exception e2) {
                    e = e2;
                    sQLitePreparedStatement = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement = null;
                }
                gm.c3(new el3(fl3Var, b));
                return;
            case 6:
                fl3 fl3Var2 = (fl3) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                long j6 = this.b;
                String str8 = (String) this.c;
                el3 el3Var = (el3) this.f;
                oc7.r1(fl3Var2.a).d4(arrayList5, true);
                fl3Var2.h.addAll(arrayList5);
                fl3Var2.f = j6;
                fl3Var2.g = str8;
                fl3Var2.e = TextUtils.isEmpty(str8);
                fl3Var2.d = true;
                el3Var.run();
                return;
            case 7:
                ux4 ux4Var = (ux4) this.d;
                ava avaVar2 = (ava) this.e;
                long j7 = this.b;
                qac qacVar3 = (qac) this.c;
                Context context = (Context) this.f;
                a31 a31Var2 = ux4Var.e2;
                int i4 = 0;
                while (i4 < 2) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) gm.S2(i4 == 1 ? jb6.M0(2131749896, str4) : jb6.a0(str4, str4, 2131749892, ux4Var.Y1)));
                    spannableStringBuilder.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    int i5 = 0;
                    while (i5 < avaVar2.l.size() && hashSet.size() < i) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) avaVar2.l.get(i5);
                        if (savedStarGift == null || (starGift = savedStarGift.gift) == null || (document = starGift.getDocument()) == null) {
                            avaVar = avaVar2;
                            a31Var = a31Var2;
                        } else {
                            avaVar = avaVar2;
                            a31Var = a31Var2;
                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                        }
                        i5++;
                        avaVar2 = avaVar;
                        a31Var2 = a31Var;
                    }
                    ava avaVar3 = avaVar2;
                    a31 a31Var3 = a31Var2;
                    if (hashSet2.size() > 0) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) jb6.a0(null, null, 2131749890, pg3.s(j7)).replaceAll(" ", " "));
                        spannableStringBuilder2.append((CharSequence) " ");
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            TLRPC.Document document2 = (TLRPC.Document) it.next();
                            spannableStringBuilder2.append((CharSequence) "\u2060e");
                            spannableStringBuilder2.setSpan(new gn(document2, a31Var3.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                        }
                        spannableStringBuilder2.append((CharSequence) " >");
                        spannableStringBuilder.append((CharSequence) gm.D2(gm.i2(spannableStringBuilder2, new of2(ux4Var, qacVar3, j7, (byte) 23)), true));
                    } else {
                        spannableStringBuilder.append((CharSequence) gm.D2(gm.i2(jb6.M0(2131749891, null), new dh1(context, (byte) 2)), true));
                    }
                    a31 a31Var4 = i4 == 0 ? a31Var3 : ux4Var.f2;
                    a31Var4.setText(spannableStringBuilder);
                    a31Var4.setMaxWidth(hg5.a(a31Var4.getText(), a31Var4.getPaint()));
                    i4++;
                    avaVar2 = avaVar3;
                    a31Var2 = a31Var3;
                    i = 3;
                    str4 = null;
                }
                return;
            case 8:
                he heVar2 = (he) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                long j8 = this.b;
                j5 j5Var = (j5) this.c;
                ue7 ue7Var = (ue7) this.f;
                try {
                    heVar2.dismiss();
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
                if (tLObject4 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject4;
                    wv5.C1 = joinaspeers.peers;
                    wv5.E1 = j8;
                    wv5.D1 = SystemClock.elapsedRealtime();
                    int i6 = j5Var.a;
                    wv5.F1 = i6;
                    oc7.r1(i6).X3(joinaspeers.chats, false);
                    oc7.r1(j5Var.a).d4(joinaspeers.users, false);
                    ue7Var.z(joinaspeers.peers.size() == 1);
                    return;
                }
                return;
            case 9:
                oc7 oc7Var2 = (oc7) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                long j9 = this.b;
                lc7 lc7Var = (lc7) this.c;
                Integer num = (Integer) this.f;
                if (arrayList6 == null) {
                    oc7Var2.t1.l(j9);
                    return;
                }
                oc7Var2.getClass();
                lc7Var.c = SystemClock.elapsedRealtime();
                lc7Var.d = false;
                lc7Var.a = arrayList6;
                lc7Var.b = num;
                oc7Var2.getNotificationCenter().k(15, Long.valueOf(j9), arrayList6);
                return;
            case 10:
                oc7 oc7Var3 = (oc7) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                long j10 = this.b;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) this.c;
                TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = (TLRPC.TL_messages_getSavedReactionTags) this.f;
                if (tLObject5 instanceof TLRPC.TL_messages_savedReactionsTags) {
                    TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) tLObject5;
                    oc7Var3.Q4.k(tL_messages_savedReactionsTags, j10);
                    oc7Var3.getNotificationCenter().k(nm7.j3, Long.valueOf(j10));
                    oc7Var3.B4(j10, tL_messages_savedReactionsTags);
                    return;
                }
                if ((tLObject5 instanceof TLRPC.TL_messages_savedReactionsTagsNotModified) && messages_savedreactiontags == null && tL_messages_getSavedReactionTags.hash == 0) {
                    TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags2 = new TLRPC.TL_messages_savedReactionsTags();
                    oc7Var3.Q4.k(tL_messages_savedReactionsTags2, j10);
                    oc7Var3.getNotificationCenter().k(nm7.j3, Long.valueOf(j10));
                    oc7Var3.B4(j10, tL_messages_savedReactionsTags2);
                    return;
                }
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                jo6 jo6Var = (jo6) this.e;
                long j11 = this.b;
                String str9 = (String) this.c;
                Bitmap bitmap = (Bitmap) this.f;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (jo6Var.g != null) {
                    try {
                        new File(jo6Var.g).delete();
                    } catch (Exception e4) {
                        fc4.g(e4, true);
                    }
                }
                jo6Var.d = j11;
                jo6Var.g = str9;
                jo6Var.e = null;
                jo6Var.f = null;
                photoViewer.p5.b.setLoading(false);
                pb8 pb8Var = photoViewer.d;
                if (pb8Var != null) {
                    pb8Var.Y(photoViewer.O4);
                }
                y98 y98Var = photoViewer.h1;
                if (y98Var != null) {
                    y98Var.setImage(bitmap);
                }
                photoViewer.o2(0);
                CheckBox checkBox = photoViewer.O0;
                if (checkBox.y) {
                    return;
                }
                checkBox.callOnClick();
                return;
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ArrayList arrayList7 = (ArrayList) this.c;
                boolean[] zArr2 = (boolean[]) this.f;
                long j12 = this.b;
                RectF rectF = ProfileActivity.e7;
                zArr[0] = true;
                gm.r(profileActivity.I5);
                for (int i7 = 0; i7 < arrayList7.size(); i7++) {
                    ((TL_stories.StoryItem) arrayList7.get(i7)).pinned = zArr2[i7];
                }
                profileActivity.getMessagesController().N1().q0(j12, arrayList7, false);
                return;
            case 13:
                a6a a6aVar = (a6a) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                long j13 = this.b;
                Uri uri = (Uri) this.c;
                final e16 e16Var = (e16) this.f;
                String str10 = "txt";
                if (arrayList8 == null) {
                    arrayList8 = new ArrayList();
                }
                r5a r5aVar = new r5a(a6aVar);
                r5aVar.b = arrayList8;
                r5aVar.j = j13;
                r5aVar.g = a6aVar.getMessagesController().i1(j13);
                HashMap hashMap = new HashMap();
                int size = arrayList8.size();
                int i8 = 0;
                while (i8 < size + 1) {
                    Uri uri2 = i8 == 0 ? uri : (Uri) arrayList8.get(i8 - 1);
                    if (uri2 == null || gm.G1(uri2, b3)) {
                        arrayList = arrayList8;
                        str = str10;
                        if (i8 == 0) {
                            final byte b5 = 0;
                            gm.c3(new Runnable() { // from class: j5a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b5;
                                    e16 e16Var2 = e16Var;
                                    switch (b6) {
                                        case 0:
                                            e16Var2.run(0L);
                                            break;
                                        case 1:
                                            e16Var2.run(0L);
                                            break;
                                        default:
                                            Toast.makeText(a.b, jb6.M0(2131749007, null), 0).show();
                                            e16Var2.run(0L);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    } else {
                        String q = bc4.q(MediaController.v(uri));
                        if (q == null || !q.endsWith(".zip")) {
                            str = str10;
                            str2 = str;
                        } else {
                            str2 = "zip";
                            str = str10;
                        }
                        String o = MediaController.o(-1L, uri2, str2);
                        if ("zip".equals(str2)) {
                            File file = new File(o);
                            try {
                                ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
                                try {
                                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                                    while (true) {
                                        if (nextEntry == null) {
                                            arrayList = arrayList8;
                                        } else {
                                            String name = nextEntry.getName();
                                            if (name == null) {
                                                nextEntry = zipInputStream.getNextEntry();
                                            } else {
                                                int lastIndexOf = name.lastIndexOf("/");
                                                if (lastIndexOf >= 0) {
                                                    name = name.substring(lastIndexOf + 1);
                                                }
                                                if (name.endsWith(".txt")) {
                                                    File p = MediaController.p(name);
                                                    o = p.getAbsolutePath();
                                                    FileOutputStream fileOutputStream = new FileOutputStream(p);
                                                    byte[] bArr = new byte[1024];
                                                    while (true) {
                                                        int read = zipInputStream.read(bArr);
                                                        arrayList = arrayList8;
                                                        if (read > 0) {
                                                            try {
                                                                fileOutputStream.write(bArr, 0, read);
                                                                arrayList8 = arrayList;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                Throwable th5 = th;
                                                                try {
                                                                    zipInputStream.close();
                                                                } catch (Throwable th6) {
                                                                    th5.addSuppressed(th6);
                                                                }
                                                                throw th5;
                                                                break;
                                                            }
                                                        } else {
                                                            fileOutputStream.close();
                                                        }
                                                    }
                                                } else {
                                                    nextEntry = zipInputStream.getNextEntry();
                                                    arrayList8 = arrayList8;
                                                }
                                            }
                                        }
                                    }
                                    zipInputStream.closeEntry();
                                    try {
                                        zipInputStream.close();
                                        z = true;
                                    } catch (IOException e5) {
                                        e = e5;
                                        z = true;
                                        try {
                                            fc4.g(e, true);
                                        } catch (Exception e6) {
                                            e = e6;
                                            fc4.g(e, z);
                                            file.delete();
                                            if (o == null) {
                                            }
                                            i8++;
                                            str10 = str;
                                            arrayList8 = arrayList;
                                            b3 = 0;
                                        }
                                        file.delete();
                                        if (o == null) {
                                        }
                                        i8++;
                                        str10 = str;
                                        arrayList8 = arrayList;
                                        b3 = 0;
                                    } catch (Exception e7) {
                                        e = e7;
                                        z = true;
                                        fc4.g(e, z);
                                        file.delete();
                                        if (o == null) {
                                        }
                                        i8++;
                                        str10 = str;
                                        arrayList8 = arrayList;
                                        b3 = 0;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    arrayList = arrayList8;
                                }
                            } catch (IOException e8) {
                                e = e8;
                                arrayList = arrayList8;
                            } catch (Exception e9) {
                                e = e9;
                                arrayList = arrayList8;
                            }
                            try {
                                file.delete();
                            } catch (Exception e10) {
                                fc4.g(e10, z);
                            }
                        } else {
                            arrayList = arrayList8;
                        }
                        if (o == null) {
                            File file2 = new File(o);
                            if (file2.exists()) {
                                long length = file2.length();
                                if (length != 0) {
                                    r5aVar.h += length;
                                    if (i8 != 0) {
                                        r5aVar.f.add(o);
                                    } else {
                                        if (length > 33554432) {
                                            file2.delete();
                                            final byte b6 = 2;
                                            gm.c3(new Runnable() { // from class: j5a
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b62 = b6;
                                                    e16 e16Var2 = e16Var;
                                                    switch (b62) {
                                                        case 0:
                                                            e16Var2.run(0L);
                                                            break;
                                                        case 1:
                                                            e16Var2.run(0L);
                                                            break;
                                                        default:
                                                            Toast.makeText(a.b, jb6.M0(2131749007, null), 0).show();
                                                            e16Var2.run(0L);
                                                            break;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        r5aVar.a = o;
                                    }
                                    r5aVar.c.add(o);
                                    hashMap.put(o, r5aVar);
                                }
                            }
                            if (i8 == 0) {
                                final byte b7 = 1;
                                gm.c3(new Runnable() { // from class: j5a
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b62 = b7;
                                        e16 e16Var2 = e16Var;
                                        switch (b62) {
                                            case 0:
                                                e16Var2.run(0L);
                                                break;
                                            case 1:
                                                e16Var2.run(0L);
                                                break;
                                            default:
                                                Toast.makeText(a.b, jb6.M0(2131749007, null), 0).show();
                                                e16Var2.run(0L);
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                    i8++;
                    str10 = str;
                    arrayList8 = arrayList;
                    b3 = 0;
                }
                gm.c3(new r97((Object) a6aVar, (Object) hashMap, j13, (Object) r5aVar, (Object) e16Var, (byte) 14));
                return;
            case 14:
                a6a a6aVar2 = (a6a) this.d;
                HashMap hashMap2 = (HashMap) this.e;
                long j14 = this.b;
                r5a r5aVar2 = (r5a) this.c;
                e16 e16Var2 = (e16) this.f;
                a6aVar2.y.putAll(hashMap2);
                a6aVar2.E.k(r5aVar2, j14);
                a6aVar2.getFileLoader().g0(r5aVar2.a, false, true, 0L, 67108864, true);
                a6aVar2.getNotificationCenter().k(nm7.v1, Long.valueOf(j14));
                e16Var2.run(j14);
                try {
                    a.b.startService(new Intent(a.b, (Class<?>) ImportingService.class));
                    return;
                } catch (Throwable th8) {
                    fc4.g(th8, true);
                    return;
                }
            case 15:
                wsa wsaVar = (wsa) this.d;
                k11 k11Var = (k11) this.e;
                TLObject tLObject6 = (TLObject) this.c;
                long j15 = this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                k11Var.c(false);
                if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null) {
                        wsaVar.j().g0(tL_error, false);
                        return;
                    } else {
                        wsaVar.j().t(jb6.M0(2131743566, null), null).k(false);
                        return;
                    }
                }
                int i9 = wsaVar.a;
                if (j15 >= 0) {
                    TLRPC.UserFull X1 = oc7.r1(i9).X1(j15);
                    if (X1 != null) {
                        int max = Math.max(0, X1.stargifts_count - 1);
                        X1.stargifts_count = max;
                        if (max <= 0) {
                            X1.flags2 &= -257;
                        }
                    }
                } else {
                    TLRPC.ChatFull M0 = oc7.r1(i9).M0(-j15);
                    if (M0 != null) {
                        int max2 = Math.max(0, M0.stargifts_count - 1);
                        M0.stargifts_count = max2;
                        if (max2 <= 0) {
                            M0.flags2 &= -262145;
                        }
                    }
                }
                TL_stars.SavedStarGift savedStarGift2 = wsaVar.A2;
                int i10 = wsaVar.a;
                if (savedStarGift2 != null) {
                    jva v = jva.v(i10, false);
                    TL_stars.SavedStarGift savedStarGift3 = wsaVar.A2;
                    if (savedStarGift3 != null) {
                        ava D = v.D(j15, false);
                        if (D != null) {
                            D.m(savedStarGift3);
                        }
                        yua yuaVar = (yua) v.K.get(j15);
                        if (yuaVar != null) {
                            ArrayList arrayList9 = yuaVar.e;
                            int size2 = arrayList9.size();
                            boolean z2 = false;
                            int i11 = 0;
                            while (i11 < size2) {
                                Object obj = arrayList9.get(i11);
                                i11++;
                                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                ava e11 = yuaVar.e(tL_starGiftCollection.collection_id);
                                boolean z3 = e11 != null && e11.m(savedStarGift3);
                                if (!z3) {
                                    z2 = z2;
                                    break;
                                }
                                tL_starGiftCollection.gifts_count = Math.max(0, tL_starGiftCollection.gifts_count - 1);
                                z2 = true;
                                if (z3) {
                                    yuaVar.n(tL_starGiftCollection.collection_id);
                                }
                            }
                            ava avaVar4 = yuaVar.g;
                            if (avaVar4 != null) {
                                avaVar4.m(savedStarGift3);
                            }
                            if (z2) {
                                yuaVar.j();
                                nm7.f(yuaVar.a).k(nm7.J3, Long.valueOf(yuaVar.b), yuaVar);
                            }
                        }
                    }
                } else {
                    jva.v(i10, false).M(j15);
                }
                wsaVar.dismiss();
                gm.c3(new bo6((byte) 27));
                return;
            case 16:
                jva jvaVar = (jva) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                k47 k47Var = (k47) this.c;
                long j16 = this.b;
                Runnable runnable = (Runnable) this.f;
                int i12 = jvaVar.a;
                if (!(tLObject7 instanceof TLRPC.TL_messages_messages)) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject7;
                oc7.r1(i12).d4(tL_messages_messages.users, false);
                oc7.r1(i12).X3(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                } else {
                    k47Var.k = tL_messages_messages.messages.get(0);
                    jvaVar.j0(k47Var, j16, runnable, true);
                    return;
                }
            case 17:
                jva jvaVar2 = (jva) this.d;
                jac jacVar = (jac) this.e;
                long j17 = this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (jvaVar2.e) {
                    jvaVar2.e(j17, tLObject8, tL_textWithEntities, jacVar);
                    return;
                } else {
                    jva.c("NO_BALANCE");
                    jacVar.a(Boolean.FALSE, null);
                    return;
                }
            case 18:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.e;
                SpannableStringBuilder spannableStringBuilder3 = (SpannableStringBuilder) this.c;
                long j18 = this.b;
                String str11 = (String) this.f;
                gm.d3(new gs8(profileActivity2, b2), 200L);
                c41 b0 = c41.b0(profileActivity2);
                TLRPC.Document document3 = starGift2.sticker;
                String M02 = jb6.M0(2131744798, null);
                if (spannableStringBuilder3 == null) {
                    spannableStringBuilder3 = gm.S2(jb6.G((int) j18, "StarsGiftCompletedChannelText", str11));
                }
                b0.s(document3, M02, spannableStringBuilder3).k(false);
                return;
            case 19:
                hva hvaVar = (hva) this.e;
                TLObject tLObject9 = (TLObject) this.c;
                oc7 oc7Var4 = (oc7) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                long j19 = this.b;
                hvaVar.getClass();
                if (tLObject9 != null) {
                    Utilities.d.c(new a77(oc7Var4, tLObject9, (byte) 7));
                    return;
                }
                if (tL_error2 != null) {
                    hvaVar.b.f((int) (-hvaVar.h), hvaVar.c(), hvaVar.g);
                    nm7.f(hvaVar.q.a).k(nm7.o1, Long.valueOf(k47.B0(hvaVar.b.k)), Integer.valueOf(hvaVar.b.e1()), hvaVar.b.k.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        long j20 = hvaVar.a.a;
                        yv1 yv1Var = hvaVar.c;
                        if (j20 >= 0) {
                            str3 = m9c.l(yv1Var.getMessagesController().W1(Long.valueOf(hvaVar.a.a)));
                        } else {
                            TLRPC.Chat L0 = yv1Var.getMessagesController().L0(Long.valueOf(-hvaVar.a.a));
                            str3 = L0 == null ? "" : L0.title;
                        }
                        String str12 = str3;
                        Context parentActivity = hvaVar.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.H1;
                        }
                        if (parentActivity == null) {
                            parentActivity = a.b;
                        }
                        new dxa(parentActivity, hvaVar.c.getResourceProvider(), j19, 5, str12, new gva(hvaVar, j19, b4), 0L).show();
                    }
                    hvaVar.q.P(false);
                    hvaVar.q.L();
                    return;
                }
                return;
            case 20:
                eya eyaVar = (eya) this.d;
                long j21 = this.b;
                jva jvaVar3 = (jva) this.e;
                k47 k47Var2 = (k47) this.c;
                yv1 yv1Var2 = (yv1) this.f;
                v86 v86Var = eyaVar.L1;
                long j22 = eyaVar.y1;
                if (v86Var == null) {
                    hva b02 = jvaVar3.b0(k47Var2, yv1Var2, j21, false, true, Long.valueOf(j22));
                    if (b02 != null) {
                        gm.c3(new uva(eyaVar, b02, b4));
                        return;
                    }
                    return;
                }
                int intValue = v86Var.a.f(Long.valueOf(j21)).intValue();
                eyaVar.K1 = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    eyaVar.dismiss();
                    return;
                } else {
                    gm.c3(new oxa(eyaVar, b3));
                    return;
                }
            case 21:
                b3c b3cVar = (b3c) this.d;
                w2c w2cVar = (w2c) this.e;
                TLObject tLObject10 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f;
                long j23 = this.b;
                synchronized (b3cVar) {
                    arrayList2 = w2cVar.b;
                    arrayList3 = w2cVar.c;
                }
                if (tLObject10 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    ArrayList<TL_iv.RichMessage> arrayList10 = ((TLRPC.TL_messages_translatedRichMessage) tLObject10).result;
                    int min = Math.min(arrayList3.size(), arrayList10.size());
                    for (int i13 = 0; i13 < min; i13++) {
                        ((lac) arrayList3.get(i13)).a((Integer) arrayList2.get(i13), arrayList10.get(i13), w2cVar.d);
                    }
                } else {
                    if (tL_error3 != null) {
                        if ("TO_LANG_INVALID".equals(tL_error3.text)) {
                            b3cVar.K(j23, false);
                            nm7.e().k(nm7.T4, 1, jb6.M0(2131743633, null));
                        } else if ("QUOTA_EXCEEDED".equals(tL_error3.text)) {
                            nm7.e().k(nm7.T4, 1, jb6.M0(2131743634, null));
                        }
                    }
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        ((lac) arrayList3.get(i14)).a((Integer) arrayList2.get(i14), null, w2cVar.d);
                    }
                }
                synchronized (b3cVar) {
                    for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                        b3cVar.x.remove(arrayList2.get(i15));
                    }
                }
                return;
            case 22:
                a();
                return;
            default:
                boolean[] zArr3 = (boolean[]) this.d;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.e;
                int[] iArr = (int[]) this.c;
                cyc cycVar = (cyc) this.f;
                long j24 = this.b;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                connectionsManager.cancelRequest(iArr[0], true);
                cycVar.b(3, null, j24);
                return;
        }
    }

    public /* synthetic */ r97(ku0 ku0Var, he heVar, TLObject tLObject, long j, qac qacVar) {
        this.a = (byte) 1;
        this.d = ku0Var;
        this.e = heVar;
        this.f = tLObject;
        this.b = j;
        this.c = qacVar;
    }

    public /* synthetic */ r97(Object obj, long j, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ r97(Object obj, Object obj2, long j, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = j;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ r97(Object obj, Object obj2, Object obj3, long j, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = j;
        this.f = obj4;
    }

    public /* synthetic */ r97(Object obj, Object obj2, Object obj3, Object obj4, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
        this.b = j;
    }
}
