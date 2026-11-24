// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sba implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nfa b;
    public final /* synthetic */ int c;

    public /* synthetic */ sba(nfa nfaVar, int i, byte b) {
        this.a = b;
        this.b = nfaVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        nfa nfaVar = this.b;
        switch (b) {
            case 0:
                nfaVar.o1(i);
                break;
            case 1:
                nfaVar.U0(i, nfaVar.m1, nfaVar.y1);
                break;
            case 2:
                nfaVar.n1(i, false);
                break;
            case 3:
                nfaVar.o1(i);
                break;
            default:
                nfaVar.V0(i, nfaVar.m1, nfaVar.y1);
                break;
        }
    }
}
