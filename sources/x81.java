// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class x81 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new x81());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        y81 y81Var = (y81) view;
        TLRPC.Chat chat = (TLRPC.Chat) c4cVar.H;
        View.OnClickListener onClickListener = c4cVar.E;
        y81Var.c = chat;
        ls8 ls8Var = y81Var.b;
        ls8Var.setTag(Long.valueOf(chat.id));
        y81Var.a.z(chat, null, null, (!hc2.T(chat) || chat.megagroup) ? chat.has_geo ? k96.M0(2131748450, null) : !hc2.t0(chat) ? k96.M0(2131748449, null).toLowerCase() : k96.M0(2131748446, null).toLowerCase() : !hc2.t0(chat) ? k96.M0(2131752317, null).toLowerCase() : k96.M0(2131752306, null).toLowerCase(), false, false);
        ls8Var.setOnClickListener(onClickListener);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new y81(context);
    }
}
