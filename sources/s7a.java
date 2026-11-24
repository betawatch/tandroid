// default package

import android.view.View;
import android.widget.Toast;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class s7a implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d8a b;

    public /* synthetic */ s7a(d8a d8aVar, byte b) {
        this.a = b;
        this.b = d8aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        d8a d8aVar = this.b;
        switch (b) {
            case 0:
                d01.t(d8aVar.getParentActivity(), d8aVar.getMessagesController().k4.o2.f);
                d8aVar.getMessagesController().n4(0L, "PREMIUM_GRACE");
                break;
            case 1:
                d8aVar.getClass();
                d8aVar.presentFragment(new u8(3));
                break;
            case 2:
                d8aVar.getMessagesController().n4(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                d8aVar.getClass();
                d8aVar.presentFragment(new p3c(8, null));
                break;
            case 4:
                d8aVar.getMessagesController().n4(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                d8aVar.c0();
                break;
            default:
                int i = d8aVar.R + 1;
                d8aVar.R = i;
                if (i >= 2) {
                    d8aVar.presentFragment(new r83());
                    break;
                } else {
                    boolean z = w01.a;
                    try {
                        Toast.makeText(d8aVar.getParentActivity(), k96.M0(2131751613, null), 0).show();
                        break;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
        }
    }
}
