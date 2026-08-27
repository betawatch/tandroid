package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.n;
import cg.l1;
import gf.q0;
import gf.r0;
import h7.b6;
import h7.z5;
import hh.z0;
import java.util.HashSet;
import lh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.y30;
import org.telegram.ui.oe;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class e extends FrameLayout implements ud.b {
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final RectF G;
    public float A;
    public final Paint B;
    public int C;
    public final n[] a;
    public final View.OnClickListener[] b;
    public final oe[] c;
    public d d;
    public final FrameLayout e;
    public final HashSet f;
    public final c6 h;
    public final jg.a n;
    public final mg.a r;
    public lg.d s;
    public final ud.a v;
    public final ud.a w;
    public float x;
    public float y;

    static {
        int i10 = R.drawable.msg_search;
        int i11 = R.drawable.input_gift_s;
        int i12 = R.drawable.input_message;
        int i13 = R.drawable.msg_help;
        D = new int[]{i10, i11, i12, i13, i13};
        E = new int[]{0};
        F = new int[]{1, 2, 3, 4};
        G = new RectF();
    }

    public e(Context context, jg.a aVar, mg.a aVar2, c6 c6Var) {
        super(context);
        this.a = new n[5];
        this.b = new View.OnClickListener[5];
        this.c = new oe[5];
        this.f = new HashSet();
        er erVar = er.h;
        this.v = new ud.a(99, this, erVar, 320L, false);
        this.w = new ud.a(100, this, erVar, 320L, false);
        this.B = new Paint(1);
        this.C = 0;
        this.n = aVar;
        this.r = aVar2;
        this.h = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(22.0f);
        l1 l1Var = r0.a;
        frameLayout.setOutlineProvider(new q0(0, dp));
        addView(frameLayout, z5.e(-1, 44, 16));
    }

    @Override // ud.b
    public final void A(float f10, int i10) {
        n nVar;
        w3 w3Var;
        if (i10 == 99 || i10 == 100) {
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            n[] nVarArr = this.a;
            if (i11 >= nVarArr.length || (nVar = nVarArr[i11]) == null || i12 != 1 || !((ud.a) nVar.c).f) {
                return;
            }
            oe oeVar = this.c[i11];
            if (oeVar != null) {
                final rg.a aVar = (rg.a) nVar.b;
                boolean z10 = nVar.a;
                int i13 = oeVar.a;
                final rn rnVar = oeVar.b;
                switch (i13) {
                    case 24:
                        if (rnVar.F0 == null && !z10 && (((w3Var = rnVar.H0) == null || !w3Var.R) && y30.h.c())) {
                            final int i14 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.te
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            rn rnVar2 = rnVar;
                                            if (rnVar2.getParentActivity() != null) {
                                                float f11 = rnVar2.v.e(2).d / AndroidUtilities.density;
                                                float width = ((r3.getWidth() / 2.0f) + (rnVar2.T0.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                lh.w3 w3Var2 = new lh.w3(rnVar2.getParentActivity(), 3);
                                                rnVar2.H0 = w3Var2;
                                                w3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                rnVar2.H0.q(false);
                                                lh.w3 w3Var3 = rnVar2.H0;
                                                String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                if (w3Var3.getMeasuredWidth() < 0) {
                                                    w3Var3.C = string;
                                                } else {
                                                    w3Var3.D.q(string, !LocaleController.isRTL, true);
                                                }
                                                rnVar2.H0.m(1.0f, (-width) + 7.33f);
                                                rnVar2.T0.addView(rnVar2.H0, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                lh.w3 w3Var4 = rnVar2.H0;
                                                w3Var4.h0 = new gf(rnVar2, 21);
                                                w3Var4.v();
                                                org.telegram.ui.Components.y30.f.b();
                                                break;
                                            }
                                            break;
                                        default:
                                            rn rnVar3 = rnVar;
                                            if (rnVar3.getParentActivity() != null) {
                                                float f12 = rnVar3.v.e(2).d / AndroidUtilities.density;
                                                float width2 = ((r3.getWidth() / 2.0f) + (rnVar3.T0.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                lh.w3 w3Var5 = new lh.w3(rnVar3.getParentActivity(), 3);
                                                rnVar3.F0 = w3Var5;
                                                w3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                rnVar3.F0.q(false);
                                                rnVar3.F0.t(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                rnVar3.F0.m(1.0f, (-width2) + 7.33f);
                                                rnVar3.T0.addView(rnVar3.F0, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                lh.w3 w3Var6 = rnVar3.F0;
                                                w3Var6.h0 = new lg(rnVar3, 0);
                                                w3Var6.v();
                                                org.telegram.ui.Components.y30.h.b();
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
                        if (rnVar.H0 == null && !z10 && y30.f.c()) {
                            final int i15 = 0;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.te
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            rn rnVar2 = rnVar;
                                            if (rnVar2.getParentActivity() != null) {
                                                float f11 = rnVar2.v.e(2).d / AndroidUtilities.density;
                                                float width = ((r3.getWidth() / 2.0f) + (rnVar2.T0.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                lh.w3 w3Var2 = new lh.w3(rnVar2.getParentActivity(), 3);
                                                rnVar2.H0 = w3Var2;
                                                w3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                rnVar2.H0.q(false);
                                                lh.w3 w3Var3 = rnVar2.H0;
                                                String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                if (w3Var3.getMeasuredWidth() < 0) {
                                                    w3Var3.C = string;
                                                } else {
                                                    w3Var3.D.q(string, !LocaleController.isRTL, true);
                                                }
                                                rnVar2.H0.m(1.0f, (-width) + 7.33f);
                                                rnVar2.T0.addView(rnVar2.H0, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                lh.w3 w3Var4 = rnVar2.H0;
                                                w3Var4.h0 = new gf(rnVar2, 21);
                                                w3Var4.v();
                                                org.telegram.ui.Components.y30.f.b();
                                                break;
                                            }
                                            break;
                                        default:
                                            rn rnVar3 = rnVar;
                                            if (rnVar3.getParentActivity() != null) {
                                                float f12 = rnVar3.v.e(2).d / AndroidUtilities.density;
                                                float width2 = ((r3.getWidth() / 2.0f) + (rnVar3.T0.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                lh.w3 w3Var5 = new lh.w3(rnVar3.getParentActivity(), 3);
                                                rnVar3.F0 = w3Var5;
                                                w3Var5.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                rnVar3.F0.q(false);
                                                rnVar3.F0.t(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                rnVar3.F0.m(1.0f, (-width2) + 7.33f);
                                                rnVar3.T0.addView(rnVar3.F0, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                lh.w3 w3Var6 = rnVar3.F0;
                                                w3Var6.h0 = new lg(rnVar3, 0);
                                                w3Var6.v();
                                                org.telegram.ui.Components.y30.h.b();
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
            nVar.a = true;
        }
    }

    public final void a() {
        int[] iArr;
        float f10 = 0.0f;
        this.y = 0.0f;
        this.A = 0.0f;
        n[] nVarArr = this.a;
        for (n nVar : nVarArr) {
            if (nVar != null) {
                rg.a aVar = (rg.a) nVar.b;
                float f11 = ((ud.a) nVar.c).e * this.x;
                aVar.setVisibility(f11 > 0.0f ? 0 : 8);
                aVar.setAlpha(f11);
                aVar.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f11));
                aVar.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f11));
            }
        }
        int[] iArr2 = E;
        n nVar2 = nVarArr[iArr2[0]];
        if (nVar2 != null) {
            float dp = ((ud.a) nVar2.c).e * AndroidUtilities.dp(54.0f);
            ((rg.a) nVar2.b).setTranslationX(AndroidUtilities.dp(1.0f) + this.y);
            this.y += dp;
        }
        int i10 = 0;
        while (true) {
            iArr = F;
            if (i10 >= 4) {
                break;
            }
            n nVar3 = nVarArr[iArr[i10]];
            if (nVar3 != null) {
                rg.a aVar2 = (rg.a) nVar3.b;
                float dp2 = ((ud.a) nVar3.c).e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.A);
                this.A += dp2;
            }
            i10++;
        }
        if (this.x < 1.0f) {
            n nVar4 = nVarArr[iArr2[0]];
            if (nVar4 != null) {
                rg.a aVar3 = (rg.a) nVar4.b;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.x) * this.y));
            }
            for (int i11 = 0; i11 < 4; i11++) {
                n nVar5 = nVarArr[iArr[i11]];
                if (nVar5 != null) {
                    rg.a aVar4 = (rg.a) nVar5.b;
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
            this.A = AndroidUtilities.lerp(this.A, (getMeasuredWidth() - f10) - AndroidUtilities.dp(17.66f), f14);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f15 = this.y;
            float f16 = this.A;
            qg.g gVar = ((oe) dVar).b.O;
            gVar.x = f15;
            gVar.y = f16;
            gVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i10 = E[0];
        n[] nVarArr = this.a;
        n nVar = nVarArr[i10];
        if (nVar != null) {
            dp += ((ud.a) nVar.c).f ? AndroidUtilities.dp(54.0f) : 0;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            n nVar2 = nVarArr[F[i11]];
            if (nVar2 != null) {
                dp2 += ((ud.a) nVar2.c).f ? AndroidUtilities.dp(54.0f) : 0;
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

    public final void c(int i10, boolean z10, boolean z11) {
        n nVar;
        if (i10 >= 0) {
            n[] nVarArr = this.a;
            if (i10 < nVarArr.length && ((nVar = nVarArr[i10]) != null || z10)) {
                if (nVar == null) {
                    ud.a aVar = new ud.a((i10 << 16) | 1, this, er.h, 300L, false);
                    rg.a d = rg.a.d(getContext(), this.n, this.r, this.h, D[i10], 48);
                    if (i10 == 1) {
                        d.setContentDescription(LocaleController.getString(R.string.ProfileActionsGift));
                    } else if (i10 == 2) {
                        d.setContentDescription(LocaleController.getString(R.string.ChannelOpenDirect));
                    } else if (i10 == 0) {
                        d.setContentDescription(LocaleController.getString(R.string.Search));
                    } else if (i10 == 3) {
                        d.setContentDescription(LocaleController.getString(R.string.BroadcastGroupInfo));
                    }
                    b6.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new z0(this, i10, 26));
                    addView(d, z5.c(56.0f, 56));
                    n nVar2 = new n();
                    nVar2.b = d;
                    nVar2.c = aVar;
                    nVarArr[i10] = nVar2;
                    a();
                }
                ((ud.a) nVarArr[i10].c).a(z10, z11);
            }
        }
    }

    public final void d(boolean z10) {
        boolean z11 = false;
        z11 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z12 = false;
            for (int i10 = 0; i10 < getContainer().getChildCount(); i10++) {
                View childAt = getContainer().getChildAt(i10);
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
        int i10 = (int) (this.x * 255.0f * this.v.e);
        if (i10 > 0) {
            float dp = this.y + AndroidUtilities.dp(10.0f);
            float dp2 = AndroidUtilities.dp(9.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.A;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = G;
            rectF.set(dp, dp2, measuredWidth, measuredHeight);
            int i11 = this.C;
            Paint paint = this.B;
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

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
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
            n[] nVarArr = this.a;
            if (i11 >= nVarArr.length || nVarArr[i11] == null || i12 != 1) {
                return;
            }
            b(true);
            a();
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        b(false);
        super.onMeasure(i10, i11);
        a();
    }

    public void setAccentColor(int i10) {
        this.C = i10;
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
}
