// default package

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class up6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls6 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ up6(ls6 ls6Var, ArrayList arrayList, int i, int i2, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = arrayList;
        this.d = i;
        this.e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.e;
        int i2 = this.d;
        ArrayList arrayList = this.c;
        ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                ls6Var.y1(i2, i, arrayList, true);
                break;
            default:
                try {
                    if (arrayList != null) {
                        ls6Var.getMessagesStorage().b.executeFast("DELETE FROM reactions").stepThis().dispose();
                        SQLitePreparedStatement executeFast = ls6Var.getMessagesStorage().b.executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
                        executeFast.requery();
                        int i3 = 4;
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            i3 += ((TLRPC.TL_availableReaction) arrayList.get(i4)).getObjectSize();
                        }
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i3);
                        nativeByteBuffer.writeInt32(arrayList.size());
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            ((TLRPC.TL_availableReaction) arrayList.get(i5)).serializeToStream(nativeByteBuffer);
                        }
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindInteger(2, i2);
                        executeFast.bindInteger(3, i);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                        break;
                    } else {
                        SQLitePreparedStatement executeFast2 = ls6Var.getMessagesStorage().b.executeFast("UPDATE reactions SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindLong(1, i);
                        executeFast2.step();
                        executeFast2.dispose();
                        break;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
        }
    }
}
