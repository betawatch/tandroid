package zf;

import android.location.Location;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Location d;

    public /* synthetic */ a(c cVar, String str, Location location, int i10) {
        this.a = i10;
        this.b = cVar;
        this.c = str;
        this.d = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c cVar = this.b;
                cVar.getClass();
                org.telegram.messenger.i0.g3(new a(cVar, this.c, this.d, 1));
                break;
            default:
                c cVar2 = this.b;
                cVar2.E = null;
                cVar2.w = null;
                cVar2.H(this.c, this.d, true);
                break;
        }
    }
}
