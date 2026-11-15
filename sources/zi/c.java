package zi;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class c {
    public final /* synthetic */ int a;
    public final /* synthetic */ u7.i b;

    public /* synthetic */ c(u7.i iVar, int i7) {
        this.a = i7;
        this.b = iVar;
    }

    public void a(Exception exc) {
        switch (this.a) {
            case 0:
                u7.i iVar = this.b;
                ((v0) iVar.a).i.post(new k0(iVar, exc, 1));
                break;
            default:
                u7.i iVar2 = this.b;
                ((v0) iVar2.a).i.post(new k0(iVar2, exc, 0));
                break;
        }
    }
}
