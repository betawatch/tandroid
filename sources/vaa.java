// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vaa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ waa b;

    public /* synthetic */ vaa(waa waaVar, byte b) {
        this.a = b;
        this.b = waaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        byte b = this.a;
        waa waaVar = this.b;
        switch (b) {
            case 0:
                String str2 = waaVar.b.text;
                if (str2 == null || !str2.equals("AUTH_TOKEN_EXCEPTION")) {
                    str = ob6.M0(2131751070, null) + "\n" + waaVar.b.text;
                } else {
                    str = ob6.M0(2131754704, null);
                }
                jj.r0(waaVar.c, ob6.M0(2131753887, null), str, null);
                break;
            default:
                jj.r0(waaVar.c, ob6.M0(2131753887, null), ob6.M0(2131751070, null), null);
                break;
        }
    }
}
