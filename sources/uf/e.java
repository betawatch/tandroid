package uf;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.z8;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public final int a;
    public final z8 b;
    public final p9 c;
    public final LinearLayout d;
    public final k6 e;
    public final k6 f;
    public final aq h;
    public final ImageView n;
    public boolean r;
    public long s;
    public long v;
    public int w;
    public String x;
    public float y;

    public e(Activity activity, f6 f6Var, zn znVar) {
        super(activity);
        this.a = znVar.getCurrentAccount();
        this.r = false;
        p9 p9Var = new p9(activity);
        this.c = p9Var;
        TLRPC.User user = znVar.getMessagesController().getUser(Long.valueOf(this.v));
        z8 z8Var = new z8((f6) null);
        this.b = z8Var;
        z8Var.r(user);
        p9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        p9Var.e(user, z8Var);
        addView(p9Var, b6.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        k6 k6Var = new k6(activity, false, false, false);
        this.e = k6Var;
        k6Var.n = false;
        k6Var.getDrawable().o(true, false, false);
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setText(UserObject.getUserName(user));
        k6Var.setTextColor(j6.v0(j6.G6, f6Var));
        k6Var.setEllipsizeByGradient(true);
        linearLayout.addView(k6Var, b6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        k6 k6Var2 = new k6(activity, false, false, false);
        this.f = k6Var2;
        k6Var2.n = false;
        k6Var2.getDrawable().o(true, false, false);
        k6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        k6Var2.setTextColor(j6.v0(j6.ge, f6Var));
        k6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(k6Var2, b6.n(-1, 17));
        addView(linearLayout, b6.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        aq aqVar = new aq(activity);
        this.h = aqVar;
        aqVar.getDrawable().o(true, true, false);
        aqVar.b(0.75f, 350L, mr.h);
        aqVar.setScaleProperty(0.6f);
        aqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i10 = j6.Oh;
        int v02 = j6.v0(i10, f6Var);
        int v = j6.v(j6.v0(i10, f6Var), j6.l1(0.12f, -1));
        aqVar.setBackgroundDrawable(j6.i0(dp, dp, dp, dp, v02, v, v));
        aqVar.setTextSize(AndroidUtilities.dp(14.0f));
        aqVar.setGravity(5);
        aqVar.setTextColor(j6.v0(j6.Sh, f6Var));
        aqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        aqVar.setOnClickListener(new oh.n(this, 23));
        aqVar.setOnWidthUpdatedListener(new d(this, 0));
        aqVar.setText(LocaleController.getString(this.r ? R.string.BizBotStart : R.string.BizBotStop));
        addView(aqVar, b6.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(j6.M(j6.v0(j6.i6, f6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.de, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new q31(this, znVar, f6Var, 5));
        addView(imageView, b6.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
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
