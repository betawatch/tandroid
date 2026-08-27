package qf;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import h7.z5;
import lh.c5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.y8;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g extends FrameLayout {
    public final int a;
    public final y8 b;
    public final n9 c;
    public final LinearLayout d;
    public final j6 e;
    public final j6 f;
    public final rp h;
    public final ImageView n;
    public boolean r;
    public long s;
    public long v;
    public int w;
    public String x;
    public float y;

    public g(Activity activity, c6 c6Var, rn rnVar) {
        super(activity);
        this.a = rnVar.getCurrentAccount();
        this.r = false;
        n9 n9Var = new n9(activity);
        this.c = n9Var;
        TLRPC.User user = rnVar.getMessagesController().getUser(Long.valueOf(this.v));
        y8 y8Var = new y8((c6) null);
        this.b = y8Var;
        y8Var.r(user);
        n9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        n9Var.e(user, y8Var);
        addView(n9Var, z5.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        j6 j6Var = new j6(activity, false, false, false);
        this.e = j6Var;
        j6Var.n = false;
        j6Var.getDrawable().o(true, false, false);
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setText(UserObject.getUserName(user));
        j6Var.setTextColor(g6.v0(g6.G6, c6Var));
        j6Var.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var, z5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        j6 j6Var2 = new j6(activity, false, false, false);
        this.f = j6Var2;
        j6Var2.n = false;
        j6Var2.getDrawable().o(true, false, false);
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        j6Var2.setTextColor(g6.v0(g6.ge, c6Var));
        j6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var2, z5.n(-1, 17));
        addView(linearLayout, z5.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        rp rpVar = new rp(activity);
        this.h = rpVar;
        rpVar.getDrawable().o(true, true, false);
        rpVar.b(0.75f, 350L, er.h);
        rpVar.setScaleProperty(0.6f);
        rpVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i10 = g6.Oh;
        int v02 = g6.v0(i10, c6Var);
        int v = g6.v(g6.v0(i10, c6Var), g6.l1(0.12f, -1));
        rpVar.setBackgroundDrawable(g6.i0(dp, dp, dp, dp, v02, v, v));
        rpVar.setTextSize(AndroidUtilities.dp(14.0f));
        rpVar.setGravity(5);
        rpVar.setTextColor(g6.v0(g6.Sh, c6Var));
        rpVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        rpVar.setOnClickListener(new c5(this, 19));
        rpVar.setOnWidthUpdatedListener(new f(this, 0));
        rpVar.setText(LocaleController.getString(this.r ? R.string.BizBotStart : R.string.BizBotStop));
        addView(rpVar, z5.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(g6.M(g6.v0(g6.i6, c6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.de, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ld0(this, rnVar, c6Var, 4));
        addView(imageView, z5.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f10 = this.y;
        float d = this.h.getDrawable().d() + f10 + r1.getPaddingLeft() + r1.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.e.setRightPadding(d);
        this.f.setRightPadding(d);
    }

    public void setLeftMargin(float f10) {
        this.y = f10;
        this.c.setTranslationX(f10);
        this.d.setTranslationX(f10);
        a();
    }
}
