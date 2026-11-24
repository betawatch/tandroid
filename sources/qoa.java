// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qoa implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;

    public /* synthetic */ qoa(vqa vqaVar, byte b) {
        this.a = b;
        this.b = vqaVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                vqaVar.f2.setLoading(false);
                break;
            default:
                vqaVar.f2.setLoading(false);
                break;
        }
    }
}
