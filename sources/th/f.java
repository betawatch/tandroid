package th;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import f2.w0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.c21;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class f extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new f());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        g gVar = (g) view;
        e eVar = (e) i51Var.G;
        TLRPC.User user = eVar.b;
        long j10 = eVar.a;
        d dVar = (d) i51Var.H;
        boolean z10 = eVar.c;
        boolean z11 = !i51Var.j;
        p9 p9Var = gVar.c;
        TextView textView = gVar.n;
        TextView textView2 = gVar.d;
        gVar.x = dVar;
        gVar.y = j10;
        gVar.B = user.id;
        int i10 = gVar.b;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        gVar.f.setText(DialogObject.getName(j10));
        gVar.h.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(user2 != null ? R.string.CommunityPendingRequestSuggestedBot : ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.CommunityPendingRequestSuggestedChannel : R.string.CommunityPendingRequestSuggestedGroup, DialogObject.getShortName(user)), j6.w0(null, j6.il, false), new c21(17)));
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
        if (z10) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        gVar.w = z11;
        if (user2 != null) {
            p9Var.e(user2, new z8(0, user2));
        } else {
            p9Var.e(chat, new z8(chat));
        }
        gVar.e.e(user, new z8(0, user));
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        g gVar = new g(context, i10, f6Var);
        gVar.setLayoutParams(new w0(-1, -2));
        gVar.setClickable(false);
        return gVar;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        e eVar = (e) i51Var.G;
        e eVar2 = (e) i51Var2.G;
        return eVar.a == eVar2.a && DialogObject.getDialogId(eVar.b) == DialogObject.getDialogId(eVar2.b);
    }
}
