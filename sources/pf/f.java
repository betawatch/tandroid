package pf;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import g7.e6;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.z8;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public final int a;
    public final z8 b;
    public final o9 c;
    public final LinearLayout d;
    public final j6 e;
    public final j6 f;
    public final tp h;
    public final ImageView n;
    public boolean r;
    public long s;
    public long v;
    public int w;
    public String x;
    public float y;

    public f(Activity activity, b6 b6Var, qn qnVar) {
        super(activity);
        this.a = qnVar.getCurrentAccount();
        this.r = false;
        o9 o9Var = new o9(activity);
        this.c = o9Var;
        TLRPC.User user = qnVar.getMessagesController().getUser(Long.valueOf(this.v));
        z8 z8Var = new z8((b6) null);
        this.b = z8Var;
        z8Var.r(user);
        o9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        o9Var.e(user, z8Var);
        addView(o9Var, e6.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
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
        j6Var.setTextColor(f6.v0(f6.G6, b6Var));
        j6Var.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var, e6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        j6 j6Var2 = new j6(activity, false, false, false);
        this.f = j6Var2;
        j6Var2.n = false;
        j6Var2.getDrawable().o(true, false, false);
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        j6Var2.setTextColor(f6.v0(f6.ge, b6Var));
        j6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var2, e6.n(-1, 17));
        addView(linearLayout, e6.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        tp tpVar = new tp(activity);
        this.h = tpVar;
        tpVar.getDrawable().o(true, true, false);
        tpVar.b(0.75f, 350L, gr.h);
        tpVar.setScaleProperty(0.6f);
        tpVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i9 = f6.Oh;
        int v02 = f6.v0(i9, b6Var);
        int v = f6.v(f6.v0(i9, b6Var), f6.l1(0.12f, -1));
        tpVar.setBackgroundDrawable(f6.i0(dp, dp, dp, dp, v02, v, v));
        tpVar.setTextSize(AndroidUtilities.dp(14.0f));
        tpVar.setGravity(5);
        tpVar.setTextColor(f6.v0(f6.Sh, b6Var));
        tpVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        tpVar.setOnClickListener(new x8(this, 17));
        tpVar.setOnWidthUpdatedListener(new e(this, 0));
        tpVar.setText(LocaleController.getString(this.r ? R.string.BizBotStart : R.string.BizBotStop));
        addView(tpVar, e6.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(f6.M(f6.v0(f6.i6, b6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.de, b6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new gd0(this, qnVar, b6Var, 4));
        addView(imageView, e6.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
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
