package tf;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.cy;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements x, jl0 {
    public final /* synthetic */ z a;

    public /* synthetic */ r(z zVar) {
        this.a = zVar;
    }

    @Override // tf.x
    public void a(a0.h hVar, ArrayList arrayList) {
        z zVar = this.a;
        int i10 = zVar.p0;
        zVar.q0 = arrayList;
        zVar.u0 = hVar;
        for (int i11 = 0; i11 < zVar.q0.size(); i11++) {
            y yVar = (y) zVar.q0.get(i11);
            TLObject tLObject = yVar.a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) yVar.a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) yVar.a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) yVar.a, true);
            }
        }
        zVar.G(null);
        zVar.l();
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        TLRPC.User user;
        cy cyVar = this.a.R;
        if (cyVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            qy qyVar = cyVar.a;
            if (qyVar.getParentActivity() != null && (user = qyVar.getMessagesController().getUser(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new f3.e(cyVar, longValue, 8));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                qyVar.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(qyVar.getThemedColor(j6.q7));
                }
            }
        }
        return true;
    }
}
