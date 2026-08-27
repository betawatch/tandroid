package pf;

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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.gy;
import org.telegram.ui.rx;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements x, rk0 {
    public final /* synthetic */ z a;

    public /* synthetic */ r(z zVar) {
        this.a = zVar;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        TLRPC.User user;
        rx rxVar = this.a.Q;
        if (rxVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            gy gyVar = rxVar.a;
            if (gyVar.getParentActivity() != null && (user = gyVar.getMessagesController().getUser(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                b2 b2Var = alertDialog$Builder.a;
                b2Var.N = string;
                b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new d3.e(rxVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                gyVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(gyVar.getThemedColor(g6.q7));
                }
            }
        }
        return true;
    }

    @Override // pf.x
    public void b(a0.h hVar, ArrayList arrayList) {
        z zVar = this.a;
        int i10 = zVar.o0;
        zVar.p0 = arrayList;
        zVar.t0 = hVar;
        for (int i11 = 0; i11 < zVar.p0.size(); i11++) {
            y yVar = (y) zVar.p0.get(i11);
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
}
