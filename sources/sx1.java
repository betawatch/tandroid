// default package

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sx1 implements View.OnClickListener {
    public final /* synthetic */ yv1 a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public sx1(ChatActivityEnterView chatActivityEnterView, yv1 yv1Var, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = yv1Var;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i;
        ChatActivityEnterView chatActivityEnterView = this.c;
        ImageView imageView = chatActivityEnterView.y2;
        yv1 yv1Var = this.a;
        if (yv1Var == null) {
            return;
        }
        chatActivityEnterView.W2 = !chatActivityEnterView.W2;
        v43 v43Var = chatActivityEnterView.f0;
        if (v43Var == null) {
            v43Var = new v43(this.b, R.drawable.input_notify_on, cmb.Ml);
            chatActivityEnterView.f0 = v43Var;
        }
        v43Var.a(chatActivityEnterView.W2, true);
        imageView.setImageDrawable(chatActivityEnterView.f0);
        oc7.r1(chatActivityEnterView.R).W3.edit().putBoolean("silent_" + chatActivityEnterView.G3, chatActivityEnterView.W2).commit();
        lo7.n(chatActivityEnterView.R).c0(chatActivityEnterView.G3, yv1Var.d(), true);
        yv1Var.i6();
        UndoView undoView = yv1Var.N3;
        if (undoView != null) {
            undoView.j(!chatActivityEnterView.W2 ? 54 : 55, 0L, null);
        }
        if (chatActivityEnterView.W2) {
            str = "AccDescrChanSilentOn";
            i = 2131754906;
        } else {
            str = "AccDescrChanSilentOff";
            i = 2131754907;
        }
        imageView.setContentDescription(jb6.M0(i, str));
        chatActivityEnterView.r2(true);
    }
}
