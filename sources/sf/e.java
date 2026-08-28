package sf;

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
import com.google.firebase.messaging.t;
import g7.e6;
import gh.oa;
import j3.r0;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.fe;
import org.telegram.ui.te1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class e extends FrameLayout {
    public boolean A;
    public boolean B;
    public boolean C;
    public Drawable D;
    public z E;
    public final b6 F;
    public final ju0 G;
    public DecimalFormat H;
    public boolean a;
    public final LinearLayout b;
    public t[] c;
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

    public e(Context context, b6 b6Var) {
        super(context);
        this.n = new SimpleDateFormat("E, ");
        this.r = new SimpleDateFormat("MMM dd");
        this.s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.w = new SimpleDateFormat(" HH:mm");
        this.C = true;
        this.G = new ju0(this, 6);
        this.F = b6Var;
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
        addView(linearLayout, e6.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, e6.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, e6.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, e6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, e6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public void b() {
        int i9 = f6.j5;
        b6 b6Var = this.F;
        this.d.setTextColor(f6.v0(i9, b6Var));
        this.e.setTextColor(f6.v0(i9, b6Var));
        int i10 = f6.gj;
        this.f.setColorFilter(f6.v0(i10, b6Var));
        this.h.setProgressColor(f6.v0(i10, b6Var));
        this.D = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.E = f6.i0(dp, dp, dp, dp, f6.v0(f6.h5, b6Var), f6.v0(f6.i6, b6Var), -16777216);
        fq fqVar = new fq(this.D, this.E, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        fqVar.w = true;
        setBackground(fqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i9, long j10, ArrayList arrayList, boolean z10, int i10, float f10) {
        int i11;
        CharSequence charSequence;
        int i12;
        int i13;
        int i14;
        int length = this.c.length;
        int i15 = 2;
        int i16 = 1;
        int i17 = 0;
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
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((f) arrayList.get(i18)).n) {
                j11 += ((f) arrayList.get(i18)).a.a[i9];
            }
        }
        int i19 = 0;
        while (i19 < length) {
            t tVar = this.c[i19];
            int i20 = i19 % 2;
            f fVar = (f) arrayList.get((i10 == i16 || i10 == i15) ? i19 / 2 : i19);
            boolean z13 = fVar.n;
            rf.a aVar = fVar.a;
            if (z13) {
                LinearLayout linearLayout = (LinearLayout) tVar.e;
                s5 s5Var = (s5) tVar.b;
                TextView textView2 = (TextView) tVar.d;
                TextView textView3 = (TextView) tVar.c;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i17);
                int i21 = i19;
                long j12 = aVar.a[i9];
                if (i10 == i16) {
                    if (i20 == 0) {
                        if (this.H == null) {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            this.H = decimalFormat;
                            decimalFormat.setMinimumFractionDigits(2);
                            i14 = 6;
                            this.H.setMaximumFractionDigits(6);
                            this.H.setGroupingUsed(false);
                        } else {
                            i14 = 6;
                        }
                        DecimalFormat decimalFormat2 = this.H;
                        if (j12 > 1000000000) {
                            i14 = 2;
                        }
                        decimalFormat2.setMaximumFractionDigits(i14);
                        charSequence = fe.f0("TON " + this.H.format(j12 / 1.0E9d), s5Var.getPaint(), 0.82f, 0.0f, false);
                    } else {
                        charSequence = "≈" + BillingController.getInstance().formatCurrency((long) (j12 / f10), "USD");
                    }
                } else if (i10 != 2) {
                    float f11 = j12;
                    if (j12 < 10000) {
                        i11 = 1;
                        charSequence = String.format("%d", Long.valueOf(j12));
                    } else {
                        i11 = 1;
                        int i22 = 0;
                        while (f11 >= 1000.0f && i22 < AndroidUtilities.numbersSignatureArray.length - 1) {
                            f11 /= 1000.0f;
                            i22++;
                        }
                        charSequence = String.format("%.2f", Float.valueOf(f11)) + AndroidUtilities.numbersSignatureArray[i22];
                    }
                    s5Var.setText(charSequence);
                    if (i10 != i11) {
                        int i23 = i20 == 0 ? R.string.ChartInTON : R.string.ChartInUSD;
                        Object[] objArr = new Object[i11];
                        objArr[0] = aVar.d;
                        textView3.setText(LocaleController.formatString(i23, objArr));
                    } else if (i10 == 2) {
                        textView3.setText(oa.X0(false, LocaleController.formatString(i20 == 0 ? R.string.ChartInXTR : R.string.ChartInUSD, aVar.d), 0.7f, null));
                    } else {
                        textView3.setText(aVar.d);
                    }
                    i12 = aVar.g;
                    b6 b6Var = this.F;
                    if (i12 >= 0 || !f6.c1(i12)) {
                        s5Var.setTextColor(!f6.A0().q() ? aVar.i : aVar.h);
                    } else {
                        s5Var.setTextColor(f6.v0(aVar.g, b6Var));
                    }
                    int i24 = f6.j5;
                    textView3.setTextColor(f6.v0(i24, b6Var));
                    if (this.A || textView2 == null) {
                        i13 = i21;
                    } else {
                        textView2.setVisibility(0);
                        textView2.setTextColor(f6.v0(i24, b6Var));
                        i13 = i21;
                        float f12 = ((f) arrayList.get(i13)).a.a[i9] / j11;
                        if (f12 >= 0.1f || f12 == 0.0f) {
                            Locale locale = Locale.ENGLISH;
                            textView2.setText(Math.round(f12 * 100.0f) + "%");
                        } else {
                            textView2.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f12 * 100.0f), "%"));
                        }
                        i19 = i13 + 1;
                        i15 = 2;
                        i16 = 1;
                        i17 = 0;
                    }
                } else if (i20 == 0) {
                    charSequence = oa.X0(false, r0.n(j12, ' ', new StringBuilder("XTR ")), 0.7f, null);
                } else {
                    charSequence = "≈" + BillingController.getInstance().formatCurrency((long) (j12 / f10), "USD");
                }
                i11 = 1;
                s5Var.setText(charSequence);
                if (i10 != i11) {
                }
                i12 = aVar.g;
                b6 b6Var2 = this.F;
                if (i12 >= 0) {
                }
                s5Var.setTextColor(!f6.A0().q() ? aVar.i : aVar.h);
                int i242 = f6.j5;
                textView3.setTextColor(f6.v0(i242, b6Var2));
                if (this.A) {
                }
                i13 = i21;
            } else {
                ((LinearLayout) tVar.e).setVisibility(8);
                i13 = i19;
            }
            i19 = i13 + 1;
            i15 = 2;
            i16 = 1;
            i17 = 0;
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
        ju0 ju0Var = this.G;
        if (z10) {
            AndroidUtilities.runOnUIThread(ju0Var, 300L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(ju0Var);
        RadialProgressView radialProgressView = this.h;
        if (z11) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new te1(this, 7)).start();
        }
    }

    public void setSize(int i9) {
        LinearLayout linearLayout = this.b;
        linearLayout.removeAllViews();
        this.c = new t[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            this.c[i10] = new t(this);
            linearLayout.addView((LinearLayout) this.c[i10].e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.x = z10;
    }
}
