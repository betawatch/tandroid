package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class yk0 extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ bl0 c;

    public yk0(bl0 bl0Var) {
        this.c = bl0Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.n;
    }

    @Override // s4.h0
    public final long i(int i10) {
        zk0 zk0Var;
        bl0 bl0Var = this.c;
        int i11 = bl0Var.E;
        if (i10 < i11 || i10 >= bl0Var.F) {
            int i12 = bl0Var.r;
            zk0Var = (i10 < i12 || i10 >= bl0Var.s) ? null : (zk0) bl0Var.a.get(i10 - i12);
        } else {
            zk0Var = (zk0) bl0Var.b.get(i10 - i11);
        }
        if (zk0Var != null) {
            return zk0Var.c;
        }
        bl0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == bl0Var.y) {
            return 2L;
        }
        if (i10 == bl0Var.v) {
            return 3L;
        }
        if (i10 == bl0Var.w) {
            return 4L;
        }
        if (i10 == bl0Var.x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override // s4.h0
    public final int j(int i10) {
        bl0 bl0Var = this.c;
        if (i10 >= bl0Var.E && i10 < bl0Var.F) {
            return 0;
        }
        bl0Var.getClass();
        if (i10 == 0 || i10 == bl0Var.y) {
            return 1;
        }
        if (i10 == bl0Var.v) {
            return 2;
        }
        return (i10 == bl0Var.w || i10 == bl0Var.x) ? 3 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        bl0 bl0Var = this.c;
        org.telegram.ui.ActionBar.f6 f6Var = bl0Var.h;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            al0 al0Var = (al0) view;
            int i12 = bl0Var.E;
            zk0 zk0Var = (i10 < i12 || i10 >= bl0Var.F) ? null : (zk0) bl0Var.b.get(i10 - i12);
            int i13 = bl0Var.r;
            if (i10 >= i13 && i10 < bl0Var.s) {
                zk0Var = (zk0) bl0Var.a.get(i10 - i13);
            }
            if (zk0Var != null) {
                boolean z10 = al0Var.e == zk0Var;
                boolean z11 = zk0Var == bl0Var.H;
                boolean z12 = bl0Var.J.get(zk0Var.c) != null;
                al0Var.e = zk0Var;
                al0Var.a.setText(zk0Var.f);
                al0Var.d = i10 != bl0Var.F - 1;
                al0Var.b.a(z11, z10);
                al0Var.c.a(z12, z10);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == 0) {
                l4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else {
                if (i10 == bl0Var.y) {
                    l4Var.setText(LocaleController.getString(R.string.SystemTones));
                    return;
                }
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
        Drawable drawable = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k7, f6Var), mode));
        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(drawable, drawable2);
        f2Var.a.l(LocaleController.getString(R.string.UploadSound), false);
        f2Var.b.setImageDrawable(oqVar);
        f2Var.c = false;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.f6 f6Var = this.c.h;
        Context context = viewGroup.getContext();
        if (i10 == 0) {
            al0 al0Var = new al0(context);
            RadioButton radioButton = new RadioButton(context);
            al0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.g7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h7, f6Var));
            boolean z10 = LocaleController.isRTL;
            al0Var.addView(radioButton, w7.x5.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
            org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(context, 24, f6Var);
            al0Var.c = mpVar;
            int i11 = org.telegram.ui.ActionBar.j6.d6;
            mpVar.b(-1, i11, org.telegram.ui.ActionBar.j6.k7);
            mpVar.setDrawUnchecked(false);
            mpVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            al0Var.addView(mpVar, w7.x5.d(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
            mpVar.a(true, false);
            TextView textView = new TextView(context);
            al0Var.a = textView;
            org.telegram.messenger.vl.n(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z12 = LocaleController.isRTL;
            al0Var.addView(textView, w7.x5.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
            al0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            view = al0Var;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, 70, f6Var);
            f2Var.d = 61;
            f2Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            view = f2Var;
        } else if (i10 != 3) {
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, f6Var);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            view = l4Var;
        } else {
            view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
        }
        return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
    }
}
