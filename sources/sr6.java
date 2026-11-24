// default package

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sr6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sr6(mu9 mu9Var, int i, boolean z) {
        this.a = (byte) 2;
        this.d = mu9Var;
        this.c = i;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        NativeByteBuffer byteBufferValue;
        byte b = this.a;
        boolean z = this.b;
        byte b2 = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                hs6 hs6Var = (hs6) obj;
                if (z) {
                    i = 2;
                } else {
                    i = 3;
                    if (b2 != 0) {
                        if (b2 == 1) {
                            i = 4;
                        } else if (b2 == 3) {
                            i = 6;
                        } else {
                            i = 7;
                            if (b2 != 5) {
                                i = b2 == 7 ? 8 : 5;
                            }
                        }
                    }
                }
                try {
                    SQLiteCursor queryFinalized = hs6Var.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i + " ORDER BY date DESC", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    while (queryFinalized.next()) {
                        if (!queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                            TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                arrayList.add(TLdeserialize);
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                    gm.c3(new lp6(hs6Var, z, arrayList, b2));
                    break;
                } catch (Throwable th) {
                    hs6Var.getMessagesStorage().n(th, true);
                    return;
                }
            case 1:
                ((ac8) obj).a.b.M2(b2, z);
                break;
            default:
                mu9 mu9Var = (mu9) obj;
                mu9Var.o = null;
                mu9Var.c(b2, z, true);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sr6(Object obj, boolean z, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = i;
    }
}
