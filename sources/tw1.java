// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class tw1 extends iz1 {
    public final /* synthetic */ ChatActivityEnterView G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw1(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.G = chatActivityEnterView;
    }

    @Override // iz1, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.G;
        Paint paint = chatActivityEnterView.F2;
        float[] fArr = chatActivityEnterView.f7;
        float[] fArr2 = chatActivityEnterView.e7;
        int i = ChatActivityEnterView.X7;
        if (!chatActivityEnterView.q0()) {
            super.onDraw(canvas);
            if (getTag() == null || chatActivityEnterView.e2 == null || chatActivityEnterView.X0 || this.x || ls6.d0(chatActivityEnterView.R).v0[0].isEmpty() || paint == null) {
                return;
            }
            canvas.drawCircle(hl.L(9.0f) + (getWidth() / 2), (getHeight() / 2) - hl.L(8.0f), hl.L(5.0f), paint);
            return;
        }
        if (chatActivityEnterView.d7 == null) {
            b29 b29Var = new b29(R.raw.chat_audio_record_delete_outline, hl.L(28.0f), hl.L(28.0f), false, null);
            chatActivityEnterView.d7 = b29Var;
            b29Var.E(true);
            chatActivityEnterView.d7.p0 = false;
            int J0 = chatActivityEnterView.J0(aob.Vf);
            b29 b29Var2 = chatActivityEnterView.d7;
            b29Var2.a0 = true;
            b29Var2.L(J0, "Cup Grey");
            chatActivityEnterView.d7.L(J0, "Box_Grey 2");
            chatActivityEnterView.d7.L(J0, "Box Grey");
            chatActivityEnterView.d7.j();
            chatActivityEnterView.d7.M(this);
            chatActivityEnterView.d7.O(true, 0.0f);
        }
        b29 b29Var3 = chatActivityEnterView.d7;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float scaleX = getScaleX() != 0.0f ? getScaleX() : 1.0f;
        float scaleY = getScaleY() != 0.0f ? getScaleY() : 1.0f;
        if (chatActivityEnterView.k0(chatActivityEnterView.a2, fArr2) && chatActivityEnterView.k0(this, fArr)) {
            width = bp1.z(fArr2[0], fArr[0], scaleX, width);
        }
        float L = hl.L(14.0f) / scaleX;
        float L2 = hl.L(14.0f) / scaleY;
        b29Var3.setBounds(Math.round(width - L), Math.round(height - L2), Math.round(width + L), Math.round(height + L2));
        b29Var3.draw(canvas);
    }
}
