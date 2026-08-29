package rf;

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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.fy;
import org.telegram.ui.qx;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements y, bl0 {
    public final /* synthetic */ a0 a;

    public /* synthetic */ s(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // rf.y
    public void a(a0.h hVar, ArrayList arrayList) {
        a0 a0Var = this.a;
        int i10 = a0Var.o0;
        a0Var.p0 = arrayList;
        a0Var.t0 = hVar;
        for (int i11 = 0; i11 < a0Var.p0.size(); i11++) {
            z zVar = (z) a0Var.p0.get(i11);
            TLObject tLObject = zVar.a;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(i10).putUser((TLRPC.User) zVar.a, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) zVar.a, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) zVar.a, true);
            }
        }
        a0Var.G(null);
        a0Var.l();
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        TLRPC.User user;
        qx qxVar = this.a.Q;
        if (qxVar != null) {
            Long l10 = (Long) view.getTag();
            long longValue = l10.longValue();
            fy fyVar = qxVar.a;
            if (fyVar.getParentActivity() != null && (user = fyVar.getMessagesController().getUser(l10)) != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fyVar.getParentActivity());
                String string = LocaleController.getString(R.string.ChatHintsDeleteAlertTitle);
                c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name)));
                alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new f3.e(qxVar, longValue, 9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                fyVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(fyVar.getThemedColor(g6.q7));
                }
            }
        }
        return true;
    }
}
