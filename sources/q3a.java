// default package

import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class q3a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a6a b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ k47 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ m5a f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ m5a n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ q3a(a6a a6aVar, TLObject tLObject, k47 k47Var, String str, m5a m5aVar, boolean z, m5a m5aVar2, Object obj, HashMap hashMap, boolean z2, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = tLObject;
        this.d = k47Var;
        this.e = str;
        this.f = m5aVar;
        this.h = z;
        this.n = m5aVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.N(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w);
                break;
            case 1:
                this.b.N(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w);
                break;
            default:
                this.b.N(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w);
                break;
        }
    }
}
