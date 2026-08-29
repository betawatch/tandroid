package rh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import f2.x0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
import org.telegram.ui.ef0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class f extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new f());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        g gVar = (g) view;
        e eVar = (e) w41Var.G;
        TLRPC.User user = eVar.b;
        long j10 = eVar.a;
        d dVar = (d) w41Var.H;
        boolean z11 = eVar.c;
        boolean z12 = !w41Var.j;
        t9 t9Var = gVar.c;
        TextView textView = gVar.n;
        TextView textView2 = gVar.d;
        gVar.x = dVar;
        gVar.y = j10;
        gVar.A = user.id;
        int i10 = gVar.b;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        gVar.f.setText(DialogObject.getName(j10));
        gVar.h.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(user2 != null ? R.string.CommunityPendingRequestSuggestedBot : ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.CommunityPendingRequestSuggestedChannel : R.string.CommunityPendingRequestSuggestedGroup, DialogObject.getShortName(user)), g6.w0(null, g6.il, false), new ef0(17)));
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
            t9Var.e(user2, new e9(0, user2));
        } else {
            t9Var.e(chat, new e9(chat));
        }
        gVar.e.e(user, new e9(0, user));
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        g gVar = new g(context, i10, c6Var);
        gVar.setLayoutParams(new x0(-1, -2));
        gVar.setClickable(false);
        return gVar;
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        e eVar = (e) w41Var.G;
        e eVar2 = (e) w41Var2.G;
        return eVar.a == eVar2.a && DialogObject.getDialogId(eVar.b) == DialogObject.getDialogId(eVar2.b);
    }
}
