// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y0a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h1a b;

    public /* synthetic */ y0a(h1a h1aVar, byte b) {
        this.a = b;
        this.b = h1aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        h1a h1aVar = this.b;
        switch (b) {
            case 0:
                h1aVar.a1(false);
                break;
            case 1:
                h1aVar.a1(true);
                break;
            case 2:
                vqa vqaVar = new vqa(h1aVar.getContext(), h1aVar.T1, h1aVar.U1, h1aVar.J0, null);
                long j = h1aVar.X1.id;
                String str = h1aVar.a2;
                vqaVar.l3 = true;
                gta.v(vqaVar.a, false).H(j, new nu9(vqaVar, str, (byte) 8));
                break;
            case 3:
                ez.b1(h1aVar.J0, h1aVar.getContext(), h1aVar.X1);
                break;
            case 4:
                new ava(h1aVar.getContext(), h1aVar.J0).show();
                break;
            default:
                h1aVar.dismiss();
                break;
        }
    }
}
