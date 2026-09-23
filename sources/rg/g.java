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
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.w9;
import org.telegram.ui.zf0;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class g extends FrameLayout {
    public final w9 a;
    public final p20 b;
    public final int c;
    public final /* synthetic */ j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        p20 p20Var = new p20();
        this.b = p20Var;
        int i10 = jVar.f;
        d6 d6Var = jVar.a;
        if (i10 == 0) {
            this.c = AndroidUtilities.dp(150.0f);
            w9 w9Var = new w9(context);
            this.a = w9Var;
            w9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(w9Var, x5.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            h9 h9Var = new h9((d6) null);
            h9Var.r(currentUser);
            w9Var.getImageReceiver().setForUserOrChat(currentUser, h9Var);
            TextView textView = new TextView(context);
            e2.l(20.0f, 1, textView);
            textView.setTextColor(h6.v0(h6.G6, d6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, x5.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            p20Var.m = true;
            p20Var.a = true;
            p20Var.d(h6.w0(null, h6.Mj, false), h6.w0(null, h6.Lj, false), 0, 0);
            p20Var.c.setStyle(Paint.Style.STROKE);
            p20Var.c.setStrokeCap(Paint.Cap.ROUND);
            p20Var.c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
            return;
        }
        if (i10 == 1) {
            ei.f fVar = new ei.f(context, 4);
            addView(fVar, x5.e(-1, 190, 55));
            zf0 zf0Var = new zf0(context, 1, 1, 1);
            zf0Var.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = h6.Mj;
            canvas.drawColor(i0.a.d(0.5f, h6.v0(i11, d6Var), h6.v0(h6.h5, d6Var)));
            zf0Var.setBackgroundBitmap(createBitmap);
            sg.a aVar = zf0Var.b;
            aVar.w = i11;
            aVar.x = h6.Lj;
            aVar.b();
            addView(zf0Var, x5.e(160, 160, 1));
            zf0Var.j(100L);
            TextView g10 = org.telegram.messenger.z0.g(context, 1, 20.0f);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextColor(h6.v0(h6.G6, d6Var));
            ul.l(R.string.TelegramBusiness, g10, 17);
            addView(g10, x5.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(h6.v0(h6.z6, d6Var));
            ul.l(R.string.TelegramBusinessSubtitle2, textView2, 17);
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
            p20 p20Var = this.b;
            p20Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f7) - f11) - f12, false, p20Var.c);
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
