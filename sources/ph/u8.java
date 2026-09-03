package ph;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    public /* synthetic */ u8(da daVar, int i10) {
        this.a = i10;
        this.b = daVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                da daVar = this.b;
                daVar.getClass();
                daVar.g(1.0f, true, new g8(daVar, 6));
                daVar.Y0.b(true, true);
                break;
            default:
                da daVar2 = this.b;
                daVar2.f(false);
                daVar2.j2 = null;
                break;
        }
    }
}
