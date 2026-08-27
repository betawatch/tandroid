package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import f2.y0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.tq0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class f extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new f());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        g gVar = (g) view;
        e eVar = (e) n41Var.G;
        TLRPC.User user = eVar.b;
        long j10 = eVar.a;
        d dVar = (d) n41Var.H;
        boolean z11 = eVar.c;
        boolean z12 = !n41Var.j;
        n9 n9Var = gVar.c;
        TextView textView = gVar.n;
        TextView textView2 = gVar.d;
        gVar.x = dVar;
        gVar.y = j10;
        gVar.A = user.id;
        int i10 = gVar.b;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        gVar.f.setText(DialogObject.getName(j10));
        gVar.h.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(user2 != null ? R.string.CommunityPendingRequestSuggestedBot : ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.CommunityPendingRequestSuggestedChannel : R.string.CommunityPendingRequestSuggestedGroup, DialogObject.getShortName(user)), g6.w0(null, g6.il, false), new tq0(13)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat == null || chat.participants_count <= 0) {
            textView2.setVisibility(8);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(gVar.r, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumberWithMillion(chat.participants_count, ','));
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
        }
        if (z11) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        gVar.w = z12;
        if (user2 != null) {
            n9Var.e(user2, new y8(0, user2));
        } else {
            n9Var.e(chat, new y8(chat));
        }
        gVar.e.e(user, new y8(0, user));
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        g gVar = new g(context, i10, c6Var);
        gVar.setLayoutParams(new y0(-1, -2));
        gVar.setClickable(false);
        return gVar;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        e eVar = (e) n41Var.G;
        e eVar2 = (e) n41Var2.G;
        return eVar.a == eVar2.a && DialogObject.getDialogId(eVar.b) == DialogObject.getDialogId(eVar2.b);
    }
}
