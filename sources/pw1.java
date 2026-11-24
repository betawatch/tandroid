// default package

import android.content.Context;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pw1 extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public final float getTranslationX() {
        return this.a;
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        this.a = f;
        float L = gl.L(-44.0f) + this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        float f2 = L + chatActivityEnterView.E + chatActivityEnterView.y;
        gw1 gw1Var = chatActivityEnterView.A2;
        float L2 = gl.L((gw1Var == null || gw1Var.getVisibility() != 0) ? 0.0f : -44.0f);
        gw1 gw1Var2 = chatActivityEnterView.A2;
        float alpha = (L2 * (gw1Var2 == null ? 0.0f : gw1Var2.getAlpha())) + f2;
        gw1 gw1Var3 = chatActivityEnterView.n2;
        float L3 = gl.L((gw1Var3 == null || gw1Var3.getVisibility() != 0) ? 0.0f : -44.0f);
        gw1 gw1Var4 = chatActivityEnterView.n2;
        super.setTranslationX((L3 * (gw1Var4 != null ? gw1Var4.getAlpha() : 0.0f)) + alpha);
    }
}
