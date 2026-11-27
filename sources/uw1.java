// default package

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uw1 implements View.OnClickListener {
    public final /* synthetic */ zu1 a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public uw1(ChatActivityEnterView chatActivityEnterView, zu1 zu1Var, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = zu1Var;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i;
        ChatActivityEnterView chatActivityEnterView = this.c;
        ImageView imageView = chatActivityEnterView.x2;
        zu1 zu1Var = this.a;
        if (zu1Var == null) {
            return;
        }
        chatActivityEnterView.V2 = !chatActivityEnterView.V2;
        c43 c43Var = chatActivityEnterView.f0;
        if (c43Var == null) {
            c43Var = new c43(this.b, R.drawable.input_notify_on, aob.Nl);
            chatActivityEnterView.f0 = c43Var;
        }
        c43Var.a(chatActivityEnterView.V2, true);
        imageView.setImageDrawable(chatActivityEnterView.f0);
        uc7.s1(chatActivityEnterView.R).X3.edit().putBoolean("silent_" + chatActivityEnterView.F3, chatActivityEnterView.V2).commit();
        ip7.n(chatActivityEnterView.R).c0(chatActivityEnterView.F3, zu1Var.c(), true);
        zu1Var.i6();
        UndoView undoView = zu1Var.N3;
        if (undoView != null) {
            undoView.j(!chatActivityEnterView.V2 ? 54 : 55, 0L, null);
        }
        if (chatActivityEnterView.V2) {
            str = "AccDescrChanSilentOn";
            i = 2131754902;
        } else {
            str = "AccDescrChanSilentOff";
            i = 2131754903;
        }
        imageView.setContentDescription(ob6.M0(i, str));
        chatActivityEnterView.y2(true);
    }
}
