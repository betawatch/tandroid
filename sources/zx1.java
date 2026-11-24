// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zx1 extends d02 {
    public final Rect G;
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx1(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity, 24);
        this.H = chatActivityEnterView;
        this.G = new Rect();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i = ChatActivityEnterView.z7;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.g0()) {
            if (chatActivityEnterView.p1 == null) {
                Drawable mutate = getResources().getDrawable(R.drawable.input_dictation).mutate();
                chatActivityEnterView.p1 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            int L = gm.L(12.0f);
            chatActivityEnterView.p1.setBounds(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
            chatActivityEnterView.p1.draw(canvas);
            return;
        }
        if (!chatActivityEnterView.b1) {
            super.draw(canvas);
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Rect rect = this.G;
        rect.set(0, 0, measuredWidth2, measuredHeight2);
        rect.inset(gm.L(7.5f), gm.L(7.5f));
        Drawable drawable = getCurrentState() == b02.b ? chatActivityEnterView.D4 : chatActivityEnterView.C4;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
