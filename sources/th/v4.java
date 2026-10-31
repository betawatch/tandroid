package th;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.v8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x4 b;
    public final /* synthetic */ hs c;

    public /* synthetic */ v4(x4 x4Var, hs hsVar, int i10) {
        this.a = i10;
        this.b = x4Var;
        this.c = hsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a6, code lost:
    
        if (r13 == null) goto L70;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        x4 x4Var;
        long j10;
        long j11;
        TLRPC.Peer peer;
        switch (this.a) {
            case 0:
                hs hsVar = this.c;
                x4 x4Var2 = this.b;
                long j12 = x4Var2.d;
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                boolean z10 = true;
                SQLiteCursor sQLiteCursor = null;
                try {
                    sQLiteCursor = hsVar.x(x4Var2.f, x4Var2.e, j12);
                    while (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TL_stories.StoryItem TLdeserialize = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z10), z10);
                            TLdeserialize.dialogId = j12;
                            TLdeserialize.messageId = TLdeserialize.id;
                            jj jjVar = new jj(x4Var2.c, TLdeserialize);
                            ArrayList<TLRPC.PrivacyRule> arrayList5 = TLdeserialize.privacy;
                            x4Var = x4Var2;
                            try {
                                int size = arrayList5.size();
                                j10 = j12;
                                int i10 = 0;
                                while (i10 < size) {
                                    TLRPC.PrivacyRule privacyRule = arrayList5.get(i10);
                                    i10++;
                                    TLRPC.PrivacyRule privacyRule2 = privacyRule;
                                    ArrayList<TLRPC.PrivacyRule> arrayList6 = arrayList5;
                                    if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                                        hashSet2.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                                        hashSet2.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                                    }
                                    arrayList5 = arrayList6;
                                }
                                TL_stories.StoryFwdHeader storyFwdHeader = TLdeserialize.fwd_from;
                                if (storyFwdHeader == null || (peer = storyFwdHeader.from) == null) {
                                    j11 = 0;
                                } else {
                                    j11 = 0;
                                    long o10 = org.telegram.messenger.o5.o(peer);
                                    if (o10 >= 0) {
                                        hashSet2.add(Long.valueOf(o10));
                                    } else {
                                        hashSet3.add(Long.valueOf(-o10));
                                    }
                                }
                                for (int i11 = 0; i11 < TLdeserialize.media_areas.size(); i11++) {
                                    if (TLdeserialize.media_areas.get(i11) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                        hashSet3.add(Long.valueOf(((TL_stories.TL_mediaAreaChannelPost) TLdeserialize.media_areas.get(i11)).channel_id));
                                    }
                                }
                                TLRPC.Peer peer2 = TLdeserialize.from_id;
                                if (peer2 != null) {
                                    long o11 = org.telegram.messenger.o5.o(peer2);
                                    if (o11 >= j11) {
                                        hashSet2.add(Long.valueOf(o11));
                                    } else {
                                        hashSet3.add(Long.valueOf(-o11));
                                    }
                                }
                                jjVar.r0(false);
                                arrayList2.add(jjVar);
                                byteBufferValue.reuse();
                                if (sQLiteCursor.intValue(1) == 1) {
                                    hashSet.add(Integer.valueOf(TLdeserialize.id));
                                }
                                int intValue = sQLiteCursor.intValue(2);
                                if (intValue > 0) {
                                    arrayList.add(Utilities.j(intValue, arrayList.size() - 1, 0), Integer.valueOf(TLdeserialize.id));
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    hsVar.o(th, true);
                                    break;
                                } catch (Throwable th3) {
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th3;
                                }
                            }
                        } else {
                            x4Var = x4Var2;
                            j10 = j12;
                        }
                        x4Var2 = x4Var;
                        j12 = j10;
                        z10 = true;
                    }
                    x4Var = x4Var2;
                    sQLiteCursor.dispose();
                    if (!hashSet2.isEmpty()) {
                        hsVar.o0(arrayList3, hashSet2);
                    }
                    if (!hashSet3.isEmpty()) {
                        hsVar.Q(TextUtils.join(",", hashSet3), arrayList4);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    x4Var = x4Var2;
                }
                sQLiteCursor.dispose();
                org.telegram.messenger.i0.g3(new v8(x4Var, arrayList2, arrayList, arrayList3, arrayList4, hashSet, 25));
                return;
            default:
                x4 x4Var3 = this.b;
                hs hsVar2 = this.c;
                try {
                    SQLiteDatabase sQLiteDatabase = hsVar2.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM profile_stories WHERE dialog_id = " + x4Var3.d + " AND type = " + x4Var3.e).stepThis().dispose();
                } catch (Throwable th5) {
                    hsVar2.o(th5, true);
                }
                org.telegram.messenger.i0.g3(new u4(x4Var3, 3));
                return;
        }
    }
}
