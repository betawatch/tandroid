package zf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z10;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g extends FrameLayout {
    public final o9 a;
    public final z10 b;
    public final int c;
    public final /* synthetic */ j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        z10 z10Var = new z10();
        this.b = z10Var;
        int i9 = jVar.f;
        b6 b6Var = jVar.a;
        if (i9 == 0) {
            this.c = AndroidUtilities.dp(150.0f);
            o9 o9Var = new o9(context);
            this.a = o9Var;
            o9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(o9Var, e6.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            z8 z8Var = new z8((b6) null);
            z8Var.r(currentUser);
            o9Var.getImageReceiver().setForUserOrChat(currentUser, z8Var);
            TextView textView = new TextView(context);
            j3.r0.u(20.0f, 1, textView);
            textView.setTextColor(f6.v0(f6.G6, b6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, e6.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            z10Var.m = true;
            z10Var.a = true;
            z10Var.d(f6.w0(null, f6.Mj, false), f6.w0(null, f6.Lj, false), 0, 0);
            z10Var.c.setStyle(Paint.Style.STROKE);
            z10Var.c.setStrokeCap(Paint.Cap.ROUND);
            z10Var.c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
            return;
        }
        if (i9 == 1) {
            mh.f fVar = new mh.f(context, 4);
            addView(fVar, e6.e(-1, 190, 55));
            dg.q qVar = new dg.q(context, 1, 1, 3);
            qVar.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i10 = f6.Mj;
            canvas.drawColor(i0.a.d(0.5f, f6.v0(i10, b6Var), f6.v0(f6.h5, b6Var)));
            qVar.setBackgroundBitmap(createBitmap);
            ag.a aVar = qVar.b;
            aVar.w = i10;
            aVar.x = f6.Lj;
            aVar.b();
            addView(qVar, e6.e(160, 160, 1));
            qVar.j(100L);
            TextView g10 = org.telegram.messenger.l0.g(context, 1, 20.0f);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextColor(f6.v0(f6.G6, b6Var));
            ll.l(R.string.TelegramBusiness, g10, 17);
            addView(g10, e6.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(f6.v0(f6.z6, b6Var));
            ll.l(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, e6.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
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
            z10 z10Var = this.b;
            z10Var.c(rectF);
            float f10 = 360.0f / 7;
            for (int i9 = 0; i9 < 7; i9++) {
                float f11 = (i9 * f10) - 90.0f;
                float f12 = 5;
                float f13 = f11 + f12;
                canvas.drawArc(AndroidUtilities.rectTmp, f13, ((f11 + f10) - f12) - f13, false, z10Var.c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11 = this.c;
        if (i11 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30);
        }
        super.onMeasure(i9, i10);
    }
}
