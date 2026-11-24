// default package

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sp6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sp6(ks9 ks9Var, int i, boolean z) {
        this.a = (byte) 2;
        this.d = ks9Var;
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
                hq6 hq6Var = (hq6) obj;
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
                    SQLiteCursor queryFinalized = hq6Var.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i + " ORDER BY date DESC", new Object[0]);
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
                    gl.d3(new kn6(hq6Var, z, arrayList, b2));
                    break;
                } catch (Throwable th) {
                    hq6Var.getMessagesStorage().n(th, true);
                    return;
                }
            case 1:
                ((z98) obj).a.b.L2(b2, z);
                break;
            default:
                ks9 ks9Var = (ks9) obj;
                ks9Var.o = null;
                ks9Var.c(b2, z, true);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sp6(Object obj, boolean z, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = i;
    }
}
