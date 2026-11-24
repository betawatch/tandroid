// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                    gl.d3(nnaVar);
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
