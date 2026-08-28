package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.o;
import bg.q1;
import ff.q0;
import ff.r0;
import g7.e6;
import g7.g6;
import gh.z0;
import java.util.HashSet;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t30;
import org.telegram.ui.oe;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class e extends FrameLayout implements td.b {
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final RectF G;
    public float A;
    public final Paint B;
    public int C;
    public final o[] a;
    public final View.OnClickListener[] b;
    public final oe[] c;
    public d d;
    public final FrameLayout e;
    public final HashSet f;
    public final b6 h;
    public final ig.a n;
    public final lg.a r;
    public kg.d s;
    public final td.a v;
    public final td.a w;
    public float x;
    public float y;

    static {
        int i9 = R.drawable.msg_search;
        int i10 = R.drawable.input_gift_s;
        int i11 = R.drawable.input_message;
        int i12 = R.drawable.msg_help;
        D = new int[]{i9, i10, i11, i12, i12};
        E = new int[]{0};
        F = new int[]{1, 2, 3, 4};
        G = new RectF();
    }

    public e(Context context, ig.a aVar, lg.a aVar2, b6 b6Var) {
        super(context);
        this.a = new o[5];
        this.b = new View.OnClickListener[5];
        this.c = new oe[5];
        this.f = new HashSet();
        gr grVar = gr.h;
        this.v = new td.a(99, this, grVar, 320L, false);
        this.w = new td.a(100, this, grVar, 320L, false);
        this.B = new Paint(1);
        this.C = 0;
        this.n = aVar;
        this.r = aVar2;
        this.h = b6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(22.0f);
        q1 q1Var = r0.a;
        frameLayout.setOutlineProvider(new q0(0, dp));
        addView(frameLayout, e6.e(-1, 44, 16));
    }

    @Override // td.b
    public final void B(float f10, int i9) {
        o oVar;
        x3 x3Var;
        if (i9 == 99 || i9 == 100) {
            invalidate();
        }
        int i10 = i9 >> 16;
        int i11 = i9 & 65535;
        if (i10 >= 0) {
            o[] oVarArr = this.a;
            if (i10 >= oVarArr.length || (oVar = oVarArr[i10]) == null || i11 != 1 || !((td.a) oVar.c).f) {
                return;
            }
            oe oeVar = this.c[i10];
            if (oeVar != null) {
                final qg.a aVar = (qg.a) oVar.b;
                boolean z10 = oVar.a;
                int i12 = oeVar.a;
                final qn qnVar = oeVar.b;
                switch (i12) {
                    case 24:
                        if (qnVar.F0 == null && !z10 && (((x3Var = qnVar.H0) == null || !x3Var.R) && t30.h.c())) {
                            final int i13 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.te
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            qn qnVar2 = qnVar;
                                            if (qnVar2.getParentActivity() != null) {
                                                float f11 = qnVar2.v.e(2).d / AndroidUtilities.density;
                                                float width = ((r3.getWidth() / 2.0f) + (qnVar2.T0.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                kh.x3 x3Var2 = new kh.x3(qnVar2.getParentActivity(), 3);
                                                qnVar2.H0 = x3Var2;
                                                x3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                qnVar2.H0.q(false);
                                                kh.x3 x3Var3 = qnVar2.H0;
                                                String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                if (x3Var3.getMeasuredWidth() < 0) {
                                                    x3Var3.C = string;
                                                } else {
                                                    x3Var3.D.q(string, !LocaleController.isRTL, true);
                                                }
                                                qnVar2.H0.m(1.0f, (-width) + 7.33f);
                                                qnVar2.T0.addView(qnVar2.H0, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                kh.x3 x3Var4 = qnVar2.H0;
                                                x3Var4.h0 = new gf(qnVar2, 21);
                                                x3Var4.v();
                                                org.telegram.ui.Components.t30.f.b();
                                                break;
                                            }
                                            break;
                                        default:
                                            qn qnVar3 = qnVar;
                                            if (qnVar3.getParentActivity() != null) {
                                                float f12 = qnVar3.v.e(2).d / AndroidUtilities.density;
                                                float width2 = ((r3.getWidth() / 2.0f) + (qnVar3.T0.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                kh.x3 x3Var5 = new kh.x3(qnVar3.getParentActivity(), 3);
                                                qnVar3.F0 = x3Var5;
                                                x3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                qnVar3.F0.q(false);
                                                qnVar3.F0.t(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                qnVar3.F0.m(1.0f, (-width2) + 7.33f);
                                                qnVar3.T0.addView(qnVar3.F0, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                kh.x3 x3Var6 = qnVar3.F0;
                                                x3Var6.h0 = new jg(qnVar3, 0);
                                                x3Var6.v();
                                                org.telegram.ui.Components.t30.h.b();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, 400L);
                            break;
                        }
                        break;
                    default:
                        if (qnVar.H0 == null && !z10 && t30.f.c()) {
                            final int i14 = 0;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.te
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            qn qnVar2 = qnVar;
                                            if (qnVar2.getParentActivity() != null) {
                                                float f11 = qnVar2.v.e(2).d / AndroidUtilities.density;
                                                float width = ((r3.getWidth() / 2.0f) + (qnVar2.T0.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                kh.x3 x3Var2 = new kh.x3(qnVar2.getParentActivity(), 3);
                                                qnVar2.H0 = x3Var2;
                                                x3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                qnVar2.H0.q(false);
                                                kh.x3 x3Var3 = qnVar2.H0;
                                                String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                if (x3Var3.getMeasuredWidth() < 0) {
                                                    x3Var3.C = string;
                                                } else {
                                                    x3Var3.D.q(string, !LocaleController.isRTL, true);
                                                }
                                                qnVar2.H0.m(1.0f, (-width) + 7.33f);
                                                qnVar2.T0.addView(qnVar2.H0, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                kh.x3 x3Var4 = qnVar2.H0;
                                                x3Var4.h0 = new gf(qnVar2, 21);
                                                x3Var4.v();
                                                org.telegram.ui.Components.t30.f.b();
                                                break;
                                            }
                                            break;
                                        default:
                                            qn qnVar3 = qnVar;
                                            if (qnVar3.getParentActivity() != null) {
                                                float f12 = qnVar3.v.e(2).d / AndroidUtilities.density;
                                                float width2 = ((r3.getWidth() / 2.0f) + (qnVar3.T0.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                kh.x3 x3Var5 = new kh.x3(qnVar3.getParentActivity(), 3);
                                                qnVar3.F0 = x3Var5;
                                                x3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                qnVar3.F0.q(false);
                                                qnVar3.F0.t(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                qnVar3.F0.m(1.0f, (-width2) + 7.33f);
                                                qnVar3.T0.addView(qnVar3.F0, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                kh.x3 x3Var6 = qnVar3.F0;
                                                x3Var6.h0 = new jg(qnVar3, 0);
                                                x3Var6.v();
                                                org.telegram.ui.Components.t30.h.b();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, 400L);
                            break;
                        }
                        break;
                }
            }
            oVar.a = true;
        }
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 99) {
            invalidate();
            return;
        }
        if (i9 == 100) {
            a();
            invalidate();
        }
        int i10 = i9 >> 16;
        int i11 = i9 & 65535;
        if (i10 >= 0) {
            o[] oVarArr = this.a;
            if (i10 >= oVarArr.length || oVarArr[i10] == null || i11 != 1) {
                return;
            }
            b(true);
            a();
            invalidate();
        }
    }

    public final void a() {
        int[] iArr;
        float f10 = 0.0f;
        this.y = 0.0f;
        this.A = 0.0f;
        o[] oVarArr = this.a;
        for (o oVar : oVarArr) {
            if (oVar != null) {
                qg.a aVar = (qg.a) oVar.b;
                float f11 = ((td.a) oVar.c).e * this.x;
                aVar.setVisibility(f11 > 0.0f ? 0 : 8);
                aVar.setAlpha(f11);
                aVar.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
                aVar.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
            }
        }
        int[] iArr2 = E;
        o oVar2 = oVarArr[iArr2[0]];
        if (oVar2 != null) {
            float dp = ((td.a) oVar2.c).e * AndroidUtilities.dp(54.0f);
            ((qg.a) oVar2.b).setTranslationX(AndroidUtilities.dp(1.0f) + this.y);
            this.y += dp;
        }
        int i9 = 0;
        while (true) {
            iArr = F;
            if (i9 >= 4) {
                break;
            }
            o oVar3 = oVarArr[iArr[i9]];
            if (oVar3 != null) {
                qg.a aVar2 = (qg.a) oVar3.b;
                float dp2 = ((td.a) oVar3.c).e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.A);
                this.A += dp2;
            }
            i9++;
        }
        if (this.x < 1.0f) {
            o oVar4 = oVarArr[iArr2[0]];
            if (oVar4 != null) {
                qg.a aVar3 = (qg.a) oVar4.b;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.x) * this.y));
            }
            for (int i10 = 0; i10 < 4; i10++) {
                o oVar5 = oVarArr[iArr[i10]];
                if (oVar5 != null) {
                    qg.a aVar4 = (qg.a) oVar5.b;
                    aVar4.setTranslationX(((1.0f - this.x) * this.A) + aVar4.getTranslationX());
                }
            }
            float f12 = this.y;
            float f13 = this.x;
            this.y = f12 * f13;
            this.A *= f13;
        }
        float f14 = this.w.e;
        if (f14 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i11 = 0; i11 < getContainer().getChildCount(); i11++) {
                if (this.f.contains(getContainer().getChildAt(i11))) {
                    measuredWidth = Math.min(measuredWidth, r4.getLeft());
                    f10 = Math.max(f10, r4.getRight());
                }
            }
            if (measuredWidth > f10) {
                f10 = (measuredWidth + f10) / 2.0f;
                measuredWidth = f10;
            }
            this.y = AndroidUtilities.lerp(this.y, measuredWidth - AndroidUtilities.dp(3.33f), f14);
            this.A = AndroidUtilities.lerp(this.A, (getMeasuredWidth() - f10) - AndroidUtilities.dp(17.66f), f14);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f15 = this.y;
            float f16 = this.A;
            pg.f fVar = ((oe) dVar).b.O;
            fVar.x = f15;
            fVar.y = f16;
            fVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i9 = E[0];
        o[] oVarArr = this.a;
        o oVar = oVarArr[i9];
        if (oVar != null) {
            dp += ((td.a) oVar.c).f ? AndroidUtilities.dp(54.0f) : 0;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            o oVar2 = oVarArr[F[i10]];
            if (oVar2 != null) {
                dp2 += ((td.a) oVar2.c).f ? AndroidUtilities.dp(54.0f) : 0;
            }
        }
        FrameLayout frameLayout = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin == dp && marginLayoutParams.rightMargin == dp2) {
            return;
        }
        marginLayoutParams.leftMargin = dp;
        marginLayoutParams.rightMargin = dp2;
        if (z10) {
            frameLayout.requestLayout();
        }
    }

    public final void c(int i9, boolean z10, boolean z11) {
        o oVar;
        if (i9 >= 0) {
            o[] oVarArr = this.a;
            if (i9 < oVarArr.length && ((oVar = oVarArr[i9]) != null || z10)) {
                if (oVar == null) {
                    td.a aVar = new td.a((i9 << 16) | 1, this, gr.h, 300L, false);
                    qg.a d = qg.a.d(getContext(), this.n, this.r, this.h, D[i9], 48);
                    if (i9 == 1) {
                        d.setContentDescription(LocaleController.getString(R.string.ProfileActionsGift));
                    } else if (i9 == 2) {
                        d.setContentDescription(LocaleController.getString(R.string.ChannelOpenDirect));
                    } else if (i9 == 0) {
                        d.setContentDescription(LocaleController.getString(R.string.Search));
                    } else if (i9 == 3) {
                        d.setContentDescription(LocaleController.getString(R.string.BroadcastGroupInfo));
                    }
                    g6.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new z0(this, i9, 26));
                    addView(d, e6.c(56.0f, 56));
                    o oVar2 = new o();
                    oVar2.b = d;
                    oVar2.c = aVar;
                    oVarArr[i9] = oVar2;
                    a();
                }
                ((td.a) oVarArr[i9].c).a(z10, z11);
            }
        }
    }

    public final void d(boolean z10) {
        boolean z11 = false;
        z11 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z12 = false;
            for (int i9 = 0; i9 < getContainer().getChildCount(); i9++) {
                View childAt = getContainer().getChildAt(i9);
                if (this.f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.w.a(z11, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i9 = (int) (this.x * 255.0f * this.v.e);
        if (i9 > 0) {
            float dp = this.y + AndroidUtilities.dp(10.0f);
            float dp2 = AndroidUtilities.dp(9.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.A;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = G;
            rectF.set(dp, dp2, measuredWidth, measuredHeight);
            int i10 = this.C;
            Paint paint = this.B;
            paint.setColor(i10);
            paint.setAlpha(i9);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.e && this.s != null) {
            float dp = this.y + AndroidUtilities.dp(1.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.A;
            float measuredHeight = getMeasuredHeight();
            RectF rectF = G;
            rectF.set(dp, 0.0f, measuredWidth, measuredHeight);
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.s.setBounds(rect);
            this.s.draw(canvas);
        }
        return super.drawChild(canvas, view, j10);
    }

    public FrameLayout getContainer() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        b(false);
        super.onMeasure(i9, i10);
        a();
    }

    public void setAccentColor(int i9) {
        this.C = i9;
    }

    public void setOnButtonsTotalWidthChanged(d dVar) {
        this.d = dVar;
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.x != f10) {
            this.x = f10;
            a();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        d(false);
    }
}
