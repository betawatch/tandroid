package qh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ q9 b;

    public /* synthetic */ m(q9 q9Var, int i10) {
        this.a = i10;
        this.b = q9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                q9 q9Var = this.b;
                q9Var.setPeriod(intValue);
                Utilities.Callback callback = q9Var.y1;
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
