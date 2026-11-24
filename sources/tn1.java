// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tn1 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tn1(Object obj, long j, long j2, Long l, byte b) {
        this.a = b;
        this.e = obj;
        this.b = j;
        this.c = j2;
        this.d = l;
    }

    @Override // p8c
    public final void a(Object obj) {
        int i;
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                ((mu1) obj2).G9(this.b, this.c, this.d, (Boolean) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                i = ((d) ((aq1) obj2).b).currentAccount;
                boolean z = false;
                gta v = gta.v(i, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z = true;
                }
                v.g0(this.b, this.c, z, true);
                break;
        }
    }
}
