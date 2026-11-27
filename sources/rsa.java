// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class rsa implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;

    public /* synthetic */ rsa(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.f2.setLoading(false);
                break;
            default:
                wuaVar.f2.setLoading(false);
                break;
        }
    }
}
