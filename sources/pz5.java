// default package

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pz5 implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ pz5(int i, HashMap hashMap, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = i;
        this.c = hashMap;
        this.d = z;
        this.e = z2;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 0:
                int i2 = this.b;
                HashMap hashMap = this.c;
                boolean z = this.d;
                boolean z2 = this.e;
                String str = LaunchActivity.C1;
                Utilities.e.c(new fv2(bw2.r(i2), hashMap, z, z2, true, (byte) 0));
                break;
            case 1:
                int i3 = this.b;
                HashMap hashMap2 = this.c;
                boolean z3 = this.d;
                boolean z4 = this.e;
                String str2 = LaunchActivity.C1;
                Utilities.e.c(new fv2(bw2.r(i3), hashMap2, z3, z4, false, (byte) 0));
                break;
            default:
                int i4 = this.b;
                HashMap hashMap3 = this.c;
                boolean z5 = this.d;
                boolean z6 = this.e;
                String str3 = LaunchActivity.C1;
                Utilities.e.c(new fv2(bw2.r(i4), hashMap3, z5, z6, true, (byte) 0));
                break;
        }
    }
}
