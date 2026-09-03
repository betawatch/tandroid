package ph;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ t9 b;

    public /* synthetic */ m(t9 t9Var, int i10) {
        this.a = i10;
        this.b = t9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                t9 t9Var = this.b;
                t9Var.setPeriod(intValue);
                Utilities.Callback callback = t9Var.y1;
                if (callback != null) {
                    callback.run(num);
                    break;
                }
                break;
            default:
                Utilities.Callback callback2 = this.b.z1;
                if (callback2 != null) {
                    callback2.run(num);
                    break;
                }
                break;
        }
    }
}
