// default package

import android.util.SparseArray;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r67 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ SparseArray c;

    public /* synthetic */ r67(na7 na7Var, SparseArray sparseArray, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = sparseArray;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SparseArray sparseArray = this.c;
        na7 na7Var = this.b;
        char c = 2;
        switch (b) {
            case 0:
                int i = 0;
                while (i < sparseArray.size()) {
                    int keyAt = sparseArray.keyAt(i);
                    long[] jArr = (long[]) sparseArray.valueAt(i);
                    na7Var.getSendMessagesHelper().c0((int) jArr[1]);
                    kk7 notificationCenter = na7Var.getNotificationCenter();
                    Integer valueOf = Integer.valueOf((int) jArr[1]);
                    Integer valueOf2 = Integer.valueOf(keyAt);
                    Long valueOf3 = Long.valueOf(jArr[0]);
                    Boolean bool = Boolean.FALSE;
                    char c2 = c;
                    Object[] objArr = new Object[7];
                    objArr[0] = valueOf;
                    objArr[1] = valueOf2;
                    objArr[c2] = null;
                    objArr[3] = valueOf3;
                    objArr[4] = 0L;
                    objArr[5] = -1;
                    objArr[6] = bool;
                    notificationCenter.k(21, objArr);
                    kk7 notificationCenter2 = na7Var.getNotificationCenter();
                    Integer valueOf4 = Integer.valueOf((int) jArr[1]);
                    Integer valueOf5 = Integer.valueOf(keyAt);
                    Long valueOf6 = Long.valueOf(jArr[0]);
                    Object[] objArr2 = new Object[7];
                    objArr2[0] = valueOf4;
                    objArr2[1] = valueOf5;
                    objArr2[c2] = null;
                    objArr2[3] = valueOf6;
                    objArr2[4] = 0L;
                    objArr2[5] = -1;
                    objArr2[6] = bool;
                    notificationCenter2.k(22, objArr2);
                    i++;
                    c = c2;
                }
                break;
            default:
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    int keyAt2 = sparseArray.keyAt(i2);
                    long[] jArr2 = (long[]) sparseArray.valueAt(i2);
                    na7Var.getSendMessagesHelper().c0((int) jArr2[1]);
                    kk7 notificationCenter3 = na7Var.getNotificationCenter();
                    Integer valueOf7 = Integer.valueOf((int) jArr2[1]);
                    Integer valueOf8 = Integer.valueOf(keyAt2);
                    Long valueOf9 = Long.valueOf(jArr2[0]);
                    Boolean bool2 = Boolean.FALSE;
                    notificationCenter3.k(21, valueOf7, valueOf8, null, valueOf9, 0L, -1, bool2);
                    na7Var.getNotificationCenter().k(22, Integer.valueOf((int) jArr2[1]), Integer.valueOf(keyAt2), null, Long.valueOf(jArr2[0]), 0L, -1, bool2);
                }
                break;
        }
    }
}
