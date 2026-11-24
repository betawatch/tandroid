// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class va6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eb6 b;

    public /* synthetic */ va6(eb6 eb6Var, byte b) {
        this.a = b;
        this.b = eb6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        eb6 eb6Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                eb6 eb6Var2 = this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = eb6Var2.getMessagesStorage().b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        db6 db6Var = new db6();
                        db6Var.a = queryFinalized.longValue(0);
                        db6Var.b = queryFinalized.intValue(1);
                        db6Var.c = queryFinalized.intValue(2);
                        db6Var.d = queryFinalized.intValue(3);
                        db6Var.f = queryFinalized.intValue(5);
                        db6Var.e = eb6Var2.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            k27 k27Var = new k27(eb6Var2.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            db6Var.h = k27Var;
                            ad7.d(k27Var.k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(db6Var);
                        boolean y = cf3.y(db6Var.a);
                        long j = db6Var.a;
                        if (y) {
                            if (!arrayList5.contains(Long.valueOf(-j))) {
                                arrayList5.add(Long.valueOf(-db6Var.a));
                            }
                        } else if (cf3.D(j) && !arrayList4.contains(Long.valueOf(db6Var.a))) {
                            arrayList4.add(Long.valueOf(db6Var.a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        eb6Var2.getMessagesStorage().P(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    eb6Var2.getMessagesStorage().k0(arrayList4, arrayList2, false);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                if (!arrayList.isEmpty()) {
                    gl.c3(new e45(eb6Var2, arrayList2, arrayList3, arrayList, (byte) 14));
                    break;
                }
                break;
            case 1:
                eb6Var.J.clear();
                eb6Var.K.b();
                eb6.s();
                kk7.e().k(kk7.F4, new Object[0]);
                break;
            case 2:
                eb6Var.I = 0L;
                eb6Var.G.clear();
                eb6Var.a.b();
                eb6Var.b.clear();
                eb6Var.s = null;
                eb6Var.r(true);
                break;
            case 3:
                eb6Var.a(true);
                break;
            case 4:
                eb6Var.L = Boolean.FALSE;
                try {
                    ((ny4) eb6Var.N).a.d();
                    eb6Var.p();
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                eb6 f = eb6.f(eb6Var.getAccountInstance().a);
                eb6Var.getNotificationCenter().a(f, 1);
                eb6Var.getNotificationCenter().a(f, 7);
                eb6Var.getNotificationCenter().a(f, 49);
                break;
            default:
                ArrayList arrayList6 = eb6Var.b;
                for (int i = 0; i < arrayList6.size(); i++) {
                    db6 db6Var2 = (db6) arrayList6.get(i);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = eb6Var.getMessagesController().h1(db6Var2.a);
                    tL_messages_editMessage.id = db6Var2.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    eb6Var.getConnectionsManager().sendRequest(tL_messages_editMessage, new wa6(eb6Var, b2));
                }
                arrayList6.clear();
                eb6Var.a.b();
                eb6Var.l(null, 2);
                eb6Var.r(true);
                gl.c3(new va6(eb6Var, b2));
                break;
        }
    }
}
