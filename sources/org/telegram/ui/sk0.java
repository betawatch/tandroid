package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sk0 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ vk0 c;

    public sk0(vk0 vk0Var) {
        this.c = vk0Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 0 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.h;
    }

    @Override // s4.h0
    public final long i(int i10) {
        tk0 tk0Var;
        vk0 vk0Var = this.c;
        int i11 = vk0Var.y;
        if (i10 < i11 || i10 >= vk0Var.E) {
            int i12 = vk0Var.n;
            tk0Var = (i10 < i12 || i10 >= vk0Var.r) ? null : (tk0) vk0Var.a.get(i10 - i12);
        } else {
            tk0Var = (tk0) vk0Var.b.get(i10 - i11);
        }
        if (tk0Var != null) {
            return tk0Var.c;
        }
        vk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == vk0Var.x) {
            return 2L;
        }
        if (i10 == vk0Var.s) {
            return 3L;
        }
        if (i10 == vk0Var.v) {
            return 4L;
        }
        if (i10 == vk0Var.w) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override // s4.h0
    public final int j(int i10) {
        vk0 vk0Var = this.c;
        if (i10 >= vk0Var.y && i10 < vk0Var.E) {
            return 0;
        }
        vk0Var.getClass();
        if (i10 == 0 || i10 == vk0Var.x) {
            return 1;
        }
        if (i10 == vk0Var.s) {
            return 2;
        }
        return (i10 == vk0Var.v || i10 == vk0Var.w) ? 3 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        vk0 vk0Var = this.c;
        org.telegram.ui.ActionBar.u6 u6Var = vk0Var.f;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            uk0 uk0Var = (uk0) view;
            int i12 = vk0Var.y;
            tk0 tk0Var = (i10 < i12 || i10 >= vk0Var.E) ? null : (tk0) vk0Var.b.get(i10 - i12);
            int i13 = vk0Var.n;
            if (i10 >= i13 && i10 < vk0Var.r) {
                tk0Var = (tk0) vk0Var.a.get(i10 - i13);
            }
            if (tk0Var != null) {
                boolean z10 = uk0Var.e == tk0Var;
                boolean z11 = tk0Var == vk0Var.G;
                boolean z12 = vk0Var.I.get(tk0Var.c) != null;
                uk0Var.e = tk0Var;
                uk0Var.a.setText(tk0Var.f);
                uk0Var.d = i10 != vk0Var.E - 1;
                uk0Var.b.a(z11, z10);
                uk0Var.c.a(z12, z10);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            if (i10 == 0) {
                q4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else {
                if (i10 == vk0Var.x) {
                    q4Var.setText(LocaleController.getString(R.string.SystemTones));
                    return;
                }
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
        Drawable drawable = e2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = e2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
        int i14 = org.telegram.ui.ActionBar.y6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.y(e2Var, drawable, i14, u6Var, mode);
        org.telegram.ui.ActionBar.f7.y(e2Var, drawable2, org.telegram.ui.ActionBar.y6.k7, u6Var, mode);
        org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(drawable, drawable2);
        e2Var.a.l(LocaleController.getString(R.string.UploadSound), false);
        e2Var.b.setImageDrawable(arVar);
        e2Var.c = false;
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.u6 u6Var = this.c.f;
        Context context = viewGroup.getContext();
        if (i10 == 0) {
            uk0 uk0Var = new uk0(context);
            RadioButton radioButton = new RadioButton(context);
            uk0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            org.telegram.ui.ActionBar.f7.P(radioButton, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.h7, u6Var);
            boolean z10 = LocaleController.isRTL;
            uk0Var.addView(radioButton, org.telegram.ui.Components.kb1.h(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
            org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 24, u6Var);
            uk0Var.c = aqVar;
            int i11 = org.telegram.ui.ActionBar.y6.d6;
            aqVar.b(-1, i11, org.telegram.ui.ActionBar.y6.k7);
            aqVar.setDrawUnchecked(false);
            aqVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            uk0Var.addView(aqVar, org.telegram.ui.Components.kb1.h(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
            aqVar.a(true, false);
            TextView textView = new TextView(context);
            uk0Var.a = textView;
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
            org.telegram.messenger.wh.r(textView, 1, 16.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z12 = LocaleController.isRTL;
            uk0Var.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
            org.telegram.ui.ActionBar.f7.i(i11, uk0Var, u6Var);
            view = uk0Var;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, 70, u6Var);
            e2Var.d = 61;
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, e2Var, u6Var);
            view = e2Var;
        } else if (i10 != 3) {
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context, u6Var);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, u6Var);
            view = q4Var;
        } else {
            view = new org.telegram.ui.Cells.f7(context, (d3) null);
        }
        return ic.a.n(view, view, -1, -2);
    }
}
