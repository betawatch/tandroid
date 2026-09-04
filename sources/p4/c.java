package p4;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.emoji2.text.p b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.a = i11;
        this.b = pVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v vVar = ((e) ((m2.t) this.b.f).d).d;
                if (vVar != null) {
                    vVar.j(this.c);
                    break;
                }
                break;
            default:
                v vVar2 = ((e) ((m2.t) this.b.f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.c);
                    break;
                }
                break;
        }
    }
}
