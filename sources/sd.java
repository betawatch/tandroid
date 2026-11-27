// default package

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class sd implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ e c;
    public final /* synthetic */ AlertDialog$Builder d;

    public /* synthetic */ sd(TLRPC.User user, e eVar, AlertDialog$Builder alertDialog$Builder, byte b) {
        this.a = b;
        this.b = user;
        this.c = eVar;
        this.d = alertDialog$Builder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        AlertDialog$Builder alertDialog$Builder = this.d;
        e eVar = this.c;
        TLRPC.User user = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                if (eVar.getMessagesController().C(bundle, eVar, null, null)) {
                    eVar.presentFragment(new ProfileActivity(bundle, null));
                }
                alertDialog$Builder.a.M0.run();
                break;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                if (eVar.getMessagesController().C(bundle2, eVar, null, null)) {
                    eVar.presentFragment(new ProfileActivity(bundle2, null));
                }
                alertDialog$Builder.a.M0.run();
                break;
        }
    }
}
