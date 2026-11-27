// default package

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class xq6 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ rf0 n;
    public final /* synthetic */ Object r;

    public /* synthetic */ xq6(ls6 ls6Var, int i, ArrayList arrayList, boolean z, long j, int i2, int i3, long j2) {
        this.n = ls6Var;
        this.b = i;
        this.r = arrayList;
        this.h = z;
        this.c = j;
        this.e = i2;
        this.f = i3;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        byte b = this.a;
        Object obj = this.r;
        rf0 rf0Var = this.n;
        switch (b) {
            case 0:
                ls6 ls6Var = (ls6) rf0Var;
                ArrayList arrayList = (ArrayList) obj;
                int i3 = this.b;
                boolean z = this.h;
                long j = this.c;
                int i4 = this.e;
                int i5 = this.f;
                long j2 = this.d;
                if (i3 == 0) {
                    try {
                        if (arrayList.isEmpty() || z) {
                            ls6Var.getMessagesStorage().E(i4, i5, j, j2);
                            j2 = j2;
                            i5 = i5;
                            i4 = i4;
                            j = j;
                            if (arrayList.isEmpty()) {
                            }
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                ls6Var.getMessagesStorage().b.beginTransaction();
                int i6 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                SQLitePreparedStatement executeFast = i6 != 0 ? ls6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)") : ls6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    TLRPC.Message message = (TLRPC.Message) obj2;
                    if (ls6.t(message)) {
                        executeFast.requery();
                        r47.p5(message);
                        i = i6;
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                        message.serializeToStream(nativeByteBuffer);
                        i2 = i3;
                        executeFast.bindInteger(1, message.id);
                        executeFast.bindLong(2, j);
                        int i8 = 3;
                        if (i != 0) {
                            executeFast.bindLong(3, j2);
                            i8 = 4;
                        }
                        executeFast.bindInteger(i8, message.date);
                        executeFast.bindInteger(i8 + 1, i5);
                        executeFast.bindByteBuffer(i8 + 2, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    } else {
                        i = i6;
                        i2 = i3;
                    }
                    i6 = i;
                    i3 = i2;
                }
                int i9 = i3;
                executeFast.dispose();
                if (!z || i4 != 0 || i9 != 0) {
                    int i10 = (z && i9 == 0) ? 1 : ((TLRPC.Message) arrayList.get(arrayList.size() - 1)).id;
                    if (i9 != 0) {
                        ls6Var.getMessagesStorage().s(j, i10, ((TLRPC.Message) arrayList.get(0)).id, i5, j2);
                    } else if (i4 != 0) {
                        ls6Var.getMessagesStorage().s(j, i10, i4, i5, j2);
                    } else {
                        ls6Var.getMessagesStorage().s(j, i10, ConnectionsManager.DEFAULT_DATACENTER_ID, i5, j2);
                    }
                }
                ls6Var.getMessagesStorage().b.commitTransaction();
                break;
            default:
                ((jf7) rf0Var).B0(this.b, this.e, this.f, this.c, this.d, (TLRPC.messages_Messages) obj, this.h);
                break;
        }
    }

    public /* synthetic */ xq6(jf7 jf7Var, int i, TLRPC.messages_Messages messages_messages, long j, long j2, int i2, int i3, boolean z) {
        this.n = jf7Var;
        this.b = i;
        this.r = messages_messages;
        this.c = j;
        this.d = j2;
        this.e = i2;
        this.f = i3;
        this.h = z;
    }
}
