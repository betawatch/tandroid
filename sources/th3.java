// default package

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class th3 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ nk3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ th3(nk3 nk3Var, int i, ArrayList arrayList, boolean z, HashSet hashSet) {
        this.b = nk3Var;
        this.c = i;
        this.d = arrayList;
        this.e = z;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.K4(this.d, this.c, false, this.e, this.f);
                break;
            default:
                this.b.Y3(this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ th3(nk3 nk3Var, ArrayList arrayList, int i, boolean z, HashSet hashSet) {
        this.b = nk3Var;
        this.d = arrayList;
        this.c = i;
        this.e = z;
        this.f = hashSet;
    }
}
