package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.o;
import gg.j1;
import java.util.HashSet;
import k7.b6;
import k7.d6;
import lf.p0;
import lf.q0;
import lh.y0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.nr;
import org.telegram.ui.te;
import org.telegram.ui.xn;
import ph.f3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class e extends FrameLayout implements xd.b {
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final RectF H;
    public float B;
    public final Paint C;
    public int D;
    public final o[] a;
    public final View.OnClickListener[] b;
    public final te[] c;
    public d d;
    public final FrameLayout e;
    public final HashSet f;
    public final f6 h;
    public final ng.a n;
    public final qg.a r;
    public pg.b s;
    public final xd.a v;
    public final xd.a w;
    public float x;
    public float y;

    static {
        int i10 = R.drawable.msg_search;
        int i11 = R.drawable.input_gift_s;
        int i12 = R.drawable.input_message;
        int i13 = R.drawable.msg_help;
        E = new int[]{i10, i11, i12, i13, i13};
        F = new int[]{0};
        G = new int[]{1, 2, 3, 4};
        H = new RectF();
    }

    public e(Context context, ng.a aVar, f6 f6Var, qg.a aVar2) {
        super(context);
        this.a = new o[5];
        this.b = new View.OnClickListener[5];
        this.c = new te[5];
        this.f = new HashSet();
        nr nrVar = nr.h;
        this.v = new xd.a(99, this, nrVar, 320L, false);
        this.w = new xd.a(100, this, nrVar, 320L, false);
        this.C = new Paint(1);
        this.D = 0;
        this.n = aVar;
        this.r = aVar2;
        this.h = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(22.0f);
        j1 j1Var = q0.a;
        frameLayout.setOutlineProvider(new p0(0, dp));
        addView(frameLayout, b6.e(-1, 44, 16));
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 99) {
            invalidate();
            return;
        }
        if (i10 == 100) {
            a();
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            o[] oVarArr = this.a;
            if (i11 >= oVarArr.length || oVarArr[i11] == null || i12 != 1) {
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
        this.B = 0.0f;
        o[] oVarArr = this.a;
        for (o oVar : oVarArr) {
            if (oVar != null) {
                vg.a aVar = (vg.a) oVar.b;
                float f11 = ((xd.a) oVar.c).e * this.x;
                aVar.setVisibility(f11 > 0.0f ? 0 : 8);
                aVar.setAlpha(f11);
                aVar.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
                aVar.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
            }
        }
        int[] iArr2 = F;
        o oVar2 = oVarArr[iArr2[0]];
        if (oVar2 != null) {
            float dp = ((xd.a) oVar2.c).e * AndroidUtilities.dp(54.0f);
            ((vg.a) oVar2.b).setTranslationX(AndroidUtilities.dp(1.0f) + this.y);
            this.y += dp;
        }
        int i10 = 0;
        while (true) {
            iArr = G;
            if (i10 >= 4) {
                break;
            }
            o oVar3 = oVarArr[iArr[i10]];
            if (oVar3 != null) {
                vg.a aVar2 = (vg.a) oVar3.b;
                float dp2 = ((xd.a) oVar3.c).e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.B);
                this.B += dp2;
            }
            i10++;
        }
        if (this.x < 1.0f) {
            o oVar4 = oVarArr[iArr2[0]];
            if (oVar4 != null) {
                vg.a aVar3 = (vg.a) oVar4.b;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.x) * this.y));
            }
            for (int i11 = 0; i11 < 4; i11++) {
                o oVar5 = oVarArr[iArr[i11]];
                if (oVar5 != null) {
                    vg.a aVar4 = (vg.a) oVar5.b;
                    aVar4.setTranslationX(((1.0f - this.x) * this.B) + aVar4.getTranslationX());
                }
            }
            float f12 = this.y;
            float f13 = this.x;
            this.y = f12 * f13;
            this.B *= f13;
        }
        float f14 = this.w.e;
        if (f14 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i12 = 0; i12 < getContainer().getChildCount(); i12++) {
                if (this.f.contains(getContainer().getChildAt(i12))) {
                    measuredWidth = Math.min(measuredWidth, r4.getLeft());
                    f10 = Math.max(f10, r4.getRight());
                }
            }
            if (measuredWidth > f10) {
                f10 = (measuredWidth + f10) / 2.0f;
                measuredWidth = f10;
            }
            this.y = AndroidUtilities.lerp(this.y, measuredWidth - AndroidUtilities.dp(3.33f), f14);
            this.B = AndroidUtilities.lerp(this.B, (getMeasuredWidth() - f10) - AndroidUtilities.dp(17.66f), f14);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f15 = this.y;
            float f16 = this.B;
            ug.f fVar = ((te) dVar).b.P;
            fVar.x = f15;
            fVar.y = f16;
            fVar.invalidate();
        }
    }

    public final void b(boolean z4) {
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i10 = F[0];
        o[] oVarArr = this.a;
        o oVar = oVarArr[i10];
        if (oVar != null) {
            dp += ((xd.a) oVar.c).f ? AndroidUtilities.dp(54.0f) : 0;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            o oVar2 = oVarArr[G[i11]];
            if (oVar2 != null) {
                dp2 += ((xd.a) oVar2.c).f ? AndroidUtilities.dp(54.0f) : 0;
            }
        }
        FrameLayout frameLayout = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin == dp && marginLayoutParams.rightMargin == dp2) {
            return;
        }
        marginLayoutParams.leftMargin = dp;
        marginLayoutParams.rightMargin = dp2;
        if (z4) {
            frameLayout.requestLayout();
        }
    }

    public final void c(int i10, boolean z4, boolean z10) {
        o oVar;
        if (i10 >= 0) {
            o[] oVarArr = this.a;
            if (i10 < oVarArr.length && ((oVar = oVarArr[i10]) != null || z4)) {
                if (oVar == null) {
                    xd.a aVar = new xd.a((i10 << 16) | 1, this, nr.h, 300L, false);
                    vg.a d = vg.a.d(getContext(), this.n, this.r, this.h, E[i10], 48);
                    if (i10 == 1) {
                        d.setContentDescription(LocaleController.getString(R.string.ProfileActionsGift));
                    } else if (i10 == 2) {
                        d.setContentDescription(LocaleController.getString(R.string.ChannelOpenDirect));
                    } else if (i10 == 0) {
                        d.setContentDescription(LocaleController.getString(R.string.Search));
                    } else if (i10 == 3) {
                        d.setContentDescription(LocaleController.getString(R.string.BroadcastGroupInfo));
                    }
                    d6.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new y0(this, i10, 26));
                    addView(d, b6.c(56.0f, 56));
                    o oVar2 = new o();
                    oVar2.b = d;
                    oVar2.c = aVar;
                    oVarArr[i10] = oVar2;
                    a();
                }
                ((xd.a) oVarArr[i10].c).a(z4, z10);
            }
        }
    }

    public final void d(boolean z4) {
        boolean z10 = false;
        z10 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z11 = false;
            for (int i10 = 0; i10 < getContainer().getChildCount(); i10++) {
                View childAt = getContainer().getChildAt(i10);
                if (this.f.contains(childAt) && childAt.getVisibility() == 0) {
                    z11 = true;
                }
            }
            z10 = z11;
        }
        this.w.a(z10, z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10 = (int) (this.x * 255.0f * this.v.e);
        if (i10 > 0) {
            float dp = this.y + AndroidUtilities.dp(10.0f);
            float dp2 = AndroidUtilities.dp(9.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.B;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = H;
            rectF.set(dp, dp2, measuredWidth, measuredHeight);
            int i11 = this.D;
            Paint paint = this.C;
            paint.setColor(i11);
            paint.setAlpha(i10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.e && this.s != null) {
            float dp = this.y + AndroidUtilities.dp(1.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.B;
            float measuredHeight = getMeasuredHeight();
            RectF rectF = H;
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        b(false);
        super.onMeasure(i10, i11);
        a();
    }

    public void setAccentColor(int i10) {
        this.D = i10;
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
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d(false);
    }

    @Override // xd.b
    public final void z(float f10, int i10) {
        o oVar;
        f3 f3Var;
        if (i10 == 99 || i10 == 100) {
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            o[] oVarArr = this.a;
            if (i11 >= oVarArr.length || (oVar = oVarArr[i11]) == null || i12 != 1 || !((xd.a) oVar.c).f) {
                return;
            }
            te teVar = this.c[i11];
            if (teVar != null) {
                final vg.a aVar = (vg.a) oVar.b;
                boolean z4 = oVar.a;
                int i13 = teVar.a;
                final xn xnVar = teVar.b;
                switch (i13) {
                    case 24:
                        if (xnVar.G0 == null && !z4 && (((f3Var = xnVar.I0) == null || !f3Var.S) && l40.h.c())) {
                            final int i14 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ye
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            xn xnVar2 = xnVar;
                                            if (xnVar2.getParentActivity() != null) {
                                                float f11 = xnVar2.v.e(2).d / AndroidUtilities.density;
                                                float width = ((r3.getWidth() / 2.0f) + (xnVar2.U0.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                ph.f3 f3Var2 = new ph.f3(xnVar2.getParentActivity(), 3);
                                                xnVar2.I0 = f3Var2;
                                                f3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                xnVar2.I0.q(false);
                                                ph.f3 f3Var3 = xnVar2.I0;
                                                String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                if (f3Var3.getMeasuredWidth() < 0) {
                                                    f3Var3.D = string;
                                                } else {
                                                    f3Var3.E.q(string, !LocaleController.isRTL, true);
                                                }
                                                xnVar2.I0.m(1.0f, (-width) + 7.33f);
                                                xnVar2.U0.addView(xnVar2.I0, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                ph.f3 f3Var4 = xnVar2.I0;
                                                f3Var4.i0 = new lf(xnVar2, 21);
                                                f3Var4.v();
                                                org.telegram.ui.Components.l40.f.b();
                                                break;
                                            }
                                            break;
                                        default:
                                            xn xnVar3 = xnVar;
                                            if (xnVar3.getParentActivity() != null) {
                                                float f12 = xnVar3.v.e(2).d / AndroidUtilities.density;
                                                float width2 = ((r3.getWidth() / 2.0f) + (xnVar3.U0.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                ph.f3 f3Var5 = new ph.f3(xnVar3.getParentActivity(), 3);
                                                xnVar3.G0 = f3Var5;
                                                f3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                xnVar3.G0.q(false);
                                                xnVar3.G0.t(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                xnVar3.G0.m(1.0f, (-width2) + 7.33f);
                                                xnVar3.U0.addView(xnVar3.G0, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                ph.f3 f3Var6 = xnVar3.G0;
                                                f3Var6.i0 = new ng(xnVar3, 0);
                                                f3Var6.v();
                                                org.telegram.ui.Components.l40.h.b();
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
                        if (xnVar.I0 == null && !z4 && l40.f.c()) {
                            final int i15 = 0;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ye
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            xn xnVar2 = xnVar;
                                            if (xnVar2.getParentActivity() != null) {
                                                float f11 = xnVar2.v.e(2).d / AndroidUtilities.density;
                                                float width = ((r3.getWidth() / 2.0f) + (xnVar2.U0.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                ph.f3 f3Var2 = new ph.f3(xnVar2.getParentActivity(), 3);
                                                xnVar2.I0 = f3Var2;
                                                f3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                xnVar2.I0.q(false);
                                                ph.f3 f3Var3 = xnVar2.I0;
                                                String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                if (f3Var3.getMeasuredWidth() < 0) {
                                                    f3Var3.D = string;
                                                } else {
                                                    f3Var3.E.q(string, !LocaleController.isRTL, true);
                                                }
                                                xnVar2.I0.m(1.0f, (-width) + 7.33f);
                                                xnVar2.U0.addView(xnVar2.I0, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                ph.f3 f3Var4 = xnVar2.I0;
                                                f3Var4.i0 = new lf(xnVar2, 21);
                                                f3Var4.v();
                                                org.telegram.ui.Components.l40.f.b();
                                                break;
                                            }
                                            break;
                                        default:
                                            xn xnVar3 = xnVar;
                                            if (xnVar3.getParentActivity() != null) {
                                                float f12 = xnVar3.v.e(2).d / AndroidUtilities.density;
                                                float width2 = ((r3.getWidth() / 2.0f) + (xnVar3.U0.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                ph.f3 f3Var5 = new ph.f3(xnVar3.getParentActivity(), 3);
                                                xnVar3.G0 = f3Var5;
                                                f3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                xnVar3.G0.q(false);
                                                xnVar3.G0.t(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                xnVar3.G0.m(1.0f, (-width2) + 7.33f);
                                                xnVar3.U0.addView(xnVar3.G0, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                ph.f3 f3Var6 = xnVar3.G0;
                                                f3Var6.i0 = new ng(xnVar3, 0);
                                                f3Var6.v();
                                                org.telegram.ui.Components.l40.h.b();
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
}
