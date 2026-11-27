// default package

import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum yfd {
    b(-999),
    /* JADX INFO: Fake field, exist only in values array */
    EF18(-3),
    /* JADX INFO: Fake field, exist only in values array */
    EF27(-2),
    /* JADX INFO: Fake field, exist only in values array */
    EF36(-1),
    /* JADX INFO: Fake field, exist only in values array */
    EF44(0),
    /* JADX INFO: Fake field, exist only in values array */
    EF52(1),
    /* JADX INFO: Fake field, exist only in values array */
    EF60(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF70(3),
    /* JADX INFO: Fake field, exist only in values array */
    EF83(4),
    /* JADX INFO: Fake field, exist only in values array */
    EF96(5),
    /* JADX INFO: Fake field, exist only in values array */
    EF109(6),
    /* JADX INFO: Fake field, exist only in values array */
    EF122(7),
    /* JADX INFO: Fake field, exist only in values array */
    EF133(8),
    /* JADX INFO: Fake field, exist only in values array */
    EF148(11),
    /* JADX INFO: Fake field, exist only in values array */
    EF163(12);

    public static final hnd c;
    public final int a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    static {
        boolean z = false;
        lp lpVar = new lp((byte) 20, z);
        lpVar.c = new Object[8];
        lpVar.b = 0;
        yfd[] values = values();
        int length = values.length;
        for (?? r2 = z; r2 < length; r2++) {
            yfd yfdVar = values[r2];
            Integer valueOf = Integer.valueOf(yfdVar.a);
            int i = lpVar.b + 1;
            Object[] objArr = (Object[]) lpVar.c;
            int length2 = objArr.length;
            int i2 = i << 1;
            if (i2 > length2) {
                if (i2 > length2) {
                    length2 = length2 + (length2 >> 1) + 1;
                    length2 = length2 < i2 ? Integer.highestOneBit(i2 - 1) << 1 : length2;
                    if (length2 < 0) {
                        length2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
                objArr = Arrays.copyOf(objArr, length2);
                lpVar.c = objArr;
            }
            int i3 = lpVar.b;
            int i4 = i3 << 1;
            objArr[i4] = valueOf;
            objArr[i4 + 1] = yfdVar;
            lpVar.b = i3 + 1;
        }
        zjd zjdVar = (zjd) lpVar.d;
        if (zjdVar != null) {
            throw zjdVar.a();
        }
        hnd c2 = hnd.c(lpVar.b, (Object[]) lpVar.c, lpVar);
        zjd zjdVar2 = (zjd) lpVar.d;
        if (zjdVar2 != null) {
            throw zjdVar2.a();
        }
        c = c2;
    }

    yfd(int i) {
        this.a = i;
    }
}
