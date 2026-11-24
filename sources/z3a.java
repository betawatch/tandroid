// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class z3a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a6a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ z3a(a6a a6aVar, String str, List list, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = str;
        this.d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        List list = this.d;
        String str = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                a6aVar.r.remove(str);
                list.remove(str);
                break;
            default:
                a6aVar.r.remove(str);
                list.remove(str);
                break;
        }
    }
}
