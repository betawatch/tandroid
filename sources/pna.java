// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pna implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;
    public final /* synthetic */ long c;

    public /* synthetic */ pna(vqa vqaVar, long j, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                vqaVar.Y1(j);
                break;
            case 1:
                vqaVar.Y1(j);
                break;
            case 2:
                nna nnaVar = vqaVar.s3;
                vqaVar.z2(1, true, null);
                if (j > 0) {
                    gl.r(nnaVar);
                    gl.c3(nnaVar);
                    break;
                }
                break;
            case 3:
                vqaVar.Y1(j);
                break;
            case 4:
                vqaVar.Y1(j);
                break;
            case 5:
                vqaVar.U1(j);
                break;
            case 6:
                zua zuaVar = new zua(vqaVar.getContext(), vqaVar.J0, this.c, 10, null, new t7a(vqaVar, new boolean[]{false}, (byte) 19), 0L);
                zuaVar.setOnDismissListener(new qoa(vqaVar, (byte) 0));
                zuaVar.show();
                break;
            case 7:
                vqaVar.Y1(j);
                break;
            case 8:
                vqaVar.U1(j);
                break;
            case 9:
                vqaVar.Y1(j);
                break;
            case 10:
                vqaVar.U1(j);
                break;
            case 11:
                vqaVar.Y1(j);
                break;
            default:
                vqaVar.U1(j);
                break;
        }
    }
}
