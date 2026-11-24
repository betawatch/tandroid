// default package

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class rp3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ up3 b;

    public /* synthetic */ rp3(up3 up3Var, byte b) {
        this.a = b;
        this.b = up3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        up3 up3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    up3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    SQLiteCursor queryFinalized = up3Var.getMessagesStorage().b.queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        int intValue = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, y6c.h(up3Var.currentAccount).n);
                                k27 k27Var = new k27(up3Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(k27Var);
                                if (intValue == 0) {
                                    arrayList.add(k27Var);
                                } else {
                                    arrayList2.add(k27Var);
                                }
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                up3Var.getFileLoader().l(arrayList);
                up3Var.getFileLoader().l(arrayList2);
                gl.c3(new mg3(up3Var, arrayList, arrayList2, (byte) 10));
                break;
            case 1:
                up3Var.getNotificationCenter().a(up3Var, kk7.Y1);
                up3Var.getNotificationCenter().a(up3Var, kk7.X1);
                up3Var.getNotificationCenter().a(up3Var, kk7.W1);
                up3Var.getNotificationCenter().a(up3Var, kk7.V1);
                up3Var.getNotificationCenter().a(up3Var, kk7.Q1);
                up3Var.getNotificationCenter().a(up3Var, kk7.R1);
                up3Var.s(false);
                break;
            default:
                try {
                    up3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }
}
