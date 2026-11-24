// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class uc6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dd6 b;

    public /* synthetic */ uc6(dd6 dd6Var, byte b) {
        this.a = b;
        this.b = dd6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dd6 dd6Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                dd6 dd6Var2 = this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = dd6Var2.getMessagesStorage().b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        cd6 cd6Var = new cd6();
                        cd6Var.a = queryFinalized.longValue(0);
                        cd6Var.b = queryFinalized.intValue(1);
                        cd6Var.c = queryFinalized.intValue(2);
                        cd6Var.d = queryFinalized.intValue(3);
                        cd6Var.f = queryFinalized.intValue(5);
                        cd6Var.e = dd6Var2.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            k47 k47Var = new k47(dd6Var2.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            cd6Var.h = k47Var;
                            cf7.d(k47Var.k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(cd6Var);
                        boolean y = pg3.y(cd6Var.a);
                        long j = cd6Var.a;
                        if (y) {
                            if (!arrayList5.contains(Long.valueOf(-j))) {
                                arrayList5.add(Long.valueOf(-cd6Var.a));
                            }
                        } else if (pg3.D(j) && !arrayList4.contains(Long.valueOf(cd6Var.a))) {
                            arrayList4.add(Long.valueOf(cd6Var.a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        dd6Var2.getMessagesStorage().P(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    dd6Var2.getMessagesStorage().k0(arrayList4, arrayList2, false);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                if (!arrayList.isEmpty()) {
                    gm.c3(new d65(dd6Var2, arrayList2, arrayList3, arrayList, (byte) 14));
                    break;
                }
                break;
            case 1:
                dd6Var.J.clear();
                dd6Var.K.b();
                dd6.s();
                nm7.e().k(nm7.H4, new Object[0]);
                break;
            case 2:
                dd6Var.I = 0L;
                dd6Var.G.clear();
                dd6Var.a.b();
                dd6Var.b.clear();
                dd6Var.s = null;
                dd6Var.r(true);
                break;
            case 3:
                dd6Var.a(true);
                break;
            case 4:
                dd6Var.L = Boolean.FALSE;
                try {
                    ((o3d) ((fk3) dd6Var.N).a).d();
                    dd6Var.p();
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                dd6 f = dd6.f(dd6Var.getAccountInstance().a);
                dd6Var.getNotificationCenter().a(f, 1);
                dd6Var.getNotificationCenter().a(f, 7);
                dd6Var.getNotificationCenter().a(f, 50);
                break;
            default:
                ArrayList arrayList6 = dd6Var.b;
                for (int i = 0; i < arrayList6.size(); i++) {
                    cd6 cd6Var2 = (cd6) arrayList6.get(i);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = dd6Var.getMessagesController().i1(cd6Var2.a);
                    tL_messages_editMessage.id = cd6Var2.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    dd6Var.getConnectionsManager().sendRequest(tL_messages_editMessage, new vc6(dd6Var, b2));
                }
                arrayList6.clear();
                dd6Var.a.b();
                dd6Var.l(null, 2);
                dd6Var.r(true);
                gm.c3(new uc6(dd6Var, b2));
                break;
        }
    }
}
