package vf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.s;
import i7.f6;
import j7.l1;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import jh.ia;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.cc1;
import org.telegram.ui.de;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class e extends FrameLayout {
    public boolean A;
    public boolean B;
    public boolean C;
    public Drawable D;
    public z E;
    public final c6 F;
    public final rk0 G;
    public DecimalFormat H;
    public boolean a;
    public final LinearLayout b;
    public s[] c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final RadialProgressView h;
    public final SimpleDateFormat n;
    public final SimpleDateFormat r;
    public final SimpleDateFormat s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat w;
    public boolean x;
    public boolean y;

    public e(Context context, c6 c6Var) {
        super(context);
        this.n = new SimpleDateFormat("E, ");
        this.r = new SimpleDateFormat("MMM dd");
        this.s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.w = new SimpleDateFormat(" HH:mm");
        this.C = true;
        this.G = new rk0(this, 12);
        this.F = c6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        radialProgressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, f6.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, f6.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, f6.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, f6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, f6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public void b() {
        int i10 = g6.j5;
        c6 c6Var = this.F;
        this.d.setTextColor(g6.v0(i10, c6Var));
        this.e.setTextColor(g6.v0(i10, c6Var));
        int i11 = g6.gj;
        this.f.setColorFilter(g6.v0(i11, c6Var));
        this.h.setProgressColor(g6.v0(i11, c6Var));
        this.D = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.E = g6.i0(dp, dp, dp, dp, g6.v0(g6.h5, c6Var), g6.v0(g6.i6, c6Var), -16777216);
        jq jqVar = new jq(this.D, this.E, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        jqVar.w = true;
        setBackground(jqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i10, long j10, ArrayList arrayList, boolean z10, int i11, float f9) {
        int i12;
        CharSequence charSequence;
        int i13;
        int i14;
        int i15;
        int length = this.c.length;
        int i16 = 2;
        int i17 = 1;
        int i18 = 0;
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(150L));
            transitionSet.setOrdering(0);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean z11 = this.a;
        TextView textView = this.d;
        if (z11) {
            textView.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j10)));
        } else {
            if (this.x) {
                textView.setText(this.v.format(new Date(j10)) + " — " + this.s.format(new Date(604800000 + j10)));
            } else {
                Date date = new Date(j10);
                boolean z12 = this.y;
                SimpleDateFormat simpleDateFormat = this.r;
                textView.setText(z12 ? a(simpleDateFormat.format(date)) : a(this.n.format(date)) + a(simpleDateFormat.format(date)));
            }
            if (this.y) {
                this.e.setText(this.w.format(Long.valueOf(j10)));
            }
        }
        long j11 = 0;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (((f) arrayList.get(i19)).n) {
                j11 += ((f) arrayList.get(i19)).a.a[i10];
            }
        }
        int i20 = 0;
        while (i20 < length) {
            s sVar = this.c[i20];
            int i21 = i20 % 2;
            f fVar = (f) arrayList.get((i11 == i17 || i11 == i16) ? i20 / 2 : i20);
            boolean z13 = fVar.n;
            uf.a aVar = fVar.a;
            if (z13) {
                LinearLayout linearLayout = (LinearLayout) sVar.e;
                x5 x5Var = (x5) sVar.b;
                TextView textView2 = (TextView) sVar.d;
                TextView textView3 = (TextView) sVar.c;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i18);
                int i22 = i20;
                long j12 = aVar.a[i10];
                if (i11 == i17) {
                    if (i21 == 0) {
                        if (this.H == null) {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            this.H = decimalFormat;
                            decimalFormat.setMinimumFractionDigits(2);
                            i15 = 6;
                            this.H.setMaximumFractionDigits(6);
                            this.H.setGroupingUsed(false);
                        } else {
                            i15 = 6;
                        }
                        DecimalFormat decimalFormat2 = this.H;
                        if (j12 > 1000000000) {
                            i15 = 2;
                        }
                        decimalFormat2.setMaximumFractionDigits(i15);
                        charSequence = de.f0("TON " + this.H.format(j12 / 1.0E9d), x5Var.getPaint(), 0.82f, 0.0f, false);
                    } else {
                        charSequence = "≈" + BillingController.getInstance().formatCurrency((long) (j12 / f9), "USD");
                    }
                } else if (i11 != 2) {
                    float f10 = j12;
                    if (j12 < 10000) {
                        i12 = 1;
                        charSequence = String.format("%d", Long.valueOf(j12));
                    } else {
                        i12 = 1;
                        int i23 = 0;
                        while (f10 >= 1000.0f && i23 < AndroidUtilities.numbersSignatureArray.length - 1) {
                            f10 /= 1000.0f;
                            i23++;
                        }
                        charSequence = String.format("%.2f", Float.valueOf(f10)) + AndroidUtilities.numbersSignatureArray[i23];
                    }
                    x5Var.setText(charSequence);
                    if (i11 != i12) {
                        int i24 = i21 == 0 ? R.string.ChartInTON : R.string.ChartInUSD;
                        Object[] objArr = new Object[i12];
                        objArr[0] = aVar.d;
                        textView3.setText(LocaleController.formatString(i24, objArr));
                    } else if (i11 == 2) {
                        textView3.setText(ia.X0(false, LocaleController.formatString(i21 == 0 ? R.string.ChartInXTR : R.string.ChartInUSD, aVar.d), 0.7f, null));
                    } else {
                        textView3.setText(aVar.d);
                    }
                    i13 = aVar.g;
                    c6 c6Var = this.F;
                    if (i13 >= 0 || !g6.c1(i13)) {
                        x5Var.setTextColor(!g6.A0().q() ? aVar.i : aVar.h);
                    } else {
                        x5Var.setTextColor(g6.v0(aVar.g, c6Var));
                    }
                    int i25 = g6.j5;
                    textView3.setTextColor(g6.v0(i25, c6Var));
                    if (this.A || textView2 == null) {
                        i14 = i22;
                    } else {
                        textView2.setVisibility(0);
                        textView2.setTextColor(g6.v0(i25, c6Var));
                        i14 = i22;
                        float f11 = ((f) arrayList.get(i14)).a.a[i10] / j11;
                        if (f11 >= 0.1f || f11 == 0.0f) {
                            Locale locale = Locale.ENGLISH;
                            textView2.setText(Math.round(f11 * 100.0f) + "%");
                        } else {
                            textView2.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f11 * 100.0f), "%"));
                        }
                        i20 = i14 + 1;
                        i16 = 2;
                        i17 = 1;
                        i18 = 0;
                    }
                } else if (i21 == 0) {
                    charSequence = ia.X0(false, l1.m(j12, ' ', new StringBuilder("XTR ")), 0.7f, null);
                } else {
                    charSequence = "≈" + BillingController.getInstance().formatCurrency((long) (j12 / f9), "USD");
                }
                i12 = 1;
                x5Var.setText(charSequence);
                if (i11 != i12) {
                }
                i13 = aVar.g;
                c6 c6Var2 = this.F;
                if (i13 >= 0) {
                }
                x5Var.setTextColor(!g6.A0().q() ? aVar.i : aVar.h);
                int i252 = g6.j5;
                textView3.setTextColor(g6.v0(i252, c6Var2));
                if (this.A) {
                }
                i14 = i22;
            } else {
                ((LinearLayout) sVar.e).setVisibility(8);
                i14 = i20;
            }
            i20 = i14 + 1;
            i16 = 2;
            i17 = 1;
            i18 = 0;
        }
        boolean z14 = this.B;
        ImageView imageView = this.f;
        if (z14) {
            this.C = j11 > 0;
            imageView.setVisibility(j11 > 0 ? 0 : 8);
        } else {
            this.C = false;
            imageView.setVisibility(8);
        }
    }

    public final void d(boolean z10, boolean z11) {
        rk0 rk0Var = this.G;
        if (z10) {
            AndroidUtilities.runOnUIThread(rk0Var, 300L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(rk0Var);
        RadialProgressView radialProgressView = this.h;
        if (z11) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new cc1(this, 12)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.b;
        linearLayout.removeAllViews();
        this.c = new s[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.c[i11] = new s(this);
            linearLayout.addView((LinearLayout) this.c[i11].e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.x = z10;
    }
}
