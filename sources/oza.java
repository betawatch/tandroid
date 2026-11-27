// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class oza implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e0b b;

    public /* synthetic */ oza(e0b e0bVar, byte b) {
        this.a = b;
        this.b = e0bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e0b e0bVar = this.b;
        switch (b) {
            case 0:
                e0bVar.N1 = true;
                e0bVar.F0(null);
                hl.d3(new oza(e0bVar, (byte) 1), 240L);
                break;
            case 1:
                e0bVar.dismiss();
                break;
            default:
                tza tzaVar = e0bVar.s1;
                tzaVar.G = false;
                tzaVar.invalidate();
                break;
        }
    }
}
