package qh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class e5 extends FrameLayout {
    public final int a;
    public int b;
    public final eg.t3 c;
    public final FrameLayout d;
    public final oh.a8 e;
    public boolean f;
    public boolean h;

    public e5(Activity activity, int i10, oh.b bVar) {
        super(activity);
        this.b = 1;
        this.f = false;
        this.h = false;
        this.a = i10;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        eg.t3 t3Var = new eg.t3(this, getContext());
        this.c = t3Var;
        oh.b4 b4Var = new oh.b4(getContext(), null);
        b4Var.a.getAvatarDrawable().m(i10, currentUser);
        oh.a4 a4Var = b4Var.a;
        a4Var.e(currentUser, a4Var.getAvatarDrawable());
        b4Var.b.l(Emoji.replaceEmoji(UserObject.getUserName(currentUser), b4Var.b.getPaint().getFontMetricsInt(), false), false);
        b4Var.c(LocaleController.getString(R.string.RightNow), false);
        t3Var.addView(b4Var, k7.c6.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        t3Var.addView(imageView, k7.c6.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(t3Var, k7.c6.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        oh.a8 a8Var = new oh.a8(getContext(), bVar);
        this.e = a8Var;
        a8Var.p0 = true;
        a8Var.setTranslationY(AndroidUtilities.dp(8.0f));
        frameLayout.addView(a8Var, k7.c6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, k7.c6.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(22.0f), i0.a.k(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(LocaleController.getString(R.string.ReplyPrivately));
        frameLayout2.addView(textView, k7.c6.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, k7.c6.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, k7.c6.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, k7.c6.c(-1.0f, -1));
        t3Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z4, boolean z10, FrameLayout frameLayout) {
        if (z4) {
            if (this.f == z10) {
                return;
            } else {
                this.f = z10;
            }
        } else if (this.h == z10) {
            return;
        } else {
            this.h = z10;
        }
        View view = z4 ? this.c : this.d;
        view.clearAnimation();
        view.animate().alpha(z10 ? z4 ? 0.5f : 0.2f : 0.0f).start();
        if (frameLayout != null) {
            frameLayout.clearAnimation();
            frameLayout.animate().alpha(z10 ? 0.0f : 1.0f).start();
        }
    }

    public final void b(CharSequence charSequence) {
        this.e.V.b(org.telegram.ui.Components.u5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
