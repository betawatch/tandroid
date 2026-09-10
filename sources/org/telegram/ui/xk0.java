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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class xk0 extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ al0 c;

    public xk0(al0 al0Var) {
        this.c = al0Var;
    }

    @Override // org.telegram.ui.Components.ul0
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
        yk0 yk0Var;
        al0 al0Var = this.c;
        int i11 = al0Var.E;
        if (i10 < i11 || i10 >= al0Var.F) {
            int i12 = al0Var.r;
            yk0Var = (i10 < i12 || i10 >= al0Var.s) ? null : (yk0) al0Var.a.get(i10 - i12);
        } else {
            yk0Var = (yk0) al0Var.b.get(i10 - i11);
        }
        if (yk0Var != null) {
            return yk0Var.c;
        }
        al0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == al0Var.y) {
            return 2L;
        }
        if (i10 == al0Var.v) {
            return 3L;
        }
        if (i10 == al0Var.w) {
            return 4L;
        }
        if (i10 == al0Var.x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override // s4.h0
    public final int j(int i10) {
        al0 al0Var = this.c;
        if (i10 >= al0Var.E && i10 < al0Var.F) {
            return 0;
        }
        al0Var.getClass();
        if (i10 == 0 || i10 == al0Var.y) {
            return 1;
        }
        if (i10 == al0Var.v) {
            return 2;
        }
        return (i10 == al0Var.w || i10 == al0Var.x) ? 3 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        al0 al0Var = this.c;
        org.telegram.ui.ActionBar.f6 f6Var = al0Var.h;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            zk0 zk0Var = (zk0) view;
            int i12 = al0Var.E;
            yk0 yk0Var = (i10 < i12 || i10 >= al0Var.F) ? null : (yk0) al0Var.b.get(i10 - i12);
            int i13 = al0Var.r;
            if (i10 >= i13 && i10 < al0Var.s) {
                yk0Var = (yk0) al0Var.a.get(i10 - i13);
            }
            if (yk0Var != null) {
                boolean z10 = zk0Var.e == yk0Var;
                boolean z11 = yk0Var == al0Var.H;
                boolean z12 = al0Var.J.get(yk0Var.c) != null;
                zk0Var.e = yk0Var;
                zk0Var.a.setText(yk0Var.f);
                zk0Var.d = i10 != al0Var.F - 1;
                zk0Var.b.a(z11, z10);
                zk0Var.c.a(z12, z10);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == 0) {
                m4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else {
                if (i10 == al0Var.y) {
                    m4Var.setText(LocaleController.getString(R.string.SystemTones));
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
        org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(drawable, drawable2);
        f2Var.a.l(LocaleController.getString(R.string.UploadSound), false);
        f2Var.b.setImageDrawable(vqVar);
        f2Var.c = false;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.f6 f6Var = this.c.h;
        Context context = viewGroup.getContext();
        if (i10 == 0) {
            zk0 zk0Var = new zk0(context);
            RadioButton radioButton = new RadioButton(context);
            zk0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.g7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h7, f6Var));
            boolean z10 = LocaleController.isRTL;
            zk0Var.addView(radioButton, w7.a6.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
            org.telegram.ui.Components.tp tpVar = new org.telegram.ui.Components.tp(context, 24, f6Var);
            zk0Var.c = tpVar;
            int i11 = org.telegram.ui.ActionBar.j6.d6;
            tpVar.b(-1, i11, org.telegram.ui.ActionBar.j6.k7);
            tpVar.setDrawUnchecked(false);
            tpVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            zk0Var.addView(tpVar, w7.a6.d(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
            tpVar.a(true, false);
            TextView textView = new TextView(context);
            zk0Var.a = textView;
            org.telegram.messenger.em.n(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z12 = LocaleController.isRTL;
            zk0Var.addView(textView, w7.a6.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
            zk0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            view = zk0Var;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, 70, f6Var);
            f2Var.d = 61;
            f2Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            view = f2Var;
        } else if (i10 != 3) {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, f6Var);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            view = m4Var;
        } else {
            view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
        }
        return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
    }
}
