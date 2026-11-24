// default package

import android.view.View;
import android.widget.Toast;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class t9a implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ daa b;

    public /* synthetic */ t9a(daa daaVar, byte b) {
        this.a = b;
        this.b = daaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        daa daaVar = this.b;
        switch (b) {
            case 0:
                l11.u(daaVar.getParentActivity(), daaVar.getMessagesController().l4.o2.f);
                daaVar.getMessagesController().p4(0L, "PREMIUM_GRACE");
                break;
            case 1:
                daaVar.getClass();
                daaVar.presentFragment(new u8(3));
                break;
            case 2:
                daaVar.getMessagesController().p4(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                daaVar.getClass();
                daaVar.presentFragment(new p5c(8, null));
                break;
            case 4:
                daaVar.getMessagesController().p4(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                daaVar.d0();
                break;
            default:
                int i = daaVar.R + 1;
                daaVar.R = i;
                if (i >= 2) {
                    daaVar.presentFragment(new da3());
                    break;
                } else {
                    boolean z = e21.a;
                    try {
                        Toast.makeText(daaVar.getParentActivity(), jb6.M0(2131751562, null), 0).show();
                        break;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
        }
    }
}
