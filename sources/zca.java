// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class zca extends bda {
    public final /* synthetic */ byte f;
    public final /* synthetic */ yca g;
    public final /* synthetic */ cda h;

    public /* synthetic */ zca(cda cdaVar, yca ycaVar, byte b) {
        this.f = b;
        this.h = cdaVar;
        this.g = ycaVar;
    }

    @Override // bda
    public final void a() {
        byte b = this.f;
        cda cdaVar = this.h;
        switch (b) {
            case 0:
                tca tcaVar = cdaVar.h;
                float f = tcaVar.i;
                float f2 = tcaVar.j;
                this.d = f;
                this.e = f2;
                break;
            default:
                tca tcaVar2 = cdaVar.h;
                float f3 = tcaVar2.d;
                float f4 = tcaVar2.e;
                this.d = f3;
                this.e = f4;
                break;
        }
    }

    @Override // bda
    public final void b(float f, float f2) {
        byte b = this.f;
        yca ycaVar = this.g;
        cda cdaVar = this.h;
        switch (b) {
            case 0:
                tca tcaVar = cdaVar.h;
                tcaVar.i = f;
                tcaVar.j = f2;
                this.d = f;
                this.e = f2;
                ycaVar.a();
                break;
            default:
                tca tcaVar2 = cdaVar.h;
                tcaVar2.d = f;
                tcaVar2.e = f2;
                this.d = f;
                this.e = f2;
                ycaVar.a();
                break;
        }
    }
}
