// default package

import android.content.Context;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class xa7 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ xa7(oc7 oc7Var, long j, int i, int i2, long j2, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z, ho1 ho1Var) {
        this.h = oc7Var;
        this.c = j;
        this.b = i;
        this.e = i2;
        this.d = j2;
        this.n = tL_messages_affectedHistory;
        this.f = z;
        this.r = ho1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (0 == 0) goto L20;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b = this.a;
        Object obj = this.r;
        Object obj2 = this.n;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                final oc7 oc7Var = (oc7) obj3;
                final long j = this.c;
                final int i = this.b;
                final int i2 = this.e;
                final TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) obj2;
                final ho1 ho1Var = (ho1) obj;
                cf7 messagesStorage = oc7Var.getMessagesStorage();
                messagesStorage.getClass();
                final ArrayList arrayList = new ArrayList();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = messagesStorage.b;
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT mid FROM messages_v2 WHERE uid = " + j + " AND date >= " + i + " AND date <= " + i2, new Object[0]);
                        while (sQLiteCursor.next()) {
                            try {
                                arrayList.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                            } catch (Exception e) {
                                messagesStorage.n(e, true);
                            }
                        }
                        sQLiteCursor.dispose();
                    } catch (Throwable th) {
                        if (0 != 0) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    messagesStorage.n(e2, true);
                    break;
                }
                sQLiteCursor.dispose();
                oc7Var.getMessagesStorage().M0(j, arrayList, false, true, 0, 0);
                oc7Var.getMessagesStorage().O1(j, 0L, arrayList, null);
                final long j2 = this.d;
                final boolean z = this.f;
                gm.c3(new Runnable() { // from class: ab7
                    @Override // java.lang.Runnable
                    public final void run() {
                        oc7 oc7Var2 = oc7.this;
                        nm7 notificationCenter = oc7Var2.getNotificationCenter();
                        long j3 = j2;
                        notificationCenter.k(nm7.v, arrayList, Long.valueOf(j3), Boolean.FALSE);
                        int i3 = tL_messages_affectedHistory.offset;
                        ho1 ho1Var2 = ho1Var;
                        if (i3 > 0) {
                            oc7Var2.Z(j, j3, i, i2, z, ho1Var2);
                        } else {
                            ho1Var2.run();
                        }
                    }
                });
                return;
            default:
                VoIPGroupNotification.lambda$request$0((TLObject) obj3, this.b, this.c, this.d, this.e, this.f, (Context) obj2, (String) obj);
                return;
        }
    }

    public /* synthetic */ xa7(TLObject tLObject, int i, long j, long j2, int i2, boolean z, Context context, String str) {
        this.h = tLObject;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = i2;
        this.f = z;
        this.n = context;
        this.r = str;
    }
}
