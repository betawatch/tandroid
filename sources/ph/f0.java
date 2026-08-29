package ph;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class f0 extends jb {
    public final c6 a;
    public final d0 b;
    public final e0 c;
    public final TextView d;
    public final TextView e;
    public g0 f;
    public int h;

    public f0(Context context, c6 c6Var) {
        super(context, c6Var);
        this.h = 0;
        this.a = c6Var;
        d0 d0Var = new d0(AndroidUtilities.dp(10.0f));
        d0Var.a.setColor(g6.v0(g6.Fi, c6Var));
        this.b = d0Var;
        setBackground(d0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        e0 e0Var = new e0(context, imageView);
        this.c = e0Var;
        imageView.setImageDrawable(e0Var);
        addView(imageView, f6.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, f6.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = g6.Hi;
        textView.setTextColor(g6.v0(i10, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView i11 = th.i(linearLayout, textView, f6.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = i11;
        i11.setTextSize(1, 13.0f);
        i11.setTextColor(g6.v0(i10, c6Var));
        linearLayout.addView(i11, f6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
        if (i10 == 0) {
            setButton((ib) null);
            return;
        }
        c6 c6Var = this.a;
        if (i10 == 1) {
            kc kcVar = new kc(getContext(), c6Var, true);
            kcVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
            final int i11 = 0;
            kcVar.a = new Runnable(this) { // from class: ph.c0
                public final /* synthetic */ f0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i11) {
                        case 0:
                            f0 f0Var = this.b;
                            mc bulletin = f0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            g0 g0Var = f0Var.f;
                            if (g0Var != null) {
                                g0Var.a();
                                break;
                            }
                            break;
                        default:
                            f0 f0Var2 = this.b;
                            mc bulletin2 = f0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            g0 g0Var2 = f0Var2.f;
                            if (g0Var2 != null && (file = g0Var2.d) != null && file.exists()) {
                                File file2 = g0Var2.d;
                                AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.C1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                kcVar.c = getBulletin();
            }
            setButton(kcVar);
            return;
        }
        if (i10 == 2) {
            kc kcVar2 = new kc(getContext(), c6Var, true);
            kcVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
            final int i12 = 1;
            kcVar2.a = new Runnable(this) { // from class: ph.c0
                public final /* synthetic */ f0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i12) {
                        case 0:
                            f0 f0Var = this.b;
                            mc bulletin = f0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            g0 g0Var = f0Var.f;
                            if (g0Var != null) {
                                g0Var.a();
                                break;
                            }
                            break;
                        default:
                            f0 f0Var2 = this.b;
                            mc bulletin2 = f0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            g0 g0Var2 = f0Var2.f;
                            if (g0Var2 != null && (file = g0Var2.d) != null && file.exists()) {
                                File file2 = g0Var2.d;
                                AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.C1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                kcVar2.c = getBulletin();
            }
            setButton(kcVar2);
        }
    }

    public final boolean c(g0 g0Var) {
        g0 g0Var2 = this.f;
        e0 e0Var = this.c;
        if (g0Var2 != g0Var) {
            d6 d6Var = e0Var.k;
            e0Var.h = false;
            d6Var.getClass();
            d6Var.d(0.0f, true);
            xi0 xi0Var = e0Var.l;
            if (xi0Var != null) {
                xi0Var.A(true);
                e0Var.l = null;
            }
            d6 d6Var2 = e0Var.i;
            e0Var.f = false;
            d6Var2.getClass();
            d6Var2.d(0.0f, true);
        }
        this.f = g0Var;
        this.d.setText(g0Var.c);
        boolean c3 = g0Var.c();
        TextView textView = this.e;
        if (c3) {
            Pair b10 = g0Var.b();
            e0Var.getClass();
            boolean z10 = ((Long) b10.second).longValue() > 0;
            e0Var.f = z10;
            if (z10) {
                e0Var.g = Utilities.clamp(((Long) b10.first).longValue() / ((Long) b10.second).longValue(), 1.0f, 0.0f);
            }
            e0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloading));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
            } else {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
            }
            setButton(1);
            return false;
        }
        if (g0Var.i) {
            mc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        }
        if (g0Var.h) {
            textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
            setButton(2);
            if (!e0Var.h) {
                e0Var.h = true;
                xi0 xi0Var2 = new xi0(R.raw.contact_check, AndroidUtilities.dp(40.0f), "contact_check", AndroidUtilities.dp(40.0f));
                e0Var.l = xi0Var2;
                xi0Var2.r0 = e0Var.a;
                xi0Var2.H(true);
                e0Var.l.start();
                e0Var.g = 1.0f;
            }
            mc bulletin2 = getBulletin();
            if (bulletin2 != null) {
                bulletin2.i(false);
                bulletin2.j = 5000;
                bulletin2.i(true);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), TLObject.FLAG_30));
    }

    public void setArrow(int i10) {
        d0 d0Var = this.b;
        d0Var.getClass();
        boolean z10 = i10 >= 0;
        d0Var.e = z10;
        if (z10) {
            d0Var.f = i10;
        }
        d0Var.invalidateSelf();
    }
}
