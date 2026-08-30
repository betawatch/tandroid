package rh;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class g0 extends eb {
    public final f6 a;
    public final e0 b;
    public final f0 c;
    public final TextView d;
    public final TextView e;
    public h0 f;
    public int h;

    public g0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.h = 0;
        this.a = f6Var;
        e0 e0Var = new e0(AndroidUtilities.dp(10.0f));
        e0Var.a.setColor(j6.v0(j6.Fi, f6Var));
        this.b = e0Var;
        setBackground(e0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        f0 f0Var = new f0(context, imageView);
        this.c = f0Var;
        imageView.setImageDrawable(f0Var);
        addView(imageView, b6.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b6.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = j6.Hi;
        textView.setTextColor(j6.v0(i10, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView j10 = yh.j(linearLayout, textView, b6.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = j10;
        j10.setTextSize(1, 13.0f);
        j10.setTextColor(j6.v0(i10, f6Var));
        linearLayout.addView(j10, b6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
        if (i10 == 0) {
            setButton((db) null);
            return;
        }
        f6 f6Var = this.a;
        if (i10 == 1) {
            gc gcVar = new gc(getContext(), f6Var, true);
            gcVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
            final int i11 = 0;
            gcVar.a = new Runnable(this) { // from class: rh.d0
                public final /* synthetic */ g0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i11) {
                        case 0:
                            g0 g0Var = this.b;
                            ic bulletin = g0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            h0 h0Var = g0Var.f;
                            if (h0Var != null) {
                                h0Var.a();
                                break;
                            }
                            break;
                        default:
                            g0 g0Var2 = this.b;
                            ic bulletin2 = g0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            h0 h0Var2 = g0Var2.f;
                            if (h0Var2 != null && (file = h0Var2.d) != null && file.exists()) {
                                File file2 = h0Var2.d;
                                AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.D1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                gcVar.c = getBulletin();
            }
            setButton(gcVar);
            return;
        }
        if (i10 == 2) {
            gc gcVar2 = new gc(getContext(), f6Var, true);
            gcVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
            final int i12 = 1;
            gcVar2.a = new Runnable(this) { // from class: rh.d0
                public final /* synthetic */ g0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i12) {
                        case 0:
                            g0 g0Var = this.b;
                            ic bulletin = g0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            h0 h0Var = g0Var.f;
                            if (h0Var != null) {
                                h0Var.a();
                                break;
                            }
                            break;
                        default:
                            g0 g0Var2 = this.b;
                            ic bulletin2 = g0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            h0 h0Var2 = g0Var2.f;
                            if (h0Var2 != null && (file = h0Var2.d) != null && file.exists()) {
                                File file2 = h0Var2.d;
                                AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.D1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                gcVar2.c = getBulletin();
            }
            setButton(gcVar2);
        }
    }

    public final boolean c(h0 h0Var) {
        h0 h0Var2 = this.f;
        f0 f0Var = this.c;
        if (h0Var2 != h0Var) {
            z5 z5Var = f0Var.k;
            f0Var.h = false;
            z5Var.getClass();
            z5Var.d(0.0f, true);
            gj0 gj0Var = f0Var.l;
            if (gj0Var != null) {
                gj0Var.A(true);
                f0Var.l = null;
            }
            z5 z5Var2 = f0Var.i;
            f0Var.f = false;
            z5Var2.getClass();
            z5Var2.d(0.0f, true);
        }
        this.f = h0Var;
        this.d.setText(h0Var.c);
        boolean c3 = h0Var.c();
        TextView textView = this.e;
        if (c3) {
            Pair b10 = h0Var.b();
            f0Var.getClass();
            boolean z4 = ((Long) b10.second).longValue() > 0;
            f0Var.f = z4;
            if (z4) {
                f0Var.g = Utilities.clamp(((Long) b10.first).longValue() / ((Long) b10.second).longValue(), 1.0f, 0.0f);
            }
            f0Var.invalidateSelf();
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
        if (h0Var.i) {
            ic bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        }
        if (h0Var.h) {
            textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
            setButton(2);
            if (!f0Var.h) {
                f0Var.h = true;
                gj0 gj0Var2 = new gj0(R.raw.contact_check, AndroidUtilities.dp(40.0f), "contact_check", AndroidUtilities.dp(40.0f));
                f0Var.l = gj0Var2;
                gj0Var2.s0 = f0Var.a;
                gj0Var2.H(true);
                f0Var.l.start();
                f0Var.g = 1.0f;
            }
            ic bulletin2 = getBulletin();
            if (bulletin2 != null) {
                bulletin2.i(false);
                bulletin2.j = 5000;
                bulletin2.i(true);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.eb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), TLObject.FLAG_30));
    }

    public void setArrow(int i10) {
        e0 e0Var = this.b;
        e0Var.getClass();
        boolean z4 = i10 >= 0;
        e0Var.e = z4;
        if (z4) {
            e0Var.f = i10;
        }
        e0Var.invalidateSelf();
    }
}
