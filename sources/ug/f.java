package ug;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.qd;
import c8.ha;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.v8;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public final k9 a;
    public final e10 b;
    public final int c;
    public final /* synthetic */ i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Context context) {
        super(context);
        this.d = iVar;
        e10 e10Var = new e10();
        this.b = e10Var;
        int i7 = iVar.f;
        h6 h6Var = iVar.a;
        if (i7 == 0) {
            this.c = org.telegram.messenger.g0.L(150.0f);
            k9 k9Var = new k9(context);
            this.a = k9Var;
            k9Var.setRoundRadius((int) (org.telegram.messenger.g0.L(65.0f) / 2.0f));
            addView(k9Var, ha.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User f10 = p10.i(p10.s0).f();
            v8 v8Var = new v8((h6) null);
            v8Var.r(f10);
            k9Var.getImageReceiver().i0(f10, v8Var, null);
            TextView textView = new TextView(context);
            com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
            org.telegram.messenger.camera.q.o(textView, m6.G6, h6Var, null, 2131743805);
            addView(textView, ha.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            e10Var.m = true;
            e10Var.a = true;
            e10Var.d(m6.x0(null, m6.Ak, false), m6.x0(null, m6.zk, false), 0, 0);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = e10Var.c;
            paint.setStyle(style);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.g0.N(3.3f));
            return;
        }
        if (i7 == 1) {
            hi.e eVar = new hi.e(context, 4);
            addView(eVar, ha.e(-1, qs.U2, 55));
            qd qdVar = new qd(context, 1, 1, 3);
            qdVar.setStarParticlesView(eVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i10 = m6.Ak;
            canvas.drawColor(i0.a.f(0.5f, m6.w0(i10, h6Var), m6.w0(m6.h5, h6Var)));
            qdVar.setBackgroundBitmap(createBitmap);
            vg.f fVar = qdVar.b;
            fVar.z = i10;
            fVar.A = m6.zk;
            fVar.b();
            addView(qdVar, ha.e(qs.q2, qs.q2, 1));
            qdVar.m(100L);
            TextView g10 = k5.g(context, 1, 20.0f);
            g10.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.messenger.camera.q.o(g10, m6.G6, h6Var, null, 2131744252);
            g10.setGravity(17);
            addView(g10, ha.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            org.telegram.messenger.camera.q.o(textView2, m6.z6, h6Var, null, 2131744248);
            textView2.setGravity(17);
            addView(textView2, ha.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f == 0) {
            Rect rect = org.telegram.messenger.g0.Q;
            this.a.getHitRect(rect);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            rectF.inset(-org.telegram.messenger.g0.L(5.0f), -org.telegram.messenger.g0.L(5.0f));
            e10 e10Var = this.b;
            e10Var.c(rectF);
            float f10 = 360.0f / 7;
            for (int i7 = 0; i7 < 7; i7++) {
                float f11 = (i7 * f10) - 90.0f;
                float f12 = 5;
                float f13 = f11 + f12;
                canvas.drawArc(org.telegram.messenger.g0.P, f13, ((f11 + f10) - f12) - f13, false, e10Var.c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = this.c;
        if (i11 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }
}
