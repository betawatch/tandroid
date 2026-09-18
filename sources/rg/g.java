package rg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.u9;
import org.telegram.ui.gg0;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g extends FrameLayout {
    public final u9 a;
    public final o20 b;
    public final int c;
    public final /* synthetic */ j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        o20 o20Var = new o20();
        this.b = o20Var;
        int i10 = jVar.f;
        f6 f6Var = jVar.a;
        if (i10 == 0) {
            this.c = AndroidUtilities.dp(150.0f);
            u9 u9Var = new u9(context);
            this.a = u9Var;
            u9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(u9Var, x5.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            f9 f9Var = new f9((f6) null);
            f9Var.r(currentUser);
            u9Var.getImageReceiver().setForUserOrChat(currentUser, f9Var);
            TextView textView = new TextView(context);
            e2.l(20.0f, 1, textView);
            textView.setTextColor(j6.v0(j6.G6, f6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, x5.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            o20Var.m = true;
            o20Var.a = true;
            o20Var.d(j6.w0(null, j6.Mj, false), j6.w0(null, j6.Lj, false), 0, 0);
            o20Var.c.setStyle(Paint.Style.STROKE);
            o20Var.c.setStrokeCap(Paint.Cap.ROUND);
            o20Var.c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
            return;
        }
        if (i10 == 1) {
            ei.f fVar = new ei.f(context, 4);
            addView(fVar, x5.e(-1, 190, 55));
            gg0 gg0Var = new gg0(context, 1, 1, 1);
            gg0Var.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = j6.Mj;
            canvas.drawColor(i0.a.d(0.5f, j6.v0(i11, f6Var), j6.v0(j6.h5, f6Var)));
            gg0Var.setBackgroundBitmap(createBitmap);
            sg.a aVar = gg0Var.b;
            aVar.w = i11;
            aVar.x = j6.Lj;
            aVar.b();
            addView(gg0Var, x5.e(160, 160, 1));
            gg0Var.j(100L);
            TextView g10 = org.telegram.messenger.w1.g(context, 1, 20.0f);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextColor(j6.v0(j6.G6, f6Var));
            wl.k(R.string.TelegramBusiness, g10, 17);
            addView(g10, x5.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(j6.v0(j6.z6, f6Var));
            wl.k(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, x5.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            o20 o20Var = this.b;
            o20Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f7) - f11) - f12, false, o20Var.c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
