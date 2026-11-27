// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class tg8 implements sr4 {
    public final /* synthetic */ byte a = 1;

    public /* synthetic */ tg8() {
    }

    @Override // sr4
    public final Object invoke() {
        o8a[] o8aVarArr;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(0);
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                return (arrayList == null || (o8aVarArr = (o8a[]) arrayList.toArray(new o8a[0])) == null) ? qgd.a : o8aVarArr;
            default:
                adb adbVar = adb.a;
                return new u66(go8.a);
        }
    }

    public /* synthetic */ tg8(ug8 ug8Var) {
    }
}
